package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.AbstractC2775ai;
import defpackage.C2567Zh;
import defpackage.C2745aa1;
import defpackage.C3125cJ;
import defpackage.C5760od1;
import defpackage.C8002zI;
import defpackage.EI1;
import defpackage.EnumC1134Hi;
import defpackage.RunnableC3167cX;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class SessionManager extends AbstractC2775ai {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C2567Zh appStateMonitor;
    private final Set<WeakReference<EI1>> clients;
    private final GaugeManager gaugeManager;
    private C5760od1 perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), C5760od1.c(), C2567Zh.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, C5760od1 c5760od1) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (c5760od1.g) {
            this.gaugeManager.logGaugeMetadata(c5760od1.d, EnumC1134Hi.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC1134Hi enumC1134Hi) {
        C5760od1 c5760od1 = this.perfSession;
        if (c5760od1.g) {
            this.gaugeManager.logGaugeMetadata(c5760od1.d, enumC1134Hi);
        }
    }

    private void startOrStopCollectingGauges(EnumC1134Hi enumC1134Hi) {
        C5760od1 c5760od1 = this.perfSession;
        if (c5760od1.g) {
            this.gaugeManager.startCollectingGauges(c5760od1, enumC1134Hi);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        EnumC1134Hi enumC1134Hi = EnumC1134Hi.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC1134Hi);
        startOrStopCollectingGauges(enumC1134Hi);
    }

    @Override // defpackage.AbstractC2775ai, defpackage.C2567Zh.b
    public void onUpdateAppState(EnumC1134Hi enumC1134Hi) {
        super.onUpdateAppState(enumC1134Hi);
        if (this.appStateMonitor.u) {
            return;
        }
        if (enumC1134Hi == EnumC1134Hi.FOREGROUND) {
            updatePerfSession(enumC1134Hi);
        } else {
            if (updatePerfSessionIfExpired()) {
                return;
            }
            startOrStopCollectingGauges(enumC1134Hi);
        }
    }

    public final C5760od1 perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<EI1> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new RunnableC3167cX(this, context, this.perfSession, 1));
    }

    @VisibleForTesting
    public void setPerfSession(C5760od1 c5760od1) {
        this.perfSession = c5760od1;
    }

    public void unregisterForSessionUpdates(WeakReference<EI1> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(EnumC1134Hi enumC1134Hi) {
        synchronized (this.clients) {
            try {
                this.perfSession = C5760od1.c();
                Iterator<WeakReference<EI1>> it = this.clients.iterator();
                while (it.hasNext()) {
                    EI1 ei1 = it.next().get();
                    if (ei1 != null) {
                        ei1.a(this.perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(enumC1134Hi);
        startOrStopCollectingGauges(enumC1134Hi);
    }

    public boolean updatePerfSessionIfExpired() {
        C3125cJ c3125cJ;
        long jLongValue;
        C5760od1 c5760od1 = this.perfSession;
        c5760od1.getClass();
        long minutes = TimeUnit.MICROSECONDS.toMinutes(c5760od1.e.a());
        C8002zI c8002zIE = C8002zI.e();
        c8002zIE.getClass();
        synchronized (C3125cJ.class) {
            try {
                if (C3125cJ.e == null) {
                    C3125cJ.e = new C3125cJ();
                }
                c3125cJ = C3125cJ.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2745aa1<Long> c2745aa1J = c8002zIE.j(c3125cJ);
        if (!c2745aa1J.b() || c2745aa1J.a().longValue() <= 0) {
            C2745aa1<Long> c2745aa1 = c8002zIE.a.getLong("fpr_session_max_duration_min");
            if (!c2745aa1.b() || c2745aa1.a().longValue() <= 0) {
                C2745aa1<Long> c2745aa1C = c8002zIE.c(c3125cJ);
                jLongValue = (!c2745aa1C.b() || c2745aa1C.a().longValue() <= 0) ? 240L : c2745aa1C.a().longValue();
            } else {
                c8002zIE.c.e("com.google.firebase.perf.SessionsMaxDurationMinutes", c2745aa1.a().longValue());
                jLongValue = c2745aa1.a().longValue();
            }
        } else {
            jLongValue = c2745aa1J.a().longValue();
        }
        if (minutes <= jLongValue) {
            return false;
        }
        updatePerfSession(this.appStateMonitor.s);
        return true;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, C5760od1 c5760od1, C2567Zh c2567Zh) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = c5760od1;
        this.appStateMonitor = c2567Zh;
        registerForAppState();
    }
}
