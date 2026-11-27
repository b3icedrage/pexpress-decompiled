package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class YV implements InterfaceC4185hM1 {

    @NotNull
    public final ReentrantLock d;

    public YV(int i) {
        ReentrantLock lock = new ReentrantLock();
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.d = lock;
    }

    @Override // defpackage.InterfaceC4185hM1
    public void lock() {
        this.d.lock();
    }

    @Override // defpackage.InterfaceC4185hM1
    public final void unlock() {
        this.d.unlock();
    }
}
