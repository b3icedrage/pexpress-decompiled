package defpackage;

import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.base.feature.bottomsheetdialog.screens.viewpager.ViewPagerBottomSheetFragment;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;
import com.base.feature.robot.indicatorselection.screens.shared.UnlockIndicatorsBottomSheetFragment;
import com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment;
import com.base.feature.robot.instruction.screens.InstructionFragment;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet;
import com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsBottomSheetDialogFragment;
import com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment;
import com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment;
import com.base.feature.support.support.screens.common.BottomSheetSupportItemFragment;
import com.impl.feature.robot.account.AccountSelectionFragmentImpl;
import com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5000l10 implements InterfaceC5213m10 {

    @NotNull
    public final Map a;

    @NotNull
    public final LinkedHashMap b;

    public C5000l10(@NotNull Map<Class<? extends AbstractBottomSheetDialogFragment>, InterfaceC1531Mk1<AbstractBottomSheetDialogFragment>> providers) {
        Intrinsics.checkNotNullParameter(providers, "dialogFragmentsMap");
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.a = providers;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 a() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(IndicatorSelectionBottomSheetDialogFragment.class, "StrategySelection");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 b() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(IndicatorsDetailsBottomSheetDialogFragment.class, "Indicator details");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 c() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(InstructionFragment.class, "Instruction");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 d() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(IndicatorsManualConfigBottomSheetDialogFragment.class, "Indicator manual config");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 e() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(BetConfirmBottomSheetDialogFragment.class, "BetConfirmation");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 f() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(ViewPagerBottomSheetFragment.class, "ViewPagerBottomSheet");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 g() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(StrategyInstructionsBottomSheetDialogFragment.class, "StrategyInstruction");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 h() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(StopConfirmBottomSheetDialogFragment.class, "StopConfirmation");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 i() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(StrategySelectionBottomSheetDialogFragment.class, "StrategySelection");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 j() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(TimeSelectionBottomSheetFragment.class, "TimeSelections");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 k() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(AccountSelectionFragmentImpl.class, "AccountSelection");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 l() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(UnlockIndicatorsBottomSheetFragment.class, "Indicators unlock");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 m() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(ProfitLimitWithActivationBottomSheet.class, "ProfitLimitWithActivationBottomSheet");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 n() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(BottomSheetSupportItemFragment.class, "Support");
    }

    @Override // defpackage.InterfaceC5213m10
    @NotNull
    public final C2854b10 o() {
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        return p(TradingAssetsBottomSheetDialogFragmentImpl.class, "TradingAssets");
    }

    @NotNull
    public final C2854b10 p(@NotNull Class clazz, @NotNull String tag) {
        AbstractBottomSheetDialogFragment abstractBottomSheetDialogFragment;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(tag, "tag");
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(clazz, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(clazz);
            if (interfaceC1531Mk1 == null || (abstractBottomSheetDialogFragment = (AbstractBottomSheetDialogFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(clazz, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter(tag, "<set-?>");
            String canonicalName = clazz.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName);
            linkedHashMap.put(canonicalName, new C2854b10(abstractBottomSheetDialogFragment));
        }
        return (C2854b10) C4790k10.d(clazz, linkedHashMap);
    }
}
