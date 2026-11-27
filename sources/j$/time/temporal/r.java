package j$.time.temporal;

import j$.time.format.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface r {
    v A();

    v H(TemporalAccessor temporalAccessor);

    boolean R();

    boolean T(TemporalAccessor temporalAccessor);

    m p(m mVar, long j);

    long r(TemporalAccessor temporalAccessor);

    default TemporalAccessor Q(HashMap map, TemporalAccessor temporalAccessor, w wVar) {
        return null;
    }
}
