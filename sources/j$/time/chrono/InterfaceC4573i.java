package j$.time.chrono;

import defpackage.JI1;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4573i extends j$.time.temporal.m, Comparable {
    ZoneOffset C();

    InterfaceC4573i G(ZoneId zoneId);

    ZoneId O();

    InterfaceC4568d z();

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).A();
            }
            return z().l(rVar);
        }
        return rVar.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = AbstractC4572h.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return C().getTotalSeconds();
            }
            return z().j(rVar);
        }
        return super.j(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = AbstractC4572h.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                return M();
            }
            if (i == 2) {
                return C().getTotalSeconds();
            }
            return z().f(rVar);
        }
        return rVar.r(this);
    }

    default ChronoLocalDate o() {
        return z().o();
    }

    default LocalTime n() {
        return z().n();
    }

    default l h() {
        return o().h();
    }

    @Override // j$.time.temporal.m
    default InterfaceC4573i m(j$.time.temporal.n nVar) {
        return k.r(h(), nVar.c(this));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    default InterfaceC4573i a(long j, j$.time.temporal.b bVar) {
        return k.r(h(), super.a(j, bVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.f() || temporalQuery == j$.time.temporal.s.g()) {
            return O();
        }
        if (temporalQuery == j$.time.temporal.s.d()) {
            return C();
        }
        if (temporalQuery == j$.time.temporal.s.c()) {
            return n();
        }
        if (temporalQuery == j$.time.temporal.s.a()) {
            return h();
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    default long M() {
        return ((o().toEpochDay() * JI1.SECONDS_IN_A_DAY) + ((long) n().toSecondOfDay())) - ((long) C().getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC4573i interfaceC4573i) {
        int iCompare = Long.compare(M(), interfaceC4573i.M());
        return (iCompare == 0 && (iCompare = n().R() - interfaceC4573i.n().R()) == 0 && (iCompare = z().compareTo(interfaceC4573i.z())) == 0 && (iCompare = O().getId().compareTo(interfaceC4573i.O().getId())) == 0) ? ((AbstractC4565a) h()).getId().compareTo(interfaceC4573i.h().getId()) : iCompare;
    }
}
