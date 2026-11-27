package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Re0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1905Re0 extends AbstractC5422n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905Re0(int i, @NotNull C5475nF1 client) {
        super(i, client);
        Intrinsics.checkNotNullParameter(client, "client");
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 d(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return g(params);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 g(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new R9.b(this.d);
    }
}
