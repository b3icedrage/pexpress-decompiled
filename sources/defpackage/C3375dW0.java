package defpackage;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3375dW0 extends MalformedInputException {

    @NotNull
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3375dW0(@NotNull String message) {
        super(0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.d = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @Nullable
    public final String getMessage() {
        return this.d;
    }
}
