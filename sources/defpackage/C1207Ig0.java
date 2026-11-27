package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: Ig0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1207Ig0<T> extends AbstractC4317i0<T, T> {
    public final int g;
    public final boolean h;
    public final C3636ek0.b i;

    /* JADX INFO: renamed from: Ig0$a */
    public static final class a<T> extends AbstractC4079gr<T> implements InterfaceC1518Mg0<T> {
        public final InterfaceC1518Mg0 d;
        public final InterfaceC4653jM1<T> e;
        public final C3636ek0.b g;
        public InterfaceC6779tU1 h;
        public volatile boolean i;
        public volatile boolean j;
        public Throwable k;
        public final AtomicLong l = new AtomicLong();
        public boolean m;

        public a(InterfaceC1518Mg0 interfaceC1518Mg0, int i, boolean z, C3636ek0.b bVar) {
            this.d = interfaceC1518Mg0;
            this.g = bVar;
            this.e = z ? new MO1<>(i) : new LO1<>(i);
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            this.k = th;
            this.j = true;
            if (this.m) {
                this.d.a(th);
            } else {
                g();
            }
        }

        public final boolean b(boolean z, boolean z2, InterfaceC6359rU1<? super T> interfaceC6359rU1) {
            if (this.i) {
                this.e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.k;
            if (th != null) {
                this.e.clear();
                interfaceC6359rU1.a(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            interfaceC6359rU1.onComplete();
            return true;
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.h.cancel();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final void clear() {
            this.e.clear();
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (this.e.offer(t)) {
                if (this.m) {
                    this.d.d(null);
                    return;
                } else {
                    g();
                    return;
                }
            }
            this.h.cancel();
            C7940z01 c7940z01 = new C7940z01("Buffer is full");
            try {
                this.g.getClass();
            } catch (Throwable th) {
                C4994l.j(th);
                c7940z01.initCause(th);
            }
            a(c7940z01);
        }

        @Override // defpackage.InterfaceC1067Gl1
        public final int e() {
            this.m = true;
            return 2;
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
            if (EnumC7620xU1.f(this.h, interfaceC6779tU1)) {
                this.h = interfaceC6779tU1;
                this.d.f(this);
                interfaceC6779tU1.s(Long.MAX_VALUE);
            }
        }

        public final void g() {
            if (getAndIncrement() == 0) {
                InterfaceC4653jM1<T> interfaceC4653jM1 = this.e;
                InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
                int iAddAndGet = 1;
                while (!b(this.j, interfaceC4653jM1.isEmpty(), interfaceC1518Mg0)) {
                    long j = this.l.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.j;
                        T tPoll = interfaceC4653jM1.poll();
                        boolean z2 = tPoll == null;
                        if (b(z, z2, interfaceC1518Mg0)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC1518Mg0.d(tPoll);
                        j2++;
                    }
                    if (j2 == j && b(this.j, interfaceC4653jM1.isEmpty(), interfaceC1518Mg0)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.l.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void onComplete() {
            this.j = true;
            if (this.m) {
                this.d.onComplete();
            } else {
                g();
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final T poll() {
            return this.e.poll();
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            if (this.m || !EnumC7620xU1.e(j)) {
                return;
            }
            C3057c.a(this.l, j);
            g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207Ig0(AbstractC7871yg0 abstractC7871yg0, int i) {
        super(abstractC7871yg0);
        C3636ek0.b bVar = C3636ek0.c;
        this.g = i;
        this.h = true;
        this.i = bVar;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        this.e.g(new a(interfaceC1518Mg0, this.g, this.h, this.i));
    }
}
