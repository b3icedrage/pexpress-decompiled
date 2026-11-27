package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7351wB0 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7351wB0(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        String message = "Not enough free space to write " + name + " of " + i + " bytes, available " + i2 + " bytes.";
        Intrinsics.checkNotNullParameter(message, "message");
        super(message);
    }
}
