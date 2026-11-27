package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3400dd1 extends ML0 implements Function1<C4449id1, C4449id1> {
    public final /* synthetic */ ClientMessage d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3400dd1(ClientMessage clientMessage) {
        super(1);
        this.d = clientMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C4449id1 invoke(C4449id1 c4449id1) {
        C4449id1 state = c4449id1;
        Intrinsics.checkNotNullParameter(state, "state");
        state.getClass();
        return new C4449id1(this.d);
    }
}
