package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ly0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorManualConfigProvider", f = "IndicatorManualConfigProvider.kt", l = {30, 31}, m = "saveParams")
public final class C5202ly0 extends LM {
    public InterfaceC7722xy0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5412my0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5202ly0(C5412my0 c5412my0, LM lm) {
        super(lm);
        this.g = c5412my0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
