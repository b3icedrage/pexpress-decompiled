package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: r90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedEvent$2$3", f = "EventsProviderImpl.kt", l = {51}, m = "invokeSuspend")
public final class C6294r90 extends AW1 implements Function2<QC1, JM<? super List<? extends C4672jT>>, Object> {
    public int d;
    public /* synthetic */ Object e;

    public C6294r90() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C6294r90 c6294r90 = new C6294r90(2, jm);
        c6294r90.e = obj;
        return c6294r90;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(QC1 qc1, JM<? super List<? extends C4672jT>> jm) {
        return ((C6294r90) create(qc1, jm)).invokeSuspend(Unit.a);
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
        QC1 qc1 = (QC1) this.e;
        this.d = 1;
        Serializable serializableD = qc1.d(this);
        return serializableD == mn ? mn : serializableD;
    }
}
