package defpackage;

import com.google.android.gms.common.api.Api;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6806tc2 {

    @NotNull
    public static final byte[] a;

    @NotNull
    public static final C2813ao0 b = C2813ao0.b.c(new String[0]);

    @NotNull
    public static final C1169Ht1 c;

    @NotNull
    public static final C4437ia1 d;

    @NotNull
    public static final TimeZone e;

    @NotNull
    public static final Regex f;

    @NotNull
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C1481Lu c1481Lu = new C1481Lu();
        c1481Lu.b1(bArr);
        long j = 0;
        Intrinsics.checkNotNullParameter(c1481Lu, "<this>");
        c = new C1169Ht1(null, j, c1481Lu);
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        c(j, j, j);
        new C5182ls1(null, 0, bArr);
        int i = C4437ia1.h;
        C1802Pw c1802Pw = C1802Pw.h;
        d = C4437ia1.a.b(C1802Pw.a.b("efbbbf"), C1802Pw.a.b("feff"), C1802Pw.a.b("fffe"), C1802Pw.a.b("0000ffff"), C1802Pw.a.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        e = timeZone;
        f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = C6711t81.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        g = StringsKt.N(StringsKt.M(name, "okhttp3."), "Client");
    }

    @NotNull
    public static final String A(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iO = o(i, i2, str);
        String strSubstring = str.substring(iO, p(iO, i2, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final boolean a(@NotNull C1318Jr0 c1318Jr0, @NotNull C1318Jr0 other) {
        Intrinsics.checkNotNullParameter(c1318Jr0, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.a(c1318Jr0.d, other.d) && c1318Jr0.e == other.e && Intrinsics.a(c1318Jr0.a, other.a);
    }

    public static final int b(@NotNull String name, long j, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j < 0) {
            throw new IllegalStateException(name.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(name.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(name.concat(" too small.").toString());
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, int i2, @NotNull String str, @NotNull String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            if (StringsKt.D(delimiters, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(@NotNull String str, char c2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int h(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return g(str, c2, i, i2);
    }

    public static final boolean i(@NotNull UN1 un1) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(un1, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return v(un1, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final String j(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean k(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C6411rj c6411rjL = C6621sj.l(strArr2);
                while (c6411rjL.hasNext()) {
                    if (comparator.compare(str, (String) c6411rjL.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long l(@NotNull C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(c0857Dt1, "<this>");
        String strB = c0857Dt1.j.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(strB, "<this>");
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> m(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(WE.f(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.e(cCharAt, 31) <= 0 || Intrinsics.e(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int o(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int p(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    @NotNull
    public static final String[] q(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean r(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return d.i(name, "Authorization") || d.i(name, "Cookie") || d.i(name, "Proxy-Authorization") || d.i(name, "Set-Cookie");
    }

    public static final int s(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    @NotNull
    public static final Charset t(@NotNull InterfaceC2833av interfaceC2833av, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(interfaceC2833av, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iJ = interfaceC2833av.J(d);
        if (iJ == -1) {
            return charset;
        }
        if (iJ == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iJ == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iJ == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iJ == 3) {
            Charsets.a.getClass();
            Charset charset2 = Charsets.e;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            Charsets.e = charsetForName;
            return charsetForName;
        }
        if (iJ != 4) {
            throw new AssertionError();
        }
        Charsets.a.getClass();
        Charset charset3 = Charsets.d;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        Charsets.d = charsetForName2;
        return charsetForName2;
    }

    public static final int u(@NotNull C3024bo1 c3024bo1) {
        Intrinsics.checkNotNullParameter(c3024bo1, "<this>");
        return (c3024bo1.g() & 255) | ((c3024bo1.g() & 255) << 16) | ((c3024bo1.g() & 255) << 8);
    }

    public static final boolean v(@NotNull UN1 un1, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(un1, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = un1.o().e() ? un1.o().c() - jNanoTime : Long.MAX_VALUE;
        un1.o().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C1481Lu c1481Lu = new C1481Lu();
            while (un1.s0(c1481Lu, 8192L) != -1) {
                c1481Lu.g();
            }
            if (jC == Long.MAX_VALUE) {
                un1.o().a();
                return true;
            }
            un1.o().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                un1.o().a();
                return false;
            }
            un1.o().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                un1.o().a();
            } else {
                un1.o().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    @NotNull
    public static final C2813ao0 w(@NotNull List<C1932Rn0> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C2813ao0.a aVar = new C2813ao0.a();
        for (C1932Rn0 c1932Rn0 : list) {
            aVar.c(c1932Rn0.a.q(), c1932Rn0.b.q());
        }
        return aVar.d();
    }

    @NotNull
    public static final String x(@NotNull C1318Jr0 c1318Jr0, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(c1318Jr0, "<this>");
        boolean zC = StringsKt.C(c1318Jr0.d, ":", false);
        String strD = c1318Jr0.d;
        if (zC) {
            strD = C1742Pc.d(']', "[", strD);
        }
        int i2 = c1318Jr0.e;
        if (!z) {
            String scheme = c1318Jr0.a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.a(scheme, "http")) {
                i = 80;
            } else {
                i = Intrinsics.a(scheme, "https") ? 443 : -1;
            }
            if (i2 == i) {
                return strD;
            }
        }
        return strD + ':' + i2;
    }

    @NotNull
    public static final <T> List<T> y(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.f0(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int z(int i, @Nullable String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
