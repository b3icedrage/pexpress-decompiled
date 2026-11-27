package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3223cl2 extends AbstractC4649jL0 {
    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return Z0().T0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final C5655o62 U0() {
        return Z0().U0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final InterfaceC6494s62 V0() {
        return Z0().V0();
    }

    @Override // defpackage.AbstractC4649jL0
    public final boolean W0() {
        return Z0().W0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final P92 Y0() {
        AbstractC4649jL0 abstractC4649jL0Z0 = Z0();
        while (abstractC4649jL0Z0 instanceof AbstractC3223cl2) {
            abstractC4649jL0Z0 = ((AbstractC3223cl2) abstractC4649jL0Z0).Z0();
        }
        Intrinsics.c(abstractC4649jL0Z0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (P92) abstractC4649jL0Z0;
    }

    @NotNull
    public abstract AbstractC4649jL0 Z0();

    public boolean a1() {
        return true;
    }

    @NotNull
    public final String toString() {
        return a1() ? Z0().toString() : "<Not computed yet>";
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        return Z0().v();
    }
}
