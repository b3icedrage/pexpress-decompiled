package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: cq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3239cq1 implements U52 {
    public final ZK d;
    public final EnumC7645xc0 e;
    public final P90 g;
    public final List<InterfaceC2095Tp1> h;

    /* JADX INFO: renamed from: cq1$a */
    public static abstract class a<T, A> extends T52<T> {
        public final LinkedHashMap a;

        public a(LinkedHashMap linkedHashMap) {
            this.a = linkedHashMap;
        }

        @Override // defpackage.T52
        public final T a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            A aC = c();
            try {
                c7790yH0.X0();
                while (c7790yH0.hasNext()) {
                    b bVar = (b) this.a.get(c7790yH0.x0());
                    if (bVar == null || !bVar.e) {
                        c7790yH0.I();
                    } else {
                        e(aC, c7790yH0, bVar);
                    }
                }
                c7790yH0.B0();
                return d(aC);
            } catch (IllegalAccessException e) {
                C2437Xp1.a aVar = C2437Xp1.a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalStateException e2) {
                throw new HH0(e2);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, T t) throws IOException {
            if (t == null) {
                zh0.l();
                return;
            }
            zh0.X0();
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(zh0, t);
                }
                zh0.B0();
            } catch (IllegalAccessException e) {
                C2437Xp1.a aVar = C2437Xp1.a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }

        public abstract A c();

        public abstract T d(A a);

        public abstract void e(A a, C7790yH0 c7790yH0, b bVar);
    }

    /* JADX INFO: renamed from: cq1$b */
    public static abstract class b {
        public final String a;
        public final Field b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public b(String str, Field field, boolean z, boolean z2) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
            this.d = z;
            this.e = z2;
        }

        public abstract void a(C7790yH0 c7790yH0, int i, Object[] objArr);

        public abstract void b(C7790yH0 c7790yH0, Object obj);

        public abstract void c(ZH0 zh0, Object obj);
    }

    /* JADX INFO: renamed from: cq1$d */
    public static final class d<T> extends a<T, Object[]> {
        public static final HashMap e;
        public final Constructor<T> b;
        public final Object[] c;
        public final HashMap d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            e = map;
        }

        public d(Class cls, LinkedHashMap linkedHashMap, boolean z) {
            super(linkedHashMap);
            this.d = new HashMap();
            C2437Xp1.a aVar = C2437Xp1.a;
            Constructor<T> constructorB = aVar.b(cls);
            this.b = constructorB;
            if (z) {
                C3239cq1.b(null, constructorB);
            } else {
                C2437Xp1.e(constructorB);
            }
            String[] strArrC = aVar.c(cls);
            for (int i = 0; i < strArrC.length; i++) {
                this.d.put(strArrC[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        @Override // defpackage.C3239cq1.a
        public final Object[] c() {
            return (Object[]) this.c.clone();
        }

        @Override // defpackage.C3239cq1.a
        public final Object d(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e2) {
                C2437Xp1.a aVar = C2437Xp1.a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + C2437Xp1.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + C2437Xp1.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke constructor '" + C2437Xp1.b(constructor) + "' with args " + Arrays.toString(objArr2), e5.getCause());
            }
        }

        @Override // defpackage.C3239cq1.a
        public final void e(Object[] objArr, C7790yH0 c7790yH0, b bVar) {
            Object[] objArr2 = objArr;
            HashMap map = this.d;
            String str = bVar.c;
            Integer num = (Integer) map.get(str);
            if (num != null) {
                bVar.a(c7790yH0, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C2437Xp1.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public C3239cq1(ZK zk, EnumC7645xc0 enumC7645xc0, P90 p90, C6316rG0 c6316rG0, List list) {
        this.d = zk;
        this.e = enumC7645xc0;
        this.g = p90;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C2173Up1.a.a.a(obj, accessibleObject)) {
            throw new C2911bH0(Z0.c(C2437Xp1.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        InterfaceC2095Tp1.a aVarA = C2173Up1.a(rawType, this.h);
        if (aVarA != InterfaceC2095Tp1.a.h) {
            boolean z = aVarA == InterfaceC2095Tp1.a.g;
            return C2437Xp1.a.d(rawType) ? new d(rawType, c(gson, typeToken, rawType, z, true), z) : new c(this.d.b(typeToken), c(gson, typeToken, rawType, z, false));
        }
        throw new C2911bH0("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashMap c(Gson gson, TypeToken typeToken, Class cls, boolean z, boolean z2) {
        Method methodA;
        List listSingletonList;
        boolean z3;
        Class cls2;
        int i;
        int i2;
        boolean z4;
        Field[] fieldArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            TypeToken typeToken2 = typeToken;
            boolean z5 = z;
            Class rawType = cls;
            while (rawType != Object.class) {
                Field[] declaredFields = rawType.getDeclaredFields();
                boolean z6 = true;
                boolean z7 = false;
                if (rawType != cls && declaredFields.length > 0) {
                    InterfaceC2095Tp1.a aVarA = C2173Up1.a(rawType, this.h);
                    if (aVarA == InterfaceC2095Tp1.a.h) {
                        throw new C2911bH0("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z5 = aVarA == InterfaceC2095Tp1.a.g;
                }
                boolean z8 = z5;
                int length = declaredFields.length;
                int i3 = 0;
                while (i3 < length) {
                    Field[] fieldArr2 = declaredFields;
                    Field field = fieldArr2[i3];
                    boolean zD = this.d(field, z6);
                    boolean zD2 = this.d(field, z7);
                    if (zD || zD2) {
                        if (!z2) {
                            methodA = null;
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            zD2 = z7;
                            methodA = null;
                        } else {
                            methodA = C2437Xp1.a.a(rawType, field);
                            if (!z8) {
                                C2437Xp1.e(methodA);
                            }
                            if (methodA.getAnnotation(InterfaceC2691aI1.class) != null && field.getAnnotation(InterfaceC2691aI1.class) == null) {
                                throw new C2911bH0(C1039Gc0.d("@SerializedName on ", C2437Xp1.d(methodA, z7), " is not supported"));
                            }
                        }
                        if (!z8 && methodA == null) {
                            C2437Xp1.e(field);
                        }
                        boolean z9 = z6;
                        int i4 = length;
                        Type typeF = C2624a.f(typeToken2.getType(), rawType, field.getGenericType(), new HashMap());
                        InterfaceC2691aI1 interfaceC2691aI1 = (InterfaceC2691aI1) field.getAnnotation(InterfaceC2691aI1.class);
                        if (interfaceC2691aI1 == null) {
                            listSingletonList = Collections.singletonList(this.e.b(field));
                        } else {
                            String strValue = interfaceC2691aI1.value();
                            String[] strArrAlternate = interfaceC2691aI1.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                arrayList.add(strValue);
                                Collections.addAll(arrayList, strArrAlternate);
                                listSingletonList = arrayList;
                            }
                        }
                        int size = listSingletonList.size();
                        b bVar = null;
                        int i5 = 0;
                        while (i5 < size) {
                            String str = (String) listSingletonList.get(i5);
                            if (i5 != 0) {
                                zD = false;
                            }
                            int i6 = i5;
                            boolean z10 = zD2;
                            TypeToken<?> typeToken3 = TypeToken.get(typeF);
                            Class<? super Object> rawType2 = typeToken3.getRawType();
                            boolean z11 = (rawType2 == null || !rawType2.isPrimitive()) ? false : z9;
                            int modifiers = field.getModifiers();
                            boolean z12 = (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) ? z9 : false;
                            List list = listSingletonList;
                            InterfaceC6107qG0 interfaceC6107qG0 = (InterfaceC6107qG0) field.getAnnotation(InterfaceC6107qG0.class);
                            Class cls3 = rawType;
                            T52 t52B = interfaceC6107qG0 != null ? C6316rG0.b(this.d, gson, typeToken3, interfaceC6107qG0) : null;
                            Field[] fieldArr3 = fieldArr2;
                            boolean z13 = t52B != null ? z9 : false;
                            if (t52B == null) {
                                t52B = gson.f(typeToken3);
                            }
                            boolean z14 = zD;
                            int i7 = size;
                            b bVar2 = bVar;
                            int i8 = i4;
                            boolean z15 = z9;
                            bVar = (b) linkedHashMap.put(str, new C3030bq1(str, field, z14, z10, z8, methodA, z13, t52B, gson, typeToken3, z11, z12));
                            if (bVar2 != null) {
                                bVar = bVar2;
                            }
                            gson = gson;
                            zD = z14;
                            zD2 = z10;
                            methodA = methodA;
                            fieldArr2 = fieldArr3;
                            z9 = z15;
                            i4 = i8;
                            i3 = i3;
                            listSingletonList = list;
                            rawType = cls3;
                            size = i7;
                            i5 = i6 + 1;
                            this = this;
                        }
                        z3 = z9;
                        cls2 = rawType;
                        i = i3;
                        b bVar3 = bVar;
                        i2 = i4;
                        z4 = false;
                        fieldArr = fieldArr2;
                        if (bVar3 != null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + bVar3.a + "'; conflict is caused by fields " + C2437Xp1.c(bVar3.b) + " and " + C2437Xp1.c(field));
                        }
                    } else {
                        i2 = length;
                        cls2 = rawType;
                        z3 = z6;
                        z4 = z7;
                        i = i3;
                        fieldArr = fieldArr2;
                    }
                    i3 = i + 1;
                    this = this;
                    gson = gson;
                    declaredFields = fieldArr;
                    z6 = z3;
                    z7 = z4;
                    length = i2;
                    rawType = cls2;
                }
                Class cls4 = rawType;
                typeToken2 = TypeToken.get(C2624a.f(typeToken2.getType(), cls4, cls4.getGenericSuperclass(), new HashMap()));
                rawType = typeToken2.getRawType();
                z5 = z8;
            }
        }
        return linkedHashMap;
    }

    public final boolean d(Field field, boolean z) {
        Class<?> type = field.getType();
        P90 p90 = this.g;
        p90.getClass();
        if (P90.d(type) || p90.b(type, z) || (field.getModifiers() & 136) != 0 || field.isSynthetic() || P90.d(field.getType())) {
            return false;
        }
        List<Q90> list = z ? p90.d : p90.e;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<Q90> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: cq1$c */
    public static final class c<T> extends a<T, T> {
        public final J71<T> b;

        public c(J71 j71, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.b = j71;
        }

        @Override // defpackage.C3239cq1.a
        public final T c() {
            return this.b.e();
        }

        @Override // defpackage.C3239cq1.a
        public final void e(T t, C7790yH0 c7790yH0, b bVar) {
            bVar.b(c7790yH0, t);
        }

        @Override // defpackage.C3239cq1.a
        public final T d(T t) {
            return t;
        }
    }
}
