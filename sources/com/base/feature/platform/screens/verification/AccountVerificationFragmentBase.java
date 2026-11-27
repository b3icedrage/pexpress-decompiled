package com.base.feature.platform.screens.verification;

import android.os.Bundle;
import android.view.View;
import com.api.feature.webpage.screen.SimpleWebViewFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC3288d5;
import defpackage.AbstractC3917g5;
import defpackage.AbstractC5341md2;
import defpackage.C1952Ru;
import defpackage.C2778ai2;
import defpackage.C3286d41;
import defpackage.C3296d7;
import defpackage.C4805k5;
import defpackage.C5189lv;
import defpackage.Ch2;
import defpackage.H4;
import defpackage.InterfaceC2773ah1;
import defpackage.N4;
import defpackage.O4;
import defpackage.P4;
import defpackage.Q4;
import defpackage.Sd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/platform/screens/verification/AccountVerificationFragmentBase;", "Ld5;", "VM", "Lcom/api/feature/webpage/screen/SimpleWebViewFragment;", "FeaturePlatformBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AccountVerificationFragmentBase<VM extends AbstractC3288d5> extends SimpleWebViewFragment<VM> {

    @NotNull
    public final H4 q;

    @NotNull
    public final C4805k5 r;

    @NotNull
    public final InterfaceC2773ah1 s;

    @NotNull
    public final AbstractC5341md2 t;
    public final boolean u;

    @NotNull
    public final C2778ai2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerificationFragmentBase(@NotNull Sd2 viewModelFactory, @NotNull H4 bindingProvider, @NotNull C4805k5 accountVerificationWebViewClient, @NotNull AbstractC3917g5 accountVerificationWebChromeClientApi, @NotNull Ch2 webViewCustomizer, @NotNull C3296d7 onBackPressedProvider, @NotNull C1952Ru geolocationPermissionUseCaseApi, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull AbstractC5341md2 verificationOpenCounterUseCase) {
        super(viewModelFactory, bindingProvider, accountVerificationWebChromeClientApi, accountVerificationWebViewClient, webViewCustomizer);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(accountVerificationWebViewClient, "accountVerificationWebViewClient");
        Intrinsics.checkNotNullParameter(accountVerificationWebChromeClientApi, "accountVerificationWebChromeClientApi");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        Intrinsics.checkNotNullParameter(geolocationPermissionUseCaseApi, "geolocationPermissionUseCaseApi");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(verificationOpenCounterUseCase, "verificationOpenCounterUseCase");
        this.q = bindingProvider;
        this.r = accountVerificationWebViewClient;
        this.s = preloadedWebViewUseCase;
        this.t = verificationOpenCounterUseCase;
        this.u = true;
        this.v = new C2778ai2(onBackPressedProvider, new O4(this, 0), new P4(this, 0));
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void d() {
        this.v.a();
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void f() {
        C2778ai2 c2778ai2 = this.v;
        c2778ai2.a.a = c2778ai2.d;
    }

    @Override // com.api.core.BindingFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.r.f = null;
        this.v.a();
        super.onDestroyView();
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C5189lv.k(C3286d41.a, null, new Q4(this, null), 3);
        N4 onDoneVerification = new N4(this, 0);
        C4805k5 c4805k5 = this.r;
        c4805k5.getClass();
        Intrinsics.checkNotNullParameter(onDoneVerification, "onDoneVerification");
        c4805k5.f = onDoneVerification;
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getU() {
        return this.u;
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment
    @NotNull
    public final String x() {
        String string = getString(R.string.verification_account_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
