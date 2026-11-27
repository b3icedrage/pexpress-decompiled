package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class V91 {

    @NotNull
    public static final C5638o21 a;

    @NotNull
    public static final C5638o21 b;

    @NotNull
    public static final C5638o21 c;

    @NotNull
    public static final C5638o21 d;

    @NotNull
    public static final C5638o21 e;

    @NotNull
    public static final C5638o21 f;

    @NotNull
    public static final C5638o21 g;

    @NotNull
    public static final C5638o21 h;

    @NotNull
    public static final C5638o21 i;

    @NotNull
    public static final C5638o21 j;

    @NotNull
    public static final C5638o21 k;

    @NotNull
    public static final C5638o21 l;

    @NotNull
    public static final Regex m;

    @NotNull
    public static final C5638o21 n;

    @NotNull
    public static final C5638o21 o;

    @NotNull
    public static final C5638o21 p;

    @NotNull
    public static final C5638o21 q;

    @NotNull
    public static final Set<C5638o21> r;

    @NotNull
    public static final Set<C5638o21> s;

    @NotNull
    public static final Set<C5638o21> t;

    @NotNull
    public static final Object u;

    @NotNull
    public static final Object v;

    static {
        C5638o21 c5638o21K = C5638o21.k("getValue");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        a = c5638o21K;
        C5638o21 c5638o21K2 = C5638o21.k("setValue");
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        b = c5638o21K2;
        C5638o21 c5638o21K3 = C5638o21.k("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(c5638o21K3, "identifier(...)");
        c = c5638o21K3;
        C5638o21 c5638o21K4 = C5638o21.k("equals");
        Intrinsics.checkNotNullExpressionValue(c5638o21K4, "identifier(...)");
        d = c5638o21K4;
        Intrinsics.checkNotNullExpressionValue(C5638o21.k("hashCode"), "identifier(...)");
        C5638o21 c5638o21K5 = C5638o21.k("compareTo");
        Intrinsics.checkNotNullExpressionValue(c5638o21K5, "identifier(...)");
        e = c5638o21K5;
        C5638o21 c5638o21K6 = C5638o21.k("contains");
        Intrinsics.checkNotNullExpressionValue(c5638o21K6, "identifier(...)");
        f = c5638o21K6;
        C5638o21 c5638o21K7 = C5638o21.k("invoke");
        Intrinsics.checkNotNullExpressionValue(c5638o21K7, "identifier(...)");
        g = c5638o21K7;
        C5638o21 c5638o21K8 = C5638o21.k("iterator");
        Intrinsics.checkNotNullExpressionValue(c5638o21K8, "identifier(...)");
        h = c5638o21K8;
        C5638o21 c5638o21K9 = C5638o21.k("get");
        Intrinsics.checkNotNullExpressionValue(c5638o21K9, "identifier(...)");
        i = c5638o21K9;
        C5638o21 c5638o21K10 = C5638o21.k("set");
        Intrinsics.checkNotNullExpressionValue(c5638o21K10, "identifier(...)");
        j = c5638o21K10;
        C5638o21 c5638o21K11 = C5638o21.k("next");
        Intrinsics.checkNotNullExpressionValue(c5638o21K11, "identifier(...)");
        k = c5638o21K11;
        C5638o21 c5638o21K12 = C5638o21.k("hasNext");
        Intrinsics.checkNotNullExpressionValue(c5638o21K12, "identifier(...)");
        l = c5638o21K12;
        Intrinsics.checkNotNullExpressionValue(C5638o21.k("toString"), "identifier(...)");
        m = new Regex("component\\d+");
        C5638o21 c5638o21K13 = C5638o21.k("and");
        Intrinsics.checkNotNullExpressionValue(c5638o21K13, "identifier(...)");
        C5638o21 c5638o21K14 = C5638o21.k("or");
        Intrinsics.checkNotNullExpressionValue(c5638o21K14, "identifier(...)");
        C5638o21 c5638o21K15 = C5638o21.k("xor");
        Intrinsics.checkNotNullExpressionValue(c5638o21K15, "identifier(...)");
        C5638o21 c5638o21K16 = C5638o21.k("inv");
        Intrinsics.checkNotNullExpressionValue(c5638o21K16, "identifier(...)");
        C5638o21 c5638o21K17 = C5638o21.k("shl");
        Intrinsics.checkNotNullExpressionValue(c5638o21K17, "identifier(...)");
        C5638o21 c5638o21K18 = C5638o21.k("shr");
        Intrinsics.checkNotNullExpressionValue(c5638o21K18, "identifier(...)");
        C5638o21 c5638o21K19 = C5638o21.k("ushr");
        Intrinsics.checkNotNullExpressionValue(c5638o21K19, "identifier(...)");
        C5638o21 c5638o21K20 = C5638o21.k("inc");
        Intrinsics.checkNotNullExpressionValue(c5638o21K20, "identifier(...)");
        n = c5638o21K20;
        C5638o21 c5638o21K21 = C5638o21.k("dec");
        Intrinsics.checkNotNullExpressionValue(c5638o21K21, "identifier(...)");
        o = c5638o21K21;
        C5638o21 c5638o21K22 = C5638o21.k("plus");
        Intrinsics.checkNotNullExpressionValue(c5638o21K22, "identifier(...)");
        C5638o21 c5638o21K23 = C5638o21.k("minus");
        Intrinsics.checkNotNullExpressionValue(c5638o21K23, "identifier(...)");
        C5638o21 c5638o21K24 = C5638o21.k("not");
        Intrinsics.checkNotNullExpressionValue(c5638o21K24, "identifier(...)");
        C5638o21 c5638o21K25 = C5638o21.k("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(c5638o21K25, "identifier(...)");
        C5638o21 c5638o21K26 = C5638o21.k("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(c5638o21K26, "identifier(...)");
        C5638o21 c5638o21K27 = C5638o21.k("times");
        Intrinsics.checkNotNullExpressionValue(c5638o21K27, "identifier(...)");
        C5638o21 c5638o21K28 = C5638o21.k("div");
        Intrinsics.checkNotNullExpressionValue(c5638o21K28, "identifier(...)");
        C5638o21 c5638o21K29 = C5638o21.k("mod");
        Intrinsics.checkNotNullExpressionValue(c5638o21K29, "identifier(...)");
        C5638o21 c5638o21K30 = C5638o21.k("rem");
        Intrinsics.checkNotNullExpressionValue(c5638o21K30, "identifier(...)");
        C5638o21 c5638o21K31 = C5638o21.k("rangeTo");
        Intrinsics.checkNotNullExpressionValue(c5638o21K31, "identifier(...)");
        p = c5638o21K31;
        C5638o21 c5638o21K32 = C5638o21.k("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(c5638o21K32, "identifier(...)");
        q = c5638o21K32;
        C5638o21 c5638o21K33 = C5638o21.k("timesAssign");
        Intrinsics.checkNotNullExpressionValue(c5638o21K33, "identifier(...)");
        C5638o21 c5638o21K34 = C5638o21.k("divAssign");
        Intrinsics.checkNotNullExpressionValue(c5638o21K34, "identifier(...)");
        C5638o21 c5638o21K35 = C5638o21.k("modAssign");
        Intrinsics.checkNotNullExpressionValue(c5638o21K35, "identifier(...)");
        C5638o21 c5638o21K36 = C5638o21.k("remAssign");
        Intrinsics.checkNotNullExpressionValue(c5638o21K36, "identifier(...)");
        C5638o21 c5638o21K37 = C5638o21.k("plusAssign");
        Intrinsics.checkNotNullExpressionValue(c5638o21K37, "identifier(...)");
        C5638o21 c5638o21K38 = C5638o21.k("minusAssign");
        Intrinsics.checkNotNullExpressionValue(c5638o21K38, "identifier(...)");
        C5638o21 c5638o21K39 = C5638o21.k("toDouble");
        Intrinsics.checkNotNullExpressionValue(c5638o21K39, "identifier(...)");
        C5638o21 c5638o21K40 = C5638o21.k("toFloat");
        Intrinsics.checkNotNullExpressionValue(c5638o21K40, "identifier(...)");
        C5638o21 c5638o21K41 = C5638o21.k("toLong");
        Intrinsics.checkNotNullExpressionValue(c5638o21K41, "identifier(...)");
        C5638o21 c5638o21K42 = C5638o21.k("toInt");
        Intrinsics.checkNotNullExpressionValue(c5638o21K42, "identifier(...)");
        C5638o21 c5638o21K43 = C5638o21.k("toChar");
        Intrinsics.checkNotNullExpressionValue(c5638o21K43, "identifier(...)");
        C5638o21 c5638o21K44 = C5638o21.k("toShort");
        Intrinsics.checkNotNullExpressionValue(c5638o21K44, "identifier(...)");
        C5638o21 c5638o21K45 = C5638o21.k("toByte");
        Intrinsics.checkNotNullExpressionValue(c5638o21K45, "identifier(...)");
        C5638o21[] elements = {c5638o21K20, c5638o21K21, c5638o21K26, c5638o21K25, c5638o21K24, c5638o21K16};
        Intrinsics.checkNotNullParameter(elements, "elements");
        C1526Mj.H(elements);
        C5638o21[] elements2 = {c5638o21K26, c5638o21K25, c5638o21K24, c5638o21K16};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        r = C1526Mj.H(elements2);
        C5638o21[] elements3 = {c5638o21K27, c5638o21K22, c5638o21K23, c5638o21K28, c5638o21K29, c5638o21K30, c5638o21K31, c5638o21K32};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set<C5638o21> setH = C1526Mj.H(elements3);
        s = setH;
        C5638o21[] elements4 = {c5638o21K27, c5638o21K22, c5638o21K23, c5638o21K28, c5638o21K29, c5638o21K30};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        C1526Mj.H(elements4);
        C5638o21[] elements5 = {c5638o21K13, c5638o21K14, c5638o21K15, c5638o21K16, c5638o21K17, c5638o21K18, c5638o21K19};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set setH2 = C1526Mj.H(elements5);
        C5638o21[] elements6 = {c5638o21K13, c5638o21K14, c5638o21K15, c5638o21K17, c5638o21K18, c5638o21K19};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        C1526Mj.H(elements6);
        LinkedHashSet linkedHashSetD = C5907pJ1.d(setH, setH2);
        C5638o21[] elements7 = {c5638o21K4, c5638o21K6, c5638o21K5};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        C5907pJ1.d(linkedHashSetD, C1526Mj.H(elements7));
        C5638o21[] elements8 = {c5638o21K33, c5638o21K34, c5638o21K35, c5638o21K36, c5638o21K37, c5638o21K38};
        Intrinsics.checkNotNullParameter(elements8, "elements");
        Set<C5638o21> setH3 = C1526Mj.H(elements8);
        t = setH3;
        C5638o21[] elements9 = {c5638o21K, c5638o21K2, c5638o21K3};
        Intrinsics.checkNotNullParameter(elements9, "elements");
        C1526Mj.H(elements9);
        u = PW0.e(new Pair(c5638o21K29, c5638o21K30), new Pair(c5638o21K35, c5638o21K36));
        C5907pJ1.d(C5487nJ1.b(c5638o21K10), setH3);
        C5638o21[] elements10 = {c5638o21K39, c5638o21K40, c5638o21K41, c5638o21K42, c5638o21K44, c5638o21K45, c5638o21K43};
        Intrinsics.checkNotNullParameter(elements10, "elements");
        C1526Mj.H(elements10);
        v = PW0.e(new Pair(c5638o21K20, "++"), new Pair(c5638o21K21, "--"), new Pair(c5638o21K26, "+"), new Pair(c5638o21K25, "-"), new Pair(c5638o21K24, "!"), new Pair(c5638o21K27, "*"), new Pair(c5638o21K22, "+"), new Pair(c5638o21K23, "-"), new Pair(c5638o21K28, "/"), new Pair(c5638o21K30, "%"), new Pair(c5638o21K31, ".."), new Pair(c5638o21K32, "..<"));
    }
}
