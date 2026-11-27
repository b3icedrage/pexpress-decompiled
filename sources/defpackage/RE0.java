package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RE0 {

    @NotNull
    public static final String a;

    @NotNull
    public static final String b;

    @NotNull
    public static final String c;

    @NotNull
    public static final String d;

    @NotNull
    public static final QC e;

    @NotNull
    public static final C1758Ph0 f;

    @NotNull
    public static final QC g;

    @NotNull
    public static final HashMap<C1836Qh0, QC> h;

    @NotNull
    public static final HashMap<C1836Qh0, QC> i;

    @NotNull
    public static final HashMap<C1836Qh0, C1758Ph0> j;

    @NotNull
    public static final HashMap<C1836Qh0, C1758Ph0> k;

    @NotNull
    public static final HashMap<QC, QC> l;

    @NotNull
    public static final HashMap<QC, QC> m;

    @NotNull
    public static final List<a> n;

    public static final class a {

        @NotNull
        public final QC a;

        @NotNull
        public final QC b;

        @NotNull
        public final QC c;

        public a(@NotNull QC javaClass, @NotNull QC kotlinReadOnly, @NotNull QC kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.a = javaClass;
            this.b = kotlinReadOnly;
            this.c = kotlinMutable;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b) && Intrinsics.a(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        AbstractC3008bk0.a aVar = AbstractC3008bk0.a.c;
        sb.append(aVar.a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(aVar.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        AbstractC3008bk0.b bVar = AbstractC3008bk0.b.c;
        sb2.append(bVar.a);
        sb2.append(JwtParser.SEPARATOR_CHAR);
        sb2.append(bVar.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        AbstractC3008bk0.d dVar = AbstractC3008bk0.d.c;
        sb3.append(dVar.a);
        sb3.append(JwtParser.SEPARATOR_CHAR);
        sb3.append(dVar.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        AbstractC3008bk0.c cVar = AbstractC3008bk0.c.c;
        sb4.append(cVar.a);
        sb4.append(JwtParser.SEPARATOR_CHAR);
        sb4.append(cVar.b);
        d = sb4.toString();
        QC qcB = QC.a.b(new C1758Ph0("kotlin.jvm.functions.FunctionN"));
        e = qcB;
        f = qcB.a();
        g = C3355dP1.q;
        d(Class.class);
        h = new HashMap<>();
        i = new HashMap<>();
        j = new HashMap<>();
        k = new HashMap<>();
        l = new HashMap<>();
        m = new HashMap<>();
        QC qcB2 = QC.a.b(C4194hP1.a.B);
        C1758Ph0 c1758Ph0 = C4194hP1.a.J;
        C1758Ph0 c1758Ph1 = qcB2.a;
        a aVar2 = new a(d(Iterable.class), qcB2, new QC(c1758Ph1, C1914Rh0.a(c1758Ph0, c1758Ph1), false));
        QC qcB3 = QC.a.b(C4194hP1.a.A);
        C1758Ph0 c1758Ph2 = C4194hP1.a.I;
        C1758Ph0 c1758Ph3 = qcB3.a;
        a aVar3 = new a(d(Iterator.class), qcB3, new QC(c1758Ph3, C1914Rh0.a(c1758Ph2, c1758Ph3), false));
        QC qcB4 = QC.a.b(C4194hP1.a.C);
        C1758Ph0 c1758Ph4 = C4194hP1.a.K;
        C1758Ph0 c1758Ph5 = qcB4.a;
        a aVar4 = new a(d(Collection.class), qcB4, new QC(c1758Ph5, C1914Rh0.a(c1758Ph4, c1758Ph5), false));
        QC qcB5 = QC.a.b(C4194hP1.a.D);
        C1758Ph0 c1758Ph6 = C4194hP1.a.L;
        C1758Ph0 c1758Ph7 = qcB5.a;
        a aVar5 = new a(d(List.class), qcB5, new QC(c1758Ph7, C1914Rh0.a(c1758Ph6, c1758Ph7), false));
        QC qcB6 = QC.a.b(C4194hP1.a.F);
        C1758Ph0 c1758Ph8 = C4194hP1.a.N;
        C1758Ph0 c1758Ph9 = qcB6.a;
        a aVar6 = new a(d(Set.class), qcB6, new QC(c1758Ph9, C1914Rh0.a(c1758Ph8, c1758Ph9), false));
        QC qcB7 = QC.a.b(C4194hP1.a.E);
        C1758Ph0 c1758Ph10 = C4194hP1.a.M;
        C1758Ph0 c1758Ph11 = qcB7.a;
        a aVar7 = new a(d(ListIterator.class), qcB7, new QC(c1758Ph11, C1914Rh0.a(c1758Ph10, c1758Ph11), false));
        C1758Ph0 c1758Ph12 = C4194hP1.a.G;
        QC qcB8 = QC.a.b(c1758Ph12);
        C1758Ph0 c1758Ph13 = C4194hP1.a.O;
        C1758Ph0 c1758Ph14 = qcB8.a;
        a aVar8 = new a(d(Map.class), qcB8, new QC(c1758Ph14, C1914Rh0.a(c1758Ph13, c1758Ph14), false));
        QC qcB9 = QC.a.b(c1758Ph12);
        C5638o21 c5638o21F = C4194hP1.a.H.f();
        Intrinsics.checkNotNullExpressionValue(c5638o21F, "shortName(...)");
        QC qcD = qcB9.d(c5638o21F);
        C1758Ph0 c1758Ph15 = C4194hP1.a.P;
        C1758Ph0 c1758Ph16 = qcD.a;
        List<a> listF = WE.f(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new a(d(Map.Entry.class), qcD, new QC(c1758Ph16, C1914Rh0.a(c1758Ph15, c1758Ph16), false)));
        n = listF;
        c(Object.class, C4194hP1.a.a);
        c(String.class, C4194hP1.a.f);
        c(CharSequence.class, C4194hP1.a.e);
        b(Throwable.class, C4194hP1.a.k);
        c(Cloneable.class, C4194hP1.a.c);
        c(Number.class, C4194hP1.a.i);
        b(Comparable.class, C4194hP1.a.l);
        c(Enum.class, C4194hP1.a.j);
        b(Annotation.class, C4194hP1.a.s);
        for (a aVar9 : listF) {
            QC qc = aVar9.a;
            QC qc2 = aVar9.b;
            a(qc, qc2);
            QC qc3 = aVar9.c;
            i.put(qc3.a().i(), qc);
            l.put(qc3, qc2);
            m.put(qc2, qc3);
            C1758Ph0 c1758Ph0A = qc2.a();
            C1758Ph0 c1758Ph0A2 = qc3.a();
            j.put(qc3.a().i(), c1758Ph0A);
            k.put(c1758Ph0A.i(), c1758Ph0A2);
        }
        for (DI0 di0 : DI0.values()) {
            C1758Ph0 topLevelFqName = di0.h;
            if (topLevelFqName == null) {
                DI0.b(15);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getWrapperFqName(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            QC qc4 = new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
            EnumC6405rh1 primitiveType = di0.i();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            C1758Ph0 topLevelFqName2 = C4194hP1.l.c(primitiveType.d);
            Intrinsics.checkNotNullExpressionValue(topLevelFqName2, "child(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
            C1758Ph0 c1758Ph0E2 = topLevelFqName2.e();
            a(qc4, new QC(c1758Ph0E2, SI0.a(c1758Ph0E2, "parent(...)", topLevelFqName2, "shortName(...)")));
        }
        for (QC qc5 : C7996zG.b) {
            C1758Ph0 topLevelFqName3 = new C1758Ph0("kotlin.jvm.internal." + qc5.f().e() + "CompanionObject");
            Intrinsics.checkNotNullParameter(topLevelFqName3, "topLevelFqName");
            C1758Ph0 c1758Ph0E3 = topLevelFqName3.e();
            a(new QC(c1758Ph0E3, SI0.a(c1758Ph0E3, "parent(...)", topLevelFqName3, "shortName(...)")), qc5.d(C6761tO1.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            C1758Ph0 topLevelFqName4 = new C1758Ph0(EK.e(i2, "kotlin.jvm.functions.Function"));
            Intrinsics.checkNotNullParameter(topLevelFqName4, "topLevelFqName");
            C1758Ph0 c1758Ph0E4 = topLevelFqName4.e();
            QC qc6 = new QC(c1758Ph0E4, SI0.a(c1758Ph0E4, "parent(...)", topLevelFqName4, "shortName(...)"));
            C5638o21 c5638o21K = C5638o21.k("Function" + i2);
            Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
            a(qc6, new QC(C4194hP1.l, c5638o21K));
            i.put(new C1758Ph0(b + i2).i(), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            AbstractC3008bk0.c cVar2 = AbstractC3008bk0.c.c;
            i.put(new C1758Ph0((cVar2.a + JwtParser.SEPARATOR_CHAR + cVar2.b) + i3).i(), g);
        }
        C1758Ph0 c1758Ph0G = C4194hP1.a.b.g();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0G, "toSafe(...)");
        i.put(c1758Ph0G.i(), d(Void.class));
    }

    public static void a(QC qc, QC qc2) {
        h.put(qc.a().i(), qc2);
        i.put(qc2.a().i(), qc);
    }

    public static void b(Class cls, C1758Ph0 topLevelFqName) {
        QC qcD = d(cls);
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 c1758Ph0E = topLevelFqName.e();
        a(qcD, new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")));
    }

    public static void c(Class cls, C1836Qh0 c1836Qh0) {
        C1758Ph0 c1758Ph0G = c1836Qh0.g();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0G, "toSafe(...)");
        b(cls, c1758Ph0G);
    }

    public static QC d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C1758Ph0 topLevelFqName = new C1758Ph0(cls.getCanonicalName());
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            return new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
        }
        QC qcD = d(declaringClass);
        C5638o21 c5638o21K = C5638o21.k(cls.getSimpleName());
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return qcD.d(c5638o21K);
    }

    public static boolean e(C1836Qh0 c1836Qh0, String str) {
        Integer intOrNull;
        String str2 = c1836Qh0.a;
        if (str2 == null) {
            C1836Qh0.a(4);
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(str2, "asString(...)");
        if (d.o(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (!StringsKt.T(strSubstring, '0') && (intOrNull = StringsKt.toIntOrNull(strSubstring)) != null && intOrNull.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static QC f(@NotNull C1836Qh0 kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        if (e(kotlinFqName, a) || e(kotlinFqName, c)) {
            return e;
        }
        return (e(kotlinFqName, b) || e(kotlinFqName, d)) ? g : i.get(kotlinFqName);
    }
}
