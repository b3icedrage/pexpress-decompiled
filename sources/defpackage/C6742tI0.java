package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6742tI0 {

    @NotNull
    public static final LinkedHashSet a = C5907pJ1.e(C3787fU.i("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    @NotNull
    public static final LinkedHashSet b;

    @NotNull
    public static final LinkedHashSet c;

    @NotNull
    public static final LinkedHashSet d;

    @NotNull
    public static final LinkedHashSet e;

    @NotNull
    public static final LinkedHashSet f;

    @NotNull
    public static final LinkedHashSet g;

    static {
        List<DI0> listF = WE.f(DI0.BOOLEAN, DI0.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (DI0 di0 : listF) {
            C1758Ph0 c1758Ph0 = di0.h;
            if (c1758Ph0 == null) {
                DI0.b(15);
                throw null;
            }
            String strE = c1758Ph0.f().e();
            Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
            C2904bF.o(linkedHashSet, C3787fU.h(strE, di0.e + "Value()" + di0.f()));
        }
        b = C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(linkedHashSet, C3787fU.i("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C3787fU.h("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C3787fU.h("Double", "isInfinite()Z", "isNaN()Z")), C3787fU.h("Float", "isInfinite()Z", "isNaN()Z")), C3787fU.h("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C3787fU.h("CharSequence", "isEmpty()Z"));
        c = C3787fU.i("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        d = C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C5907pJ1.d(C3787fU.h("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C3787fU.i("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C3787fU.h("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C3787fU.h("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C3787fU.i("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C3787fU.i("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C3787fU.i("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        e = C5907pJ1.d(C5907pJ1.d(C3787fU.i("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C3787fU.i("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C3787fU.i("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        DI0 di1 = DI0.BOOLEAN;
        DI0 di2 = DI0.BYTE;
        List listF2 = WE.f(di1, di2, DI0.DOUBLE, DI0.FLOAT, di2, DI0.INT, DI0.LONG, DI0.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listF2.iterator();
        while (it.hasNext()) {
            C1758Ph0 c1758Ph1 = ((DI0) it.next()).h;
            if (c1758Ph1 == null) {
                DI0.b(15);
                throw null;
            }
            String strE2 = c1758Ph1.f().e();
            Intrinsics.checkNotNullExpressionValue(strE2, "asString(...)");
            String[] strArrD = C3787fU.d("Ljava/lang/String;");
            C2904bF.o(linkedHashSet2, C3787fU.h(strE2, (String[]) Arrays.copyOf(strArrD, strArrD.length)));
        }
        String[] strArrD2 = C3787fU.d("D");
        LinkedHashSet linkedHashSetD = C5907pJ1.d(linkedHashSet2, C3787fU.h("Float", (String[]) Arrays.copyOf(strArrD2, strArrD2.length)));
        String[] strArrD3 = C3787fU.d("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = C5907pJ1.d(linkedHashSetD, C3787fU.h("String", (String[]) Arrays.copyOf(strArrD3, strArrD3.length)));
        String[] strArrD4 = C3787fU.d("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = C3787fU.h("Throwable", (String[]) Arrays.copyOf(strArrD4, strArrD4.length));
    }

    public static boolean a(@NotNull C1836Qh0 arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "fqName");
        if (Intrinsics.a(arrayFqName, C4194hP1.a.g)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return C4194hP1.a.d0.get(arrayFqName) != null;
    }
}
