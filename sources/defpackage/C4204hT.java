package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4204hT {

    @NotNull
    public final String a;

    @NotNull
    public final byte[] b;

    public C4204hT(@NotNull String mimeType, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.a = mimeType;
        this.b = bytes;
    }
}
