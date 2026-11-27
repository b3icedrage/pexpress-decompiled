package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.ndk.c;
import io.sentry.ndk.NativeScope;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WW implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ WW(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                try {
                    ((Runnable) this.e).run();
                } catch (Exception e) {
                    ((ScheduledFutureC4006gX.a) this.g).a(e);
                    return;
                }
                break;
            default:
                c cVar = (c) this.e;
                SentryAndroidOptions sentryAndroidOptions = cVar.a;
                C0702Bu c0702Bu = (C0702Bu) this.g;
                NG1 ng1 = c0702Bu.m;
                String strC = null;
                String lowerCase = ng1 != null ? ng1.name().toLowerCase(Locale.ROOT) : null;
                String strQ = N7.q(c0702Bu.e());
                try {
                    ConcurrentHashMap concurrentHashMap = c0702Bu.j;
                    if (!concurrentHashMap.isEmpty()) {
                        strC = sentryAndroidOptions.getSerializer().c(concurrentHashMap);
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().c(NG1.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str = strC;
                String str2 = c0702Bu.h;
                String str3 = c0702Bu.k;
                String str4 = c0702Bu.i;
                cVar.b.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str2, str3, str4, strQ, str);
                break;
        }
    }
}
