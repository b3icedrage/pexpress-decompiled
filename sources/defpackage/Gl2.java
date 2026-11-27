package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WsSessionRevokeKt$revokeDeadSession$2", f = "WsSessionRevoke.kt", l = {39}, m = "invokeSuspend")
public final class Gl2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4923kf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gl2(C4923kf c4923kf, JM<? super Gl2> jm) {
        super(2, jm);
        this.e = c4923kf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Gl2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Gl2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.e.w;
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
