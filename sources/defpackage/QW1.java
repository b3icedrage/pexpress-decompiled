package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class QW1 implements Runnable {
    public final /* synthetic */ String d;
    public final /* synthetic */ RW1 e;

    public QW1(RW1 rw1, String str) {
        this.e = rw1;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bk2 bk2;
        C0743Ch1 c0743Ch1 = this.e.d.f;
        String str = this.d;
        synchronized (c0743Ch1.p) {
            try {
                RunnableC2790al2 runnableC2790al2 = (RunnableC2790al2) c0743Ch1.j.get(str);
                if (runnableC2790al2 == null) {
                    runnableC2790al2 = (RunnableC2790al2) c0743Ch1.k.get(str);
                }
                bk2 = runnableC2790al2 != null ? runnableC2790al2.i : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bk2 == null || !bk2.b()) {
            return;
        }
        synchronized (this.e.g) {
            this.e.j.put(ED.i(bk2), bk2);
            this.e.k.add(bk2);
            RW1 rw1 = this.e;
            rw1.l.b(rw1.k);
        }
    }
}
