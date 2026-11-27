package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class FL extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FL(@NotNull String message, @Nullable Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
