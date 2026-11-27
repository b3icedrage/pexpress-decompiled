package defpackage;

import com.base.feature.stub.screens.stubgame.StubGameFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameFragment", f = "StubGameFragment.kt", l = {49}, m = "initGameLineChart")
public final class C3157cT1 extends LM {
    public StubGameFragment d;
    public C3576eT1 e;
    public C3099cA0 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ StubGameFragment i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3157cT1(StubGameFragment stubGameFragment, LM lm) {
        super(lm);
        this.i = stubGameFragment;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return StubGameFragment.m(this.i, this);
    }
}
