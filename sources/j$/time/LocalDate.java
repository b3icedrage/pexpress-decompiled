package j$.time;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.V31;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.InterfaceC4568d;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.n, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    @Override // j$.time.temporal.m
    public final ChronoLocalDate a(long j, j$.time.temporal.t tVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    static {
        of(1970, 1, 1);
    }

    public static LocalDate a0(Clock clock) {
        Instant instant = clock.instant();
        ZoneId zoneIdA = clock.a();
        Objects.requireNonNull(instant, Payload.INSTANT);
        Objects.requireNonNull(zoneIdA, "zone");
        return c0(Math.floorDiv(instant.getEpochSecond() + ((long) zoneIdA.r().d(instant).getTotalSeconds()), 86400));
    }

    public static LocalDate b0(int i, j jVar, int i2) {
        j$.time.temporal.a.YEAR.X(i);
        j$.time.temporal.a.DAY_OF_MONTH.X(i2);
        return A(i, jVar.p(), i2);
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.X(i);
        j$.time.temporal.a.MONTH_OF_YEAR.X(i2);
        j$.time.temporal.a.DAY_OF_MONTH.X(i3);
        return A(i, i2, i3);
    }

    public static LocalDate d0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.X(j);
        j$.time.temporal.a.DAY_OF_YEAR.X(i2);
        j$.time.chrono.s.d.getClass();
        boolean zW = j$.time.chrono.s.W(j);
        if (i2 == 366 && !zW) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        j jVarQ = j.Q(((i2 - 1) / 31) + 1);
        if (i2 > (jVarQ.A(zW) + jVarQ.r(zW)) - 1) {
            jVarQ = jVarQ.R();
        }
        return new LocalDate(i, jVarQ.p(), (i2 - jVarQ.r(zW)) + 1);
    }

    public static LocalDate c0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.X(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(j$.time.temporal.a.YEAR.W(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate H(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.b(j$.time.temporal.s.b());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new e(0));
    }

    private static LocalDate A(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.d.getClass();
                if (j$.time.chrono.s.W(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + j.Q(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private static LocalDate j0(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.s.d.getClass();
            i3 = Math.min(i3, j$.time.chrono.s.W((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    private LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.H(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.R()) {
            throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.v.j(1L, Z());
        }
        if (i == 2) {
            return j$.time.temporal.v.j(1L, Y() ? 366 : 365);
        }
        if (i == 3) {
            return j$.time.temporal.v.j(1L, (j.Q(this.b) != j.FEBRUARY || Y()) ? 5L : 4L);
        }
        if (i != 4) {
            return ((j$.time.temporal.a) rVar).A();
        }
        return this.a <= 0 ? j$.time.temporal.v.j(1L, 1000000000L) : j$.time.temporal.v.j(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return Q(rVar);
        }
        return super.j(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.EPOCH_DAY) {
                return toEpochDay();
            }
            if (rVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return Q(rVar);
            }
            return ((((long) this.a) * 12) + ((long) this.b)) - 1;
        }
        return rVar.r(this);
    }

    private int Q(j$.time.temporal.r rVar) {
        int i;
        int i2 = f.a[((j$.time.temporal.a) rVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return R();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return getDayOfWeek().p();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((R() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.u("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((R() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.u("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
        }
        return i + 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.l h() {
        return j$.time.chrono.s.d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.m t() {
        return this.a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public final int W() {
        return this.a;
    }

    public final int T() {
        return this.b;
    }

    public final int R() {
        return (j.Q(this.b).r(Y()) + this.c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.r(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    public final boolean Y() {
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        long j = this.a;
        sVar.getClass();
        return j$.time.chrono.s.W(j);
    }

    public final int Z() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return Y() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate m(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDate) {
            return (LocalDate) nVar;
        }
        return (LocalDate) nVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (LocalDate) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j);
        int i = f.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return of(i2, s2, i3);
                }
                return this;
            case 2:
                return m0((int) j);
            case 3:
                return h0(j - f(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return n0((int) j);
            case 5:
                return f0(j - ((long) getDayOfWeek().p()));
            case 6:
                return f0(j - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return f0(j - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return c0(j);
            case 9:
                return h0(j - f(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.X(i4);
                    return j0(i2, i4, s);
                }
                return this;
            case 11:
                return g0(j - (((((long) i2) * 12) + ((long) s2)) - 1));
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return n0((int) j);
            case 13:
                if (f(j$.time.temporal.a.ERA) != j) {
                    return n0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
        }
    }

    public final LocalDate n0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.X(i);
        return j0(i, this.b, this.c);
    }

    public final LocalDate m0(int i) {
        return R() == i ? this : d0(this.a, i);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.q qVar) {
        if (qVar instanceof o) {
            o oVar = (o) qVar;
            return g0(oVar.d()).f0(oVar.a());
        }
        Objects.requireNonNull(qVar, "amountToAdd");
        return (LocalDate) qVar.p(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDate i(long j, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (LocalDate) tVar.p(this, j);
        }
        switch (f.b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return f0(j);
            case 2:
                return h0(j);
            case 3:
                return g0(j);
            case 4:
                return i0(j);
            case 5:
                return i0(Math.multiplyExact(j, 10));
            case 6:
                return i0(Math.multiplyExact(j, 100));
            case 7:
                return i0(Math.multiplyExact(j, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(Math.addExact(f(aVar), j), aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final LocalDate i0(long j) {
        return j == 0 ? this : j0(j$.time.temporal.a.YEAR.W(((long) this.a) + j), this.b, this.c);
    }

    public final LocalDate g0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        long j3 = 12;
        return j0(j$.time.temporal.a.YEAR.W(Math.floorDiv(j2, j3)), ((int) Math.floorMod(j2, j3)) + 1, this.c);
    }

    public final LocalDate h0(long j) {
        return f0(Math.multiplyExact(j, 7));
    }

    public final LocalDate f0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jZ = Z();
                if (j2 <= jZ) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jZ));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.X(i2);
                return new LocalDate(i2, 1, (int) (j2 - jZ));
            }
        }
        return c0(Math.addExact(toEpochDay(), j));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.s.b() ? this : super.b(temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final InterfaceC4568d I(LocalTime localTime) {
        return LocalDateTime.Z(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !Y() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return r((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    final int r(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean X(LocalDate localDate) {
        if (localDate != null) {
            return r(localDate) < 0;
        }
        return toEpochDay() < localDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && r((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void o0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }
}
