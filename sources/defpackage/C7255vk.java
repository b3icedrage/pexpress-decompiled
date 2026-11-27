package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7255vk extends LZ1 {

    @NotNull
    public static final ReentrantLock h;

    @NotNull
    public static final Condition i;
    public static final long j;
    public static final long k;

    @Nullable
    public static C7255vk l;
    public int e;

    @Nullable
    public C7255vk f;
    public long g;

    /* JADX INFO: renamed from: vk$a */
    public static final class a {
        public static final void a(C7255vk c7255vk, long j, boolean z) {
            ReentrantLock reentrantLock = C7255vk.h;
            if (C7255vk.l == null) {
                C7255vk.l = new C7255vk();
                b bVar = new b("Okio Watchdog");
                bVar.setDaemon(true);
                bVar.start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                c7255vk.g = Math.min(j, c7255vk.c() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                c7255vk.g = j + jNanoTime;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                c7255vk.g = c7255vk.c();
            }
            long j2 = c7255vk.g - jNanoTime;
            C7255vk c7255vk2 = C7255vk.l;
            Intrinsics.checkNotNull(c7255vk2);
            while (true) {
                C7255vk c7255vk3 = c7255vk2.f;
                if (c7255vk3 == null) {
                    break;
                }
                Intrinsics.checkNotNull(c7255vk3);
                if (j2 < c7255vk3.g - jNanoTime) {
                    break;
                }
                c7255vk2 = c7255vk2.f;
                Intrinsics.checkNotNull(c7255vk2);
            }
            c7255vk.f = c7255vk2.f;
            c7255vk2.f = c7255vk;
            if (c7255vk2 == C7255vk.l) {
                C7255vk.i.signal();
            }
        }

        @Nullable
        public static C7255vk b() throws InterruptedException {
            C7255vk c7255vk = C7255vk.l;
            Intrinsics.checkNotNull(c7255vk);
            C7255vk c7255vk2 = c7255vk.f;
            if (c7255vk2 == null) {
                long jNanoTime = System.nanoTime();
                C7255vk.i.await(C7255vk.j, TimeUnit.MILLISECONDS);
                C7255vk c7255vk3 = C7255vk.l;
                Intrinsics.checkNotNull(c7255vk3);
                if (c7255vk3.f != null || System.nanoTime() - jNanoTime < C7255vk.k) {
                    return null;
                }
                return C7255vk.l;
            }
            long jNanoTime2 = c7255vk2.g - System.nanoTime();
            if (jNanoTime2 > 0) {
                C7255vk.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            C7255vk c7255vk4 = C7255vk.l;
            Intrinsics.checkNotNull(c7255vk4);
            c7255vk4.f = c7255vk2.f;
            c7255vk2.f = null;
            c7255vk2.e = 2;
            return c7255vk2;
        }
    }

    /* JADX INFO: renamed from: vk$b */
    public static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLock = C7255vk.h;
                    ReentrantLock reentrantLock2 = C7255vk.h;
                    reentrantLock2.lock();
                    try {
                        C7255vk c7255vkB = a.b();
                        if (c7255vkB == C7255vk.l) {
                            C7255vk.l = null;
                            reentrantLock2.unlock();
                            return;
                        } else {
                            Unit unit = Unit.a;
                            reentrantLock2.unlock();
                            if (c7255vkB != null) {
                                c7255vkB.k();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                a.a(this, j2, z);
                Unit unit = Unit.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                boolean z = i2 == 2;
                reentrantLock.unlock();
                return z;
            }
            C7255vk c7255vk = l;
            while (c7255vk != null) {
                C7255vk c7255vk2 = c7255vk.f;
                if (c7255vk2 == this) {
                    c7255vk.f = this.f;
                    this.f = null;
                    reentrantLock.unlock();
                    return false;
                }
                c7255vk = c7255vk2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void k() {
    }
}
