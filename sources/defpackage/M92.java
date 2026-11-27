package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class M92 extends OP1<N92> implements J92 {

    @NotNull
    public final TreeMap f;

    public static final class a extends ML0 implements Function1<OP1.a<N92>, Unit> {
        public final /* synthetic */ SocketMessage e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SocketMessage socketMessage) {
            super(1);
            this.e = socketMessage;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<N92> aVar) {
            OP1.a<N92> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            L92 call = new L92(M92.this, this.e);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M92(@NotNull InterfaceC5889pD1 schedulers) {
        super(schedulers, "Unsupported", new N92(0));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.f = new TreeMap(new K92());
    }

    @Override // defpackage.J92
    @NotNull
    public final KP1<N92> a() {
        return this.e;
    }

    @Override // defpackage.J92
    public final void d(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Q(0L, new a(message));
    }
}
