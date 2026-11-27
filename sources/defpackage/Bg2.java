package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Bg2 {
    public static void a(@NotNull C1481Lu.b cursor, @NotNull byte[] key) {
        long j;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.i;
            int i2 = cursor.j;
            int i3 = cursor.k;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.h;
            C1481Lu c1481Lu = cursor.d;
            Intrinsics.checkNotNull(c1481Lu);
            if (j2 == c1481Lu.e) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.h;
        } while (cursor.f(j == -1 ? 0L : j + ((long) (cursor.k - cursor.j))) != -1);
    }
}
