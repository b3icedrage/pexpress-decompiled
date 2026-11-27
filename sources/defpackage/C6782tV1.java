package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: tV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.faq.SupportFaqViewModelBase$onFaqItemClick$1", f = "SupportFaqViewModelBase.kt", l = {63}, m = "invokeSuspend")
public final class C6782tV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1114Hb0 e;
    public final /* synthetic */ C6572sV1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6782tV1(C1114Hb0 c1114Hb0, C6572sV1 c6572sV1, JM<? super C6782tV1> jm) {
        super(2, jm);
        this.e = c1114Hb0;
        this.g = c6572sV1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6782tV1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6782tV1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1114Hb0 c1114Hb0 = this.e;
            C6572sV1 c6572sV1 = this.g;
            EV1 ev1 = new EV1(c1114Hb0.b, c1114Hb0.f, c1114Hb0.c, c1114Hb0.e, c1114Hb0.d, (((Boolean) c6572sV1.i.getValue()).booleanValue() || c1114Hb0.b != R.string.how_to_activate_my_acc_title) ? null : new C7239vg(c6572sV1, 7));
            C6120qK1 c6120qK1 = c6572sV1.j;
            this.d = 1;
            if (c6120qK1.a(ev1, this) == mn) {
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
