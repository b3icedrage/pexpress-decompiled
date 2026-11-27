package defpackage;

import android.os.Handler;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6534sJ extends AbstractC8004zI1 {

    @NotNull
    public final JivoWebSocketService b;

    @NotNull
    public final C3903g11 c;

    @NotNull
    public final InterfaceC4855kK d;

    @NotNull
    public final M8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6534sJ(@NotNull JivoWebSocketService stateContext, @NotNull JivoWebSocketService service, @NotNull C3903g11 parser, @NotNull InterfaceC4855kK connectionStateRepository, @NotNull M8 agentRepository) {
        super(stateContext);
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        this.b = service;
        this.c = parser;
        this.d = connectionStateRepository;
        this.e = agentRepository;
    }

    @Override // defpackage.AbstractC8004zI1
    public final void a(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        c("error");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void b() {
        AI1 ai1 = this.a;
        ai1.c(C5720oR0.class);
        this.d.a(AbstractC4645jK.f.a);
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.f();
        jivoWebSocketService.g();
        ai1.getState().b();
    }

    @Override // defpackage.AbstractC8004zI1
    public final void d(boolean z) {
        AI1 ai1 = this.a;
        ai1.c(X10.class);
        this.d.a(new AbstractC4645jK.c(0L));
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.f();
        jivoWebSocketService.g();
        ai1.getState().d(z);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void e() {
        AI1 ai1 = this.a;
        ai1.c(X10.class);
        this.d.a(new AbstractC4645jK.c(0L));
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.f();
        jivoWebSocketService.g();
        ai1.getState().d(true);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void f(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String msg = this.c.a(SocketMessage.class).d(message);
        Intrinsics.checkNotNullExpressionValue(msg, "parser.adapter(SocketMes…ass.java).toJson(message)");
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.getClass();
        Intrinsics.checkNotNullParameter(msg, "msg");
        jivoWebSocketService.e().h(msg);
        Rf2 rf2 = jivoWebSocketService.n;
        if (rf2 != null) {
            rf2.h(msg);
        }
        C3338dK c3338dK = jivoWebSocketService.o;
        if (c3338dK != null) {
            Handler handler = c3338dK.e;
            C3338dK.a aVar = c3338dK.f;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, c3338dK.b);
        }
    }

    @Override // defpackage.AbstractC8004zI1
    public final void g(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "message");
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.getClass();
        Intrinsics.checkNotNullParameter(msg, "msg");
        jivoWebSocketService.e().h(msg);
        Rf2 rf2 = jivoWebSocketService.n;
        if (rf2 != null) {
            rf2.h(msg);
        }
        C3338dK c3338dK = jivoWebSocketService.o;
        if (c3338dK != null) {
            Handler handler = c3338dK.e;
            C3338dK.a aVar = c3338dK.f;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, c3338dK.b);
        }
    }

    @Override // defpackage.AbstractC8004zI1
    public final void h() {
        c("setConnected");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void i(@NotNull V10 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        AI1 ai1 = this.a;
        ai1.c(X10.class);
        this.d.a(new AbstractC4645jK.c(0L));
        this.e.o();
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.f();
        jivoWebSocketService.g();
        if (reason instanceof V10.a ? true : Intrinsics.a(reason, V10.c.a)) {
            Rf2 rf2 = jivoWebSocketService.n;
            if (rf2 != null) {
                rf2.c(4000, "Disconnect by sdk");
            }
            ai1.getState().k();
            return;
        }
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.b("Unhandled disconnected reason " + reason + " in connected state, try reconnect");
        ai1.getState().d(false);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void j() {
        c("start");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void k() {
        this.a.c(KQ1.class);
        this.d.a(AbstractC4645jK.g.a);
        JivoWebSocketService jivoWebSocketService = this.b;
        jivoWebSocketService.f();
        jivoWebSocketService.g();
        Rf2 rf2 = jivoWebSocketService.n;
        if (rf2 != null) {
            rf2.c(4000, "Disconnect by sdk");
        }
    }
}
