package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2454Xv0 {

    @NotNull
    public C1330Jv0 b;

    @NotNull
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock(true);

    @NotNull
    public final Object c = new Object();

    @NotNull
    public final LinkedHashSet d = new LinkedHashSet();

    public C2454Xv0() {
        String str = null;
        this.b = new C1330Jv0(7, str, str);
    }

    public final void a(@NotNull C1330Jv0 identity) {
        Set setH0;
        Intrinsics.checkNotNullParameter(identity, "identity");
        ReentrantReadWriteLock.ReadLock lock = this.a.readLock();
        lock.lock();
        try {
            C1330Jv0 c1330Jv0 = this.b;
            lock.unlock();
            ReentrantReadWriteLock reentrantReadWriteLock = this.a;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.b = identity;
                Unit unit = Unit.a;
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                if (identity.equals(c1330Jv0)) {
                    return;
                }
                synchronized (this.c) {
                    setH0 = CollectionsKt.h0(this.d);
                }
                Iterator it = setH0.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(identity);
                }
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
