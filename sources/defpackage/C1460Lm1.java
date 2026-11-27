package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1460Lm1 extends ML0 implements Function1<C1774Pm1, C1774Pm1> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460Lm1(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1774Pm1 invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 state = c1774Pm1;
        Intrinsics.checkNotNullParameter(state, "state");
        AbstractC8106zm1 abstractC8106zm1 = state.b;
        Intrinsics.c(abstractC8106zm1, "null cannot be cast to non-null type com.jivosite.sdk.model.repository.rating.RatingFormState.Draft");
        return C1774Pm1.a(state, null, AbstractC8106zm1.a.a((AbstractC8106zm1.a) abstractC8106zm1, null, this.d, 1), 0L, 5);
    }
}
