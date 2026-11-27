package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: Hg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1129Hg0<T> extends AbstractC4317i0<T, T> {
    public final AbstractC4836kD1 g;
    public final int h;

    /* JADX INFO: renamed from: Hg0$a */
    public static abstract class a<T> extends AbstractC4079gr<T> implements InterfaceC1518Mg0<T>, Runnable {
        public final AbstractC4836kD1.b d;
        public final int e;
        public final int g;
        public final AtomicLong h = new AtomicLong();
        public InterfaceC6779tU1 i;
        public InterfaceC4863kM1<T> j;
        public volatile boolean k;
        public volatile boolean l;
        public Throwable m;
        public int n;
        public long o;
        public boolean p;

        public a(AbstractC4836kD1.b bVar, int i) {
            this.d = bVar;
            this.e = i;
            this.g = i - (i >> 2);
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            if (this.l) {
                EB1.b(th);
                return;
            }
            this.m = th;
            this.l = true;
            j();
        }

        public final boolean b(boolean z, boolean z2, InterfaceC6359rU1<?> interfaceC6359rU1) {
            if (this.k) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.m;
            if (th != null) {
                clear();
                interfaceC6359rU1.a(th);
                this.d.b();
                return true;
            }
            if (!z2) {
                return false;
            }
            interfaceC6359rU1.onComplete();
            this.d.b();
            return true;
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            if (this.k) {
                return;
            }
            this.k = true;
            this.i.cancel();
            this.d.b();
            if (getAndIncrement() == 0) {
                this.j.clear();
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final void clear() {
            this.j.clear();
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (this.l) {
                return;
            }
            if (this.n == 2) {
                j();
                return;
            }
            if (!this.j.offer(t)) {
                this.i.cancel();
                this.m = new C7940z01("Queue is full?!");
                this.l = true;
            }
            j();
        }

        @Override // defpackage.InterfaceC1067Gl1
        public final int e() {
            this.p = true;
            return 2;
        }

        public abstract void g();

        public abstract void h();

        public abstract void i();

        @Override // defpackage.InterfaceC4863kM1
        public final boolean isEmpty() {
            return this.j.isEmpty();
        }

        public final void j() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.d.c(this);
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void onComplete() {
            if (this.l) {
                return;
            }
            this.l = true;
            j();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.p) {
                h();
            } else if (this.n == 1) {
                i();
            } else {
                g();
            }
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            if (EnumC7620xU1.e(j)) {
                C3057c.a(this.h, j);
                j();
            }
        }
    }

    /* JADX INFO: renamed from: Hg0$b */
    public static final class b<T> extends a<T> {
        public final InterfaceC2913bI<? super T> q;
        public long r;

        public b(InterfaceC2913bI interfaceC2913bI, AbstractC4836kD1.b bVar, int i) {
            super(bVar, i);
            this.q = interfaceC2913bI;
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
            if (EnumC7620xU1.f(this.i, interfaceC6779tU1)) {
                this.i = interfaceC6779tU1;
                if (interfaceC6779tU1 instanceof InterfaceC1145Hl1) {
                    InterfaceC1145Hl1 interfaceC1145Hl1 = (InterfaceC1145Hl1) interfaceC6779tU1;
                    int iE = interfaceC1145Hl1.e();
                    if (iE == 1) {
                        this.n = 1;
                        this.j = interfaceC1145Hl1;
                        this.l = true;
                        this.q.f(this);
                        return;
                    }
                    if (iE == 2) {
                        this.n = 2;
                        this.j = interfaceC1145Hl1;
                        this.q.f(this);
                        interfaceC6779tU1.s(this.e);
                        return;
                    }
                }
                this.j = new LO1(this.e);
                this.q.f(this);
                interfaceC6779tU1.s(this.e);
            }
        }

        @Override // defpackage.C1129Hg0.a
        public final void g() {
            InterfaceC2913bI<? super T> interfaceC2913bI = this.q;
            InterfaceC4863kM1<T> interfaceC4863kM1 = this.j;
            long j = this.o;
            long j2 = this.r;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.h.get();
                while (j != j3) {
                    boolean z = this.l;
                    try {
                        T tPoll = interfaceC4863kM1.poll();
                        boolean z2 = tPoll == null;
                        if (b(z, z2, interfaceC2913bI)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (interfaceC2913bI.c(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.g) {
                            this.i.s(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        C4994l.j(th);
                        this.i.cancel();
                        interfaceC4863kM1.clear();
                        interfaceC2913bI.a(th);
                        this.d.b();
                        return;
                    }
                }
                if (j == j3 && b(this.l, interfaceC4863kM1.isEmpty(), interfaceC2913bI)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.o = j;
                    this.r = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // defpackage.C1129Hg0.a
        public final void h() {
            int iAddAndGet = 1;
            while (!this.k) {
                boolean z = this.l;
                this.q.d(null);
                if (z) {
                    Throwable th = this.m;
                    if (th != null) {
                        this.q.a(th);
                    } else {
                        this.q.onComplete();
                    }
                    this.d.b();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.C1129Hg0.a
        public final void i() {
            InterfaceC2913bI<? super T> interfaceC2913bI = this.q;
            InterfaceC4863kM1<T> interfaceC4863kM1 = this.j;
            long j = this.o;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.h.get();
                while (j != j2) {
                    try {
                        T tPoll = interfaceC4863kM1.poll();
                        if (this.k) {
                            return;
                        }
                        if (tPoll == null) {
                            interfaceC2913bI.onComplete();
                            this.d.b();
                            return;
                        } else if (interfaceC2913bI.c(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        C4994l.j(th);
                        this.i.cancel();
                        interfaceC2913bI.a(th);
                        this.d.b();
                        return;
                    }
                }
                if (this.k) {
                    return;
                }
                if (interfaceC4863kM1.isEmpty()) {
                    interfaceC2913bI.onComplete();
                    this.d.b();
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.o = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final T poll() {
            T tPoll = this.j.poll();
            if (tPoll != null && this.n != 1) {
                long j = this.r + 1;
                if (j == this.g) {
                    this.r = 0L;
                    this.i.s(j);
                    return tPoll;
                }
                this.r = j;
            }
            return tPoll;
        }
    }

    /* JADX INFO: renamed from: Hg0$c */
    public static final class c<T> extends a<T> {
        public final InterfaceC1518Mg0 q;

        public c(InterfaceC1518Mg0 interfaceC1518Mg0, AbstractC4836kD1.b bVar, int i) {
            super(bVar, i);
            this.q = interfaceC1518Mg0;
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
            if (EnumC7620xU1.f(this.i, interfaceC6779tU1)) {
                this.i = interfaceC6779tU1;
                if (interfaceC6779tU1 instanceof InterfaceC1145Hl1) {
                    InterfaceC1145Hl1 interfaceC1145Hl1 = (InterfaceC1145Hl1) interfaceC6779tU1;
                    int iE = interfaceC1145Hl1.e();
                    if (iE == 1) {
                        this.n = 1;
                        this.j = interfaceC1145Hl1;
                        this.l = true;
                        this.q.f(this);
                        return;
                    }
                    if (iE == 2) {
                        this.n = 2;
                        this.j = interfaceC1145Hl1;
                        this.q.f(this);
                        interfaceC6779tU1.s(this.e);
                        return;
                    }
                }
                this.j = new LO1(this.e);
                this.q.f(this);
                interfaceC6779tU1.s(this.e);
            }
        }

        @Override // defpackage.C1129Hg0.a
        public final void g() {
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.q;
            InterfaceC4863kM1<T> interfaceC4863kM1 = this.j;
            long j = this.o;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.h.get();
                while (j != jAddAndGet) {
                    boolean z = this.l;
                    try {
                        T tPoll = interfaceC4863kM1.poll();
                        boolean z2 = tPoll == null;
                        if (b(z, z2, interfaceC1518Mg0)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC1518Mg0.d(tPoll);
                        j++;
                        if (j == this.g) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.h.addAndGet(-j);
                            }
                            this.i.s(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        C4994l.j(th);
                        this.i.cancel();
                        interfaceC4863kM1.clear();
                        interfaceC1518Mg0.a(th);
                        this.d.b();
                        return;
                    }
                }
                if (j == jAddAndGet && b(this.l, interfaceC4863kM1.isEmpty(), interfaceC1518Mg0)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.o = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // defpackage.C1129Hg0.a
        public final void h() {
            int iAddAndGet = 1;
            while (!this.k) {
                boolean z = this.l;
                this.q.d(null);
                if (z) {
                    Throwable th = this.m;
                    if (th != null) {
                        this.q.a(th);
                    } else {
                        this.q.onComplete();
                    }
                    this.d.b();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.C1129Hg0.a
        public final void i() {
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.q;
            InterfaceC4863kM1<T> interfaceC4863kM1 = this.j;
            long j = this.o;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.h.get();
                while (j != j2) {
                    try {
                        T tPoll = interfaceC4863kM1.poll();
                        if (this.k) {
                            return;
                        }
                        if (tPoll == null) {
                            interfaceC1518Mg0.onComplete();
                            this.d.b();
                            return;
                        } else {
                            interfaceC1518Mg0.d(tPoll);
                            j++;
                        }
                    } catch (Throwable th) {
                        C4994l.j(th);
                        this.i.cancel();
                        interfaceC1518Mg0.a(th);
                        this.d.b();
                        return;
                    }
                }
                if (this.k) {
                    return;
                }
                if (interfaceC4863kM1.isEmpty()) {
                    interfaceC1518Mg0.onComplete();
                    this.d.b();
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.o = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final T poll() {
            T tPoll = this.j.poll();
            if (tPoll != null && this.n != 1) {
                long j = this.o + 1;
                if (j == this.g) {
                    this.o = 0L;
                    this.i.s(j);
                    return tPoll;
                }
                this.o = j;
            }
            return tPoll;
        }
    }

    public C1129Hg0(AbstractC7871yg0 abstractC7871yg0, AbstractC4836kD1 abstractC4836kD1, int i) {
        super(abstractC7871yg0);
        this.g = abstractC4836kD1;
        this.h = i;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        AbstractC4836kD1.b bVarA = this.g.a();
        boolean z = interfaceC1518Mg0 instanceof InterfaceC2913bI;
        int i = this.h;
        AbstractC7871yg0<T> abstractC7871yg0 = this.e;
        if (z) {
            abstractC7871yg0.g(new b((InterfaceC2913bI) interfaceC1518Mg0, bVarA, i));
        } else {
            abstractC7871yg0.g(new c(interfaceC1518Mg0, bVarA, i));
        }
    }
}
