package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.format.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient v b;
    private final transient long c;

    @Override // j$.time.temporal.r
    public final boolean R() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = v.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.r
    public final v A() {
        return this.b;
    }

    @Override // j$.time.temporal.r
    public final v H(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.d(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean T(TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.r
    public final m p(m mVar, long j) {
        if (!this.b.i(j)) {
            throw new DateTimeException("Invalid value: " + this.a + " " + j);
        }
        return mVar.e(Math.subtractExact(j, this.c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final TemporalAccessor Q(HashMap map, TemporalAccessor temporalAccessor, w wVar) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarD = j$.time.chrono.l.D(temporalAccessor);
        w wVar2 = w.LENIENT;
        long j = this.c;
        if (wVar == wVar2) {
            return lVarD.q(Math.subtractExact(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return lVarD.q(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
