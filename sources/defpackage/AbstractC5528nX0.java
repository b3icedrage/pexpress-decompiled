package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5528nX0 extends AbstractC5422n1 {
    public final int i;
    public final double j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5528nX0(int i, int i2, double d, InterfaceC5931pR1 client) {
        super(i, client);
        Intrinsics.checkNotNullParameter(client, "client");
        this.i = i2;
        this.j = d;
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 c(@NotNull C6712t82 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        int i = this.k;
        if (i == 0) {
            i = params.b;
        }
        return new R9.b(i);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 d(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        int iCeil = ((int) Math.ceil(l() / (params.a / 100.0d))) + this.k;
        n(j(l(), Math.min(iCeil, this.i), m()));
        return new R9.b(iCeil);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 g(@NotNull S9 params) {
        int i;
        Intrinsics.checkNotNullParameter(params, "params");
        int i2 = this.k;
        if (i2 > 0) {
            n(k(i2, m()));
            i = this.k;
        } else {
            double dM = m();
            i = this.d;
            n(k(i, dM));
        }
        return new R9.b(i);
    }

    @Override // defpackage.AbstractC5422n1
    public final void h(int i) {
        if (i < 0) {
            i = 0;
        }
        this.k = i;
    }

    @Override // defpackage.AbstractC5422n1
    public final void i(int i) {
        int i2 = this.k - i;
        if (i2 < 0) {
            i2 = 0;
        }
        this.k = i2;
    }

    public abstract double j(double d, int i, double d2);

    public abstract double k(int i, double d);

    public abstract double l();

    public final double m() {
        return (this.j / 100.0d) * ((double) this.d);
    }

    public abstract void n(double d);
}
