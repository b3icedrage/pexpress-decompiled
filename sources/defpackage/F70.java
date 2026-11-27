package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class F70 implements InterfaceC0671Bj1 {
    public final /* synthetic */ C0749Cj1 d;

    public F70() {
        R70 r70 = R70.a;
        C7757y70 c7757y70 = R70.c;
        C01 c01 = C01.h;
        C5323mZ.h hVar = C5323mZ.e;
        A70[] a70Arr = A70.d;
        C0749Cj1 c0749Cj1W0 = C0749Cj1.W0(c7757y70, c01, hVar, true, C5638o21.m("<Error property>"), InterfaceC1490Lx.a.d, VN1.a);
        O70 o70 = R70.e;
        C5653o60 c5653o60 = C5653o60.d;
        c0749Cj1W0.a1(o70, c5653o60, null, null, c5653o60);
        this.d = c0749Cj1W0;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @NotNull
    public final ArrayList B() {
        ArrayList arrayListB = this.d.B();
        Intrinsics.checkNotNullExpressionValue(arrayListB, "getAccessors(...)");
        return arrayListB;
    }

    @Override // defpackage.InterfaceC1490Lx
    @NotNull
    public final InterfaceC1490Lx C(FC fc, C01 c01, QW qw) {
        C0749Cj1 c0749Cj1C = this.d.C(fc, c01, qw);
        Intrinsics.checkNotNullExpressionValue(c0749Cj1C, "copy(...)");
        return c0749Cj1C;
    }

    @Override // defpackage.GY0
    public final boolean D() {
        return this.d.D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1490Lx
    public final void D0(@NotNull Collection<? extends InterfaceC1490Lx> overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
        this.d.o = overriddenDescriptors;
    }

    @Override // defpackage.InterfaceC2982bd2
    public final boolean F() {
        return this.d.s;
    }

    @Override // defpackage.InterfaceC1335Jx
    public final boolean L() {
        this.d.getClass();
        return false;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        this.d.getClass();
        return false;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return this.d.t;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final <V> V T(InterfaceC1335Jx.a<V> aVar) {
        throw null;
    }

    @Override // defpackage.InterfaceC0671Bj1
    public final boolean U() {
        return this.d.v;
    }

    @Override // defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC0671Bj1 U0() {
        InterfaceC0671Bj1 interfaceC0671Bj1U0 = this.d.U0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0671Bj1U0, "getOriginal(...)");
        return interfaceC0671Bj1U0;
    }

    @Override // defpackage.IU1
    public final InterfaceC0671Bj1 b(@NotNull X62 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this.d.b(substitutor);
    }

    @Override // defpackage.InterfaceC5938pU, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        AbstractC5533nZ abstractC5533nZD = this.d.d();
        Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, "getVisibility(...)");
        return abstractC5533nZD;
    }

    @Override // defpackage.InterfaceC2982bd2
    @Nullable
    public final CK<?> d0() {
        return this.d.d0();
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        InterfaceC4675jU interfaceC4675jUE = this.d.e();
        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
        return interfaceC4675jUE;
    }

    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        C0749Cj1 c0749Cj1 = this.d;
        c0749Cj1.getClass();
        return (R) interfaceC5518nU.c(c0749Cj1, d);
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final C0983Fj1 f() {
        return this.d.A;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final InterfaceC1609Nj1 g() {
        return this.d.B;
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final C5638o21 getName() {
        C5638o21 name = this.d.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // defpackage.Sc2
    @NotNull
    public final AbstractC4649jL0 getType() {
        AbstractC4649jL0 type = this.d.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @Override // defpackage.InterfaceC1490Lx
    @NotNull
    public final InterfaceC1490Lx.a h() {
        InterfaceC1490Lx.a aVarH = this.d.h();
        Intrinsics.checkNotNullExpressionValue(aVarH, "getKind(...)");
        return aVarH;
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        VN1 vn1I = this.d.i();
        Intrinsics.checkNotNullExpressionValue(vn1I, "getSource(...)");
        return vn1I;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<Xc2> j() {
        this.d.j();
        List<Xc2> list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameters(...)");
        return list;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        InterfaceC2396Xc interfaceC2396XcK = this.d.k();
        Intrinsics.checkNotNullExpressionValue(interfaceC2396XcK, "<get-annotations>(...)");
        return interfaceC2396XcK;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 m0() {
        return this.d.x;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final AbstractC4649jL0 n() {
        return this.d.n();
    }

    @Override // defpackage.InterfaceC2982bd2
    public final boolean p0() {
        return this.d.j;
    }

    @Override // defpackage.GY0
    @NotNull
    public final C01 q() {
        C01 c01Q = this.d.q();
        Intrinsics.checkNotNullExpressionValue(c01Q, "getModality(...)");
        return c01Q;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 r0() {
        return this.d.y;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final C6384rc0 s0() {
        return this.d.D;
    }

    @Override // defpackage.InterfaceC1490Lx, defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<? extends InterfaceC0671Bj1> u() {
        Collection<? extends InterfaceC0671Bj1> collectionU = this.d.u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        return collectionU;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final C6384rc0 v0() {
        return this.d.C;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<H62> w() {
        List<H62> listW = this.d.w();
        Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
        return listW;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<InterfaceC1076Go1> w0() {
        List<InterfaceC1076Go1> listW0 = this.d.w0();
        Intrinsics.checkNotNullExpressionValue(listW0, "getContextReceiverParameters(...)");
        return listW0;
    }

    @Override // defpackage.InterfaceC2982bd2
    public final boolean x0() {
        return this.d.r;
    }
}
