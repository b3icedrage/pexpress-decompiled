package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BF1 extends ML0 implements Function1<HF1, HF1> {
    public final /* synthetic */ ClientMessage d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BF1(ClientMessage clientMessage) {
        super(1);
        this.d = clientMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final HF1 invoke(HF1 hf1) {
        HF1 state = hf1;
        Intrinsics.checkNotNullParameter(state, "state");
        ArrayList messages = new ArrayList(state.a.size() + 1);
        messages.addAll(state.a);
        messages.add(this.d);
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new HF1(messages);
    }
}
