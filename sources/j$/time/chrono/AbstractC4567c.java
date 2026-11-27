package j$.time.chrono;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import j$.time.LocalDate;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4567c implements ChronoLocalDate, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract ChronoLocalDate A(long j);

    abstract ChronoLocalDate H(long j);

    abstract ChronoLocalDate Q(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return a(j, tVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.r rVar) {
        return e(j, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ j$.time.temporal.m m(LocalDate localDate) {
        return m(localDate);
    }

    static ChronoLocalDate r(l lVar, j$.time.temporal.m mVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) mVar;
        if (lVar.equals(chronoLocalDate.h())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + lVar.getId() + ", actual: " + chronoLocalDate.h().getId());
    }

    AbstractC4567c() {
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public ChronoLocalDate i(long j, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return super.i(j, tVar);
        }
        switch (AbstractC4566b.a[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return A(j);
            case 2:
                return A(Math.multiplyExact(j, 7));
            case 3:
                return H(j);
            case 4:
                return Q(j);
            case 5:
                return Q(Math.multiplyExact(j, 10));
            case 6:
                return Q(Math.multiplyExact(j, 100));
            case 7:
                return Q(Math.multiplyExact(j, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(Math.addExact(f(aVar), j), (j$.time.temporal.r) aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ h().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long jF = f(j$.time.temporal.a.YEAR_OF_ERA);
        long jF2 = f(j$.time.temporal.a.MONTH_OF_YEAR);
        long jF3 = f(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(h().toString());
        sb.append(" ");
        sb.append(t());
        sb.append(" ");
        sb.append(jF);
        sb.append(jF2 < 10 ? "-0" : "-");
        sb.append(jF2);
        sb.append(jF3 < 10 ? "-0" : "-");
        sb.append(jF3);
        return sb.toString();
    }
}
