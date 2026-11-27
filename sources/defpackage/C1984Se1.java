package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Se1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1984Se1 {
    public static final boolean a;

    static {
        C1984Se1 c1984Se1 = new C1984Se1();
        Intrinsics.checkNotNullParameter(c1984Se1, "<this>");
        Intrinsics.checkNotNullParameter(c1984Se1, "<this>");
        Intrinsics.checkNotNullParameter(c1984Se1, "<this>");
        Intrinsics.checkNotNullParameter(c1984Se1, "<this>");
        Intrinsics.checkNotNullParameter(c1984Se1, "<this>");
        String property = System.getProperty("io.ktor.development");
        boolean z = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z = true;
        }
        a = z;
        Intrinsics.checkNotNullParameter(c1984Se1, "<this>");
    }
}
