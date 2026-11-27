package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class XG0 extends ZG0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XG0(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
