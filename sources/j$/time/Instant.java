package j$.time;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant A(long j) {
        return r(j, 0);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return r(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        return r(Math.floorDiv(j, j2), ((int) Math.floorMod(j, j2)) * 1000000);
    }

    private static Instant r(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return super.l(rVar).a(rVar.r(this), rVar);
        }
        int i = d.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.W(this.a);
        }
        throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        int i;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i2 = d.a[((j$.time.temporal.a) rVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (Instant) localDate.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j);
        int i = d.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                if (i3 != i2) {
                    return r(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return r(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.u(b.a("Unsupported field: ", rVar));
                }
                if (j != j2) {
                    return r(j, i2);
                }
            }
        } else if (j != i2) {
            return r(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final Instant i(long j, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (Instant) tVar.p(this, j);
        }
        switch (d.b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return H(0L, j);
            case 2:
                return H(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return H(j / 1000, (j % 1000) * 1000000);
            case 4:
                return H(j, 0L);
            case 5:
                return H(Math.multiplyExact(j, 60), 0L);
            case 6:
                return H(Math.multiplyExact(j, 3600), 0L);
            case 7:
                return H(Math.multiplyExact(j, 43200), 0L);
            case 8:
                return H(Math.multiplyExact(j, 86400), 0L);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    private Instant H(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, tVar).i(1L, tVar) : i(-j, tVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        if (temporalQuery == j$.time.temporal.s.a() || temporalQuery == j$.time.temporal.s.g() || temporalQuery == j$.time.temporal.s.f() || temporalQuery == j$.time.temporal.s.d() || temporalQuery == j$.time.temporal.s.b() || temporalQuery == j$.time.temporal.s.c()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(this.a, j$.time.temporal.a.INSTANT_SECONDS).e(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.A(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j = this.a;
        int i = this.b;
        return (j >= 0 || i <= 0) ? Math.addExact(Math.multiplyExact(j, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), i / 1000000) : Math.addExact(Math.multiplyExact(j + 1, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), (i / 1000000) - CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new p((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void R(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }
}
