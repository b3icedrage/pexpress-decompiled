package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes.dex */
public final class ZK {
    public final Map<Type, SA0<?>> a;
    public final boolean b;
    public final List<InterfaceC2095Tp1> c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements J71<T> {
        public final /* synthetic */ SA0 d;

        public a(SA0 sa0, Type type) {
            this.d = sa0;
        }

        @Override // defpackage.J71
        public final T e() {
            return (T) this.d.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements J71<T> {
        public final /* synthetic */ SA0 d;

        public b(SA0 sa0, Type type) {
            this.d = sa0;
        }

        @Override // defpackage.J71
        public final T e() {
            return (T) this.d.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements J71<T> {
        public final /* synthetic */ String d;

        public c(String str) {
            this.d = str;
        }

        @Override // defpackage.J71
        public final T e() {
            throw new C2911bH0(this.d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements J71<T> {
        public final /* synthetic */ String d;

        public d(String str) {
            this.d = str;
        }

        @Override // defpackage.J71
        public final T e() {
            throw new C2911bH0(this.d);
        }
    }

    public ZK(Map<Type, SA0<?>> map, boolean z, List<InterfaceC2095Tp1> list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    public final <T> J71<T> b(TypeToken<T> typeToken) {
        C0780Cu c1353Kd;
        J71<T> c3341dL;
        String str;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        Map<Type, SA0<?>> map = this.a;
        SA0<?> sa0 = map.get(type);
        if (sa0 != null) {
            return new a(sa0, type);
        }
        SA0<?> sa1 = map.get(rawType);
        if (sa1 != null) {
            return new b(sa1, type);
        }
        J71<T> c3686f = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            c1353Kd = new C0780Cu();
            c1353Kd.d = type;
        } else {
            c1353Kd = rawType == EnumMap.class ? new C1353Kd(type) : null;
        }
        if (c1353Kd != null) {
            return c1353Kd;
        }
        InterfaceC2095Tp1.a aVarA = C2173Up1.a(rawType, this.c);
        boolean zIsAbstract = Modifier.isAbstract(rawType.getModifiers());
        InterfaceC2095Tp1.a aVar = InterfaceC2095Tp1.a.d;
        if (zIsAbstract) {
            c3341dL = null;
        } else {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                if (aVarA != aVar && (!C2173Up1.a.a.a(null, declaredConstructor) || (aVarA == InterfaceC2095Tp1.a.h && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    c3341dL = new C2922bL("Unable to invoke no-args constructor of " + rawType + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                } else if (aVarA == aVar) {
                    C2437Xp1.a aVar2 = C2437Xp1.a;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e) {
                        str = "Failed making constructor '" + C2437Xp1.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                    }
                    if (str != null) {
                        c3341dL = new C3131cL(str);
                    } else {
                        c3341dL = new C3341dL(declaredConstructor);
                    }
                } else {
                    c3341dL = new C3341dL(declaredConstructor);
                }
            } catch (NoSuchMethodException unused) {
                c3341dL = null;
            }
        }
        if (c3341dL != null) {
            return c3341dL;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                c3686f = new LL(9);
            } else if (Set.class.isAssignableFrom(rawType)) {
                c3686f = new C3787fU();
            } else {
                c3686f = Queue.class.isAssignableFrom(rawType) ? new C5027l8() : new C1589Ne();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                c3686f = new C7652xe();
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                c3686f = new C3057c();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                c3686f = new C3476e();
            } else {
                c3686f = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new C3686f() : new C6772tS0();
            }
        }
        if (c3686f != null) {
            return c3686f;
        }
        String strA = a(rawType);
        if (strA != null) {
            return new c(strA);
        }
        if (aVarA != aVar) {
            return new d("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
        }
        if (this.b) {
            return new YK(rawType);
        }
        return new C2698aL("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public final String toString() {
        return this.a.toString();
    }
}
