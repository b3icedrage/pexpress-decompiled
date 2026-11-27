package androidx.lifecycle;

import defpackage.FP0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/k;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeGeneratedAdaptersObserver implements k {

    @NotNull
    public final d[] d;

    public CompositeGeneratedAdaptersObserver(@NotNull d[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.d = generatedAdapters;
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new HashMap();
        d[] dVarArr = this.d;
        for (d dVar : dVarArr) {
            dVar.a();
        }
        for (d dVar2 : dVarArr) {
            dVar2.a();
        }
    }
}
