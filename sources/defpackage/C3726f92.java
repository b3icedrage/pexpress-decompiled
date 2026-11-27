package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3726f92 extends DN {

    @NotNull
    public static final C3726f92 g = new C3726f92();

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        block.run();
    }

    @Override // defpackage.DN
    public final boolean k1(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return true;
    }
}
