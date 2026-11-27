package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5842p1 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C5842p1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC7984zC interfaceC7984zCB;
        List list;
        C3504e62 c3504e62;
        C6286r70 c6286r70;
        EnumC4181hL0 enumC4181hL0;
        int i = 0;
        int i2 = 10;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                AbstractC6681t1 typeAliasDescriptor = (AbstractC6681t1) obj;
                typeAliasDescriptor.getClass();
                C3269d00 c3269d00 = (C3269d00) typeAliasDescriptor;
                FC fcX = c3269d00.x();
                if (fcX == null) {
                    return C5653o60.d;
                }
                Collection<InterfaceC7984zC> collectionR = fcX.r();
                Intrinsics.checkNotNullExpressionValue(collectionR, "getConstructors(...)");
                ArrayList arrayList = new ArrayList();
                for (InterfaceC7984zC constructor : collectionR) {
                    C3504e62.a aVar = C3504e62.M;
                    Intrinsics.checkNotNull(constructor);
                    aVar.getClass();
                    C2720aS0 storageManager = typeAliasDescriptor.i;
                    Intrinsics.checkNotNullParameter(storageManager, "storageManager");
                    Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
                    Intrinsics.checkNotNullParameter(constructor, "constructor");
                    X62 x62D = c3269d00.x() == null ? null : X62.d(c3269d00.b0());
                    if (x62D == null || (interfaceC7984zCB = constructor.b(x62D)) == null) {
                        c3504e62 = null;
                    } else {
                        InterfaceC2396Xc interfaceC2396XcK = constructor.k();
                        InterfaceC1490Lx.a aVarH = constructor.h();
                        Intrinsics.checkNotNullExpressionValue(aVarH, "getKind(...)");
                        VN1 vn1I = typeAliasDescriptor.i();
                        Intrinsics.checkNotNullExpressionValue(vn1I, "getSource(...)");
                        X62 x62 = x62D;
                        C3504e62 c3504e63 = new C3504e62(storageManager, typeAliasDescriptor, interfaceC7984zCB, null, interfaceC2396XcK, aVarH, vn1I);
                        List<Xc2> listJ = constructor.j();
                        if (listJ == null) {
                            AbstractC2314Wj0.G0(28);
                            throw null;
                        }
                        ArrayList arrayListX0 = AbstractC2314Wj0.X0(c3504e63, listJ, x62, false, false, null);
                        if (arrayListX0 == null) {
                            c3504e62 = null;
                        } else {
                            AbstractC5706oM1 abstractC5706oM1M = C6621sj.m(interfaceC7984zCB.n().Y0());
                            AbstractC5706oM1 abstractC5706oM1Y = c3269d00.y();
                            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
                            AbstractC5706oM1 abstractC5706oM1C = C6971uO1.c(abstractC5706oM1M, abstractC5706oM1Y);
                            InterfaceC1076Go1 interfaceC1076Go1M0 = constructor.m0();
                            InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
                            C1154Ho1 c1154Ho1H = interfaceC1076Go1M0 != null ? JY.h(c3504e63, x62.h(interfaceC1076Go1M0.getType(), EnumC3610ed2.INVARIANT), c0193a) : null;
                            FC fcX2 = c3269d00.x();
                            if (fcX2 != null) {
                                List<InterfaceC1076Go1> listW0 = constructor.w0();
                                Intrinsics.checkNotNullExpressionValue(listW0, "getContextReceiverParameters(...)");
                                ArrayList arrayList2 = new ArrayList(XE.m(listW0, i2));
                                int i3 = i;
                                for (Object obj2 : listW0) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        WE.l();
                                        throw null;
                                    }
                                    InterfaceC1076Go1 interfaceC1076Go1 = (InterfaceC1076Go1) obj2;
                                    AbstractC4649jL0 abstractC4649jL0H = x62.h(interfaceC1076Go1.getType(), EnumC3610ed2.INVARIANT);
                                    InterfaceC1232Io1 value = interfaceC1076Go1.getValue();
                                    Intrinsics.c(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                    arrayList2.add(new C1154Ho1(fcX2, new C6124qM(fcX2, abstractC4649jL0H, ((InterfaceC1488Lw0) value).a()), c0193a, C6477s21.a(i3)));
                                    i3 = i4;
                                }
                                list = arrayList2;
                            } else {
                                list = C5653o60.d;
                            }
                            c3504e63.Y0(c1154Ho1H, null, list, typeAliasDescriptor.A(), arrayListX0, abstractC5706oM1C, C01.e, typeAliasDescriptor.j);
                            c3504e62 = c3504e63;
                        }
                    }
                    if (c3504e62 != null) {
                        arrayList.add(c3504e62);
                    }
                    i = 0;
                    i2 = 10;
                }
                return arrayList;
            case 1:
                FZ fz = (FZ) obj;
                List<C2155Uj1> list2 = fz.i.t;
                Intrinsics.checkNotNullExpressionValue(list2, "getConstructorList(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (C1742Pc.f(C2061Te0.n, ((C2155Uj1) obj3).h, "get(...)")) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(XE.m(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C6582sZ c6582sZ = fz.p;
                    if (!zHasNext) {
                        return CollectionsKt.Q(CollectionsKt.Q(arrayList4, WE.g(fz.X())), c6582sZ.a.n.e(fz));
                    }
                    C2155Uj1 c2155Uj1 = (C2155Uj1) it.next();
                    OY0 oy0 = c6582sZ.i;
                    Intrinsics.checkNotNull(c2155Uj1);
                    arrayList4.add(oy0.d(c2155Uj1, false));
                }
                break;
            case 2:
                Object obj4 = XD0.a;
                RD0 rd0 = ((LE0) obj).d;
                InterfaceC6310rE0 interfaceC6310rE0 = rd0 instanceof InterfaceC6310rE0 ? (InterfaceC6310rE0) rd0 : null;
                if (interfaceC6310rE0 == null || (enumC4181hL0 = (EnumC4181hL0) XD0.b.get(interfaceC6310rE0.d().e())) == null) {
                    c6286r70 = null;
                } else {
                    C1758Ph0 topLevelFqName = C4194hP1.a.v;
                    Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                    C1758Ph0 c1758Ph0E = topLevelFqName.e();
                    QC qc = new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
                    C5638o21 c5638o21K = C5638o21.k(enumC4181hL0.name());
                    Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                    c6286r70 = new C6286r70(qc, c5638o21K);
                }
                Map mapB = c6286r70 != null ? OW0.b(new Pair(VD0.c, c6286r70)) : null;
                return mapB == null ? PW0.c() : mapB;
            case 3:
                return C7437wc2.d(((C3545eJ0.a) obj).b());
            case 4:
                return new NJ0.a((NJ0) obj);
            case 5:
                C5653o60 c5653o60B = ((GO0) obj).k.B();
                ArrayList arrayList5 = new ArrayList(XE.m(c5653o60B, 10));
                Iterator<E> it2 = c5653o60B.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((FE0) it2.next()).c());
                }
                return arrayList5;
            default:
                return ((T01) obj).A0(C4194hP1.i).v();
        }
    }
}
