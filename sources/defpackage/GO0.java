package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GO0 extends AbstractC2470Ya1 {
    public static final /* synthetic */ IJ0<Object>[] q;

    @NotNull
    public final FE0 k;

    @NotNull
    public final LO0 l;

    @NotNull
    public final I51 m;

    @NotNull
    public final CI0 n;

    @NotNull
    public final I51<List<C1758Ph0>> o;

    @NotNull
    public final InterfaceC2396Xc p;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        q = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(GO0.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(GO0.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GO0(@NotNull LO0 outerContext, @NotNull FE0 jPackage) {
        super(outerContext.a.o, jPackage.c());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.k = jPackage;
        LO0 lo0F = C2432Xo.f(outerContext, this, null, 6);
        this.l = lo0F;
        C5027l8.t(outerContext.a.d.c().c);
        KE0 ke0 = lo0F.a;
        C2720aS0 c2720aS0 = ke0.a;
        C7633xZ c7633xZ = new C7633xZ(this, 3);
        c2720aS0.getClass();
        this.m = new C2720aS0.h(c2720aS0, c7633xZ);
        this.n = new CI0(lo0F, jPackage, this);
        this.o = c2720aS0.g(new C5842p1(this, 5), C5653o60.d);
        this.p = ke0.v.b ? InterfaceC2396Xc.a.a : C3043bv.h(lo0F, jPackage);
        c2720aS0.a(new C7843yZ(this, 3));
    }

    @Override // defpackage.AbstractC2470Ya1, defpackage.AbstractC5308mU, defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        return new C2923bL0(this);
    }

    @Override // defpackage.C5642o31, defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return this.p;
    }

    @Override // defpackage.AbstractC2470Ya1, defpackage.AbstractC4885kU
    @NotNull
    public final String toString() {
        return "Lazy Java package fragment: " + this.i + " of module " + this.l.a.o;
    }

    @Override // defpackage.InterfaceC2392Xa1
    public final QY0 v() {
        return this.n;
    }
}
