package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements TemporalQuery, n {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.n
    public m c(m mVar) {
        a aVar = a.DAY_OF_MONTH;
        return mVar.e(mVar.l(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 1:
                return (ZoneId) temporalAccessor.b(s.a);
            case 2:
                return (j$.time.chrono.l) temporalAccessor.b(s.b);
            case 3:
                return (t) temporalAccessor.b(s.c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.d(aVar)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.j(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.b(s.a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.b(s.d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.d(aVar2)) {
                    return LocalDate.c0(temporalAccessor.f(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.d(aVar3)) {
                    return LocalTime.X(temporalAccessor.f(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
