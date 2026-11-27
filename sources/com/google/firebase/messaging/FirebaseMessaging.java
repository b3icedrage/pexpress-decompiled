package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import defpackage.B02;
import defpackage.C1198Id0;
import defpackage.C1748Pe;
import defpackage.C2052Tb0;
import defpackage.C6741tI;
import defpackage.C6844tm0;
import defpackage.C7495ws1;
import defpackage.HW1;
import defpackage.InterfaceC1612Nk1;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC2556Zd0;
import defpackage.InterfaceC5169lo0;
import defpackage.InterfaceC5871p80;
import defpackage.InterfaceC6569sU1;
import defpackage.RunnableC2489Yh;
import defpackage.RunnableC2555Zd;
import defpackage.Ta2;
import defpackage.W42;
import defpackage.ZZ0;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long m = TimeUnit.HOURS.toSeconds(8);
    public static com.google.firebase.messaging.a n;

    @SuppressLint({"FirebaseUnknownNullness"})
    public static W42 o;
    public static ScheduledThreadPoolExecutor p;
    public final C1198Id0 a;
    public final InterfaceC2556Zd0 b;
    public final InterfaceC2400Xd0 c;
    public final Context d;
    public final C6844tm0 e;
    public final C7495ws1 f;
    public final a g;
    public final ScheduledThreadPoolExecutor h;
    public final ExecutorService i;
    public final ThreadPoolExecutor j;
    public final ZZ0 k;
    public boolean l;

    public class a {
        public final InterfaceC6569sU1 a;
        public boolean b;
        public Boolean c;

        public a(InterfaceC6569sU1 interfaceC6569sU1) {
            this.a = interfaceC6569sU1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [be0] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            Boolean boolB = b();
                            this.c = boolB;
                            if (boolB == null) {
                                this.a.a(new InterfaceC5871p80() { // from class: be0
                                    @Override // defpackage.InterfaceC5871p80
                                    public final void a(Y70 y70) {
                                        FirebaseMessaging.a aVar = this.a;
                                        if (aVar.a()) {
                                            a aVar2 = FirebaseMessaging.n;
                                            FirebaseMessaging.this.e();
                                        }
                                    }
                                });
                            }
                            this.b = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.h();
            } catch (Throwable th2) {
                throw th2;
            }
            Boolean bool = this.c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.h();
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            C1198Id0 c1198Id0 = FirebaseMessaging.this.a;
            c1198Id0.a();
            Context context = c1198Id0.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(C1198Id0 c1198Id0, InterfaceC2556Zd0 interfaceC2556Zd0, InterfaceC1612Nk1<Ta2> interfaceC1612Nk1, InterfaceC1612Nk1<InterfaceC5169lo0> interfaceC1612Nk2, InterfaceC2400Xd0 interfaceC2400Xd0, W42 w42, InterfaceC6569sU1 interfaceC6569sU1) {
        int i = 1;
        c1198Id0.a();
        Context context = c1198Id0.a;
        final ZZ0 zz0 = new ZZ0(context);
        final C6844tm0 c6844tm0 = new C6844tm0(c1198Id0, zz0, interfaceC1612Nk1, interfaceC1612Nk2, interfaceC2400Xd0);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.l = false;
        o = w42;
        this.a = c1198Id0;
        this.b = interfaceC2556Zd0;
        this.c = interfaceC2400Xd0;
        this.g = new a(interfaceC6569sU1);
        c1198Id0.a();
        final Context context2 = c1198Id0.a;
        this.d = context2;
        C2052Tb0 c2052Tb0 = new C2052Tb0();
        this.k = zz0;
        this.i = executorServiceNewSingleThreadExecutor;
        this.e = c6844tm0;
        this.f = new C7495ws1(executorServiceNewSingleThreadExecutor);
        this.h = scheduledThreadPoolExecutor;
        this.j = threadPoolExecutor;
        c1198Id0.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c2052Tb0);
        } else {
            b0.e("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC2556Zd0 != null) {
            interfaceC2556Zd0.b();
        }
        scheduledThreadPoolExecutor.execute(new RunnableC2555Zd(this, 3));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i2 = B02.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: A02
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7941z02 c7941z02;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                ZZ0 zz1 = zz0;
                C6844tm0 c6844tm1 = c6844tm0;
                synchronized (C7941z02.class) {
                    try {
                        WeakReference<C7941z02> weakReference = C7941z02.b;
                        c7941z02 = weakReference != null ? weakReference.get() : null;
                        if (c7941z02 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            C7941z02 c7941z03 = new C7941z02();
                            synchronized (c7941z03) {
                                c7941z03.a = AK1.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            C7941z02.b = new WeakReference<>(c7941z03);
                            c7941z02 = c7941z03;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new B02(firebaseMessaging, zz1, c7941z02, c6844tm1, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new C6741tI(this));
        scheduledThreadPoolExecutor.execute(new RunnableC2489Yh(this, i));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (p == null) {
                    p = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                p.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static synchronized com.google.firebase.messaging.a c(Context context) {
        try {
            if (n == null) {
                n = new com.google.firebase.messaging.a(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return n;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C1198Id0 c1198Id0) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c1198Id0.b(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskContinueWithTask;
        InterfaceC2556Zd0 interfaceC2556Zd0 = this.b;
        if (interfaceC2556Zd0 != null) {
            try {
                return (String) Tasks.await(interfaceC2556Zd0.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final com.google.firebase.messaging.a.C0316a c0316aD = d();
        if (!g(c0316aD)) {
            return c0316aD.a;
        }
        final String strB = ZZ0.b(this.a);
        C7495ws1 c7495ws1 = this.f;
        synchronized (c7495ws1) {
            taskContinueWithTask = (Task) c7495ws1.b.getOrDefault(strB, null);
            if (taskContinueWithTask != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                C6844tm0 c6844tm0 = this.e;
                taskContinueWithTask = c6844tm0.a(c6844tm0.c(ZZ0.b(c6844tm0.a), "*", new Bundle())).onSuccessTask(this.j, new SuccessContinuation() { // from class: ae0
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.d;
                        String str = strB;
                        a.C0316a c0316a = c0316aD;
                        String str2 = (String) obj;
                        a aVarC = FirebaseMessaging.c(firebaseMessaging.d);
                        C1198Id0 c1198Id0 = firebaseMessaging.a;
                        c1198Id0.a();
                        String strD = "[DEFAULT]".equals(c1198Id0.b) ? "" : c1198Id0.d();
                        String strA = firebaseMessaging.k.a();
                        synchronized (aVarC) {
                            String strA2 = a.C0316a.a(System.currentTimeMillis(), str2, strA);
                            if (strA2 != null) {
                                SharedPreferences.Editor editorEdit = aVarC.a.edit();
                                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                                editorEdit.commit();
                            }
                        }
                        if (c0316a == null || !str2.equals(c0316a.a)) {
                            C1198Id0 c1198Id1 = firebaseMessaging.a;
                            c1198Id1.a();
                            if ("[DEFAULT]".equals(c1198Id1.b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    c1198Id1.a();
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new C1974Sb0(firebaseMessaging.d).c(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(c7495ws1.a, new C1748Pe(c7495ws1, strB));
                c7495ws1.b.put(strB, taskContinueWithTask);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final com.google.firebase.messaging.a.C0316a d() {
        com.google.firebase.messaging.a.C0316a c0316aB;
        com.google.firebase.messaging.a aVarC = c(this.d);
        C1198Id0 c1198Id0 = this.a;
        c1198Id0.a();
        String strD = "[DEFAULT]".equals(c1198Id0.b) ? "" : c1198Id0.d();
        String strB = ZZ0.b(this.a);
        synchronized (aVarC) {
            c0316aB = com.google.firebase.messaging.a.C0316a.b(aVarC.a.getString(strD + "|T|" + strB + "|*", null));
        }
        return c0316aB;
    }

    public final void e() {
        InterfaceC2556Zd0 interfaceC2556Zd0 = this.b;
        if (interfaceC2556Zd0 != null) {
            interfaceC2556Zd0.getToken();
        } else if (g(d())) {
            synchronized (this) {
                if (!this.l) {
                    f(0L);
                }
            }
        }
    }

    public final synchronized void f(long j) {
        b(new HW1(this, Math.min(Math.max(30L, 2 * j), m)), j);
        this.l = true;
    }

    public final boolean g(com.google.firebase.messaging.a.C0316a c0316a) {
        if (c0316a != null) {
            return System.currentTimeMillis() > c0316a.c + com.google.firebase.messaging.a.C0316a.d || !this.k.a().equals(c0316a.b);
        }
        return true;
    }
}
