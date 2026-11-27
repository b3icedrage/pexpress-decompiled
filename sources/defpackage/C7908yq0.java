package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "coil.fetch.HttpFetcher", f = "HttpFetcher.kt", l = {125}, m = "fetch$suspendImpl")
public final class C7908yq0 extends LM {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ AbstractC8118zq0 g;
    public AbstractC8118zq0 h;
    public C1318Jr0 i;
    public InterfaceC1023Fx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7908yq0(AbstractC8118zq0 abstractC8118zq0, LM lm) {
        super(lm);
        this.g = abstractC8118zq0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return AbstractC8118zq0.d(this.g, null, null, this);
    }
}
