package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.common.CommonIndicatorSelectionViewModelBase", f = "CommonIndicatorSelectionViewModelBase.kt", l = {35}, m = "getCurrentAssetName$suspendImpl")
public final class C2683aG extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2907bG e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2683aG(C2907bG c2907bG, LM lm) {
        super(lm);
        this.e = c2907bG;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return C2907bG.n(this.e, this);
    }
}
