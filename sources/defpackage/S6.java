package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class S6 implements Runnable {
    public final /* synthetic */ T6 d;

    public S6(T6 t6) {
        this.d = t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T6 t6 = this.d;
        t6.getClass();
        while (true) {
            try {
                t6.b((T6.a) t6.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
