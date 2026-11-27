package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EF1 extends ML0 implements Function1<HF1, HF1> {
    public final /* synthetic */ String d;
    public final /* synthetic */ SocketMessage e;
    public final /* synthetic */ DF1 g;
    public final /* synthetic */ C1140Hk.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EF1(String str, SocketMessage socketMessage, DF1 df1, C1140Hk.a aVar) {
        super(1);
        this.d = str;
        this.e = socketMessage;
        this.g = df1;
        this.h = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final HF1 invoke(HF1 hf1) {
        HF1 state = hf1;
        Intrinsics.checkNotNullParameter(state, "state");
        ArrayList messages = new ArrayList(state.a.size() - 1);
        for (ClientMessage clientMessage : state.a) {
            if (Intrinsics.a(clientMessage.a, this.d)) {
                String str = this.e.b;
                if (str == null) {
                    str = "";
                }
                String id = str;
                DF1 df1 = this.g;
                String from = df1.f.getId();
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(from, "from");
                C0997Fo0 c0997Fo0 = new C0997Fo0(id, clientMessage.c, from, clientMessage.d, TZ0.d.a);
                InterfaceC1153Ho0 interfaceC1153Ho0 = df1.g;
                if (interfaceC1153Ho0.getState().a.isEmpty()) {
                    interfaceC1153Ho0.B(c0997Fo0.f);
                }
                this.h.invoke(c0997Fo0);
            } else {
                messages.add(clientMessage);
            }
        }
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new HF1(messages);
    }
}
