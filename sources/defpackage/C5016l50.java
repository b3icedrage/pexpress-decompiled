package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5016l50 {

    @NotNull
    public static final long[] e = new long[0];

    @NotNull
    public final MH1 a;

    @NotNull
    public final NG0.a b;
    public long c;

    @NotNull
    public final long[] d;

    public C5016l50(@NotNull MH1 descriptor, @NotNull NG0.a readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.a = descriptor;
        this.b = readIfAbsent;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.c = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i - 1] = (-1) << iE;
        }
        this.d = jArr;
    }
}
