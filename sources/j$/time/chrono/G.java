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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC4565a implements Serializable {
    public static final G d = new G();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m L(int i) {
        if (i == 0) {
            return J.BEFORE_BE;
        }
        if (i == 1) {
            return J.BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String P() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate E(int i, int i2, int i3) {
        return new I(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate y(int i, int i2) {
        return new I(LocalDate.d0(i - 543, i2));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(long j) {
        return new I(LocalDate.c0(j));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate J() {
        return new I(LocalDate.H(LocalDate.a0(Clock.b())));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof I) {
            return (I) temporalAccessor;
        }
        return new I(LocalDate.H(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int u(m mVar, int i) {
        if (mVar instanceof J) {
            return mVar == J.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private G() {
    }

    @Override // j$.time.chrono.l
    public final List B() {
        return j$.time.c.a(J.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v S(j$.time.temporal.a aVar) {
        int i = F.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.v vVarA = j$.time.temporal.a.PROLEPTIC_MONTH.A();
            return j$.time.temporal.v.j(vVarA.e() + 6516, vVarA.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.v vVarA2 = j$.time.temporal.a.YEAR.A();
            return j$.time.temporal.v.k((-(vVarA2.e() + 543)) + 1, vVarA2.d() + 543);
        }
        if (i == 3) {
            j$.time.temporal.v vVarA3 = j$.time.temporal.a.YEAR.A();
            return j$.time.temporal.v.j(vVarA3.e() + 543, vVarA3.d() + 543);
        }
        return aVar.A();
    }

    @Override // j$.time.chrono.AbstractC4565a, j$.time.chrono.l
    public final ChronoLocalDate N(Map map, j$.time.format.w wVar) {
        return (I) super.N(map, wVar);
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
