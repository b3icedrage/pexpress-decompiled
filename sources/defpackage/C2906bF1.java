package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.usecases.SelectIndicatorUseCaseBase", f = "SelectIndicatorUseCaseBase.kt", l = {36, 37, 46, 49, RequestError.RESPONSE_CODE_FAILURE, 54, 55}, m = "selectIndicator")
public final class C2906bF1 extends LM {
    public C3325dF1 d;
    public C1491Lx0 e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C3325dF1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2906bF1(C3325dF1 c3325dF1, LM lm) {
        super(lm);
        this.i = c3325dF1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, false, this);
    }
}
