package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class X10 extends AbstractC8004zI1 {

    @NotNull
    public final JivoWebSocketService b;

    @NotNull
    public final InterfaceC1466Lo1 c;

    @NotNull
    public final InterfaceC4855kK d;

    @NotNull
    public final Handler e;

    @NotNull
    public final W10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X10(@NotNull AI1 stateContext, @NotNull JivoWebSocketService service, @NotNull InterfaceC1466Lo1 reconnectStrategy, @NotNull InterfaceC4855kK connectionStateRepository) {
        super(stateContext);
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(reconnectStrategy, "reconnectStrategy");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        this.b = service;
        this.c = reconnectStrategy;
        this.d = connectionStateRepository;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new W10(0, stateContext, this);
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
        Handler handler = this.e;
        W10 w10 = this.f;
        handler.removeCallbacks(w10);
        if (z) {
            handler.post(w10);
            return;
        }
        long jA = this.c.a();
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.e("Wait for " + jA + " ms and reconnect");
        this.d.a(new AbstractC4645jK.c(System.currentTimeMillis() + jA));
        handler.postDelayed(w10, jA);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void e() {
        c("restart");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void f(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        c("send(socketMessage)");
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
        C6104qF0.h("Call set disconnected on disconnected state, just ignore action");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void j() {
        c("start");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void k() {
        this.a.c(KQ1.class);
        this.d.a(AbstractC4645jK.g.a);
        this.e.removeCallbacks(this.f);
        C6104qF0.e("Service stopped from disconnected state");
        this.b.stopSelf();
    }
}
