package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3264cz implements H62 {

    @NotNull
    public final H62 d;

    @NotNull
    public final InterfaceC5257mD e;
    public final int g;

    public C3264cz(@NotNull H62 originalDescriptor, @NotNull InterfaceC5257mD declarationDescriptor, int i) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.d = originalDescriptor;
        this.e = declarationDescriptor;
        this.g = i;
    }

    @Override // defpackage.H62
    public final boolean K() {
        return this.d.K();
    }

    @Override // defpackage.H62
    @NotNull
    public final EnumC3610ed2 S() {
        EnumC3610ed2 enumC3610ed2S = this.d.S();
        Intrinsics.checkNotNullExpressionValue(enumC3610ed2S, "getVariance(...)");
        return enumC3610ed2S;
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        return this.e;
    }

    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) this.d.e0(interfaceC5518nU, d);
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final C5638o21 getName() {
        C5638o21 name = this.d.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // defpackage.H62
    @NotNull
    public final List<AbstractC4649jL0> getUpperBounds() {
        List<AbstractC4649jL0> upperBounds = this.d.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        VN1 vn1I = this.d.i();
        Intrinsics.checkNotNullExpressionValue(vn1I, "getSource(...)");
        return vn1I;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return this.d.k();
    }

    @Override // defpackage.H62
    public final int l() {
        return this.d.l() + this.g;
    }

    @Override // defpackage.H62
    @NotNull
    public final OQ1 o0() {
        OQ1 oq1O0 = this.d.o0();
        Intrinsics.checkNotNullExpressionValue(oq1O0, "getStorageManager(...)");
        return oq1O0;
    }

    @Override // defpackage.H62, defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        InterfaceC6494s62 interfaceC6494s62P = this.d.p();
        Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
        return interfaceC6494s62P;
    }

    @Override // defpackage.H62
    public final boolean t0() {
        return true;
    }

    @NotNull
    public final String toString() {
        return this.d + "[inner-copy]";
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final AbstractC5706oM1 y() {
        AbstractC5706oM1 abstractC5706oM1Y = this.d.y();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
        return abstractC5706oM1Y;
    }

    @Override // defpackage.InterfaceC5044lD, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final H62 U0() {
        H62 h62U0 = this.d.U0();
        Intrinsics.checkNotNullExpressionValue(h62U0, "getOriginal(...)");
        return h62U0;
    }
}
