package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RL1 extends AbstractC4579j1<InterfaceC1583Nc> {

    @Nullable
    public final InterfaceC5095lU a;
    public final boolean b;

    @NotNull
    public final LO0 c;

    @NotNull
    public final EnumC1976Sc d;
    public final boolean e;

    public RL1(@Nullable InterfaceC5095lU interfaceC5095lU, boolean z, @NotNull LO0 containerContext, @NotNull EnumC1976Sc containerApplicabilityType, boolean z2) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.a = interfaceC5095lU;
        this.b = z;
        this.c = containerContext;
        this.d = containerApplicabilityType;
        this.e = z2;
    }

    @NotNull
    public final C2054Tc e() {
        return this.c.a.q;
    }

    @Nullable
    public final C1836Qh0 f(@NotNull AbstractC5706oM1 abstractC5706oM1) {
        Intrinsics.checkNotNullParameter(abstractC5706oM1, "<this>");
        if (abstractC5706oM1 == null) {
            C3089c72.a(30);
            throw null;
        }
        O70 o70 = C3089c72.a;
        InterfaceC5044lD interfaceC5044lDC = abstractC5706oM1.V0().c();
        FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
        if (fc != null) {
            return C4432iZ.g(fc);
        }
        return null;
    }
}
