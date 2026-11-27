package j$.time.chrono;

import defpackage.C1575Mz0;
import defpackage.JI1;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4570f implements InterfaceC4568d, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient ChronoLocalDate a;
    private final transient LocalTime b;

    static C4570f A(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        return new C4570f(chronoLocalDate, localTime);
    }

    static C4570f r(l lVar, j$.time.temporal.m mVar) {
        C4570f c4570f = (C4570f) mVar;
        if (lVar.equals(c4570f.h())) {
            return c4570f;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.getId() + ", actual: " + c4570f.h().getId());
    }

    private C4570f(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, C1575Mz0.TIME);
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    private C4570f W(j$.time.temporal.m mVar, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == mVar && this.b == localTime) ? this : new C4570f(AbstractC4567c.r(chronoLocalDate.h(), mVar), localTime);
    }

    @Override // j$.time.chrono.InterfaceC4568d
    public final ChronoLocalDate o() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC4568d
    public final LocalTime n() {
        return this.b;
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
            return (((j$.time.temporal.a) rVar).Y() ? this.b : this.a).l(rVar);
        }
        return rVar.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.b.j(rVar) : this.a.j(rVar);
        }
        return l(rVar).a(f(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.b.f(rVar) : this.a.f(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return W(localDate, this.b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C4570f e(long j, j$.time.temporal.r rVar) {
        boolean z = rVar instanceof j$.time.temporal.a;
        ChronoLocalDate chronoLocalDate = this.a;
        if (z) {
            boolean zY = ((j$.time.temporal.a) rVar).Y();
            LocalTime localTime = this.b;
            if (zY) {
                return W(chronoLocalDate, localTime.e(j, rVar));
            }
            return W(chronoLocalDate.e(j, rVar), localTime);
        }
        return r(chronoLocalDate.h(), rVar.p(this, j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final C4570f i(long j, j$.time.temporal.t tVar) {
        boolean z = tVar instanceof j$.time.temporal.b;
        ChronoLocalDate chronoLocalDate = this.a;
        if (z) {
            int i = AbstractC4569e.a[((j$.time.temporal.b) tVar).ordinal()];
            LocalTime localTime = this.b;
            switch (i) {
                case 1:
                    return R(this.a, 0L, 0L, 0L, j);
                case 2:
                    C4570f c4570fW = W(chronoLocalDate.i(j / 86400000000L, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTime);
                    return c4570fW.R(c4570fW.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C4570f c4570fW2 = W(chronoLocalDate.i(j / 86400000, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTime);
                    return c4570fW2.R(c4570fW2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return Q(j);
                case 5:
                    return R(this.a, 0L, j, 0L, 0L);
                case 6:
                    return R(this.a, j, 0L, 0L, 0L);
                case 7:
                    C4570f c4570fW3 = W(chronoLocalDate.i(j / 256, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTime);
                    return c4570fW3.R(c4570fW3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return W(chronoLocalDate.i(j, tVar), localTime);
            }
        }
        return r(chronoLocalDate.h(), tVar.p(this, j));
    }

    final C4570f Q(long j) {
        return R(this.a, 0L, 0L, j, 0L);
    }

    private C4570f R(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeX = this.b;
        if (j5 == 0) {
            return W(chronoLocalDate, localTimeX);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = j7 + j6 + (j3 / JI1.SECONDS_IN_A_DAY) + (j4 / 86400000000000L);
        long j9 = (j2 % 1440) * 60000000000L;
        long j10 = ((j % 24) * 3600000000000L) + j9 + ((j3 % JI1.SECONDS_IN_A_DAY) * 1000000000) + (j4 % 86400000000000L);
        long jF0 = localTimeX.f0();
        long j11 = j10 + jF0;
        long jFloorDiv = Math.floorDiv(j11, 86400000000000L) + j8;
        long jFloorMod = Math.floorMod(j11, 86400000000000L);
        if (jFloorMod != jF0) {
            localTimeX = LocalTime.X(jFloorMod);
        }
        return W(chronoLocalDate.i(jFloorDiv, (j$.time.temporal.t) j$.time.temporal.b.DAYS), localTimeX);
    }

    @Override // j$.time.chrono.InterfaceC4568d
    public final InterfaceC4573i F(ZoneId zoneId) {
        return k.A(zoneId, null, this);
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC4568d) && compareTo((InterfaceC4568d) obj) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
