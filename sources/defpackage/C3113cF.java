package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: cF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class C3113cF extends C2904bF {
    public static final int t(int i, List list) {
        if (i >= 0 && i <= WE.e(list)) {
            return WE.e(list) - i;
        }
        StringBuilder sbC = C1332Jw.c(i, "Element index ", " must be in range [");
        sbC.append(new IntRange(0, WE.e(list), 1));
        sbC.append("].");
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public static final int u(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbC = C1332Jw.c(i, "Position index ", " must be in range [");
        sbC.append(new IntRange(0, list.size(), 1));
        sbC.append("].");
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}
