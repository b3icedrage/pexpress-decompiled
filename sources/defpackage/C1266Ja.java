package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase$sendDataToOneSignals$2", f = "AnalyticsUseCaseBase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
public final class C1266Ja extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1110Ha e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266Ja(C1110Ha c1110Ha, JM<? super C1266Ja> jm) {
        super(2, jm);
        this.e = c1110Ha;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1266Ja(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1266Ja) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1110Ha c1110Ha = this.e;
            H91 h91 = H91.REGISTRATION_TIME;
            this.d = 1;
            if (c1110Ha.b.i(h91, this) == mn) {
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
