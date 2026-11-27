package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2945bS1 extends IOException {

    @NotNull
    public final EnumC7967z70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2945bS1(@NotNull EnumC7967z70 errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.d = errorCode;
    }
}
