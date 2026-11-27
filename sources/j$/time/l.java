package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
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
public final class l implements TemporalAccessor, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int i = this.a - lVar.a;
        return i == 0 ? this.b - lVar.b : i;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f("--");
        dateTimeFormatterBuilder.i(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.i(j$.time.temporal.a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private l(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        int i;
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.A();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.l(rVar);
        }
        int i2 = this.a;
        j jVarQ = j.Q(i2);
        jVarQ.getClass();
        int i3 = i.a[jVarQ.ordinal()];
        if (i3 != 1) {
            i = (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.v.k(i, j.Q(i2).H());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        return l(rVar).a(f(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        int i;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i2 = k.a[((j$.time.temporal.a) rVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.a()) {
            return j$.time.chrono.s.d;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.D(mVar).equals(j$.time.chrono.s.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarE = mVar.e(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarE.e(Math.min(mVarE.l(aVar).d(), this.b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void A(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    static l r(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        byte b2 = objectInput.readByte();
        j jVarQ = j.Q(b);
        Objects.requireNonNull(jVarQ, "month");
        j$.time.temporal.a.DAY_OF_MONTH.X(b2);
        if (b2 > jVarQ.H()) {
            throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b2) + " is not valid for month " + jVarQ.name());
        }
        return new l(jVarQ.p(), b2);
    }
}
