package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: au1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2832au1 extends AbstractC5422n1 {
    public final int i;
    public final int j;
    public final double k;
    public double l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2832au1(int i, int i2, double d, C5475nF1 client) {
        super(i, client);
        Intrinsics.checkNotNullParameter(client, "client");
        this.i = i;
        this.j = i2;
        this.k = d;
        this.l = ((d / 100.0d) * ((double) i)) + ((double) i);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 d(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        int i = this.i;
        this.l = ((this.k / 100.0d) * ((double) i)) + ((double) i);
        return new R9.b(i);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 g(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        int iMin = Math.min((int) Math.ceil(this.l), this.j);
        double d = this.l;
        this.l = ((this.k / 100.0d) * d) + d;
        return new R9.b(iMin);
    }
}
