package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4235hc1 {
    public final int a;

    @NotNull
    public final ML0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4235hc1(int i, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = i;
        this.b = (ML0) message;
    }
}
