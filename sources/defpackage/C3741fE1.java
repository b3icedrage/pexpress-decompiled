package defpackage;

import com.api.core.BaseFragment;
import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import com.base.feature.activation.screens.common.ActivationFragment;
import com.base.feature.launchapp.screens.vpninstruction.VpnInstructionFragment;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import com.base.feature.stub.screens.stub_results.StubResultsFragment;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import com.base.feature.support.chat.screens.BaseJivoChatFragment;
import com.base.feature.support.support.screens.common.SupportFragment;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.impl.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeatImpl;
import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import com.impl.feature.platform.screens.deposit.DepositFragmentImpl;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import com.impl.feature.platform.screens.trading_history.ui.TradingHistoryFragment;
import com.impl.feature.platform.screens.verification.AccountVerificationFragmentImpl;
import com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl;
import com.impl.feature.profileandsettings.profile.ProfileFragmentImpl;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import com.impl.feature.registration.screens.duoauth.DuoAuthFragmentImpl;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl;
import com.impl.feature.webpageinapp.screens.privacypolicy.PlatformPrivacyPolicyWebViewFragmentImpl;
import com.impl.feature.webpageinapp.screens.termsandconditions.BotTermsAndConditionsFragmentImpl;
import com.impl.feature.webpageinapp.screens.termsandconditions.PlatformTermsAndConditionsWebViewFragmentImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3741fE1 implements InterfaceC3951gE1 {

    @NotNull
    public final Map a;

    @NotNull
    public final LinkedHashMap b;

    public C3741fE1(@NotNull Map providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.a = providers;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 A() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(PlatformTermsAndConditionsWebViewFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(PlatformTermsAndConditionsWebViewFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(PlatformTermsAndConditionsWebViewFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("PlatformTermsAndConditions", "<set-?>");
            baseFragment.e = "PlatformTermsAndConditions";
            String canonicalName = PlatformTermsAndConditionsWebViewFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(PlatformTermsAndConditionsWebViewFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 B() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(SettingsFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(SettingsFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(SettingsFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Settings", "<set-?>");
            baseFragment.e = "Settings";
            String canonicalName = SettingsFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(SettingsFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 C() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(AccountVerificationFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(AccountVerificationFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(AccountVerificationFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("AccountVerification", "<set-?>");
            baseFragment.e = "AccountVerification";
            String canonicalName = AccountVerificationFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 16));
        }
        return (C0667Bi0) C4790k10.d(AccountVerificationFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 D() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(WithdrawFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(WithdrawFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(WithdrawFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Withdraw", "<set-?>");
            baseFragment.e = "Withdraw";
            String canonicalName = WithdrawFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 16));
        }
        return (C0667Bi0) C4790k10.d(WithdrawFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 E() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(ActivationFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(ActivationFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(ActivationFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Activation", "<set-?>");
            baseFragment.e = "Activation";
            String canonicalName = ActivationFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(ActivationFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 a() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(RobotCommonFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(RobotCommonFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(RobotCommonFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Robot", "<set-?>");
            baseFragment.e = "Robot";
            String canonicalName = RobotCommonFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, true, 32));
        }
        return (C0667Bi0) C4790k10.d(RobotCommonFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 b() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(BotTermsAndConditionsFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(BotTermsAndConditionsFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(BotTermsAndConditionsFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("BotTermsAndConditions", "<set-?>");
            baseFragment.e = "BotTermsAndConditions";
            String canonicalName = BotTermsAndConditionsFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(BotTermsAndConditionsFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 c() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(StubOnboardingFragmentBase.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(StubOnboardingFragmentBase.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(StubOnboardingFragmentBase.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("StubOnboarding", "<set-?>");
            baseFragment.e = "StubOnboarding";
            String canonicalName = StubOnboardingFragmentBase.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(StubOnboardingFragmentBase.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 d() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(SelectHaveAccountFragmentBase.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(SelectHaveAccountFragmentBase.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(SelectHaveAccountFragmentBase.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("SelectHaveAccount", "<set-?>");
            baseFragment.e = "SelectHaveAccount";
            String canonicalName = SelectHaveAccountFragmentBase.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(SelectHaveAccountFragmentBase.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 e() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(StubResultsFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(StubResultsFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(StubResultsFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("StubResults", "<set-?>");
            baseFragment.e = "StubResults";
            String canonicalName = StubResultsFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(StubResultsFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 f() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(LaunchAppFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(LaunchAppFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(LaunchAppFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("LaunchApp", "<set-?>");
            baseFragment.e = "LaunchApp";
            String canonicalName = LaunchAppFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(LaunchAppFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 g() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(AuthorizationFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(AuthorizationFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(AuthorizationFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("RegistrationAndLogin", "<set-?>");
            baseFragment.e = "RegistrationAndLogin";
            String canonicalName = AuthorizationFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 32));
        }
        return (C0667Bi0) C4790k10.d(AuthorizationFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 h() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(SupportFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(SupportFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(SupportFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Support", "<set-?>");
            baseFragment.e = "Support";
            String canonicalName = SupportFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, true, 48));
        }
        return (C0667Bi0) C4790k10.d(SupportFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 i() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(PlatformPrivacyPolicyWebViewFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(PlatformPrivacyPolicyWebViewFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(PlatformPrivacyPolicyWebViewFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("PlatformPrivacyPolicy", "<set-?>");
            baseFragment.e = "PlatformPrivacyPolicy";
            String canonicalName = PlatformPrivacyPolicyWebViewFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(PlatformPrivacyPolicyWebViewFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 j() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(ReRegistrationFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(ReRegistrationFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(ReRegistrationFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("ReRegistration", "<set-?>");
            baseFragment.e = "ReRegistration";
            String canonicalName = ReRegistrationFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(ReRegistrationFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 k() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(PlatformFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(PlatformFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(PlatformFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Platform", "<set-?>");
            baseFragment.e = "Platform";
            String canonicalName = PlatformFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, true, 16));
        }
        return (C0667Bi0) C4790k10.d(PlatformFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 l() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(BaseJivoChatFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(BaseJivoChatFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(BaseJivoChatFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Chat", "<set-?>");
            baseFragment.e = "Chat";
            String canonicalName = BaseJivoChatFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 16));
        }
        return (C0667Bi0) C4790k10.d(BaseJivoChatFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 m() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(FullStoriesFragmentBase.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(FullStoriesFragmentBase.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(FullStoriesFragmentBase.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Stories", "<set-?>");
            baseFragment.e = "Stories";
            String canonicalName = FullStoriesFragmentBase.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(FullStoriesFragmentBase.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 n() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(AccountCommonFragmentBase.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(AccountCommonFragmentBase.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(AccountCommonFragmentBase.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Account", "<set-?>");
            baseFragment.e = "Account";
            String canonicalName = AccountCommonFragmentBase.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, true, 48));
        }
        return (C0667Bi0) C4790k10.d(AccountCommonFragmentBase.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 o() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(TradingHistoryFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(TradingHistoryFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(TradingHistoryFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("TradingHistory", "<set-?>");
            baseFragment.e = "TradingHistory";
            String canonicalName = TradingHistoryFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, true, 48));
        }
        return (C0667Bi0) C4790k10.d(TradingHistoryFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 p() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(ForgetPasswordFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(ForgetPasswordFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(ForgetPasswordFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("ForgetPassword", "<set-?>");
            baseFragment.e = "ForgetPassword";
            String canonicalName = ForgetPasswordFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 16));
        }
        return (C0667Bi0) C4790k10.d(ForgetPasswordFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 q() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(BotPrivacyPolicyFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(BotPrivacyPolicyFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(BotPrivacyPolicyFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("BotPrivacyPolicy", "<set-?>");
            baseFragment.e = "BotPrivacyPolicy";
            String canonicalName = BotPrivacyPolicyFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(BotPrivacyPolicyFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 r() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(TutorialFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(TutorialFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(TutorialFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Tutorial", "<set-?>");
            baseFragment.e = "Tutorial";
            String canonicalName = TutorialFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(TutorialFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 s() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(VpnInstructionFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(VpnInstructionFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(VpnInstructionFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("VpnInstruction", "<set-?>");
            baseFragment.e = "VpnInstruction";
            String canonicalName = VpnInstructionFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(VpnInstructionFragment.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    public final void t(@NotNull Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        LinkedHashMap linkedHashMap = this.b;
        String canonicalName = clazz.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        linkedHashMap.remove(canonicalName);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 u() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(DuoAuthFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(DuoAuthFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(DuoAuthFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("DuoAuth", "<set-?>");
            baseFragment.e = "DuoAuth";
            String canonicalName = DuoAuthFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 16));
        }
        return (C0667Bi0) C4790k10.d(DuoAuthFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 v() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(DepositFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(DepositFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(DepositFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Deposit", "<set-?>");
            baseFragment.e = "Deposit";
            String canonicalName = DepositFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 16));
        }
        return (C0667Bi0) C4790k10.d(DepositFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 w() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(ProfileFragmentImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(ProfileFragmentImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(ProfileFragmentImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("Profile", "<set-?>");
            baseFragment.e = "Profile";
            String canonicalName = ProfileFragmentImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(ProfileFragmentImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 x() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(ChangeLanguageFragmentRepeatImpl.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(ChangeLanguageFragmentRepeatImpl.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(ChangeLanguageFragmentRepeatImpl.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("ChangeLanguage", "<set-?>");
            baseFragment.e = "ChangeLanguage";
            String canonicalName = ChangeLanguageFragmentRepeatImpl.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(ChangeLanguageFragmentRepeatImpl.class, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3951gE1
    @Nullable
    public final C0667Bi0 y(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return (C0667Bi0) this.b.get(className);
    }

    @Override // defpackage.InterfaceC3951gE1
    @NotNull
    public final C0667Bi0 z() {
        BaseFragment baseFragment;
        EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
        LinkedHashMap linkedHashMap = this.b;
        if (!C0681Bn.e(StubGameFragment.class, linkedHashMap)) {
            InterfaceC1531Mk1 interfaceC1531Mk1 = (InterfaceC1531Mk1) this.a.get(StubGameFragment.class);
            if (interfaceC1531Mk1 == null || (baseFragment = (BaseFragment) interfaceC1531Mk1.get()) == null) {
                throw new IllegalStateException(C0603An.b(StubGameFragment.class, "No such fragment "));
            }
            Intrinsics.checkNotNullParameter("StubGame", "<set-?>");
            baseFragment.e = "StubGame";
            String canonicalName = StubGameFragment.class.getCanonicalName();
            linkedHashMap.put(canonicalName, Z0.b(canonicalName, baseFragment, false, 48));
        }
        return (C0667Bi0) C4790k10.d(StubGameFragment.class, linkedHashMap);
    }
}
