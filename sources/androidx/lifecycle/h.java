package androidx.lifecycle;

import androidx.lifecycle.g;
import androidx.lifecycle.h;
import defpackage.C4794k20;
import defpackage.C7814yP0;
import defpackage.XF0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    @NotNull
    public final g a;

    @NotNull
    public final g.b b;

    @NotNull
    public final C4794k20 c;

    @NotNull
    public final C7814yP0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [EP0, yP0] */
    public h(@NotNull g lifecycle, @NotNull g.b minState, @NotNull C4794k20 dispatchQueue, @NotNull final XF0 parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.a = lifecycle;
        this.b = minState;
        this.c = dispatchQueue;
        ?? r3 = new k() { // from class: yP0
            @Override // androidx.lifecycle.k
            public final void b(FP0 source, g.a aVar) {
                h this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                XF0 parentJob2 = parentJob;
                Intrinsics.checkNotNullParameter(parentJob2, "$parentJob");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
                if (source.getLifecycle().b() == g.b.d) {
                    parentJob2.l(null);
                    this$0.a();
                    return;
                }
                int iCompareTo = source.getLifecycle().b().compareTo(this$0.b);
                C4794k20 c4794k20 = this$0.c;
                if (iCompareTo < 0) {
                    c4794k20.a = true;
                } else if (c4794k20.a) {
                    if (c4794k20.b) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher");
                    }
                    c4794k20.a = false;
                    c4794k20.a();
                }
            }
        };
        this.d = r3;
        if (lifecycle.b() != g.b.d) {
            lifecycle.a(r3);
        } else {
            parentJob.l(null);
            a();
        }
    }

    public final void a() {
        this.a.c(this.d);
        C4794k20 c4794k20 = this.c;
        c4794k20.b = true;
        c4794k20.a();
    }
}
