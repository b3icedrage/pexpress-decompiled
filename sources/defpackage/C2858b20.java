package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: b20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2858b20 {
    public final HashMap a = new HashMap();
    public final b b = new b();

    /* JADX INFO: renamed from: b20$a */
    public static class a {
        public final ReentrantLock a = new ReentrantLock();
        public int b;
    }

    /* JADX INFO: renamed from: b20$b */
    public static class b {
        public final ArrayDeque a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.a.get(str);
                UE.e(obj, "Argument must not be null");
                aVar = (a) obj;
                int i = aVar.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
                }
                int i2 = i - 1;
                aVar.b = i2;
                if (i2 == 0) {
                    a aVar2 = (a) this.a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    b bVar = this.b;
                    synchronized (bVar.a) {
                        try {
                            if (bVar.a.size() < 10) {
                                bVar.a.offer(aVar2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.a.unlock();
    }
}
