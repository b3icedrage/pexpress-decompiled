package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean d(r rVar);

    long f(r rVar);

    default v l(r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.H(this);
        }
        if (d(rVar)) {
            return ((a) rVar).A();
        }
        throw new u(j$.time.b.a("Unsupported field: ", rVar));
    }

    default int j(r rVar) {
        v vVarL = l(rVar);
        if (!vVarL.h()) {
            throw new u("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long jF = f(rVar);
        if (vVarL.i(jF)) {
            return (int) jF;
        }
        throw new DateTimeException("Invalid value for " + rVar + " (valid values " + vVarL + "): " + jF);
    }

    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == s.a || temporalQuery == s.b || temporalQuery == s.c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
