package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.format.DateUtils;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import defpackage.AP1;
import defpackage.C0603An;
import defpackage.C1198Id0;
import defpackage.C2745aa1;
import defpackage.C4786k00;
import defpackage.C6170qb;
import defpackage.C6392re0;
import defpackage.C6651sr1;
import defpackage.C6795ta;
import defpackage.C7005ua;
import defpackage.C7022ue0;
import defpackage.EnumC1824Qd0;
import defpackage.InterfaceC1612Nk1;
import defpackage.InterfaceC8073ze0;
import defpackage.RI;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, InterfaceC8073ze0> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final C4786k00 cache;
    private final Executor executor;
    private C7022ue0 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC1612Nk1<C6651sr1> firebaseRemoteConfigProvider;
    private static final C6170qb logger = C6170qb.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(C4786k00.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        AP1 ap1 = (AP1) C1198Id0.c().b(AP1.class);
        return ap1 != null ? ap1.b() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private InterfaceC8073ze0 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        InterfaceC8073ze0 interfaceC8073ze0 = this.allRcConfigMap.get(str);
        if (interfaceC8073ze0.i() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", interfaceC8073ze0.c(), str);
        return interfaceC8073ze0;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        C7022ue0 c7022ue0 = this.firebaseRemoteConfig;
        final a aVar = c7022ue0.e;
        b bVar = aVar.h;
        final long j = bVar.a.getLong("minimum_fetch_interval_in_seconds", a.j);
        aVar.f.b().continueWithTask(aVar.c, new Continuation() { // from class: qI
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task taskContinueWithTask;
                boolean zBefore;
                final a aVar2 = aVar;
                final Date date = new Date(aVar2.d.currentTimeMillis());
                boolean zIsSuccessful = task.isSuccessful();
                b bVar2 = aVar2.h;
                if (zIsSuccessful) {
                    Date date2 = new Date(bVar2.a.getLong("last_fetch_time_in_millis", -1L));
                    if (date2.equals(b.d)) {
                        zBefore = false;
                    } else {
                        zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()));
                    }
                    if (zBefore) {
                        return Tasks.forResult(new a.C0317a(2, null, null));
                    }
                }
                Date date3 = bVar2.a().b;
                Date date4 = date.before(date3) ? date3 : null;
                Executor executor = aVar2.c;
                if (date4 != null) {
                    String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
                    date4.getTime();
                    taskContinueWithTask = Tasks.forException(new C7653xe0(str));
                } else {
                    InterfaceC2400Xd0 interfaceC2400Xd0 = aVar2.a;
                    final Task<String> id = interfaceC2400Xd0.getId();
                    final Task token = interfaceC2400Xd0.getToken();
                    taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(executor, new Continuation() { // from class: rI
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task2) {
                            Date date5 = date;
                            a aVar3 = aVar2;
                            Task task3 = id;
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new C7232ve0("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                            }
                            Task task4 = token;
                            if (!task4.isSuccessful()) {
                                return Tasks.forException(new C7232ve0("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                            }
                            try {
                                a.C0317a c0317aA = aVar3.a((String) task3.getResult(), ((RA0) task4.getResult()).a(), date5);
                                if (c0317aA.a != 0) {
                                    return Tasks.forResult(c0317aA);
                                }
                                C5059lI c5059lI = aVar3.f;
                                C5272mI c5272mI = c0317aA.b;
                                c5059lI.getClass();
                                CallableC4639jI callableC4639jI = new CallableC4639jI(c5059lI, c5272mI);
                                Executor executor2 = c5059lI.a;
                                return Tasks.call(executor2, callableC4639jI).onSuccessTask(executor2, new C4849kI(c5059lI, c5272mI)).onSuccessTask(aVar3.c, new C6741tI(c0317aA));
                            } catch (C7443we0 e) {
                                return Tasks.forException(e);
                            }
                        }
                    });
                }
                return taskContinueWithTask.continueWithTask(executor, new Continuation() { // from class: sI
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        a aVar3 = aVar2;
                        Date date5 = date;
                        aVar3.getClass();
                        if (task2.isSuccessful()) {
                            b bVar3 = aVar3.h;
                            synchronized (bVar3.b) {
                                bVar3.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date5.getTime()).apply();
                            }
                            return task2;
                        }
                        Exception exception = task2.getException();
                        if (exception == null) {
                            return task2;
                        }
                        if (exception instanceof C7653xe0) {
                            b bVar4 = aVar3.h;
                            synchronized (bVar4.b) {
                                bVar4.a.edit().putInt("last_fetch_status", 2).apply();
                            }
                            return task2;
                        }
                        b bVar5 = aVar3.h;
                        synchronized (bVar5.b) {
                            bVar5.a.edit().putInt("last_fetch_status", 1).apply();
                        }
                        return task2;
                    }
                });
            }
        }).onSuccessTask(EnumC1824Qd0.d, new C0603An()).onSuccessTask(c7022ue0.b, new C6392re0(c7022ue0)).addOnSuccessListener(this.executor, new C6795ta(this)).addOnFailureListener(this.executor, new C7005ua(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public C2745aa1<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a();
            return new C2745aa1<>();
        }
        InterfaceC8073ze0 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C2745aa1<>(Boolean.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new C2745aa1<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C2745aa1<Float> getFloat(String str) {
        if (str == null) {
            logger.a();
            return new C2745aa1<>();
        }
        InterfaceC8073ze0 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C2745aa1<>(Float.valueOf(Double.valueOf(remoteConfigValue.b()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new C2745aa1<>();
    }

    public C2745aa1<Long> getLong(String str) {
        if (str == null) {
            logger.a();
            return new C2745aa1<>();
        }
        InterfaceC8073ze0 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C2745aa1<>(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new C2745aa1<>();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        InterfaceC8073ze0 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.d());
                }
                if (t instanceof Float) {
                    return (T) Float.valueOf(Double.valueOf(remoteConfigValue.b()).floatValue());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) remoteConfigValue.c();
                    }
                    T t2 = (T) remoteConfigValue.c();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        if (!remoteConfigValue.c().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.a());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public C2745aa1<String> getString(String str) {
        if (str == null) {
            logger.a();
            return new C2745aa1<>();
        }
        InterfaceC8073ze0 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new C2745aa1<>(remoteConfigValue.c()) : new C2745aa1<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC1612Nk1<C6651sr1> interfaceC1612Nk1;
        C6651sr1 c6651sr1;
        if (this.firebaseRemoteConfig == null && (interfaceC1612Nk1 = this.firebaseRemoteConfigProvider) != null && (c6651sr1 = interfaceC1612Nk1.get()) != null) {
            this.firebaseRemoteConfig = c6651sr1.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        int i;
        C7022ue0 c7022ue0 = this.firebaseRemoteConfig;
        if (c7022ue0 != null) {
            b bVar = c7022ue0.g;
            synchronized (bVar.b) {
                try {
                    bVar.a.getLong("last_fetch_time_in_millis", -1L);
                    i = bVar.a.getInt("last_fetch_status", 0);
                    long j = a.j;
                    long j2 = bVar.a.getLong("fetch_timeout_in_seconds", 60L);
                    if (j2 < FETCH_NEVER_HAPPENED_TIMESTAMP_MS) {
                        throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
                    }
                    long j3 = bVar.a.getLong("minimum_fetch_interval_in_seconds", j);
                    if (j3 < FETCH_NEVER_HAPPENED_TIMESTAMP_MS) {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j3 + " is an invalid argument");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i != 1) {
                return false;
            }
        }
        return true;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC1612Nk1<C6651sr1> interfaceC1612Nk1) {
        this.firebaseRemoteConfigProvider = interfaceC1612Nk1;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, InterfaceC8073ze0> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        RI riW = RI.w();
        ConcurrentHashMap<String, InterfaceC8073ze0> concurrentHashMap = this.allRcConfigMap;
        riW.getClass();
        InterfaceC8073ze0 interfaceC8073ze0 = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (interfaceC8073ze0 == null) {
            logger.a();
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", interfaceC8073ze0.d());
        } catch (Exception unused) {
            logger.a();
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(C4786k00 c4786k00, Executor executor, C7022ue0 c7022ue0, long j, long j2) {
        ConcurrentHashMap<String, InterfaceC8073ze0> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = c4786k00;
        this.executor = executor;
        this.firebaseRemoteConfig = c7022ue0;
        if (c7022ue0 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(c7022ue0.a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
