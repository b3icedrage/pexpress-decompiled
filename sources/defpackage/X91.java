package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class X91 extends AbstractC5528nX0 {
    public double l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X91(int i, int i2, double d, InterfaceC5931pR1 client) {
        super(i, i2, d, client);
        Intrinsics.checkNotNullParameter(client, "client");
        this.l = m() + ((double) i);
    }

    @Override // defpackage.AbstractC5528nX0
    public final double j(double d, int i, double d2) {
        return d + ((double) i);
    }

    @Override // defpackage.AbstractC5528nX0
    public final double k(int i, double d) {
        return ((double) i) + d;
    }

    @Override // defpackage.AbstractC5528nX0
    public final double l() {
        return this.l;
    }

    @Override // defpackage.AbstractC5528nX0
    public final void n(double d) {
        this.l = d;
    }
}
