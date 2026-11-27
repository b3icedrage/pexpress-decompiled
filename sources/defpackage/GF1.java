package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GF1 extends ML0 implements Function1<HF1, HF1> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GF1(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final HF1 invoke(HF1 hf1) {
        HF1 state = hf1;
        Intrinsics.checkNotNullParameter(state, "state");
        List<ClientMessage> list = state.a;
        ArrayList messages = new ArrayList(XE.m(list, 10));
        for (ClientMessage clientMessageCopy : list) {
            if (Intrinsics.a(clientMessageCopy.a, this.d)) {
                TZ0.b bVar = TZ0.b.a;
                clientMessageCopy = clientMessageCopy.copy(clientMessageCopy.a, clientMessageCopy.b, clientMessageCopy.c, clientMessageCopy.d, bVar);
            }
            messages.add(clientMessageCopy);
        }
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new HF1(messages);
    }
}
