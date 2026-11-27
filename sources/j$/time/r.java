package j$.time;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.x;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((r) obj).a;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.j(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        dateTimeFormatterBuilder.toFormatter();
    }

    public static r r(int i) {
        j$.time.temporal.a.YEAR.X(i);
        return new r(i);
    }

    private r(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA;
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
        int i = q.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (r) localDate.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final r e(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (r) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j);
        int i = q.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return r((int) j);
        }
        if (i == 2) {
            return r((int) j);
        }
        if (i == 3) {
            return f(j$.time.temporal.a.ERA) == j ? this : r(1 - i2);
        }
        throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final r i(long j, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (r) tVar.p(this, j);
        }
        int i = q.b[((j$.time.temporal.b) tVar).ordinal()];
        if (i == 1) {
            return H(j);
        }
        if (i == 2) {
            return H(Math.multiplyExact(j, 10));
        }
        if (i == 3) {
            return H(Math.multiplyExact(j, 100));
        }
        if (i == 4) {
            return H(Math.multiplyExact(j, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return e(Math.addExact(f(aVar), j), aVar);
        }
        throw new j$.time.temporal.u("Unsupported unit: " + tVar);
    }

    public final r H(long j) {
        return j == 0 ? this : r(j$.time.temporal.a.YEAR.W(((long) this.a) + j));
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
            return j$.time.temporal.b.YEARS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.D(mVar).equals(j$.time.chrono.s.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.e(this.a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            if (this.a == ((r) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new p((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void R(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }
}
