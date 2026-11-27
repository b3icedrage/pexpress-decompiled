package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4319i01 {

    @NotNull
    public final C4693ja a;

    @NotNull
    public final SharedPreferences b;

    @NotNull
    public final DS0 c;
    public final int d;

    public C4319i01(@NotNull C4693ja amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.a = amplitude;
        MI mi = amplitude.a;
        Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        this.c = amplitude.l;
        SharedPreferences sharedPreferences = mi.a.getSharedPreferences("amplitude-android-" + mi.d, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "config.context.getShared…xt.MODE_PRIVATE\n        )");
        this.b = sharedPreferences;
        this.d = sharedPreferences.getInt("storage_version", 0);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5 A[Catch: all -> 0x0035, PHI: r0 r13
      0x00f5: PHI (r0v11 i01) = (r0v7 i01), (r0v29 i01) binds: [B:22:0x0047, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r13v13 MI) = (r13v8 MI), (r13v15 MI) binds: [B:22:0x0047, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:65:0x0109, B:62:0x00f5, B:59:0x00e1), top: B:70:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        if (r1.b(r2) == r3) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10, types: [i01] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r13) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4319i01.a(LM):java.lang.Object");
    }
}
