package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5906pJ0 implements InterfaceC7774yC {

    @NotNull
    public static final Regex d = new Regex("<v#(\\d+)>");

    /* JADX INFO: renamed from: pJ0$a */
    public abstract class a {
        public static final /* synthetic */ IJ0<Object>[] b;

        @NotNull
        public final C1939Rp1.a a;

        static {
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            b = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        }

        public a(AbstractC5906pJ0 abstractC5906pJ0) {
            this.a = C1939Rp1.a(null, new RZ(abstractC5906pJ0, 2));
        }
    }

    /* JADX INFO: renamed from: pJ0$b */
    public static final class b {

        @NotNull
        public final ArrayList a;

        @Nullable
        public final Class<?> b;

        public b(@Nullable Class cls, @NotNull ArrayList parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.a = parameters;
            this.b = cls;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: pJ0$c */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final /* synthetic */ c[] g;

        static {
            c cVar = new c("DECLARED", 0);
            d = cVar;
            c cVar2 = new c("INHERITED", 1);
            e = cVar2;
            c[] cVarArr = {cVar, cVar2};
            g = cVarArr;
            C1952Ru.i(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) g.clone();
        }
    }

    public static void i(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean zA = Intrinsics.a(CollectionsKt.N(arrayList2), DefaultConstructorMarker.class);
        List listSubList = arrayList2;
        if (zA) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        Class cls = z ? DefaultConstructorMarker.class : Object.class;
        Intrinsics.checkNotNull(cls);
        arrayList.add(cls);
    }

    public static Method t(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class clsI;
        Method methodT;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodX = x(cls, str, clsArr, cls2);
        if (methodX != null) {
            return methodX;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodT = t(superclass, str, clsArr, cls2, z)) != null) {
            return methodT;
        }
        C6411rj c6411rjL = C6621sj.l(cls.getInterfaces());
        while (c6411rjL.hasNext()) {
            Class cls3 = (Class) c6411rjL.next();
            Intrinsics.checkNotNull(cls3);
            Method methodT2 = t(cls3, str, clsArr, cls2, z);
            if (methodT2 != null) {
                return methodT2;
            }
            if (z && (clsI = Nm2.i(C4753jp1.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodX2 = x(clsI, str, clsArr, cls2);
                if (methodX2 != null) {
                    return methodX2;
                }
            }
        }
        return null;
    }

    public static Constructor w(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method x(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.a(method.getName(), str) && Intrinsics.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    public final Method j(@NotNull String name, @NotNull String desc, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.a(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(h());
        }
        b bVarU = u(desc, true);
        i(arrayList, bVarU.a, false);
        Class<?> clsP = p();
        String strC = Z0.c(name, "$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> cls = bVarU.b;
        Intrinsics.checkNotNull(cls);
        return t(clsP, strC, clsArr, cls, z);
    }

    @Nullable
    public final Method k(@NotNull String name, @NotNull String desc) {
        Method methodT;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.a(name, "<init>")) {
            return null;
        }
        b bVarU = u(desc, true);
        Class[] clsArr = (Class[]) bVarU.a.toArray(new Class[0]);
        Class<?> cls = bVarU.b;
        Intrinsics.checkNotNull(cls);
        Method methodT2 = t(p(), name, clsArr, cls, false);
        if (methodT2 != null) {
            return methodT2;
        }
        if (!p().isInterface() || (methodT = t(Object.class, name, clsArr, cls, false)) == null) {
            return null;
        }
        return methodT;
    }

    @NotNull
    public abstract Collection<InterfaceC3550eL> l();

    @NotNull
    public abstract Collection<InterfaceC2076Tj0> m(@NotNull C5638o21 c5638o21);

    @Nullable
    public abstract InterfaceC0671Bj1 n(int i);

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    @NotNull
    public final List o(@NotNull QY0 scope, @NotNull c belonginess) {
        PI0 pi0;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        C6116qJ0 c6116qJ0 = new C6116qJ0(this);
        Collection<InterfaceC4675jU> collectionA = InterfaceC2602Zs1.a.a(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4675jU interfaceC4675jU : collectionA) {
            if (interfaceC4675jU instanceof InterfaceC1490Lx) {
                InterfaceC1490Lx member = (InterfaceC1490Lx) interfaceC4675jU;
                if (Intrinsics.a(member.d(), C5323mZ.h)) {
                    pi0 = null;
                } else {
                    Intrinsics.checkNotNullParameter(member, "member");
                    InterfaceC1490Lx.a aVarH = member.h();
                    aVarH.getClass();
                    if ((aVarH != InterfaceC1490Lx.a.e) == (belonginess == c.d)) {
                        pi0 = (PI0) interfaceC4675jU.e0(c6116qJ0, Unit.a);
                    } else {
                        pi0 = null;
                    }
                }
            } else {
                pi0 = null;
            }
            if (pi0 != null) {
                arrayList.add(pi0);
            }
        }
        return CollectionsKt.e0(arrayList);
    }

    @NotNull
    public Class<?> p() {
        Class<?> clsH = h();
        List<RI0<? extends Object>> list = C4753jp1.a;
        Intrinsics.checkNotNullParameter(clsH, "<this>");
        Class<? extends Object> cls = C4753jp1.c.get(clsH);
        return cls == null ? h() : cls;
    }

    @NotNull
    public abstract Collection<InterfaceC0671Bj1> q(@NotNull C5638o21 c5638o21);

    public final b u(String str, boolean z) {
        int iF;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (StringsKt.D("VZCBSIFJD", cCharAt)) {
                iF = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new C3761fL0("Unknown type prefix in the method signature: ".concat(str));
                }
                iF = StringsKt.F(';', i, 4, str) + 1;
            }
            arrayList.add(v(i, iF, str));
            i = iF;
        }
        return new b(z ? v(i + 1, str.length(), str) : null, arrayList);
    }

    public final Class v(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = C4753jp1.d(h());
            String strSubstring = str.substring(i + 1, i2 - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(d.l(strSubstring, '/', JwtParser.SEPARATOR_CHAR));
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsV = v(i + 1, i2, str);
            C1758Ph0 c1758Ph0 = C7437wc2.a;
            Intrinsics.checkNotNullParameter(clsV, "<this>");
            return Array.newInstance((Class<?>) clsV, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new C3761fL0("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
