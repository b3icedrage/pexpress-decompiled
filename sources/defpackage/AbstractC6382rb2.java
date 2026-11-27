package defpackage;

import com.jivosite.sdk.model.pojo.push.Notification;
import com.jivosite.sdk.model.pojo.push.U;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6382rb2 implements JN1 {

    @NotNull
    public final InterfaceC3940gB a;

    @NotNull
    public final InterfaceC5570ni1 b;

    @NotNull
    public final InterfaceC1153Ho0 c;

    @NotNull
    public final InterfaceC7011ub1 d;

    @NotNull
    public final InterfaceC7759y72 e;

    @NotNull
    public final R42 f;

    @NotNull
    public final InterfaceC4061gl1 g;

    @NotNull
    public final M8 h;
    public EK1 i;

    public AbstractC6382rb2(@NotNull InterfaceC3940gB chatStateRepository, @NotNull InterfaceC5570ni1 profileRepository, @NotNull InterfaceC1153Ho0 historyRepository, @NotNull InterfaceC7011ub1 paginationRepository, @NotNull InterfaceC7759y72 typingRepository, @NotNull R42 messageTransmitter, @NotNull InterfaceC4061gl1 handler, @NotNull M8 agentRepository) {
        Intrinsics.checkNotNullParameter(chatStateRepository, "chatStateRepository");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        Intrinsics.checkNotNullParameter(paginationRepository, "paginationRepository");
        Intrinsics.checkNotNullParameter(typingRepository, "typingRepository");
        Intrinsics.checkNotNullParameter(messageTransmitter, "messageTransmitter");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        this.a = chatStateRepository;
        this.b = profileRepository;
        this.c = historyRepository;
        this.d = paginationRepository;
        this.e = typingRepository;
        this.f = messageTransmitter;
        this.g = handler;
        this.h = agentRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        String str;
        String str2;
        Long lC0;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(message, "message");
        String str3 = message.c;
        String msgId = str3 == null ? "" : str3;
        String str4 = message.f;
        String str5 = str4 == null ? "" : str4;
        String str6 = message.b;
        C0997Fo0 c0997Fo0 = new C0997Fo0(msgId, message.a, str5, str6 == null ? "" : str6, TZ0.d.a);
        InterfaceC1153Ho0 interfaceC1153Ho0 = this.c;
        interfaceC1153Ho0.N(c0997Fo0);
        this.d.s();
        if (this.b.l(str5)) {
            return;
        }
        boolean z = this.a.getState().a;
        long j = c0997Fo0.f;
        if (z) {
            interfaceC1153Ho0.B(j);
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.f.a(new SocketMessage("atom/message.ack", msgId, null, null, null, null, null, 124, null));
        } else if (j > interfaceC1153Ho0.getState().c) {
            interfaceC1153Ho0.h();
            EK1 ek1 = this.i;
            if (ek1 == null) {
                Intrinsics.l("storage");
                throw null;
            }
            IJ0<Object>[] ij0Arr = EK1.z;
            if (((Boolean) ek1.p.a(ij0Arr[17], ek1)).booleanValue()) {
                EK1 ek2 = this.i;
                if (ek2 == null) {
                    Intrinsics.l("storage");
                    throw null;
                }
                if (j > ((Number) ek2.n.a(ij0Arr[15], ek2)).longValue()) {
                    EK1 ek3 = this.i;
                    if (ek3 == null) {
                        Intrinsics.l("storage");
                        throw null;
                    }
                    ek3.n.b(ij0Arr[15], Long.valueOf(j));
                    C7129v8 c7129v8M = this.h.m(str4 == null ? "" : str4);
                    if (c7129v8M == null || (str = c7129v8M.a) == null) {
                        str = "";
                    }
                    U u = new U("", str);
                    if (c7129v8M == null || (str2 = c7129v8M.c) == null) {
                        str2 = "";
                    }
                    this.g.a(new C3641el1(u, new Notification("JV_MESSAGE", WE.f(str2, str6 != null ? str6 : ""))));
                }
            }
        }
        if (str4 == null || (lC0 = StringsKt.c0(str4)) == null) {
            return;
        }
        this.e.v(lC0.longValue());
    }
}
