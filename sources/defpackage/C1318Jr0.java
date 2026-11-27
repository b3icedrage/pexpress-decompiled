package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1318Jr0 {

    @NotNull
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;
    public final int e;

    @NotNull
    public final ArrayList f;

    @Nullable
    public final ArrayList g;

    @Nullable
    public final String h;

    @NotNull
    public final String i;
    public final boolean j;

    /* JADX INFO: renamed from: Jr0$a */
    public static final class a {

        @Nullable
        public String a;

        @Nullable
        public String d;

        @NotNull
        public final ArrayList f;

        @Nullable
        public ArrayList g;

        @Nullable
        public String h;

        @NotNull
        public String b = "";

        @NotNull
        public String c = "";
        public int e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        @NotNull
        public final C1318Jr0 a() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strC = b.c(this.b, 0, 0, 7);
            String strC2 = b.c(this.c, 0, 0, 7);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(XE.m(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.c((String) it.next(), 0, 0, 7));
            }
            ArrayList<String> arrayList4 = this.g;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(XE.m(arrayList4, 10));
                for (String str3 : arrayList4) {
                    arrayList5.add(str3 != null ? b.c(str3, 0, 0, 3) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str4 = this.h;
            return new C1318Jr0(str, strC, strC2, str2, iB, arrayList3, arrayList, str4 != null ? b.c(str4, 0, 0, 7) : null, toString());
        }

        public final int b() {
            int i = this.e;
            if (i != -1) {
                return i;
            }
            String scheme = this.a;
            Intrinsics.checkNotNull(scheme);
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.a(scheme, "http")) {
                return 80;
            }
            return Intrinsics.a(scheme, "https") ? 443 : -1;
        }

        @NotNull
        public final void c(@Nullable String str) {
            String strA;
            this.g = (str == null || (strA = b.a(0, 0, 211, str, " \"'<>#")) == null) ? null : b.d(strA);
        }

        @NotNull
        public final void d(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strV = C1874Qu.v(b.c(host, 0, 0, 7));
            if (strV == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(host));
            }
            this.d = strV;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:102:0x01be A[LOOP:5: B:102:0x01be->B:235:?, LOOP_START, PHI: r1
          0x01be: PHI (r1v21 int) = (r1v10 int), (r1v22 int) binds: [B:101:0x01bc, B:235:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:114:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:121:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:125:0x0201  */
        /* JADX WARN: Code duplicated, block: B:127:0x0223  */
        /* JADX WARN: Code duplicated, block: B:129:0x023e  */
        /* JADX WARN: Code duplicated, block: B:130:0x0241  */
        /* JADX WARN: Code duplicated, block: B:132:0x0247  */
        /* JADX WARN: Code duplicated, block: B:133:0x024a  */
        /* JADX WARN: Code duplicated, block: B:137:0x0251  */
        /* JADX WARN: Code duplicated, block: B:192:0x0351  */
        /* JADX WARN: Code duplicated, block: B:229:0x01d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:230:0x01d6 A[EDGE_INSN: B:230:0x01d6->B:112:0x01d6 BREAK  A[LOOP:4: B:99:0x01b4->B:110:0x01d2], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:232:0x01d2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:233:0x01ca A[EDGE_INSN: B:233:0x01ca->B:106:0x01ca BREAK  A[LOOP:5: B:102:0x01be->B:235:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x007f  */
        /* JADX WARN: Code duplicated, block: B:71:0x012b  */
        /* JADX WARN: Code duplicated, block: B:74:0x0136  */
        /* JADX WARN: Code duplicated, block: B:75:0x013b  */
        @NotNull
        public final void e(@Nullable C1318Jr0 c1318Jr0, @NotNull String input) {
            int i;
            String str;
            byte b;
            int i2;
            int i3;
            int iF;
            byte bCharAt;
            int i4;
            int i5;
            String scheme;
            int i6;
            int i7;
            char cCharAt;
            char cCharAt2;
            int i8 = 1;
            Intrinsics.checkNotNullParameter(input, "input");
            byte[] bArr = C6806tc2.a;
            int iO = C6806tc2.o(0, input.length(), input);
            int iP = C6806tc2.p(iO, input.length(), input);
            byte b2 = -1;
            if (iP - iO >= 2) {
                char cCharAt3 = input.charAt(iO);
                char c = 'a';
                if ((Intrinsics.e(cCharAt3, 97) >= 0 && Intrinsics.e(cCharAt3, 122) <= 0) || (Intrinsics.e(cCharAt3, 65) >= 0 && Intrinsics.e(cCharAt3, 90) <= 0)) {
                    i = iO + 1;
                    while (true) {
                        if (i < iP) {
                            char cCharAt4 = input.charAt(i);
                            if ((c > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                                if (cCharAt4 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                i++;
                                c = 'a';
                            }
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            if (i != -1) {
                if (d.n(input, iO, "https:", true)) {
                    this.a = "https";
                    iO += 6;
                } else {
                    if (!d.n(input, iO, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a = "http";
                    iO += 5;
                }
            } else {
                if (c1318Jr0 == null) {
                    if (input.length() > 6) {
                        str = KS1.B(6, input) + "...";
                    } else {
                        str = input;
                    }
                    throw new IllegalArgumentException(C5491nL.c("Expected URL scheme 'http' or 'https' but no scheme was found for ", str));
                }
                this.a = c1318Jr0.a;
            }
            int i9 = iO;
            int i10 = 0;
            while (true) {
                b = 47;
                i2 = i8;
                if (i9 >= iP || !((cCharAt2 = input.charAt(i9)) == '\\' || cCharAt2 == '/')) {
                    break;
                }
                i10++;
                i9++;
                i8 = i2;
            }
            ArrayList arrayList = this.f;
            byte b3 = 35;
            if (i10 >= 2 || c1318Jr0 == null) {
                i3 = iO + i10;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    iF = C6806tc2.f(i3, iP, input, "@/\\?#");
                    if (iF != iP) {
                        bCharAt = input.charAt(iF);
                    } else {
                        bCharAt = b2;
                    }
                    if (bCharAt == b2 || bCharAt == b3 || bCharAt == b || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (i11 == 0) {
                            int iG = C6806tc2.g(input, ':', i3, iF);
                            String strA = b.a(i3, iG, 240, input, " \"':;<=>@[]^`{}|/\\?#");
                            if (i12 != 0) {
                                strA = this.b + "%40" + strA;
                            }
                            this.b = strA;
                            if (iG != iF) {
                                this.c = b.a(iG + 1, iF, 240, input, " \"':;<=>@[]^`{}|/\\?#");
                                i11 = i2;
                            }
                            i12 = i2;
                        } else {
                            this.c += "%40" + b.a(i3, iF, 240, input, " \"':;<=>@[]^`{}|/\\?#");
                        }
                        i3 = iF + 1;
                        b = 47;
                        b2 = -1;
                    }
                    b3 = 35;
                }
                i4 = i3;
                while (true) {
                    if (i4 >= iF) {
                        i4 = iF;
                        break;
                    }
                    cCharAt = input.charAt(i4);
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < iF) {
                                break;
                            }
                        } while (input.charAt(i4) != ']');
                    } else if (cCharAt == ':') {
                        break;
                    }
                    i4++;
                }
                i5 = i4 + 1;
                if (i5 < iF) {
                    this.d = C1874Qu.v(b.c(input, i3, i4, 4));
                    try {
                        i7 = Integer.parseInt(b.a(i5, iF, 248, input, ""));
                        if (i2 <= i7 || i7 >= 65536) {
                            i7 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.e = i7;
                    if (i7 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i5, iF);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    this.d = C1874Qu.v(b.c(input, i3, i4, 4));
                    scheme = this.a;
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    if (Intrinsics.a(scheme, "http")) {
                        i6 = 80;
                    } else if (Intrinsics.a(scheme, "https")) {
                        i6 = 443;
                    } else {
                        i6 = -1;
                    }
                    this.e = i6;
                }
                if (this.d != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i3, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                iO = iF;
            } else if (Intrinsics.a(c1318Jr0.a, this.a)) {
                this.b = c1318Jr0.e();
                this.c = c1318Jr0.a();
                this.d = c1318Jr0.d;
                this.e = c1318Jr0.e;
                arrayList.clear();
                arrayList.addAll(c1318Jr0.c());
                if (iO == iP || input.charAt(iO) == '#') {
                    c(c1318Jr0.d());
                }
            } else {
                i3 = iO + i10;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    iF = C6806tc2.f(i3, iP, input, "@/\\?#");
                    if (iF != iP) {
                        bCharAt = input.charAt(iF);
                    } else {
                        bCharAt = b2;
                    }
                    if (bCharAt == b2) {
                        break;
                    } else {
                        break;
                    }
                    b3 = 35;
                }
                i4 = i3;
                while (true) {
                    if (i4 >= iF) {
                        i4 = iF;
                        break;
                    }
                    cCharAt = input.charAt(i4);
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < iF) {
                                break;
                                break;
                            }
                        } while (input.charAt(i4) != ']');
                    } else if (cCharAt == ':') {
                        break;
                        break;
                    }
                    i4++;
                }
                i5 = i4 + 1;
                if (i5 < iF) {
                    this.d = C1874Qu.v(b.c(input, i3, i4, 4));
                    i7 = Integer.parseInt(b.a(i5, iF, 248, input, ""));
                    if (i2 <= i7) {
                        i7 = -1;
                    } else {
                        i7 = -1;
                    }
                    this.e = i7;
                    if (i7 == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring4 = input.substring(i5, iF);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(strSubstring4);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.d = C1874Qu.v(b.c(input, i3, i4, 4));
                    scheme = this.a;
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    if (Intrinsics.a(scheme, "http")) {
                        i6 = 80;
                    } else if (Intrinsics.a(scheme, "https")) {
                        i6 = 443;
                    } else {
                        i6 = -1;
                    }
                    this.e = i6;
                }
                if (this.d != null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring5 = input.substring(i3, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(strSubstring5);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iO = iF;
            }
            int iF2 = C6806tc2.f(iO, iP, input, "?#");
            if (iO != iF2) {
                char cCharAt5 = input.charAt(iO);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add("");
                    iO++;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
                while (iO < iF2) {
                    int iF3 = C6806tc2.f(iO, iF2, input, "/\\");
                    boolean z = iF3 < iF2;
                    String strA2 = b.a(iO, iF3, 240, input, " \"<>^`{}|/\\?#");
                    if (!Intrinsics.a(strA2, ".") && !d.i(strA2, "%2e")) {
                        if (!Intrinsics.a(strA2, "..") && !d.i(strA2, "%2e.") && !d.i(strA2, ".%2e") && !d.i(strA2, "%2e%2e")) {
                            if (((CharSequence) C1742Pc.c(1, arrayList)).length() == 0) {
                                arrayList.set(arrayList.size() - 1, strA2);
                            } else {
                                arrayList.add(strA2);
                            }
                            if (z) {
                                arrayList.add("");
                            }
                        } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                            arrayList.add("");
                        } else {
                            arrayList.set(arrayList.size() - 1, "");
                        }
                    }
                    iO = z ? iF3 + 1 : iF3;
                }
            }
            if (iF2 < iP && input.charAt(iF2) == '?') {
                int iG2 = C6806tc2.g(input, '#', iF2, iP);
                this.g = b.d(b.a(iF2 + 1, iG2, 208, input, " \"'<>#"));
                iF2 = iG2;
            }
            if (iF2 >= iP || input.charAt(iF2) != '#') {
                return;
            }
            this.h = b.a(iF2 + 1, iP, 176, input, "");
        }

        @NotNull
        public final void f(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(EK.e(i, "unexpected port: ").toString());
            }
            this.e = i;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0096  */
        @NotNull
        public final String toString() {
            StringBuilder out = new StringBuilder();
            String str = this.a;
            if (str != null) {
                out.append(str);
                out.append("://");
            } else {
                out.append("//");
            }
            if (this.b.length() > 0 || this.c.length() > 0) {
                out.append(this.b);
                if (this.c.length() > 0) {
                    out.append(':');
                    out.append(this.c);
                }
                out.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.D(str2, ':')) {
                    out.append('[');
                    out.append(this.d);
                    out.append(']');
                } else {
                    out.append(this.d);
                }
            }
            int i = -1;
            if (this.e != -1 || this.a != null) {
                int iB = b();
                String scheme = this.a;
                if (scheme != null) {
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    if (scheme.equals("http")) {
                        i = 80;
                    } else if (scheme.equals("https")) {
                        i = 443;
                    }
                    if (iB != i) {
                        out.append(':');
                        out.append(iB);
                    }
                } else {
                    out.append(':');
                    out.append(iB);
                }
            }
            ArrayList arrayList = this.f;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                out.append('/');
                out.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                out.append('?');
                ArrayList arrayList2 = this.g;
                Intrinsics.checkNotNull(arrayList2);
                b.e(arrayList2, out);
            }
            if (this.h != null) {
                out.append('#');
                out.append(this.h);
            }
            String string = out.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: Jr0$b */
    public static final class b {
        public static String a(int i, int i2, int i3, String str, String encodeSet) throws EOFException {
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z = (i3 & 8) == 0;
            boolean z2 = (i3 & 16) == 0;
            boolean z3 = (i3 & 32) == 0;
            boolean z4 = (i3 & 64) == 0;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i5 = 32;
                int i6 = UserVerificationMethods.USER_VERIFY_PATTERN;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt.D(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !b(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                    C1481Lu c1481Lu = new C1481Lu();
                    c1481Lu.v1(i4, iCharCount, str);
                    C1481Lu c1481Lu2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z3) {
                                c1481Lu.w1(z ? "+" : "%2B");
                            } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z4) || StringsKt.D(encodeSet, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !b(iCharCount, length, str)))))) {
                                if (c1481Lu2 == null) {
                                    c1481Lu2 = new C1481Lu();
                                }
                                c1481Lu2.x1(iCodePointAt2);
                                while (!c1481Lu2.t()) {
                                    byte bP = c1481Lu2.P();
                                    c1481Lu.j1(37);
                                    char[] cArr = C1318Jr0.k;
                                    c1481Lu.j1(cArr[((bP & 255) >> 4) & 15]);
                                    c1481Lu.j1(cArr[bP & 15]);
                                }
                            } else {
                                c1481Lu.x1(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i5 = 32;
                        i6 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    return c1481Lu.Q0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i4, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static boolean b(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C6806tc2.s(str.charAt(i + 1)) != -1 && C6806tc2.s(str.charAt(i3)) != -1;
        }

        public static String c(String str, int i, int i2, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            boolean z = (i3 & 4) == 0;
            Intrinsics.checkNotNullParameter(str, "<this>");
            int iCharCount = i;
            while (iCharCount < i2) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    C1481Lu c1481Lu = new C1481Lu();
                    c1481Lu.v1(i, iCharCount, str);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iS = C6806tc2.s(str.charAt(iCharCount + 1));
                            int iS2 = C6806tc2.s(str.charAt(i4));
                            if (iS == -1 || iS2 == -1) {
                                c1481Lu.x1(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                c1481Lu.j1((iS << 4) + iS2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            c1481Lu.j1(32);
                            iCharCount++;
                        } else {
                            c1481Lu.x1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return c1481Lu.Q0();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @NotNull
        public static ArrayList d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iF = StringsKt.F('&', i, 4, str);
                if (iF == -1) {
                    iF = str.length();
                }
                int iF2 = StringsKt.F('=', i, 4, str);
                if (iF2 == -1 || iF2 > iF) {
                    String strSubstring = str.substring(i, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iF2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iF2 + 1, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iF + 1;
            }
            return arrayList;
        }

        public static void e(@NotNull ArrayList arrayList, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            c cVarH = f.h(2, f.i(0, arrayList.size()));
            int i = cVarH.d;
            int i2 = cVarH.e;
            int i3 = cVarH.g;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) arrayList.get(i);
                String str2 = (String) arrayList.get(i + 1);
                if (i > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }
    }

    public C1318Jr0(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull ArrayList pathSegments, @Nullable ArrayList arrayList, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = scheme;
        this.b = username;
        this.c = password;
        this.d = host;
        this.e = i;
        this.f = pathSegments;
        this.g = arrayList;
        this.h = str;
        this.i = url;
        this.j = Intrinsics.a(scheme, "https");
    }

    @NotNull
    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(StringsKt.F(':', length, 4, str) + 1, StringsKt.F('@', 0, 6, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iF = StringsKt.F('/', length, 4, str);
        String strSubstring = str.substring(iF, C6806tc2.f(iF, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iF = StringsKt.F('/', length, 4, str);
        int iF2 = C6806tc2.f(iF, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iF < iF2) {
            int i = iF + 1;
            int iG = C6806tc2.g(str, '/', i, iF2);
            String strSubstring = str.substring(i, iG);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iF = iG;
        }
        return arrayList;
    }

    @Nullable
    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iF = StringsKt.F('?', 0, 6, str) + 1;
        String strSubstring = str.substring(iF, C6806tc2.g(str, '#', iF, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, C6806tc2.f(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C1318Jr0) && Intrinsics.a(((C1318Jr0) obj).i, this.i);
    }

    @NotNull
    public final a f() {
        int i;
        String strSubstring;
        a aVar = new a();
        String scheme = this.a;
        aVar.a = scheme;
        String strE = e();
        Intrinsics.checkNotNullParameter(strE, "<set-?>");
        aVar.b = strE;
        String strA = a();
        Intrinsics.checkNotNullParameter(strA, "<set-?>");
        aVar.c = strA;
        aVar.d = this.d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.a(scheme, "http")) {
            i = 80;
        } else {
            i = Intrinsics.a(scheme, "https") ? 443 : -1;
        }
        int i2 = this.e;
        aVar.e = i2 != i ? i2 : -1;
        ArrayList arrayList = aVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        aVar.c(d());
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str = this.i;
            strSubstring = str.substring(StringsKt.F('#', 0, 6, str) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.h = strSubstring;
        return aVar;
    }

    @Nullable
    public final a g(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            a aVar = new a();
            aVar.e(this, link);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    public final String h() {
        a aVarG = g("/...");
        Intrinsics.checkNotNull(aVarG);
        aVarG.getClass();
        Intrinsics.checkNotNullParameter("", "username");
        aVarG.b = b.a(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        Intrinsics.checkNotNullParameter("", "password");
        aVarG.c = b.a(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return aVarG.a().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @NotNull
    public final URI i() {
        a aVarF = f();
        String str = aVarF.d;
        aVarF.d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        ArrayList arrayList = aVarF.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, b.a(0, 0, 227, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = aVarF.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? b.a(0, 0, 195, str2, "\\^`{|}") : null);
            }
        }
        String str3 = aVarF.h;
        aVarF.h = str3 != null ? b.a(0, 0, 163, str3, " \"#<>\\^`{|}") : null;
        String string = aVarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    public final URL j() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final String toString() {
        return this.i;
    }
}
