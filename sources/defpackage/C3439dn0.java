package defpackage;

import com.google.gson.Gson;
import java.io.IOException;

/* JADX INFO: renamed from: dn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3439dn0 extends T52<Number> {
    @Override // defpackage.T52
    public final Number a(C7790yH0 c7790yH0) throws IOException {
        if (c7790yH0.G() != JH0.m) {
            return Double.valueOf(c7790yH0.d0());
        }
        c7790yH0.A();
        return null;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            zh0.l();
            return;
        }
        double dDoubleValue = number2.doubleValue();
        Gson.a(dDoubleValue);
        zh0.t(dDoubleValue);
    }
}
