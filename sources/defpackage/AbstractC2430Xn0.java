package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2430Xn0 {

    @NotNull
    public final String a;

    @NotNull
    public final List<C2326Wn0> b;

    public AbstractC2430Xn0(@NotNull String content, @NotNull List<C2326Wn0> parameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.a = content;
        this.b = parameters;
    }

    @Nullable
    public final String a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<C2326Wn0> list = this.b;
        int iE = WE.e(list);
        if (iE < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            C2326Wn0 c2326Wn0 = list.get(i);
            if (d.i(c2326Wn0.a, name)) {
                return c2326Wn0.b;
            }
            if (i == iE) {
                return null;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118 A[LOOP:4: B:38:0x00ab->B:60:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00bd A[SYNTHETIC] */
    @NotNull
    public final String toString() {
        StringBuilder sb;
        int length;
        int i;
        char cCharAt;
        int length2;
        int i2;
        int i3 = 2;
        List<C2326Wn0> list = this.b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        int length3 = str.length();
        int length4 = 0;
        for (C2326Wn0 c2326Wn0 : list) {
            length4 += c2326Wn0.b.length() + c2326Wn0.a.length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length3 + length4);
        sb2.append(str);
        int iE = WE.e(list);
        if (iE >= 0) {
            int i4 = 0;
            while (true) {
                C2326Wn0 c2326Wn1 = list.get(i4);
                sb2.append("; ");
                sb2.append(c2326Wn1.a);
                sb2.append("=");
                Set<Character> set = C2508Yn0.a;
                String str2 = c2326Wn1.b;
                if (str2.length() != 0) {
                    if (str2.length() >= i3 && KS1.z(str2) == '\"' && KS1.A(str2) == '\"') {
                        int i5 = 1;
                        while (true) {
                            int iF = StringsKt.F('\"', i5, 4, str2);
                            if (iF != StringsKt.E(str2)) {
                                int i6 = 0;
                                for (int i7 = iF - 1; str2.charAt(i7) == '\\'; i7--) {
                                    i6++;
                                }
                                if (i6 % i3 == 0) {
                                    length2 = str2.length();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length2) {
                                            if (C2508Yn0.a.contains(Character.valueOf(str2.charAt(i2)))) {
                                                Intrinsics.checkNotNullParameter(str2, "<this>");
                                                sb = new StringBuilder("\"");
                                                length = str2.length();
                                                for (i = 0; i < length; i++) {
                                                    cCharAt = str2.charAt(i);
                                                    if (cCharAt == '\\') {
                                                        sb.append("\\\\");
                                                    } else if (cCharAt == '\n') {
                                                        sb.append("\\n");
                                                    } else if (cCharAt == '\r') {
                                                        sb.append("\\r");
                                                    } else if (cCharAt == '\t') {
                                                        sb.append("\\t");
                                                    } else if (cCharAt == '\"') {
                                                        sb.append("\\\"");
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                }
                                                sb.append("\"");
                                                String string = sb.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                                                sb2.append(string);
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                } else {
                                    i5 = iF + 1;
                                    if (i5 >= str2.length()) {
                                    }
                                }
                            }
                        }
                    } else {
                        length2 = str2.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                if (C2508Yn0.a.contains(Character.valueOf(str2.charAt(i2)))) {
                                    Intrinsics.checkNotNullParameter(str2, "<this>");
                                    sb = new StringBuilder("\"");
                                    length = str2.length();
                                    while (i < length) {
                                        cCharAt = str2.charAt(i);
                                        if (cCharAt == '\\') {
                                            sb.append("\\\\");
                                        } else if (cCharAt == '\n') {
                                            sb.append("\\n");
                                        } else if (cCharAt == '\r') {
                                            sb.append("\\r");
                                        } else if (cCharAt == '\t') {
                                            sb.append("\\t");
                                        } else if (cCharAt == '\"') {
                                            sb.append("\\\"");
                                        } else {
                                            sb.append(cCharAt);
                                        }
                                    }
                                    sb.append("\"");
                                    String string2 = sb.toString();
                                    Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
                                    sb2.append(string2);
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    sb2.append(str2);
                } else {
                    Intrinsics.checkNotNullParameter(str2, "<this>");
                    sb = new StringBuilder("\"");
                    length = str2.length();
                    while (i < length) {
                        cCharAt = str2.charAt(i);
                        if (cCharAt == '\\') {
                            sb.append("\\\\");
                        } else if (cCharAt == '\n') {
                            sb.append("\\n");
                        } else if (cCharAt == '\r') {
                            sb.append("\\r");
                        } else if (cCharAt == '\t') {
                            sb.append("\\t");
                        } else if (cCharAt == '\"') {
                            sb.append("\\\"");
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    sb.append("\"");
                    String string3 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
                    sb2.append(string3);
                }
                if (i4 == iE) {
                    break;
                }
                i4++;
                i3 = 2;
            }
        }
        String string4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "{\n            val size =…   }.toString()\n        }");
        return string4;
    }
}
