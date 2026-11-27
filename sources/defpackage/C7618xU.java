package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7618xU {
    public static final /* synthetic */ int a = 0;

    static {
        C1802Pw c1802Pw = C1802Pw.h;
        C1802Pw.a.c("GIF87a");
        C1802Pw.a.c("GIF89a");
        C1802Pw.a.c("RIFF");
        C1802Pw.a.c("WEBP");
        C1802Pw.a.c("VP8X");
        C1802Pw.a.c("ftyp");
        C1802Pw.a.c("msf1");
        C1802Pw.a.c("hevc");
        C1802Pw.a.c("hevx");
    }

    @NotNull
    public static final C1433Ld1 a(int i, int i2, @NotNull LM1 dstSize, @NotNull XC1 scale) {
        Intrinsics.checkNotNullParameter(dstSize, "dstSize");
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (dstSize instanceof C5748oa1) {
            return new C1433Ld1(i, i2);
        }
        if (!(dstSize instanceof C1433Ld1)) {
            throw new C6489s51();
        }
        C1433Ld1 c1433Ld1 = (C1433Ld1) dstSize;
        double dB = b(i, i2, c1433Ld1.d, c1433Ld1.e, scale);
        return new C1433Ld1(QX0.a(((double) i) * dB), QX0.a(dB * ((double) i2)));
    }

    public static final double b(int i, int i2, int i3, int i4, @NotNull XC1 scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        throw new C6489s51();
    }
}
