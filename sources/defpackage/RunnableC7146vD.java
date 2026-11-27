package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import com.appsflyer.internal.AFa1tSDK;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7146vD implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC7146vD(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((C7567xD) this.e).t(true);
                return;
            case 1:
                ComponentActivity.e this$0 = (ComponentActivity.e) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Runnable runnable = this$0.e;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    this$0.e = null;
                    return;
                }
                return;
            case 2:
                KW kw = (KW) this.e;
                if (kw.k != 0) {
                    AS0 as0C = AS0.c();
                    Objects.toString(kw.g);
                    as0C.getClass();
                    return;
                }
                kw.k = 1;
                AS0 as0C2 = AS0.c();
                Objects.toString(kw.g);
                as0C2.getClass();
                if (!kw.h.h.h(kw.p, null)) {
                    kw.c();
                    return;
                }
                Vk2 vk2 = kw.h.g;
                C3429dk2 c3429dk2 = kw.g;
                synchronized (vk2.d) {
                    AS0 as0C3 = AS0.c();
                    Objects.toString(c3429dk2);
                    as0C3.getClass();
                    vk2.a(c3429dk2);
                    Vk2.b bVar = new Vk2.b(vk2, c3429dk2);
                    vk2.b.put(c3429dk2, bVar);
                    vk2.c.put(c3429dk2, kw);
                    ((Handler) vk2.a.d).postDelayed(bVar, 600000L);
                    break;
                }
                return;
            case 3:
                ((AFa1tSDK) this.e).AFLogger();
                return;
            default:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.e;
                anrProfilingIntegration.getClass();
                anrProfilingIntegration.i = SystemClock.uptimeMillis();
                return;
        }
    }
}
