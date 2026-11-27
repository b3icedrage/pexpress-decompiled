package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class P82 {
    public static final P82 f = new P82(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public P82() {
        this(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int iC;
        int iE;
        int iC2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iC2 = GE.C(i5) + 8;
                } else if (i6 == 2) {
                    iC2 = GE.w(i5, (AbstractC1565Mw) this.c[i3]);
                } else if (i6 == 3) {
                    iC = GE.C(i5) * 2;
                    iE = ((P82) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C6724tC0.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iC2 = GE.C(i5) + 4;
                }
                i2 = iC2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iC = GE.C(i5);
                iE = GE.E(jLongValue);
            }
            i2 = iE + iC + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(InterfaceC5373ml2 interfaceC5373ml2) {
        if (this.a == 0) {
            return;
        }
        interfaceC5373ml2.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((KE) interfaceC5373ml2).a.a0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((KE) interfaceC5373ml2).a.N(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((KE) interfaceC5373ml2).a.J(i3, (AbstractC1565Mw) obj);
            } else if (i4 == 3) {
                GE ge = ((KE) interfaceC5373ml2).a;
                ge.X(i3, 3);
                ((P82) obj).d(interfaceC5373ml2);
                ge.X(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(C6724tC0.b());
                }
                ((KE) interfaceC5373ml2).a.L(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof P82)) {
            return false;
        }
        P82 p82 = (P82) obj;
        int i = this.a;
        if (i == p82.a) {
            int[] iArr = this.b;
            int[] iArr2 = p82.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = p82.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public P82(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
