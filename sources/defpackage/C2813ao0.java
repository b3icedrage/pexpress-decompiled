package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ao0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2813ao0 implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC6745tJ0 {

    @NotNull
    public final String[] d;

    /* JADX INFO: renamed from: ao0$a */
    public static final class a {

        @NotNull
        public final ArrayList a = new ArrayList(20);

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b.a(name);
            b.b(value, name);
            c(name, value);
        }

        @NotNull
        public final void b(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iF = StringsKt.F(':', 1, 4, line);
            if (iF != -1) {
                String strSubstring = line.substring(0, iF);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iF + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
        }

        @NotNull
        public final void c(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.a;
            arrayList.add(name);
            arrayList.add(StringsKt.d0(value).toString());
        }

        @NotNull
        public final C2813ao0 d() {
            return new C2813ao0((String[]) this.a.toArray(new String[0]));
        }

        @Nullable
        public final String e(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 2;
            int iK = C1952Ru.k(size, 0, -2);
            if (iK > size) {
                return null;
            }
            while (!d.i(name, (String) arrayList.get(size))) {
                if (size == iK) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        @NotNull
        public final void f(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (d.i(name, (String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    /* JADX INFO: renamed from: ao0$b */
    public static final class b {
        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(C6806tc2.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6806tc2.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(C6806tc2.r(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        @NotNull
        public static C2813ao0 c(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i2] = StringsKt.d0(str).toString();
            }
            int iK = C1952Ru.k(0, strArr.length - 1, 2);
            if (iK >= 0) {
                while (true) {
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    a(str2);
                    b(str3, str2);
                    if (i == iK) {
                        break;
                    }
                    i += 2;
                }
            }
            return new C2813ao0(strArr);
        }
    }

    public C2813ao0(String[] strArr) {
        this.d = strArr;
    }

    @Nullable
    public final String b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.d;
        int length = strArr.length - 2;
        int iK = C1952Ru.k(length, 0, -2);
        if (iK > length) {
            return null;
        }
        while (!d.i(name, strArr[length])) {
            if (length == iK) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    @NotNull
    public final String c(int i) {
        return this.d[i * 2];
    }

    @NotNull
    public final a d() {
        a aVar = new a();
        C2904bF.p(aVar.a, this.d);
        return aVar;
    }

    @NotNull
    public final TreeMap e() {
        Intrinsics.checkNotNullParameter(C4881kS1.a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            Locale locale = Locale.US;
            String strG = C4564j.g(locale, "US", strC, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strG);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strG, arrayList);
            }
            arrayList.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C2813ao0) {
            return Arrays.equals(this.d, ((C2813ao0) obj).d);
        }
        return false;
    }

    @NotNull
    public final String f(int i) {
        return this.d[(i * 2) + 1];
    }

    @NotNull
    public final List<String> h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (d.i(name, c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        if (arrayList == null) {
            return C5653o60.d;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(c(i), f(i));
        }
        return C6621sj.l(pairArr);
    }

    public final int size() {
        return this.d.length / 2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strF = f(i);
            sb.append(strC);
            sb.append(": ");
            if (C6806tc2.r(strC)) {
                strF = "██";
            }
            sb.append(strF);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
