package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: We0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2299We0 extends P92 implements InterfaceC2559Ze0 {

    @NotNull
    public final AbstractC5706oM1 e;

    @NotNull
    public final AbstractC5706oM1 g;

    public AbstractC2299We0(@NotNull AbstractC5706oM1 lowerBound, @NotNull AbstractC5706oM1 upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.e = lowerBound;
        this.g = upperBound;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return c1().T0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public C5655o62 U0() {
        return c1().U0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final InterfaceC6494s62 V0() {
        return c1().V0();
    }

    @Override // defpackage.AbstractC4649jL0
    public boolean W0() {
        return c1().W0();
    }

    @NotNull
    public abstract AbstractC5706oM1 c1();

    @NotNull
    public abstract String d1(@NotNull C2964bZ c2964bZ, @NotNull C2964bZ c2964bZ2);

    @NotNull
    public String toString() {
        return XY.c.Z(this);
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public QY0 v() {
        return c1().v();
    }
}
