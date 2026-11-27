package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4941kj1 implements InterfaceC3815fc1<Thread> {

    @NotNull
    public static final C4941kj1 a = new C4941kj1();

    @Override // defpackage.InterfaceC3815fc1
    public final void a(long j) {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // defpackage.InterfaceC3815fc1
    public final void b(Thread thread) {
        Thread token = thread;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(token, "token");
        LockSupport.unpark(token);
    }
}
