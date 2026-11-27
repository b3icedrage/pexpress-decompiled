package kotlin.time;

import defpackage.R40;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public static final class a implements f {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: kotlin.time.f$a$a, reason: collision with other inner class name */
        public static final class C0434a implements kotlin.time.a {
            public final long d;

            public /* synthetic */ C0434a(long j) {
                this.d = j;
            }

            @Override // kotlin.time.TimeMark
            public final long b() {
                e.a.getClass();
                long jNanoTime = System.nanoTime() - e.b;
                R40 unit = R40.NANOSECONDS;
                Intrinsics.checkNotNullParameter(unit, "unit");
                long j = this.d;
                return (1 | (j - 1)) == Long.MAX_VALUE ? b.t(d.a(j)) : d.b(jNanoTime, j, unit);
            }

            @Override // java.lang.Comparable
            public final int compareTo(kotlin.time.a aVar) {
                return kotlin.time.a.C0433a.a(this, aVar);
            }

            @Override // kotlin.time.a
            public final long d(@NotNull kotlin.time.a other) {
                Intrinsics.checkNotNullParameter(other, "other");
                Intrinsics.checkNotNullParameter(other, "other");
                boolean z = other instanceof C0434a;
                long j = this.d;
                if (z) {
                    long j2 = ((C0434a) other).d;
                    e.a.getClass();
                    return d.c(j, j2, R40.NANOSECONDS);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + other);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C0434a) {
                    return this.d == ((C0434a) obj).d;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.d);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.d + ')';
            }
        }

        @Override // kotlin.time.f
        public final TimeMark a() {
            e.a.getClass();
            return new C0434a(System.nanoTime() - e.b);
        }

        @NotNull
        public final String toString() {
            e.a.getClass();
            return "TimeSource(System.nanoTime())";
        }
    }

    @NotNull
    TimeMark a();
}
