package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E21 implements FU<Unit> {

    @NotNull
    public final MU a;

    @NotNull
    public final GU b;

    public E21(@NotNull MU deeplinkManagerCallbacks) {
        Intrinsics.checkNotNullParameter(deeplinkManagerCallbacks, "deeplinkManagerCallbacks");
        this.a = deeplinkManagerCallbacks;
        this.b = GU.NAVIGATE_TO_ASSET_SELECTION;
    }

    @Override // defpackage.FU
    public final Object a(Object obj, HU hu) {
        this.a.a();
        return Unit.a;
    }

    @Override // defpackage.FU
    @NotNull
    public final GU getKey() {
        return this.b;
    }
}
