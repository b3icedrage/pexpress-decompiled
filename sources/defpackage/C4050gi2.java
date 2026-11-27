package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: gi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.webpage.viewmodel.WebViewModel$onReadyToStartScript$1", f = "WebViewModel.kt", l = {46}, m = "invokeSuspend")
public final class C4050gi2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC4260hi2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4050gi2(AbstractC4260hi2 abstractC4260hi2, JM<? super C4050gi2> jm) {
        super(2, jm);
        this.e = abstractC4260hi2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4050gi2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4050gi2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.e.k;
            Unit unit = Unit.a;
            this.d = 1;
            if (c6120qK1.a(unit, this) == mn) {
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
