package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC4567c {
    static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient LocalDate a;
    private transient y b;
    private transient int c;

    x(LocalDate localDate) {
        if (localDate.X(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        y yVarQ = y.q(localDate);
        this.b = yVarQ;
        this.c = (localDate.W() - yVarQ.s().W()) + 1;
        this.a = localDate;
    }

    x(y yVar, int i, LocalDate localDate) {
        if (localDate.X(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = yVar;
        this.c = i;
        this.a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l h() {
        return v.d;
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        v.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    public final y R() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m t() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).R();
        }
        return rVar != null && rVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        int iR;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.H(this);
        }
        if (!d(rVar)) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = w.a[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 1) {
            return j$.time.temporal.v.j(1L, localDate.Z());
        }
        y yVar = this.b;
        if (i != 2) {
            if (i != 3) {
                return v.d.S(aVar);
            }
            int iW = yVar.s().W();
            y yVarU = yVar.u();
            return yVarU != null ? j$.time.temporal.v.j(1L, (yVarU.s().W() - iW) + 1) : j$.time.temporal.v.j(1L, 999999999 - iW);
        }
        y yVarU2 = yVar.u();
        if (yVarU2 == null || yVarU2.s().W() != localDate.W()) {
            iR = localDate.Y() ? 366 : 365;
        } else {
            iR = yVarU2.s().R() - 1;
        }
        if (this.c == 1) {
            iR -= yVar.s().R() - 1;
        }
        return j$.time.temporal.v.j(1L, iR);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i = w.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.R() - yVar.s().R()) + 1 : localDate.R();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
            case 8:
                return yVar.p();
            default:
                return localDate.f(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final x e(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (f(aVar) == j) {
                return this;
            }
            int[] iArr = w.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                v vVar = v.d;
                int iA = vVar.S(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return X(localDate.n0(vVar.u(this.b, iA)));
                }
                if (i2 == 8) {
                    return X(localDate.n0(vVar.u(y.v(iA), this.c)));
                }
                if (i2 == 9) {
                    return X(localDate.n0(iA));
                }
            }
            return X(localDate.e(j, rVar));
        }
        return (x) super.e(j, rVar);
    }

    public final x Y(j$.time.temporal.p pVar) {
        return (x) super.m(pVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (x) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (x) super.m(nVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.q qVar) {
        return (x) super.K(qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final InterfaceC4568d I(LocalTime localTime) {
        return C4570f.A(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate Q(long j) {
        return X(this.a.i0(j));
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate H(long j) {
        return X(this.a.g0(j));
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate A(long j) {
        return X(this.a.f0(j));
    }

    public final x T(long j, j$.time.temporal.b bVar) {
        return (x) super.i(j, (j$.time.temporal.t) bVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate i(long j, j$.time.temporal.t tVar) {
        return (x) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.t tVar) {
        return (x) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate a(long j, j$.time.temporal.t tVar) {
        return (x) super.a(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return (x) super.a(j, tVar);
    }

    private x X(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new x(localDate);
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
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 4, this);
    }
}
