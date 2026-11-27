package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: jS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4671jS1<T> extends AtomicInteger implements InterfaceC1518Mg0<T>, InterfaceC6779tU1 {
    public final InterfaceC6359rU1<? super T> d;
    public final C2156Uk e = new C2156Uk();
    public final AtomicLong g = new AtomicLong();
    public final AtomicReference<InterfaceC6779tU1> h = new AtomicReference<>();
    public final AtomicBoolean i = new AtomicBoolean();
    public volatile boolean j;

    public C4671jS1(InterfaceC6359rU1<? super T> interfaceC6359rU1) {
        this.d = interfaceC6359rU1;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(Throwable th) {
        this.j = true;
        InterfaceC6359rU1<? super T> interfaceC6359rU1 = this.d;
        C2156Uk c2156Uk = this.e;
        if (!c2156Uk.a(th)) {
            EB1.b(th);
        } else if (getAndIncrement() == 0) {
            interfaceC6359rU1.a(c2156Uk.b());
        }
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void cancel() {
        if (this.j) {
            return;
        }
        EnumC7620xU1.b(this.h);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(T t) {
        if (get() == 0 && compareAndSet(0, 1)) {
            InterfaceC6359rU1<? super T> interfaceC6359rU1 = this.d;
            interfaceC6359rU1.d(t);
            if (decrementAndGet() != 0) {
                Throwable thB = this.e.b();
                if (thB != null) {
                    interfaceC6359rU1.a(thB);
                } else {
                    interfaceC6359rU1.onComplete();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        if (!this.i.compareAndSet(false, true)) {
            interfaceC6779tU1.cancel();
            cancel();
            a(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.d.f(this);
        AtomicReference<InterfaceC6779tU1> atomicReference = this.h;
        AtomicLong atomicLong = this.g;
        C1589Ne.r(interfaceC6779tU1, "s is null");
        while (!atomicReference.compareAndSet(null, interfaceC6779tU1)) {
            if (atomicReference.get() != null) {
                interfaceC6779tU1.cancel();
                if (atomicReference.get() != EnumC7620xU1.d) {
                    EB1.b(new C1376Kk1("Subscription already set!"));
                    return;
                }
                return;
            }
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet != 0) {
            interfaceC6779tU1.s(andSet);
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        this.j = true;
        InterfaceC6359rU1<? super T> interfaceC6359rU1 = this.d;
        C2156Uk c2156Uk = this.e;
        if (getAndIncrement() == 0) {
            Throwable thB = c2156Uk.b();
            if (thB != null) {
                interfaceC6359rU1.a(thB);
            } else {
                interfaceC6359rU1.onComplete();
            }
        }
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void s(long j) {
        if (j <= 0) {
            cancel();
            a(new IllegalArgumentException(C6419rl.a("§3.9 violated: positive request amount required but it was ", j)));
            return;
        }
        AtomicReference<InterfaceC6779tU1> atomicReference = this.h;
        AtomicLong atomicLong = this.g;
        InterfaceC6779tU1 interfaceC6779tU1 = atomicReference.get();
        if (interfaceC6779tU1 != null) {
            interfaceC6779tU1.s(j);
            return;
        }
        if (EnumC7620xU1.e(j)) {
            C3057c.a(atomicLong, j);
            InterfaceC6779tU1 interfaceC6779tU2 = atomicReference.get();
            if (interfaceC6779tU2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC6779tU2.s(andSet);
                }
            }
        }
    }
}
