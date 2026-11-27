package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class A71 extends T52<Number> {
    public static final C7968z71 b = new C7968z71(new A71(EnumC2852b02.e));
    public final EnumC2852b02 a;

    public A71(EnumC2852b02 enumC2852b02) {
        this.a = enumC2852b02;
    }

    @Override // defpackage.T52
    public final Number a(C7790yH0 c7790yH0) throws IOException {
        JH0 jh0G = c7790yH0.G();
        int iOrdinal = jh0G.ordinal();
        if (iOrdinal == 5 || iOrdinal == 6) {
            return this.a.b(c7790yH0);
        }
        if (iOrdinal == 8) {
            c7790yH0.A();
            return null;
        }
        throw new HH0("Expecting number, got: " + jh0G + "; at path " + c7790yH0.k());
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Number number) throws IOException {
        zh0.A(number);
    }
}
