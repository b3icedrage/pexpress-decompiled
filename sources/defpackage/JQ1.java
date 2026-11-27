package defpackage;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class JQ1 implements Runnable {
    public final C4736jk2 d;
    public final C6135qP1 e;
    public final boolean g;

    static {
        AS0.d("StopWorkRunnable");
    }

    public JQ1(@NonNull C4736jk2 c4736jk2, @NonNull C6135qP1 c6135qP1, boolean z) {
        this.d = c4736jk2;
        this.e = c6135qP1;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC2790al2 runnableC2790al2;
        if (this.g) {
            C0743Ch1 c0743Ch1 = this.d.f;
            C6135qP1 c6135qP1 = this.e;
            c0743Ch1.getClass();
            String str = c6135qP1.a.a;
            synchronized (c0743Ch1.p) {
                try {
                    AS0.c().getClass();
                    runnableC2790al2 = (RunnableC2790al2) c0743Ch1.j.remove(str);
                    if (runnableC2790al2 != null) {
                        c0743Ch1.l.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0743Ch1.c(runnableC2790al2);
        } else {
            C0743Ch1 c0743Ch2 = this.d.f;
            C6135qP1 c6135qP2 = this.e;
            c0743Ch2.getClass();
            String str2 = c6135qP2.a.a;
            synchronized (c0743Ch2.p) {
                try {
                    RunnableC2790al2 runnableC2790al3 = (RunnableC2790al2) c0743Ch2.k.remove(str2);
                    if (runnableC2790al3 == null) {
                        AS0.c().getClass();
                    } else {
                        Set set = (Set) c0743Ch2.l.get(str2);
                        if (set != null && set.contains(c6135qP2)) {
                            AS0.c().getClass();
                            c0743Ch2.l.remove(str2);
                            C0743Ch1.c(runnableC2790al3);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        AS0 as0C = AS0.c();
        C3429dk2 c3429dk2 = this.e.a;
        as0C.getClass();
    }
}
