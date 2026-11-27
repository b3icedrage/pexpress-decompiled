package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ay0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.providers.IndicatorDetailsSelectionProviderBase", f = "IndicatorDetailsSelectionProviderBase.kt", l = {20}, m = "selectIndicatorDetails")
public final class C2843ay0 extends LM {
    public GP1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3052by0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2843ay0(C3052by0 c3052by0, LM lm) {
        super(lm);
        this.g = c3052by0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
