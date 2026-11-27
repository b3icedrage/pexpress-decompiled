package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FV implements InterfaceC3815fc1<Thread> {

    @NotNull
    public static final FV a = new FV();

    @Override // defpackage.InterfaceC3815fc1
    public final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j);
    }

    @Override // defpackage.InterfaceC3815fc1
    public final void b(Thread thread) {
        Thread token = thread;
        Intrinsics.checkNotNullParameter(token, "token");
        LockSupport.unpark(token);
    }
}
