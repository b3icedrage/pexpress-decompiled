package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC4565a implements Serializable {
    public static final A d = new A();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.l
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m L(int i) {
        if (i == 0) {
            return D.BEFORE_ROC;
        }
        if (i == 1) {
            return D.ROC;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String P() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate E(int i, int i2, int i3) {
        return new C(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate y(int i, int i2) {
        return new C(LocalDate.d0(i + 1911, i2));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(long j) {
        return new C(LocalDate.c0(j));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate J() {
        return new C(LocalDate.H(LocalDate.a0(Clock.b())));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C) {
            return (C) temporalAccessor;
        }
        return new C(LocalDate.H(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int u(m mVar, int i) {
        if (mVar instanceof D) {
            return mVar == D.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.l
    public final List B() {
        return j$.time.c.a(D.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v S(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.v vVarA = j$.time.temporal.a.PROLEPTIC_MONTH.A();
            return j$.time.temporal.v.j(vVarA.e() - 22932, vVarA.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.v vVarA2 = j$.time.temporal.a.YEAR.A();
            return j$.time.temporal.v.k(vVarA2.d() - 1911, (-vVarA2.e()) + 1912);
        }
        if (i == 3) {
            j$.time.temporal.v vVarA3 = j$.time.temporal.a.YEAR.A();
            return j$.time.temporal.v.j(vVarA3.e() - 1911, vVarA3.d() - 1911);
        }
        return aVar.A();
    }

    @Override // j$.time.chrono.AbstractC4565a, j$.time.chrono.l
    public final ChronoLocalDate N(Map map, j$.time.format.w wVar) {
        return (C) super.N(map, wVar);
    }

    private A() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final InterfaceC4573i w(Instant instant, ZoneId zoneId) {
        return k.H(this, instant, zoneId);
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
