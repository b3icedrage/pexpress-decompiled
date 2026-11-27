package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7437wc2 {

    @NotNull
    public static final C1758Ph0 a = new C1758Ph0("kotlin.jvm.JvmStatic");

    /* JADX INFO: renamed from: wc2$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6405rh1.values().length];
            try {
                iArr[EnumC6405rh1.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6405rh1.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6405rh1.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6405rh1.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6405rh1.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC6405rh1.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC6405rh1.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC6405rh1.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    @Nullable
    public static final PI0 a(@Nullable JI0 ji0) {
        PI0 pi0 = ji0 instanceof PI0 ? (PI0) ji0 : null;
        if (pi0 != null) {
            return pi0;
        }
        C6535sJ0 c6535sJ0B = b(ji0);
        return c6535sJ0B != null ? c6535sJ0B : c(ji0);
    }

    @Nullable
    public static final C6535sJ0 b(@Nullable Object obj) {
        C6535sJ0 c6535sJ0 = obj instanceof C6535sJ0 ? (C6535sJ0) obj : null;
        if (c6535sJ0 != null) {
            return c6535sJ0;
        }
        C2574Zj0 c2574Zj0 = obj instanceof C2574Zj0 ? (C2574Zj0) obj : null;
        JI0 ji0E = c2574Zj0 != null ? c2574Zj0.e() : null;
        if (ji0E instanceof C6535sJ0) {
            return (C6535sJ0) ji0E;
        }
        return null;
    }

    @Nullable
    public static final OJ0<?> c(@Nullable Object obj) {
        OJ0<?> oj0 = obj instanceof OJ0 ? (OJ0) obj : null;
        if (oj0 != null) {
            return oj0;
        }
        AbstractC1451Lj1 abstractC1451Lj1 = obj instanceof AbstractC1451Lj1 ? (AbstractC1451Lj1) obj : null;
        JI0 ji0E = abstractC1451Lj1 != null ? abstractC1451Lj1.e() : null;
        if (ji0E instanceof OJ0) {
            return (OJ0) ji0E;
        }
        return null;
    }

    @NotNull
    public static final ArrayList d(@NotNull InterfaceC0726Cc interfaceC0726Cc) throws IllegalAccessException, InvocationTargetException {
        List listC;
        Annotation annotationJ;
        Intrinsics.checkNotNullParameter(interfaceC0726Cc, "<this>");
        InterfaceC2396Xc interfaceC2396XcK = interfaceC0726Cc.k();
        ArrayList<Annotation> arrayList = new ArrayList();
        for (InterfaceC1583Nc interfaceC1583Nc : interfaceC2396XcK) {
            VN1 vn1I = interfaceC1583Nc.i();
            if (vn1I instanceof C4285hp1) {
                annotationJ = ((C4285hp1) vn1I).b;
            } else if (vn1I instanceof CB1.a) {
                AbstractC8116zp1 abstractC8116zp1 = ((CB1.a) vn1I).b;
                C4963kp1 c4963kp1 = abstractC8116zp1 instanceof C4963kp1 ? (C4963kp1) abstractC8116zp1 : null;
                annotationJ = c4963kp1 != null ? c4963kp1.a : null;
            } else {
                annotationJ = j(interfaceC1583Nc);
            }
            if (annotationJ != null) {
                arrayList.add(annotationJ);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C7279vr.g(C7279vr.e((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsG = C7279vr.g(C7279vr.e(annotation));
                        if (!clsG.getSimpleName().equals("Container") || clsG.getAnnotation(InterfaceC1474Lr1.class) == null) {
                            listC = VE.c(annotation);
                        } else {
                            Object objInvoke = clsG.getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.VALUE, new Class[0]).invoke(annotation, new Object[0]);
                            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listC = C1371Kj.b((Annotation[]) objInvoke);
                        }
                        C2904bF.o(arrayList2, listC);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Object e(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (Intrinsics.a(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.a(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.a(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.a(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.a(cls, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.a(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.a(cls, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.a(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.a(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @NotNull
    public static final InterfaceC1335Jx f(@NotNull Class moduleAnchor, @NotNull AbstractC0673Bk0.c proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull AbstractC5393ms metadataVersion, @NotNull Function2 createDescriptor) {
        List<C4735jk1> list;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        C7983zB1 c7983zB1A = P01.a(moduleAnchor);
        if (proto instanceof C2575Zj1) {
            list = ((C2575Zj1) proto).m;
        } else {
            if (!(proto instanceof C3637ek1)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((C3637ek1) proto).m;
        }
        List<C4735jk1> list2 = list;
        C6163qZ c6163qZ = c7983zB1A.a;
        S01 s01 = c6163qZ.b;
        C5761od2 c5761od2 = C5761od2.b;
        Intrinsics.checkNotNull(list2);
        return (InterfaceC1335Jx) createDescriptor.invoke(new OY0(new C6582sZ(c6163qZ, nameResolver, s01, typeTable, c5761od2, metadataVersion, null, null, list2)), proto);
    }

    @Nullable
    public static final InterfaceC1076Go1 g(@NotNull InterfaceC1490Lx interfaceC1490Lx) {
        Intrinsics.checkNotNullParameter(interfaceC1490Lx, "<this>");
        if (interfaceC1490Lx.m0() == null) {
            return null;
        }
        InterfaceC4675jU interfaceC4675jUE = interfaceC1490Lx.e();
        Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((FC) interfaceC4675jUE).S0();
    }

    public static final boolean h(@NotNull SJ0 sj0) {
        AbstractC4649jL0 abstractC4649jL0;
        Intrinsics.checkNotNullParameter(sj0, "<this>");
        WJ0 wj0 = sj0 instanceof WJ0 ? (WJ0) sj0 : null;
        return (wj0 == null || (abstractC4649jL0 = wj0.a) == null || !C7138vA0.h(abstractC4649jL0)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class<?> i(ClassLoader classLoader, QC qc, int i) {
        String str = RE0.a;
        C1836Qh0 c1836Qh0I = qc.a().i();
        Intrinsics.checkNotNullExpressionValue(c1836Qh0I, "toUnsafe(...)");
        QC qcF = RE0.f(c1836Qh0I);
        if (qcF != null) {
            qc = qcF;
        }
        String strB = qc.a.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        String strB2 = qc.b.b();
        Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat("."));
        }
        sb.append(d.l(strB2, JwtParser.SEPARATOR_CHAR, '$'));
        if (i > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return Nm2.i(classLoader, string);
    }

    public static final Annotation j(InterfaceC1583Nc interfaceC1583Nc) {
        FC fcD = C4900kZ.d(interfaceC1583Nc);
        Class<?> clsK = fcD != null ? k(fcD) : null;
        if (clsK == null) {
            clsK = null;
        }
        if (clsK == null) {
            return null;
        }
        Set<Map.Entry<C5638o21, CK<?>>> setEntrySet = interfaceC1583Nc.j().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C5638o21 c5638o21 = (C5638o21) entry.getKey();
            CK ck = (CK) entry.getValue();
            ClassLoader classLoader = clsK.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object objL = l(ck, classLoader);
            Pair pair = objL != null ? new Pair(c5638o21.e(), objL) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapJ = PW0.j(arrayList);
        Set setKeySet = mapJ.keySet();
        ArrayList arrayList2 = new ArrayList(XE.m(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return (Annotation) C1505Mc.a(clsK, mapJ, arrayList2);
    }

    @Nullable
    public static final Class<?> k(@NotNull FC fc) {
        Intrinsics.checkNotNullParameter(fc, "<this>");
        VN1 vn1I = fc.i();
        Intrinsics.checkNotNullExpressionValue(vn1I, "getSource(...)");
        if (vn1I instanceof C3132cL0) {
            return ((C1627Np1) ((C3132cL0) vn1I).b).a;
        }
        if (vn1I instanceof CB1.a) {
            AbstractC8116zp1 abstractC8116zp1 = ((CB1.a) vn1I).b;
            Intrinsics.c(abstractC8116zp1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C7065up1) abstractC8116zp1).a;
        }
        QC qcF = C4900kZ.f(fc);
        if (qcF == null) {
            return null;
        }
        return i(C4753jp1.d(fc.getClass()), qcF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(CK<?> ck, ClassLoader classLoader) {
        AbstractC4649jL0 abstractC4649jL0;
        Class<?> clsI;
        if (ck instanceof C2292Wc) {
            return j((InterfaceC1583Nc) ((C2292Wc) ck).a);
        }
        int i = 0;
        if (ck instanceof C1059Gj) {
            C1059Gj c1059Gj = (C1059Gj) ck;
            C4348i72 c4348i72 = c1059Gj instanceof C4348i72 ? (C4348i72) c1059Gj : null;
            if (c4348i72 != null && (abstractC4649jL0 = c4348i72.c) != null) {
                Iterable iterable = (Iterable) c1059Gj.a;
                ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(l((CK) it.next(), classLoader));
                }
                C5638o21 c5638o21 = RK0.e;
                InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
                EnumC6405rh1 enumC6405rh1R = interfaceC5044lDC == null ? null : RK0.r(interfaceC5044lDC);
                int i2 = enumC6405rh1R == null ? -1 : a.a[enumC6405rh1R.ordinal()];
                Object obj = c1059Gj.a;
                switch (i2) {
                    case -1:
                        if (!RK0.y(abstractC4649jL0)) {
                            throw new IllegalStateException(("Not an array type: " + abstractC4649jL0).toString());
                        }
                        AbstractC4649jL0 type = ((N62) CollectionsKt.U(abstractC4649jL0.T0())).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        InterfaceC5044lD interfaceC5044lDC2 = type.V0().c();
                        FC fc = interfaceC5044lDC2 instanceof FC ? (FC) interfaceC5044lDC2 : null;
                        if (fc == null) {
                            throw new IllegalStateException(("Not a class type: " + type).toString());
                        }
                        if (RK0.H(type)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (RK0.b(fc, C4194hP1.a.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                Intrinsics.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        QC qcF = C4900kZ.f(fc);
                        if (qcF != null && (clsI = i(classLoader, qcF, 0)) != null) {
                            Object objNewInstance = Array.newInstance(clsI, ((List) obj).size());
                            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new C6489s51();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (ck instanceof C6286r70) {
            Pair pair = (Pair) ((C6286r70) ck).a;
            QC qc = (QC) pair.d;
            C5638o21 c5638o22 = (C5638o21) pair.e;
            Class<?> clsI2 = i(classLoader, qc, 0);
            if (clsI2 != null) {
                return Enum.valueOf(clsI2, c5638o22.e());
            }
        } else {
            if (!(ck instanceof C3965gJ0)) {
                if ((ck instanceof S70) || (ck instanceof C4347i71)) {
                    return null;
                }
                return ck.b();
            }
            C3965gJ0.a aVar = (C3965gJ0.a) ((C3965gJ0) ck).a;
            if (aVar instanceof C3965gJ0.a.b) {
                TC tc = ((C3965gJ0.a.b) aVar).a;
                return i(classLoader, tc.a, tc.b);
            }
            if (!(aVar instanceof C3965gJ0.a.C0360a)) {
                throw new C6489s51();
            }
            InterfaceC5044lD interfaceC5044lDC3 = ((C3965gJ0.a.C0360a) aVar).a.V0().c();
            FC fc2 = interfaceC5044lDC3 instanceof FC ? (FC) interfaceC5044lDC3 : null;
            if (fc2 != null) {
                return k(fc2);
            }
        }
        return null;
    }
}
