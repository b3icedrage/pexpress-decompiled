package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: y90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl$proceedProperty$2$4", f = "EventsProviderImpl.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
public final class C7765y90 extends AW1 implements Function2<QC1, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;

    public C7765y90() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7765y90 c7765y90 = new C7765y90(2, jm);
        c7765y90.e = obj;
        return c7765y90;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(QC1 qc1, JM<? super Unit> jm) {
        return ((C7765y90) create(qc1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            QC1 qc1 = (QC1) this.e;
            this.d = 1;
            if (qc1.b(this) == mn) {
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
