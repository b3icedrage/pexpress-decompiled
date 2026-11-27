package defpackage;

import androidx.annotation.NonNull;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: aM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2703aM1<K, V> {
    public static Object[] h;
    public static int i;
    public static Object[] j;
    public static int k;
    public int[] d;
    public Object[] e;
    public int g;

    public C2703aM1() {
        this.d = U0.e;
        this.e = U0.h;
        this.g = 0;
    }

    public static void d(int[] iArr, int i2, Object[] objArr) {
        if (iArr.length == 8) {
            synchronized (C2703aM1.class) {
                try {
                    if (k < 10) {
                        objArr[0] = j;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        j = objArr;
                        k++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2703aM1.class) {
                try {
                    if (i < 10) {
                        objArr[0] = h;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        h = objArr;
                        i++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b(int i2) {
        if (i2 == 8) {
            synchronized (C2703aM1.class) {
                try {
                    Object[] objArr = j;
                    if (objArr != null) {
                        this.e = objArr;
                        j = (Object[]) objArr[0];
                        this.d = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        k--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (C2703aM1.class) {
                try {
                    Object[] objArr2 = h;
                    if (objArr2 != null) {
                        this.e = objArr2;
                        h = (Object[]) objArr2[0];
                        this.d = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        i--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.d = new int[i2];
        this.e = new Object[i2 << 1];
    }

    public final void c(int i2) {
        int i3 = this.g;
        int[] iArr = this.d;
        if (iArr.length < i2) {
            Object[] objArr = this.e;
            b(i2);
            if (this.g > 0) {
                System.arraycopy(iArr, 0, this.d, 0, i3);
                System.arraycopy(objArr, 0, this.e, 0, i3 << 1);
            }
            d(iArr, i3, objArr);
        }
        if (this.g != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.g;
        if (i2 > 0) {
            int[] iArr = this.d;
            Object[] objArr = this.e;
            this.d = U0.e;
            this.e = U0.h;
            this.g = 0;
            d(iArr, i2, objArr);
        }
        if (this.g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int e(int i2, Object obj) {
        int i3 = this.g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iB = U0.b(i3, i2, this.d);
            if (iB < 0 || obj.equals(this.e[iB << 1])) {
                return iB;
            }
            int i4 = iB + 1;
            while (i4 < i3 && this.d[i4] == i2) {
                if (obj.equals(this.e[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iB - 1; i5 >= 0 && this.d[i5] == i2; i5--) {
                if (obj.equals(this.e[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2703aM1) {
            C2703aM1 c2703aM1 = (C2703aM1) obj;
            if (this.g != c2703aM1.g) {
                return false;
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                try {
                    K kI = i(i2);
                    V vM = m(i2);
                    Object orDefault = c2703aM1.getOrDefault(kI, null);
                    if (vM == null) {
                        if (orDefault != null || !c2703aM1.containsKey(kI)) {
                            return false;
                        }
                    } else if (!vM.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.g; i3++) {
                try {
                    K kI2 = i(i3);
                    V vM2 = m(i3);
                    Object obj2 = map.get(kI2);
                    if (vM2 == null) {
                        if (obj2 != null || !map.containsKey(kI2)) {
                            return false;
                        }
                    } else if (!vM2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        return obj == null ? g() : e(obj.hashCode(), obj);
    }

    public final int g() {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iB = U0.b(i2, 0, this.d);
            if (iB < 0 || this.e[iB << 1] == null) {
                return iB;
            }
            int i3 = iB + 1;
            while (i3 < i2 && this.d[i3] == 0) {
                if (this.e[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iB - 1; i4 >= 0 && this.d[i4] == 0; i4--) {
                if (this.e[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.e[(iF << 1) + 1] : v;
    }

    public final int h(Object obj) {
        int i2 = this.g * 2;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.d;
        Object[] objArr = this.e;
        int i2 = this.g;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final K i(int i2) {
        return (K) this.e[i2 << 1];
    }

    public final boolean isEmpty() {
        return this.g <= 0;
    }

    public void j(@NonNull C8092zj c8092zj) {
        int i2 = c8092zj.g;
        c(this.g + i2);
        if (this.g != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(c8092zj.i(i3), c8092zj.m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(c8092zj.d, 0, this.d, 0, i2);
            System.arraycopy(c8092zj.e, 0, this.e, 0, i2 << 1);
            this.g = i2;
        }
    }

    public V k(int i2) {
        Object[] objArr = this.e;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.g;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.d, i4, objArr);
            this.d = U0.e;
            this.e = U0.h;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.d;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.e;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.e;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                b(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.g) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.d, 0, i2);
                    System.arraycopy(objArr, 0, this.e, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.d, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.e, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.g) {
            throw new ConcurrentModificationException();
        }
        this.g = i5;
        return v;
    }

    public V l(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.e;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public final V m(int i2) {
        return (V) this.e[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int iE;
        int i3 = this.g;
        if (k2 == null) {
            iE = g();
            i2 = 0;
        } else {
            int iHashCode = k2.hashCode();
            i2 = iHashCode;
            iE = e(iHashCode, k2);
        }
        if (iE >= 0) {
            int i4 = (iE << 1) + 1;
            Object[] objArr = this.e;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~iE;
        int[] iArr = this.d;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.e;
            b(i6);
            if (i3 != this.g) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.e, 0, objArr2.length);
            }
            d(iArr, i3, objArr2);
        }
        if (i5 < i3) {
            int[] iArr3 = this.d;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.e;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.g - i5) << 1);
        }
        int i8 = this.g;
        if (i3 == i8) {
            int[] iArr4 = this.d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.e;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v;
                this.g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k2, V v) {
        V orDefault = getOrDefault(k2, null);
        return orDefault == null ? put(k2, v) : orDefault;
    }

    public final V remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF);
        }
        return null;
    }

    public final V replace(K k2, V v) {
        int iF = f(k2);
        if (iF >= 0) {
            return l(iF, v);
        }
        return null;
    }

    public final int size() {
        return this.g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kI = i(i2);
            if (kI != this) {
                sb.append(kI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM = m(i2);
            if (vM != this) {
                sb.append(vM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        V vM = m(iF);
        if (obj2 != vM && (obj2 == null || !obj2.equals(vM))) {
            return false;
        }
        k(iF);
        return true;
    }

    public final boolean replace(K k2, V v, V v2) {
        int iF = f(k2);
        if (iF < 0) {
            return false;
        }
        V vM = m(iF);
        if (vM != v && (v == null || !v.equals(vM))) {
            return false;
        }
        l(iF, v2);
        return true;
    }

    public C2703aM1(int i2) {
        if (i2 == 0) {
            this.d = U0.e;
            this.e = U0.h;
        } else {
            b(i2);
        }
        this.g = 0;
    }
}
