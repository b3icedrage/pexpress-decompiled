package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Xj2 {

    @NotNull
    public static final String a;

    @NotNull
    public static final String[] b;

    static {
        String strD = AS0.d("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"WrkDbPathHelper\")");
        a = strD;
        b = new String[]{"-journal", "-shm", "-wal"};
    }
}
