package defpackage;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$init$2$1", f = "TradingAssetsProvider.kt", l = {102, 103}, m = "emit-VtjQ1oo")
public final class A22 extends LM {
    public AbstractC7949z22.b.a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC7949z22.b.a<Object> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A22(AbstractC7949z22.b.a<Object> aVar, JM<? super A22> jm) {
        super(jm);
        this.g = aVar;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
