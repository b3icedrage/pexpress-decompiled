package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
final class q implements TemporalAccessor {
    final /* synthetic */ ChronoLocalDate a;
    final /* synthetic */ TemporalAccessor b;
    final /* synthetic */ j$.time.chrono.l c;
    final /* synthetic */ ZoneId d;

    q(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = lVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate != null && rVar.R()) {
            return chronoLocalDate.d(rVar);
        }
        return this.b.d(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate != null && rVar.R()) {
            return chronoLocalDate.l(rVar);
        }
        return this.b.l(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate != null && rVar.R()) {
            return chronoLocalDate.f(rVar);
        }
        return this.b.f(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.a()) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.s.g()) {
            return this.d;
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return this.b.b(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
