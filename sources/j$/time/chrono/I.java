package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC4567c {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient LocalDate a;

    I(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l h() {
        return G.d;
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        G.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m t() {
        return R() >= 1 ? J.BE : J.BEFORE_BE;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.H(this);
        }
        if (!d(rVar)) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = H.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(rVar);
        }
        if (i != 4) {
            return G.d.S(aVar);
        }
        j$.time.temporal.v vVarA = j$.time.temporal.a.YEAR.A();
        return j$.time.temporal.v.j(1L, R() <= 0 ? (-(vVarA.e() + 543)) + 1 : 543 + vVarA.d());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = H.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 4) {
                int iR = R();
                if (iR < 1) {
                    iR = 1 - iR;
                }
                return iR;
            }
            LocalDate localDate = this.a;
            if (i == 5) {
                return ((((long) R()) * 12) + ((long) localDate.T())) - 1;
            }
            if (i == 6) {
                return R();
            }
            if (i != 7) {
                return localDate.f(rVar);
            }
            return R() < 1 ? 0 : 1;
        }
        return rVar.r(this);
    }

    private int R() {
        return this.a.W() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final I e(long j, j$.time.temporal.r rVar) {
        int iA;
        int i;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (f(aVar) == j) {
                return this;
            }
            int[] iArr = H.a;
            int i2 = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i2 == 4) {
                iA = G.d.S(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    if (R() < 1) {
                        iA = 1 - iA;
                    }
                    return W(localDate.n0(iA - 543));
                }
                if (i != 6) {
                    return W(localDate.n0(iA - 543));
                }
                if (i == 7) {
                    return W(localDate.n0((-542) - R()));
                }
            } else {
                if (i2 == 5) {
                    G.d.S(aVar).b(j, aVar);
                    return W(localDate.g0(j - (((((long) R()) * 12) + ((long) localDate.T())) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                    iA = G.d.S(aVar).a(j, aVar);
                    i = iArr[aVar.ordinal()];
                    if (i != 4) {
                        if (R() < 1) {
                            iA = 1 - iA;
                        }
                        return W(localDate.n0(iA - 543));
                    }
                    if (i != 6) {
                        return W(localDate.n0(iA - 543));
                    }
                    if (i == 7) {
                        return W(localDate.n0((-542) - R()));
                    }
                }
            }
            return W(localDate.e(j, rVar));
        }
        return (I) super.e(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (I) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (I) super.m(nVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.q qVar) {
        return (I) super.K(qVar);
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate Q(long j) {
        return W(this.a.i0(j));
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate H(long j) {
        return W(this.a.g0(j));
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate A(long j) {
        return W(this.a.f0(j));
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate i(long j, j$.time.temporal.t tVar) {
        return (I) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.t tVar) {
        return (I) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate a(long j, j$.time.temporal.t tVar) {
        return (I) super.a(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return (I) super.a(j, tVar);
    }

    private I W(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new I(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.a.equals(((I) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 8, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final InterfaceC4568d I(LocalTime localTime) {
        return C4570f.A(this, localTime);
    }
}
