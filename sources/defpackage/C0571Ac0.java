package defpackage;

import defpackage.C0571Ac0.a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Ac0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0571Ac0<T extends a<T>> {
    public static final C0571Ac0<?> d = new C0571Ac0<>(0);
    public final C2706aN1 a;
    public boolean b;
    public boolean c;

    /* JADX INFO: renamed from: Ac0$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        EnumC7885yj2 a();
    }

    public C0571Ac0() {
        int i = C2930bN1.j;
        this.a = new C2706aN1();
    }

    public static int b(EnumC6834tj2 enumC6834tj2, int i, Object obj) {
        int iA;
        int iD;
        int iC = GE.C(i);
        if (enumC6834tj2 == EnumC6834tj2.h) {
            iC *= 2;
        }
        int iE = 4;
        switch (enumC6834tj2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = GE.f;
                iE = 8;
                return iE + iC;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = GE.f;
                return iE + iC;
            case 2:
                iE = GE.E(((Long) obj).longValue());
                return iE + iC;
            case 3:
                iE = GE.E(((Long) obj).longValue());
                return iE + iC;
            case 4:
                iE = GE.E(((Integer) obj).intValue());
                return iE + iC;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = GE.f;
                iE = 8;
                return iE + iC;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = GE.f;
                return iE + iC;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = GE.f;
                iE = 1;
                return iE + iC;
            case 8:
                iE = obj instanceof AbstractC1565Mw ? GE.x((AbstractC1565Mw) obj) : GE.B((String) obj);
                return iE + iC;
            case 9:
                Logger logger6 = GE.f;
                iE = ((IZ0) obj).a();
                return iE + iC;
            case 10:
                if (obj instanceof C4868kO0) {
                    iE = GE.y((C4868kO0) obj);
                } else {
                    Logger logger7 = GE.f;
                    iA = ((IZ0) obj).a();
                    iD = GE.D(iA);
                    iE = iD + iA;
                }
                return iE + iC;
            case 11:
                if (obj instanceof AbstractC1565Mw) {
                    iE = GE.x((AbstractC1565Mw) obj);
                } else {
                    Logger logger8 = GE.f;
                    iA = ((byte[]) obj).length;
                    iD = GE.D(iA);
                    iE = iD + iA;
                }
                return iE + iC;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                iE = GE.D(((Integer) obj).intValue());
                return iE + iC;
            case 13:
                iE = obj instanceof VB0.a ? GE.E(((VB0.a) obj).getNumber()) : GE.E(((Integer) obj).intValue());
                return iE + iC;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = GE.f;
                return iE + iC;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = GE.f;
                iE = 8;
                return iE + iC;
            case 16:
                iE = GE.z(((Integer) obj).intValue());
                return iE + iC;
            case 17:
                iE = GE.A(((Long) obj).longValue());
                return iE + iC;
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

    public static void k(GE ge, EnumC6834tj2 enumC6834tj2, int i, Object obj) {
        if (enumC6834tj2 == EnumC6834tj2.h) {
            ge.X(i, 3);
            ((IZ0) obj).b(ge);
            ge.X(i, 4);
        }
        ge.X(i, enumC6834tj2.e);
        switch (enumC6834tj2.ordinal()) {
            case 0:
                ge.O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ge.M(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ge.b0(((Long) obj).longValue());
                break;
            case 3:
                ge.b0(((Long) obj).longValue());
                break;
            case 4:
                ge.Q(((Integer) obj).intValue());
                break;
            case 5:
                ge.O(((Long) obj).longValue());
                break;
            case 6:
                ge.M(((Integer) obj).intValue());
                break;
            case 7:
                ge.G(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC1565Mw)) {
                    ge.W((String) obj);
                } else {
                    ge.K((AbstractC1565Mw) obj);
                }
                break;
            case 9:
                ((IZ0) obj).b(ge);
                break;
            case 10:
                ge.S((IZ0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1565Mw)) {
                    byte[] bArr = (byte[]) obj;
                    ge.I(bArr.length, bArr);
                } else {
                    ge.K((AbstractC1565Mw) obj);
                }
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ge.Z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof VB0.a)) {
                    ge.Q(((Integer) obj).intValue());
                } else {
                    ge.Q(((VB0.a) obj).getNumber());
                }
                break;
            case 14:
                ge.M(((Integer) obj).intValue());
                break;
            case 15:
                ge.O(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                ge.Z((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                ge.b0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0571Ac0<T> clone() {
        C0571Ac0<T> c0571Ac0 = new C0571Ac0<>();
        C2706aN1 c2706aN1 = this.a;
        if (c2706aN1.d.size() > 0) {
            Map.Entry<a<Object>, Object> entryD = c2706aN1.d(0);
            c0571Ac0.j(entryD.getKey(), entryD.getValue());
            throw null;
        }
        Iterator it = c2706aN1.e().iterator();
        if (!it.hasNext()) {
            c0571Ac0.c = this.c;
            return c0571Ac0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        c0571Ac0.j((a) entry.getKey(), entry.getValue());
        throw null;
    }

    public final boolean e() {
        C2706aN1 c2706aN1 = this.a;
        if (c2706aN1.d.size() > 0) {
            f(c2706aN1.d(0));
            throw null;
        }
        Iterator it = c2706aN1.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0571Ac0) {
            return this.a.equals(((C0571Ac0) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        C2706aN1 c2706aN1 = this.a;
        if (c2706aN1.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.c) {
            return ((C2930bN1.c) c2706aN1.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((C2930bN1.c) c2706aN1.entrySet()).iterator();
        C4868kO0.b bVar = new C4868kO0.b();
        bVar.d = it;
        return bVar;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        C2706aN1 c2706aN1 = this.a;
        int size = c2706aN1.d.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<a<Object>, Object> entryD = c2706aN1.d(i);
            if (entryD.getValue() instanceof AbstractC8097zk0) {
                AbstractC8097zk0 abstractC8097zk0 = (AbstractC8097zk0) entryD.getValue();
                abstractC8097zk0.getClass();
                C0674Bk1 c0674Bk1 = C0674Bk1.c;
                c0674Bk1.getClass();
                c0674Bk1.a(abstractC8097zk0.getClass()).b(abstractC8097zk0);
                abstractC8097zk0.n();
            }
        }
        c2706aN1.g();
        this.b = true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        boolean z = entry.getValue() instanceof C4868kO0;
        key.getClass();
        key.a();
        throw null;
    }

    public final void j(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = VB0.a;
        obj.getClass();
        throw null;
    }

    public C0571Ac0(int i) {
        int i2 = C2930bN1.j;
        this.a = new C2706aN1();
        h();
        h();
    }
}
