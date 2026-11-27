package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5172lp0 {

    @NotNull
    public static final C1932Rn0[] a;

    @NotNull
    public static final Map<C1802Pw, Integer> b;

    /* JADX INFO: renamed from: lp0$a */
    public static final class a {
        public int a;

        @NotNull
        public final ArrayList b;

        @NotNull
        public final C3024bo1 c;

        @NotNull
        public C1932Rn0[] d;
        public int e;
        public int f;
        public int g;

        public a(C0844Dp0.b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.a = 4096;
            this.b = new ArrayList();
            this.c = Cm2.e(source);
            this.d = new C1932Rn0[8];
            this.e = 7;
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C1932Rn0 c1932Rn0 = this.d[length];
                    Intrinsics.checkNotNull(c1932Rn0);
                    int i4 = c1932Rn0.c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                C1932Rn0[] c1932Rn0Arr = this.d;
                System.arraycopy(c1932Rn0Arr, i2 + 1, c1932Rn0Arr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final C1802Pw b(int i) throws IOException {
            if (i >= 0) {
                C1932Rn0[] c1932Rn0Arr = C5172lp0.a;
                if (i <= c1932Rn0Arr.length - 1) {
                    return c1932Rn0Arr[i].a;
                }
            }
            int length = this.e + 1 + (i - C5172lp0.a.length);
            if (length >= 0) {
                C1932Rn0[] c1932Rn0Arr2 = this.d;
                if (length < c1932Rn0Arr2.length) {
                    C1932Rn0 c1932Rn0 = c1932Rn0Arr2[length];
                    Intrinsics.checkNotNull(c1932Rn0);
                    return c1932Rn0.a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(C1932Rn0 c1932Rn0) {
            this.b.add(c1932Rn0);
            int i = this.a;
            int i2 = c1932Rn0.c;
            if (i2 > i) {
                C1932Rn0[] c1932Rn0Arr = this.d;
                C1371Kj.f(c1932Rn0Arr, null, 0, c1932Rn0Arr.length);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i2) - i);
            int i3 = this.f + 1;
            C1932Rn0[] c1932Rn0Arr2 = this.d;
            if (i3 > c1932Rn0Arr2.length) {
                C1932Rn0[] c1932Rn0Arr3 = new C1932Rn0[c1932Rn0Arr2.length * 2];
                System.arraycopy(c1932Rn0Arr2, 0, c1932Rn0Arr3, c1932Rn0Arr2.length, c1932Rn0Arr2.length);
                this.e = this.d.length - 1;
                this.d = c1932Rn0Arr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = c1932Rn0;
            this.f++;
            this.g += i2;
        }

        @NotNull
        public final C1802Pw d() {
            int i;
            C3024bo1 source = this.c;
            byte bG = source.g();
            byte[] bArr = C6806tc2.a;
            int i2 = bG & 255;
            int i3 = 0;
            boolean z = (bG & 128) == 128;
            long jE = e(i2, 127);
            if (!z) {
                return source.k(jE);
            }
            C1481Lu sink = new C1481Lu();
            int[] iArr = C1632Nr0.a;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            C1632Nr0.a aVar = C1632Nr0.c;
            C1632Nr0.a aVar2 = aVar;
            int i4 = 0;
            for (long j = 0; j < jE; j++) {
                byte bG2 = source.g();
                byte[] bArr2 = C6806tc2.a;
                i3 = (i3 << 8) | (bG2 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    C1632Nr0.a[] aVarArr = aVar2.a;
                    Intrinsics.checkNotNull(aVarArr);
                    aVar2 = aVarArr[(i3 >>> (i4 - 8)) & 255];
                    Intrinsics.checkNotNull(aVar2);
                    if (aVar2.a == null) {
                        sink.j1(aVar2.b);
                        i4 -= aVar2.c;
                        aVar2 = aVar;
                    } else {
                        i4 -= 8;
                    }
                }
            }
            while (i4 > 0) {
                C1632Nr0.a[] aVarArr2 = aVar2.a;
                Intrinsics.checkNotNull(aVarArr2);
                C1632Nr0.a aVar3 = aVarArr2[(i3 << (8 - i4)) & 255];
                Intrinsics.checkNotNull(aVar3);
                if (aVar3.a != null || (i = aVar3.c) > i4) {
                    break;
                }
                sink.j1(aVar3.b);
                i4 -= i;
                aVar2 = aVar;
            }
            return sink.X(sink.e);
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte bG = this.c.g();
                byte[] bArr = C6806tc2.a;
                int i5 = bG & 255;
                if ((bG & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (bG & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: lp0$b */
    public static final class b {

        @NotNull
        public final C1481Lu a;
        public int b;
        public boolean c;
        public int d;

        @NotNull
        public C1932Rn0[] e;
        public int f;
        public int g;
        public int h;

        public b(C1481Lu out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.a = out;
            this.b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.d = 4096;
            this.e = new C1932Rn0[8];
            this.f = 7;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C1932Rn0 c1932Rn0 = this.e[length];
                    Intrinsics.checkNotNull(c1932Rn0);
                    i -= c1932Rn0.c;
                    int i4 = this.h;
                    C1932Rn0 c1932Rn1 = this.e[length];
                    Intrinsics.checkNotNull(c1932Rn1);
                    this.h = i4 - c1932Rn1.c;
                    this.g--;
                    i3++;
                    length--;
                }
                C1932Rn0[] c1932Rn0Arr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(c1932Rn0Arr, i5, c1932Rn0Arr, i5 + i3, this.g);
                C1932Rn0[] c1932Rn0Arr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(c1932Rn0Arr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(C1932Rn0 c1932Rn0) {
            int i = this.d;
            int i2 = c1932Rn0.c;
            if (i2 > i) {
                C1932Rn0[] c1932Rn0Arr = this.e;
                C1371Kj.f(c1932Rn0Arr, null, 0, c1932Rn0Arr.length);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i2) - i);
            int i3 = this.g + 1;
            C1932Rn0[] c1932Rn0Arr2 = this.e;
            if (i3 > c1932Rn0Arr2.length) {
                C1932Rn0[] c1932Rn0Arr3 = new C1932Rn0[c1932Rn0Arr2.length * 2];
                System.arraycopy(c1932Rn0Arr2, 0, c1932Rn0Arr3, c1932Rn0Arr2.length, c1932Rn0Arr2.length);
                this.f = this.e.length - 1;
                this.e = c1932Rn0Arr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = c1932Rn0;
            this.g++;
            this.h += i2;
        }

        public final void c(@NotNull C1802Pw source) throws EOFException {
            Intrinsics.checkNotNullParameter(source, "data");
            C1481Lu c1481Lu = this.a;
            int[] iArr = C1632Nr0.a;
            Intrinsics.checkNotNullParameter(source, "bytes");
            int iF = source.f();
            long j = 0;
            for (int i = 0; i < iF; i++) {
                byte bL = source.l(i);
                byte[] bArr = C6806tc2.a;
                j += (long) C1632Nr0.b[bL & 255];
            }
            if (((int) ((j + ((long) 7)) >> 3)) >= source.f()) {
                e(source.f(), 127, 0);
                c1481Lu.Y0(source);
                return;
            }
            C1481Lu sink = new C1481Lu();
            int[] iArr2 = C1632Nr0.a;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            int iF2 = source.f();
            long j2 = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < iF2; i3++) {
                byte bL2 = source.l(i3);
                byte[] bArr2 = C6806tc2.a;
                int i4 = bL2 & 255;
                int i5 = C1632Nr0.a[i4];
                byte b = C1632Nr0.b[i4];
                j2 = (j2 << b) | ((long) i5);
                i2 += b;
                while (i2 >= 8) {
                    i2 -= 8;
                    sink.j1((int) (j2 >> i2));
                }
            }
            if (i2 > 0) {
                sink.j1((int) ((255 >>> i2) | (j2 << (8 - i2))));
            }
            C1802Pw c1802PwX = sink.X(sink.e);
            e(c1802PwX.f(), 127, UserVerificationMethods.USER_VERIFY_PATTERN);
            c1481Lu.Y0(c1802PwX);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
        public final void d(@NotNull ArrayList headerBlock) throws EOFException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.c) {
                int i = this.b;
                if (i < this.d) {
                    e(i, 31, 32);
                }
                this.c = false;
                this.b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                e(this.d, 31, 32);
            }
            int size = headerBlock.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1932Rn0 c1932Rn0 = (C1932Rn0) headerBlock.get(i2);
                C1802Pw c1802PwO = c1932Rn0.a.o();
                Integer num = C5172lp0.b.get(c1802PwO);
                C1802Pw c1802Pw = c1932Rn0.b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C1932Rn0[] c1932Rn0Arr = C5172lp0.a;
                        if (Intrinsics.a(c1932Rn0Arr[iIntValue].b, c1802Pw)) {
                            length = length2;
                        } else if (Intrinsics.a(c1932Rn0Arr[length2].b, c1802Pw)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.e.length;
                    for (int i3 = this.f + 1; i3 < length3; i3++) {
                        C1932Rn0 c1932Rn1 = this.e[i3];
                        Intrinsics.checkNotNull(c1932Rn1);
                        if (Intrinsics.a(c1932Rn1.a, c1802PwO)) {
                            C1932Rn0 c1932Rn2 = this.e[i3];
                            Intrinsics.checkNotNull(c1932Rn2);
                            if (Intrinsics.a(c1932Rn2.b, c1802Pw)) {
                                length2 = C5172lp0.a.length + (i3 - this.f);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f) + C5172lp0.a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    e(length2, 127, UserVerificationMethods.USER_VERIFY_PATTERN);
                } else if (length == -1) {
                    this.a.j1(64);
                    c(c1802PwO);
                    c(c1802Pw);
                    b(c1932Rn0);
                } else {
                    C1802Pw prefix = C1932Rn0.d;
                    c1802PwO.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (!c1802PwO.m(prefix.f(), prefix) || Intrinsics.a(C1932Rn0.i, c1802PwO)) {
                        e(length, 63, 64);
                        c(c1802Pw);
                        b(c1932Rn0);
                    } else {
                        e(length, 15, 0);
                        c(c1802Pw);
                    }
                }
            }
        }

        public final void e(int i, int i2, int i3) {
            C1481Lu c1481Lu = this.a;
            if (i < i2) {
                c1481Lu.j1(i | i3);
                return;
            }
            c1481Lu.j1(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                c1481Lu.j1(128 | (i4 & 127));
                i4 >>>= 7;
            }
            c1481Lu.j1(i4);
        }
    }

    static {
        C1932Rn0 c1932Rn0 = new C1932Rn0(C1932Rn0.i, "");
        C1802Pw c1802Pw = C1932Rn0.f;
        C1932Rn0 c1932Rn1 = new C1932Rn0(c1802Pw, "GET");
        C1932Rn0 c1932Rn2 = new C1932Rn0(c1802Pw, "POST");
        C1802Pw c1802Pw2 = C1932Rn0.g;
        C1932Rn0 c1932Rn3 = new C1932Rn0(c1802Pw2, "/");
        C1932Rn0 c1932Rn4 = new C1932Rn0(c1802Pw2, "/index.html");
        C1802Pw c1802Pw3 = C1932Rn0.h;
        C1932Rn0 c1932Rn5 = new C1932Rn0(c1802Pw3, "http");
        C1932Rn0 c1932Rn6 = new C1932Rn0(c1802Pw3, "https");
        C1802Pw c1802Pw4 = C1932Rn0.e;
        C1932Rn0[] c1932Rn0Arr = {c1932Rn0, c1932Rn1, c1932Rn2, c1932Rn3, c1932Rn4, c1932Rn5, c1932Rn6, new C1932Rn0(c1802Pw4, "200"), new C1932Rn0(c1802Pw4, "204"), new C1932Rn0(c1802Pw4, "206"), new C1932Rn0(c1802Pw4, "304"), new C1932Rn0(c1802Pw4, "400"), new C1932Rn0(c1802Pw4, "404"), new C1932Rn0(c1802Pw4, "500"), new C1932Rn0("accept-charset", ""), new C1932Rn0("accept-encoding", "gzip, deflate"), new C1932Rn0("accept-language", ""), new C1932Rn0("accept-ranges", ""), new C1932Rn0("accept", ""), new C1932Rn0("access-control-allow-origin", ""), new C1932Rn0("age", ""), new C1932Rn0("allow", ""), new C1932Rn0("authorization", ""), new C1932Rn0("cache-control", ""), new C1932Rn0("content-disposition", ""), new C1932Rn0("content-encoding", ""), new C1932Rn0("content-language", ""), new C1932Rn0("content-length", ""), new C1932Rn0("content-location", ""), new C1932Rn0("content-range", ""), new C1932Rn0("content-type", ""), new C1932Rn0("cookie", ""), new C1932Rn0("date", ""), new C1932Rn0("etag", ""), new C1932Rn0("expect", ""), new C1932Rn0("expires", ""), new C1932Rn0("from", ""), new C1932Rn0("host", ""), new C1932Rn0("if-match", ""), new C1932Rn0("if-modified-since", ""), new C1932Rn0("if-none-match", ""), new C1932Rn0("if-range", ""), new C1932Rn0("if-unmodified-since", ""), new C1932Rn0("last-modified", ""), new C1932Rn0("link", ""), new C1932Rn0("location", ""), new C1932Rn0("max-forwards", ""), new C1932Rn0("proxy-authenticate", ""), new C1932Rn0("proxy-authorization", ""), new C1932Rn0("range", ""), new C1932Rn0("referer", ""), new C1932Rn0("refresh", ""), new C1932Rn0("retry-after", ""), new C1932Rn0("server", ""), new C1932Rn0("set-cookie", ""), new C1932Rn0("strict-transport-security", ""), new C1932Rn0("transfer-encoding", ""), new C1932Rn0("user-agent", ""), new C1932Rn0("vary", ""), new C1932Rn0("via", ""), new C1932Rn0("www-authenticate", "")};
        a = c1932Rn0Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c1932Rn0Arr[i].a)) {
                linkedHashMap.put(c1932Rn0Arr[i].a, Integer.valueOf(i));
            }
        }
        Map<C1802Pw, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        b = mapUnmodifiableMap;
    }

    @NotNull
    public static void a(@NotNull C1802Pw name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int iF = name.f();
        for (int i = 0; i < iF; i++) {
            byte bL = name.l(i);
            if (65 <= bL && bL < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.q()));
            }
        }
    }
}
