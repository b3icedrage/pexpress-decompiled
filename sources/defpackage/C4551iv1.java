package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionViewModelBase", f = "RobotAssetSelectionViewModelBase.kt", l = {53}, m = "assetModelOf")
public final class C4551iv1 extends LM {
    public C3279d22 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5191lv1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4551iv1(C5191lv1 c5191lv1, LM lm) {
        super(lm);
        this.g = c5191lv1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C5191lv1.l(this.g, null, this);
    }
}
