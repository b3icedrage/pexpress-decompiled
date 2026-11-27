package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.usecases.SelectIndicatorUseCaseBase", f = "SelectIndicatorUseCaseBase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "indicatorWasChanged")
public final class ZE1 extends LM {
    public C1491Lx0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3325dF1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZE1(C3325dF1 c3325dF1, LM lm) {
        super(lm);
        this.g = c3325dF1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
