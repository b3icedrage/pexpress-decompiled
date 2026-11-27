package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.usecases.StubGameInteractorBase", f = "StubGameInteractorBase.kt", l = {71, 72}, m = "makeCall")
public final class C4206hT1 extends LM {
    public C3996gT1 d;
    public H32.a e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C3996gT1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4206hT1(C3996gT1 c3996gT1, LM lm) {
        super(lm);
        this.i = c3996gT1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, 0.0d, this);
    }
}
