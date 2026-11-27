package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CF1 extends ML0 implements Function1<HF1, Unit> {
    public final /* synthetic */ DF1 d;
    public final /* synthetic */ ClientMessage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CF1(DF1 df1, ClientMessage clientMessage) {
        super(1);
        this.d = df1;
        this.e = clientMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(HF1 hf1) {
        HF1 it = hf1;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this.e.a;
        DF1 df1 = this.d;
        df1.getClass();
        df1.Q(5000L, new C2433Xo0(str, 1));
        return Unit.a;
    }
}
