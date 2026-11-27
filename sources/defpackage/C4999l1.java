package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.AbstractStopChecker", f = "AbstractStopChecker.kt", l = {9, 11, 13}, m = "checkShouldStop")
public final class C4999l1 extends LM {
    public AbstractC5212m1 d;
    public boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC5212m1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4999l1(AbstractC5212m1 abstractC5212m1, LM lm) {
        super(lm);
        this.h = abstractC5212m1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
