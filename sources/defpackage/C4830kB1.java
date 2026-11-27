package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4830kB1 extends RuntimeException {

    @NotNull
    public final IOException d;

    @NotNull
    public IOException e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4830kB1(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.d = firstConnectException;
        this.e = firstConnectException;
    }
}
