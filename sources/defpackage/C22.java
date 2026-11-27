package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider", f = "TradingAssetsProvider.kt", l = {137, 138, 141, 144}, m = "updateBestAsset")
public final class C22 extends LM {
    public AbstractC7949z22 d;
    public List e;
    public C1709Or g;
    public C3279d22 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC7949z22 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22(AbstractC7949z22 abstractC7949z22, LM lm) {
        super(lm);
        this.j = abstractC7949z22;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(null, this);
    }
}
