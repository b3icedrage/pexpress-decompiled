package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends TimeMark, Comparable<a> {

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0433a {
        public static int a(@NotNull a aVar, @NotNull a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            long jD = aVar.d(other);
            b.e.getClass();
            return b.f(jD, 0L);
        }
    }

    long d(@NotNull a aVar);
}
