package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends Comparable {
    List B();

    ChronoLocalDate E(int i, int i2, int i3);

    ChronoLocalDate J();

    m L(int i);

    ChronoLocalDate N(Map map, j$.time.format.w wVar);

    String P();

    j$.time.temporal.v S(j$.time.temporal.a aVar);

    boolean equals(Object obj);

    String getId();

    int hashCode();

    ChronoLocalDate q(long j);

    ChronoLocalDate s(TemporalAccessor temporalAccessor);

    String toString();

    int u(m mVar, int i);

    InterfaceC4573i w(Instant instant, ZoneId zoneId);

    ChronoLocalDate y(int i, int i2);

    static l D(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.b(j$.time.temporal.s.a());
        s sVar = s.d;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    default InterfaceC4568d v(LocalDateTime localDateTime) {
        try {
            return s(localDateTime).I(LocalTime.A(localDateTime));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }
}
