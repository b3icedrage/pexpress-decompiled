package defpackage;

import androidx.annotation.NonNull;
import androidx.emoji2.text.g;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class T50 {
    public static final ThreadLocal<C3060c01> d = new ThreadLocal<>();
    public final int a;

    @NonNull
    public final g b;
    public volatile int c = 0;

    public T50(@NonNull g gVar, int i) {
        this.b = gVar;
        this.a = i;
    }

    public final int a(int i) {
        C3060c01 c3060c01B = b();
        int iA = c3060c01B.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c3060c01B.b;
        int i2 = iA + c3060c01B.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final C3060c01 b() {
        ThreadLocal<C3060c01> threadLocal = d;
        C3060c01 c3060c01 = threadLocal.get();
        if (c3060c01 == null) {
            c3060c01 = new C3060c01();
            threadLocal.set(c3060c01);
        }
        C3270d01 c3270d01 = this.b.a;
        int iA = c3270d01.a(6);
        if (iA != 0) {
            int i = iA + c3270d01.a;
            int i2 = (this.a * 4) + c3270d01.b.getInt(i) + i + 4;
            int i3 = c3270d01.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = c3270d01.b;
            c3060c01.b = byteBuffer;
            if (byteBuffer != null) {
                c3060c01.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c3060c01.c = i4;
                c3060c01.d = c3060c01.b.getShort(i4);
                return c3060c01;
            }
            c3060c01.a = 0;
            c3060c01.c = 0;
            c3060c01.d = 0;
        }
        return c3060c01;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C3060c01 c3060c01B = b();
        int iA = c3060c01B.a(4);
        sb.append(Integer.toHexString(iA != 0 ? c3060c01B.b.getInt(iA + c3060c01B.a) : 0));
        sb.append(", codepoints:");
        C3060c01 c3060c01B2 = b();
        int iA2 = c3060c01B2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + c3060c01B2.a;
            i = c3060c01B2.b.getInt(c3060c01B2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
