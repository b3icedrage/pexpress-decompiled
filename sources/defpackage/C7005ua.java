package defpackage;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b0;
import io.sentry.util.l;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7005ua implements InterfaceC7203vW.a, OnFailureListener, l.a, KD1.a {
    public final /* synthetic */ Object d;

    public /* synthetic */ C7005ua(Object obj) {
        this.d = obj;
    }

    @Override // KD1.a
    public void a(C5364mj1 c5364mj1) {
        ((InterfaceC1015Fu0) this.d).w(new C5364mj1());
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return ((SentryAndroidOptions) this.d).getExecutorService();
    }

    @Override // defpackage.InterfaceC7203vW.a
    public void d(InterfaceC1612Nk1 interfaceC1612Nk1) {
        C7215va c7215va = (C7215va) this.d;
        c7215va.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        InterfaceC5746oa interfaceC5746oa = (InterfaceC5746oa) interfaceC1612Nk1.get();
        C5293mP c5293mP = new C5293mP(interfaceC5746oa);
        NO no = new NO();
        C7279vr c7279vrC = interfaceC5746oa.c("clx", no);
        if (c7279vrC == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            C7279vr c7279vrC2 = interfaceC5746oa.c(AppMeasurement.CRASH_ORIGIN, no);
            if (c7279vrC2 != null) {
                b0.f("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            c7279vrC = c7279vrC2;
        }
        if (c7279vrC == null) {
            b0.f("FirebaseCrashlytics", "Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        C0780Cu c0780Cu = new C0780Cu();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C3665et c3665et = new C3665et(c5293mP);
        synchronized (c7215va) {
            try {
                Iterator it = c7215va.c.iterator();
                while (it.hasNext()) {
                    c0780Cu.b((InterfaceC0858Du) it.next());
                }
                no.b = c0780Cu;
                no.a = c3665et;
                c7215va.b = c0780Cu;
                c7215va.a = c3665et;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((RemoteConfigManager) this.d).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
