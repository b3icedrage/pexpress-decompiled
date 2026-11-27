package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1646Nw implements Iterable<Byte>, Serializable {
    public static final e e = new e(XB0.b);
    public int d = 0;

    /* JADX INFO: renamed from: Nw$a */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C1410Kw c1410Kw = (C1410Kw) this;
            int i = c1410Kw.d;
            if (i >= c1410Kw.e) {
                throw new NoSuchElementException();
            }
            c1410Kw.d = i + 1;
            return Byte.valueOf(c1410Kw.g.c(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: Nw$b */
    public static final class b {
    }

    /* JADX INFO: renamed from: Nw$c */
    public static final class c extends e {
        public final int h;
        public final int i;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC1646Nw.b(i, i + i2, bArr.length);
            this.h = i;
            this.i = i2;
        }

        @Override // defpackage.AbstractC1646Nw.e, defpackage.AbstractC1646Nw
        public final byte a(int i) {
            int i2 = this.i;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.g[this.h + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(EK.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(C4564j.c(i, i2, "Index > length: ", ", "));
        }

        @Override // defpackage.AbstractC1646Nw.e, defpackage.AbstractC1646Nw
        public final byte c(int i) {
            return this.g[this.h + i];
        }

        @Override // defpackage.AbstractC1646Nw.e
        public final int j() {
            return this.h;
        }

        @Override // defpackage.AbstractC1646Nw.e, defpackage.AbstractC1646Nw
        public final int size() {
            return this.i;
        }
    }

    /* JADX INFO: renamed from: Nw$d */
    public static abstract class d extends AbstractC1646Nw {
        @Override // defpackage.AbstractC1646Nw, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C1410Kw(this);
        }
    }

    /* JADX INFO: renamed from: Nw$e */
    public static class e extends d {
        public final byte[] g;

        public e(byte[] bArr) {
            bArr.getClass();
            this.g = bArr;
        }

        @Override // defpackage.AbstractC1646Nw
        public byte a(int i) {
            return this.g[i];
        }

        @Override // defpackage.AbstractC1646Nw
        public byte c(int i) {
            return this.g[i];
        }

        @Override // defpackage.AbstractC1646Nw
        public final boolean d() {
            int iJ = j();
            return C5757oc2.a.b(this.g, iJ, size() + iJ) == 0;
        }

        @Override // defpackage.AbstractC1646Nw
        public final int e(int i, int i2) {
            int iJ = j();
            Charset charset = XB0.a;
            for (int i3 = iJ; i3 < iJ + i2; i3++) {
                i = (i * 31) + this.g[i3];
            }
            return i;
        }

        @Override // defpackage.AbstractC1646Nw
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1646Nw) || size() != ((AbstractC1646Nw) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof e)) {
                return obj.equals(this);
            }
            e eVar = (e) obj;
            int i = this.d;
            int i2 = eVar.d;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > eVar.size()) {
                StringBuilder sbC = C1332Jw.c(size, "Ran off end of other: 0, ", ", ");
                sbC.append(eVar.size());
                throw new IllegalArgumentException(sbC.toString());
            }
            int iJ = j() + size;
            int iJ2 = j();
            int iJ3 = eVar.j();
            while (iJ2 < iJ) {
                if (this.g[iJ2] != eVar.g[iJ3]) {
                    return false;
                }
                iJ2++;
                iJ3++;
            }
            return true;
        }

        @Override // defpackage.AbstractC1646Nw
        public final e f(int i) {
            int iB = AbstractC1646Nw.b(0, i, size());
            if (iB == 0) {
                return AbstractC1646Nw.e;
            }
            return new c(this.g, j(), iB);
        }

        @Override // defpackage.AbstractC1646Nw
        public final String h(Charset charset) {
            return new String(this.g, j(), size(), charset);
        }

        @Override // defpackage.AbstractC1646Nw
        public final void i(HE.a aVar) {
            aVar.K(this.g, j(), size());
        }

        public int j() {
            return 0;
        }

        @Override // defpackage.AbstractC1646Nw
        public int size() {
            return this.g.length;
        }
    }

    /* JADX INFO: renamed from: Nw$f */
    public static final class f {
    }

    static {
        C1970Sa.a();
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C1332Jw.a(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C4564j.c(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(C4564j.c(i2, i3, "End index: ", " >= "));
    }

    public abstract byte a(int i);

    public abstract byte c(int i);

    public abstract boolean d();

    public abstract int e(int i, int i2);

    public abstract boolean equals(Object obj);

    public abstract e f(int i);

    public abstract String h(Charset charset);

    public final int hashCode() {
        int iE = this.d;
        if (iE == 0) {
            int size = size();
            iE = e(size, size);
            if (iE == 0) {
                iE = 1;
            }
            this.d = iE;
        }
        return iE;
    }

    public abstract void i(HE.a aVar);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C1410Kw(this);
    }

    public abstract int size();

    public final String toString() {
        String strC;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strC = C7652xe.c(this);
        } else {
            strC = C7652xe.c(f(47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return C5807oq.b(sb, strC, "\">");
    }
}
