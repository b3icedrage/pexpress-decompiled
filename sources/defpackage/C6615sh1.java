package defpackage;

import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6615sh1 {

    @NotNull
    public static final Object a;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        RI0 ri0B = c2251Vp1.b(String.class);
        C1173Hv.d(C4881kS1.a);
        Pair pair = new Pair(ri0B, C6144qS1.a);
        RI0 ri0B2 = c2251Vp1.b(Character.TYPE);
        Intrinsics.checkNotNullParameter(C5248mA.a, "<this>");
        Pair pair2 = new Pair(ri0B2, C6507sA.a);
        Pair pair3 = new Pair(c2251Vp1.b(char[].class), C5035lA.c);
        RI0 ri0B3 = c2251Vp1.b(Double.TYPE);
        Intrinsics.checkNotNullParameter(C2638a30.a, "<this>");
        Pair pair4 = new Pair(ri0B3, C3071c30.a);
        Pair pair5 = new Pair(c2251Vp1.b(double[].class), W20.c);
        RI0 ri0B4 = c2251Vp1.b(Float.TYPE);
        Intrinsics.checkNotNullParameter(C3826ff0.a, "<this>");
        Pair pair6 = new Pair(ri0B4, C4714jf0.a);
        Pair pair7 = new Pair(c2251Vp1.b(float[].class), C3616ef0.c);
        RI0 ri0B5 = c2251Vp1.b(Long.TYPE);
        Intrinsics.checkNotNullParameter(CT0.a, "<this>");
        Pair pair8 = new Pair(ri0B5, GT0.a);
        Pair pair9 = new Pair(c2251Vp1.b(long[].class), BT0.c);
        RI0 ri0B6 = c2251Vp1.b(S72.class);
        Intrinsics.checkNotNullParameter(S72.e, "<this>");
        Pair pair10 = new Pair(ri0B6, W72.a);
        Pair pair11 = new Pair(c2251Vp1.b(T72.class), V72.c);
        RI0 ri0B7 = c2251Vp1.b(Integer.TYPE);
        Intrinsics.checkNotNullParameter(BB0.a, "<this>");
        Pair pair12 = new Pair(ri0B7, EB0.a);
        Pair pair13 = new Pair(c2251Vp1.b(int[].class), AB0.c);
        RI0 ri0B8 = c2251Vp1.b(M72.class);
        Intrinsics.checkNotNullParameter(M72.e, "<this>");
        Pair pair14 = new Pair(ri0B8, Q72.a);
        Pair pair15 = new Pair(c2251Vp1.b(N72.class), P72.c);
        RI0 ri0B9 = c2251Vp1.b(Short.TYPE);
        Intrinsics.checkNotNullParameter(OK1.a, "<this>");
        Pair pair16 = new Pair(ri0B9, PK1.a);
        Pair pair17 = new Pair(c2251Vp1.b(short[].class), NK1.c);
        RI0 ri0B10 = c2251Vp1.b(C4352i82.class);
        Intrinsics.checkNotNullParameter(C4352i82.e, "<this>");
        Pair pair18 = new Pair(ri0B10, C5243m82.a);
        Pair pair19 = new Pair(c2251Vp1.b(C4610j82.class), C5030l82.c);
        RI0 ri0B11 = c2251Vp1.b(Byte.TYPE);
        Intrinsics.checkNotNullParameter(C0786Cw.a, "<this>");
        Pair pair20 = new Pair(ri0B11, C1176Hw.a);
        Pair pair21 = new Pair(c2251Vp1.b(byte[].class), C2453Xv.c);
        RI0 ri0B12 = c2251Vp1.b(G72.class);
        Intrinsics.checkNotNullParameter(G72.e, "<this>");
        Pair pair22 = new Pair(ri0B12, K72.a);
        Pair pair23 = new Pair(c2251Vp1.b(H72.class), J72.c);
        RI0 ri0B13 = c2251Vp1.b(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(C0777Ct.a, "<this>");
        Pair pair24 = new Pair(ri0B13, C0933Et.a);
        Pair pair25 = new Pair(c2251Vp1.b(boolean[].class), C0699Bt.c);
        RI0 ri0B14 = c2251Vp1.b(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.a, "<this>");
        Pair pair26 = new Pair(ri0B14, J82.b);
        Pair pair27 = new Pair(c2251Vp1.b(Void.class), N51.a);
        RI0 ri0B15 = c2251Vp1.b(b.class);
        Intrinsics.checkNotNullParameter(b.e, "<this>");
        a = PW0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, new Pair(ri0B15, Q40.a));
    }

    public static final String a(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            String strValueOf2 = String.valueOf(cCharAt);
            Intrinsics.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            strValueOf = strValueOf2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Intrinsics.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = strSubstring.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }
}
