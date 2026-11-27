package defpackage;

import defpackage.C0727Cc0.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0727Cc0<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final C0727Cc0 d = new C0727Cc0(0);
    public boolean b;
    public boolean c = false;
    public final ZM1 a = new ZM1(16);

    /* JADX INFO: renamed from: Cc0$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        EnumC7675xj2 a();

        boolean c();

        EnumC7254vj2 g();

        int getNumber();

        AbstractC0673Bk0.a h(HZ0.a aVar, HZ0 hz0);

        boolean j();
    }

    public C0727Cc0() {
    }

    public static int c(EnumC7254vj2 enumC7254vj2, Object obj) {
        int iA;
        int iF;
        switch (enumC7254vj2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return IE.g(((Long) obj).longValue());
            case 3:
                return IE.g(((Long) obj).longValue());
            case 4:
                return IE.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return IE.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((HZ0) obj).a();
            case 10:
                if (!(obj instanceof C5291mO0)) {
                    return IE.e((HZ0) obj);
                }
                C5291mO0 c5291mO0 = (C5291mO0) obj;
                c5291mO0.getClass();
                iA = c5291mO0.a.a();
                iF = IE.f(iA);
                break;
                break;
            case 11:
                if (!(obj instanceof AbstractC1724Ow)) {
                    byte[] bArr = (byte[]) obj;
                    return IE.f(bArr.length) + bArr.length;
                }
                AbstractC1724Ow abstractC1724Ow = (AbstractC1724Ow) obj;
                iA = IE.f(abstractC1724Ow.size());
                iF = abstractC1724Ow.size();
                break;
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return IE.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof YB0.a ? IE.c(((YB0.a) obj).getNumber()) : IE.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return IE.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return IE.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iF + iA;
    }

    public static int d(a<?> aVar, Object obj) {
        int iH;
        int iC;
        EnumC7254vj2 enumC7254vj2G = aVar.g();
        int number = aVar.getNumber();
        if (aVar.c()) {
            int iC2 = 0;
            if (!aVar.j()) {
                for (Object obj2 : (List) obj) {
                    int iH2 = IE.h(number);
                    if (enumC7254vj2G == EnumC7254vj2.i) {
                        iH2 *= 2;
                    }
                    iC2 += c(enumC7254vj2G, obj2) + iH2;
                }
                return iC2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC2 += c(enumC7254vj2G, it.next());
            }
            iH = IE.h(number) + iC2;
            iC = IE.f(iC2);
        } else {
            iH = IE.h(number);
            if (enumC7254vj2G == EnumC7254vj2.i) {
                iH *= 2;
            }
            iC = c(enumC7254vj2G, obj);
        }
        return iC + iH;
    }

    public static boolean f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        if (aVar.a() != EnumC7675xj2.MESSAGE) {
            return true;
        }
        if (aVar.c()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((HZ0) it.next()).d()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof HZ0) {
            return ((HZ0) value).d();
        }
        if (value instanceof C5291mO0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static Object i(EE ee, EnumC7254vj2 enumC7254vj2) {
        switch (enumC7254vj2.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(ee.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(ee.i()));
            case 2:
                return Long.valueOf(ee.l());
            case 3:
                return Long.valueOf(ee.l());
            case 4:
                return Integer.valueOf(ee.k());
            case 5:
                return Long.valueOf(ee.j());
            case 6:
                return Integer.valueOf(ee.i());
            case 7:
                return Boolean.valueOf(ee.l() != 0);
            case 8:
                int iK = ee.k();
                int i = ee.b;
                int i2 = ee.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(ee.h(iK), "UTF-8");
                }
                String str = new String(ee.a, i2, iK, "UTF-8");
                ee.d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return ee.e();
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Integer.valueOf(ee.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(ee.i());
            case 15:
                return Long.valueOf(ee.j());
            case 16:
                int iK2 = ee.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = ee.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public static void k(EnumC7254vj2 enumC7254vj2, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (enumC7254vj2.d) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC1724Ow) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof YB0.a)) {
                    z = false;
                }
                z2 = z;
                break;
            case MESSAGE:
                if (!(obj instanceof HZ0) && !(obj instanceof C5291mO0)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void l(IE ie, EnumC7254vj2 enumC7254vj2, int i, Object obj) throws IOException {
        if (enumC7254vj2 == EnumC7254vj2.i) {
            ie.x(i, 3);
            ((HZ0) obj).h(ie);
            ie.x(i, 4);
        }
        ie.x(i, enumC7254vj2.e);
        switch (enumC7254vj2.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                ie.getClass();
                ie.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ie.getClass();
                ie.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                ie.w(((Long) obj).longValue());
                break;
            case 3:
                ie.w(((Long) obj).longValue());
                break;
            case 4:
                ie.n(((Integer) obj).intValue());
                break;
            case 5:
                ie.u(((Long) obj).longValue());
                break;
            case 6:
                ie.t(((Integer) obj).intValue());
                break;
            case 7:
                ie.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                ie.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                ie.v(bytes.length);
                ie.s(bytes);
                break;
            case 9:
                ie.getClass();
                ((HZ0) obj).h(ie);
                break;
            case 10:
                ie.p((HZ0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1724Ow)) {
                    byte[] bArr = (byte[]) obj;
                    ie.getClass();
                    ie.v(bArr.length);
                    ie.s(bArr);
                } else {
                    AbstractC1724Ow abstractC1724Ow = (AbstractC1724Ow) obj;
                    ie.getClass();
                    ie.v(abstractC1724Ow.size());
                    ie.r(abstractC1724Ow);
                }
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ie.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof YB0.a)) {
                    ie.n(((Integer) obj).intValue());
                } else {
                    ie.n(((YB0.a) obj).getNumber());
                }
                break;
            case 14:
                ie.t(((Integer) obj).intValue());
                break;
            case 15:
                ie.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                ie.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                ie.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(AbstractC0673Bk0.d dVar, Object obj) {
        List arrayList;
        if (!dVar.g) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        k(dVar.e, obj);
        Object objE = e(dVar);
        if (objE == null) {
            arrayList = new ArrayList();
            this.a.f(dVar, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0727Cc0<FieldDescriptorType> clone() {
        ZM1 zm1;
        C0727Cc0<FieldDescriptorType> c0727Cc0 = new C0727Cc0<>();
        int i = 0;
        while (true) {
            zm1 = this.a;
            if (i >= zm1.e.size()) {
                break;
            }
            C3349dN1<K, V>.b bVar = zm1.e.get(i);
            c0727Cc0.j((a) bVar.getKey(), bVar.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : zm1.d()) {
            c0727Cc0.j((a) entry.getKey(), entry.getValue());
        }
        c0727Cc0.c = this.c;
        return c0727Cc0;
    }

    public final Object e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof C5291mO0 ? ((C5291mO0) obj).a() : obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    public final void g() {
        if (this.b) {
            return;
        }
        ZM1 zm1 = this.a;
        if (!zm1.h) {
            for (int i = 0; i < zm1.e.size(); i++) {
                C3349dN1<K, V>.b bVar = zm1.e.get(i);
                if (((a) bVar.getKey()).c()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : zm1.d()) {
                if (((a) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!zm1.h) {
            zm1.g = zm1.g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zm1.g);
            zm1.h = true;
        }
        this.b = true;
    }

    public final void h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5291mO0) {
            value = ((C5291mO0) value).a();
        }
        boolean zC = key.c();
        ZM1 zm1 = this.a;
        if (zC) {
            Object objE = e(key);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            zm1.f(key, objE);
            return;
        }
        if (key.a() != EnumC7675xj2.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            zm1.f(key, value);
            return;
        }
        Object objE2 = e(key);
        if (objE2 != null) {
            zm1.f(key, key.h(((HZ0) objE2).b(), (HZ0) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        zm1.f(key, value);
    }

    public final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.c()) {
            k(fielddescriptortype.g(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k(fielddescriptortype.g(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C5291mO0) {
            this.c = true;
        }
        this.a.f(fielddescriptortype, obj);
    }

    public C0727Cc0(int i) {
        g();
    }
}
