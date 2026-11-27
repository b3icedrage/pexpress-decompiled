package androidx.lifecycle;

import defpackage.CP0;
import defpackage.ED;
import defpackage.FP0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "LCP0;", "Landroidx/lifecycle/k;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends CP0 implements k {

    @NotNull
    public final g d;

    @NotNull
    public final CoroutineContext e;

    public LifecycleCoroutineScopeImpl(@NotNull g lifecycle, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.d = lifecycle;
        this.e = coroutineContext;
        if (lifecycle.b() == g.b.d) {
            ED.d(coroutineContext, null);
        }
    }

    @Override // defpackage.CP0
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getD() {
        return this.d;
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        g gVar = this.d;
        if (gVar.b().compareTo(g.b.d) <= 0) {
            gVar.c(this);
            ED.d(this.e, null);
        }
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CoroutineContext getE() {
        return this.e;
    }
}
