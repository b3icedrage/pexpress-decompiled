package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.FlowKt$firstWatched$2", f = "Flow.kt", l = {98}, m = "invokeSuspend")
public final class C7447wf0 extends AW1 implements Function1<JM<Object>, Object> {
    public int d;
    public final /* synthetic */ C4250hg0 e;
    public final /* synthetic */ C1422La g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7447wf0(C4250hg0 c4250hg0, C1422La c1422La, JM jm) {
        super(1, jm);
        this.e = c4250hg0;
        this.g = c1422La;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C7447wf0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<Object> jm) {
        return ((C7447wf0) create(jm)).invokeSuspend(Unit.a);
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
        this.d = 1;
        Object objP = C4466ii.p(this.e, this.g, this);
        return objP == mn ? mn : objP;
    }
}
