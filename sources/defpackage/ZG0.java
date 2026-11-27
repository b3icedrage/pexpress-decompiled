package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class ZG0 extends ZH1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZG0(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
