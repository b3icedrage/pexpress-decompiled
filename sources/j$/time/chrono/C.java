package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC4567c {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient LocalDate a;

    C(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l h() {
        return A.d;
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        A.d.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m t() {
        return R() >= 1 ? D.ROC : D.BEFORE_ROC;
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
        int i = B.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(rVar);
        }
        if (i != 4) {
            return A.d.S(aVar);
        }
        j$.time.temporal.v vVarA = j$.time.temporal.a.YEAR.A();
        return j$.time.temporal.v.j(1L, R() <= 0 ? (-vVarA.e()) + 1912 : vVarA.d() - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = B.a[((j$.time.temporal.a) rVar).ordinal()];
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
        return this.a.W() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C e(long j, j$.time.temporal.r rVar) {
        int iA;
        int i;
        int i2;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (f(aVar) == j) {
                return this;
            }
            int[] iArr = B.a;
            int i3 = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i3 == 4) {
                iA = A.d.S(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    if (R() >= 1) {
                        i2 = iA + 1911;
                    } else {
                        i2 = 1912 - iA;
                    }
                    return W(localDate.n0(i2));
                }
                if (i != 6) {
                    return W(localDate.n0(iA + 1911));
                }
                if (i == 7) {
                    return W(localDate.n0(1912 - R()));
                }
            } else {
                if (i3 == 5) {
                    A.d.S(aVar).b(j, aVar);
                    return W(localDate.g0(j - (((((long) R()) * 12) + ((long) localDate.T())) - 1)));
                }
                if (i3 == 6 || i3 == 7) {
                    iA = A.d.S(aVar).a(j, aVar);
                    i = iArr[aVar.ordinal()];
                    if (i != 4) {
                        if (R() >= 1) {
                            i2 = iA + 1911;
                        } else {
                            i2 = 1912 - iA;
                        }
                        return W(localDate.n0(i2));
                    }
                    if (i != 6) {
                        return W(localDate.n0(iA + 1911));
                    }
                    if (i == 7) {
                        return W(localDate.n0(1912 - R()));
                    }
                }
            }
            return W(localDate.e(j, rVar));
        }
        return (C) super.e(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (C) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (C) super.m(nVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.q qVar) {
        return (C) super.K(qVar);
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
        return (C) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.t tVar) {
        return (C) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate a(long j, j$.time.temporal.t tVar) {
        return (C) super.a(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return (C) super.a(j, tVar);
    }

    private C W(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new C(localDate);
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
        if (obj instanceof C) {
            return this.a.equals(((C) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 7, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final InterfaceC4568d I(LocalTime localTime) {
        return C4570f.A(this, localTime);
    }
}
