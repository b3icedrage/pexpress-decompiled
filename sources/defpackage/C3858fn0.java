package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: fn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3858fn0 extends T52<Number> {
    @Override // defpackage.T52
    public final Number a(C7790yH0 c7790yH0) throws IOException {
        if (c7790yH0.G() != JH0.m) {
            return Long.valueOf(c7790yH0.a1());
        }
        c7790yH0.A();
        return null;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            zh0.l();
        } else {
            zh0.C(number2.toString());
        }
    }
}
