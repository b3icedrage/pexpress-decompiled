package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5417n {

    @NotNull
    public static final C1481Lu.b a = new C1481Lu.b();
    public static final int b = -1234567890;

    public static final boolean a(int i, int i2, int i3, @NotNull byte[] a2, @NotNull byte[] b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a2[i4 + i] != b2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    @NotNull
    public static final String c(byte b2) {
        char[] cArr = C3476e.d;
        char[] cArr2 = {cArr[(b2 >> 4) & 15], cArr[b2 & 15]};
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        return new String(cArr2);
    }
}
