package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7789yH {

    @NotNull
    public final IH0 a;
    public boolean b;

    public C7789yH(@NotNull IH0 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.a = writer;
        this.b = true;
    }

    public void a() {
        this.b = false;
    }

    public void b(byte b) {
        this.a.d(b);
    }

    public final void c(char c) {
        IH0 ih0 = this.a;
        ih0.a(ih0.b, 1);
        char[] cArr = ih0.a;
        int i = ih0.b;
        ih0.b = i + 1;
        cArr[i] = c;
    }

    public void d(int i) {
        this.a.d(i);
    }

    public void e(long j) {
        this.a.d(j);
    }

    public final void f(@NotNull String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.c(v);
    }

    public void g(short s) {
        this.a.d(s);
    }

    public void h(@NotNull String text) {
        byte b;
        Intrinsics.checkNotNullParameter(text, "value");
        IH0 ih0 = this.a;
        Intrinsics.checkNotNullParameter(text, "text");
        ih0.a(ih0.b, text.length() + 2);
        char[] cArr = ih0.a;
        int i = ih0.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = C5934pS1.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = text.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    ih0.a(i4, 2);
                    char cCharAt = text.charAt(i5);
                    byte[] bArr2 = C5934pS1.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ih0.a[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str = C5934pS1.a[cCharAt];
                        Intrinsics.checkNotNull(str);
                        ih0.a(i4, str.length());
                        str.getChars(0, str.length(), ih0.a, i4);
                        int length3 = str.length() + i4;
                        ih0.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = ih0.a;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        ih0.b = i4;
                    }
                }
                ih0.a(i4, 1);
                ih0.a[i4] = '\"';
                ih0.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        ih0.b = i3 + 1;
    }

    public void i() {
    }

    public void j() {
    }
}
