package defpackage;

import com.impl.core.backend.modelsRequest.AuthenticationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$singleRequest$2", f = "WebSocketRequestExecutorBase.kt", l = {434}, m = "invokeSuspend")
public final class Ng2 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Vg2 e;
    public final /* synthetic */ AuthenticationRequest g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ng2(Vg2 vg2, AuthenticationRequest authenticationRequest, JM jm) {
        super(1, jm);
        this.e = vg2;
        this.g = authenticationRequest;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Ng2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((Ng2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (this.e.y("auth", this.g, "auth", this) == mn) {
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
