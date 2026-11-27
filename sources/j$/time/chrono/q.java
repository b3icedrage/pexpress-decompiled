package j$.time.chrono;

import defpackage.V31;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC4567c {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient o a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    static q W(o oVar, int i, int i2, int i3) {
        return new q(oVar, i, i2, i3);
    }

    static q X(o oVar, long j) {
        return new q(oVar, j);
    }

    private q(o oVar, int i, int i2, int i3) {
        oVar.a0(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private q(o oVar, long j) {
        int[] iArrB0 = oVar.b0((int) j);
        this.a = oVar;
        this.b = iArrB0[0];
        this.c = iArrB0[1];
        this.d = iArrB0[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l h() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m t() {
        return r.AH;
    }

    public final int T() {
        return this.a.d0(this.b);
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
        int i = p.a[aVar.ordinal()];
        o oVar = this.a;
        if (i == 1) {
            return j$.time.temporal.v.j(1L, oVar.c0(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? oVar.S(aVar) : j$.time.temporal.v.j(1L, 5L);
        }
        return j$.time.temporal.v.j(1L, T());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i = p.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return R();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((R() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((R() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((((long) i4) * 12) + ((long) i2)) - 1;
            case 11:
                return i4;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final q e(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (q) super.e(j, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        o oVar = this.a;
        oVar.S(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return a0(i5, i4, i);
            case 2:
                return A(Math.min(i, T()) - R());
            case 3:
                return A((j - f(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return A(j - ((long) (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1)));
            case 5:
                return A(j - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return A(j - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return A((j - f(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return a0(i5, i, i3);
            case 10:
                return H(j - (((((long) i5) * 12) + ((long) i4)) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return a0(i, i4, i3);
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return a0(i, i4, i3);
            case 13:
                return a0(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
    }

    private q a0(int i, int i2, int i3) {
        o oVar = this.a;
        int iC0 = oVar.c0(i, i2);
        if (i3 > iC0) {
            i3 = iC0;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (q) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (q) super.m(nVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.q qVar) {
        return (q) super.K(qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.a0(this.b, this.c, this.d);
    }

    private int R() {
        return this.a.Z(this.b, this.c) + this.d;
    }

    @Override // j$.time.chrono.AbstractC4567c
    final ChronoLocalDate Q(long j) {
        return j == 0 ? this : a0(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC4567c
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final q H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        return a0(this.a.X(Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC4567c
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final q A(long j) {
        return new q(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate i(long j, j$.time.temporal.t tVar) {
        return (q) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.t tVar) {
        return (q) super.i(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final ChronoLocalDate a(long j, j$.time.temporal.t tVar) {
        return (q) super.a(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return (q) super.a(j, tVar);
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC4567c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final InterfaceC4568d I(LocalTime localTime) {
        return C4570f.A(this, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j(j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j(j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j(j$.time.temporal.a.DAY_OF_MONTH));
    }
}
