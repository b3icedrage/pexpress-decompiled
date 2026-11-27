package defpackage;

/* JADX INFO: renamed from: zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8081zg0<T> extends AbstractC7871yg0<T> {
    public final CallableC5904pI1 e;

    public C8081zg0(CallableC5904pI1 callableC5904pI1) {
        this.e = callableC5904pI1;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        try {
            this.e.call().b(interfaceC1518Mg0);
        } catch (Throwable th) {
            C4994l.j(th);
            interfaceC1518Mg0.f(EnumC7332w60.d);
            interfaceC1518Mg0.a(th);
        }
    }
}
