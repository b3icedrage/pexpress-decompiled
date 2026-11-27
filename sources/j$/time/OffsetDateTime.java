package j$.time;

import com.appsflyer.sdk_base.referrer.Payload;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iR;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            iR = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            long jV = localDateTime.V(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.b;
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            int iCompare = Long.compare(jV, localDateTime2.V(zoneOffset3));
            iR = iCompare == 0 ? localDateTime.n().R() - localDateTime2.n().R() : iCompare;
        }
        return iR == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iR;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        r(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        r(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime r(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime A(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, Payload.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.r().d(instant);
        return new OffsetDateTime(LocalDateTime.a0(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).A();
            }
            return this.a.l(rVar);
        }
        return rVar.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(rVar);
        }
        return super.j(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = m.a[((j$.time.temporal.a) rVar).ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return localDateTime.V(zoneOffset);
            }
            if (i == 2) {
                return zoneOffset.getTotalSeconds();
            }
            return localDateTime.f(rVar);
        }
        return rVar.r(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return R(this.a.h0(localDate), this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = m.a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return A(Instant.ofEpochSecond(j, localDateTime.H()), zoneOffset);
            }
            if (i == 2) {
                return R(localDateTime, ZoneOffset.ofTotalSeconds(aVar.W(j)));
            }
            return R(localDateTime.e(j, rVar), zoneOffset);
        }
        return (OffsetDateTime) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime i(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return R(this.a.i(j, tVar), this.b);
        }
        return (OffsetDateTime) tVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, tVar).i(1L, tVar) : i(-j, tVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.d() || temporalQuery == j$.time.temporal.s.f()) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.s.g()) {
            return null;
        }
        TemporalQuery temporalQueryB = j$.time.temporal.s.b();
        LocalDateTime localDateTime = this.a;
        if (temporalQuery == temporalQueryB) {
            return localDateTime.f0();
        }
        if (temporalQuery == j$.time.temporal.s.c()) {
            return localDateTime.n();
        }
        if (temporalQuery == j$.time.temporal.s.a()) {
            return j$.time.chrono.s.d;
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return mVar.e(localDateTime.f0().toEpochDay(), aVar).e(localDateTime.n().f0(), j$.time.temporal.a.NANO_OF_DAY).e(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.j0(objectOutput);
        this.b.a0(objectOutput);
    }

    static OffsetDateTime Q(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.MIN;
        return new OffsetDateTime(LocalDateTime.Z(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput)), ZoneOffset.Z(objectInput));
    }
}
