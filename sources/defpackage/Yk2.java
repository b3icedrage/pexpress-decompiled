package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Yk2 implements Runnable {
    public final /* synthetic */ C6117qJ1 d;
    public final /* synthetic */ RunnableC2790al2 e;

    public Yk2(RunnableC2790al2 runnableC2790al2, C6117qJ1 c6117qJ1) {
        this.e = runnableC2790al2;
        this.d = c6117qJ1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.u.d instanceof AbstractC4575j0.b) {
            return;
        }
        try {
            this.d.get();
            AS0 as0C = AS0.c();
            String str = RunnableC2790al2.w;
            String str2 = this.e.i.c;
            as0C.getClass();
            RunnableC2790al2 runnableC2790al2 = this.e;
            runnableC2790al2.u.l(runnableC2790al2.j.startWork());
        } catch (Throwable th) {
            this.e.u.k(th);
        }
    }
}
