package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Mm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1537Mm1 extends ML0 implements Function1<C1774Pm1, C1774Pm1> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537Mm1(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1774Pm1 invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 state = c1774Pm1;
        Intrinsics.checkNotNullParameter(state, "state");
        AbstractC8106zm1 abstractC8106zm1 = state.b;
        boolean z = abstractC8106zm1 instanceof AbstractC8106zm1.c;
        String str = this.d;
        if (z) {
            return C1774Pm1.a(state, null, new AbstractC8106zm1.a(str, null), 0L, 5);
        }
        return abstractC8106zm1 instanceof AbstractC8106zm1.a ? C1774Pm1.a(state, null, AbstractC8106zm1.a.a((AbstractC8106zm1.a) abstractC8106zm1, str, null, 2), 0L, 5) : state;
    }
}
