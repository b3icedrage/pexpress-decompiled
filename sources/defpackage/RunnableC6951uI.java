package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.util.BiConsumer;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.util.C4527a;
import io.sentry.util.j;
import io.sentry.util.p;

/* JADX INFO: renamed from: uI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6951uI implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC6951uI(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((BiConsumer) this.e).accept((String) this.g, (C5272mI) this.h);
                return;
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.e;
                SD1 sd1 = (SD1) this.g;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.h;
                C4527a.C0404a c0404aA = systemEventsBreadcrumbsIntegration.o.a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.j && !systemEventsBreadcrumbsIntegration.k && systemEventsBreadcrumbsIntegration.e == null) {
                        systemEventsBreadcrumbsIntegration.e = new SystemEventsBreadcrumbsIntegration.b(systemEventsBreadcrumbsIntegration, sd1, sentryAndroidOptions);
                        if (systemEventsBreadcrumbsIntegration.l == null) {
                            systemEventsBreadcrumbsIntegration.l = new IntentFilter();
                            for (String str : systemEventsBreadcrumbsIntegration.i) {
                                systemEventsBreadcrumbsIntegration.l.addAction(str);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.m == null) {
                            systemEventsBreadcrumbsIntegration.m = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.m.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.m.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.d;
                            SystemEventsBreadcrumbsIntegration.b bVar = systemEventsBreadcrumbsIntegration.e;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.l;
                            p.b(sentryAndroidOptions.getLogger(), "The ILogger object is required.");
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(bVar, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(bVar, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.n.getAndSet(true)) {
                                sentryAndroidOptions.getLogger().a(NG1.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                j.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th) {
                            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
                        }
                        break;
                    }
                    c0404aA.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        c0404aA.close();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
        }
    }
}
