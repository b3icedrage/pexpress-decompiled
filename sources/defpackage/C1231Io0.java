package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1231Io0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long o2 = (Long) obj2;
        long jLongValue = ((Long) obj).longValue();
        Intrinsics.checkNotNullExpressionValue(o2, "o2");
        return Intrinsics.f(jLongValue, o2.longValue());
    }
}
