package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.model.repository.rating.Rating;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1070Gm1 extends ML0 implements Function1<C1774Pm1, C1774Pm1> {
    public final /* synthetic */ C0992Fm1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070Gm1(C0992Fm1 c0992Fm1) {
        super(1);
        this.d = c0992Fm1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1774Pm1 invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 state = c1774Pm1;
        Intrinsics.checkNotNullParameter(state, "state");
        C0992Fm1 c0992Fm1 = this.d;
        R42 r42 = c0992Fm1.g;
        AbstractC8106zm1 abstractC8106zm1 = state.b;
        Intrinsics.c(abstractC8106zm1, "null cannot be cast to non-null type com.jivosite.sdk.model.repository.rating.RatingFormState.Draft");
        AbstractC8106zm1.a aVar = (AbstractC8106zm1.a) abstractC8106zm1;
        String str = aVar.b;
        if (str == null) {
            str = "";
        }
        String data = c0992Fm1.h.a(Rating.class).d(new Rating(aVar.a, str));
        Intrinsics.checkNotNullExpressionValue(data, "this.adapter(T::class.java).toJson(data)");
        EK1 ek1 = c0992Fm1.f;
        ek1.getClass();
        String chatId = (String) ek1.y.a(EK1.z[27], ek1);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        r42.a(new SocketMessage("atom/chat.rate", data, chatId, null, null, null, null, 120, null));
        return C1774Pm1.a(state, null, new AbstractC8106zm1.d(((AbstractC8106zm1.a) state.b).a), 0L, 5);
    }
}
