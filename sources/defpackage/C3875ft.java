package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3875ft<T> extends AbstractC2625a0<T> {

    @NotNull
    public final Thread h;

    @Nullable
    public final A80 i;

    public C3875ft(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable A80 a80) {
        super(coroutineContext, true, true);
        this.h = thread;
        this.i = a80;
    }

    @Override // defpackage.C3956gG0
    public final void x(@Nullable Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.h;
        if (Intrinsics.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
