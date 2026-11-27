package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class GI0 {

    @NotNull
    public static final C1578Na0 a;

    static {
        C1578Na0 c1578Na0 = new C1578Na0();
        c1578Na0.a(FI0.a);
        c1578Na0.a(FI0.b);
        c1578Na0.a(FI0.c);
        c1578Na0.a(FI0.d);
        c1578Na0.a(FI0.e);
        c1578Na0.a(FI0.f);
        c1578Na0.a(FI0.g);
        c1578Na0.a(FI0.h);
        c1578Na0.a(FI0.i);
        c1578Na0.a(FI0.j);
        c1578Na0.a(FI0.k);
        c1578Na0.a(FI0.l);
        c1578Na0.a(FI0.m);
        c1578Na0.a(FI0.n);
        Intrinsics.checkNotNullExpressionValue(c1578Na0, "apply(...)");
        a = c1578Na0;
    }

    @Nullable
    public static AbstractC7583xI0.b a(@NotNull C2155Uj1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable) {
        String strJ;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        AbstractC0673Bk0.e<C2155Uj1, FI0.b> constructorSignature = FI0.a;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        FI0.b bVar = (FI0.b) C5998pk1.a(proto, constructorSignature);
        String string = (bVar == null || (bVar.e & 1) != 1) ? "<init>" : nameResolver.getString(bVar.g);
        if (bVar == null || (bVar.e & 2) != 2) {
            List<C5155lk1> list = proto.i;
            Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            for (C5155lk1 c5155lk1 : list) {
                Intrinsics.checkNotNull(c5155lk1);
                String strE = e(C7888yk1.e(c5155lk1, typeTable), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strJ = CollectionsKt.J(arrayList, "", "(", ")V", null, 56);
        } else {
            strJ = nameResolver.getString(bVar.h);
        }
        return new AbstractC7583xI0.b(string, strJ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @org.jetbrains.annotations.Nullable
    public static defpackage.AbstractC7583xI0.a b(@org.jetbrains.annotations.NotNull defpackage.C3637ek1 r4, @org.jetbrains.annotations.NotNull defpackage.InterfaceC5848p21 r5, @org.jetbrains.annotations.NotNull defpackage.C2656a72 r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            Bk0$e<ek1, FI0$c> r0 = defpackage.FI0.d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = defpackage.C5998pk1.a(r4, r0)
            FI0$c r0 = (FI0.c) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.e
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            FI0$a r0 = r0.g
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.e
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.g
            goto L3b
        L39:
            int r7 = r4.j
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.e
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.h
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            hk1 r4 = defpackage.C7888yk1.d(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            xI0$a r6 = new xI0$a
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GI0.b(ek1, p21, a72, boolean):xI0$a");
    }

    @Nullable
    public static AbstractC7583xI0.b c(@NotNull C2575Zj1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable) {
        String strB;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        AbstractC0673Bk0.e<C2575Zj1, FI0.b> methodSignature = FI0.b;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        FI0.b bVar = (FI0.b) C5998pk1.a(proto, methodSignature);
        int i = (bVar == null || (bVar.e & 1) != 1) ? proto.j : bVar.g;
        if (bVar == null || (bVar.e & 2) != 2) {
            List listG = WE.g(C7888yk1.b(proto, typeTable));
            List<C5155lk1> list = proto.s;
            Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            for (C5155lk1 c5155lk1 : list) {
                Intrinsics.checkNotNull(c5155lk1);
                arrayList.add(C7888yk1.e(c5155lk1, typeTable));
            }
            ArrayList arrayListQ = CollectionsKt.Q(listG, arrayList);
            ArrayList arrayList2 = new ArrayList(XE.m(arrayListQ, 10));
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                String strE = e((C4267hk1) it.next(), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(C7888yk1.c(proto, typeTable), nameResolver);
            if (strE2 == null) {
                return null;
            }
            strB = C5807oq.b(new StringBuilder(), CollectionsKt.J(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strB = nameResolver.getString(bVar.h);
        }
        return new AbstractC7583xI0.b(nameResolver.getString(i), strB);
    }

    public static final boolean d(@NotNull C3637ek1 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        C2061Te0.a aVar = C7162vI0.a;
        Object objK = proto.k(FI0.e);
        Intrinsics.checkNotNullExpressionValue(objK, "getExtension(...)");
        Boolean boolC = aVar.c(((Number) objK).intValue());
        Intrinsics.checkNotNullExpressionValue(boolC, "get(...)");
        return boolC.booleanValue();
    }

    public static String e(C4267hk1 c4267hk1, InterfaceC5848p21 interfaceC5848p21) {
        if ((c4267hk1.g & 16) == 16) {
            return UC.b(interfaceC5848p21.a(c4267hk1.m));
        }
        return null;
    }

    @NotNull
    public static final Pair<C8003zI0, C2077Tj1> f(@NotNull String[] data, @NotNull String[] strings) throws C7144vC0 {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = C6233qs.a(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        C8003zI0 c8003zI0G = g(byteArrayInputStream, strings);
        C2077Tj1.a aVar = C2077Tj1.O;
        aVar.getClass();
        EE ee = new EE(byteArrayInputStream);
        HZ0 hz0 = (HZ0) aVar.a(ee, a);
        try {
            ee.a(0);
            Q0.b(hz0);
            return new Pair<>(c8003zI0G, (C2077Tj1) hz0);
        } catch (C7144vC0 e) {
            e.d = hz0;
            throw e;
        }
    }

    public static C8003zI0 g(ByteArrayInputStream byteArrayInputStream, String[] strings) {
        Set setH0;
        FI0.d types = (FI0.d) FI0.d.l.c(byteArrayInputStream, a);
        Intrinsics.checkNotNullExpressionValue(types, "parseDelimitedFrom(...)");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List<Integer> list = types.g;
        if (list.isEmpty()) {
            setH0 = C6702t60.d;
        } else {
            Intrinsics.checkNotNull(list);
            setH0 = CollectionsKt.h0(list);
        }
        List<FI0.d.c> list2 = types.e;
        Intrinsics.checkNotNullExpressionValue(list2, "getRecordList(...)");
        Intrinsics.checkNotNullParameter(list2, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (FI0.d.c cVar : list2) {
            int i = cVar.g;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return new C8003zI0(strings, setH0, arrayList);
    }

    @NotNull
    public static final Pair<C8003zI0, C3218ck1> h(@NotNull String[] data, @NotNull String[] strings) throws C7144vC0 {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = C6233qs.a(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        C8003zI0 c8003zI0G = g(byteArrayInputStream, strings);
        C3218ck1.a aVar = C3218ck1.p;
        aVar.getClass();
        EE ee = new EE(byteArrayInputStream);
        HZ0 hz0 = (HZ0) aVar.a(ee, a);
        try {
            ee.a(0);
            Q0.b(hz0);
            return new Pair<>(c8003zI0G, (C3218ck1) hz0);
        } catch (C7144vC0 e) {
            e.d = hz0;
            throw e;
        }
    }
}
