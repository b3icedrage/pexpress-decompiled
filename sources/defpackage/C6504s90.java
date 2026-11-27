package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: s90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedEvent$2$4", f = "EventsProviderImpl.kt", l = {52}, m = "invokeSuspend")
public final class C6504s90 extends AW1 implements Function2<QC1, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;

    public C6504s90() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C6504s90 c6504s90 = new C6504s90(2, jm);
        c6504s90.e = obj;
        return c6504s90;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(QC1 qc1, JM<? super Unit> jm) {
        return ((C6504s90) create(qc1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            QC1 qc1 = (QC1) this.e;
            this.d = 1;
            if (qc1.a(this) == mn) {
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
