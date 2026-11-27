package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C20<T> implements InterfaceC1518Mg0<T>, InterfaceC7316w20 {
    public final AtomicReference<InterfaceC6779tU1> d = new AtomicReference<>();

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        EnumC7620xU1.b(this.d);
    }

    public void e() {
        this.d.get().s(Long.MAX_VALUE);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        AtomicReference<InterfaceC6779tU1> atomicReference = this.d;
        Class<?> cls = getClass();
        C1589Ne.r(interfaceC6779tU1, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC6779tU1)) {
            if (atomicReference.get() != null) {
                interfaceC6779tU1.cancel();
                if (atomicReference.get() != EnumC7620xU1.d) {
                    String name = cls.getName();
                    EB1.b(new C1376Kk1(C4694ja0.a("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
                    return;
                }
                return;
            }
        }
        e();
    }
}
