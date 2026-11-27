package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class C1526Mj extends C1371Kj {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Mj$a */
    public static final class a<T> implements Iterable<T>, InterfaceC6745tJ0 {
        public final /* synthetic */ Object[] d;

        public a(Object[] objArr) {
            this.d = objArr;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return C6621sj.l(this.d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Mj$b */
    public static final class b<T> implements Sequence<T> {
        public final /* synthetic */ Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public final Iterator<T> iterator() {
            return C6621sj.l(this.a);
        }
    }

    public static <T> T A(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static <T> List<T> B(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOf(...)");
            Intrinsics.checkNotNullParameter(tArr, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return C1371Kj.b(tArr);
    }

    @NotNull
    public static List<Float> C(@NotNull float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C5653o60.d;
        }
        int length = fArr.length;
        if (i >= length) {
            return E(fArr);
        }
        if (i == 1) {
            return VE.c(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(Float.valueOf(fArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final void D(@NotNull Object[] objArr, @NotNull LinkedHashSet destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
    }

    @NotNull
    public static List<Float> E(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return C5653o60.d;
        }
        if (length == 1) {
            return VE.c(Float.valueOf(fArr[0]));
        }
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> F(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C5653o60.d;
        }
        if (length == 1) {
            return VE.c(tArr[0]);
        }
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(new C5572nj(tArr, false));
    }

    @NotNull
    public static Set<Integer> G(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C6702t60.d;
        }
        if (length == 1) {
            return C5487nJ1.b(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet destination = new LinkedHashSet(OW0.a(iArr.length));
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i : iArr) {
            destination.add(Integer.valueOf(i));
        }
        return destination;
    }

    @NotNull
    public static <T> Set<T> H(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C6702t60.d;
        }
        if (length == 1) {
            return C5487nJ1.b(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(OW0.a(tArr.length));
        D(tArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static ArrayList I(@NotNull Object[] objArr, @NotNull Object[] other) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(objArr[i], other[i]));
        }
        return arrayList;
    }

    @NotNull
    public static <T> Iterable<T> h(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? C5653o60.d : new a(tArr);
    }

    @NotNull
    public static <T> Sequence<T> i(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? C6492s60.a : new b(tArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean j(@NotNull byte[] bArr, byte b2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (b2 == bArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean k(@NotNull char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    public static boolean l(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j == jArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean m(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return u(tArr, t) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean n(@NotNull short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            if (s == sArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static ArrayList o(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static double p(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T q(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static <T> T r(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @Nullable
    public static Integer s(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    @Nullable
    public static <T> T t(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static <T> int u(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (t.equals(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @NotNull
    public static final void v(@NotNull Object[] objArr, @NotNull StringBuilder buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append(prefix);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                buffer.append(separator);
            }
            CS1.a(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    public static String w(byte[] bArr, String separator, C5117lb c5117lb, int i) {
        String prefix = (i & 2) != 0 ? "" : "[";
        String postfix = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            c5117lb = null;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i2 = 0;
        for (byte b2 : bArr) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (c5117lb != null) {
                buffer.append((CharSequence) c5117lb.invoke(Byte.valueOf(b2)));
            } else {
                buffer.append((CharSequence) String.valueOf((int) b2));
            }
        }
        buffer.append((CharSequence) postfix);
        return buffer.toString();
    }

    public static String x(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String postfix = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        v(objArr, sb, separator, prefix, postfix, function1);
        return sb.toString();
    }

    public static <T> T y(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[tArr.length - 1];
    }

    public static char z(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
