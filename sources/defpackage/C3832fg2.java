package defpackage;

import com.impl.core.backend.abstractModels.RawWebSocketRequest;
import com.impl.core.backend.modelsResponse.SID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl$connectNamespace$ack$2", f = "WebSocketConnectionDataSourceImpl.kt", l = {61}, m = "invokeSuspend")
public final class C3832fg2 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4720jg2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3832fg2(C4720jg2 c4720jg2, JM<? super C3832fg2> jm) {
        super(1, jm);
        this.e = c4720jg2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3832fg2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C3832fg2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Vg2 vg2 = this.e.f;
            if (vg2 == null) {
                Intrinsics.l("executor");
                throw null;
            }
            RawWebSocketRequest rawWebSocketRequest = new RawWebSocketRequest(SID.NAME);
            this.d = 1;
            if (vg2.J(rawWebSocketRequest, this) == mn) {
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
