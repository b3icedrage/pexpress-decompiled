package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ed1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3609ed1 extends ML0 implements Function1<C4449id1, Unit> {
    public final /* synthetic */ C3819fd1 d;
    public final /* synthetic */ ClientMessage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3609ed1(C3819fd1 c3819fd1, ClientMessage clientMessage) {
        super(1);
        this.d = c3819fd1;
        this.e = clientMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C4449id1 c4449id1) {
        C4449id1 it = c4449id1;
        Intrinsics.checkNotNullParameter(it, "it");
        C3819fd1 c3819fd1 = this.d;
        EK1 ek1 = c3819fd1.f;
        String strD = c3819fd1.g.a(ClientMessage.class).d(this.e);
        Intrinsics.checkNotNullExpressionValue(strD, "this.adapter(T::class.java).toJson(data)");
        ek1.getClass();
        Intrinsics.checkNotNullParameter(strD, "<set-?>");
        ek1.q.b(EK1.z[19], strD);
        return Unit.a;
    }
}
