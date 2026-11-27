package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class L70 extends AbstractC8004zI1 {

    @NotNull
    public final JivoWebSocketService b;

    @NotNull
    public final C5892pE1 c;

    @NotNull
    public final InterfaceC1466Lo1 d;

    @NotNull
    public final InterfaceC4855kK e;

    @NotNull
    public final Handler f;

    @NotNull
    public final P g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L70(@NotNull AI1 stateContext, @NotNull JivoWebSocketService service, @NotNull C5892pE1 sdkConfigUseCase, @NotNull InterfaceC1466Lo1 reconnectStrategy, @NotNull InterfaceC4855kK connectionStateRepository) {
        super(stateContext);
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(sdkConfigUseCase, "sdkConfigUseCase");
        Intrinsics.checkNotNullParameter(reconnectStrategy, "reconnectStrategy");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        this.b = service;
        this.c = sdkConfigUseCase;
        this.d = reconnectStrategy;
        this.e = connectionStateRepository;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new P(2, stateContext, this);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void a(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.a.getState().d(false);
    }

    @Override // defpackage.AbstractC8004zI1
    public final void b() {
        c(" load");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void d(boolean z) {
        Handler handler = this.f;
        P p = this.g;
        handler.removeCallbacks(p);
        if (z) {
            handler.post(p);
            return;
        }
        long jA = this.d.a();
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.e("Wait for " + jA + " ms and retry loading config");
        this.e.a(new AbstractC4645jK.d(System.currentTimeMillis() + jA, 0L));
        handler.postDelayed(p, jA);
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
        c("start");
    }

    @Override // defpackage.AbstractC8004zI1
    public final void k() {
        this.f.removeCallbacks(this.g);
        this.b.stopSelf();
    }
}
