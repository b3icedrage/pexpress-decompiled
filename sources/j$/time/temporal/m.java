package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends TemporalAccessor {
    m e(long j, r rVar);

    /* JADX INFO: renamed from: g */
    m m(LocalDate localDate);

    m i(long j, t tVar);

    default m a(long j, t tVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, tVar).i(1L, tVar) : i(-j, tVar);
    }
}
