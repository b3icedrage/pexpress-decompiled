package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.usecases.AmountValueUseCaseBase", f = "AmountValueUseCaseBase.kt", l = {37, 39, RequestError.NETWORK_FAILURE, 43}, m = "onAmountChanged")
public final class X9 extends LM {
    public V9 d;
    public String e;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ V9 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(V9 v9, LM lm) {
        super(lm);
        this.i = v9;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, this);
    }
}
