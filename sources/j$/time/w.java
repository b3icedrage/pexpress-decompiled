package j$.time;

import com.appsflyer.sdk_base.referrer.Payload;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.InterfaceC4568d;
import j$.time.chrono.InterfaceC4573i;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements j$.time.temporal.m, InterfaceC4573i, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    public static w H(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new w(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarR = zoneId.r();
        List listG = fVarR.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarR.f(localDateTime);
            localDateTime = localDateTime.d0(bVarF.A().H());
            zoneOffset = bVarF.H();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new w(localDateTime, zoneId, zoneOffset);
    }

    public static w A(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, Payload.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        return r(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    private static w r(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.r().d(Instant.ofEpochSecond(j, i));
        return new w(LocalDateTime.a0(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    private w(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
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
            int i = v.a[((j$.time.temporal.a) rVar).ordinal()];
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
            int i = v.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                return M();
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.f(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final ZoneOffset C() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final ZoneId O() {
        return this.c;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final InterfaceC4573i G(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : H(this.a, zoneId, this.b);
    }

    public final LocalDateTime T() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final InterfaceC4568d z() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final ChronoLocalDate o() {
        return this.a.f0();
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final LocalTime n() {
        return this.a.n();
    }

    @Override // j$.time.chrono.InterfaceC4573i
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final w m(LocalDate localDate) {
        return H(LocalDateTime.Z(localDate, this.a.n()), this.c, this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = v.a[aVar.ordinal()];
            LocalDateTime localDateTime = this.a;
            ZoneId zoneId = this.c;
            if (i == 1) {
                return r(j, localDateTime.H(), zoneId);
            }
            ZoneOffset zoneOffset = this.b;
            if (i != 2) {
                return H(localDateTime.e(j, rVar), zoneId, zoneOffset);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(aVar.W(j));
            return (zoneOffsetOfTotalSeconds.equals(zoneOffset) || !zoneId.r().g(localDateTime).contains(zoneOffsetOfTotalSeconds)) ? this : new w(localDateTime, zoneId, zoneOffsetOfTotalSeconds);
        }
        return (w) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final w i(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
            int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return H(localDateTime.i(j, tVar), zoneId, zoneOffset);
            }
            LocalDateTime localDateTimeI = localDateTime.i(j, tVar);
            Objects.requireNonNull(localDateTimeI, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.r().g(localDateTimeI).contains(zoneOffset)) {
                return new w(localDateTimeI, zoneId, zoneOffset);
            }
            return r(localDateTimeI.V(zoneOffset), localDateTimeI.H(), zoneId);
        }
        return (w) tVar.p(this, j);
    }

    @Override // j$.time.chrono.InterfaceC4573i
    /* JADX INFO: renamed from: k */
    public final InterfaceC4573i a(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.b()) {
            return this.a.f0();
        }
        return super.b(temporalQuery);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.a.equals(wVar.a) && this.b.equals(wVar.b) && this.c.equals(wVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new p((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void X(DataOutput dataOutput) {
        this.a.j0(dataOutput);
        this.b.a0(dataOutput);
        this.c.T((ObjectOutput) dataOutput);
    }

    static w R(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.MIN;
        LocalDateTime localDateTimeZ = LocalDateTime.Z(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput));
        ZoneOffset zoneOffsetZ = ZoneOffset.Z(objectInput);
        ZoneId zoneId = (ZoneId) p.a(objectInput);
        Objects.requireNonNull(zoneOffsetZ, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !zoneOffsetZ.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new w(localDateTimeZ, zoneId, zoneOffsetZ);
    }
}
