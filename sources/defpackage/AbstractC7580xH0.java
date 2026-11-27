package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: xH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7580xH0 implements Closeable {
    public static final String[] i = new String[UserVerificationMethods.USER_VERIFY_PATTERN];
    public int d;
    public int[] e;
    public String[] g;
    public int[] h;

    /* JADX INFO: renamed from: xH0$a */
    public static final class a {
        public final String[] a;
        public final C4437ia1 b;

        public a(String[] strArr, C4437ia1 c4437ia1) {
            this.a = strArr;
            this.b = c4437ia1;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        public static a a(String... strArr) {
            String str;
            try {
                C1802Pw[] c1802PwArr = new C1802Pw[strArr.length];
                C1481Lu c1481Lu = new C1481Lu();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = AbstractC7580xH0.i;
                    c1481Lu.j1(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    c1481Lu.v1(i2, i3, str2);
                                }
                                c1481Lu.w1(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                                c1481Lu.v1(i2, i3, str2);
                            }
                            c1481Lu.w1(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        c1481Lu.v1(i2, length, str2);
                    }
                    c1481Lu.j1(34);
                    c1481Lu.P();
                    c1802PwArr[i] = c1481Lu.X(c1481Lu.e);
                }
                String[] strArr3 = (String[]) strArr.clone();
                int i4 = C4437ia1.h;
                return new a(strArr3, C4437ia1.a.b(c1802PwArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: xH0$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final /* synthetic */ b[] o;

        static {
            b bVar = new b("BEGIN_ARRAY", 0);
            d = bVar;
            b bVar2 = new b("END_ARRAY", 1);
            e = bVar2;
            b bVar3 = new b("BEGIN_OBJECT", 2);
            g = bVar3;
            b bVar4 = new b("END_OBJECT", 3);
            h = bVar4;
            b bVar5 = new b("NAME", 4);
            i = bVar5;
            b bVar6 = new b("STRING", 5);
            j = bVar6;
            b bVar7 = new b("NUMBER", 6);
            k = bVar7;
            b bVar8 = new b("BOOLEAN", 7);
            l = bVar8;
            b bVar9 = new b("NULL", 8);
            m = bVar9;
            b bVar10 = new b("END_DOCUMENT", 9);
            n = bVar10;
            o = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) o.clone();
        }
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            i[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract String B();

    public abstract void B0();

    public abstract int E0();

    public abstract void I();

    public abstract void X0();

    public final String c() {
        int i2 = this.d;
        int[] iArr = this.e;
        String[] strArr = this.g;
        int[] iArr2 = this.h;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = strArr[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract double d0();

    public abstract boolean f();

    public abstract b g();

    public abstract void h1();

    public abstract boolean hasNext();

    public final void k(int i2) {
        int i3 = this.d;
        int[] iArr = this.e;
        if (i3 == iArr.length) {
            if (i3 == 256) {
                throw new FG0("Nesting too deep at " + c());
            }
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.g;
            this.g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.h;
            this.h = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.e;
        int i4 = this.d;
        this.d = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int l(a aVar);

    public abstract void l1();

    public abstract void p();

    public final void q(String str) throws YG0 {
        StringBuilder sbB = K1.b(str, " at path ");
        sbB.append(c());
        throw new YG0(sbB.toString());
    }
}
