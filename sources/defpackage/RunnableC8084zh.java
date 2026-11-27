package defpackage;

import androidx.fragment.app.s;
import io.sentry.ILogger;
import io.sentry.android.replay.util.h;
import io.sentry.android.replay.util.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8084zh implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC8084zh(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Runnable runnable = (Runnable) this.g;
                C0585Ah.a aVar = (C0585Ah.a) this.e;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                s this$0 = (s) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                s.a operation = (s.a) this.g;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.b.remove(operation);
                this$0.c.remove(operation);
                return;
            default:
                Runnable runnable2 = (Runnable) this.g;
                try {
                    runnable2.run();
                    return;
                } catch (Throwable th) {
                    ILogger logger = ((h) this.e).e.getLogger();
                    NG1 ng1 = NG1.ERROR;
                    StringBuilder sb = new StringBuilder("Failed to execute task ");
                    sb.append(runnable2 instanceof i ? ((i) runnable2).d : "");
                    logger.d(ng1, sb.toString(), th);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC8084zh(Runnable runnable, h hVar) {
        this.d = 2;
        this.g = runnable;
        this.e = hVar;
    }
}
