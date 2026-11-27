package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4426iX extends AbstractC4216hX {

    @NotNull
    public final AbstractC5706oM1 e;

    public AbstractC4426iX(@NotNull AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        return z == W0() ? this : this.e.Z0(z).b1(U0());
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != U0() ? new C6335rM1(this, newAttributes) : this;
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    public final AbstractC5706oM1 e1() {
        return this.e;
    }
}
