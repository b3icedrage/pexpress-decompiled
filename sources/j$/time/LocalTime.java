package j$.time;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.C1497Lz0;
import defpackage.JI1;
import defpackage.V31;
import io.jsonwebtoken.JwtParser;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;
    public static final LocalTime e;
    private static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime W(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.X(i);
        return f[i];
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.X(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.X(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.X(i3);
        j$.time.temporal.a.NANO_OF_SECOND.X(i4);
        return r(i, i2, i3, i4);
    }

    public static LocalTime Y(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.X(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return r(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    public static LocalTime X(long j) {
        j$.time.temporal.a.NANO_OF_DAY.X(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return r(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime A(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.b(j$.time.temporal.s.c());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new e(1));
    }

    private static LocalTime r(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y();
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return H(rVar);
        }
        return super.j(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.NANO_OF_DAY) {
                return f0();
            }
            if (rVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return f0() / 1000;
            }
            return H(rVar);
        }
        return rVar.r(this);
    }

    private int H(j$.time.temporal.r rVar) {
        int i = h.a[((j$.time.temporal.a) rVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.u("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            case 4:
                throw new j$.time.temporal.u("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (f0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
        }
    }

    public final int Q() {
        return this.a;
    }

    public final int T() {
        return this.c;
    }

    public final int R() {
        return this.d;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (LocalTime) localDate.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalTime e(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (LocalTime) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j);
        int i = h.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return h0((int) j);
            case 2:
                return X(j);
            case 3:
                return h0(((int) j) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            case 4:
                return X(j * 1000);
            case 5:
                return h0(((int) j) * 1000000);
            case 6:
                return X(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.X(i3);
                    return r(b3, b, i3, i2);
                }
                return this;
            case 8:
                return d0(j - ((long) toSecondOfDay()));
            case 9:
                int i4 = (int) j;
                if (b != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.X(i4);
                    return r(b3, i4, b2, i2);
                }
                return this;
            case 10:
                return b0(j - ((long) ((b3 * 60) + b)));
            case 11:
                return a0(j - ((long) (b3 % 12)));
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (j == 12) {
                    j = 0;
                }
                return a0(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.X(i5);
                    return r(i5, b, b2, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.X(i6);
                    return r(i6, b, b2, i2);
                }
                return this;
            case 15:
                return a0((j - ((long) (b3 / 12))) * 12);
            default:
                throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
        }
    }

    public final LocalTime h0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.X(i);
        return r(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final LocalTime i(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            switch (h.b[((j$.time.temporal.b) tVar).ordinal()]) {
                case 1:
                    return c0(j);
                case 2:
                    return c0((j % 86400000000L) * 1000);
                case 3:
                    return c0((j % 86400000) * 1000000);
                case 4:
                    return d0(j);
                case 5:
                    return b0(j);
                case 6:
                    return a0(j);
                case 7:
                    return a0((j % 2) * 12);
                default:
                    throw new j$.time.temporal.u("Unsupported unit: " + tVar);
            }
        }
        return (LocalTime) tVar.p(this, j);
    }

    public final LocalTime a0(long j) {
        if (j == 0) {
            return this;
        }
        return r(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime b0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + C1497Lz0.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW) % C1497Lz0.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW;
            if (i != i2) {
                return r(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime d0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % JI1.SECONDS_IN_A_DAY)) + i) + 86400) % 86400;
            if (i != i2) {
                return r(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final LocalTime c0(long j) {
        if (j != 0) {
            long jF0 = f0();
            long j2 = (((j % 86400000000000L) + jF0) + 86400000000000L) % 86400000000000L;
            if (jF0 != j2) {
                return r((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, tVar).i(1L, tVar) : i(-j, tVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.a() || temporalQuery == j$.time.temporal.s.g() || temporalQuery == j$.time.temporal.s.f() || temporalQuery == j$.time.temporal.s.d()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.c()) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.s.b()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public int toSecondOfDay() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long f0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jF0 = f0();
        return (int) (jF0 ^ (jF0 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT).substring(1));
                } else if (i % CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT == 0) {
                    sb.append(Integer.toString((i / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void i0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    static LocalTime e0(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = objectInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = objectInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = objectInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return of(i3, i4, i2, i);
    }
}
