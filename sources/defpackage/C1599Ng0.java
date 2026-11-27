package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1599Ng0 extends AbstractC7871yg0<Long> {
    public final AbstractC4836kD1 e;
    public final long g;
    public final TimeUnit h;

    /* JADX INFO: renamed from: Ng0$a */
    public static final class a extends AtomicReference<InterfaceC7316w20> implements InterfaceC6779tU1, Runnable {
        public final InterfaceC1518Mg0 d;
        public volatile boolean e;

        public a(InterfaceC1518Mg0 interfaceC1518Mg0) {
            this.d = interfaceC1518Mg0;
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            B20.e(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != B20.d) {
                boolean z = this.e;
                EnumC4810k60 enumC4810k60 = EnumC4810k60.d;
                if (!z) {
                    lazySet(enumC4810k60);
                    this.d.a(new C7940z01("Can't deliver value due to lack of requests"));
                } else {
                    this.d.d(0L);
                    lazySet(enumC4810k60);
                    this.d.onComplete();
                }
            }
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            if (EnumC7620xU1.e(j)) {
                this.e = true;
            }
        }
    }

    public C1599Ng0(long j, AbstractC4836kD1 abstractC4836kD1) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.g = j;
        this.h = timeUnit;
        this.e = abstractC4836kD1;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        a aVar = new a(interfaceC1518Mg0);
        interfaceC1518Mg0.f(aVar);
        InterfaceC7316w20 interfaceC7316w20B = this.e.b(aVar, this.g, this.h);
        while (!aVar.compareAndSet(null, interfaceC7316w20B)) {
            if (aVar.get() != null) {
                if (aVar.get() == B20.d) {
                    interfaceC7316w20B.b();
                    return;
                }
                return;
            }
        }
    }
}
