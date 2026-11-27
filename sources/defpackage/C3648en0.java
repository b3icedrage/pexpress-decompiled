package defpackage;

import com.google.gson.Gson;
import java.io.IOException;

/* JADX INFO: renamed from: en0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3648en0 extends T52<Number> {
    @Override // defpackage.T52
    public final Number a(C7790yH0 c7790yH0) throws IOException {
        if (c7790yH0.G() != JH0.m) {
            return Float.valueOf((float) c7790yH0.d0());
        }
        c7790yH0.A();
        return null;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Number number) throws IOException {
        Number numberValueOf = number;
        if (numberValueOf == null) {
            zh0.l();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        Gson.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        zh0.A(numberValueOf);
    }
}
