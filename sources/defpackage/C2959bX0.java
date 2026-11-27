package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: bX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.MarketingEventsManager$trySendMarketingRegisterEventIfNeeded$2", f = "MarketingEventsManager.kt", l = {80, 80}, m = "invokeSuspend")
public final class C2959bX0 extends AW1 implements Function2<KN, JM<? super Pair<? extends C6945uG, ? extends AbstractC5652o6>>, Object> {
    public Object d;
    public int e;
    public final /* synthetic */ C3378dX0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2959bX0(C3378dX0 c3378dX0, JM<? super C2959bX0> jm) {
        super(2, jm);
        this.g = c3378dX0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2959bX0(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Pair<? extends C6945uG, ? extends AbstractC5652o6>> jm) {
        return ((C2959bX0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        MN mn = MN.d;
        int i = this.e;
        C3378dX0 c3378dX0 = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            GP1 gp1 = c3378dX0.a.k;
            this.e = 1;
            obj = C7236vf0.a(gp1, this);
            if (obj != mn) {
            }
            return mn;
        }
        if (i == 1) {
            C1795Pt1.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.d;
            C1795Pt1.b(obj);
        }
        return new Pair(obj2, obj);
        C1699On1 c1699On1A = c3378dX0.d.a();
        this.d = obj;
        this.e = 2;
        Object objA = C7236vf0.a(c1699On1A, this);
        if (objA != mn) {
            obj2 = obj;
            obj = objA;
            return new Pair(obj2, obj);
        }
        return mn;
    }
}
