package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Em1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0914Em1 extends ML0 implements Function1<C1774Pm1, C1774Pm1> {
    public final /* synthetic */ C0992Fm1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0914Em1(C0992Fm1 c0992Fm1) {
        super(1);
        this.d = c0992Fm1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1774Pm1 invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 state = c1774Pm1;
        Intrinsics.checkNotNullParameter(state, "state");
        this.d.f.f("");
        return C1774Pm1.a(state, null, AbstractC8106zm1.b.a, 0L, 5);
    }
}
