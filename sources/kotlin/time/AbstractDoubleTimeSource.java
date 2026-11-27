package kotlin.time;

import defpackage.R51;
import defpackage.T40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractDoubleTimeSource implements f {

    public static final class a implements kotlin.time.a {
        public final double d;

        @NotNull
        public final AbstractDoubleTimeSource e;
        public final long g;

        public a(double d, AbstractDoubleTimeSource timeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.d = d;
            this.e = timeSource;
            this.g = j;
        }

        @Override // kotlin.time.TimeMark
        public final long b() {
            AbstractDoubleTimeSource abstractDoubleTimeSource = this.e;
            double dB = abstractDoubleTimeSource.b() - this.d;
            abstractDoubleTimeSource.getClass();
            c.f(dB, null);
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(kotlin.time.a aVar) {
            return kotlin.time.a.C0433a.a(this, aVar);
        }

        @Override // kotlin.time.a
        public final long d(@NotNull kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                AbstractDoubleTimeSource abstractDoubleTimeSource = aVar.e;
                AbstractDoubleTimeSource abstractDoubleTimeSource2 = this.e;
                if (Intrinsics.a(abstractDoubleTimeSource2, abstractDoubleTimeSource)) {
                    long j = this.g;
                    long j2 = aVar.g;
                    if (b.k(j, j2) && b.n(j)) {
                        b.e.getClass();
                        return 0L;
                    }
                    b.p(j, b.t(j2));
                    double d = this.d - aVar.d;
                    abstractDoubleTimeSource2.getClass();
                    c.f(d, null);
                    throw null;
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (!Intrinsics.a(this.e, ((a) obj).e)) {
                return false;
            }
            d((kotlin.time.a) obj);
            b.e.getClass();
            return b.k(0L, 0L);
        }

        public final int hashCode() {
            this.e.getClass();
            c.f(this.d, null);
            throw null;
        }

        @NotNull
        public final String toString() {
            new StringBuilder("DoubleTimeMark(").append(this.d);
            this.e.getClass();
            T40.d(null);
            throw null;
        }
    }

    @Override // kotlin.time.f
    public final TimeMark a() {
        double dB = b();
        b.e.getClass();
        return new a(dB, this, 0L, null);
    }

    public abstract double b();
}
