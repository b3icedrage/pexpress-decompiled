package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AH extends C7789yH {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AH(@NotNull IH0 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.c = z;
    }

    @Override // defpackage.C7789yH
    public final void b(byte b) {
        if (this.c) {
            G72.a aVar = G72.e;
            h(String.valueOf(b & 255));
        } else {
            G72.a aVar2 = G72.e;
            f(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.C7789yH
    public final void d(int i) {
        if (this.c) {
            M72.a aVar = M72.e;
            h(Long.toString(4294967295L & ((long) i), 10));
        } else {
            M72.a aVar2 = M72.e;
            f(Long.toString(4294967295L & ((long) i), 10));
        }
    }

    @Override // defpackage.C7789yH
    public final void e(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            S72.a aVar = S72.e;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            h(str);
            return;
        }
        S72.a aVar2 = S72.e;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        f(str);
    }

    @Override // defpackage.C7789yH
    public final void g(short s) {
        if (this.c) {
            C4352i82.a aVar = C4352i82.e;
            h(String.valueOf(s & 65535));
        } else {
            C4352i82.a aVar2 = C4352i82.e;
            f(String.valueOf(s & 65535));
        }
    }
}
