package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1081Gq0 {
    static {
        C1802Pw c1802Pw = C1802Pw.h;
        C1802Pw.a.c("\"\\");
        C1802Pw.a.c("\t ,=");
    }

    public static final boolean a(@NotNull C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(c0857Dt1, "<this>");
        if (Intrinsics.a(c0857Dt1.d.b, "HEAD")) {
            return false;
        }
        int i = c0857Dt1.h;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && C6806tc2.l(c0857Dt1) == -1 && !"chunked".equalsIgnoreCase(C0857Dt1.f(c0857Dt1, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x020f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0073 A[EDGE_INSN: B:16:0x0073->B:110:0x020a BREAK  A[LOOP:1: B:21:0x009f->B:65:0x0157]] */
    public static final void b(@NotNull N7 n7, @NotNull C1318Jr0 url, @NotNull C2813ao0 headers) {
        List cookies;
        XM xm;
        int i;
        Intrinsics.checkNotNullParameter(n7, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (n7 == N7.d) {
            return;
        }
        Pattern pattern = XM.j;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        List<String> listH = headers.h("Set-Cookie");
        int size = listH.size();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            String setCookie = listH.get(i3);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            char c = ';';
            int iH = C6806tc2.h(setCookie, ';', i2, i2, 6);
            int iH2 = C6806tc2.h(setCookie, '=', i2, iH, 2);
            if (iH2 == iH) {
                i = i2;
            } else {
                String strA = C6806tc2.A(i2, iH2, setCookie);
                if (strA.length() == 0 || C6806tc2.n(strA) != -1) {
                    xm = null;
                    i = 0;
                    break;
                }
                String strA2 = C6806tc2.A(iH2 + 1, iH, setCookie);
                if (C6806tc2.n(strA2) == -1) {
                    int i4 = iH + 1;
                    int length = setCookie.length();
                    long j = 253402300799999L;
                    boolean z = true;
                    long jB = 253402300799999L;
                    String str = null;
                    String str2 = null;
                    long j2 = -1;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (true) {
                        if (i4 >= length) {
                            if (j2 == Long.MIN_VALUE) {
                                j = Long.MIN_VALUE;
                            } else if (j2 != -1) {
                                long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) : Long.MAX_VALUE);
                                if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                    j = j3;
                                }
                            } else {
                                j = jB;
                            }
                            String str3 = url.d;
                            if (str == null) {
                                str = str3;
                            } else if (!Intrinsics.a(str3, str)) {
                                if (d.h(str3, str, false) && str3.charAt((str3.length() - str.length()) - 1) == '.') {
                                    Intrinsics.checkNotNullParameter(str3, "<this>");
                                    if (!C6806tc2.f.d(str3)) {
                                    }
                                }
                                i = 0;
                            }
                            if (str3.length() != str.length() && PublicSuffixDatabase.g.a(str) == null) {
                                xm = null;
                                i = 0;
                                break;
                            }
                            String strSubstring = "/";
                            i = 0;
                            if (str2 == null || !d.o(str2, "/", false)) {
                                String strB = url.b();
                                int iJ = StringsKt.J('/', 0, 6, strB);
                                if (iJ != 0) {
                                    strSubstring = strB.substring(0, iJ);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                str2 = strSubstring;
                            }
                            xm = new XM(strA, strA2, j, str, str2, z4, z2, z3, z);
                            break;
                        }
                        int iG = C6806tc2.g(setCookie, c, i4, length);
                        int i5 = length;
                        int iG2 = C6806tc2.g(setCookie, '=', i4, iG);
                        String strA3 = C6806tc2.A(i4, iG2, setCookie);
                        String strA4 = iG2 < iG ? C6806tc2.A(iG2 + 1, iG, setCookie) : "";
                        if (d.i(strA3, "expires")) {
                            try {
                                jB = XM.a.b(strA4.length(), strA4);
                                z3 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (d.i(strA3, "max-age")) {
                            try {
                                j2 = Long.parseLong(strA4);
                                if (j2 <= 0) {
                                    j2 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e) {
                                if (!new Regex("-?\\d+").d(strA4)) {
                                    throw e;
                                }
                                j2 = d.o(strA4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z3 = true;
                        } else if (d.i(strA3, "domain")) {
                            if (d.h(strA4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strV = C1874Qu.v(StringsKt.M(strA4, "."));
                            if (strV == null) {
                                throw new IllegalArgumentException();
                            }
                            str = strV;
                            z = false;
                        } else if (d.i(strA3, "path")) {
                            str2 = strA4;
                        } else if (d.i(strA3, "secure")) {
                            z4 = true;
                        } else if (d.i(strA3, "httponly")) {
                            z2 = true;
                        }
                        i4 = iG + 1;
                        c = ';';
                        length = i5;
                    }
                } else {
                    xm = null;
                    i = 0;
                    break;
                }
                if (xm != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(xm);
                }
                i3++;
                i2 = i;
            }
            xm = null;
            if (xm != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(xm);
            }
            i3++;
            i2 = i;
        }
        if (arrayList != null) {
            cookies = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(cookies, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            cookies = C5653o60.d;
        }
        if (cookies.isEmpty()) {
            return;
        }
        n7.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
