package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.providers.impl.DepositValuesProviderBase", f = "DepositValuesProviderBase.kt", l = {33}, m = "getRecommendedDeposit")
public final class C3799fY extends LM {
    public C4009gY d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4009gY g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3799fY(C4009gY c4009gY, LM lm) {
        super(lm);
        this.g = c4009gY;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
