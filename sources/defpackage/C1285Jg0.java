package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1285Jg0<T> extends AbstractC4317i0<T, T> {

    /* JADX INFO: renamed from: Jg0$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC1518Mg0<T>, InterfaceC6779tU1 {
        public final InterfaceC1518Mg0 d;
        public InterfaceC6779tU1 e;
        public volatile boolean g;
        public Throwable h;
        public volatile boolean i;
        public final AtomicLong j = new AtomicLong();
        public final AtomicReference<T> k = new AtomicReference<>();

        public a(InterfaceC1518Mg0 interfaceC1518Mg0) {
            this.d = interfaceC1518Mg0;
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            this.h = th;
            this.g = true;
            e();
        }

        public final boolean b(boolean z, boolean z2, InterfaceC1518Mg0 interfaceC1518Mg0, AtomicReference atomicReference) {
            if (this.i) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.h;
            if (th != null) {
                atomicReference.lazySet(null);
                interfaceC1518Mg0.a(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            interfaceC1518Mg0.onComplete();
            return true;
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.e.cancel();
            if (getAndIncrement() == 0) {
                this.k.lazySet(null);
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            this.k.lazySet(t);
            e();
        }

        public final void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            AtomicLong atomicLong = this.j;
            AtomicReference<T> atomicReference = this.k;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.g;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (b(z, z2, interfaceC1518Mg0, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    interfaceC1518Mg0.d(andSet);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (b(this.g, atomicReference.get() == null, interfaceC1518Mg0, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    C3057c.n(atomicLong, j);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
            if (EnumC7620xU1.f(this.e, interfaceC6779tU1)) {
                this.e = interfaceC6779tU1;
                this.d.f(this);
                interfaceC6779tU1.s(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void onComplete() {
            this.g = true;
            e();
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            if (EnumC7620xU1.e(j)) {
                C3057c.a(this.j, j);
                e();
            }
        }
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        this.e.g(new a(interfaceC1518Mg0));
    }
}
