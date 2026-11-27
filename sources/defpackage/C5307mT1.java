package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameViewModelBase", f = "StubGameViewModelBase.kt", l = {69}, m = "requestCandlesHistory")
public final class C5307mT1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4416iT1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5307mT1(C4416iT1 c4416iT1, LM lm) {
        super(lm);
        this.e = c4416iT1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.l(this);
    }
}
