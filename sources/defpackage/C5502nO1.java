package defpackage;

/* JADX INFO: renamed from: nO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5502nO1<E> implements Cloneable {
    public static final Object i = new Object();
    public boolean d = false;
    public int[] e;
    public Object[] g;
    public int h;

    public C5502nO1() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.e = new int[i5];
        this.g = new Object[i5];
    }

    public final void a(int i2, E e) {
        int i3 = this.h;
        if (i3 != 0 && i2 <= this.e[i3 - 1]) {
            e(i2, e);
            return;
        }
        if (this.d && i3 >= this.e.length) {
            b();
        }
        int i4 = this.h;
        if (i4 >= this.e.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr = new Object[i8];
            int[] iArr2 = this.e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.e = iArr;
            this.g = objArr;
        }
        this.e[i4] = i2;
        this.g[i4] = e;
        this.h = i4 + 1;
    }

    public final void b() {
        int i2 = this.h;
        int[] iArr = this.e;
        Object[] objArr = this.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != i) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
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
            C5502nO1 c5502nO1 = (C5502nO1) super.clone();
            c5502nO1.e = (int[]) this.e.clone();
            c5502nO1.g = (Object[]) this.g.clone();
            return c5502nO1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object d(int i2, Integer num) {
        Object obj;
        int iB = U0.b(this.h, i2, this.e);
        return (iB < 0 || (obj = this.g[iB]) == i) ? num : obj;
    }

    public final void e(int i2, E e) {
        int iB = U0.b(this.h, i2, this.e);
        if (iB >= 0) {
            this.g[iB] = e;
            return;
        }
        int i3 = ~iB;
        int i4 = this.h;
        if (i3 < i4) {
            Object[] objArr = this.g;
            if (objArr[i3] == i) {
                this.e[i3] = i2;
                objArr[i3] = e;
                return;
            }
        }
        if (this.d && i4 >= this.e.length) {
            b();
            i3 = ~U0.b(this.h, i2, this.e);
        }
        int i5 = this.h;
        if (i5 >= this.e.length) {
            int i6 = (i5 + 1) * 4;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr2 = new Object[i9];
            int[] iArr2 = this.e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = iArr;
            this.g = objArr2;
        }
        int i10 = this.h - i3;
        if (i10 != 0) {
            int[] iArr3 = this.e;
            int i11 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i11, i10);
            Object[] objArr4 = this.g;
            System.arraycopy(objArr4, i3, objArr4, i11, this.h - i3);
        }
        this.e[i3] = i2;
        this.g[i3] = e;
        this.h++;
    }

    public final int g() {
        if (this.d) {
            b();
        }
        return this.h;
    }

    public final E h(int i2) {
        if (this.d) {
            b();
        }
        return (E) this.g[i2];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.d) {
                b();
            }
            sb.append(this.e[i2]);
            sb.append('=');
            E eH = h(i2);
            if (eH != this) {
                sb.append(eH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
