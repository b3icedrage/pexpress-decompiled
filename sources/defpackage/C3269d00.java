package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3269d00 extends AbstractC6681t1 implements QZ {

    @NotNull
    public final C4476ik1 n;

    @NotNull
    public final InterfaceC5848p21 o;

    @NotNull
    public final C2656a72 p;

    @NotNull
    public final C5761od2 q;

    @Nullable
    public final BI0 r;
    public AbstractC5706oM1 s;
    public AbstractC5706oM1 t;
    public List<? extends H62> u;
    public AbstractC5706oM1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3269d00(@NotNull C2720aS0 storageManager, @NotNull InterfaceC4675jU containingDeclaration, @NotNull InterfaceC2396Xc annotations, @NotNull C5638o21 name, @NotNull QW visibility, @NotNull C4476ik1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @Nullable BI0 bi0) {
        super(storageManager, containingDeclaration, annotations, name, visibility);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        VN1.a NO_SOURCE = VN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        this.n = proto;
        this.o = nameResolver;
        this.p = typeTable;
        this.q = versionRequirementTable;
        this.r = bi0;
    }

    @Override // defpackage.QZ
    public final HZ0 J() {
        return this.n;
    }

    @Override // defpackage.AbstractC6681t1
    @NotNull
    public final List<H62> U0() {
        List list = this.u;
        if (list != null) {
            return list;
        }
        Intrinsics.l("typeConstructorParameters");
        throw null;
    }

    public final void V0(@NotNull List<? extends H62> declaredTypeParameters, @NotNull AbstractC5706oM1 underlyingType, @NotNull AbstractC5706oM1 expandedType) {
        QY0 qy0L0;
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expandedType, "expandedType");
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.k = declaredTypeParameters;
        this.s = underlyingType;
        this.t = expandedType;
        this.u = C3476e.f(this);
        FC fcX = x();
        if (fcX == null || (qy0L0 = fcX.L0()) == null) {
            qy0L0 = QY0.b.b;
        }
        C6261r1 c6261r1 = new C6261r1(this, 0);
        O70 o70 = C3089c72.a;
        AbstractC5706oM1 abstractC5706oM1C = R70.f(this) ? R70.c(Q70.UNABLE_TO_SUBSTITUTE_TYPE, toString()) : C3089c72.m(p(), qy0L0, c6261r1);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1C, "makeUnsubstitutedType(...)");
        this.v = abstractC5706oM1C;
    }

    @Override // defpackage.QZ
    @NotNull
    public final C2656a72 Z() {
        return this.p;
    }

    @Override // defpackage.IU1
    public final InterfaceC5095lU b(X62 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.a.f()) {
            return this;
        }
        InterfaceC4675jU interfaceC4675jUE = e();
        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
        InterfaceC2396Xc interfaceC2396XcK = k();
        Intrinsics.checkNotNullExpressionValue(interfaceC2396XcK, "<get-annotations>(...)");
        C5638o21 name = getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C3269d00 c3269d00 = new C3269d00(this.i, interfaceC4675jUE, interfaceC2396XcK, name, this.j, this.n, this.o, this.p, this.q, this.r);
        List<H62> listA = A();
        AbstractC5706oM1 abstractC5706oM1N0 = n0();
        EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
        AbstractC4649jL0 abstractC4649jL0H = substitutor.h(abstractC5706oM1N0, enumC3610ed2);
        Intrinsics.checkNotNullExpressionValue(abstractC4649jL0H, "safeSubstitute(...)");
        AbstractC5706oM1 abstractC5706oM1A = V62.a(abstractC4649jL0H);
        AbstractC4649jL0 abstractC4649jL0H2 = substitutor.h(b0(), enumC3610ed2);
        Intrinsics.checkNotNullExpressionValue(abstractC4649jL0H2, "safeSubstitute(...)");
        c3269d00.V0(listA, abstractC5706oM1A, V62.a(abstractC4649jL0H2));
        return c3269d00;
    }

    @Override // defpackage.InterfaceC3714f62
    @NotNull
    public final AbstractC5706oM1 b0() {
        AbstractC5706oM1 abstractC5706oM1 = this.t;
        if (abstractC5706oM1 != null) {
            return abstractC5706oM1;
        }
        Intrinsics.l("expandedType");
        throw null;
    }

    @Override // defpackage.QZ
    @NotNull
    public final InterfaceC5848p21 i0() {
        return this.o;
    }

    @Override // defpackage.QZ
    @Nullable
    public final MZ k0() {
        return this.r;
    }

    @Override // defpackage.InterfaceC3714f62
    @NotNull
    public final AbstractC5706oM1 n0() {
        AbstractC5706oM1 abstractC5706oM1 = this.s;
        if (abstractC5706oM1 != null) {
            return abstractC5706oM1;
        }
        Intrinsics.l("underlyingType");
        throw null;
    }

    @Override // defpackage.InterfaceC3714f62
    @Nullable
    public final FC x() {
        if (C3686f.n(b0())) {
            return null;
        }
        InterfaceC5044lD interfaceC5044lDC = b0().V0().c();
        if (interfaceC5044lDC instanceof FC) {
            return (FC) interfaceC5044lDC;
        }
        return null;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final AbstractC5706oM1 y() {
        AbstractC5706oM1 abstractC5706oM1 = this.v;
        if (abstractC5706oM1 != null) {
            return abstractC5706oM1;
        }
        Intrinsics.l("defaultTypeImpl");
        throw null;
    }
}
