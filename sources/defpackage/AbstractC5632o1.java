package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5632o1 extends AbstractC5706oM1 {
    public final boolean e;

    public AbstractC5632o1(boolean z) {
        Intrinsics.checkNotNullParameter(null, "originalTypeVariable");
        this.e = z;
        K70 k70 = K70.CAPTURED_TYPE_SCOPE;
        throw null;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return C5653o60.d;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final C5655o62 U0() {
        C5655o62.e.getClass();
        return C5655o62.g;
    }

    @Override // defpackage.AbstractC4649jL0
    public final boolean W0() {
        return this.e;
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.P92
    public final P92 a1(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.AbstractC5706oM1, defpackage.P92
    public final P92 b1(C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        return z == this.e ? this : e1(z);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @NotNull
    public abstract XT1 e1(boolean z);

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public QY0 v() {
        return null;
    }
}
