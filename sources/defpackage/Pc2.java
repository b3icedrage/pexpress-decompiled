package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class Pc2<K, A> extends AbstractC1002Fq<K, A> {
    public final A i;

    public Pc2(NU0<A> nu0, A a) {
        super(Collections.EMPTY_LIST);
        k(nu0);
        this.i = a;
    }

    @Override // defpackage.AbstractC1002Fq
    public final float c() {
        return 1.0f;
    }

    @Override // defpackage.AbstractC1002Fq
    public final A f() {
        NU0<A> nu0 = this.e;
        float f = this.d;
        A a = this.i;
        return nu0.b(0.0f, 0.0f, a, a, f, f, f);
    }

    @Override // defpackage.AbstractC1002Fq
    public final A g(C7589xK0<K> c7589xK0, float f) {
        return f();
    }

    @Override // defpackage.AbstractC1002Fq
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // defpackage.AbstractC1002Fq
    public final void j(float f) {
        this.d = f;
    }
}
