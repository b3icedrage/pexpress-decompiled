package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {1468, 1470}, m = "getUserBalanceByActivationStatus")
public final class C4324i12 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ S02<H32> e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4324i12(S02 s02, LM lm) {
        super(lm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.e.q(false, this);
    }
}
