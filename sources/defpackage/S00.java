package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class S00 {
    public static final /* synthetic */ int a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(AS0.d("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(InterfaceC5579nk2 interfaceC5579nk2, Sk2 sk2, VW1 vw1, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bk2 bk2 = (Bk2) it.next();
            UW1 uw1B = vw1.b(ED.i(bk2));
            Integer numValueOf = uw1B != null ? Integer.valueOf(uw1B.c) : null;
            String str = bk2.a;
            String strJ = CollectionsKt.J(interfaceC5579nk2.b(str), ",", null, null, null, 62);
            String strJ2 = CollectionsKt.J(sk2.a(str), ",", null, null, null, 62);
            StringBuilder sbB = C6495s7.b("\n", str, "\t ");
            sbB.append(bk2.c);
            sbB.append("\t ");
            sbB.append(numValueOf);
            sbB.append("\t ");
            sbB.append(bk2.b.name());
            sbB.append("\t ");
            sbB.append(strJ);
            sbB.append("\t ");
            sbB.append(strJ2);
            sbB.append('\t');
            sb.append(sbB.toString());
        }
        Intrinsics.checkNotNullExpressionValue(sb.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
