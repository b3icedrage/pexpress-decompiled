package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4307hx {

    @NotNull
    public static final C4307hx n;

    @NotNull
    public static final C4307hx o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    @Nullable
    public String m;

    /* JADX INFO: renamed from: hx$a */
    public static final class a {
        public boolean a;
        public boolean b;
        public int c = -1;
        public boolean d;

        @NotNull
        public final C4307hx a() {
            return new C4307hx(this.a, this.b, -1, -1, false, false, false, this.c, -1, this.d, false, false, null);
        }
    }

    /* JADX INFO: renamed from: hx$b */
    public static final class b {
        /* JADX WARN: Code duplicated, block: B:108:0x0066 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x006c A[EDGE_INSN: B:109:0x006c->B:22:0x006c BREAK  A[LOOP:2: B:16:0x004e->B:20:0x005f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0049  */
        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:2: B:16:0x004e->B:20:0x005f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x010f  */
        /* JADX WARN: Code duplicated, block: B:54:0x011b  */
        /* JADX WARN: Code duplicated, block: B:56:0x0123  */
        /* JADX WARN: Code duplicated, block: B:58:0x012b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0130  */
        /* JADX WARN: Code duplicated, block: B:61:0x0138  */
        /* JADX WARN: Code duplicated, block: B:63:0x0140  */
        /* JADX WARN: Code duplicated, block: B:65:0x0149  */
        /* JADX WARN: Code duplicated, block: B:66:0x014e  */
        /* JADX WARN: Code duplicated, block: B:68:0x0156  */
        /* JADX WARN: Code duplicated, block: B:69:0x015b  */
        /* JADX WARN: Code duplicated, block: B:71:0x0163  */
        /* JADX WARN: Code duplicated, block: B:72:0x0168  */
        /* JADX WARN: Code duplicated, block: B:74:0x0170  */
        /* JADX WARN: Code duplicated, block: B:75:0x0175  */
        /* JADX WARN: Code duplicated, block: B:77:0x017d  */
        /* JADX WARN: Code duplicated, block: B:78:0x0185  */
        /* JADX WARN: Code duplicated, block: B:80:0x018d  */
        /* JADX WARN: Code duplicated, block: B:81:0x0193  */
        /* JADX WARN: Code duplicated, block: B:83:0x019c  */
        /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:89:0x01b8  */
        @NotNull
        public static C4307hx a(@NotNull C2813ao0 c2813ao0) {
            int i;
            int length;
            int length2;
            int i2;
            String string;
            String string2;
            int length3;
            C2813ao0 headers = c2813ao0;
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            int i3 = 0;
            boolean z = true;
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            int iZ = -1;
            int iZ2 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int iZ3 = -1;
            int iZ4 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i3 < size) {
                String strC = headers.c(i3);
                String strF = headers.f(i3);
                if (d.i(strC, "Cache-Control")) {
                    if (str == null) {
                        str = strF;
                    }
                    i = 0;
                    while (i < strF.length()) {
                        length = strF.length();
                        length2 = i;
                        while (true) {
                            if (length2 < length) {
                                i2 = size;
                                length2 = strF.length();
                                break;
                            }
                            i2 = size;
                            if (StringsKt.D("=,;", strF.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = i2;
                        }
                        String strSubstring = strF.substring(i, length2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = StringsKt.d0(strSubstring).toString();
                        if (length2 != strF.length() || strF.charAt(length2) == ',' || strF.charAt(length2) == ';') {
                            i = length2 + 1;
                            string2 = null;
                        } else {
                            int length4 = length2 + 1;
                            byte[] bArr = C6806tc2.a;
                            Intrinsics.checkNotNullParameter(strF, "<this>");
                            int length5 = strF.length();
                            while (true) {
                                if (length4 >= length5) {
                                    length4 = strF.length();
                                    break;
                                }
                                char cCharAt = strF.charAt(length4);
                                int i4 = length5;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length4++;
                                length5 = i4;
                            }
                            if (length4 >= strF.length() || strF.charAt(length4) != '\"') {
                                int length6 = strF.length();
                                int i5 = length4;
                                while (true) {
                                    if (i5 >= length6) {
                                        length3 = strF.length();
                                        break;
                                    }
                                    int i6 = length6;
                                    int i7 = i5;
                                    if (StringsKt.D(",;", strF.charAt(i5))) {
                                        length3 = i7;
                                        break;
                                    }
                                    i5 = i7 + 1;
                                    length6 = i6;
                                }
                                String strSubstring2 = strF.substring(length4, length3);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = StringsKt.d0(strSubstring2).toString();
                                i = length3;
                            } else {
                                int i8 = length4 + 1;
                                int iF = StringsKt.F('\"', i8, 4, strF);
                                string2 = strF.substring(i8, iF);
                                Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i = iF + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iZ = C6806tc2.z(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iZ2 = C6806tc2.z(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iZ3 = C6806tc2.z(Api.BaseClientBuilder.API_PRIORITY_OTHER, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iZ4 = C6806tc2.z(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z9 = true;
                        }
                        size = i2;
                    }
                    i3++;
                    headers = c2813ao0;
                    size = size;
                } else {
                    if (d.i(strC, "Pragma")) {
                    }
                    i3++;
                    headers = c2813ao0;
                    size = size;
                }
                z = false;
                i = 0;
                while (i < strF.length()) {
                    length = strF.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strF.length();
                            break;
                        }
                        i2 = size;
                        if (StringsKt.D("=,;", strF.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    String strSubstring3 = strF.substring(i, length2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.d0(strSubstring3).toString();
                    if (length2 != strF.length()) {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        i = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iZ = C6806tc2.z(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iZ2 = C6806tc2.z(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iZ3 = C6806tc2.z(Api.BaseClientBuilder.API_PRIORITY_OTHER, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iZ4 = C6806tc2.z(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                headers = c2813ao0;
                size = size;
            }
            return new C4307hx(z2, z3, iZ, iZ2, z4, z5, z6, iZ3, iZ4, z7, z8, z9, !z ? null : str);
        }
    }

    static {
        a aVar = new a();
        aVar.a = true;
        n = aVar.a();
        a aVar2 = new a();
        aVar2.d = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long seconds = timeUnit.toSeconds(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        aVar2.c = i;
        o = aVar2.a();
    }

    public C4307hx(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    @NotNull
    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.m = string;
        return string;
    }
}
