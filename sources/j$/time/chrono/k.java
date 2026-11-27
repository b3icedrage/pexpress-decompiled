package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class k implements InterfaceC4573i, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C4570f a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    static InterfaceC4573i A(ZoneId zoneId, ZoneOffset zoneOffset, C4570f c4570f) {
        Objects.requireNonNull(c4570f, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, c4570f);
        }
        j$.time.zone.f fVarR = zoneId.r();
        LocalDateTime localDateTimeA = LocalDateTime.A(c4570f);
        List listG = fVarR.g(localDateTimeA);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarR.f(localDateTimeA);
            c4570f = c4570f.Q(bVarF.A().H());
            zoneOffset = bVarF.H();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, c4570f);
    }

    static k H(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.r().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new k(zoneId, zoneOffsetD, (C4570f) lVar.v(LocalDateTime.a0(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    static k r(l lVar, j$.time.temporal.m mVar) {
        k kVar = (k) mVar;
        if (lVar.equals(kVar.h())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.getId() + ", actual: " + kVar.h().getId());
    }

    private k(ZoneId zoneId, ZoneOffset zoneOffset, C4570f c4570f) {
        Objects.requireNonNull(c4570f, "dateTime");
        this.a = c4570f;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final ZoneOffset C() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final InterfaceC4568d z() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final ZoneId O() {
        return this.c;
    }

    @Override // j$.time.chrono.InterfaceC4573i
    public final InterfaceC4573i G(ZoneId zoneId) {
        return A(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = AbstractC4574j.a[aVar.ordinal()];
            if (i == 1) {
                return i(j - M(), j$.time.temporal.b.SECONDS);
            }
            ZoneId zoneId = this.c;
            C4570f c4570f = this.a;
            if (i != 2) {
                return A(zoneId, this.b, c4570f.e(j, rVar));
            }
            return H(h(), Instant.ofEpochSecond(c4570f.V(ZoneOffset.ofTotalSeconds(aVar.W(j))), c4570f.n().R()), zoneId);
        }
        return r(h(), rVar.p(this, j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4573i i(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return m(this.a.i(j, tVar));
        }
        return r(h(), tVar.p(this, j));
    }

    private Object writeReplace() {
        return new E((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC4573i) && compareTo((InterfaceC4573i) obj) == 0;
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
}
