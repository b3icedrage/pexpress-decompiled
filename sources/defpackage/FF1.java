package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FF1 extends ML0 implements Function1<OP1.a<HF1>, Unit> {
    public final /* synthetic */ SocketMessage d;
    public final /* synthetic */ DF1 e;
    public final /* synthetic */ C1140Hk.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FF1(SocketMessage socketMessage, DF1 df1, C1140Hk.a aVar) {
        super(1);
        this.d = socketMessage;
        this.e = df1;
        this.g = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OP1.a<HF1> aVar) {
        OP1.a<HF1> updateStateInRepositoryThread = aVar;
        Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
        SocketMessage socketMessage = this.d;
        String str = socketMessage.d;
        E90 call = new E90(str, 2);
        updateStateInRepositoryThread.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        updateStateInRepositoryThread.b = call;
        EF1 call2 = new EF1(str, socketMessage, this.e, this.g);
        Intrinsics.checkNotNullParameter(call2, "call");
        updateStateInRepositoryThread.c = call2;
        return Unit.a;
    }
}
