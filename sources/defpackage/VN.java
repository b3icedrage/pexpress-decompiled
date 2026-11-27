package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VN extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VN(String message, int i) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
