package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2862b30 extends IllegalStateException {

    @NotNull
    public final String d;

    public C2862b30(@NotNull C2250Vp0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.d = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.d;
    }
}
