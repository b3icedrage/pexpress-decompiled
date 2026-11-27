package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.usecases.SelectIndicatorUseCaseBase", f = "SelectIndicatorUseCaseBase.kt", l = {60}, m = "isPairAvailable")
public final class C2682aF1 extends LM {
    public C3325dF1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3325dF1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2682aF1(C3325dF1 c3325dF1, LM lm) {
        super(lm);
        this.g = c3325dF1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, this);
    }
}
