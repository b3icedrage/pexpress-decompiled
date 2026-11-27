package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DF1 extends OP1<HF1> implements AF1 {

    @NotNull
    public final InterfaceC5570ni1 f;

    @NotNull
    public final InterfaceC1153Ho0 g;

    public static final class a extends ML0 implements Function1<OP1.a<HF1>, Unit> {
        public final /* synthetic */ ClientMessage d;
        public final /* synthetic */ DF1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DF1 df1, ClientMessage clientMessage) {
            super(1);
            this.d = clientMessage;
            this.e = df1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<HF1> aVar) {
            OP1.a<HF1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            ClientMessage clientMessage = this.d;
            BF1 call = new BF1(clientMessage);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            CF1 call2 = new CF1(this.e, clientMessage);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DF1(@NotNull InterfaceC5889pD1 schedulers, @NotNull InterfaceC5570ni1 profileRepository, @NotNull InterfaceC1153Ho0 historyRepository) {
        super(schedulers, "SendMessage", new HF1(0));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        this.f = profileRepository;
        this.g = historyRepository;
    }

    @Override // defpackage.AF1
    @NotNull
    public final KP1<HF1> a() {
        return this.e;
    }

    @Override // defpackage.AF1
    public final void b(@NotNull ClientMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Q(0L, new a(this, message));
    }

    @Override // defpackage.AF1
    public final void e(@NotNull SocketMessage message, @NotNull C1140Hk.a doAfter) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(doAfter, "doAfter");
        Q(0L, new FF1(message, this, doAfter));
    }
}
