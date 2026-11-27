package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements TemporalQuery {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                return LocalDate.H(temporalAccessor);
            default:
                return LocalTime.A(temporalAccessor);
        }
    }
}
