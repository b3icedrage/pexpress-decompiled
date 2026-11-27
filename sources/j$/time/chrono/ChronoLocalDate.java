package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDate extends j$.time.temporal.m, j$.time.temporal.n, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    l h();

    int hashCode();

    String toString();

    default m t() {
        return h().L(j(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).R();
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate m(j$.time.temporal.n nVar) {
        return AbstractC4567c.r(h(), nVar.c(this));
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
        return AbstractC4567c.r(h(), rVar.p(this, j));
    }

    default ChronoLocalDate K(j$.time.temporal.q qVar) {
        return AbstractC4567c.r(h(), qVar.p(this));
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate i(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
        return AbstractC4567c.r(h(), tVar.p(this, j));
    }

    @Override // j$.time.temporal.m
    default ChronoLocalDate a(long j, j$.time.temporal.t tVar) {
        return AbstractC4567c.r(h(), super.a(j, tVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.g() || temporalQuery == j$.time.temporal.s.f() || temporalQuery == j$.time.temporal.s.d() || temporalQuery == j$.time.temporal.s.c()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.a()) {
            return h();
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    default InterfaceC4568d I(LocalTime localTime) {
        return C4570f.A(this, localTime);
    }

    default long toEpochDay() {
        return f(j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC4565a) h()).getId().compareTo(chronoLocalDate.h().getId());
    }
}
