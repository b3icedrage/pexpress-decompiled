package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$setSelectedAsset$selectedAsset$1", f = "Trader.kt", l = {1412}, m = "invokeSuspend")
public final class G12 extends AW1 implements Function1<JM<? super C3279d22>, Object> {
    public int d;
    public final /* synthetic */ S02<H32> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G12(S02<H32> s02, JM<? super G12> jm) {
        super(1, jm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new G12(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super C3279d22> jm) {
        return ((G12) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        C1699On1 c1699On1 = this.e.a.m;
        this.d = 1;
        Object objA = C7236vf0.a(c1699On1, this);
        return objA == mn ? mn : objA;
    }
}
