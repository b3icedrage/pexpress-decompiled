package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$updateSelectedAssetForNewTimeIfNeed$2", f = "TradingAssetsProvider.kt", l = {131}, m = "invokeSuspend")
public final class F22 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC7949z22 e;
    public final /* synthetic */ C3279d22 g;

    @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider$updateSelectedAssetForNewTimeIfNeed$2$1", f = "TradingAssetsProvider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super String>, Object> {
        public final /* synthetic */ C3279d22 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3279d22 c3279d22, JM<? super a> jm) {
            super(1, jm);
            this.d = c3279d22;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.d.c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F22(AbstractC7949z22 abstractC7949z22, C3279d22 c3279d22, JM<? super F22> jm) {
        super(2, jm);
        this.e = abstractC7949z22;
        this.g = c3279d22;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new F22(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((F22) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC7949z22 abstractC7949z22 = this.e;
            a aVar = new a(this.g, null);
            this.d = 1;
            if (abstractC7949z22.g.l(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
