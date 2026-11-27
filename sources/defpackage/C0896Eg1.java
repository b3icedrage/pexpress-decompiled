package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Eg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0896Eg1 {
    @NotNull
    public static final Y11 a(@NotNull AbstractC0662Bg1.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Y11 y11 = new Y11(false, 1);
        AbstractC0662Bg1.b[] pairs2 = (AbstractC0662Bg1.b[]) Arrays.copyOf(pairs, pairs.length);
        Intrinsics.checkNotNullParameter(pairs2, "pairs");
        y11.c();
        for (AbstractC0662Bg1.b bVar : pairs2) {
            y11.d(bVar.a, Boolean.TRUE);
        }
        return y11;
    }
}
