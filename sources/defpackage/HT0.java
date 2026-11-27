package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class HT0<E> implements Cloneable {
    public static final Object i = new Object();
    public boolean d;
    public long[] e;
    public Object[] g;
    public int h;

    public HT0() {
        this(10);
    }

    public final void a() {
        int i2 = this.h;
        Object[] objArr = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.h = 0;
        this.d = false;
    }

    public final void b() {
        int i2 = this.h;
        long[] jArr = this.e;
        Object[] objArr = this.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.d = false;
        this.h = i3;
    }

    public final Object clone() {
        try {
            HT0 ht0 = (HT0) super.clone();
            ht0.e = (long[]) this.e.clone();
            ht0.g = (Object[]) this.g.clone();
            return ht0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object d(long j, Long l) {
        Object obj;
        int iC = U0.c(this.e, this.h, j);
        return (iC < 0 || (obj = this.g[iC]) == i) ? l : obj;
    }

    public final long e(int i2) {
        if (this.d) {
            b();
        }
        return this.e[i2];
    }

    public final void g(long j, E e) {
        int iC = U0.c(this.e, this.h, j);
        if (iC >= 0) {
            this.g[iC] = e;
            return;
        }
        int i2 = ~iC;
        int i3 = this.h;
        if (i2 < i3) {
            Object[] objArr = this.g;
            if (objArr[i2] == i) {
                this.e[i2] = j;
                objArr[i2] = e;
                return;
            }
        }
        if (this.d && i3 >= this.e.length) {
            b();
            i2 = ~U0.c(this.e, this.h, j);
        }
        int i4 = this.h;
        if (i4 >= this.e.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = jArr;
            this.g = objArr2;
        }
        int i9 = this.h - i2;
        if (i9 != 0) {
            long[] jArr3 = this.e;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.g;
            System.arraycopy(objArr4, i2, objArr4, i10, this.h - i2);
        }
        this.e[i2] = j;
        this.g[i2] = e;
        this.h++;
    }

    public final void h(long j) {
        int iC = U0.c(this.e, this.h, j);
        if (iC >= 0) {
            Object[] objArr = this.g;
            Object obj = objArr[iC];
            Object obj2 = i;
            if (obj != obj2) {
                objArr[iC] = obj2;
                this.d = true;
            }
        }
    }

    public final int i() {
        if (this.d) {
            b();
        }
        return this.h;
    }

    public final E j(int i2) {
        if (this.d) {
            b();
        }
        return (E) this.g[i2];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            E eJ = j(i2);
            if (eJ != this) {
                sb.append(eJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public HT0(int i2) {
        this.d = false;
        if (i2 == 0) {
            this.e = U0.g;
            this.g = U0.h;
            return;
        }
        int i3 = i2 * 8;
        for (int i4 = 4; i4 < 32; i4++) {
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
        }
        int i6 = i3 / 8;
        this.e = new long[i6];
        this.g = new Object[i6];
    }
}
