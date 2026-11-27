package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: w90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedProperty$2$2", f = "EventsProviderImpl.kt", l = {63}, m = "invokeSuspend")
public final class C7344w90 extends AW1 implements InterfaceC1060Gj0<QC1, C4672jT, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ QC1 e;
    public /* synthetic */ C4672jT g;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            QC1 qc1 = this.e;
            C4672jT c4672jT = this.g;
            this.e = null;
            this.d = 1;
            if (qc1.c(c4672jT, this) == mn) {
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

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(QC1 qc1, C4672jT c4672jT, JM<? super Unit> jm) {
        C7344w90 c7344w90 = new C7344w90(3, jm);
        c7344w90.e = qc1;
        c7344w90.g = c4672jT;
        return c7344w90.invokeSuspend(Unit.a);
    }
}
