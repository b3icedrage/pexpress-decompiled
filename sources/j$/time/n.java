package j$.time;

import defpackage.C1575Mz0;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final LocalTime a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        ZoneOffset zoneOffset = nVar.b;
        ZoneOffset zoneOffset2 = this.b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        LocalTime localTime = nVar.a;
        LocalTime localTime2 = this.a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(localTime2.f0() - (((long) zoneOffset2.getTotalSeconds()) * 1000000000), localTime.f0() - (((long) nVar.b.getTotalSeconds()) * 1000000000));
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new n(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new n(localTime2, zoneOffset2);
    }

    private n(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, C1575Mz0.TIME);
        this.a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private n H(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new n(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() || rVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).A();
            }
            return this.a.l(rVar);
        }
        return rVar.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.f(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (n) localDate.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            LocalTime localTime = this.a;
            if (rVar == aVar) {
                return H(localTime, ZoneOffset.ofTotalSeconds(((j$.time.temporal.a) rVar).W(j)));
            }
            return H(localTime.e(j, rVar), this.b);
        }
        return (n) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final n i(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return H(this.a.i(j, tVar), this.b);
        }
        return (n) tVar.p(this, j);
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
        if (((temporalQuery == j$.time.temporal.s.g()) || (temporalQuery == j$.time.temporal.s.a())) || temporalQuery == j$.time.temporal.s.b()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.c()) {
            return this.a;
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(this.a.f0(), j$.time.temporal.a.NANO_OF_DAY).e(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a.equals(nVar.a) && this.b.equals(nVar.b)) {
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
        return new p((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.i0(objectOutput);
        this.b.a0(objectOutput);
    }

    static n A(ObjectInput objectInput) {
        return new n(LocalTime.e0(objectInput), ZoneOffset.Z(objectInput));
    }
}
