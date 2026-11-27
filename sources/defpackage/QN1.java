package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class QN1 extends SocketTimeoutException {

    @Nullable
    public final IOException d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QN1(@NotNull String message, @Nullable IOException iOException) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.d = iOException;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return this.d;
    }
}
