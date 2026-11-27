package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3504e62 extends AbstractC2314Wj0 implements InterfaceC3085c62 {

    @NotNull
    public static final a M;
    public static final /* synthetic */ IJ0<Object>[] N;

    @NotNull
    public final OQ1 I;

    @NotNull
    public final InterfaceC3714f62 J;

    @NotNull
    public final InterfaceC5868p71 K;

    @NotNull
    public InterfaceC7984zC L;

    /* JADX INFO: renamed from: e62$a */
    public static final class a {
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        N = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C3504e62.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
        M = new a();
    }

    public C3504e62(OQ1 oq1, InterfaceC3714f62 interfaceC3714f62, InterfaceC7984zC interfaceC7984zC, InterfaceC3085c62 interfaceC3085c62, InterfaceC2396Xc interfaceC2396Xc, InterfaceC1490Lx.a aVar, VN1 vn1) {
        super(interfaceC2396Xc, aVar, interfaceC3714f62, interfaceC3085c62, C6761tO1.e, vn1);
        this.I = oq1;
        this.J = interfaceC3714f62;
        this.w = interfaceC3714f62.M0();
        this.K = oq1.b(new C3295d62(this, interfaceC7984zC));
        this.L = interfaceC7984zC;
    }

    @Override // defpackage.InterfaceC3550eL
    public final boolean G() {
        return this.L.G();
    }

    @Override // defpackage.InterfaceC3550eL
    @NotNull
    public final FC H() {
        FC fcH = this.L.H();
        Intrinsics.checkNotNullExpressionValue(fcH, "getConstructedClass(...)");
        return fcH;
    }

    @Override // defpackage.AbstractC2314Wj0
    public final AbstractC2314Wj0 V0(InterfaceC2396Xc annotations, InterfaceC1490Lx.a kind, InterfaceC4675jU newOwner, InterfaceC2076Tj0 interfaceC2076Tj0, C5638o21 c5638o21, VN1 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        InterfaceC1490Lx.a aVar = InterfaceC1490Lx.a.d;
        if (kind != aVar) {
            InterfaceC1490Lx.a aVar2 = InterfaceC1490Lx.a.h;
        }
        return new C3504e62(this.I, this.J, this.L, this, annotations, aVar, source);
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0, defpackage.IU1
    public final /* bridge */ /* synthetic */ InterfaceC3550eL b(X62 x62) {
        throw null;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.InterfaceC4675jU
    public final InterfaceC5257mD e() {
        return this.J;
    }

    @Override // defpackage.AbstractC2314Wj0
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3085c62 C(@NotNull FC newOwner, @NotNull C01 modality, @NotNull QW visibility) {
        InterfaceC1490Lx.a kind = InterfaceC1490Lx.a.e;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        AbstractC2314Wj0.a aVarZ0 = Z0(X62.b);
        aVarZ0.d(newOwner);
        aVarZ0.c = modality;
        aVarZ0.c(visibility);
        aVarZ0.f = kind;
        aVarZ0.m = false;
        InterfaceC0726Cc interfaceC0726CcW0 = aVarZ0.x.W0(aVarZ0);
        Intrinsics.c(interfaceC0726CcW0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC3085c62) interfaceC0726CcW0;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3085c62 U0() {
        InterfaceC2076Tj0 interfaceC2076Tj0U0 = super.U0();
        Intrinsics.c(interfaceC2076Tj0U0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC3085c62) interfaceC2076Tj0U0;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.IU1
    @Nullable
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final C3504e62 b(@NotNull X62 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        InterfaceC2076Tj0 interfaceC2076Tj0B = super.b(substitutor);
        Intrinsics.c(interfaceC2076Tj0B, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C3504e62 c3504e62 = (C3504e62) interfaceC2076Tj0B;
        AbstractC4649jL0 abstractC4649jL0 = c3504e62.k;
        Intrinsics.checkNotNull(abstractC4649jL0);
        X62 x62D = X62.d(abstractC4649jL0);
        Intrinsics.checkNotNullExpressionValue(x62D, "create(...)");
        InterfaceC7984zC interfaceC7984zCB = this.L.U0().b(x62D);
        if (interfaceC7984zCB == null) {
            return null;
        }
        c3504e62.L = interfaceC7984zCB;
        return c3504e62;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC1335Jx
    @NotNull
    public final AbstractC4649jL0 n() {
        AbstractC4649jL0 abstractC4649jL0 = this.k;
        Intrinsics.checkNotNull(abstractC4649jL0);
        return abstractC4649jL0;
    }

    @Override // defpackage.InterfaceC3085c62
    @NotNull
    public final InterfaceC7984zC u0() {
        return this.L;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.InterfaceC4675jU
    public final InterfaceC4675jU e() {
        return this.J;
    }
}
