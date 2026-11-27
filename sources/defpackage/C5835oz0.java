package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5835oz0 implements G32 {

    @NotNull
    public final C2533Yv1 a;

    @NotNull
    public final KW1 b;

    public C5835oz0(@NotNull C2533Yv1 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = binding;
        this.b = XO0.b(new C5560ng(this, 4));
        a();
    }

    @Override // defpackage.G32
    public final void a() {
        C2533Yv1 c2533Yv1 = this.a;
        ConstraintLayout robotCurrentInvestmentItemContainer = c2533Yv1.u;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentItemContainer, "robotCurrentInvestmentItemContainer");
        robotCurrentInvestmentItemContainer.setVisibility(8);
        LinearLayout robotCurrentInvestmentLinearItemContainer = c2533Yv1.w;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearItemContainer, "robotCurrentInvestmentLinearItemContainer");
        robotCurrentInvestmentLinearItemContainer.setVisibility(0);
        for (View view : (List) this.b.getValue()) {
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
        }
        ConstraintLayout constraintLayout = ((C5084lQ0) d()).a.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(8);
        View robotCurrentInvestmentLinearLossItemSeparator = c2533Yv1.y;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearLossItemSeparator, "robotCurrentInvestmentLinearLossItemSeparator");
        robotCurrentInvestmentLinearLossItemSeparator.setVisibility(8);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 b() {
        C2611Zv1 robotCurrentInvestmentLinearAmountItem = this.a.v;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearAmountItem, "robotCurrentInvestmentLinearAmountItem");
        return new C5084lQ0(robotCurrentInvestmentLinearAmountItem);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 c() {
        C2611Zv1 robotCurrentInvestmentLinearProfitItem = this.a.z;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearProfitItem, "robotCurrentInvestmentLinearProfitItem");
        return new C5084lQ0(robotCurrentInvestmentLinearProfitItem);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 d() {
        C2611Zv1 robotCurrentInvestmentLinearLossItem = this.a.x;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearLossItem, "robotCurrentInvestmentLinearLossItem");
        return new C5084lQ0(robotCurrentInvestmentLinearLossItem);
    }

    @Override // defpackage.G32
    @NotNull
    public final F32 e() {
        C2611Zv1 robotCurrentInvestmentLinearStrategyItem = this.a.B;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentLinearStrategyItem, "robotCurrentInvestmentLinearStrategyItem");
        return new C5084lQ0(robotCurrentInvestmentLinearStrategyItem);
    }
}
