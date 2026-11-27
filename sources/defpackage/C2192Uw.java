package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.CCIDirectionCalculator", f = "CCIDirectionCalculator.kt", l = {47, 48, 52}, m = "calculateDirectionResult")
public final class C2192Uw extends LM {
    public C2352Ww d;
    public I10 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2352Ww h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192Uw(C2352Ww c2352Ww, LM lm) {
        super(lm);
        this.h = c2352Ww;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
