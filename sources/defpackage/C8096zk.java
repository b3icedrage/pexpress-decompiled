package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8096zk implements JN1 {

    @NotNull
    public final InterfaceC1153Ho0 a;

    @NotNull
    public final InterfaceC7011ub1 b;

    @NotNull
    public final R42 c;

    public C8096zk(@NotNull InterfaceC1153Ho0 historyRepository, @NotNull InterfaceC7011ub1 paginationRepository, @NotNull R42 messageTransmitter) {
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        Intrinsics.checkNotNullParameter(paginationRepository, "paginationRepository");
        Intrinsics.checkNotNullParameter(messageTransmitter, "messageTransmitter");
        this.a = historyRepository;
        this.b = paginationRepository;
        this.c = messageTransmitter;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.b;
        Long lC0 = str != null ? StringsKt.c0(str) : null;
        InterfaceC7011ub1 interfaceC7011ub1 = this.b;
        if (lC0 == null) {
            interfaceC7011ub1.D(false);
            return;
        }
        interfaceC7011ub1.D(true);
        InterfaceC1153Ho0 interfaceC1153Ho0 = this.a;
        if (interfaceC1153Ho0.getState().c < lC0.longValue()) {
            interfaceC1153Ho0.h();
        }
        if (interfaceC1153Ho0.G(lC0.longValue())) {
            interfaceC7011ub1.j();
            this.c.a(new SocketMessage("atom/me.history", null, null, null, null, null, null, 124, null));
        }
    }
}
