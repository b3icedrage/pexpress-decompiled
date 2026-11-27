package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Dg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0817Dg0<T, R> extends AbstractC4317i0<T, R> {
    public final YK0 g;
    public final int h;

    /* JADX INFO: renamed from: Dg0$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC1518Mg0<T>, InterfaceC6779tU1 {
        public final InterfaceC1518Mg0 d;
        public final int e;
        public final YK0 k;
        public InterfaceC6779tU1 m;
        public volatile boolean n;
        public final AtomicLong g = new AtomicLong();
        public final FH h = new FH();
        public final C2156Uk j = new C2156Uk();
        public final AtomicInteger i = new AtomicInteger(1);
        public final AtomicReference<MO1<R>> l = new AtomicReference<>();

        /* JADX INFO: renamed from: Dg0$a$a, reason: collision with other inner class name */
        public final class C0017a extends AtomicReference<InterfaceC7316w20> implements InterfaceC3381dY0<R>, InterfaceC7316w20 {
            public C0017a() {
            }

            @Override // defpackage.InterfaceC3381dY0
            public final void a(Throwable th) {
                a aVar = a.this;
                FH fh = aVar.h;
                fh.a(this);
                if (!aVar.j.a(th)) {
                    EB1.b(th);
                    return;
                }
                aVar.m.cancel();
                fh.b();
                aVar.i.decrementAndGet();
                aVar.e();
            }

            @Override // defpackage.InterfaceC7316w20
            public final void b() {
                B20.e(this);
            }

            @Override // defpackage.InterfaceC3381dY0
            public final void c(InterfaceC7316w20 interfaceC7316w20) {
                while (!compareAndSet(null, interfaceC7316w20)) {
                    if (get() != null) {
                        interfaceC7316w20.b();
                        if (get() != B20.d) {
                            EB1.b(new C1376Kk1("Disposable already set!"));
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // defpackage.InterfaceC3381dY0
            public final void onComplete() {
                a aVar = a.this;
                aVar.h.a(this);
                int i = aVar.get();
                AtomicInteger atomicInteger = aVar.i;
                int i2 = aVar.e;
                if (i == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        MO1<R> mo1 = aVar.l.get();
                        if (!z || (mo1 != null && !mo1.isEmpty())) {
                            if (i2 != Integer.MAX_VALUE) {
                                aVar.m.s(1L);
                            }
                            if (aVar.decrementAndGet() == 0) {
                                return;
                            }
                            aVar.g();
                            return;
                        }
                        Throwable thB = aVar.j.b();
                        InterfaceC1518Mg0 interfaceC1518Mg0 = aVar.d;
                        if (thB != null) {
                            interfaceC1518Mg0.a(thB);
                            return;
                        } else {
                            interfaceC1518Mg0.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i2 != Integer.MAX_VALUE) {
                    aVar.m.s(1L);
                }
                aVar.e();
            }

            /* JADX WARN: Code duplicated, block: B:35:0x007c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0090 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Code duplicated, block: B:47:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.InterfaceC3381dY0
            public final void onSuccess(R r) {
                MO1<R> mo1H;
                a aVar = a.this;
                aVar.h.a(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z = aVar.i.decrementAndGet() == 0;
                        if (aVar.g.get() != 0) {
                            aVar.d.d(r);
                            MO1<R> mo1 = aVar.l.get();
                            if (z && (mo1 == null || mo1.isEmpty())) {
                                Throwable thB = aVar.j.b();
                                if (thB != null) {
                                    aVar.d.a(thB);
                                    return;
                                } else {
                                    aVar.d.onComplete();
                                    return;
                                }
                            }
                            C3057c.n(aVar.g, 1L);
                            if (aVar.e != Integer.MAX_VALUE) {
                                aVar.m.s(1L);
                            }
                        } else {
                            MO1<R> mo1H2 = aVar.h();
                            synchronized (mo1H2) {
                                mo1H2.offer(r);
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        mo1H = aVar.h();
                        synchronized (mo1H) {
                            mo1H.offer(r);
                        }
                        aVar.i.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    mo1H = aVar.h();
                    synchronized (mo1H) {
                        mo1H.offer(r);
                        aVar.i.decrementAndGet();
                        if (aVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                aVar.g();
            }
        }

        public a(InterfaceC1518Mg0 interfaceC1518Mg0, YK0 yk0, int i) {
            this.d = interfaceC1518Mg0;
            this.k = yk0;
            this.e = i;
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            this.i.decrementAndGet();
            if (!this.j.a(th)) {
                EB1.b(th);
            } else {
                this.h.b();
                e();
            }
        }

        public final void b() {
            MO1<R> mo1 = this.l.get();
            if (mo1 != null) {
                mo1.clear();
            }
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            this.n = true;
            this.m.cancel();
            this.h.b();
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            try {
                YX0<? extends Object> yx0Invoke = ((C6114qI1) this.k.d).invoke(t);
                C1589Ne.r(yx0Invoke, "The mapper returned a null MaybeSource");
                YX0<? extends Object> yx0 = yx0Invoke;
                this.i.getAndIncrement();
                C0017a c0017a = new C0017a();
                if (this.n || !this.h.c(c0017a)) {
                    return;
                }
                yx0.a(c0017a);
            } catch (Throwable th) {
                C4994l.j(th);
                this.m.cancel();
                a(th);
            }
        }

        public final void e() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
            if (EnumC7620xU1.f(this.m, interfaceC6779tU1)) {
                this.m = interfaceC6779tU1;
                this.d.f(this);
                int i = this.e;
                if (i == Integer.MAX_VALUE) {
                    interfaceC6779tU1.s(Long.MAX_VALUE);
                } else {
                    interfaceC6779tU1.s(i);
                }
            }
        }

        public final void g() {
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            AtomicInteger atomicInteger = this.i;
            AtomicReference<MO1<R>> atomicReference = this.l;
            int iAddAndGet = 1;
            do {
                long j = this.g.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.n) {
                        b();
                        return;
                    }
                    if (this.j.get() != null) {
                        Throwable thB = this.j.b();
                        b();
                        interfaceC1518Mg0.a(thB);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    MO1<R> mo1 = atomicReference.get();
                    R rPoll = mo1 != null ? mo1.poll() : null;
                    boolean z2 = rPoll == null;
                    if (z && z2) {
                        Throwable thB2 = this.j.b();
                        if (thB2 != null) {
                            interfaceC1518Mg0.a(thB2);
                            return;
                        } else {
                            interfaceC1518Mg0.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    interfaceC1518Mg0.d(rPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.n) {
                        b();
                        return;
                    }
                    if (this.j.get() != null) {
                        Throwable thB3 = this.j.b();
                        b();
                        interfaceC1518Mg0.a(thB3);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    MO1<R> mo2 = atomicReference.get();
                    boolean z4 = mo2 == null || mo2.isEmpty();
                    if (z3 && z4) {
                        Throwable thB4 = this.j.b();
                        if (thB4 != null) {
                            interfaceC1518Mg0.a(thB4);
                            return;
                        } else {
                            interfaceC1518Mg0.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C3057c.n(this.g, j2);
                    if (this.e != Integer.MAX_VALUE) {
                        this.m.s(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final MO1<R> h() {
            while (true) {
                AtomicReference<MO1<R>> atomicReference = this.l;
                MO1<R> mo1 = atomicReference.get();
                if (mo1 != null) {
                    return mo1;
                }
                MO1<R> mo2 = new MO1<>(AbstractC7871yg0.d);
                while (!atomicReference.compareAndSet(null, mo2)) {
                    if (atomicReference.get() != null) {
                    }
                }
                return mo2;
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void onComplete() {
            this.i.decrementAndGet();
            e();
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            if (EnumC7620xU1.e(j)) {
                C3057c.a(this.g, j);
                e();
            }
        }
    }

    public C0817Dg0(C1129Hg0 c1129Hg0, YK0 yk0) {
        super(c1129Hg0);
        this.g = yk0;
        this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        this.e.g(new a(interfaceC1518Mg0, this.g, this.h));
    }
}
