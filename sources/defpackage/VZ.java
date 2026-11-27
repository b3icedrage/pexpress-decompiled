package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class VZ implements Function0 {
    public final SZ.b d;
    public final SZ e;

    public VZ(SZ.b bVar, SZ sz) {
        this.d = bVar;
        this.e = sz;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return C5907pJ1.d(this.d.b.keySet(), this.e.p());
    }
}
