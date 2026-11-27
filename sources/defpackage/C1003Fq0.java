package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1003Fq0 {
    @NotNull
    public static final List<C2244Vn0> a(@Nullable String str) {
        int i;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return C5653o60.d;
        }
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, C0847Dq0.d);
        for (int i2 = 0; i2 <= StringsKt.E(str); i2 = i) {
            InterfaceC3770fO0 interfaceC3770fO0A2 = XO0.a(EnumC4403iP0.e, C0925Eq0.d);
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i > StringsKt.E(str)) {
                    ((ArrayList) interfaceC3770fO0A.getValue()).add(new C2244Vn0(c(i2, numValueOf != null ? numValueOf.intValue() : i, str), interfaceC3770fO0A2.d() ? (List) interfaceC3770fO0A2.getValue() : C5653o60.d));
                    break;
                }
                char cCharAt = str.charAt(i);
                if (cCharAt == ',') {
                    ((ArrayList) interfaceC3770fO0A.getValue()).add(new C2244Vn0(c(i2, numValueOf != null ? numValueOf.intValue() : i, str), interfaceC3770fO0A2.d() ? (List) interfaceC3770fO0A2.getValue() : C5653o60.d));
                    i++;
                    break;
                }
                if (cCharAt == ';') {
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i);
                    }
                    int i3 = i + 1;
                    int i4 = i3;
                    while (true) {
                        if (i4 <= StringsKt.E(str)) {
                            char cCharAt2 = str.charAt(i4);
                            if (cCharAt2 == '=') {
                                int i5 = i4 + 1;
                                if (str.length() == i5) {
                                    pair2 = new Pair(Integer.valueOf(i5), "");
                                } else {
                                    char c = '\"';
                                    if (str.charAt(i5) != '\"') {
                                        int i6 = i5;
                                        while (true) {
                                            if (i6 > StringsKt.E(str)) {
                                                pair = new Pair(Integer.valueOf(i6), c(i5, i6, str));
                                                break;
                                            }
                                            char cCharAt3 = str.charAt(i6);
                                            if (cCharAt3 == ';' || cCharAt3 == ',') {
                                                pair = new Pair(Integer.valueOf(i6), c(i5, i6, str));
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        int i7 = i4 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            if (i7 > StringsKt.E(str)) {
                                                Integer numValueOf2 = Integer.valueOf(i7);
                                                String string = sb.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
                                                pair = new Pair(numValueOf2, "\"" + string);
                                                break;
                                            }
                                            char cCharAt4 = str.charAt(i7);
                                            if (cCharAt4 == c) {
                                                int i8 = i7 + 1;
                                                int i9 = i8;
                                                while (i9 < str.length() && str.charAt(i9) == ' ') {
                                                    i9++;
                                                }
                                                if (i9 == str.length() || str.charAt(i9) == ';') {
                                                    Integer numValueOf3 = Integer.valueOf(i8);
                                                    String string2 = sb.toString();
                                                    Intrinsics.checkNotNullExpressionValue(string2, "builder.toString()");
                                                    pair = new Pair(numValueOf3, string2);
                                                    break;
                                                }
                                            }
                                            if (cCharAt4 != '\\' || i7 >= StringsKt.E(str) - 2) {
                                                sb.append(cCharAt4);
                                                i7++;
                                            } else {
                                                sb.append(str.charAt(i7 + 1));
                                                i7 += 2;
                                            }
                                            c = '\"';
                                        }
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.d).intValue();
                                b(interfaceC3770fO0A2, str, i3, i4, (String) pair2.e);
                                i = iIntValue;
                                break;
                            }
                            if (cCharAt2 == ';' || cCharAt2 == ',') {
                                b(interfaceC3770fO0A2, str, i3, i4, "");
                            } else {
                                i4++;
                            }
                        } else {
                            b(interfaceC3770fO0A2, str, i3, i4, "");
                        }
                        i = i4;
                        break;
                    }
                }
                i++;
            }
        }
        return interfaceC3770fO0A.d() ? (List) interfaceC3770fO0A.getValue() : C5653o60.d;
    }

    public static final void b(InterfaceC3770fO0<? extends ArrayList<C2326Wn0>> interfaceC3770fO0, String str, int i, int i2, String str2) {
        String strC = c(i, i2, str);
        if (strC.length() == 0) {
            return;
        }
        interfaceC3770fO0.getValue().add(new C2326Wn0(strC, str2));
    }

    public static final String c(int i, int i2, String str) {
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt.d0(strSubstring).toString();
    }
}
