package j$.time.chrono;

import j$.time.DateTimeException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4571g implements j$.time.temporal.q, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final l a;
    final int b;
    final int c;
    final int d;

    static {
        j$.time.c.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C4571g(l lVar, int i, int i2, int i3) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        l lVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return lVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(ChronoLocalDate chronoLocalDate) {
        l lVar = (l) chronoLocalDate.b(j$.time.temporal.s.a());
        l lVar2 = this.a;
        if (lVar == null || lVar2.equals(lVar)) {
            int i = this.b;
            int i2 = this.c;
            j$.time.temporal.m mVarI = chronoLocalDate;
            if (i2 != 0) {
                j$.time.temporal.v vVarS = lVar2.S(j$.time.temporal.a.MONTH_OF_YEAR);
                long jD = (vVarS.g() && vVarS.h()) ? (vVarS.d() - vVarS.e()) + 1 : -1L;
                ChronoLocalDate chronoLocalDateI = chronoLocalDate;
                if (jD > 0) {
                    mVarI = chronoLocalDate.i((((long) i) * jD) + ((long) i2), (j$.time.temporal.t) j$.time.temporal.b.MONTHS);
                } else {
                    if (i != 0) {
                        chronoLocalDateI = chronoLocalDate.i(i, (j$.time.temporal.t) j$.time.temporal.b.YEARS);
                    }
                    mVarI = chronoLocalDateI.i(i2, (j$.time.temporal.t) j$.time.temporal.b.MONTHS);
                }
            } else if (i != 0) {
                mVarI = chronoLocalDate.i(i, (j$.time.temporal.t) j$.time.temporal.b.YEARS);
            }
            int i3 = this.d;
            return i3 != 0 ? mVarI.i(i3, j$.time.temporal.b.DAYS) : mVarI;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + lVar2.getId() + ", actual: " + lVar.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4571g) {
            C4571g c4571g = (C4571g) obj;
            if (this.b == c4571g.b && this.c == c4571g.c && this.d == c4571g.d && this.a.equals(c4571g.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    protected Object writeReplace() {
        return new E((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.a.getId());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }
}
