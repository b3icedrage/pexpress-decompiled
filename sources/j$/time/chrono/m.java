package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends TemporalAccessor, j$.time.temporal.n {
    int p();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int j(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return p();
        }
        return super.j(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return p();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.ERAS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(p(), j$.time.temporal.a.ERA);
    }
}
