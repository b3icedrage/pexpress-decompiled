package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class r {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    r(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVarA = dateTimeFormatter.a();
        if (lVarA != null) {
            j$.time.chrono.l lVar = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.s.a());
            ZoneId zoneId = (ZoneId) temporalAccessor.b(j$.time.temporal.s.g());
            ChronoLocalDate chronoLocalDateS = null;
            lVarA = Objects.equals(lVarA, lVar) ? null : lVarA;
            if (lVarA != null) {
                j$.time.chrono.l lVar2 = lVarA != null ? lVarA : lVar;
                if (lVarA != null) {
                    if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateS = lVar2.s(temporalAccessor);
                    } else if (lVarA != j$.time.chrono.s.d || lVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.R() && temporalAccessor.d(aVar)) {
                                throw new DateTimeException("Unable to apply override chronology '" + lVarA + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new q(chronoLocalDateS, temporalAccessor, lVar2, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    final TemporalAccessor d() {
        return this.a;
    }

    final Locale c() {
        return this.b.c();
    }

    final u b() {
        return this.b.b();
    }

    final void g() {
        this.c++;
    }

    final void a() {
        this.c--;
    }

    final Object f(a aVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objB = temporalAccessor.b(aVar);
        if (objB != null || this.c != 0) {
            return objB;
        }
        throw new DateTimeException("Unable to extract " + aVar + " from temporal " + temporalAccessor);
    }

    final Long e(j$.time.temporal.r rVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.d(rVar)) {
            return Long.valueOf(temporalAccessor.f(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
