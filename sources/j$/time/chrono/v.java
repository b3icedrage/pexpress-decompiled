package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractC4565a implements Serializable {
    public static final v d = new v();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.l
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String P() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate E(int i, int i2, int i3) {
        return new x(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate y(int i, int i2) {
        return new x(LocalDate.d0(i, i2));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(long j) {
        return new x(LocalDate.c0(j));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate J() {
        return new x(LocalDate.H(LocalDate.a0(Clock.b())));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof x) {
            return (x) temporalAccessor;
        }
        return new x(LocalDate.H(temporalAccessor));
    }

    private v() {
    }

    @Override // j$.time.chrono.l
    public final int u(m mVar, int i) {
        if (!(mVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        y yVar = (y) mVar;
        int iW = (yVar.s().W() + i) - 1;
        if (i != 1 && (iW < -999999999 || iW > 999999999 || iW < yVar.s().W() || mVar != y.q(LocalDate.of(iW, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return iW;
    }

    @Override // j$.time.chrono.l
    public final m L(int i) {
        return y.v(i);
    }

    @Override // j$.time.chrono.l
    public final List B() {
        return j$.time.c.a(y.A());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v S(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.u("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.v.k(y.y(), 999999999 - y.r().s().W());
            case 6:
                return j$.time.temporal.v.k(y.w(), j$.time.temporal.a.DAY_OF_YEAR.A().d());
            case 7:
                return j$.time.temporal.v.j(x.d.W(), 999999999L);
            case 8:
                return j$.time.temporal.v.j(y.d.p(), y.r().p());
            default:
                return aVar.A();
        }
    }

    @Override // j$.time.chrono.AbstractC4565a, j$.time.chrono.l
    public final ChronoLocalDate N(Map map, j$.time.format.w wVar) {
        return (x) super.N(map, wVar);
    }

    @Override // j$.time.chrono.AbstractC4565a
    final ChronoLocalDate T(Map map, j$.time.format.w wVar) {
        x xVarY;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        y yVarV = l != null ? y.v(S(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? S(aVar2).a(l2.longValue(), aVar2) : 0;
        if (yVarV == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && wVar != j$.time.format.w.STRICT) {
            yVarV = y.A()[y.A().length - 1];
        }
        if (l2 != null && yVarV != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (wVar == j$.time.format.w.LENIENT) {
                        return new x(LocalDate.of((yVarV.s().W() + iA) - 1, 1, 1)).T(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).T(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = S(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = S(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (wVar != j$.time.format.w.SMART) {
                        LocalDate localDate = x.d;
                        LocalDate localDateOf = LocalDate.of((yVarV.s().W() + iA) - 1, iA2, iA3);
                        if (localDateOf.X(yVarV.s()) || yVarV != y.q(localDateOf)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new x(yVarV, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int iW = (yVarV.s().W() + iA) - 1;
                    try {
                        xVarY = new x(LocalDate.of(iW, iA2, iA3));
                    } catch (DateTimeException unused) {
                        xVarY = new x(LocalDate.of(iW, iA2, 1)).Y(new j$.time.temporal.p(0));
                    }
                    if (xVarY.R() == yVarV || xVarY.j(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return xVarY;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + yVarV + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (wVar == j$.time.format.w.LENIENT) {
                    return new x(LocalDate.d0((yVarV.s().W() + iA) - 1, 1)).T(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = S(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = x.d;
                LocalDate localDateD0 = iA == 1 ? LocalDate.d0(yVarV.s().W(), (yVarV.s().R() + iA4) - 1) : LocalDate.d0((yVarV.s().W() + iA) - 1, iA4);
                if (localDateD0.X(yVarV.s()) || yVarV != y.q(localDateD0)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new x(yVarV, iA, localDateD0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final InterfaceC4573i w(Instant instant, ZoneId zoneId) {
        return k.H(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
