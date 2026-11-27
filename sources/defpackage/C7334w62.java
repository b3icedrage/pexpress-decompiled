package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7334w62 {

    @NotNull
    public final C6582sZ a;

    @Nullable
    public final C7334w62 b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final VY0 e;

    @NotNull
    public final VY0 f;

    @NotNull
    public final Object g;

    /* JADX INFO: renamed from: w62$a */
    public /* synthetic */ class a extends AbstractC1295Jj1 {
        public static final a l = new a();

        @Override // defpackage.LJ0
        public final Object get(Object obj) {
            return ((QC) obj).e();
        }

        @Override // defpackage.AbstractC1568Mx, defpackage.JI0
        public final String getName() {
            return "outerClassId";
        }

        @Override // defpackage.AbstractC1568Mx
        public final InterfaceC5486nJ0 j() {
            return C2017Sp1.a.b(QC.class);
        }

        @Override // defpackage.AbstractC1568Mx
        public final String o() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public C7334w62(@NotNull C6582sZ c, @Nullable C7334w62 c7334w62, @NotNull List<C4735jk1> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.a = c;
        this.b = c7334w62;
        this.c = debugName;
        this.d = containerPresentableName;
        this.e = c.a.a.f(new TZ(this, 2));
        this.f = c.a.a.f(new Q(this, 6));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = PW0.c();
        } else {
            linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (C4735jk1 c4735jk1 : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(c4735jk1.h), new C3688f00(this.a, c4735jk1, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static AbstractC5706oM1 a(AbstractC5706oM1 abstractC5706oM1, AbstractC4649jL0 abstractC4649jL0) {
        RK0 rk0L = C0564Aa.l(abstractC5706oM1);
        InterfaceC2396Xc interfaceC2396XcK = abstractC5706oM1.k();
        AbstractC4649jL0 abstractC4649jL0F = C3427dk0.f(abstractC5706oM1);
        List<AbstractC4649jL0> listD = C3427dk0.d(abstractC5706oM1);
        List listB = CollectionsKt.B(C3427dk0.g(abstractC5706oM1));
        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((N62) it.next()).getType());
        }
        return C3427dk0.b(rk0L, interfaceC2396XcK, abstractC4649jL0F, listD, arrayList, abstractC4649jL0, true).Z0(abstractC5706oM1.W0());
    }

    public static final ArrayList e(C4267hk1 c4267hk1, C7334w62 c7334w62) {
        List<C4267hk1.b> list = c4267hk1.h;
        Intrinsics.checkNotNullExpressionValue(list, "getArgumentList(...)");
        C4267hk1 c4267hk1A = C7888yk1.a(c4267hk1, c7334w62.a.d);
        Iterable iterableE = c4267hk1A != null ? e(c4267hk1A, c7334w62) : null;
        if (iterableE == null) {
            iterableE = C5653o60.d;
        }
        return CollectionsKt.Q(list, iterableE);
    }

    public static C5655o62 f(List list, InterfaceC2396Xc interfaceC2396Xc, InterfaceC6494s62 interfaceC6494s62, InterfaceC4675jU interfaceC4675jU) {
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5235m62) it.next()).a(interfaceC2396Xc));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2904bF.o(arrayList2, (Iterable) it2.next());
        }
        C5655o62.e.getClass();
        return C5655o62.a.a(arrayList2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final FC h(C7334w62 c7334w62, C4267hk1 c4267hk1, int i) {
        QC qcA = C6267r21.a(c7334w62.a.b, i);
        C42 c42M = JH1.m(FH1.e(c4267hk1, new C4460ig1(c7334w62, 1)), C7928yx.i);
        Intrinsics.checkNotNullParameter(c42M, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(c42M, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = c42M.a.iterator();
        while (it.hasNext()) {
            destination.add(c42M.b.invoke((T) it.next()));
        }
        int iF = JH1.f(FH1.e(qcA, a.l));
        while (destination.size() < iF) {
            destination.add(0);
        }
        return c7334w62.a.a.l.a(qcA, destination);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public final List<H62> b() {
        return CollectionsKt.e0(this.g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final H62 c(int i) {
        H62 h62 = (H62) this.g.get(Integer.valueOf(i));
        if (h62 != null) {
            return h62;
        }
        C7334w62 c7334w62 = this.b;
        if (c7334w62 != null) {
            return c7334w62.c(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x030c  */
    /* JADX WARN: Code duplicated, block: B:116:0x031a  */
    /* JADX WARN: Code duplicated, block: B:118:0x032b  */
    /* JADX WARN: Code duplicated, block: B:120:0x032e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0331  */
    /* JADX WARN: Code duplicated, block: B:124:0x0352  */
    /* JADX WARN: Code duplicated, block: B:126:0x0369  */
    /* JADX WARN: Code duplicated, block: B:127:0x036e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0378  */
    /* JADX WARN: Code duplicated, block: B:138:0x0395  */
    /* JADX WARN: Code duplicated, block: B:139:0x039a  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:162:0x0400  */
    /* JADX WARN: Code duplicated, block: B:164:0x0417  */
    /* JADX WARN: Code duplicated, block: B:166:0x041e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0420  */
    /* JADX WARN: Code duplicated, block: B:171:0x044b  */
    /* JADX WARN: Code duplicated, block: B:172:0x044e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0453  */
    /* JADX WARN: Code duplicated, block: B:175:0x045a  */
    /* JADX WARN: Code duplicated, block: B:177:0x045d  */
    /* JADX WARN: Code duplicated, block: B:182:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x017b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x0206  */
    /* JADX WARN: Code duplicated, block: B:85:0x020c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c  */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x0420, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01d8, please report this as an issue */
    @NotNull
    public final AbstractC5706oM1 d(@NotNull C4267hk1 proto, boolean z) {
        InterfaceC6494s62 typeConstructor;
        InterfaceC5044lD interfaceC5044lDH;
        Object next;
        C6163qZ c6163qZ;
        C5655o62 c5655o62F;
        int i;
        ArrayList arrayList;
        Iterator it;
        int i2;
        boolean zHasNext;
        C2656a72 typeTable;
        int i3;
        C5655o62 c5655o62;
        List arguments;
        C4267hk1 c4267hk1;
        AbstractC5706oM1 abstractC5706oM1C;
        BW bwA;
        boolean z2;
        int size;
        AbstractC5706oM1 abstractC5706oM1C2;
        InterfaceC5044lD interfaceC5044lDC;
        AbstractC3008bk0 abstractC3008bk0E;
        N62 n62;
        AbstractC4649jL0 type;
        InterfaceC5044lD interfaceC5044lDC2;
        C1758Ph0 c1758Ph0G;
        AbstractC5706oM1 abstractC5706oM1A;
        int size2;
        int i4;
        C4267hk1 c4267hk1A;
        AbstractC5706oM1 abstractC5706oM1C3;
        Object next2;
        int i5;
        C4267hk1.b bVar;
        H62 h62;
        C4267hk1.b.c projection;
        int iOrdinal;
        EnumC3610ed2 enumC3610ed2;
        int i6;
        int i7;
        C4267hk1 c4267hk1A2;
        InterfaceC4812k62 p62;
        int i8 = 1;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int i9 = proto.g;
        boolean z3 = (i9 & 16) == 16;
        C6582sZ c6582sZ = this.a;
        if (z3) {
            if (C6267r21.a(c6582sZ.b, proto.m).c) {
                c6582sZ.a.g.getClass();
            }
        } else if ((i9 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            if (C6267r21.a(c6582sZ.b, proto.p).c) {
                c6582sZ.a.g.getClass();
            }
        }
        int i10 = proto.g;
        if ((i10 & 16) == 16) {
            interfaceC5044lDH = (InterfaceC5044lD) this.e.invoke(Integer.valueOf(proto.m));
            if (interfaceC5044lDH == null) {
                interfaceC5044lDH = h(this, proto, proto.m);
            }
        } else {
            if ((i10 & 32) == 32) {
                interfaceC5044lDH = c(proto.n);
                if (interfaceC5044lDH == null) {
                    R70 r70 = R70.a;
                    typeConstructor = R70.d(Q70.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.n), this.d);
                }
            } else if ((i10 & 64) == 64) {
                String string = c6582sZ.b.getString(proto.o);
                Iterator<T> it2 = b().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.a(((H62) next).getName().e(), string));
                H62 h63 = (H62) next;
                if (h63 == null) {
                    R70 r71 = R70.a;
                    typeConstructor = R70.d(Q70.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, c6582sZ.c.toString());
                } else {
                    interfaceC5044lDH = h63;
                }
            } else if ((i10 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                interfaceC5044lDH = (InterfaceC5044lD) this.f.invoke(Integer.valueOf(proto.p));
                if (interfaceC5044lDH == null) {
                    interfaceC5044lDH = h(this, proto, proto.p);
                }
            } else {
                R70 r72 = R70.a;
                typeConstructor = R70.d(Q70.UNKNOWN_TYPE, new String[0]);
            }
            if (R70.f(typeConstructor.c())) {
                R70 r73 = R70.a;
                Q70 kind = Q70.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
                String[] formatParams = {typeConstructor.toString()};
                Intrinsics.checkNotNullParameter(kind, "kind");
                Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
                Intrinsics.checkNotNullParameter(formatParams, "formatParams");
                return R70.e(kind, C5653o60.d, typeConstructor, (String[]) Arrays.copyOf(formatParams, 1));
            }
            C6792tZ c6792tZ = new C6792tZ(c6582sZ.a.a, new UZ(i8, this, proto));
            c6163qZ = c6582sZ.a;
            List<InterfaceC5235m62> list = c6163qZ.r;
            InterfaceC4675jU interfaceC4675jU = c6582sZ.c;
            c5655o62F = f(list, c6792tZ, typeConstructor, interfaceC4675jU);
            ArrayList arrayListE = e(proto, this);
            i = 4;
            arrayList = new ArrayList(XE.m(arrayListE, 10));
            it = arrayListE.iterator();
            i2 = 0;
            while (true) {
                zHasNext = it.hasNext();
                typeTable = c6582sZ.d;
                i3 = i8;
                if (zHasNext) {
                    c5655o62 = c5655o62F;
                    arguments = CollectionsKt.e0(arrayList);
                    InterfaceC5044lD interfaceC5044lDC3 = typeConstructor.c();
                    if (z || !(interfaceC5044lDC3 instanceof InterfaceC3714f62)) {
                        if (C2061Te0.a.c(proto.u).booleanValue()) {
                            z2 = proto.i;
                            size = typeConstructor.b().size() - arguments.size();
                            if (size == 0) {
                                abstractC5706oM1C2 = C5492nL0.c(c5655o62, typeConstructor, arguments, z2, null);
                                Intrinsics.checkNotNullParameter(abstractC5706oM1C2, "<this>");
                                Intrinsics.checkNotNullParameter(abstractC5706oM1C2, "<this>");
                                interfaceC5044lDC = abstractC5706oM1C2.V0().c();
                                if (interfaceC5044lDC != null) {
                                    abstractC3008bk0E = C3427dk0.e(interfaceC5044lDC);
                                } else {
                                    abstractC3008bk0E = null;
                                }
                                if (Intrinsics.a(abstractC3008bk0E, AbstractC3008bk0.a.c) || (n62 = (N62) CollectionsKt.N(C3427dk0.g(abstractC5706oM1C2))) == null || (type = n62.getType()) == null) {
                                    abstractC5706oM1A = null;
                                } else {
                                    interfaceC5044lDC2 = type.V0().c();
                                    if (interfaceC5044lDC2 != null) {
                                        c1758Ph0G = C4900kZ.g(interfaceC5044lDC2);
                                    } else {
                                        c1758Ph0G = null;
                                    }
                                    if (type.T0().size() == 1 || !(Intrinsics.a(c1758Ph0G, C4194hP1.g) || Intrinsics.a(c1758Ph0G, C7545x62.a))) {
                                        abstractC5706oM1A = abstractC5706oM1C2;
                                    } else {
                                        AbstractC4649jL0 type2 = ((N62) CollectionsKt.U(type.T0())).getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                        InterfaceC1335Jx interfaceC1335Jx = interfaceC4675jU instanceof InterfaceC1335Jx ? (InterfaceC1335Jx) interfaceC4675jU : null;
                                        abstractC5706oM1A = Intrinsics.a(interfaceC1335Jx != null ? C4900kZ.c(interfaceC1335Jx) : null, C7836yW1.a) ? a(abstractC5706oM1C2, type2) : a(abstractC5706oM1C2, type2);
                                    }
                                }
                            } else if (size != 1 && (size2 = arguments.size() - 1) >= 0) {
                                InterfaceC6494s62 interfaceC6494s62P = typeConstructor.t().v(size2).p();
                                Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
                                abstractC5706oM1A = C5492nL0.c(c5655o62, interfaceC6494s62P, arguments, z2, null);
                            } else {
                                abstractC5706oM1A = null;
                            }
                            if (abstractC5706oM1A == null) {
                                R70 r74 = R70.a;
                                abstractC5706oM1C = R70.e(Q70.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                            } else {
                                abstractC5706oM1C = abstractC5706oM1A;
                            }
                        } else {
                            c4267hk1 = null;
                            abstractC5706oM1C = C5492nL0.c(c5655o62, typeConstructor, arguments, proto.i, null);
                            if (C2061Te0.b.c(proto.u).booleanValue()) {
                                bwA = BW.a.a(abstractC5706oM1C, true);
                                if (bwA == null) {
                                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC5706oM1C + '\'').toString());
                                }
                                abstractC5706oM1C = bwA;
                            }
                        }
                        Intrinsics.checkNotNullParameter(proto, "<this>");
                        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                        i4 = proto.g;
                        if ((i4 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                            c4267hk1A = proto.s;
                        } else if ((i4 & 2048) == 2048) {
                            c4267hk1A = typeTable.a(proto.t);
                        } else {
                            c4267hk1A = c4267hk1;
                        }
                        return (c4267hk1A != null || (abstractC5706oM1C3 = C6971uO1.c(abstractC5706oM1C, d(c4267hk1A, false))) == null) ? abstractC5706oM1C : abstractC5706oM1C3;
                    }
                    InterfaceC3714f62 typeAliasDescriptor = (InterfaceC3714f62) interfaceC5044lDC3;
                    Intrinsics.checkNotNullParameter(typeAliasDescriptor, "<this>");
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    C3924g62 c3924g62 = new C3924g62();
                    Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    List<H62> listB = typeAliasDescriptor.p().b();
                    Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                    ArrayList arrayList2 = new ArrayList(XE.m(listB, 10));
                    Iterator<T> it3 = listB.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((H62) it3.next()).U0());
                    }
                    C4134h62 typeAliasExpansion = new C4134h62(null, typeAliasDescriptor, arguments, PW0.j(CollectionsKt.j0(arrayList2, arguments)));
                    C5655o62.e.getClass();
                    C5655o62 attributes = C5655o62.g;
                    Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
                    Intrinsics.checkNotNullParameter(attributes, "attributes");
                    AbstractC5706oM1 abstractC5706oM1C4 = c3924g62.c(typeAliasExpansion, attributes, false, 0, true);
                    List<InterfaceC5235m62> list2 = c6163qZ.r;
                    ArrayList annotations = CollectionsKt.O(c6792tZ, abstractC5706oM1C4.k());
                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                    C5655o62 c5655o62F2 = f(list2, annotations.isEmpty() ? InterfaceC2396Xc.a.a : new C2552Zc(annotations), typeConstructor, interfaceC4675jU);
                    Intrinsics.checkNotNullParameter(abstractC5706oM1C4, "<this>");
                    abstractC5706oM1C = abstractC5706oM1C4.Z0(C3089c72.e(abstractC5706oM1C4) || proto.i).b1(c5655o62F2);
                    c4267hk1 = null;
                    Intrinsics.checkNotNullParameter(proto, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                    i4 = proto.g;
                    if ((i4 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                        c4267hk1A = proto.s;
                    } else if ((i4 & 2048) == 2048) {
                        c4267hk1A = typeTable.a(proto.t);
                    } else {
                        c4267hk1A = c4267hk1;
                    }
                    if (c4267hk1A != null) {
                    }
                }
                next2 = it.next();
                i5 = i2 + 1;
                if (i2 >= 0) {
                    WE.l();
                    throw null;
                }
                Iterator it4 = it;
                bVar = (C4267hk1.b) next2;
                C6582sZ c6582sZ2 = c6582sZ;
                List<H62> listB2 = typeConstructor.b();
                Intrinsics.checkNotNullExpressionValue(listB2, "getParameters(...)");
                h62 = (H62) CollectionsKt.H(i2, listB2);
                projection = bVar.g;
                C5655o62 c5655o63 = c5655o62F;
                if (projection == C4267hk1.b.c.STAR) {
                    if (h62 == null) {
                        p62 = new C4404iP1(c6163qZ.b.t());
                    } else {
                        p62 = new C4662jP1(h62);
                    }
                    i7 = i;
                } else {
                    Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
                    Intrinsics.checkNotNullParameter(projection, "projection");
                    iOrdinal = projection.ordinal();
                    if (iOrdinal != 0) {
                        enumC3610ed2 = EnumC3610ed2.IN_VARIANCE;
                    } else if (iOrdinal != i3) {
                        enumC3610ed2 = EnumC3610ed2.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new C6489s51();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                        }
                        enumC3610ed2 = EnumC3610ed2.INVARIANT;
                    }
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                    i6 = bVar.e;
                    if ((i6 & 2) == 2) {
                        c4267hk1A2 = bVar.h;
                        i7 = i;
                    } else {
                        i7 = i;
                        if ((i6 & 4) == i7) {
                            c4267hk1A2 = typeTable.a(bVar.i);
                        } else {
                            c4267hk1A2 = null;
                        }
                    }
                    if (c4267hk1A2 == null) {
                        p62 = new P62(R70.c(Q70.NO_RECORDED_TYPE, bVar.toString()));
                    } else {
                        p62 = new P62(g(c4267hk1A2), enumC3610ed2);
                    }
                }
                arrayList.add(p62);
                i = i7;
                c6582sZ = c6582sZ2;
                i2 = i5;
                it = it4;
                c5655o62F = c5655o63;
                i8 = 1;
            }
        }
        typeConstructor = interfaceC5044lDH.p();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        if (R70.f(typeConstructor.c())) {
            R70 r75 = R70.a;
            Q70 kind2 = Q70.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
            String[] formatParams2 = {typeConstructor.toString()};
            Intrinsics.checkNotNullParameter(kind2, "kind");
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
            return R70.e(kind2, C5653o60.d, typeConstructor, (String[]) Arrays.copyOf(formatParams2, 1));
        }
        C6792tZ c6792tZ2 = new C6792tZ(c6582sZ.a.a, new UZ(i8, this, proto));
        c6163qZ = c6582sZ.a;
        List<InterfaceC5235m62> list3 = c6163qZ.r;
        InterfaceC4675jU interfaceC4675jU2 = c6582sZ.c;
        c5655o62F = f(list3, c6792tZ2, typeConstructor, interfaceC4675jU2);
        ArrayList arrayListE2 = e(proto, this);
        i = 4;
        arrayList = new ArrayList(XE.m(arrayListE2, 10));
        it = arrayListE2.iterator();
        i2 = 0;
        while (true) {
            zHasNext = it.hasNext();
            typeTable = c6582sZ.d;
            i3 = i8;
            if (zHasNext) {
                c5655o62 = c5655o62F;
                arguments = CollectionsKt.e0(arrayList);
                InterfaceC5044lD interfaceC5044lDC4 = typeConstructor.c();
                if (z) {
                    if (C2061Te0.a.c(proto.u).booleanValue()) {
                        z2 = proto.i;
                        size = typeConstructor.b().size() - arguments.size();
                        if (size == 0) {
                            abstractC5706oM1C2 = C5492nL0.c(c5655o62, typeConstructor, arguments, z2, null);
                            Intrinsics.checkNotNullParameter(abstractC5706oM1C2, "<this>");
                            Intrinsics.checkNotNullParameter(abstractC5706oM1C2, "<this>");
                            interfaceC5044lDC = abstractC5706oM1C2.V0().c();
                            if (interfaceC5044lDC != null) {
                                abstractC3008bk0E = C3427dk0.e(interfaceC5044lDC);
                            } else {
                                abstractC3008bk0E = null;
                            }
                            if (Intrinsics.a(abstractC3008bk0E, AbstractC3008bk0.a.c)) {
                                abstractC5706oM1A = null;
                            } else {
                                interfaceC5044lDC2 = type.V0().c();
                                if (interfaceC5044lDC2 != null) {
                                    c1758Ph0G = C4900kZ.g(interfaceC5044lDC2);
                                } else {
                                    c1758Ph0G = null;
                                }
                                if (type.T0().size() == 1) {
                                    abstractC5706oM1A = abstractC5706oM1C2;
                                } else {
                                    abstractC5706oM1A = abstractC5706oM1C2;
                                }
                            }
                        } else if (size != 1) {
                            abstractC5706oM1A = null;
                        } else {
                            InterfaceC6494s62 interfaceC6494s62P2 = typeConstructor.t().v(size2).p();
                            Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P2, "getTypeConstructor(...)");
                            abstractC5706oM1A = C5492nL0.c(c5655o62, interfaceC6494s62P2, arguments, z2, null);
                        }
                        if (abstractC5706oM1A == null) {
                            R70 r76 = R70.a;
                            abstractC5706oM1C = R70.e(Q70.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                        } else {
                            abstractC5706oM1C = abstractC5706oM1A;
                        }
                        c4267hk1 = null;
                    } else {
                        c4267hk1 = null;
                        abstractC5706oM1C = C5492nL0.c(c5655o62, typeConstructor, arguments, proto.i, null);
                        if (C2061Te0.b.c(proto.u).booleanValue()) {
                            bwA = BW.a.a(abstractC5706oM1C, true);
                            if (bwA == null) {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC5706oM1C + '\'').toString());
                            }
                            abstractC5706oM1C = bwA;
                        }
                    }
                } else if (C2061Te0.a.c(proto.u).booleanValue()) {
                    z2 = proto.i;
                    size = typeConstructor.b().size() - arguments.size();
                    if (size == 0) {
                        abstractC5706oM1C2 = C5492nL0.c(c5655o62, typeConstructor, arguments, z2, null);
                        Intrinsics.checkNotNullParameter(abstractC5706oM1C2, "<this>");
                        Intrinsics.checkNotNullParameter(abstractC5706oM1C2, "<this>");
                        interfaceC5044lDC = abstractC5706oM1C2.V0().c();
                        if (interfaceC5044lDC != null) {
                            abstractC3008bk0E = C3427dk0.e(interfaceC5044lDC);
                        } else {
                            abstractC3008bk0E = null;
                        }
                        if (Intrinsics.a(abstractC3008bk0E, AbstractC3008bk0.a.c)) {
                            abstractC5706oM1A = null;
                        } else {
                            interfaceC5044lDC2 = type.V0().c();
                            if (interfaceC5044lDC2 != null) {
                                c1758Ph0G = C4900kZ.g(interfaceC5044lDC2);
                            } else {
                                c1758Ph0G = null;
                            }
                            if (type.T0().size() == 1) {
                                abstractC5706oM1A = abstractC5706oM1C2;
                            } else {
                                abstractC5706oM1A = abstractC5706oM1C2;
                            }
                        }
                    } else if (size != 1) {
                        abstractC5706oM1A = null;
                    } else {
                        InterfaceC6494s62 interfaceC6494s62P3 = typeConstructor.t().v(size2).p();
                        Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P3, "getTypeConstructor(...)");
                        abstractC5706oM1A = C5492nL0.c(c5655o62, interfaceC6494s62P3, arguments, z2, null);
                    }
                    if (abstractC5706oM1A == null) {
                        R70 r77 = R70.a;
                        abstractC5706oM1C = R70.e(Q70.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                    } else {
                        abstractC5706oM1C = abstractC5706oM1A;
                    }
                    c4267hk1 = null;
                } else {
                    c4267hk1 = null;
                    abstractC5706oM1C = C5492nL0.c(c5655o62, typeConstructor, arguments, proto.i, null);
                    if (C2061Te0.b.c(proto.u).booleanValue()) {
                        bwA = BW.a.a(abstractC5706oM1C, true);
                        if (bwA == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC5706oM1C + '\'').toString());
                        }
                        abstractC5706oM1C = bwA;
                    }
                }
                Intrinsics.checkNotNullParameter(proto, "<this>");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                i4 = proto.g;
                if ((i4 & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                    c4267hk1A = proto.s;
                } else if ((i4 & 2048) == 2048) {
                    c4267hk1A = typeTable.a(proto.t);
                } else {
                    c4267hk1A = c4267hk1;
                }
                if (c4267hk1A != null) {
                }
            }
            next2 = it.next();
            i5 = i2 + 1;
            if (i2 >= 0) {
                WE.l();
                throw null;
            }
            Iterator it5 = it;
            bVar = (C4267hk1.b) next2;
            C6582sZ c6582sZ3 = c6582sZ;
            List<H62> listB3 = typeConstructor.b();
            Intrinsics.checkNotNullExpressionValue(listB3, "getParameters(...)");
            h62 = (H62) CollectionsKt.H(i2, listB3);
            projection = bVar.g;
            C5655o62 c5655o64 = c5655o62F;
            if (projection == C4267hk1.b.c.STAR) {
                if (h62 == null) {
                    p62 = new C4404iP1(c6163qZ.b.t());
                } else {
                    p62 = new C4662jP1(h62);
                }
                i7 = i;
            } else {
                Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
                Intrinsics.checkNotNullParameter(projection, "projection");
                iOrdinal = projection.ordinal();
                if (iOrdinal != 0) {
                    enumC3610ed2 = EnumC3610ed2.IN_VARIANCE;
                } else if (iOrdinal != i3) {
                    enumC3610ed2 = EnumC3610ed2.OUT_VARIANCE;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new C6489s51();
                        }
                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                    }
                    enumC3610ed2 = EnumC3610ed2.INVARIANT;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                i6 = bVar.e;
                if ((i6 & 2) == 2) {
                    c4267hk1A2 = bVar.h;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i6 & 4) == i7) {
                        c4267hk1A2 = typeTable.a(bVar.i);
                    } else {
                        c4267hk1A2 = null;
                    }
                }
                if (c4267hk1A2 == null) {
                    p62 = new P62(R70.c(Q70.NO_RECORDED_TYPE, bVar.toString()));
                } else {
                    p62 = new P62(g(c4267hk1A2), enumC3610ed2);
                }
            }
            arrayList.add(p62);
            i = i7;
            c6582sZ = c6582sZ3;
            i2 = i5;
            it = it5;
            c5655o62F = c5655o64;
            i8 = 1;
        }
    }

    @NotNull
    public final AbstractC4649jL0 g(@NotNull C4267hk1 proto) {
        C4267hk1 c4267hk1A;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!((proto.g & 2) == 2)) {
            return d(proto, true);
        }
        C6582sZ c6582sZ = this.a;
        String string = c6582sZ.b.getString(proto.j);
        AbstractC5706oM1 abstractC5706oM1D = d(proto, true);
        C2656a72 typeTable = c6582sZ.d;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i = proto.g;
        if ((i & 4) == 4) {
            c4267hk1A = proto.k;
        } else {
            c4267hk1A = (i & 8) == 8 ? typeTable.a(proto.l) : null;
        }
        Intrinsics.checkNotNull(c4267hk1A);
        return c6582sZ.a.j.a(proto, string, abstractC5706oM1D, d(c4267hk1A, true));
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        C7334w62 c7334w62 = this.b;
        if (c7334w62 == null) {
            str = "";
        } else {
            str = ". Child of " + c7334w62.c;
        }
        sb.append(str);
        return sb.toString();
    }
}
