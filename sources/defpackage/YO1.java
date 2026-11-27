package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YO1 implements NN, JM<?> {

    @NotNull
    public static final YO1 d = new YO1();

    @Override // defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        return null;
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return e.d;
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        XO1.a.getClass();
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
