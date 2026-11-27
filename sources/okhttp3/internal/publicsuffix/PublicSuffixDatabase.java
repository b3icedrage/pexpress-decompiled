package okhttp3.internal.publicsuffix;

import defpackage.C1903Rd1;
import defpackage.C3024bo1;
import defpackage.C3027bp1;
import defpackage.C5653o60;
import defpackage.C6009pn0;
import defpackage.C6621sj;
import defpackage.C6806tc2;
import defpackage.CS1;
import defpackage.Cm2;
import defpackage.JH1;
import defpackage.R51;
import defpackage.VE;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", R51.PUSH_ADDITIONAL_DATA_KEY, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    @NotNull
    public static final byte[] e = {42};

    @NotNull
    public static final List<String> f = VE.c("*");

    @NotNull
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    @NotNull
    public final AtomicBoolean a = new AtomicBoolean(false);

    @NotNull
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:30:0x0063  */
        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            int i5 = -1;
            byte[] bArr3 = PublicSuffixDatabase.e;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > i5 && bArr[i7] != 10) {
                    i7 += i5;
                }
                int i8 = i7 + 1;
                int i9 = 1;
                while (true) {
                    i2 = i8 + i9;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i9++;
                }
                int i10 = i2 - i8;
                int i11 = i;
                boolean z2 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i11][i12];
                        byte[] bArr4 = C6806tc2.a;
                        int i14 = b & 255;
                        z = z2;
                        i3 = i14;
                    }
                    byte b2 = bArr[i8 + i13];
                    byte[] bArr5 = C6806tc2.a;
                    i4 = i3 - (b2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        z2 = true;
                        i12 = -1;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i15 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i16 = i11 + 1; i16 < length3; i16++) {
                            length2 += bArr2[i16].length;
                        }
                        if (length2 < i15) {
                            length = i7;
                        } else if (length2 <= i15) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i8, i10, UTF_8);
                        }
                    }
                    i6 = i2 + 1;
                } else {
                    length = i7;
                }
                i5 = -1;
            }
            return null;
        }
    }

    public static List c(String str) {
        List listR = StringsKt.R(str, new char[]{JwtParser.SEPARATOR_CHAR});
        return Intrinsics.a(CollectionsKt.L(listR), "") ? CollectionsKt.B(listR) : listR;
    }

    @Nullable
    public final String a(@NotNull String domain) {
        String strA;
        String strA2;
        String strA3;
        List<String> listR;
        List<String> listR2;
        int size;
        int size2;
        int i = 0;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    C1903Rd1 c1903Rd1 = C1903Rd1.a;
                    C1903Rd1.a.getClass();
                    C1903Rd1.i(5, "Failed to read public suffix list", e2);
                    if (z) {
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str = (String) listC.get(i2);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                Intrinsics.l("publicSuffixListBytes");
                throw null;
            }
            strA = a.a(bArr2, bArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strA2 = null;
                break;
            }
            bArr3[i4] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                Intrinsics.l("publicSuffixListBytes");
                throw null;
            }
            strA2 = a.a(bArr4, bArr3, i4);
            if (strA2 != null) {
                break;
            }
            i4++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strA3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                Intrinsics.l("publicSuffixExceptionListBytes");
                throw null;
            }
            strA3 = a.a(bArr5, bArr, i6);
            if (strA3 != null) {
                break;
            }
            i6++;
        }
        if (strA3 != null) {
            listR2 = StringsKt.R("!".concat(strA3), new char[]{JwtParser.SEPARATOR_CHAR});
        } else if (strA == null && strA2 == null) {
            listR2 = f;
        } else {
            if (strA == null || (listR = StringsKt.R(strA, new char[]{JwtParser.SEPARATOR_CHAR})) == null) {
                listR = C5653o60.d;
            }
            if (strA2 == null || (listR2 = StringsKt.R(strA2, new char[]{JwtParser.SEPARATOR_CHAR})) == null) {
                listR2 = C5653o60.d;
            }
            if (listR.size() > listR2.size()) {
                listR2 = listR;
            }
        }
        if (listC.size() == listR2.size() && listR2.get(0).charAt(0) != '!') {
            return null;
        }
        if (listR2.get(0).charAt(0) == '!') {
            size = listC.size();
            size2 = listR2.size();
        } else {
            size = listC.size();
            size2 = listR2.size() + 1;
        }
        Sequence sequenceG = JH1.g(CollectionsKt.y(c(domain)), size - size2);
        Intrinsics.checkNotNullParameter(sequenceG, "<this>");
        Intrinsics.checkNotNullParameter(".", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequenceG, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(".", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        for (Object obj : sequenceG) {
            i++;
            if (i > 1) {
                buffer.append((CharSequence) ".");
            }
            CS1.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() {
        try {
            C3027bp1 c3027bp1 = new C3027bp1();
            C3027bp1 c3027bp2 = new C3027bp1();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                C3024bo1 c3024bo1E = Cm2.e(new C6009pn0(Cm2.q(resourceAsStream)));
                try {
                    long jT = c3024bo1E.t();
                    c3024bo1E.C(jT);
                    c3027bp1.d = c3024bo1E.e.W(jT);
                    long jT2 = c3024bo1E.t();
                    c3024bo1E.C(jT2);
                    c3027bp2.d = c3024bo1E.e.W(jT2);
                    Unit unit = Unit.a;
                    c3024bo1E.close();
                    synchronized (this) {
                        Object obj = c3027bp1.d;
                        Intrinsics.checkNotNull(obj);
                        this.c = (byte[]) obj;
                        Object obj2 = c3027bp2.d;
                        Intrinsics.checkNotNull(obj2);
                        this.d = (byte[]) obj2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(c3024bo1E, th);
                        throw th2;
                    }
                }
            }
            this.b.countDown();
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
