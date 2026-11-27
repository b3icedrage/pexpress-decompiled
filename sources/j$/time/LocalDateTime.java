package j$.time;

import defpackage.C1575Mz0;
import defpackage.JI1;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.InterfaceC4568d;
import j$.time.chrono.InterfaceC4573i;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC4568d, Serializable {
    public static final LocalDateTime c = Z(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime d = Z(LocalDate.MAX, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final LocalTime b;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    @Override // j$.time.chrono.InterfaceC4568d
    public final InterfaceC4573i F(ZoneId zoneId) {
        return w.H(this, zoneId, null);
    }

    public static LocalDateTime X(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), LocalTime.W(0));
    }

    public static LocalDateTime Y(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, 0));
    }

    public static LocalDateTime Z(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, C1575Mz0.TIME);
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime a0(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.X(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        long j3 = 86400;
        return new LocalDateTime(LocalDate.c0(Math.floorDiv(totalSeconds, j3)), LocalTime.X((((long) ((int) Math.floorMod(totalSeconds, j3))) * 1000000000) + j2));
    }

    public static LocalDateTime A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof w) {
            return ((w) temporalAccessor).T();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.H(temporalAccessor), LocalTime.A(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    private LocalDateTime i0(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.T(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.R() || aVar.Y();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.b.l(rVar) : this.a.l(rVar);
        }
        return rVar.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.b.j(rVar) : this.a.j(rVar);
        }
        return super.j(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.b.f(rVar) : this.a.f(rVar);
        }
        return rVar.r(this);
    }

    private int r(LocalDateTime localDateTime) {
        int iR = this.a.r(localDateTime.a);
        return iR == 0 ? this.b.compareTo(localDateTime.b) : iR;
    }

    public final LocalDate f0() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC4568d
    public final ChronoLocalDate o() {
        return this.a;
    }

    public final int R() {
        return this.a.W();
    }

    @Override // j$.time.chrono.InterfaceC4568d
    public final LocalTime n() {
        return this.b;
    }

    public final int Q() {
        return this.b.T();
    }

    public final int H() {
        return this.b.R();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return i0(localDate, this.b);
    }

    public final LocalDateTime h0(LocalDate localDate) {
        return i0(localDate, this.b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean zY = ((j$.time.temporal.a) rVar).Y();
            LocalTime localTime = this.b;
            LocalDate localDate = this.a;
            if (zY) {
                return i0(localDate, localTime.e(j, rVar));
            }
            return i0(localDate.e(j, rVar), localTime);
        }
        return (LocalDateTime) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(long j, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) tVar.p(this, j);
        }
        switch (g.a[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return e0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeC0 = c0(j / 86400000000L);
                return localDateTimeC0.e0(localDateTimeC0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeC1 = c0(j / 86400000);
                return localDateTimeC1.e0(localDateTimeC1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return d0(j);
            case 5:
                return e0(this.a, 0L, j, 0L, 0L);
            case 6:
                return e0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeC2 = c0(j / 256);
                return localDateTimeC2.e0(localDateTimeC2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return i0(this.a.i(j, tVar), this.b);
        }
    }

    public final LocalDateTime c0(long j) {
        return i0(this.a.f0(j), this.b);
    }

    public final LocalDateTime d0(long j) {
        return e0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.chrono.InterfaceC4568d
    /* JADX INFO: renamed from: k */
    public final InterfaceC4568d a(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    private LocalDateTime e0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeX = this.b;
        if (j5 == 0) {
            return i0(localDate, localTimeX);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / JI1.SECONDS_IN_A_DAY) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % JI1.SECONDS_IN_A_DAY) * 1000000000) + (j4 % 86400000000000L);
        long jF0 = localTimeX.f0();
        long j10 = (j9 * j8) + jF0;
        long jFloorDiv = Math.floorDiv(j10, 86400000000000L) + (j7 * j8);
        long jFloorMod = Math.floorMod(j10, 86400000000000L);
        if (jFloorMod != jF0) {
            localTimeX = LocalTime.X(jFloorMod);
        }
        return i0(localDate.f0(jFloorDiv), localTimeX);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.b()) {
            return this.a;
        }
        return super.b(temporalQuery);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.InterfaceC4568d, java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC4568d interfaceC4568d) {
        if (interfaceC4568d instanceof LocalDateTime) {
            return r((LocalDateTime) interfaceC4568d);
        }
        return super.compareTo(interfaceC4568d);
    }

    public final boolean T(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return r(localDateTime) > 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = localDateTime.a.toEpochDay();
        if (epochDay <= epochDay2) {
            return epochDay == epochDay2 && this.b.f0() > localDateTime.b.f0();
        }
        return true;
    }

    public final boolean W(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return r(localDateTime) < 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = localDateTime.a.toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.f0() < localDateTime.b.f0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void j0(DataOutput dataOutput) {
        this.a.o0(dataOutput);
        this.b.i0(dataOutput);
    }
}
