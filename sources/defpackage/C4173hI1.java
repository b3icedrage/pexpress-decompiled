package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: hI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4173hI1 {

    /* JADX INFO: renamed from: hI1$a */
    public static final class a extends ML0 implements Function0<InterfaceC4853kJ0> {
        public final /* synthetic */ ArrayList d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(0);
            this.d = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC4853kJ0 invoke() {
            return ((SJ0) this.d.get(0)).g();
        }
    }

    public static final RJ0<Object> a(G1 g1, SJ0 sj0, boolean z) {
        RJ0<? extends Object> rj0A;
        RJ0 rj0F;
        RI0 clazz = LL.i(sj0);
        boolean zA = sj0.a();
        List<KTypeProjection> listF = sj0.f();
        ArrayList types = new ArrayList(XE.m(listF, 10));
        for (KTypeProjection kTypeProjection : listF) {
            Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
            SJ0 sj1 = kTypeProjection.b;
            if (sj1 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.b).toString());
            }
            types.add(sj1);
        }
        if (types.isEmpty()) {
            InterfaceC3124cI1<? extends Object> interfaceC3124cI1 = C3753fI1.a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (zA) {
                rj0A = C3753fI1.b.a(clazz);
            } else {
                rj0A = C3753fI1.a.a(clazz);
                if (rj0A == null) {
                    rj0A = null;
                }
            }
        } else {
            InterfaceC3124cI1<? extends Object> interfaceC3124cI2 = C3753fI1.a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            Object objA = !zA ? C3753fI1.c.a(clazz, types) : C3753fI1.d.a(clazz, types);
            C1717Ot1.a aVar = C1717Ot1.e;
            if (objA instanceof C1717Ot1.b) {
                objA = null;
            }
            rj0A = (RJ0) objA;
        }
        if (rj0A != null) {
            return rj0A;
        }
        if (!types.isEmpty()) {
            ArrayList arrayListU = C1589Ne.u(g1, types, z);
            if (arrayListU != null) {
                RJ0 rj0Q = C1589Ne.q(clazz, arrayListU, new a(types));
                rj0F = rj0Q == null ? g1.f(clazz, arrayListU) : rj0Q;
            }
            return null;
        }
        rj0F = g1.f(clazz, C5653o60.d);
        if (rj0F != null) {
            return zA ? C1173Hv.c(rj0F) : rj0F;
        }
        return null;
    }
}
