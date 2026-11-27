package j$.time;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.x;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t tVar = (t) obj;
        int i = this.a - tVar.a;
        return i == 0 ? this.b - tVar.b : i;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.j(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.i(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private t(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private t T(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new t(i, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.v.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        return l(rVar).a(f(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i = s.a[((j$.time.temporal.a) rVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return r();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
    }

    private long r() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (t) localDate.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final t e(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (t) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j);
        int i = s.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.X(i3);
            return T(i2, i3);
        }
        if (i == 2) {
            return H(j - r());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.X(i5);
            return T(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.X(i6);
            return T(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
        }
        if (f(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.X(i7);
        return T(i7, i4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final t i(long j, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (t) tVar.p(this, j);
        }
        switch (s.b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return H(j);
            case 2:
                return Q(j);
            case 3:
                return Q(Math.multiplyExact(j, 10));
            case 4:
                return Q(Math.multiplyExact(j, 100));
            case 5:
                return Q(Math.multiplyExact(j, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(Math.addExact(f(aVar), j), aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final t Q(long j) {
        return j == 0 ? this : T(j$.time.temporal.a.YEAR.W(((long) this.a) + j), this.b);
    }

    public final t H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        long j3 = 12;
        return T(j$.time.temporal.a.YEAR.W(Math.floorDiv(j2, j3)), ((int) Math.floorMod(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, tVar).i(1L, tVar) : i(-j, tVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.a()) {
            return j$.time.chrono.s.d;
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.D(mVar).equals(j$.time.chrono.s.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.e(r(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.a == tVar.a && this.b == tVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void X(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    static t R(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        byte b = objectInput.readByte();
        j$.time.temporal.a.YEAR.X(i);
        j$.time.temporal.a.MONTH_OF_YEAR.X(b);
        return new t(i, b);
    }
}
