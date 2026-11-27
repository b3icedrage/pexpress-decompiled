package androidx.lifecycle;

import defpackage.FP0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/k;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements k {
    public final /* synthetic */ g d;
    public final /* synthetic */ androidx.savedstate.a e;

    public LegacySavedStateHandleController$tryToAddRecreator$1(g gVar, androidx.savedstate.a aVar) {
        this.d = gVar;
        this.e = aVar;
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == g.a.ON_START) {
            this.d.c(this);
            this.e.d();
        }
    }
}
