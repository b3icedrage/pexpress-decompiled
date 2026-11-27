package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4216hX extends AbstractC5706oM1 {
    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return e1().T0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public C5655o62 U0() {
        return e1().U0();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final InterfaceC6494s62 V0() {
        return e1().V0();
    }

    @Override // defpackage.AbstractC4649jL0
    public boolean W0() {
        return e1().W0();
    }

    @NotNull
    public abstract AbstractC5706oM1 e1();

    @Override // defpackage.P92
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC5706oM1 a1(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(e1());
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return g1((AbstractC5706oM1) abstractC4649jL0T);
    }

    @NotNull
    public abstract AbstractC4216hX g1(@NotNull AbstractC5706oM1 abstractC5706oM1);

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        return e1().v();
    }
}
