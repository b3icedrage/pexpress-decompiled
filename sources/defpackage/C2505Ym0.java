package defpackage;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ym0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2505Ym0 implements G32 {

    @NotNull
    public final C2533Yv1 a;

    public C2505Ym0(@NotNull C2533Yv1 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = binding;
        a();
    }

    @Override // defpackage.G32
    public final void a() {
        C2533Yv1 c2533Yv1 = this.a;
        ConstraintLayout robotCurrentInvestmentItemContainer = c2533Yv1.u;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentItemContainer, "robotCurrentInvestmentItemContainer");
        robotCurrentInvestmentItemContainer.setVisibility(0);
        LinearLayout robotCurrentInvestmentLinearItemContainer = c2533Yv1.w;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearItemContainer, "robotCurrentInvestmentLinearItemContainer");
        robotCurrentInvestmentLinearItemContainer.setVisibility(8);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 b() {
        C2838aw1 robotCurrentInvestmentAmountItem = this.a.t;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentAmountItem, "robotCurrentInvestmentAmountItem");
        return new C2427Xm0(robotCurrentInvestmentAmountItem);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 c() {
        C2838aw1 robotCurrentInvestmentProfitItem = this.a.E;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentProfitItem, "robotCurrentInvestmentProfitItem");
        return new C2427Xm0(robotCurrentInvestmentProfitItem);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 d() {
        C2838aw1 robotCurrentInvestmentLossLimit = this.a.D;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLossLimit, "robotCurrentInvestmentLossLimit");
        return new C2427Xm0(robotCurrentInvestmentLossLimit);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 e() {
        C2838aw1 robotCurrentInvestmentStrategyTopRightPlacedItem = this.a.F;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentStrategyTopRightPlacedItem, "robotCurrentInvestmentStrategyTopRightPlacedItem");
        return new C2427Xm0(robotCurrentInvestmentStrategyTopRightPlacedItem);
    }
}
