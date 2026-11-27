package com.impl.feature.registration.screens.authorization;

import androidx.lifecycle.v;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import defpackage.C1907Rf;
import defpackage.C2017Sp1;
import defpackage.C2084Tm;
import defpackage.C2151Ui0;
import defpackage.C3296d7;
import defpackage.C5289mN1;
import defpackage.C6423rm;
import defpackage.C7113v4;
import defpackage.C7178vN1;
import defpackage.C7323w4;
import defpackage.C7534x4;
import defpackage.C7599xN1;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC1455Ll;
import defpackage.InterfaceC3728fA0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6843tm;
import defpackage.InterfaceC8112zo0;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC6214qm;
import defpackage.ViewOnClickListenerC6903u4;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/registration/screens/authorization/AuthorizationFragmentImpl;", "Lcom/base/feature/registration/screens/authorization/AuthorizationFragmentBase;", "LTm;", "FeatureRegistrationImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthorizationFragmentImpl extends AuthorizationFragmentBase<C2084Tm> {

    @NotNull
    public final Sd2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC1455Ll bindingProvider, @NotNull InterfaceC6843tm resourceProvider, @NotNull C7178vN1 socialLoginWithWebView, @NotNull C7599xN1 socialRegisterWithWebView, @NotNull C5289mN1 socialLoginLoadingUseCase, @NotNull C3296d7 activityOnBackPressedProvider, @NotNull InterfaceC3728fA0 initializeCurrenciesGroupViewUseCase, @NotNull InterfaceC8112zo0 highlightedAgreementProvider) {
        super(bindingProvider, resourceProvider, socialLoginWithWebView, socialRegisterWithWebView, socialLoginLoadingUseCase, activityOnBackPressedProvider, initializeCurrenciesGroupViewUseCase, highlightedAgreementProvider);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(socialLoginWithWebView, "socialLoginWithWebView");
        Intrinsics.checkNotNullParameter(socialRegisterWithWebView, "socialRegisterWithWebView");
        Intrinsics.checkNotNullParameter(socialLoginLoadingUseCase, "socialLoginLoadingUseCase");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        Intrinsics.checkNotNullParameter(initializeCurrenciesGroupViewUseCase, "initializeCurrenciesGroupViewUseCase");
        Intrinsics.checkNotNullParameter(highlightedAgreementProvider, "highlightedAgreementProvider");
        this.u = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1907Rf c1907Rf = new C1907Rf(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7323w4(new C7113v4(this, 1), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C2084Tm.class), new C7534x4(interfaceC3770fO0A, 1), new C6423rm(interfaceC3770fO0A), c1907Rf);
    }

    @Override // com.base.feature.registration.screens.authorization.AuthorizationFragmentBase, com.api.library.registration.screens.email.EmailFieldFragment
    public final void n() {
        super.n();
        InterfaceC1455Ll interfaceC1455Ll = this.n;
        interfaceC1455Ll.P().setOnClickListener(new ViewOnClickListenerC6214qm(this, 0));
        interfaceC1455Ll.Z().setOnClickListener(new ViewOnClickListenerC6903u4(this, 1));
    }
}
