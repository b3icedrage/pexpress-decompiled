package defpackage;

import defpackage.C0649Bc0.a;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0649Bc0<T extends a<T>> {
    public static final C0649Bc0 d = new C0649Bc0(0);
    public final YM1 a;
    public boolean b;
    public boolean c;

    /* JADX INFO: renamed from: Bc0$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        EnumC7465wj2 a();
    }

    public C0649Bc0() {
        this.a = new YM1(16);
    }

    public static int b(EnumC7044uj2 enumC7044uj2, int i, Object obj) {
        int iA;
        int iG;
        int iH = 1;
        int iE = HE.E(i);
        if (enumC7044uj2 == EnumC7044uj2.i) {
            iE *= 2;
        }
        switch (enumC7044uj2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = HE.f;
                iH = 8;
                return iH + iE;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = HE.f;
                iH = 4;
                return iH + iE;
            case 2:
                iH = HE.H(((Long) obj).longValue());
                return iH + iE;
            case 3:
                iH = HE.H(((Long) obj).longValue());
                return iH + iE;
            case 4:
                iH = HE.B(((Integer) obj).intValue());
                return iH + iE;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = HE.f;
                iH = 8;
                return iH + iE;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = HE.f;
                iH = 4;
                return iH + iE;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = HE.f;
                return iH + iE;
            case 8:
                iH = obj instanceof AbstractC1646Nw ? HE.x((AbstractC1646Nw) obj) : HE.D((String) obj);
                return iH + iE;
            case 9:
                Logger logger6 = HE.f;
                iH = ((GZ0) obj).a();
                return iH + iE;
            case 10:
                if (obj instanceof C5078lO0) {
                    iH = HE.C((C5078lO0) obj);
                } else {
                    Logger logger7 = HE.f;
                    iA = ((GZ0) obj).a();
                    iG = HE.G(iA);
                    iH = iG + iA;
                }
                return iH + iE;
            case 11:
                if (obj instanceof AbstractC1646Nw) {
                    iH = HE.x((AbstractC1646Nw) obj);
                } else {
                    Logger logger8 = HE.f;
                    iA = ((byte[]) obj).length;
                    iG = HE.G(iA);
                    iH = iG + iA;
                }
                return iH + iE;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                iH = HE.G(((Integer) obj).intValue());
                return iH + iE;
            case 13:
                iH = obj instanceof XB0.a ? HE.B(((XB0.a) obj).getNumber()) : HE.B(((Integer) obj).intValue());
                return iH + iE;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = HE.f;
                iH = 4;
                return iH + iE;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = HE.f;
                iH = 8;
                return iH + iE;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iH = HE.G((iIntValue >> 31) ^ (iIntValue << 1));
                return iH + iE;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iH = HE.H((jLongValue >> 63) ^ (jLongValue << 1));
                return iH + iE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.a();
        throw null;
    }

    public static <T extends a<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().a();
        throw null;
    }

    public static void j(HE.a aVar, EnumC7044uj2 enumC7044uj2, int i, Object obj) {
        if (enumC7044uj2 == EnumC7044uj2.i) {
            aVar.X(i, 3);
            ((GZ0) obj).l(aVar);
            aVar.X(i, 4);
        }
        aVar.X(i, enumC7044uj2.e);
        switch (enumC7044uj2.ordinal()) {
            case 0:
                aVar.R(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                aVar.P(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                aVar.b0(((Long) obj).longValue());
                break;
            case 3:
                aVar.b0(((Long) obj).longValue());
                break;
            case 4:
                aVar.T(((Integer) obj).intValue());
                break;
            case 5:
                aVar.R(((Long) obj).longValue());
                break;
            case 6:
                aVar.P(((Integer) obj).intValue());
                break;
            case 7:
                aVar.J(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC1646Nw)) {
                    aVar.W((String) obj);
                } else {
                    aVar.N((AbstractC1646Nw) obj);
                }
                break;
            case 9:
                ((GZ0) obj).l(aVar);
                break;
            case 10:
                aVar.U((GZ0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1646Nw)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    aVar.Z(length);
                    aVar.K(bArr, 0, length);
                } else {
                    aVar.N((AbstractC1646Nw) obj);
                }
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                aVar.Z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof XB0.a)) {
                    aVar.T(((Integer) obj).intValue());
                } else {
                    aVar.T(((XB0.a) obj).getNumber());
                }
                break;
            case 14:
                aVar.P(((Integer) obj).intValue());
                break;
            case 15:
                aVar.R(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                aVar.Z((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                aVar.b0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0649Bc0<T> clone() {
        C0649Bc0<T> c0649Bc0 = new C0649Bc0<>();
        YM1 ym1 = this.a;
        if (ym1.e.size() > 0) {
            Map.Entry<Object, Object> entryD = ym1.d(0);
            c0649Bc0.i((a) entryD.getKey(), entryD.getValue());
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = ym1.e().iterator();
        if (!it.hasNext()) {
            c0649Bc0.c = this.c;
            return c0649Bc0;
        }
        Map.Entry<Object, Object> next = it.next();
        c0649Bc0.i((a) next.getKey(), next.getValue());
        throw null;
    }

    public final boolean e() {
        YM1 ym1 = this.a;
        if (ym1.e.size() > 0) {
            f(ym1.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = ym1.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0649Bc0) {
            return this.a.equals(((C0649Bc0) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        boolean z = this.c;
        YM1 ym1 = this.a;
        if (!z) {
            return ((C3139cN1.d) ym1.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((C3139cN1.d) ym1.entrySet()).iterator();
        C5078lO0.b bVar = new C5078lO0.b();
        bVar.d = it;
        return bVar;
    }

    public final void h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5078lO0) {
            ((C5078lO0) value).a(null);
        }
        key.getClass();
        key.a();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = XB0.a;
        obj.getClass();
        throw null;
    }

    public C0649Bc0(int i) {
        int i2 = C3139cN1.k;
        YM1 ym1 = new YM1(0);
        this.a = ym1;
        if (!this.b) {
            ym1.g();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        ym1.g();
        this.b = true;
    }
}
