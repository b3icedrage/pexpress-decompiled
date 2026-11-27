package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3984gP1 {
    public static final b a = new b();
    public static final c b = new c();
    public static final d c = new d();
    public static final e d = new e();
    public static final f e = new f();
    public static final g f = new g();
    public static final h g = new h();
    public static final i h = new i();
    public static final j i = new j();
    public static final a j = new a();

    /* JADX INFO: renamed from: gP1$a */
    public class a extends AbstractC5897pG0<String> {
        @Override // defpackage.AbstractC5897pG0
        public final String a(AbstractC8000zH0 abstractC8000zH0) {
            return abstractC8000zH0.B();
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, String str) {
            yh0.G(str);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* JADX INFO: renamed from: gP1$b */
    public class b implements AbstractC5897pG0.a {
        @Override // defpackage.AbstractC5897pG0.a
        public final AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11) {
            C4137h71 c4137h71C;
            Constructor<?> declaredConstructor;
            Object[] objArr;
            Class<?> cls = null;
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return C3984gP1.b;
                }
                if (type == Byte.TYPE) {
                    return C3984gP1.c;
                }
                if (type == Character.TYPE) {
                    return C3984gP1.d;
                }
                if (type == Double.TYPE) {
                    return C3984gP1.e;
                }
                if (type == Float.TYPE) {
                    return C3984gP1.f;
                }
                if (type == Integer.TYPE) {
                    return C3984gP1.g;
                }
                if (type == Long.TYPE) {
                    return C3984gP1.h;
                }
                if (type == Short.TYPE) {
                    return C3984gP1.i;
                }
                if (type == Boolean.class) {
                    return C3984gP1.b.c();
                }
                if (type == Byte.class) {
                    return C3984gP1.c.c();
                }
                if (type == Character.class) {
                    return C3984gP1.d.c();
                }
                if (type == Double.class) {
                    return C3984gP1.e.c();
                }
                if (type == Float.class) {
                    return C3984gP1.f.c();
                }
                if (type == Integer.class) {
                    return C3984gP1.g.c();
                }
                if (type == Long.class) {
                    return C3984gP1.h.c();
                }
                if (type == Short.class) {
                    return C3984gP1.i.c();
                }
                if (type == String.class) {
                    return C3984gP1.j.c();
                }
                if (type == Object.class) {
                    return new l(c3903g11).c();
                }
                Class<?> clsC = C6918u72.c(type);
                Set<Annotation> set2 = C6596sc2.a;
                InterfaceC7156vG0 interfaceC7156vG0 = (InterfaceC7156vG0) clsC.getAnnotation(InterfaceC7156vG0.class);
                if (interfaceC7156vG0 == null || !interfaceC7156vG0.generateAdapter()) {
                    c4137h71C = null;
                } else {
                    try {
                        try {
                            Class<?> cls2 = Class.forName(clsC.getName().replace("$", "_") + "JsonAdapter", true, clsC.getClassLoader());
                            try {
                                if (type instanceof ParameterizedType) {
                                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(C3903g11.class, Type[].class);
                                        objArr = new Object[]{c3903g11, actualTypeArguments};
                                    } catch (NoSuchMethodException unused) {
                                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(C3903g11.class);
                                        objArr = new Object[]{c3903g11};
                                    } catch (NoSuchMethodException unused2) {
                                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                c4137h71C = ((AbstractC5897pG0) declaredConstructor.newInstance(objArr)).c();
                            } catch (NoSuchMethodException e) {
                                e = e;
                                cls = cls2;
                                if ((type instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                            }
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e3);
                    } catch (IllegalAccessException e4) {
                        throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e4);
                    } catch (InstantiationException e5) {
                        throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e5);
                    } catch (InvocationTargetException e6) {
                        C6596sc2.i(e6);
                        throw null;
                    }
                }
                if (c4137h71C != null) {
                    return c4137h71C;
                }
                if (clsC.isEnum()) {
                    return new k(clsC).c();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: gP1$c */
    public class c extends AbstractC5897pG0<Boolean> {
        @Override // defpackage.AbstractC5897pG0
        public final Boolean a(AbstractC8000zH0 abstractC8000zH0) {
            return Boolean.valueOf(abstractC8000zH0.f());
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Boolean bool) {
            yh0.L(bool.booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: renamed from: gP1$d */
    public class d extends AbstractC5897pG0<Byte> {
        @Override // defpackage.AbstractC5897pG0
        public final Byte a(AbstractC8000zH0 abstractC8000zH0) {
            return Byte.valueOf((byte) C3984gP1.a(abstractC8000zH0, "a byte", -128, 255));
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Byte b) {
            yh0.C(b.intValue() & 255);
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: renamed from: gP1$e */
    public class e extends AbstractC5897pG0<Character> {
        @Override // defpackage.AbstractC5897pG0
        public final Character a(AbstractC8000zH0 abstractC8000zH0) {
            String strB = abstractC8000zH0.B();
            if (strB.length() <= 1) {
                return Character.valueOf(strB.charAt(0));
            }
            throw new EG0(BX.c("Expected a char but was ", C1742Pc.d('\"', "\"", strB), " at path ", abstractC8000zH0.c()));
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Character ch) {
            yh0.G(ch.toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: renamed from: gP1$f */
    public class f extends AbstractC5897pG0<Double> {
        @Override // defpackage.AbstractC5897pG0
        public final Double a(AbstractC8000zH0 abstractC8000zH0) {
            return Double.valueOf(abstractC8000zH0.d0());
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Double d) {
            yh0.A(d.doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: renamed from: gP1$g */
    public class g extends AbstractC5897pG0<Float> {
        @Override // defpackage.AbstractC5897pG0
        public final Float a(AbstractC8000zH0 abstractC8000zH0) {
            float fD0 = (float) abstractC8000zH0.d0();
            if (!Float.isInfinite(fD0)) {
                return Float.valueOf(fD0);
            }
            throw new EG0("JSON forbids NaN and infinities: " + fD0 + " at path " + abstractC8000zH0.c());
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Float f) {
            Float f2 = f;
            f2.getClass();
            yh0.D(f2);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: renamed from: gP1$h */
    public class h extends AbstractC5897pG0<Integer> {
        @Override // defpackage.AbstractC5897pG0
        public final Integer a(AbstractC8000zH0 abstractC8000zH0) {
            return Integer.valueOf(abstractC8000zH0.E0());
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Integer num) {
            yh0.C(num.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: renamed from: gP1$i */
    public class i extends AbstractC5897pG0<Long> {
        @Override // defpackage.AbstractC5897pG0
        public final Long a(AbstractC8000zH0 abstractC8000zH0) {
            return Long.valueOf(abstractC8000zH0.a1());
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Long l) {
            yh0.C(l.longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: renamed from: gP1$j */
    public class j extends AbstractC5897pG0<Short> {
        @Override // defpackage.AbstractC5897pG0
        public final Short a(AbstractC8000zH0 abstractC8000zH0) {
            return Short.valueOf((short) C3984gP1.a(abstractC8000zH0, "a short", -32768, 32767));
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Short sh) {
            yh0.C(sh.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: renamed from: gP1$k */
    public static final class k<T extends Enum<T>> extends AbstractC5897pG0<T> {
        public final Class<T> a;
        public final String[] b;
        public final T[] c;
        public final AbstractC8000zH0.a d;

        public k(Class<T> cls) {
            this.a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.c = enumConstants;
                this.b = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.c;
                    if (i >= tArr.length) {
                        this.d = AbstractC8000zH0.a.a(this.b);
                        return;
                    }
                    String strName = tArr[i].name();
                    String[] strArr = this.b;
                    Field field = cls.getField(strName);
                    Set<Annotation> set = C6596sc2.a;
                    InterfaceC5477nG0 interfaceC5477nG0 = (InterfaceC5477nG0) field.getAnnotation(InterfaceC5477nG0.class);
                    if (interfaceC5477nG0 != null) {
                        String strName2 = interfaceC5477nG0.name();
                        if (!"\u0000".equals(strName2)) {
                            strName = strName2;
                        }
                    }
                    strArr[i] = strName;
                    i++;
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in ".concat(cls.getName()), e);
            }
        }

        @Override // defpackage.AbstractC5897pG0
        public final Object a(AbstractC8000zH0 abstractC8000zH0) {
            int iT = abstractC8000zH0.t(this.d);
            if (iT != -1) {
                return this.c[iT];
            }
            String strC = abstractC8000zH0.c();
            throw new EG0("Expected one of " + Arrays.asList(this.b) + " but was " + abstractC8000zH0.B() + " at path " + strC);
        }

        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Object obj) {
            yh0.G(this.b[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return "JsonAdapter(" + this.a.getName() + ")";
        }
    }

    /* JADX INFO: renamed from: gP1$l */
    public static final class l extends AbstractC5897pG0<Object> {
        public final C3903g11 a;
        public final AbstractC5897pG0<List> b;
        public final AbstractC5897pG0<Map> c;
        public final AbstractC5897pG0<String> d;
        public final AbstractC5897pG0<Double> e;
        public final AbstractC5897pG0<Boolean> f;

        public l(C3903g11 c3903g11) {
            this.a = c3903g11;
            this.b = c3903g11.a(List.class);
            this.c = c3903g11.a(Map.class);
            this.d = c3903g11.a(String.class);
            this.e = c3903g11.a(Double.class);
            this.f = c3903g11.a(Boolean.class);
        }

        @Override // defpackage.AbstractC5897pG0
        public final Object a(AbstractC8000zH0 abstractC8000zH0) {
            int iOrdinal = abstractC8000zH0.k().ordinal();
            if (iOrdinal == 0) {
                return this.b.a(abstractC8000zH0);
            }
            if (iOrdinal == 2) {
                return this.c.a(abstractC8000zH0);
            }
            if (iOrdinal == 5) {
                return this.d.a(abstractC8000zH0);
            }
            if (iOrdinal == 6) {
                return this.e.a(abstractC8000zH0);
            }
            if (iOrdinal == 7) {
                return this.f.a(abstractC8000zH0);
            }
            if (iOrdinal == 8) {
                abstractC8000zH0.g();
                return null;
            }
            throw new IllegalStateException("Expected a value but was " + abstractC8000zH0.k() + " at path " + abstractC8000zH0.c());
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017 A[PHI: r1
          0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.AbstractC5897pG0
        public final void e(YH0 yh0, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                yh0.f();
                yh0.l();
                return;
            }
            Class<?> cls2 = Map.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            } else {
                cls2 = Collection.class;
                if (cls2.isAssignableFrom(cls)) {
                    cls = cls2;
                }
            }
            this.a.c(cls, C6596sc2.a, null).e(yh0, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(AbstractC8000zH0 abstractC8000zH0, String str, int i2, int i3) {
        int iE0 = abstractC8000zH0.E0();
        if (iE0 >= i2 && iE0 <= i3) {
            return iE0;
        }
        throw new EG0("Expected " + str + " but was " + iE0 + " at path " + abstractC8000zH0.c());
    }
}
