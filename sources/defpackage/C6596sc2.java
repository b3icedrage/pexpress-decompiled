package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.Nullable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6596sc2 {
    public static final Set<Annotation> a = Collections.EMPTY_SET;
    public static final Type[] b = new Type[0];

    @Nullable
    public static final Class<?> c;

    @Nullable
    public static final Class<? extends Annotation> d;
    public static final Map<Class<?>, Class<?>> e;

    /* JADX INFO: renamed from: sc2$a */
    public static final class a implements GenericArrayType {
        public final Type d;

        public a(Type type) {
            this.d = C6596sc2.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C6918u72.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return C6596sc2.k(this.d) + "[]";
        }
    }

    /* JADX INFO: renamed from: sc2$b */
    public static final class b implements ParameterizedType {

        @Nullable
        public final Type d;
        public final Type e;
        public final Type[] g;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C6918u72.c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.d = type == null ? null : C6596sc2.a(type);
            this.e = C6596sc2.a(type2);
            this.g = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.g;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                C6596sc2.b(this.g[i]);
                Type[] typeArr3 = this.g;
                typeArr3[i] = C6596sc2.a(typeArr3[i]);
                i++;
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C6918u72.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.g.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.d;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.g) ^ this.e.hashCode();
            Set<Annotation> set = C6596sc2.a;
            Type type = this.d;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.g;
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C6596sc2.k(this.e));
            if (typeArr.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C6596sc2.k(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(C6596sc2.k(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: sc2$c */
    public static final class c implements WildcardType {
        public final Type d;

        @Nullable
        public final Type e;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C6596sc2.b(typeArr[0]);
                this.e = null;
                this.d = C6596sc2.a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            C6596sc2.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.e = C6596sc2.a(typeArr2[0]);
            this.d = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C6918u72.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.e;
            return type != null ? new Type[]{type} : C6596sc2.b;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.d};
        }

        public final int hashCode() {
            Type type = this.e;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.d.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.e;
            if (type != null) {
                return "? super " + C6596sc2.k(type);
            }
            Type type2 = this.d;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C6596sc2.k(type2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        d = cls;
        c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean d(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> e(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC7369wH0.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : a;
    }

    public static EG0 f(String str, String str2, AbstractC8000zH0 abstractC8000zH0) {
        String string;
        String strC = abstractC8000zH0.c();
        if (str2.equals(str)) {
            string = BX.c("Required value '", str, "' missing at ", strC);
        } else {
            StringBuilder sbA = C5896pG.a("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbA.append(strC);
            string = sbA.toString();
        }
        return new EG0(string);
    }

    public static Type g(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    public static Type h(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type2 = typeVariable;
            } else {
                Type typeC = c(type, cls, cls2);
                if (typeC instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int i = 0;
                    while (true) {
                        if (i >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeC).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls3 = (Class) type2;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeH = h(type, cls, componentType, linkedHashSet);
                return componentType == typeH ? cls3 : new a(typeH);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeH2 = h(type, cls, genericComponentType, linkedHashSet);
            return genericComponentType == typeH2 ? genericArrayType : new a(typeH2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeH3 = h(type, cls, ownerType, linkedHashSet);
            boolean z = typeH3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeH4 = h(type, cls, actualTypeArguments[i2], linkedHashSet);
                if (typeH4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeH4;
                }
            }
            return z ? new b(typeH3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeH5 = h(type, cls, lowerBounds[0], linkedHashSet);
                type3 = wildcardType;
                if (typeH5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, typeH5 instanceof WildcardType ? ((WildcardType) typeH5).getLowerBounds() : new Type[]{typeH5});
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeH6 = h(type, cls, upperBounds[0], linkedHashSet);
                    type3 = wildcardType;
                    if (typeH6 != upperBounds[0]) {
                        return new c(typeH6 instanceof WildcardType ? ((WildcardType) typeH6).getUpperBounds() : new Type[]{typeH6}, b);
                    }
                }
            }
        }
        return type3;
    }

    public static void i(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static String j(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String k(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static EG0 l(String str, String str2, AbstractC8000zH0 abstractC8000zH0) {
        String string;
        String strC = abstractC8000zH0.c();
        if (str2.equals(str)) {
            string = BX.c("Non-null value '", str, "' was null at ", strC);
        } else {
            StringBuilder sbA = C5896pG.a("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbA.append(strC);
            string = sbA.toString();
        }
        return new EG0(string);
    }
}
