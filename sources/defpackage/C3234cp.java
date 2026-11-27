package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.BBandsDirectionCalculator", f = "BBandsDirectionCalculator.kt", l = {63, 88, 88}, m = "indicationBBand")
public final class C3234cp extends LM {
    public C3443dp d;
    public I10 e;
    public C3863fp.a g;
    public C4283hp h;
    public C3027bp1 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C3443dp k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3234cp(C3443dp c3443dp, LM lm) {
        super(lm);
        this.k = c3443dp;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(null, null, null, this);
    }
}
