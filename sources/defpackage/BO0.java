package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BO0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ BO0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C5638o21 it = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((FO0) this.e).N(it);
            default:
                G51.a aVar = (G51.a) obj;
                Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                QC qc = aVar.a;
                if (qc.c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + qc);
                }
                QC qcE = qc.e();
                G51 g51 = (G51) this.e;
                List<Integer> list = aVar.b;
                WC wcA = qcE != null ? g51.a(qcE, CollectionsKt.A(list, 1)) : (WC) ((C2720aS0.k) g51.c).invoke(qc.a);
                boolean z = !qc.b.e().d();
                C2720aS0 c2720aS0 = g51.a;
                C5638o21 c5638o21F = qc.f();
                Integer num = (Integer) CollectionsKt.firstOrNull(list);
                return new G51.b(c2720aS0, wcA, c5638o21F, z, num != null ? num.intValue() : 0);
        }
    }
}
