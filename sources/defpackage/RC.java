package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RC<T> extends AbstractC5897pG0<T> {
    public static final a d = new a();
    public final G1 a;
    public final b<?>[] b;
    public final AbstractC8000zH0.a c;

    public class a implements AbstractC5897pG0.a {
        public static void b(Type type, Class cls) {
            Class<?> clsC = C6918u72.c(type);
            if (cls.isAssignableFrom(clsC)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsC.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // defpackage.AbstractC5897pG0.a
        @Nullable
        public final AbstractC5897pG0<?> a(Type type, Set<? extends Annotation> set, C3903g11 c3903g11) {
            G1 pc;
            InterfaceC5477nG0 interfaceC5477nG0;
            Type typeH = type;
            if ((typeH instanceof Class) || (typeH instanceof ParameterizedType)) {
                Class<?> clsC = C6918u72.c(typeH);
                if (!clsC.isInterface() && !clsC.isEnum() && set.isEmpty()) {
                    if (C6596sc2.d(clsC)) {
                        b(typeH, List.class);
                        b(typeH, Set.class);
                        b(typeH, Map.class);
                        b(typeH, Collection.class);
                        String str = "Platform " + clsC;
                        if (typeH instanceof ParameterizedType) {
                            str = str + " in " + typeH;
                        }
                        throw new IllegalArgumentException(Z0.c(str, " requires explicit JsonAdapter to be registered"));
                    }
                    if (clsC.isAnonymousClass()) {
                        throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsC.getName()));
                    }
                    if (clsC.isLocalClass()) {
                        throw new IllegalArgumentException("Cannot serialize local class ".concat(clsC.getName()));
                    }
                    if (clsC.getEnclosingClass() != null && !Modifier.isStatic(clsC.getModifiers())) {
                        throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsC.getName()));
                    }
                    if (Modifier.isAbstract(clsC.getModifiers())) {
                        throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsC.getName()));
                    }
                    Class<? extends Annotation> cls = C6596sc2.d;
                    if (cls != null && clsC.isAnnotationPresent(cls)) {
                        throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsC.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                    }
                    int i = 0;
                    try {
                        try {
                            try {
                                try {
                                    Constructor<?> declaredConstructor = clsC.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    pc = new MC(declaredConstructor, clsC);
                                } catch (Exception unused) {
                                    throw new IllegalArgumentException("cannot construct instances of ".concat(clsC.getName()));
                                }
                            } catch (NoSuchMethodException unused2) {
                                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                                Field declaredField = cls2.getDeclaredField("theUnsafe");
                                declaredField.setAccessible(true);
                                pc = new NC(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), clsC);
                            }
                        } catch (IllegalAccessException unused3) {
                            throw new AssertionError();
                        } catch (NoSuchMethodException unused4) {
                            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                            declaredMethod.setAccessible(true);
                            pc = new PC(declaredMethod, clsC);
                        } catch (InvocationTargetException e) {
                            C6596sc2.i(e);
                            throw null;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod2.setAccessible(true);
                        int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                        Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod3.setAccessible(true);
                        pc = new OC(declaredMethod3, clsC, iIntValue);
                    } catch (IllegalAccessException unused6) {
                        throw new AssertionError();
                    }
                    TreeMap treeMap = new TreeMap();
                    while (typeH != Object.class) {
                        Class<?> clsC2 = C6918u72.c(typeH);
                        boolean zD = C6596sc2.d(clsC2);
                        Field[] declaredFields = clsC2.getDeclaredFields();
                        int length = declaredFields.length;
                        for (int i2 = i; i2 < length; i2++) {
                            Field field = declaredFields[i2];
                            int modifiers = field.getModifiers();
                            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zD) && ((interfaceC5477nG0 = (InterfaceC5477nG0) field.getAnnotation(InterfaceC5477nG0.class)) == null || !interfaceC5477nG0.ignore()))) {
                                Type typeH2 = C6596sc2.h(typeH, clsC2, field.getGenericType(), new LinkedHashSet());
                                Set<? extends Annotation> setE = C6596sc2.e(field.getAnnotations());
                                String name = field.getName();
                                AbstractC5897pG0<T> abstractC5897pG0C = c3903g11.c(typeH2, setE, name);
                                field.setAccessible(true);
                                if (interfaceC5477nG0 != null) {
                                    String strName = interfaceC5477nG0.name();
                                    if (!"\u0000".equals(strName)) {
                                        name = strName;
                                    }
                                }
                                b bVar = (b) treeMap.put(name, new b(name, field, abstractC5897pG0C));
                                if (bVar != null) {
                                    throw new IllegalArgumentException("Conflicting fields:\n    " + bVar.b + "\n    " + field);
                                }
                            }
                        }
                        Class<?> clsC3 = C6918u72.c(typeH);
                        typeH = C6596sc2.h(typeH, clsC3, clsC3.getGenericSuperclass(), new LinkedHashSet());
                        i = 0;
                    }
                    return new RC(pc, treeMap).c();
                }
            }
            return null;
        }
    }

    public static class b<T> {
        public final String a;
        public final Field b;
        public final AbstractC5897pG0<T> c;

        public b(String str, Field field, AbstractC5897pG0<T> abstractC5897pG0) {
            this.a = str;
            this.b = field;
            this.c = abstractC5897pG0;
        }
    }

    public RC(G1 g1, TreeMap treeMap) {
        this.a = g1;
        this.b = (b[]) treeMap.values().toArray(new b[treeMap.size()]);
        this.c = AbstractC8000zH0.a.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // defpackage.AbstractC5897pG0
    public final T a(AbstractC8000zH0 abstractC8000zH0) {
        try {
            T t = (T) this.a.k();
            try {
                abstractC8000zH0.X0();
                while (abstractC8000zH0.hasNext()) {
                    int iQ = abstractC8000zH0.q(this.c);
                    if (iQ == -1) {
                        abstractC8000zH0.u();
                        abstractC8000zH0.I();
                    } else {
                        b<?> bVar = this.b[iQ];
                        bVar.b.set(t, bVar.c.a(abstractC8000zH0));
                    }
                }
                abstractC8000zH0.B0();
                return t;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C6596sc2.i(e2);
            throw null;
        }
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 yh0, T t) {
        try {
            yh0.f();
            for (b<?> bVar : this.b) {
                yh0.q(bVar.a);
                bVar.c.e(yh0, bVar.b.get(t));
            }
            yh0.l();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}
