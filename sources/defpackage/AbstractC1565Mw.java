package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1565Mw implements Iterable<Byte>, Serializable {
    public static final f e = new f(VB0.b);
    public static final d g;
    public int d = 0;

    /* JADX INFO: renamed from: Mw$a */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C1487Lw c1487Lw = (C1487Lw) this;
            int i = c1487Lw.d;
            if (i >= c1487Lw.e) {
                throw new NoSuchElementException();
            }
            c1487Lw.d = i + 1;
            return Byte.valueOf(c1487Lw.g.e(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: Mw$b */
    public static final class b implements d {
        @Override // defpackage.AbstractC1565Mw.d
        public final byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* JADX INFO: renamed from: Mw$c */
    public static final class c extends f {
        public final int i;
        public final int j;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC1565Mw.b(i, i + i2, bArr.length);
            this.i = i;
            this.j = i2;
        }

        @Override // defpackage.AbstractC1565Mw.f, defpackage.AbstractC1565Mw
        public final byte a(int i) {
            int i2 = this.j;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.h[this.i + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(EK.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(C4564j.c(i, i2, "Index > length: ", ", "));
        }

        @Override // defpackage.AbstractC1565Mw.f, defpackage.AbstractC1565Mw
        public final void d(int i, byte[] bArr) {
            System.arraycopy(this.h, this.i, bArr, 0, i);
        }

        @Override // defpackage.AbstractC1565Mw.f, defpackage.AbstractC1565Mw
        public final byte e(int i) {
            return this.h[this.i + i];
        }

        @Override // defpackage.AbstractC1565Mw.f
        public final int j() {
            return this.i;
        }

        @Override // defpackage.AbstractC1565Mw.f, defpackage.AbstractC1565Mw
        public final int size() {
            return this.j;
        }
    }

    /* JADX INFO: renamed from: Mw$d */
    public interface d {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: Mw$e */
    public static abstract class e extends AbstractC1565Mw {
        @Override // defpackage.AbstractC1565Mw, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C1487Lw(this);
        }
    }

    /* JADX INFO: renamed from: Mw$f */
    public static class f extends e {
        public final byte[] h;

        public f(byte[] bArr) {
            bArr.getClass();
            this.h = bArr;
        }

        @Override // defpackage.AbstractC1565Mw
        public byte a(int i) {
            return this.h[i];
        }

        @Override // defpackage.AbstractC1565Mw
        public void d(int i, byte[] bArr) {
            System.arraycopy(this.h, 0, bArr, 0, i);
        }

        @Override // defpackage.AbstractC1565Mw
        public byte e(int i) {
            return this.h[i];
        }

        @Override // defpackage.AbstractC1565Mw
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1565Mw) || size() != ((AbstractC1565Mw) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i = this.d;
            int i2 = fVar.d;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > fVar.size()) {
                StringBuilder sbC = C1332Jw.c(size, "Ran off end of other: 0, ", ", ");
                sbC.append(fVar.size());
                throw new IllegalArgumentException(sbC.toString());
            }
            int iJ = j() + size;
            int iJ2 = j();
            int iJ3 = fVar.j();
            while (iJ2 < iJ) {
                if (this.h[iJ2] != fVar.h[iJ3]) {
                    return false;
                }
                iJ2++;
                iJ3++;
            }
            return true;
        }

        @Override // defpackage.AbstractC1565Mw
        public final int f(int i, int i2) {
            int iJ = j();
            Charset charset = VB0.a;
            for (int i3 = iJ; i3 < iJ + i2; i3++) {
                i = (i * 31) + this.h[i3];
            }
            return i;
        }

        @Override // defpackage.AbstractC1565Mw
        public final f h(int i) {
            int iB = AbstractC1565Mw.b(0, i, size());
            if (iB == 0) {
                return AbstractC1565Mw.e;
            }
            return new c(this.h, j(), iB);
        }

        @Override // defpackage.AbstractC1565Mw
        public final void i(GE ge) {
            ge.v(this.h, j(), size());
        }

        public int j() {
            return 0;
        }

        @Override // defpackage.AbstractC1565Mw
        public int size() {
            return this.h.length;
        }
    }

    /* JADX INFO: renamed from: Mw$g */
    public static final class g implements d {
        @Override // defpackage.AbstractC1565Mw.d
        public final byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        g = C2048Ta.a() ? new g() : new b();
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

    public static f c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new f(g.a(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract void d(int i, byte[] bArr);

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract int f(int i, int i2);

    public abstract f h(int i);

    public final int hashCode() {
        int iF = this.d;
        if (iF == 0) {
            int size = size();
            iF = f(size, size);
            if (iF == 0) {
                iF = 1;
            }
            this.d = iF;
        }
        return iF;
    }

    public abstract void i(GE ge);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C1487Lw(this);
    }

    public abstract int size();

    public final String toString() {
        String strC;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strC = C3057c.c(this);
        } else {
            strC = C3057c.c(h(47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return C5807oq.b(sb, strC, "\">");
    }
}
