package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3688f00 extends AbstractC5628o0 {

    @NotNull
    public final C6582sZ o;

    @NotNull
    public final C4735jk1 p;

    @NotNull
    public final C6792tZ q;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3688f00(@NotNull C6582sZ c, @NotNull C4735jk1 proto, int i) {
        EnumC3610ed2 enumC3610ed2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        C2720aS0 c2720aS0 = c.a.a;
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        C5638o21 c5638o21B = C6267r21.b(c.b, proto.i);
        C4735jk1.c variance = proto.k;
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        Intrinsics.checkNotNullParameter(variance, "variance");
        int iOrdinal = variance.ordinal();
        if (iOrdinal == 0) {
            enumC3610ed2 = EnumC3610ed2.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            enumC3610ed2 = EnumC3610ed2.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                throw new C6489s51();
            }
            enumC3610ed2 = EnumC3610ed2.INVARIANT;
        }
        EnumC3610ed2 enumC3610ed3 = enumC3610ed2;
        super(c2720aS0, c.c, c0193a, c5638o21B, enumC3610ed3, proto.j, i, InterfaceC3792fV1.a.a);
        this.o = c;
        this.p = proto;
        this.q = new C6792tZ(c.a.a, new C3478e00(this, 0));
    }

    @Override // defpackage.F1
    public final void V0(AbstractC4649jL0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.util.List] */
    @Override // defpackage.F1
    @NotNull
    public final List<AbstractC4649jL0> W0() {
        C6582sZ c6582sZ = this.o;
        C2656a72 typeTable = c6582sZ.d;
        C4735jk1 c4735jk1 = this.p;
        Intrinsics.checkNotNullParameter(c4735jk1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<C4267hk1> list = c4735jk1.l;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = c4735jk1.m;
            Intrinsics.checkNotNullExpressionValue(list2, "getUpperBoundIdList(...)");
            arrayList = new ArrayList(XE.m(list2, 10));
            for (Integer num : list2) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return VE.c(C4900kZ.e(this).m());
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c6582sZ.h.g((C4267hk1) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.C5642o31, defpackage.InterfaceC0726Cc
    public final InterfaceC2396Xc k() {
        return this.q;
    }
}
