package defpackage;

import android.os.Handler;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6954uJ extends AbstractC8004zI1 {

    @NotNull
    public final JivoWebSocketService b;

    @NotNull
    public final InterfaceC1466Lo1 c;

    @NotNull
    public final InterfaceC4855kK d;

    @NotNull
    public final M8 e;

    @NotNull
    public final InterfaceC7170vL f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6954uJ(@NotNull AI1 stateContext, @NotNull JivoWebSocketService service, @NotNull InterfaceC1466Lo1 reconnectStrategy, @NotNull InterfaceC4855kK connectionStateRepository, @NotNull M8 agentRepository, @NotNull InterfaceC7170vL contactFormRepository) {
        super(stateContext);
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(reconnectStrategy, "reconnectStrategy");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        Intrinsics.checkNotNullParameter(contactFormRepository, "contactFormRepository");
        this.b = service;
        this.c = reconnectStrategy;
        this.d = connectionStateRepository;
        this.e = agentRepository;
        this.f = contactFormRepository;
    }

    @Override // defpackage.AbstractC8004zI1
    public final void a(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        c("error");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void b() {
        c("load");
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
        this.a.c(C6534sJ.class);
        this.d.a(AbstractC4645jK.a.a);
        this.e.o();
        InterfaceC7170vL interfaceC7170vL = this.f;
        interfaceC7170vL.F(null);
        interfaceC7170vL.M(null);
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.getClass();
        C6104qF0.e("Start keep connection alive");
        jivoWebSocketService.f();
        Rf2 rf2 = jivoWebSocketService.n;
        if (rf2 != null) {
            Intrinsics.checkNotNullExpressionValue(20000L, "PING_INTERVAL");
            Intrinsics.checkNotNullExpressionValue(30000L, "PONG_INTERVAL");
            C3338dK c3338dK = new C3338dK(rf2, 20000L, 30000L, jivoWebSocketService.e());
            Handler handler = c3338dK.e;
            C3338dK.a aVar = c3338dK.f;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, 20000L);
            jivoWebSocketService.o = c3338dK;
        }
        this.c.reset();
        C6104qF0.a("Subscribe to message transmitter");
        R42 r42 = jivoWebSocketService.i;
        if (r42 != null) {
            r42.c(jivoWebSocketService);
        } else {
            Intrinsics.l("messageTransmitter");
            throw null;
        }
    }

    @Override // defpackage.AbstractC8004zI1
    public final void i(@NotNull V10 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        AI1 ai1 = this.a;
        ai1.c(X10.class);
        this.d.a(new AbstractC4645jK.c(0L));
        if (Intrinsics.a(reason, V10.a.a) ? true : Intrinsics.a(reason, V10.c.a)) {
            ai1.getState().k();
        } else {
            C4201hS c4201hS = C6104qF0.a;
            C6104qF0.b("Unhandled disconnected reason " + reason + " in connecting state, try reconnect");
        }
        ai1.getState().d(false);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void j() {
        this.a.c(C6954uJ.class);
        this.d.a(AbstractC4645jK.b.a);
        this.b.d();
    }

    @Override // defpackage.AbstractC8004zI1
    public final void k() {
        c("stop");
    }
}
