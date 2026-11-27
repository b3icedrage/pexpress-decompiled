package j$.time;

import j$.time.chrono.ChronoLocalDate;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.q, Serializable {
    public static final o d = new o(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        c.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public static o b(int i) {
        if (i == 0) {
            return d;
        }
        return new o(0, 0, i);
    }

    private o(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.c;
    }

    public final long d() {
        return (((long) this.a) * 12) + ((long) this.b);
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDateI;
        j$.time.chrono.l lVar = (j$.time.chrono.l) chronoLocalDate.b(j$.time.temporal.s.a());
        if (lVar == null || j$.time.chrono.s.d.equals(lVar)) {
            if (this.b == 0) {
                int i = this.a;
                chronoLocalDateI = chronoLocalDate;
                if (i != 0) {
                    chronoLocalDateI = chronoLocalDate.i(i, (j$.time.temporal.t) j$.time.temporal.b.YEARS);
                }
            } else {
                long jD = d();
                chronoLocalDateI = chronoLocalDate;
                if (jD != 0) {
                    chronoLocalDateI = chronoLocalDate.i(jD, (j$.time.temporal.t) j$.time.temporal.b.MONTHS);
                }
            }
            int i2 = this.c;
            return i2 != 0 ? chronoLocalDateI.i(i2, (j$.time.temporal.t) j$.time.temporal.b.DAYS) : chronoLocalDateI;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + lVar.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a == oVar.a && this.b == oVar.b && this.c == oVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
    }

    static o c(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        int i2 = objectInput.readInt();
        int i3 = objectInput.readInt();
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new o(i, i2, i3);
    }
}
