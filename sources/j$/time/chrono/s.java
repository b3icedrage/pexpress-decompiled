package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC4565a implements Serializable {
    public static final s d = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m L(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String P() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate E(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate y(int i, int i2) {
        return LocalDate.d0(i, i2);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(long j) {
        return LocalDate.c0(j);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate s(TemporalAccessor temporalAccessor) {
        return LocalDate.H(temporalAccessor);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final InterfaceC4568d v(LocalDateTime localDateTime) {
        return LocalDateTime.A(localDateTime);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC4573i w(Instant instant, ZoneId zoneId) {
        return j$.time.w.A(instant, zoneId);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate J() {
        return LocalDate.H(LocalDate.a0(Clock.b()));
    }

    public static boolean W(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.l
    public final int u(m mVar, int i) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.l
    public final List B() {
        return j$.time.c.a(t.values());
    }

    @Override // j$.time.chrono.AbstractC4565a, j$.time.chrono.l
    public final ChronoLocalDate N(Map map, j$.time.format.w wVar) {
        return (LocalDate) super.N(map, wVar);
    }

    @Override // j$.time.chrono.AbstractC4565a
    final void Q(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (wVar != j$.time.format.w.LENIENT) {
                aVar.X(l.longValue());
            }
            long j = 12;
            AbstractC4565a.p(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), j)) + 1);
            AbstractC4565a.p(map, j$.time.temporal.a.YEAR, Math.floorDiv(l.longValue(), j));
        }
    }

    @Override // j$.time.chrono.AbstractC4565a
    final ChronoLocalDate T(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (wVar != j$.time.format.w.LENIENT) {
                aVar.X(l.longValue());
            }
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l2 != null) {
                if (l2.longValue() == 1) {
                    AbstractC4565a.p(map, j$.time.temporal.a.YEAR, l.longValue());
                    return null;
                }
                if (l2.longValue() == 0) {
                    AbstractC4565a.p(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l2);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l3 = (Long) map.get(aVar2);
            if (wVar != j$.time.format.w.STRICT) {
                AbstractC4565a.p(map, aVar2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                return null;
            }
            if (l3 != null) {
                long jLongValue = l3.longValue();
                long jLongValue2 = l.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC4565a.p(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.X(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC4565a
    final ChronoLocalDate R(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iW = aVar.W(((Long) map.remove(aVar)).longValue());
        boolean z = true;
        if (wVar == j$.time.format.w.LENIENT) {
            return LocalDate.of(iW, 1, 1).g0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).f0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iW2 = aVar2.W(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iW3 = aVar3.W(((Long) map.remove(aVar3)).longValue());
        if (wVar == j$.time.format.w.SMART) {
            if (iW2 == 4 || iW2 == 6 || iW2 == 9 || iW2 == 11) {
                iW3 = Math.min(iW3, 30);
            } else if (iW2 == 2) {
                j$.time.j jVar = j$.time.j.FEBRUARY;
                long j = iW;
                int i = j$.time.r.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iW3 = Math.min(iW3, jVar.A(z));
            }
        }
        return LocalDate.of(iW, iW2, iW3);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v S(j$.time.temporal.a aVar) {
        return aVar.A();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
