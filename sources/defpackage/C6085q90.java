package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;

/* JADX INFO: renamed from: q90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedEvent$2$2", f = "EventsProviderImpl.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
public final class C6085q90 extends AW1 implements InterfaceC1060Gj0<QC1, C4672jT, JM<? super Unit>, Object> {
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
            if (qc1.e(c4672jT, this) == mn) {
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
        C6085q90 c6085q90 = new C6085q90(3, jm);
        c6085q90.e = qc1;
        c6085q90.g = c4672jT;
        return c6085q90.invokeSuspend(Unit.a);
    }
}
