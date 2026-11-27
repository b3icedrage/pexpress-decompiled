package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3512e82 {

    @NotNull
    public static final List<String> a = VE.c("");

    public static final int a(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '[') {
                z = true;
            } else if (cCharAt == ']') {
                z = false;
            } else if (cCharAt == ':' && !z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @NotNull
    public static final Z72 b(@NotNull Z72 z72, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(z72, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (StringsKt.I(urlString)) {
            return z72;
        }
        try {
            c(z72, urlString);
            return z72;
        } catch (Throwable cause) {
            Intrinsics.checkNotNullParameter(urlString, "urlString");
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new C3093c82("Fail to parse url: ".concat(urlString), cause);
        }
    }

    /* JADX WARN: Code duplicated, block: B:237:0x03d6 A[LOOP:9: B:225:0x03b2->B:237:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x03d9 A[SYNTHETIC] */
    @NotNull
    public static final void c(@NotNull Z72 z72, @NotNull String urlString) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC7404wS1 c2395Xb1;
        int i10;
        List<String> listR;
        int iIntValue;
        int i11 = 1;
        Intrinsics.checkNotNullParameter(z72, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        int length = urlString.length();
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            } else if (!CharsKt.c(urlString.charAt(i12))) {
                break;
            } else {
                i12++;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i13 = length2 - 1;
            if (!CharsKt.c(urlString.charAt(length2))) {
                break;
            }
            if (i13 < 0) {
                length2 = -1;
                break;
            }
            length2 = i13;
        }
        int i14 = length2 + 1;
        char cCharAt = urlString.charAt(i12);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i = i12;
            i2 = i;
        } else {
            i2 = -1;
            i = i12;
        }
        while (true) {
            i3 = i11;
            if (i < i14) {
                char cCharAt2 = urlString.charAt(i);
                if (cCharAt2 == ':') {
                    if (i2 != -1) {
                        throw new IllegalArgumentException(EK.e(i2, "Illegal character in scheme at position "));
                    }
                    i4 = i - i12;
                    break;
                }
                if (cCharAt2 != '/' && cCharAt2 != '?' && cCharAt2 != '#') {
                    if (i2 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                        i2 = i;
                    }
                    i++;
                    i11 = i3;
                }
            }
            i4 = -1;
            break;
        }
        if (i4 > 0) {
            String name = urlString.substring(i12, i12 + i4);
            Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String…ing(startIndex, endIndex)");
            C3722f82 c3722f82 = C3722f82.c;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(name, "<this>");
            int length3 = name.length();
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    i15 = -1;
                    break;
                }
                char cCharAt3 = name.charAt(i15);
                if ((('A' > cCharAt3 || cCharAt3 >= '[') ? (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3 : (char) (cCharAt3 + ' ')) != cCharAt3) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 != -1) {
                StringBuilder sb = new StringBuilder(name.length());
                sb.append((CharSequence) name, 0, i15);
                int iE = StringsKt.E(name);
                if (i15 <= iE) {
                    while (true) {
                        char cCharAt4 = name.charAt(i15);
                        if ('A' <= cCharAt4 && cCharAt4 < '[') {
                            cCharAt4 = (char) (cCharAt4 + ' ');
                        } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
                            cCharAt4 = Character.toLowerCase(cCharAt4);
                        }
                        sb.append(cCharAt4);
                        if (i15 == iE) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                name = sb.toString();
                Intrinsics.checkNotNullExpressionValue(name, "StringBuilder(capacity).…builderAction).toString()");
            }
            C3722f82 c3722f83 = (C3722f82) C3722f82.d.get(name);
            if (c3722f83 == null) {
                c3722f83 = new C3722f82(name, 0);
            }
            z72.getClass();
            Intrinsics.checkNotNullParameter(c3722f83, "<set-?>");
            z72.a = c3722f83;
            i12 += i4 + 1;
        }
        int i16 = 0;
        while (true) {
            i5 = i12 + i16;
            if (i5 >= i14 || urlString.charAt(i5) != '/') {
                break;
            } else {
                i16++;
            }
        }
        if (Intrinsics.a(z72.a.a, "file")) {
            if (i16 != 2) {
                if (i16 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                Intrinsics.checkNotNullParameter("", "<set-?>");
                z72.b = "";
                StringBuilder sb2 = new StringBuilder("/");
                String strSubstring = urlString.substring(i5, i14);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                C4466ii.C(z72, sb2.toString());
                return;
            }
            int iF = StringsKt.F('/', i5, 4, urlString);
            if (iF == -1 || iF == i14) {
                String strSubstring2 = urlString.substring(i5, i14);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Intrinsics.checkNotNullParameter(strSubstring2, "<set-?>");
                z72.b = strSubstring2;
                return;
            }
            String strSubstring3 = urlString.substring(i5, iF);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNullParameter(strSubstring3, "<set-?>");
            z72.b = strSubstring3;
            String strSubstring4 = urlString.substring(iF, i14);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            C4466ii.C(z72, strSubstring4);
            return;
        }
        if (Intrinsics.a(z72.a.a, "mailto")) {
            if (i16 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iG = StringsKt.G(urlString, "@", i5, false, 4);
            if (iG == -1) {
                throw new IllegalArgumentException(C1039Gc0.d("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            String strSubstring5 = urlString.substring(i5, iG);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            String strD = BE.d(strSubstring5);
            z72.e = strD != null ? BE.f(strD, false) : null;
            String strSubstring6 = urlString.substring(iG + 1, i14);
            Intrinsics.checkNotNullExpressionValue(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNullParameter(strSubstring6, "<set-?>");
            z72.b = strSubstring6;
            return;
        }
        if (i16 >= 2) {
            while (true) {
                Intrinsics.checkNotNullParameter("@/\\?#", "<this>");
                char[] cArr = new char[5];
                for (int i17 = 0; i17 < 5; i17++) {
                    cArr[i17] = "@/\\?#".charAt(i17);
                }
                int iS = StringsKt__StringsKt.s(urlString, cArr, i5, false);
                Integer numValueOf = Integer.valueOf(iS);
                if (iS <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i14;
                if (iIntValue >= i14 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iA = a(i5, iIntValue, urlString);
                if (iA != -1) {
                    String strSubstring7 = urlString.substring(i5, iA);
                    Intrinsics.checkNotNullExpressionValue(strSubstring7, "this as java.lang.String…ing(startIndex, endIndex)");
                    z72.e = strSubstring7;
                    String strSubstring8 = urlString.substring(iA + 1, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring8, "this as java.lang.String…ing(startIndex, endIndex)");
                    z72.f = strSubstring8;
                } else {
                    String strSubstring9 = urlString.substring(i5, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring9, "this as java.lang.String…ing(startIndex, endIndex)");
                    z72.e = strSubstring9;
                }
                i5 = iIntValue + 1;
            }
            int iA2 = a(i5, iIntValue, urlString);
            Integer numValueOf2 = Integer.valueOf(iA2);
            if (iA2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring10 = urlString.substring(i5, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring10, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNullParameter(strSubstring10, "<set-?>");
            z72.b = strSubstring10;
            int i18 = iIntValue2 + 1;
            if (i18 < iIntValue) {
                String strSubstring11 = urlString.substring(i18, iIntValue);
                Intrinsics.checkNotNullExpressionValue(strSubstring11, "this as java.lang.String…ing(startIndex, endIndex)");
                z72.c = Integer.parseInt(strSubstring11);
            } else {
                z72.c = 0;
            }
            i5 = iIntValue;
        }
        List<String> list = a;
        if (i5 >= i14) {
            if (urlString.charAt(length2) != '/') {
                list = C5653o60.d;
            }
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            z72.h = list;
            return;
        }
        List<String> listB = i16 == 0 ? CollectionsKt.B(z72.h) : C5653o60.d;
        Intrinsics.checkNotNullParameter(listB, "<set-?>");
        z72.h = listB;
        Intrinsics.checkNotNullParameter("?#", "<this>");
        char[] cArr2 = new char[2];
        for (int i19 = 0; i19 < 2; i19++) {
            cArr2[i19] = "?#".charAt(i19);
        }
        int iS2 = StringsKt__StringsKt.s(urlString, cArr2, i5, false);
        Integer numValueOf3 = Integer.valueOf(iS2);
        if (iS2 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i14;
        if (iIntValue3 > i5) {
            String strSubstring12 = urlString.substring(i5, iIntValue3);
            Intrinsics.checkNotNullExpressionValue(strSubstring12, "this as java.lang.String…ing(startIndex, endIndex)");
            Collection collection = (z72.h.size() == i3 && ((CharSequence) CollectionsKt.F(z72.h)).length() == 0) ? C5653o60.d : z72.h;
            if (Intrinsics.a(strSubstring12, "/")) {
                listR = list;
                i10 = 1;
                i6 = 0;
            } else {
                i10 = 1;
                i6 = 0;
                listR = StringsKt.R(strSubstring12, new char[]{'/'});
            }
            if (i16 != i10) {
                list = C5653o60.d;
            }
            ArrayList arrayListQ = CollectionsKt.Q(collection, CollectionsKt.Q(list, listR));
            Intrinsics.checkNotNullParameter(arrayListQ, "<set-?>");
            z72.h = arrayListQ;
            i5 = iIntValue3;
        } else {
            i6 = 0;
        }
        if (i5 < i14 && urlString.charAt(i5) == '?') {
            int i20 = i5 + 1;
            if (i20 == i14) {
                z72.d = true;
                i5 = i14;
            } else {
                int iF2 = StringsKt.F('#', i20, 4, urlString);
                Integer numValueOf4 = iF2 > 0 ? Integer.valueOf(iF2) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i14;
                String query = urlString.substring(i20, iIntValue4);
                Intrinsics.checkNotNullExpressionValue(query, "this as java.lang.String…ing(startIndex, endIndex)");
                Intrinsics.checkNotNullParameter(query, "query");
                if (StringsKt.E(query) < 0) {
                    InterfaceC2131Ub1.b.getClass();
                    c2395Xb1 = C6282r60.c;
                } else {
                    InterfaceC2131Ub1.a aVar = InterfaceC2131Ub1.b;
                    C2291Wb1 c2291Wb1 = new C2291Wb1();
                    int iE2 = StringsKt.E(query);
                    if (iE2 >= 0) {
                        i8 = i6;
                        int i21 = i8;
                        i9 = i21;
                        int i22 = -1;
                        while (true) {
                            if (i8 != 1000) {
                                char cCharAt5 = query.charAt(i21);
                                if (cCharAt5 == '&') {
                                    C0599Al1.a(c2291Wb1, query, i9, i22, i21);
                                    i8++;
                                    i9 = i21 + 1;
                                    i22 = -1;
                                } else {
                                    if (cCharAt5 == '=') {
                                        if (i22 == -1) {
                                            i22 = i21;
                                        }
                                    }
                                    if (i21 != iE2) {
                                        i21++;
                                    } else {
                                        i7 = i22;
                                    }
                                }
                                if (i21 != iE2) {
                                    i21++;
                                } else {
                                    i7 = i22;
                                }
                            }
                            Map<String, List<String>> values = c2291Wb1.a;
                            Intrinsics.checkNotNullParameter(values, "values");
                            c2395Xb1 = new C2395Xb1(values);
                        }
                    } else {
                        i7 = -1;
                        i8 = i6;
                        i9 = i8;
                    }
                    if (i8 != 1000) {
                        C0599Al1.a(c2291Wb1, query, i9, i7, query.length());
                    }
                    Map<String, List<String>> values2 = c2291Wb1.a;
                    Intrinsics.checkNotNullParameter(values2, "values");
                    c2395Xb1 = new C2395Xb1(values2);
                }
                c2395Xb1.b(new C3303d82(z72));
                i5 = iIntValue4;
            }
        }
        if (i5 >= i14 || urlString.charAt(i5) != '#') {
            return;
        }
        String strSubstring13 = urlString.substring(i5 + 1, i14);
        Intrinsics.checkNotNullExpressionValue(strSubstring13, "this as java.lang.String…ing(startIndex, endIndex)");
        Intrinsics.checkNotNullParameter(strSubstring13, "<set-?>");
        z72.g = strSubstring13;
    }
}
