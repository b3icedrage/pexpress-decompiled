package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4753jp1 {

    @NotNull
    public static final List<RI0<? extends Object>> a;

    @NotNull
    public static final Map<Class<? extends Object>, Class<? extends Object>> b;

    @NotNull
    public static final Map<Class<? extends Object>, Class<? extends Object>> c;

    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> d;

    static {
        int i = 0;
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        List<RI0<? extends Object>> listF = WE.f(c2251Vp1.b(Boolean.TYPE), c2251Vp1.b(Byte.TYPE), c2251Vp1.b(Character.TYPE), c2251Vp1.b(Double.TYPE), c2251Vp1.b(Float.TYPE), c2251Vp1.b(Integer.TYPE), c2251Vp1.b(Long.TYPE), c2251Vp1.b(Short.TYPE));
        a = listF;
        ArrayList arrayList = new ArrayList(XE.m(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            RI0 ri0 = (RI0) it.next();
            arrayList.add(new Pair(C7279vr.h(ri0), C7279vr.i(ri0)));
        }
        b = PW0.j(arrayList);
        List<RI0<? extends Object>> list = a;
        ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            RI0 ri1 = (RI0) it2.next();
            arrayList2.add(new Pair(C7279vr.i(ri1), C7279vr.h(ri1)));
        }
        c = PW0.j(arrayList2);
        List listF2 = WE.f(Function0.class, Function1.class, Function2.class, InterfaceC1060Gj0.class, InterfaceC1138Hj0.class, InterfaceC1216Ij0.class, InterfaceC1294Jj0.class, InterfaceC1372Kj0.class, InterfaceC1450Lj0.class, InterfaceC1527Mj0.class, InterfaceC6622sj0.class, InterfaceC6832tj0.class, InterfaceC7042uj0.class, InterfaceC7252vj0.class, InterfaceC7463wj0.class, InterfaceC7673xj0.class, InterfaceC7883yj0.class, InterfaceC8093zj0.class, InterfaceC0592Aj0.class, InterfaceC0670Bj0.class, InterfaceC0826Dj0.class, InterfaceC0904Ej0.class, InterfaceC0982Fj0.class);
        ArrayList arrayList3 = new ArrayList(XE.m(listF2, 10));
        for (Object obj : listF2) {
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = PW0.j(arrayList3);
    }

    @NotNull
    public static final QC a(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null) {
                    QC qcA = a(declaringClass);
                    C5638o21 c5638o21K = C5638o21.k(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                    return qcA.d(c5638o21K);
                }
                C1758Ph0 topLevelFqName = new C1758Ph0(cls.getName());
                Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                C1758Ph0 c1758Ph0E = topLevelFqName.e();
                return new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
            }
        }
        C1758Ph0 c1758Ph0 = new C1758Ph0(cls.getName());
        C1758Ph0 c1758Ph0E2 = c1758Ph0.e();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0E2, "parent(...)");
        C1758Ph0 c1758Ph0J = C1758Ph0.j(c1758Ph0.f());
        Intrinsics.checkNotNullExpressionValue(c1758Ph0J, "topLevel(...)");
        return new QC(c1758Ph0E2, c1758Ph0J, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String b(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return d.l(name, JwtParser.SEPARATOR_CHAR, '/');
            }
            StringBuilder sb = new StringBuilder("L");
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb.append(d.l(name2, JwtParser.SEPARATOR_CHAR, '/'));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    @NotNull
    public static final List<Type> c(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C5653o60.d;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return JH1.p(JH1.k(FH1.e(type, C1017Fv.g), C8021zO0.g));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return C1526Mj.F(actualTypeArguments);
    }

    @NotNull
    public static final ClassLoader d(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final boolean e(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
