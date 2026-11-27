package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class IY0 implements Function0 {
    public final OY0 d;
    public final C3637ek1 e;
    public final C2850b00 g;

    public IY0(OY0 oy0, C3637ek1 c3637ek1, C2850b00 c2850b00) {
        this.d = oy0;
        this.e = c3637ek1;
        this.g = c2850b00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OY0 oy0 = this.d;
        C2720aS0 c2720aS0 = oy0.a.a.a;
        MO0 mo0 = new MO0(oy0, this.e, this.g, 1);
        c2720aS0.getClass();
        return new C2720aS0.f(c2720aS0, mo0);
    }
}
