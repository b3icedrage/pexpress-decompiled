package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5851p30 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final byte[] c;

    public C5851p30(@NotNull byte[] bytes, @NotNull String name, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.a = name;
        this.b = mimeType;
        this.c = bytes;
    }
}
