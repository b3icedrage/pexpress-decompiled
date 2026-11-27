package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements m, Serializable {
    public static final y d;
    private static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;

    static {
        y yVar = new y(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, LocalDate.of(1912, 7, 30), "Taisho"), new y(1, LocalDate.of(1926, 12, 25), "Showa"), new y(2, LocalDate.of(1989, 1, 8), "Heisei"), new y(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    static y r() {
        y[] yVarArr = e;
        return yVarArr[yVarArr.length - 1];
    }

    static long y() {
        int iW = 1000000000 - r().b.W();
        y[] yVarArr = e;
        int iW2 = yVarArr[0].b.W();
        for (int i = 1; i < yVarArr.length; i++) {
            y yVar = yVarArr[i];
            iW = Math.min(iW, (yVar.b.W() - iW2) + 1);
            iW2 = yVar.b.W();
        }
        return iW;
    }

    static long w() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.A().f();
        for (y yVar : e) {
            jF = Math.min(jF, ((yVar.b.Y() ? 366 : 365) - yVar.b.R()) + 1);
            if (yVar.u() != null) {
                jF = Math.min(jF, yVar.u().b.R() - 1);
            }
        }
        return jF;
    }

    private y(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    final LocalDate s() {
        return this.b;
    }

    public static y v(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    public static y[] A() {
        y[] yVarArr = e;
        return (y[]) Arrays.copyOf(yVarArr, yVarArr.length);
    }

    static y q(LocalDate localDate) {
        if (localDate.X(x.d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        y[] yVarArr = e;
        for (int length = yVarArr.length - 1; length >= 0; length--) {
            y yVar = yVarArr[length];
            if (localDate.compareTo((ChronoLocalDate) yVar.b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int p() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (rVar == aVar) {
            return v.d.S(aVar);
        }
        return super.l(rVar);
    }

    public final String toString() {
        return this.c;
    }

    final y u() {
        if (this == r()) {
            return null;
        }
        return v(this.a + 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 5, this);
    }

    final void B(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.a);
    }
}
