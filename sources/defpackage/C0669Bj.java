package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0669Bj {
    public static final int a;

    static {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objA = StringsKt.toIntOrNull(property);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = null;
        }
        Integer num = (Integer) objA;
        a = num != null ? num.intValue() : 2097152;
    }
}
