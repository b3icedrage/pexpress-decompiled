package defpackage;

import com.api.core.BaseFragment;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.base.feature.account.screens.balance.AccountBalancePartBase;
import com.base.feature.account.screens.logout.AccountLogoutPartBase;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.base.feature.account.screens.settings.AccountSettingsPartBase;
import com.base.feature.activation.screens.action_button.ActivationActionButtonFragment;
import com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment;
import com.base.feature.activation.screens.step_description.ActivationStepDescriptionFragment;
import com.base.feature.activation.screens.top_steps.ActivationTopStepsFragment;
import com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import com.base.feature.robot.robot.common_action.RobotCommonActionPart;
import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import com.base.feature.robot.robot.footer.screens.RobotFooterPart;
import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.base.feature.robot.robot.strategies.RobotStrategiesPart;
import com.base.feature.support.support.screens.faq.SupportFaqPartBase;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class WD1 extends XD1 {

    @NotNull
    public final List<SimpleFragmentInflate<? extends C7576xG, ? extends InterfaceC7441wd2>> A;

    @NotNull
    public final List<SimpleFragmentInflate<? extends C7576xG, ? extends InterfaceC7441wd2>> B;

    @NotNull
    public final List<SimpleFragmentInflate<? extends C7576xG, ? extends InterfaceC7441wd2>> C;

    @NotNull
    public final SimpleFragmentInflate<?, ?> c;

    @NotNull
    public final SimpleFragmentInflate<?, ?> d;

    @NotNull
    public final SimpleFragmentInflate<?, ?> e;

    @NotNull
    public final SimpleFragmentInflate<?, ?> f;

    @NotNull
    public final SimpleFragmentInflate<?, ?> g;

    @NotNull
    public final SimpleFragmentInflate<?, ?> h;

    @NotNull
    public final SimpleFragmentInflate<?, ?> i;

    @NotNull
    public final SimpleFragmentInflate<?, ?> j;

    @NotNull
    public final SimpleFragmentInflate<?, ?> k;

    @NotNull
    public final SimpleFragmentInflate<?, ?> l;

    @NotNull
    public final SimpleFragmentInflate<?, ?> m;

    @NotNull
    public final SimpleFragmentInflate<?, ?> n;

    @NotNull
    public final SimpleFragmentInflate<?, ?> o;

    @NotNull
    public final SimpleFragmentInflate<?, ?> p;

    @NotNull
    public final SimpleFragmentInflate<?, ?> q;

    @NotNull
    public final SimpleFragmentInflate<?, ?> r;

    @NotNull
    public final SimpleFragmentInflate<?, ?> s;

    @NotNull
    public final SimpleFragmentInflate<?, ?> t;

    @NotNull
    public final SimpleFragmentInflate<?, ?> u;

    @NotNull
    public final SimpleFragmentInflate<?, ?> v;

    @NotNull
    public final SimpleFragmentInflate<?, ?> w;

    @NotNull
    public final SimpleFragmentInflate<?, ?> x;

    @NotNull
    public final SimpleFragmentInflate<?, ?> y;

    @NotNull
    public final List<SimpleFragmentInflate<? extends C7576xG, ? extends InterfaceC7441wd2>> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WD1(@NotNull Map<Class<? extends BaseFragment>, InterfaceC1531Mk1<BaseFragment>> fragmentsMap) {
        BaseFragment baseFragment;
        BaseFragment baseFragment2;
        BaseFragment baseFragment3;
        BaseFragment baseFragment4;
        BaseFragment baseFragment5;
        BaseFragment baseFragment6;
        BaseFragment baseFragment7;
        BaseFragment baseFragment8;
        BaseFragment baseFragment9;
        BaseFragment baseFragment10;
        BaseFragment baseFragment11;
        BaseFragment baseFragment12;
        BaseFragment baseFragment13;
        BaseFragment baseFragment14;
        BaseFragment baseFragment15;
        BaseFragment baseFragment16;
        BaseFragment baseFragment17;
        BaseFragment baseFragment18;
        BaseFragment baseFragment19;
        BaseFragment baseFragment20;
        BaseFragment baseFragment21;
        BaseFragment baseFragment22;
        BaseFragment baseFragment23;
        super(fragmentsMap);
        Intrinsics.checkNotNullParameter(fragmentsMap, "fragmentsMap");
        if (!C0681Bn.e(ActivationTopStepsFragment.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk1 = fragmentsMap.get(ActivationTopStepsFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment23 = interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(ActivationTopStepsFragment.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap = this.b;
            String canonicalName = ActivationTopStepsFragment.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName);
            linkedHashMap.put(canonicalName, (SimpleFragmentInflate) baseFragment23);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate = (SimpleFragmentInflate) C4790k10.d(ActivationTopStepsFragment.class, this.b);
        this.c = simpleFragmentInflate;
        if (!C0681Bn.e(ActivationBigStoriesFragment.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk2 = fragmentsMap.get(ActivationBigStoriesFragment.class);
            if (interfaceC1531Mk2 == null || (baseFragment22 = interfaceC1531Mk2.get()) == null) {
                throw new IllegalStateException(C0603An.b(ActivationBigStoriesFragment.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap2 = this.b;
            String canonicalName2 = ActivationBigStoriesFragment.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName2);
            linkedHashMap2.put(canonicalName2, (SimpleFragmentInflate) baseFragment22);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate2 = (SimpleFragmentInflate) C4790k10.d(ActivationBigStoriesFragment.class, this.b);
        this.d = simpleFragmentInflate2;
        if (!C0681Bn.e(ActivationStepDescriptionFragment.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk3 = fragmentsMap.get(ActivationStepDescriptionFragment.class);
            if (interfaceC1531Mk3 == null || (baseFragment21 = interfaceC1531Mk3.get()) == null) {
                throw new IllegalStateException(C0603An.b(ActivationStepDescriptionFragment.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap3 = this.b;
            String canonicalName3 = ActivationStepDescriptionFragment.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName3);
            linkedHashMap3.put(canonicalName3, (SimpleFragmentInflate) baseFragment21);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate3 = (SimpleFragmentInflate) C4790k10.d(ActivationStepDescriptionFragment.class, this.b);
        this.e = simpleFragmentInflate3;
        if (!C0681Bn.e(ActivationActionButtonFragment.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk4 = fragmentsMap.get(ActivationActionButtonFragment.class);
            if (interfaceC1531Mk4 == null || (baseFragment20 = interfaceC1531Mk4.get()) == null) {
                throw new IllegalStateException(C0603An.b(ActivationActionButtonFragment.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap4 = this.b;
            String canonicalName4 = ActivationActionButtonFragment.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName4);
            linkedHashMap4.put(canonicalName4, (SimpleFragmentInflate) baseFragment20);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate4 = (SimpleFragmentInflate) C4790k10.d(ActivationActionButtonFragment.class, this.b);
        this.f = simpleFragmentInflate4;
        if (!C0681Bn.e(RobotAccountSelectionPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk5 = fragmentsMap.get(RobotAccountSelectionPart.class);
            if (interfaceC1531Mk5 == null || (baseFragment19 = interfaceC1531Mk5.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotAccountSelectionPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap5 = this.b;
            String canonicalName5 = RobotAccountSelectionPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName5);
            linkedHashMap5.put(canonicalName5, (SimpleFragmentInflate) baseFragment19);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate5 = (SimpleFragmentInflate) C4790k10.d(RobotAccountSelectionPart.class, this.b);
        this.g = simpleFragmentInflate5;
        if (!C0681Bn.e(RobotRealAccountActivationPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk6 = fragmentsMap.get(RobotRealAccountActivationPart.class);
            if (interfaceC1531Mk6 == null || (baseFragment18 = interfaceC1531Mk6.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotRealAccountActivationPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap6 = this.b;
            String canonicalName6 = RobotRealAccountActivationPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName6);
            linkedHashMap6.put(canonicalName6, (SimpleFragmentInflate) baseFragment18);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate6 = (SimpleFragmentInflate) C4790k10.d(RobotRealAccountActivationPart.class, this.b);
        this.h = simpleFragmentInflate6;
        if (!C0681Bn.e(RobotFooterPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk7 = fragmentsMap.get(RobotFooterPart.class);
            if (interfaceC1531Mk7 == null || (baseFragment17 = interfaceC1531Mk7.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotFooterPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap7 = this.b;
            String canonicalName7 = RobotFooterPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName7);
            linkedHashMap7.put(canonicalName7, (SimpleFragmentInflate) baseFragment17);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate7 = (SimpleFragmentInflate) C4790k10.d(RobotFooterPart.class, this.b);
        this.i = simpleFragmentInflate7;
        if (!C0681Bn.e(RobotCommonActionPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk8 = fragmentsMap.get(RobotCommonActionPart.class);
            if (interfaceC1531Mk8 == null || (baseFragment16 = interfaceC1531Mk8.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotCommonActionPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap8 = this.b;
            String canonicalName8 = RobotCommonActionPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName8);
            linkedHashMap8.put(canonicalName8, (SimpleFragmentInflate) baseFragment16);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate8 = (SimpleFragmentInflate) C4790k10.d(RobotCommonActionPart.class, this.b);
        this.j = simpleFragmentInflate8;
        if (!C0681Bn.e(RobotInvestmentPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk9 = fragmentsMap.get(RobotInvestmentPart.class);
            if (interfaceC1531Mk9 == null || (baseFragment15 = interfaceC1531Mk9.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotInvestmentPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap9 = this.b;
            String canonicalName9 = RobotInvestmentPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName9);
            linkedHashMap9.put(canonicalName9, (SimpleFragmentInflate) baseFragment15);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate9 = (SimpleFragmentInflate) C4790k10.d(RobotInvestmentPart.class, this.b);
        this.k = simpleFragmentInflate9;
        if (!C0681Bn.e(RobotOptionsPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk10 = fragmentsMap.get(RobotOptionsPart.class);
            if (interfaceC1531Mk10 == null || (baseFragment14 = interfaceC1531Mk10.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotOptionsPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap10 = this.b;
            String canonicalName10 = RobotOptionsPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName10);
            linkedHashMap10.put(canonicalName10, (SimpleFragmentInflate) baseFragment14);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate10 = (SimpleFragmentInflate) C4790k10.d(RobotOptionsPart.class, this.b);
        this.l = simpleFragmentInflate10;
        if (!C0681Bn.e(RobotRiskManagementPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk11 = fragmentsMap.get(RobotRiskManagementPart.class);
            if (interfaceC1531Mk11 == null || (baseFragment13 = interfaceC1531Mk11.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotRiskManagementPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap11 = this.b;
            String canonicalName11 = RobotRiskManagementPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName11);
            linkedHashMap11.put(canonicalName11, (SimpleFragmentInflate) baseFragment13);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate11 = (SimpleFragmentInflate) C4790k10.d(RobotRiskManagementPart.class, this.b);
        this.m = simpleFragmentInflate11;
        if (!C0681Bn.e(RobotAssetSelectionPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk12 = fragmentsMap.get(RobotAssetSelectionPart.class);
            if (interfaceC1531Mk12 == null || (baseFragment12 = interfaceC1531Mk12.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotAssetSelectionPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap12 = this.b;
            String canonicalName12 = RobotAssetSelectionPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName12);
            linkedHashMap12.put(canonicalName12, (SimpleFragmentInflate) baseFragment12);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate12 = (SimpleFragmentInflate) C4790k10.d(RobotAssetSelectionPart.class, this.b);
        this.n = simpleFragmentInflate12;
        if (!C0681Bn.e(RobotStrategiesPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk13 = fragmentsMap.get(RobotStrategiesPart.class);
            if (interfaceC1531Mk13 == null || (baseFragment11 = interfaceC1531Mk13.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotStrategiesPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap13 = this.b;
            String canonicalName13 = RobotStrategiesPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName13);
            linkedHashMap13.put(canonicalName13, (SimpleFragmentInflate) baseFragment11);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate13 = (SimpleFragmentInflate) C4790k10.d(RobotStrategiesPart.class, this.b);
        this.o = simpleFragmentInflate13;
        if (!C0681Bn.e(RobotDoubleStrategiesPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk14 = fragmentsMap.get(RobotDoubleStrategiesPart.class);
            if (interfaceC1531Mk14 == null || (baseFragment10 = interfaceC1531Mk14.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotDoubleStrategiesPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap14 = this.b;
            String canonicalName14 = RobotDoubleStrategiesPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName14);
            linkedHashMap14.put(canonicalName14, (SimpleFragmentInflate) baseFragment10);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate14 = (SimpleFragmentInflate) C4790k10.d(RobotDoubleStrategiesPart.class, this.b);
        this.p = simpleFragmentInflate14;
        if (!C0681Bn.e(RobotIndicatorPart.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk15 = fragmentsMap.get(RobotIndicatorPart.class);
            if (interfaceC1531Mk15 == null || (baseFragment9 = interfaceC1531Mk15.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotIndicatorPart.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap15 = this.b;
            String canonicalName15 = RobotIndicatorPart.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName15);
            linkedHashMap15.put(canonicalName15, (SimpleFragmentInflate) baseFragment9);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate15 = (SimpleFragmentInflate) C4790k10.d(RobotIndicatorPart.class, this.b);
        this.q = simpleFragmentInflate15;
        if (!C0681Bn.e(SupportNeedHelpPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk16 = fragmentsMap.get(SupportNeedHelpPartBase.class);
            if (interfaceC1531Mk16 == null || (baseFragment8 = interfaceC1531Mk16.get()) == null) {
                throw new IllegalStateException(C0603An.b(SupportNeedHelpPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap16 = this.b;
            String canonicalName16 = SupportNeedHelpPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName16);
            linkedHashMap16.put(canonicalName16, (SimpleFragmentInflate) baseFragment8);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate16 = (SimpleFragmentInflate) C4790k10.d(SupportNeedHelpPartBase.class, this.b);
        this.r = simpleFragmentInflate16;
        if (!C0681Bn.e(SupportFaqPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk17 = fragmentsMap.get(SupportFaqPartBase.class);
            if (interfaceC1531Mk17 == null || (baseFragment7 = interfaceC1531Mk17.get()) == null) {
                throw new IllegalStateException(C0603An.b(SupportFaqPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap17 = this.b;
            String canonicalName17 = SupportFaqPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName17);
            linkedHashMap17.put(canonicalName17, (SimpleFragmentInflate) baseFragment7);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate17 = (SimpleFragmentInflate) C4790k10.d(SupportFaqPartBase.class, this.b);
        this.s = simpleFragmentInflate17;
        if (!C0681Bn.e(SupportPopularQuestionsPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk18 = fragmentsMap.get(SupportPopularQuestionsPartBase.class);
            if (interfaceC1531Mk18 == null || (baseFragment6 = interfaceC1531Mk18.get()) == null) {
                throw new IllegalStateException(C0603An.b(SupportPopularQuestionsPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap18 = this.b;
            String canonicalName18 = SupportPopularQuestionsPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName18);
            linkedHashMap18.put(canonicalName18, (SimpleFragmentInflate) baseFragment6);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate18 = (SimpleFragmentInflate) C4790k10.d(SupportPopularQuestionsPartBase.class, this.b);
        this.t = simpleFragmentInflate18;
        if (!C0681Bn.e(SupportIssueCategoriesPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk19 = fragmentsMap.get(SupportIssueCategoriesPartBase.class);
            if (interfaceC1531Mk19 == null || (baseFragment5 = interfaceC1531Mk19.get()) == null) {
                throw new IllegalStateException(C0603An.b(SupportIssueCategoriesPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap19 = this.b;
            String canonicalName19 = SupportIssueCategoriesPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName19);
            linkedHashMap19.put(canonicalName19, (SimpleFragmentInflate) baseFragment5);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate19 = (SimpleFragmentInflate) C4790k10.d(SupportIssueCategoriesPartBase.class, this.b);
        this.u = simpleFragmentInflate19;
        if (!C0681Bn.e(AccountMainInfoPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk20 = fragmentsMap.get(AccountMainInfoPartBase.class);
            if (interfaceC1531Mk20 == null || (baseFragment4 = interfaceC1531Mk20.get()) == null) {
                throw new IllegalStateException(C0603An.b(AccountMainInfoPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap20 = this.b;
            String canonicalName20 = AccountMainInfoPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName20);
            linkedHashMap20.put(canonicalName20, (SimpleFragmentInflate) baseFragment4);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate20 = (SimpleFragmentInflate) C4790k10.d(AccountMainInfoPartBase.class, this.b);
        this.v = simpleFragmentInflate20;
        if (!C0681Bn.e(AccountBalancePartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk21 = fragmentsMap.get(AccountBalancePartBase.class);
            if (interfaceC1531Mk21 == null || (baseFragment3 = interfaceC1531Mk21.get()) == null) {
                throw new IllegalStateException(C0603An.b(AccountBalancePartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap21 = this.b;
            String canonicalName21 = AccountBalancePartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName21);
            linkedHashMap21.put(canonicalName21, (SimpleFragmentInflate) baseFragment3);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate21 = (SimpleFragmentInflate) C4790k10.d(AccountBalancePartBase.class, this.b);
        this.w = simpleFragmentInflate21;
        if (!C0681Bn.e(AccountSettingsPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk22 = fragmentsMap.get(AccountSettingsPartBase.class);
            if (interfaceC1531Mk22 == null || (baseFragment2 = interfaceC1531Mk22.get()) == null) {
                throw new IllegalStateException(C0603An.b(AccountSettingsPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap22 = this.b;
            String canonicalName22 = AccountSettingsPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName22);
            linkedHashMap22.put(canonicalName22, (SimpleFragmentInflate) baseFragment2);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate22 = (SimpleFragmentInflate) C4790k10.d(AccountSettingsPartBase.class, this.b);
        this.x = simpleFragmentInflate22;
        if (!C0681Bn.e(AccountLogoutPartBase.class, this.b)) {
            InterfaceC1531Mk1<BaseFragment> interfaceC1531Mk23 = fragmentsMap.get(AccountLogoutPartBase.class);
            if (interfaceC1531Mk23 == null || (baseFragment = interfaceC1531Mk23.get()) == null) {
                throw new IllegalStateException(C0603An.b(AccountLogoutPartBase.class, "No such fragment "));
            }
            LinkedHashMap linkedHashMap23 = this.b;
            String canonicalName23 = AccountLogoutPartBase.class.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName23);
            linkedHashMap23.put(canonicalName23, (SimpleFragmentInflate) baseFragment);
        }
        SimpleFragmentInflate<?, ?> simpleFragmentInflate23 = (SimpleFragmentInflate) C4790k10.d(AccountLogoutPartBase.class, this.b);
        this.y = simpleFragmentInflate23;
        this.z = WE.f(simpleFragmentInflate, simpleFragmentInflate2, simpleFragmentInflate3, simpleFragmentInflate4);
        this.A = WE.f(simpleFragmentInflate5, simpleFragmentInflate6, simpleFragmentInflate7, simpleFragmentInflate8, simpleFragmentInflate9, simpleFragmentInflate10, simpleFragmentInflate11, simpleFragmentInflate12, simpleFragmentInflate13, simpleFragmentInflate14, simpleFragmentInflate15);
        this.B = WE.f(simpleFragmentInflate16, simpleFragmentInflate17, simpleFragmentInflate18, simpleFragmentInflate19);
        this.C = WE.f(simpleFragmentInflate20, simpleFragmentInflate21, simpleFragmentInflate22, simpleFragmentInflate23);
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> a() {
        return this.o;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> b() {
        return this.l;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> c() {
        return this.t;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> d() {
        return this.n;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> e() {
        return this.s;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> f() {
        return this.j;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> g() {
        return this.r;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> h() {
        return this.v;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> i() {
        return this.k;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> j() {
        return this.i;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> k() {
        return this.h;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> l() {
        return this.u;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> m() {
        return this.m;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> n() {
        return this.w;
    }

    @Override // defpackage.YD1
    public final void o(@NotNull YD1.a partsType) {
        List<SimpleFragmentInflate<? extends C7576xG, ? extends InterfaceC7441wd2>> list;
        Intrinsics.checkNotNullParameter(partsType, "partsType");
        int iOrdinal = partsType.ordinal();
        if (iOrdinal == 0) {
            list = this.z;
        } else if (iOrdinal == 1) {
            list = this.A;
        } else if (iOrdinal == 2) {
            list = this.C;
        } else {
            if (iOrdinal != 3) {
                throw new C6489s51();
            }
            list = this.B;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Class<?> clazz = ((SimpleFragmentInflate) it.next()).getClass();
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            LinkedHashMap linkedHashMap = this.b;
            String canonicalName = clazz.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName);
            linkedHashMap.remove(canonicalName);
        }
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> p() {
        return this.x;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> q() {
        return this.c;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> r() {
        return this.q;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> s() {
        return this.g;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> t() {
        return this.d;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> u() {
        return this.p;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> v() {
        return this.f;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> w() {
        return this.y;
    }

    @Override // defpackage.YD1
    @NotNull
    public final SimpleFragmentInflate<?, ?> x() {
        return this.e;
    }
}
