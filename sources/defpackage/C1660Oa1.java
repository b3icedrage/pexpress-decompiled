package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Oa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1660Oa1 implements InterfaceC4366iD {

    @Nullable
    public final HashMap a;

    @NotNull
    public final InterfaceC4859kL0.a b;

    public C1660Oa1(@Nullable HashMap map, @NotNull InterfaceC4859kL0.a equalityAxioms, @NotNull AbstractC6331rL0.a kotlinTypeRefiner, @NotNull AbstractC5912pL0.a kotlinTypePreparator) {
        Intrinsics.checkNotNullParameter(equalityAxioms, "equalityAxioms");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.a = map;
        this.b = equalityAxioms;
    }

    @Override // defpackage.Y62
    public final boolean A(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.K(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @NotNull
    public final C4624jD B(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.T(this, interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @NotNull
    public final AbstractC5706oM1 C(@NotNull InterfaceC6126qM1 interfaceC6126qM1, boolean z) {
        return InterfaceC4366iD.a.Z(interfaceC6126qM1, z);
    }

    @Override // defpackage.Y62
    @Nullable
    public final H62 D(@NotNull InterfaceC3508e72 interfaceC3508e72) {
        return InterfaceC4366iD.a.p(interfaceC3508e72);
    }

    @Override // defpackage.Y62
    public final boolean E(InterfaceC6126qM1 interfaceC6126qM1) {
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        return InterfaceC4366iD.a.C(InterfaceC4366iD.a.W(interfaceC6126qM1));
    }

    @Override // defpackage.Y62
    @NotNull
    public final P92 F(InterfaceC5702oL0 interfaceC5702oL0) {
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        return InterfaceC4366iD.a.O(interfaceC5702oL0);
    }

    @Override // defpackage.Y62
    @Nullable
    public final AbstractC5706oM1 G(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        EnumC2120Ty enumC2120Ty = EnumC2120Ty.d;
        return InterfaceC4366iD.a.j(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    public final int H(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.Q(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final AbstractC5706oM1 I(InterfaceC5702oL0 interfaceC5702oL0) {
        AbstractC5706oM1 abstractC5706oM1X;
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC2299We0 abstractC2299We0G = InterfaceC4366iD.a.g(interfaceC5702oL0);
        if (abstractC2299We0G != null && (abstractC5706oM1X = InterfaceC4366iD.a.X(abstractC2299We0G)) != null) {
            return abstractC5706oM1X;
        }
        AbstractC5706oM1 abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC5702oL0);
        Intrinsics.checkNotNull(abstractC5706oM1H);
        return abstractC5706oM1H;
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC6494s62 J(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.W(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    public final boolean K(InterfaceC6126qM1 interfaceC6126qM1) {
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        AbstractC5706oM1 abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC6126qM1);
        return (abstractC5706oM1H != null ? InterfaceC4366iD.a.d(this, abstractC5706oM1H) : null) != null;
    }

    @Override // defpackage.Y62
    @Nullable
    public final InterfaceC3054bz L(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.d(this, interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    public final boolean M(InterfaceC6126qM1 interfaceC6126qM1) {
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        return InterfaceC4366iD.a.F(X(interfaceC6126qM1)) && !InterfaceC4366iD.a.G(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @NotNull
    public final P92 N(@NotNull ArrayList types) {
        AbstractC5706oM1 abstractC5706oM1;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (P92) CollectionsKt.T(types);
        }
        ArrayList arrayList = new ArrayList(XE.m(types, 10));
        Iterator it = types.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            P92 p92 = (P92) it.next();
            z = z || C3686f.n(p92);
            if (p92 instanceof AbstractC5706oM1) {
                abstractC5706oM1 = (AbstractC5706oM1) p92;
            } else {
                if (!(p92 instanceof AbstractC2299We0)) {
                    throw new C6489s51();
                }
                if (Z40.a(p92)) {
                    return p92;
                }
                abstractC5706oM1 = ((AbstractC2299We0) p92).e;
                z2 = true;
            }
            arrayList.add(abstractC5706oM1);
        }
        if (z) {
            return R70.c(Q70.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z2) {
            return C62.a.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(XE.m(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C6621sj.q((P92) it2.next()));
        }
        C62 c62 = C62.a;
        return C5492nL0.a(c62.b(arrayList), c62.b(arrayList2));
    }

    @Override // defpackage.Y62
    @NotNull
    public final P62 O(@NotNull InterfaceC5702oL0 interfaceC5702oL0) {
        return InterfaceC4366iD.a.i(interfaceC5702oL0);
    }

    @Override // defpackage.Y62
    @NotNull
    public final AbstractC5706oM1 P(@NotNull InterfaceC2559Ze0 interfaceC2559Ze0) {
        return InterfaceC4366iD.a.X(interfaceC2559Ze0);
    }

    @Override // defpackage.Y62
    @NotNull
    public final J62 Q(@NotNull InterfaceC6704t62 interfaceC6704t62, int i) {
        return InterfaceC4366iD.a.n(interfaceC6704t62, i);
    }

    @Override // defpackage.Y62
    public final boolean R(@NotNull InterfaceC6704t62 c1, @NotNull InterfaceC6704t62 c2) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        if (!(c1 instanceof InterfaceC6494s62)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(c2 instanceof InterfaceC6494s62)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (InterfaceC4366iD.a.a(c1, c2)) {
            return true;
        }
        InterfaceC6494s62 interfaceC6494s62 = (InterfaceC6494s62) c1;
        InterfaceC6494s62 interfaceC6494s63 = (InterfaceC6494s62) c2;
        if (this.b.a(interfaceC6494s62, interfaceC6494s63)) {
            return true;
        }
        HashMap map = this.a;
        if (map == null) {
            return false;
        }
        InterfaceC6494s62 interfaceC6494s64 = (InterfaceC6494s62) map.get(interfaceC6494s62);
        InterfaceC6494s62 interfaceC6494s65 = (InterfaceC6494s62) map.get(interfaceC6494s63);
        if (interfaceC6494s64 == null || !interfaceC6494s64.equals(interfaceC6494s63)) {
            return interfaceC6494s65 != null && interfaceC6494s65.equals(interfaceC6494s62);
        }
        return true;
    }

    @Override // defpackage.Z62
    public final boolean S(@NotNull InterfaceC6126qM1 interfaceC6126qM1, @NotNull InterfaceC6126qM1 interfaceC6126qM2) {
        return InterfaceC4366iD.a.v(interfaceC6126qM1, interfaceC6126qM2);
    }

    @Override // defpackage.Y62
    public final boolean T(@NotNull InterfaceC5702oL0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof K51;
    }

    @Override // defpackage.Y62
    public final boolean U(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.E(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @Nullable
    public final InterfaceC4812k62 V(InterfaceC6126qM1 interfaceC6126qM1, int i) {
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        if (i < 0 || i >= InterfaceC4366iD.a.b(interfaceC6126qM1)) {
            return null;
        }
        return InterfaceC4366iD.a.m(interfaceC6126qM1, i);
    }

    @Override // defpackage.Y62
    @Nullable
    public final AbstractC2299We0 W(@NotNull InterfaceC5702oL0 interfaceC5702oL0) {
        return InterfaceC4366iD.a.g(interfaceC5702oL0);
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC6494s62 X(InterfaceC5702oL0 interfaceC5702oL0) {
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC5706oM1 abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC5702oL0);
        if (abstractC5706oM1H == null) {
            abstractC5706oM1H = r(interfaceC5702oL0);
        }
        return InterfaceC4366iD.a.W(abstractC5706oM1H);
    }

    @Override // defpackage.Y62
    public final boolean Y(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.C(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final AbstractC5706oM1 Z(@NotNull CW cw) {
        return InterfaceC4366iD.a.P(cw);
    }

    @Override // defpackage.Y62
    public final boolean a(@NotNull J62 j62, @Nullable InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.u(j62, interfaceC6704t62);
    }

    @Override // defpackage.Y62
    public final boolean a0(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.w(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    public final int b(@NotNull InterfaceC5702oL0 interfaceC5702oL0) {
        return InterfaceC4366iD.a.b(interfaceC5702oL0);
    }

    @Override // defpackage.Y62
    public final boolean b0(@NotNull InterfaceC3054bz interfaceC3054bz) {
        return InterfaceC4366iD.a.I(interfaceC3054bz);
    }

    @Override // defpackage.Y62
    public final boolean c(@NotNull InterfaceC3054bz receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof C2198Uy;
    }

    @Override // defpackage.Y62
    public final boolean c0(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.F(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    public final boolean d(@NotNull InterfaceC4812k62 interfaceC4812k62) {
        return InterfaceC4366iD.a.J(interfaceC4812k62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC4812k62 d0(InterfaceC4602j62 interfaceC4602j62, int i) {
        Intrinsics.checkNotNullParameter(interfaceC4602j62, "<this>");
        if (interfaceC4602j62 instanceof InterfaceC6126qM1) {
            return InterfaceC4366iD.a.m((InterfaceC5702oL0) interfaceC4602j62, i);
        }
        if (interfaceC4602j62 instanceof C4261hj) {
            InterfaceC4812k62 interfaceC4812k62 = ((C4261hj) interfaceC4602j62).get(i);
            Intrinsics.checkNotNullExpressionValue(interfaceC4812k62, "get(...)");
            return interfaceC4812k62;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC4602j62 + ", " + C2017Sp1.a.b(interfaceC4602j62.getClass())).toString());
    }

    @Override // defpackage.Y62
    public final int e(InterfaceC4602j62 interfaceC4602j62) {
        Intrinsics.checkNotNullParameter(interfaceC4602j62, "<this>");
        if (interfaceC4602j62 instanceof InterfaceC6126qM1) {
            return InterfaceC4366iD.a.b((InterfaceC5702oL0) interfaceC4602j62);
        }
        if (interfaceC4602j62 instanceof C4261hj) {
            return ((C4261hj) interfaceC4602j62).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC4602j62 + ", " + C2017Sp1.a.b(interfaceC4602j62.getClass())).toString());
    }

    @Override // defpackage.Y62
    public final boolean e0(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.y(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final EnumC3718f72 f(@NotNull InterfaceC4812k62 interfaceC4812k62) {
        return InterfaceC4366iD.a.r(interfaceC4812k62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC6126qM1 f0(InterfaceC6126qM1 interfaceC6126qM1) {
        AbstractC5706oM1 abstractC5706oM1P;
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        BW bwE = InterfaceC4366iD.a.e(interfaceC6126qM1);
        return (bwE == null || (abstractC5706oM1P = InterfaceC4366iD.a.P(bwE)) == null) ? interfaceC6126qM1 : abstractC5706oM1P;
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC4602j62 g(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.c(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC4812k62 g0(@NotNull InterfaceC5702oL0 interfaceC5702oL0, int i) {
        return InterfaceC4366iD.a.m(interfaceC5702oL0, i);
    }

    @Override // defpackage.Y62
    public final boolean h(InterfaceC5702oL0 interfaceC5702oL0) {
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC2299We0 abstractC2299We0G = InterfaceC4366iD.a.g(interfaceC5702oL0);
        return (abstractC2299We0G != null ? InterfaceC4366iD.a.f(abstractC2299We0G) : null) != null;
    }

    @Override // defpackage.Y62
    public final boolean h0(InterfaceC5702oL0 interfaceC5702oL0) {
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        return !Intrinsics.a(InterfaceC4366iD.a.W(r(interfaceC5702oL0)), InterfaceC4366iD.a.W(I(interfaceC5702oL0)));
    }

    @Override // defpackage.Y62
    @NotNull
    public final P92 i(@NotNull InterfaceC4812k62 interfaceC4812k62) {
        return InterfaceC4366iD.a.o(interfaceC4812k62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final AbstractC5706oM1 i0(@NotNull InterfaceC2559Ze0 interfaceC2559Ze0) {
        return InterfaceC4366iD.a.M(interfaceC2559Ze0);
    }

    @Override // defpackage.Y62
    public final boolean j(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.D(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    @Nullable
    public final void j0(InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6704t62 constructor) {
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
    }

    @Override // defpackage.Y62
    public final boolean k(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.L(interfaceC6126qM1);
    }

    @Override // defpackage.InterfaceC4366iD
    @NotNull
    public final P92 k0(@NotNull InterfaceC6126qM1 interfaceC6126qM1, @NotNull InterfaceC6126qM1 interfaceC6126qM2) {
        return InterfaceC4366iD.a.l(this, interfaceC6126qM1, interfaceC6126qM2);
    }

    @Override // defpackage.Y62
    @NotNull
    public final C5436n41 l(@NotNull InterfaceC3054bz interfaceC3054bz) {
        return InterfaceC4366iD.a.V(interfaceC3054bz);
    }

    @Override // defpackage.Y62
    @NotNull
    public final InterfaceC5702oL0 l0(@NotNull InterfaceC5702oL0 interfaceC5702oL0) {
        return InterfaceC4366iD.a.Y(this, interfaceC5702oL0);
    }

    @Override // defpackage.Y62
    public final boolean m(InterfaceC6126qM1 interfaceC6126qM1) {
        Intrinsics.checkNotNullParameter(interfaceC6126qM1, "<this>");
        return InterfaceC4366iD.a.x(InterfaceC4366iD.a.W(interfaceC6126qM1));
    }

    @Override // defpackage.Y62
    @Nullable
    public final BW m0(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.e(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @Nullable
    public final AbstractC5706oM1 n(@NotNull InterfaceC5702oL0 interfaceC5702oL0) {
        return InterfaceC4366iD.a.h(interfaceC5702oL0);
    }

    @Override // defpackage.Y62
    @NotNull
    public final N62 o(@NotNull InterfaceC2540Yy interfaceC2540Yy) {
        return InterfaceC4366iD.a.S(interfaceC2540Yy);
    }

    @Override // defpackage.Y62
    public final boolean p(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.x(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final EnumC3718f72 q(@NotNull J62 j62) {
        return InterfaceC4366iD.a.s(j62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final AbstractC5706oM1 r(InterfaceC5702oL0 interfaceC5702oL0) {
        AbstractC5706oM1 abstractC5706oM1M;
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC2299We0 abstractC2299We0G = InterfaceC4366iD.a.g(interfaceC5702oL0);
        if (abstractC2299We0G != null && (abstractC5706oM1M = InterfaceC4366iD.a.M(abstractC2299We0G)) != null) {
            return abstractC5706oM1M;
        }
        AbstractC5706oM1 abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC5702oL0);
        Intrinsics.checkNotNull(abstractC5706oM1H);
        return abstractC5706oM1H;
    }

    @Override // defpackage.Y62
    @Nullable
    public final P92 s(@NotNull InterfaceC3054bz interfaceC3054bz) {
        return InterfaceC4366iD.a.N(interfaceC3054bz);
    }

    @Override // defpackage.Y62
    @NotNull
    public final Collection<InterfaceC5702oL0> t(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.U(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    public final boolean u(@NotNull InterfaceC6704t62 interfaceC6704t62) {
        return InterfaceC4366iD.a.z(interfaceC6704t62);
    }

    @Override // defpackage.Y62
    @NotNull
    public final Set v(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.R(this, interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    public final boolean w(@NotNull InterfaceC6126qM1 interfaceC6126qM1) {
        return InterfaceC4366iD.a.A(interfaceC6126qM1);
    }

    @Override // defpackage.Y62
    @NotNull
    public final EnumC2120Ty x(@NotNull InterfaceC3054bz interfaceC3054bz) {
        return InterfaceC4366iD.a.k(interfaceC3054bz);
    }

    @Override // defpackage.Y62
    public final boolean y(InterfaceC5702oL0 interfaceC5702oL0) {
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        return InterfaceC4366iD.a.E(r(interfaceC5702oL0)) != InterfaceC4366iD.a.E(I(interfaceC5702oL0));
    }

    @Override // defpackage.Y62
    public final boolean z(InterfaceC5702oL0 interfaceC5702oL0) {
        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
        AbstractC5706oM1 abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC5702oL0);
        return (abstractC5706oM1H != null ? InterfaceC4366iD.a.e(abstractC5706oM1H) : null) != null;
    }
}
