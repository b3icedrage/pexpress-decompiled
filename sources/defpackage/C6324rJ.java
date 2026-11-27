package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6324rJ extends ConnectException {

    @Nullable
    public final IOException d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6324rJ(@NotNull String message, @Nullable IOException iOException) {
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
