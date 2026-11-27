package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.other_calculators.ClosePriceDirectionCalculator", f = "ClosePriceDirectionCalculator.kt", l = {26}, m = "calculateDirectionResult")
public final class C5047lE extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4837kE e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5047lE(C4837kE c4837kE, LM lm) {
        super(lm);
        this.e = c4837kE;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
