package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class O21 implements FU<Unit> {

    @NotNull
    public final MU a;

    @NotNull
    public final GU b;

    public O21(@NotNull MU deeplinkManagerCallbacks) {
        Intrinsics.checkNotNullParameter(deeplinkManagerCallbacks, "deeplinkManagerCallbacks");
        this.a = deeplinkManagerCallbacks;
        this.b = GU.NAVIGATE_TO_RE_REGISTRATION;
    }

    @Override // defpackage.FU
    public final Object a(Object obj, HU hu) {
        this.a.d();
        return Unit.a;
    }

    @Override // defpackage.FU
    @NotNull
    public final GU getKey() {
        return this.b;
    }
}
