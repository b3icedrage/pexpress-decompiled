package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: j42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4594j42 extends AbstractC4836kD1 {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: j42$a */
    public static final class a implements Runnable {
        public final Runnable d;
        public final c e;
        public final long g;

        public a(Runnable runnable, c cVar, long j) {
            this.d = runnable;
            this.e = cVar;
            this.g = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e.h) {
                return;
            }
            c cVar = this.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.getClass();
            long jConvert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.g;
            if (j > jConvert) {
                try {
                    Thread.sleep(j - jConvert);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    EB1.b(e);
                    return;
                }
            }
            if (this.e.h) {
                return;
            }
            this.d.run();
        }
    }

    /* JADX INFO: renamed from: j42$b */
    public static final class b implements Comparable<b> {
        public final Runnable d;
        public final long e;
        public final int g;
        public volatile boolean h;

        public b(Runnable runnable, Long l, int i) {
            this.d = runnable;
            this.e = l.longValue();
            this.g = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            int i;
            b bVar2 = bVar;
            long j = bVar2.e;
            long j2 = this.e;
            if (j2 < j) {
                i = -1;
            } else {
                i = j2 > j ? 1 : 0;
            }
            if (i != 0) {
                return i;
            }
            int i2 = this.g;
            int i3 = bVar2.g;
            if (i2 < i3) {
                return -1;
            }
            return i2 > i3 ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: j42$c */
    public static final class c extends AbstractC4836kD1.b {
        public final PriorityBlockingQueue<b> d = new PriorityBlockingQueue<>();
        public final AtomicInteger e = new AtomicInteger();
        public final AtomicInteger g = new AtomicInteger();
        public volatile boolean h;

        /* JADX INFO: renamed from: j42$c$a */
        public final class a implements Runnable {
            public final b d;

            public a(b bVar) {
                this.d = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.h = true;
                c.this.d.remove(this.d);
            }
        }

        @Override // defpackage.AbstractC4836kD1.b
        public final InterfaceC7316w20 a(Runnable runnable, long j, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(j) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
            return d(new a(runnable, this, millis), millis);
        }

        @Override // defpackage.InterfaceC7316w20
        public final void b() {
            this.h = true;
        }

        @Override // defpackage.AbstractC4836kD1.b
        public final void c(C1129Hg0.a aVar) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            d(aVar, timeUnit.convert(System.currentTimeMillis(), timeUnit));
        }

        public final InterfaceC7316w20 d(Runnable runnable, long j) {
            boolean z = this.h;
            EnumC4810k60 enumC4810k60 = EnumC4810k60.d;
            if (!z) {
                b bVar = new b(runnable, Long.valueOf(j), this.g.incrementAndGet());
                this.d.add(bVar);
                if (this.e.getAndIncrement() != 0) {
                    return new C7563xB1(new a(bVar));
                }
                int iAddAndGet = 1;
                while (!this.h) {
                    b bVarPoll = this.d.poll();
                    if (bVarPoll == null) {
                        iAddAndGet = this.e.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!bVarPoll.h) {
                        bVarPoll.d.run();
                    }
                }
                this.d.clear();
                return enumC4810k60;
            }
            return enumC4810k60;
        }
    }

    static {
        new C4594j42();
    }

    @Override // defpackage.AbstractC4836kD1
    public final AbstractC4836kD1.b a() {
        return new c();
    }

    @Override // defpackage.AbstractC4836kD1
    public final InterfaceC7316w20 b(C1599Ng0.a aVar, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            aVar.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            EB1.b(e);
        }
        return EnumC4810k60.d;
    }
}
