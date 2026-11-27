package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4193hP0 extends O01 {
    public final O01 d;
    public final X62 e;
    public X62 g;
    public ArrayList h;
    public ArrayList i;
    public ZC j;

    /* JADX INFO: renamed from: hP0$a */
    public class a implements Function1<H62, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(H62 h62) {
            return Boolean.valueOf(!h62.t0());
        }
    }

    /* JADX INFO: renamed from: hP0$b */
    public class b implements Function1<AbstractC5706oM1, AbstractC5706oM1> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final AbstractC5706oM1 invoke(AbstractC5706oM1 abstractC5706oM1) {
            AbstractC5706oM1 abstractC5706oM2 = abstractC5706oM1;
            C4193hP0 c4193hP0 = C4193hP0.this;
            if (abstractC5706oM2 != null) {
                return c4193hP0.e.a.f() ? abstractC5706oM2 : (AbstractC5706oM1) c4193hP0.N0().j(abstractC5706oM2, EnumC3610ed2.INVARIANT);
            }
            c4193hP0.getClass();
            return abstractC5706oM2;
        }
    }

    public C4193hP0(O01 o01, X62 x62) {
        this.d = o01;
        this.e = x62;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void H0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // defpackage.FC, defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        N0();
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            return arrayList;
        }
        H0(30);
        throw null;
    }

    @Override // defpackage.GY0
    public final boolean D() {
        return this.d.D();
    }

    @Override // defpackage.FC
    public final boolean E() {
        return this.d.E();
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 E0() {
        QY0 qy0E0 = this.d.E0();
        if (qy0E0 != null) {
            return qy0E0;
        }
        H0(28);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.FC
    @Nullable
    public final Rc2<AbstractC5706oM1> F0() {
        Rc2<AbstractC5706oM1> rc2F0 = this.d.F0();
        if (rc2F0 == null) {
            return null;
        }
        b transform = new b();
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (rc2F0 instanceof C6928uA0) {
            C6928uA0 c6928uA0 = (C6928uA0) rc2F0;
            return new C6928uA0(c6928uA0.a, (InterfaceC6126qM1) transform.invoke(c6928uA0.b));
        }
        if (!(rc2F0 instanceof H11)) {
            throw new C6489s51();
        }
        ArrayList<Pair> arrayList = ((H11) rc2F0).a;
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(new Pair((C5638o21) pair.d, transform.invoke((InterfaceC6126qM1) pair.e)));
        }
        return new H11(arrayList2);
    }

    @Override // defpackage.O01
    @NotNull
    public final QY0 G0(@NotNull AbstractC6331rL0 abstractC6331rL0) {
        if (abstractC6331rL0 == null) {
            H0(13);
            throw null;
        }
        QY0 qy0G0 = this.d.G0(abstractC6331rL0);
        if (!this.e.a.f()) {
            return new MU1(qy0G0, N0());
        }
        if (qy0G0 != null) {
            return qy0G0;
        }
        H0(14);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean I() {
        return this.d.I();
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 L0() {
        QY0 qy0G0 = G0(C4900kZ.i(C4432iZ.d(this.d)));
        if (qy0G0 != null) {
            return qy0G0;
        }
        H0(12);
        throw null;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return this.d.M0();
    }

    @Override // defpackage.O01
    @NotNull
    public final QY0 N(@NotNull T62 t62, @NotNull AbstractC6331rL0 abstractC6331rL0) {
        if (abstractC6331rL0 == null) {
            H0(6);
            throw null;
        }
        QY0 qy0N = this.d.N(t62, abstractC6331rL0);
        if (!this.e.a.f()) {
            return new MU1(qy0N, N0());
        }
        if (qy0N != null) {
            return qy0N;
        }
        H0(7);
        throw null;
    }

    public final X62 N0() {
        if (this.g == null) {
            X62 x62 = this.e;
            if (x62.a.f()) {
                this.g = x62;
            } else {
                List<H62> listB = this.d.p().b();
                this.h = new ArrayList(listB.size());
                this.g = C5208m0.r(listB, x62.g(), this, this.h);
                this.i = CollectionsKt.C(this.h, new a());
            }
        }
        return this.g;
    }

    @Override // defpackage.FC
    @NotNull
    public final List<InterfaceC1076Go1> O0() {
        List<InterfaceC1076Go1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        H0(17);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<FC> P() {
        Collection<FC> collectionP = this.d.P();
        if (collectionP != null) {
            return collectionP;
        }
        H0(31);
        throw null;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return this.d.Q();
    }

    @Override // defpackage.FC
    public final boolean Q0() {
        return this.d.Q0();
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return this.d.R();
    }

    @Override // defpackage.FC
    @NotNull
    public final InterfaceC1076Go1 S0() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.FC
    @Nullable
    public final InterfaceC7984zC X() {
        return this.d.X();
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 Y() {
        QY0 qy0Y = this.d.Y();
        if (qy0Y != null) {
            return qy0Y;
        }
        H0(15);
        throw null;
    }

    @Override // defpackage.FC
    public final FC a0() {
        return this.d.a0();
    }

    @Override // defpackage.IU1
    @NotNull
    public final InterfaceC5095lU b(@NotNull X62 x62) {
        if (x62 != null) {
            return x62.a.f() ? this : new C4193hP0(this, X62.f(x62.g(), N0().g()));
        }
        H0(23);
        throw null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        AbstractC5533nZ abstractC5533nZD = this.d.d();
        if (abstractC5533nZD != null) {
            return abstractC5533nZD;
        }
        H0(27);
        throw null;
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        InterfaceC4675jU interfaceC4675jUE = this.d.e();
        if (interfaceC4675jUE != null) {
            return interfaceC4675jUE;
        }
        H0(22);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) ((C2964bZ.a) interfaceC5518nU).f(this, (StringBuilder) d);
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final C5638o21 getName() {
        C5638o21 name = this.d.getName();
        if (name != null) {
            return name;
        }
        H0(20);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final SC h() {
        SC scH = this.d.h();
        if (scH != null) {
            return scH;
        }
        H0(25);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 h0(@NotNull T62 t62) {
        return N(t62, C4900kZ.i(C4432iZ.d(this)));
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        return VN1.a;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        InterfaceC2396Xc interfaceC2396XcK = this.d.k();
        if (interfaceC2396XcK != null) {
            return interfaceC2396XcK;
        }
        H0(19);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean m() {
        return this.d.m();
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        InterfaceC6494s62 interfaceC6494s62P = this.d.p();
        if (this.e.a.f()) {
            if (interfaceC6494s62P != null) {
                return interfaceC6494s62P;
            }
            H0(0);
            throw null;
        }
        if (this.j == null) {
            X62 x62N0 = N0();
            Collection<AbstractC4649jL0> collectionA = interfaceC6494s62P.a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            Iterator<AbstractC4649jL0> it = collectionA.iterator();
            while (it.hasNext()) {
                arrayList.add(x62N0.j(it.next(), EnumC3610ed2.INVARIANT));
            }
            this.j = new ZC(this, this.h, arrayList, C2720aS0.e);
        }
        ZC zc = this.j;
        if (zc != null) {
            return zc;
        }
        H0(1);
        throw null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final C01 q() {
        C01 c01Q = this.d.q();
        if (c01Q != null) {
            return c01Q;
        }
        H0(26);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<InterfaceC7984zC> r() {
        Collection<InterfaceC7984zC> collectionR = this.d.r();
        ArrayList arrayList = new ArrayList(collectionR.size());
        for (InterfaceC7984zC interfaceC7984zC : collectionR) {
            arrayList.add(((InterfaceC7984zC) interfaceC7984zC.K0().q(interfaceC7984zC.U0()).m(interfaceC7984zC.q()).c(interfaceC7984zC.d()).a(interfaceC7984zC.h()).l().build()).b(N0()));
        }
        return arrayList;
    }

    @Override // defpackage.FC
    public final boolean s() {
        return this.d.s();
    }

    @Override // defpackage.FC, defpackage.InterfaceC5044lD
    @NotNull
    public final AbstractC5706oM1 y() {
        C5655o62 c5655o62A;
        List<N62> listD = C3089c72.d(p().b());
        InterfaceC2396Xc annotations = k();
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            C5655o62.e.getClass();
            c5655o62A = C5655o62.g;
        } else {
            C5655o62.a aVar = C5655o62.e;
            List listC = VE.c(new C2755ad(annotations));
            aVar.getClass();
            c5655o62A = C5655o62.a.a(listC);
        }
        return C5492nL0.d(L0(), c5655o62A, p(), listD, false);
    }

    @Override // defpackage.O01, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final FC U0() {
        FC fcU0 = this.d.U0();
        if (fcU0 != null) {
            return fcU0;
        }
        H0(21);
        throw null;
    }
}
