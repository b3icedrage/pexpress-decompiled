package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XC implements RI0<Object>, InterfaceC7774yC {

    @NotNull
    public static final a e = new a(null);

    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> g;

    @NotNull
    public static final HashMap<String, String> h;

    @NotNull
    public static final LinkedHashMap i;

    @NotNull
    public final Class<?> d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        List listF = WE.f(Function0.class, Function1.class, Function2.class, InterfaceC1060Gj0.class, InterfaceC1138Hj0.class, InterfaceC1216Ij0.class, InterfaceC1294Jj0.class, InterfaceC1372Kj0.class, InterfaceC1450Lj0.class, InterfaceC1527Mj0.class, InterfaceC6622sj0.class, InterfaceC6832tj0.class, InterfaceC7042uj0.class, InterfaceC7252vj0.class, InterfaceC7463wj0.class, InterfaceC7673xj0.class, InterfaceC7883yj0.class, InterfaceC8093zj0.class, InterfaceC0592Aj0.class, InterfaceC0670Bj0.class, InterfaceC0826Dj0.class, InterfaceC0904Ej0.class, InterfaceC0982Fj0.class);
        ArrayList arrayList = new ArrayList(XE.m(listF, 10));
        int i2 = 0;
        for (Object obj : listF) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                WE.l();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        g = PW0.j(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            sb.append(StringsKt.W(JwtParser.SEPARATOR_CHAR, str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : g.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        h = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(OW0.a(map3.size()));
        Iterator<T> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.checkNotNull(str2);
            linkedHashMap.put(key, StringsKt.W(JwtParser.SEPARATOR_CHAR, str2, str2));
        }
        i = linkedHashMap;
    }

    public XC(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.d = jClass;
    }

    @Override // defpackage.RI0
    @NotNull
    public final List<SJ0> a() {
        throw new C3971gL0();
    }

    @Override // defpackage.RI0
    public final boolean b() {
        throw new C3971gL0();
    }

    @Override // defpackage.RI0
    @Nullable
    public final String d() {
        String str;
        e.getClass();
        Class<?> jClass = this.d;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap<String, String> map = h;
        if (!zIsArray) {
            String str2 = map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.RI0
    @NotNull
    public final Collection<RI0<?>> e() {
        throw new C3971gL0();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof XC) && C7279vr.h(this).equals(C7279vr.h((RI0) obj));
    }

    @Override // defpackage.RI0
    @Nullable
    public final String f() {
        String str;
        e.getClass();
        Class<?> jClass = this.d;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = i;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            Intrinsics.checkNotNull(simpleName);
            String strV = StringsKt.V(simpleName, enclosingMethod.getName() + '$', simpleName);
            if (strV != null) {
                return strV;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.U('$', simpleName, simpleName);
        }
        Intrinsics.checkNotNull(simpleName);
        return StringsKt.V(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // defpackage.RI0
    public final boolean g(@Nullable Object obj) {
        e.getClass();
        Class<?> jClass = this.d;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map<Class<? extends Function<?>>, Integer> map = g;
        Intrinsics.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return F62.f(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = C7279vr.h(C7279vr.j(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // defpackage.InterfaceC7774yC
    @NotNull
    public final Class<?> h() {
        return this.d;
    }

    public final int hashCode() {
        return C7279vr.h(this).hashCode();
    }

    @Override // defpackage.RI0
    @NotNull
    public final Collection<InterfaceC6325rJ0<Object>> r() {
        throw new C3971gL0();
    }

    @Override // defpackage.RI0
    public final boolean s() {
        throw new C3971gL0();
    }

    @NotNull
    public final String toString() {
        return this.d + " (Kotlin reflection is not available)";
    }
}
