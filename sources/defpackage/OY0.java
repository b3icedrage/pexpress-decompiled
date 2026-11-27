package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OY0 {

    @NotNull
    public final C6582sZ a;

    @NotNull
    public final C1820Qc b;

    public OY0(@NotNull C6582sZ c) {
        Intrinsics.checkNotNullParameter(c, "c");
        this.a = c;
        C6163qZ c6163qZ = c.a;
        this.b = new C1820Qc(c6163qZ.b, c6163qZ.l);
    }

    public final AbstractC6208qk1 a(InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU instanceof InterfaceC2392Xa1) {
            C1758Ph0 c1758Ph0C = ((InterfaceC2392Xa1) interfaceC4675jU).c();
            C6582sZ c6582sZ = this.a;
            return new AbstractC6208qk1.b(c1758Ph0C, c6582sZ.b, c6582sZ.d, c6582sZ.g);
        }
        if (interfaceC4675jU instanceof FZ) {
            return ((FZ) interfaceC4675jU).A;
        }
        return null;
    }

    public final InterfaceC2396Xc b(AbstractC0673Bk0.c cVar, int i, EnumC0804Dc enumC0804Dc) {
        return !C2061Te0.c.c(i).booleanValue() ? InterfaceC2396Xc.a.a : new A51(this.a.a.a, new JY0(this, cVar, enumC0804Dc));
    }

    public final InterfaceC2396Xc c(C3637ek1 c3637ek1, boolean z) {
        return !C2061Te0.c.c(c3637ek1.h).booleanValue() ? InterfaceC2396Xc.a.a : new A51(this.a.a.a, new KY0(this, z, c3637ek1));
    }

    @NotNull
    public final C7212vZ d(@NotNull C2155Uj1 proto, boolean z) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        C6582sZ c6582sZ = this.a;
        InterfaceC4675jU interfaceC4675jU = c6582sZ.c;
        Intrinsics.c(interfaceC4675jU, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        FC fc = (FC) interfaceC4675jU;
        int i = proto.h;
        EnumC0804Dc enumC0804Dc = EnumC0804Dc.d;
        C7212vZ c7212vZ = new C7212vZ(fc, null, b(proto, i, enumC0804Dc), z, InterfaceC1490Lx.a.d, proto, c6582sZ.b, c6582sZ.d, c6582sZ.e, c6582sZ.g, null);
        C6582sZ c6582sZA = c6582sZ.a(c7212vZ, C5653o60.d, c6582sZ.b, c6582sZ.d, c6582sZ.e, c6582sZ.f);
        List<C5155lk1> list = proto.i;
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
        c7212vZ.g1(c6582sZA.i.g(list, proto, enumC0804Dc), C7257vk1.a((EnumC5788ok1) C2061Te0.d.c(proto.h)));
        c7212vZ.d1(fc.y());
        c7212vZ.v = fc.Q();
        c7212vZ.A = !C2061Te0.o.c(proto.h).booleanValue();
        return c7212vZ;
    }

    @NotNull
    public final C3059c00 e(@NotNull C2575Zj1 proto) {
        int i;
        AbstractC4649jL0 abstractC4649jL0G;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.g & 1) == 1) {
            i = proto.h;
        } else {
            int i2 = proto.i;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        EnumC0804Dc enumC0804Dc = EnumC0804Dc.d;
        InterfaceC2396Xc interfaceC2396XcB = b(proto, i3, enumC0804Dc);
        Intrinsics.checkNotNullParameter(proto, "<this>");
        int i4 = proto.g;
        int i5 = i4 & 32;
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        C6582sZ c6582sZ = this.a;
        InterfaceC2396Xc c6792tZ = (i5 == 32 || (i4 & 64) == 64) ? new C6792tZ(c6582sZ.a.a, new LY0(this, proto, enumC0804Dc)) : c0193a;
        C1758Ph0 c1758Ph0G = C4900kZ.g(c6582sZ.c);
        int i6 = proto.j;
        InterfaceC5848p21 interfaceC5848p21 = c6582sZ.b;
        C5761od2 c5761od2 = c1758Ph0G.c(C6267r21.b(interfaceC5848p21, i6)).equals(C7836yW1.a) ? C5761od2.b : c6582sZ.e;
        C5638o21 c5638o21B = C6267r21.b(interfaceC5848p21, proto.j);
        InterfaceC1490Lx.a aVarB = C7257vk1.b((EnumC2785ak1) C2061Te0.p.c(i3));
        C2656a72 typeTable = c6582sZ.d;
        InterfaceC2396Xc interfaceC2396Xc = c6792tZ;
        C3059c00 ownerFunction = new C3059c00(c6582sZ.c, null, interfaceC2396XcB, c5638o21B, aVarB, proto, c6582sZ.b, typeTable, c5761od2, c6582sZ.g, null);
        List<C4735jk1> list = proto.m;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        C6582sZ c6582sZA = c6582sZ.a(ownerFunction, list, c6582sZ.b, c6582sZ.d, c6582sZ.e, c6582sZ.f);
        C4267hk1 c4267hk1B = C7888yk1.b(proto, typeTable);
        C7334w62 typeDeserializer = c6582sZA.h;
        C1154Ho1 c1154Ho1H = (c4267hk1B == null || (abstractC4649jL0G = typeDeserializer.g(c4267hk1B)) == null) ? null : JY.h(ownerFunction, abstractC4649jL0G, interfaceC2396Xc);
        InterfaceC4675jU interfaceC4675jU = c6582sZ.c;
        FC fc = interfaceC4675jU instanceof FC ? (FC) interfaceC4675jU : null;
        InterfaceC1076Go1 interfaceC1076Go1S0 = fc != null ? fc.S0() : null;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<C4267hk1> list2 = proto.p;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = proto.q;
            Intrinsics.checkNotNullExpressionValue(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(XE.m(list3, 10));
            for (Integer num : list3) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        for (Object obj : list2) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                WE.l();
                throw null;
            }
            C1154Ho1 c1154Ho1B = JY.b(ownerFunction, typeDeserializer.g((C4267hk1) obj), null, c0193a, i7);
            if (c1154Ho1B != null) {
                arrayList2.add(c1154Ho1B);
            }
            i7 = i8;
        }
        List<H62> listB = typeDeserializer.b();
        List<C5155lk1> list4 = proto.s;
        Intrinsics.checkNotNullExpressionValue(list4, "getValueParameterList(...)");
        ownerFunction.i1(c1154Ho1H, interfaceC1076Go1S0, arrayList2, listB, c6582sZA.i.g(list4, proto, enumC0804Dc), typeDeserializer.g(C7888yk1.c(proto, typeTable)), C7047uk1.a((EnumC3009bk1) C2061Te0.e.c(i3)), C7257vk1.a((EnumC5788ok1) C2061Te0.d.c(i3)), PW0.c());
        ownerFunction.q = C2061Te0.q.c(i3).booleanValue();
        ownerFunction.r = C2061Te0.r.c(i3).booleanValue();
        ownerFunction.s = C2061Te0.u.c(i3).booleanValue();
        ownerFunction.t = C2061Te0.s.c(i3).booleanValue();
        ownerFunction.u = C2061Te0.t.c(i3).booleanValue();
        ownerFunction.z = C2061Te0.v.c(i3).booleanValue();
        ownerFunction.v = C2061Te0.w.c(i3).booleanValue();
        ownerFunction.A = !C2061Te0.x.c(i3).booleanValue();
        c6582sZ.a.m.getClass();
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        return ownerFunction;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [Oj1] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r3v21, types: [p71] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Bj1, Cj1, Jx, b00, dd2, mU] */
    @NotNull
    public final C2850b00 f(@NotNull C3637ek1 proto) throws Throwable {
        int i;
        InterfaceC2396Xc c6792tZ;
        boolean z;
        int i2;
        C2061Te0.a aVar;
        C2061Te0.a aVar2;
        Throwable th;
        OY0 oy0;
        ?? r12;
        C0983Fj1 c0983Fj1C;
        AbstractC4649jL0 abstractC4649jL0G;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.g & 1) == 1) {
            i = proto.h;
        } else {
            int i3 = proto.i;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        C6582sZ c6582sZ = this.a;
        InterfaceC4675jU interfaceC4675jU = c6582sZ.c;
        InterfaceC2396Xc interfaceC2396XcB = b(proto, i, EnumC0804Dc.e);
        C01 c01A = C7047uk1.a((EnumC3009bk1) C2061Te0.e.c(i));
        QW qwA = C7257vk1.a((EnumC5788ok1) C2061Te0.d.c(i));
        boolean zF = C1742Pc.f(C2061Te0.y, i, "get(...)");
        C5638o21 c5638o21B = C6267r21.b(c6582sZ.b, proto.j);
        InterfaceC1490Lx.a aVarB = C7257vk1.b((EnumC2785ak1) C2061Te0.p.c(i));
        boolean zF2 = C1742Pc.f(C2061Te0.C, i, "get(...)");
        boolean zF3 = C1742Pc.f(C2061Te0.B, i, "get(...)");
        boolean zF4 = C1742Pc.f(C2061Te0.E, i, "get(...)");
        boolean zF5 = C1742Pc.f(C2061Te0.F, i, "get(...)");
        boolean zF6 = C1742Pc.f(C2061Te0.G, i, "get(...)");
        int i4 = i;
        C2656a72 typeTable = c6582sZ.d;
        C6582sZ c6582sZ2 = c6582sZ;
        ?? c2850b00 = new C2850b00(interfaceC4675jU, null, interfaceC2396XcB, c01A, qwA, zF, c5638o21B, aVarB, zF2, zF3, zF4, zF5, zF6, proto, c6582sZ.b, typeTable, c6582sZ.e, c6582sZ.g);
        List<C4735jk1> list = proto.m;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        C6582sZ c6582sZA = c6582sZ2.a(c2850b00, list, c6582sZ2.b, c6582sZ2.d, c6582sZ2.e, c6582sZ2.f);
        String str = "get(...)";
        boolean zF7 = C1742Pc.f(C2061Te0.z, i4, str);
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        EnumC0804Dc enumC0804Dc = EnumC0804Dc.g;
        if (zF7) {
            Intrinsics.checkNotNullParameter(proto, "<this>");
            int i5 = proto.g;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                c6792tZ = new C6792tZ(c6582sZ2.a.a, new LY0(this, proto, enumC0804Dc));
            } else {
                c6792tZ = c0193a;
            }
        } else {
            c6792tZ = c0193a;
        }
        C4267hk1 c4267hk1D = C7888yk1.d(proto, typeTable);
        C7334w62 c7334w62 = c6582sZA.h;
        AbstractC4649jL0 abstractC4649jL0G2 = c7334w62.g(c4267hk1D);
        List<H62> listB = c7334w62.b();
        InterfaceC4675jU interfaceC4675jU2 = c6582sZ2.c;
        FC fc = interfaceC4675jU2 instanceof FC ? (FC) interfaceC4675jU2 : null;
        InterfaceC1076Go1 interfaceC1076Go1S0 = fc != null ? fc.S0() : null;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i6 = proto.g;
        InterfaceC1076Go1 interfaceC1076Go1 = interfaceC1076Go1S0;
        C4267hk1 c4267hk1A = (i6 & 32) == 32 ? proto.n : (i6 & 64) == 64 ? typeTable.a(proto.o) : null;
        C1154Ho1 c1154Ho1H = (c4267hk1A == null || (abstractC4649jL0G = c7334w62.g(c4267hk1A)) == null) ? null : JY.h(c2850b00, abstractC4649jL0G, c6792tZ);
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<C4267hk1> list2 = proto.p;
        if (list2.isEmpty()) {
            list2 = null;
        }
        int i7 = 10;
        if (list2 == null) {
            List<Integer> list3 = proto.q;
            Intrinsics.checkNotNullExpressionValue(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(XE.m(list3, 10));
            for (Integer num : list3) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(XE.m(list2, 10));
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                WE.l();
                throw null;
            }
            arrayList2.add(JY.b(c2850b00, c7334w62.g((C4267hk1) obj), null, c0193a, i8));
            i8 = i9;
            i7 = i7;
        }
        int i10 = i7;
        C0983Fj1 c0983Fj1 = null;
        c2850b00.a1(abstractC4649jL0G2, listB, interfaceC1076Go1, c1154Ho1H, arrayList2);
        C2061Te0.a aVar3 = C2061Te0.c;
        boolean zF8 = C1742Pc.f(aVar3, i4, str);
        C2061Te0.b bVar = C2061Te0.d;
        EnumC5788ok1 enumC5788ok1 = (EnumC5788ok1) bVar.c(i4);
        C2061Te0.b bVar2 = C2061Te0.e;
        EnumC3009bk1 enumC3009bk1 = (EnumC3009bk1) bVar2.c(i4);
        if (enumC5788ok1 == null) {
            C2061Te0.a(i10);
            throw null;
        }
        if (enumC3009bk1 == null) {
            C2061Te0.a(11);
            throw null;
        }
        if (zF8) {
            z = true;
            i2 = 1 << aVar3.a;
        } else {
            z = true;
            i2 = 0;
        }
        int number = i2 | (enumC3009bk1.getNumber() << bVar2.a) | (enumC5788ok1.getNumber() << bVar.a);
        C2061Te0.a aVar4 = C2061Te0.K;
        aVar4.getClass();
        C2061Te0.a aVar5 = C2061Te0.L;
        aVar5.getClass();
        C2061Te0.a aVar6 = C2061Te0.M;
        aVar6.getClass();
        VN1.a aVar7 = VN1.a;
        if (zF7) {
            int i11 = (proto.g & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 256 ? proto.t : number;
            boolean zF9 = C1742Pc.f(aVar4, i11, str);
            boolean zF10 = C1742Pc.f(aVar5, i11, str);
            boolean zF11 = C1742Pc.f(aVar6, i11, str);
            InterfaceC2396Xc interfaceC2396XcB2 = b(proto, i11, enumC0804Dc);
            if (zF9) {
                aVar2 = aVar5;
                th = null;
                aVar = aVar4;
                c0983Fj1C = new C0983Fj1(c2850b00, interfaceC2396XcB2, C7047uk1.a((EnumC3009bk1) bVar2.c(i11)), C7257vk1.a((EnumC5788ok1) bVar.c(i11)), !zF9, zF10, zF11, c2850b00.h(), null, aVar7);
            } else {
                aVar = aVar4;
                aVar2 = aVar5;
                th = null;
                c0983Fj1C = JY.c(c2850b00, interfaceC2396XcB2);
                Intrinsics.checkNotNull(c0983Fj1C);
            }
            c0983Fj1 = c0983Fj1C;
            c0983Fj1.X0(c2850b00.n());
        } else {
            c6582sZ2 = c6582sZ2;
            c6582sZA = c6582sZA;
            aVar = aVar4;
            aVar2 = aVar5;
            bVar = bVar;
            aVar6 = aVar6;
            bVar2 = bVar2;
            str = str;
            th = null;
        }
        if (C2061Te0.A.c(i4).booleanValue()) {
            int i12 = (proto.g & UserVerificationMethods.USER_VERIFY_NONE) == 512 ? proto.u : number;
            boolean zF12 = C1742Pc.f(aVar, i12, str);
            boolean zF13 = C1742Pc.f(aVar2, i12, str);
            boolean zF14 = C1742Pc.f(aVar6, i12, str);
            EnumC0804Dc enumC0804Dc2 = EnumC0804Dc.h;
            oy0 = this;
            InterfaceC2396Xc interfaceC2396XcB3 = oy0.b(proto, i12, enumC0804Dc2);
            if (zF12) {
                C1687Oj1 c1687Oj1 = new C1687Oj1(c2850b00, interfaceC2396XcB3, C7047uk1.a((EnumC3009bk1) bVar2.c(i12)), C7257vk1.a((EnumC5788ok1) bVar.c(i12)), !zF12, zF13, zF14, c2850b00.h(), null, aVar7);
                C6582sZ c6582sZ3 = c6582sZA;
                Xc2 xc2 = (Xc2) CollectionsKt.U(c6582sZ3.a(c1687Oj1, C5653o60.d, c6582sZ3.b, c6582sZ3.d, c6582sZ3.e, c6582sZ3.f).i.g(VE.c(proto.s), proto, enumC0804Dc2));
                if (xc2 == null) {
                    C1687Oj1.G0(6);
                    throw th;
                }
                c1687Oj1.q = xc2;
                r12 = c1687Oj1;
            } else {
                C1687Oj1 c1687Oj1D = JY.d(c2850b00, interfaceC2396XcB3);
                Intrinsics.checkNotNull(c1687Oj1D);
                r12 = c1687Oj1D;
            }
        } else {
            oy0 = this;
            r12 = th;
        }
        if (C2061Te0.D.c(i4).booleanValue()) {
            c2850b00.U0(th, new HY0(oy0, proto, c2850b00));
        }
        InterfaceC4675jU interfaceC4675jU3 = c6582sZ2.c;
        FC fc2 = interfaceC4675jU3 instanceof FC ? (FC) interfaceC4675jU3 : null;
        if ((fc2 != null ? fc2.h() : null) == SC.i) {
            c2850b00.U0(null, new IY0(oy0, proto, c2850b00));
        }
        c2850b00.Y0(c0983Fj1, r12, new C6384rc0(oy0.c(proto, false), c2850b00), new C6384rc0(oy0.c(proto, z), c2850b00));
        return c2850b00;
    }

    public final List g(List list, AbstractC0673Bk0.c cVar, EnumC0804Dc enumC0804Dc) {
        OY0 oy0 = this;
        C6582sZ c6582sZ = oy0.a;
        InterfaceC4675jU interfaceC4675jU = c6582sZ.c;
        Intrinsics.c(interfaceC4675jU, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC1335Jx interfaceC1335Jx = (InterfaceC1335Jx) interfaceC4675jU;
        InterfaceC4675jU interfaceC4675jUE = interfaceC1335Jx.e();
        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
        AbstractC6208qk1 abstractC6208qk1A = oy0.a(interfaceC4675jUE);
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            AbstractC4649jL0 abstractC4649jL0G = null;
            if (i < 0) {
                WE.l();
                throw null;
            }
            C5155lk1 c5155lk1 = (C5155lk1) obj;
            int i3 = (c5155lk1.g & 1) == 1 ? c5155lk1.h : 0;
            InterfaceC2396Xc a51 = (abstractC6208qk1A == null || !C2061Te0.c.c(i3).booleanValue()) ? InterfaceC2396Xc.a.a : new A51(c6582sZ.a.a, new MY0(oy0, abstractC6208qk1A, cVar, enumC0804Dc, i, c5155lk1));
            C5638o21 c5638o21B = C6267r21.b(c6582sZ.b, c5155lk1.i);
            C2656a72 typeTable = c6582sZ.d;
            C4267hk1 c4267hk1E = C7888yk1.e(c5155lk1, typeTable);
            C7334w62 c7334w62 = c6582sZ.h;
            AbstractC4649jL0 abstractC4649jL0G2 = c7334w62.g(c4267hk1E);
            boolean zF = C1742Pc.f(C2061Te0.H, i3, "get(...)");
            boolean zF2 = C1742Pc.f(C2061Te0.I, i3, "get(...)");
            Boolean boolC = C2061Te0.J.c(i3);
            Intrinsics.checkNotNullExpressionValue(boolC, "get(...)");
            boolean zBooleanValue = boolC.booleanValue();
            Intrinsics.checkNotNullParameter(c5155lk1, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            int i4 = c5155lk1.g;
            C4267hk1 c4267hk1A = (i4 & 16) == 16 ? c5155lk1.l : (i4 & 32) == 32 ? typeTable.a(c5155lk1.m) : null;
            if (c4267hk1A != null) {
                abstractC4649jL0G = c7334w62.g(c4267hk1A);
            }
            VN1.a NO_SOURCE = VN1.a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Yc2(interfaceC1335Jx, null, i, a51, c5638o21B, abstractC4649jL0G2, zF, zF2, zBooleanValue, abstractC4649jL0G, NO_SOURCE));
            arrayList = arrayList2;
            i = i2;
            oy0 = this;
        }
        return CollectionsKt.e0(arrayList);
    }
}
