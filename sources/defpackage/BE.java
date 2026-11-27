package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BE {

    @NotNull
    public static final Set<Byte> a;

    @NotNull
    public static final Set<Character> b;

    @NotNull
    public static final ArrayList c;

    @NotNull
    public static final ArrayList d;

    public static final class a extends ML0 implements Function1<Byte, Unit> {
        public final /* synthetic */ StringBuilder d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb, boolean z) {
            super(1);
            this.d = sb;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Byte b) {
            byte bByteValue = b.byteValue();
            boolean zContains = BE.a.contains(Byte.valueOf(bByteValue));
            StringBuilder sb = this.d;
            if (zContains || BE.d.contains(Byte.valueOf(bByteValue))) {
                sb.append((char) bByteValue);
            } else if (this.e && bByteValue == 32) {
                sb.append('+');
            } else {
                sb.append(BE.a(bByteValue));
            }
            return Unit.a;
        }
    }

    static {
        ArrayList arrayListQ = CollectionsKt.Q(CollectionsKt.O(new b('a', 'z'), new b('A', 'Z')), new b('0', '9'));
        ArrayList arrayList = new ArrayList(XE.m(arrayListQ, 10));
        Iterator it = arrayListQ.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        a = CollectionsKt.h0(arrayList);
        b = CollectionsKt.h0(CollectionsKt.Q(CollectionsKt.O(new b('a', 'z'), new b('A', 'Z')), new b('0', '9')));
        CollectionsKt.h0(CollectionsKt.Q(CollectionsKt.O(new b('a', 'f'), new b('A', 'F')), new b('0', '9')));
        Character[] elements = {':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', Character.valueOf(JwtParser.SEPARATOR_CHAR), '_', '~', '+'};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setH = C1526Mj.H(elements);
        ArrayList arrayList2 = new ArrayList(XE.m(setH, 10));
        Iterator it2 = setH.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        c = arrayList2;
        Character[] elements2 = {':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', Character.valueOf(JwtParser.SEPARATOR_CHAR), '_', '~'};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        C1526Mj.H(elements2);
        Set<Character> set = b;
        Character[] elements3 = {'!', '#', '$', '&', '+', '-', Character.valueOf(JwtParser.SEPARATOR_CHAR), '^', '_', '`', '|', '~'};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        C5907pJ1.d(set, C1526Mj.H(elements3));
        List listF = WE.f('-', Character.valueOf(JwtParser.SEPARATOR_CHAR), '_', '~');
        ArrayList arrayList3 = new ArrayList(XE.m(listF, 10));
        Iterator it3 = listF.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        d = arrayList3;
    }

    public static final String a(byte b2) {
        int i = (b2 & 255) >> 4;
        int i2 = b2 & 15;
        char[] cArr = {'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)};
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static final int b(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    public static final String c(String str, int i, int i2, boolean z, Charset charset) throws C2660a82 {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                throw new C2660a82("Incomplete trailing HEX escape: " + str.subSequence(i3, str.length()).toString() + ", in " + ((Object) str) + " at " + i3);
                            }
                            int i7 = i3 + 1;
                            int iB = b(str.charAt(i7));
                            int iB2 = b(str.charAt(i6));
                            if (iB == -1 || iB2 == -1) {
                                throw new C2660a82("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iB * 16) + iB2);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(new String(bArr, 0, i5, charset));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
                return string;
            }
            i3++;
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String d(String str) {
        int length = str.length();
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return c(str, 0, length, false, charset);
    }

    public static String e(String str, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return c(str, i, i2, z, charset);
    }

    @NotNull
    public static final String f(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        g(C7279vr.c(charsetEncoderNewEncoder, str, 0, str.length()), new a(sb, z));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void g(C1098Gw c1098Gw, Function1<? super Byte, Unit> function1) {
        boolean z = true;
        C2895bC c2895bCL = C5189lv.l(c1098Gw, 1);
        if (c2895bCL == null) {
            return;
        }
        while (true) {
            try {
                int i = c2895bCL.c;
                int i2 = c2895bCL.b;
                if (i > i2) {
                    if (i2 == i) {
                        throw new EOFException("No readable bytes available.");
                    }
                    c2895bCL.b = i2 + 1;
                    function1.invoke(Byte.valueOf(c2895bCL.a.get(i2)));
                    if (z) {
                        C5189lv.f(c1098Gw, c2895bCL);
                    }
                    throw th;
                }
                try {
                    c2895bCL = C5189lv.m(c1098Gw, c2895bCL);
                    if (c2895bCL == null) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
