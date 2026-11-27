package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.c;
import io.sentry.cache.m;
import io.sentry.protocol.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4584j20 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC4584j20(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C4794k20 this$0 = (C4794k20) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Runnable runnable = (Runnable) this.g;
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                if (!this$0.d.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                this$0.a();
                return;
            case 1:
                c cVar = (c) this.e;
                int i = cVar.p;
                View[] viewArr = (View[]) this.g;
                if (i != -1) {
                    for (View view : viewArr) {
                        view.setTag(cVar.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (cVar.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(cVar.q, null);
                    }
                    return;
                }
                return;
            default:
                ((m) this.e).f((u) this.g, "replay.json");
                return;
        }
    }
}
