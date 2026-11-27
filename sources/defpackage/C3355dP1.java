package defpackage;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3355dP1 {

    @NotNull
    public static final C1758Ph0 a;

    @NotNull
    public static final C1758Ph0 b;

    @NotNull
    public static final C1758Ph0 c;

    @NotNull
    public static final C1758Ph0 d;

    @NotNull
    public static final C1758Ph0 e;

    @NotNull
    public static final C1758Ph0 f;

    @NotNull
    public static final C1758Ph0 g;

    @NotNull
    public static final QC h;

    @NotNull
    public static final QC i;

    @NotNull
    public static final QC j;

    @NotNull
    public static final QC k;

    @NotNull
    public static final QC l;

    @NotNull
    public static final QC m;

    @NotNull
    public static final QC n;

    @NotNull
    public static final QC o;

    @NotNull
    public static final QC p;

    @NotNull
    public static final QC q;

    @NotNull
    public static final Set<QC> r;

    @NotNull
    public static final Set<QC> s;

    @NotNull
    public static final QC t;

    @NotNull
    public static final QC u;

    @NotNull
    public static final QC v;

    @NotNull
    public static final QC w;

    static {
        C1758Ph0 c1758Ph0 = new C1758Ph0("kotlin");
        a = c1758Ph0;
        C1758Ph0 c1758Ph0C = c1758Ph0.c(C5638o21.k("reflect"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
        b = c1758Ph0C;
        C1758Ph0 c1758Ph0C2 = c1758Ph0.c(C5638o21.k("collections"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C2, "child(...)");
        c = c1758Ph0C2;
        C1758Ph0 c1758Ph0C3 = c1758Ph0.c(C5638o21.k("ranges"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C3, "child(...)");
        d = c1758Ph0C3;
        C1758Ph0 c1758Ph0C4 = c1758Ph0.c(C5638o21.k(DebugImage.JVM));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C4, "child(...)");
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C4.c(C5638o21.k("internal")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C4.c(C5638o21.k("functions")), "child(...)");
        C1758Ph0 c1758Ph0C5 = c1758Ph0.c(C5638o21.k("annotation"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C5, "child(...)");
        e = c1758Ph0C5;
        C1758Ph0 c1758Ph0C6 = c1758Ph0.c(C5638o21.k("internal"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C6, "child(...)");
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C6.c(C5638o21.k("ir")), "child(...)");
        C1758Ph0 c1758Ph0C7 = c1758Ph0.c(C5638o21.k("coroutines"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C7, "child(...)");
        f = c1758Ph0C7;
        C1758Ph0 c1758Ph0C8 = c1758Ph0.c(C5638o21.k("enums"));
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C8, "child(...)");
        g = c1758Ph0C8;
        Intrinsics.checkNotNullExpressionValue(c1758Ph0.c(C5638o21.k("contracts")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(c1758Ph0.c(C5638o21.k("concurrent")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(c1758Ph0.c(C5638o21.k("test")), "child(...)");
        C1758Ph0[] elements = {c1758Ph0, c1758Ph0C2, c1758Ph0C3, c1758Ph0C5};
        Intrinsics.checkNotNullParameter(elements, "elements");
        C1526Mj.H(elements);
        C1758Ph0[] elements2 = {c1758Ph0, c1758Ph0C2, c1758Ph0C3, c1758Ph0C5, c1758Ph0C, c1758Ph0C6, c1758Ph0C7};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        C1526Mj.H(elements2);
        C3564eP1.a("Nothing");
        h = C3564eP1.a("Unit");
        i = C3564eP1.a("Any");
        j = C3564eP1.a("Enum");
        C3564eP1.a("Annotation");
        k = C3564eP1.a("Array");
        QC qcA = C3564eP1.a("Boolean");
        QC qcA2 = C3564eP1.a("Char");
        QC qcA3 = C3564eP1.a("Byte");
        QC qcA4 = C3564eP1.a("Short");
        QC qcA5 = C3564eP1.a("Int");
        QC qcA6 = C3564eP1.a("Long");
        QC qcA7 = C3564eP1.a("Float");
        QC qcA8 = C3564eP1.a("Double");
        l = C3564eP1.g(qcA3);
        m = C3564eP1.g(qcA4);
        n = C3564eP1.g(qcA5);
        o = C3564eP1.g(qcA6);
        C3564eP1.a("CharSequence");
        p = C3564eP1.a("String");
        C3564eP1.a("Throwable");
        C3564eP1.a("Cloneable");
        C3564eP1.f("KProperty");
        C3564eP1.f("KMutableProperty");
        C3564eP1.f("KProperty0");
        C3564eP1.f("KMutableProperty0");
        C3564eP1.f("KProperty1");
        C3564eP1.f("KMutableProperty1");
        C3564eP1.f("KProperty2");
        C3564eP1.f("KMutableProperty2");
        q = C3564eP1.f("KFunction");
        C3564eP1.f("KClass");
        C3564eP1.f("KCallable");
        C3564eP1.f("KType");
        C3564eP1.a("Comparable");
        C3564eP1.a("Number");
        C3564eP1.a("Function");
        QC[] elements3 = {qcA, qcA2, qcA3, qcA4, qcA5, qcA6, qcA7, qcA8};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set<QC> setH = C1526Mj.H(elements3);
        r = setH;
        QC[] elements4 = {qcA3, qcA4, qcA5, qcA6};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        C1526Mj.H(elements4);
        int iA = OW0.a(XE.m(setH, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : setH) {
            linkedHashMap.put(obj, C3564eP1.d(((QC) obj).f()));
        }
        C3564eP1.c(linkedHashMap);
        QC[] elements5 = {l, m, n, o};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set<QC> setH2 = C1526Mj.H(elements5);
        s = setH2;
        int iA2 = OW0.a(XE.m(setH2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (Object obj2 : setH2) {
            linkedHashMap2.put(obj2, C3564eP1.d(((QC) obj2).f()));
        }
        C3564eP1.c(linkedHashMap2);
        Set<QC> set = r;
        Set<QC> set2 = s;
        LinkedHashSet linkedHashSetD = C5907pJ1.d(set, set2);
        QC qc = p;
        C5907pJ1.e(linkedHashSetD, qc);
        C1758Ph0 packageFqName = f;
        C5638o21 topLevelName = C5638o21.k("Continuation");
        Intrinsics.checkNotNullExpressionValue(topLevelName, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        C1758Ph0 relativeClassName = C1758Ph0.j(topLevelName);
        Intrinsics.checkNotNullExpressionValue(relativeClassName, "topLevel(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        relativeClassName.d();
        C3564eP1.b("Iterator");
        C3564eP1.b("Iterable");
        C3564eP1.b("Collection");
        C3564eP1.b("List");
        C3564eP1.b("ListIterator");
        C3564eP1.b("Set");
        QC qcB = C3564eP1.b("Map");
        C3564eP1.b("MutableIterator");
        C3564eP1.b("CharIterator");
        C3564eP1.b("MutableIterable");
        C3564eP1.b("MutableCollection");
        t = C3564eP1.b("MutableList");
        C3564eP1.b("MutableListIterator");
        u = C3564eP1.b("MutableSet");
        QC qcB2 = C3564eP1.b("MutableMap");
        v = qcB2;
        C5638o21 c5638o21K = C5638o21.k("Entry");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        qcB.d(c5638o21K);
        C5638o21 c5638o21K2 = C5638o21.k("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        qcB2.d(c5638o21K2);
        C3564eP1.a("Result");
        C3564eP1.e("IntRange");
        C3564eP1.e("LongRange");
        C3564eP1.e("CharRange");
        C1758Ph0 packageFqName2 = e;
        C5638o21 topLevelName2 = C5638o21.k("AnnotationRetention");
        Intrinsics.checkNotNullExpressionValue(topLevelName2, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName2, "topLevelName");
        C1758Ph0 relativeClassName2 = C1758Ph0.j(topLevelName2);
        Intrinsics.checkNotNullExpressionValue(relativeClassName2, "topLevel(...)");
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName2, "relativeClassName");
        relativeClassName2.d();
        C5638o21 topLevelName3 = C5638o21.k("AnnotationTarget");
        Intrinsics.checkNotNullExpressionValue(topLevelName3, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName3, "topLevelName");
        C1758Ph0 relativeClassName3 = C1758Ph0.j(topLevelName3);
        Intrinsics.checkNotNullExpressionValue(relativeClassName3, "topLevel(...)");
        Intrinsics.checkNotNullParameter(packageFqName2, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName3, "relativeClassName");
        relativeClassName3.d();
        C3564eP1.a("DeprecationLevel");
        C1758Ph0 c1758Ph1 = g;
        C5638o21 c5638o21K3 = C5638o21.k("EnumEntries");
        Intrinsics.checkNotNullExpressionValue(c5638o21K3, "identifier(...)");
        w = new QC(c1758Ph1, c5638o21K3);
        C5907pJ1.e(C5907pJ1.e(C5907pJ1.e(C5907pJ1.e(C5907pJ1.d(set, set2), qc), h), i), j);
    }
}
