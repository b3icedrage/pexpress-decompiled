package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3309dA0 extends AbstractC8004zI1 {

    @NotNull
    public final JivoWebSocketService b;

    @NotNull
    public final InterfaceC4855kK c;

    @NotNull
    public final C5892pE1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3309dA0(@NotNull AI1 stateContext, @NotNull JivoWebSocketService service, @NotNull InterfaceC4855kK connectionStateRepository, @NotNull C5892pE1 sdkConfigUseCase) {
        super(stateContext);
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        Intrinsics.checkNotNullParameter(sdkConfigUseCase, "sdkConfigUseCase");
        this.b = service;
        this.c = connectionStateRepository;
        this.d = sdkConfigUseCase;
    }

    @Override // defpackage.AbstractC8004zI1
    public final void a(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        c("error");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void b() {
        this.a.c(C5720oR0.class);
        this.c.a(AbstractC4645jK.f.a);
        this.d.a();
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
        c("setDisconnected");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void j() {
        this.b.d();
    }

    @Override // defpackage.AbstractC8004zI1
    public final void k() {
        c("stop");
    }
}
