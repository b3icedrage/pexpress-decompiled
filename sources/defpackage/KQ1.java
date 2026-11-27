package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KQ1 extends AbstractC8004zI1 {

    @NotNull
    public final JivoWebSocketService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQ1(@NotNull AI1 stateContext, @NotNull JivoWebSocketService service, @NotNull C6102qE1 sdkContext) {
        super(stateContext);
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        this.b = service;
    }

    @Override // defpackage.AbstractC8004zI1
    public final void a(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        c("error");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void b() {
        this.a.c(C3309dA0.class).b();
    }

    @Override // defpackage.AbstractC8004zI1
    public final void d(boolean z) {
        c("reconnect");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void e() {
        c("restart");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void f(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        c("send(SocketMessage)");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void g(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        c("send(String)");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void h() {
        c("setConnected");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void i(@NotNull V10 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C6104qF0.e("Service successfully stopped");
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.f();
        jivoWebSocketService.g();
        jivoWebSocketService.stopSelf();
    }

    @Override // defpackage.AbstractC8004zI1
    public final void j() {
        c("start");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void k() {
        C6104qF0.h("Call stop on stopped state, maybe something wrong, just ignore action");
    }
}
