package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: kD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4836kD1 {

    /* JADX INFO: renamed from: kD1$a */
    public static final class a implements InterfaceC7316w20, Runnable {
        public final C1599Ng0.a d;
        public final b e;
        public Thread g;

        public a(C1599Ng0.a aVar, b bVar) {
            this.d = aVar;
            this.e = bVar;
        }

        @Override // defpackage.InterfaceC7316w20
        public final void b() {
            if (this.g == Thread.currentThread()) {
                b bVar = this.e;
                if (bVar instanceof A41) {
                    A41 a41 = (A41) bVar;
                    if (a41.e) {
                        return;
                    }
                    a41.e = true;
                    a41.d.shutdown();
                    return;
                }
            }
            this.e.b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.g = Thread.currentThread();
            try {
                this.d.run();
            } finally {
                b();
                this.g = null;
            }
        }
    }

    /* JADX INFO: renamed from: kD1$b */
    public static abstract class b implements InterfaceC7316w20 {
        public abstract InterfaceC7316w20 a(Runnable runnable, long j, TimeUnit timeUnit);

        public void c(C1129Hg0.a aVar) {
            a(aVar, 0L, TimeUnit.NANOSECONDS);
        }
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract b a();

    public InterfaceC7316w20 b(C1599Ng0.a aVar, long j, TimeUnit timeUnit) {
        b bVarA = a();
        a aVar2 = new a(aVar, bVarA);
        bVarA.a(aVar2, j, timeUnit);
        return aVar2;
    }
}
