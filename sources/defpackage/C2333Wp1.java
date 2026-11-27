package defpackage;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2333Wp1 extends C2251Vp1 {
    public static AbstractC5906pJ0 k(AbstractC1568Mx abstractC1568Mx) {
        InterfaceC5486nJ0 interfaceC5486nJ0J = abstractC1568Mx.j();
        return interfaceC5486nJ0J instanceof AbstractC5906pJ0 ? (AbstractC5906pJ0) interfaceC5486nJ0J : C3922g60.e;
    }

    @Override // defpackage.C2251Vp1
    public final InterfaceC6325rJ0 a(C2574Zj0 c2574Zj0) {
        AbstractC5906pJ0 container = k(c2574Zj0);
        String name = c2574Zj0.getName();
        String signature = c2574Zj0.o();
        Object objI = c2574Zj0.i();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new C6535sJ0(container, name, signature, null, objI);
    }

    @Override // defpackage.C2251Vp1
    public final RI0 b(Class cls) {
        return C0633Ax.a(cls);
    }

    @Override // defpackage.C2251Vp1
    public final InterfaceC5486nJ0 c(Class jClass, String str) {
        UH uh = C0633Ax.a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return (InterfaceC5486nJ0) C0633Ax.b.a(jClass);
    }

    @Override // defpackage.C2251Vp1
    public final InterfaceC7796yJ0 d(Z11 z11) {
        return new C8006zJ0(k(z11), z11.getName(), z11.o(), z11.i());
    }

    @Override // defpackage.C2251Vp1
    public final AJ0 e(AbstractC2859b21 abstractC2859b21) {
        return new BJ0(k(abstractC2859b21), abstractC2859b21.getName(), abstractC2859b21.o(), abstractC2859b21.i());
    }

    @Override // defpackage.C2251Vp1
    public final JJ0 f(AbstractC1139Hj1 abstractC1139Hj1) {
        return new KJ0(k(abstractC1139Hj1), abstractC1139Hj1.getName(), abstractC1139Hj1.o(), abstractC1139Hj1.i());
    }

    @Override // defpackage.C2251Vp1
    public final LJ0 g(AbstractC1295Jj1 abstractC1295Jj1) {
        return new MJ0(k(abstractC1295Jj1), abstractC1295Jj1.getName(), abstractC1295Jj1.o(), abstractC1295Jj1.i());
    }

    @Override // defpackage.C2251Vp1
    public final String h(InterfaceC1764Pj0 interfaceC1764Pj0) throws C7144vC0 {
        C6535sJ0 c6535sJ0B;
        Intrinsics.checkNotNullParameter(interfaceC1764Pj0, "<this>");
        Metadata metadata = (Metadata) interfaceC1764Pj0.getClass().getAnnotation(Metadata.class);
        C6535sJ0 c6535sJ0 = null;
        if (metadata != null) {
            String[] data = metadata.d1();
            if (data.length == 0) {
                data = null;
            }
            if (data != null) {
                String[] strings = metadata.d2();
                C1578Na0 c1578Na0 = GI0.a;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C6233qs.a(data));
                C1578Na0 c1578Na1 = GI0.a;
                C8003zI0 c8003zI0G = GI0.g(byteArrayInputStream, strings);
                C2575Zj1.a aVar = C2575Zj1.z;
                C1578Na0 c1578Na2 = GI0.a;
                aVar.getClass();
                EE ee = new EE(byteArrayInputStream);
                HZ0 hz0 = (HZ0) aVar.a(ee, c1578Na2);
                try {
                    ee.a(0);
                    Q0.b(hz0);
                    C2575Zj1 c2575Zj1 = (C2575Zj1) hz0;
                    C7793yI0 c7793yI0 = new C7793yI0(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = interfaceC1764Pj0.getClass();
                    C4945kk1 c4945kk1 = c2575Zj1.t;
                    Intrinsics.checkNotNullExpressionValue(c4945kk1, "getTypeTable(...)");
                    c6535sJ0 = new C6535sJ0(C3922g60.e, (InterfaceC3765fM1) C7437wc2.f(cls, c2575Zj1, c8003zI0G, new C2656a72(c4945kk1), c7793yI0, C1861Qp1.m));
                } catch (C7144vC0 e) {
                    e.d = hz0;
                    throw e;
                }
            }
        }
        if (c6535sJ0 == null || (c6535sJ0B = C7437wc2.b(c6535sJ0)) == null) {
            return super.h(interfaceC1764Pj0);
        }
        C2964bZ c2964bZ = C2593Zp1.a;
        InterfaceC2076Tj0 invoke = c6535sJ0B.o();
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb = new StringBuilder();
        C2593Zp1.a(invoke, sb);
        List<Xc2> listJ = invoke.j();
        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
        CollectionsKt.I(listJ, sb, ", ", "(", ")", C2515Yp1.e, 48);
        sb.append(" -> ");
        AbstractC4649jL0 abstractC4649jL0N = invoke.n();
        Intrinsics.checkNotNull(abstractC4649jL0N);
        sb.append(C2593Zp1.d(abstractC4649jL0N));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.C2251Vp1
    public final String i(ML0 ml0) {
        return h(ml0);
    }

    @Override // defpackage.C2251Vp1
    public final SJ0 j(RI0 ri0, List arguments) {
        if (!(ri0 instanceof InterfaceC7774yC)) {
            return C5276mJ0.a(ri0, arguments, false, Collections.EMPTY_LIST);
        }
        Class<?> jClass = ((InterfaceC7774yC) ri0).h();
        UH uh = C0633Ax.a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return (SJ0) C0633Ax.c.a(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C0633Ax.d.a(jClass);
        Pair pair = new Pair(arguments, Boolean.FALSE);
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            WJ0 wj0A = C5276mJ0.a(C0633Ax.a(jClass), arguments, false, C5653o60.d);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, wj0A);
            obj = objPutIfAbsent == null ? wj0A : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (SJ0) obj;
    }
}
