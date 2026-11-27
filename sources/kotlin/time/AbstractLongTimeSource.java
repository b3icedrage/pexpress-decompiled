package kotlin.time;

import defpackage.A0;
import defpackage.KW1;
import defpackage.R40;
import defpackage.R51;
import defpackage.T40;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractLongTimeSource implements f {

    @NotNull
    public final R40 a;

    @NotNull
    public final KW1 b;

    public static final class a implements kotlin.time.a {
        public final long d;

        @NotNull
        public final AbstractLongTimeSource e;
        public final long g;

        public a(long j, AbstractLongTimeSource timeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.d = j;
            this.e = timeSource;
            this.g = j2;
        }

        @Override // kotlin.time.TimeMark
        public final long b() {
            AbstractLongTimeSource abstractLongTimeSource = this.e;
            return b.p(d.c(abstractLongTimeSource.b() - ((Number) abstractLongTimeSource.b.getValue()).longValue(), this.d, abstractLongTimeSource.a), b.t(this.g));
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
                AbstractLongTimeSource abstractLongTimeSource = aVar.e;
                AbstractLongTimeSource abstractLongTimeSource2 = this.e;
                if (Intrinsics.a(abstractLongTimeSource2, abstractLongTimeSource)) {
                    return b.p(d.c(this.d, aVar.d, abstractLongTimeSource2.a), b.p(this.g, b.t(aVar.g)));
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
            long jD = d((kotlin.time.a) obj);
            b.e.getClass();
            return b.k(jD, 0L);
        }

        public final int hashCode() {
            b.a aVar = b.e;
            return Long.hashCode(this.d) + (Long.hashCode(this.g) * 37);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LongTimeMark(");
            sb.append(this.d);
            AbstractLongTimeSource abstractLongTimeSource = this.e;
            sb.append(T40.d(abstractLongTimeSource.a));
            sb.append(" + ");
            sb.append((Object) b.s(this.g));
            sb.append(", ");
            sb.append(abstractLongTimeSource);
            sb.append(')');
            return sb.toString();
        }
    }

    public AbstractLongTimeSource(@NotNull R40 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.a = unit;
        this.b = XO0.b(new A0(this, 0));
    }

    @Override // kotlin.time.f
    public final TimeMark a() {
        long jB = b() - ((Number) this.b.getValue()).longValue();
        b.e.getClass();
        return new a(jB, this, 0L, null);
    }

    public abstract long b();
}
