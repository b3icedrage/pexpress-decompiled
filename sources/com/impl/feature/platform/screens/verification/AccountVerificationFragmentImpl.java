package com.impl.feature.platform.screens.verification;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.v;
import com.base.feature.platform.screens.verification.AccountVerificationFragmentBase;
import defpackage.AW1;
import defpackage.AbstractC3917g5;
import defpackage.AbstractC5341md2;
import defpackage.C1795Pt1;
import defpackage.C1952Ru;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3286d41;
import defpackage.C3296d7;
import defpackage.C3497e5;
import defpackage.C4805k5;
import defpackage.C5189lv;
import defpackage.Ch2;
import defpackage.EnumC4403iP0;
import defpackage.H4;
import defpackage.I4;
import defpackage.InterfaceC2228Vi;
import defpackage.InterfaceC2773ah1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.Pa2;
import defpackage.R4;
import defpackage.S4;
import defpackage.Sd2;
import defpackage.T4;
import defpackage.U4;
import defpackage.V4;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/platform/screens/verification/AccountVerificationFragmentImpl;", "Lcom/base/feature/platform/screens/verification/AccountVerificationFragmentBase;", "Le5;", "FeaturePlatformImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountVerificationFragmentImpl extends AccountVerificationFragmentBase<C3497e5> {

    @NotNull
    public final Pa2 w;

    @NotNull
    public final Sd2 x;

    @NotNull
    public final H4 y;

    @NotNull
    public final InterfaceC2228Vi z;

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.verification.AccountVerificationFragmentImpl$onViewCreated$1", f = "AccountVerificationFragmentImpl.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AccountVerificationFragmentImpl.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AccountVerificationFragmentImpl accountVerificationFragmentImpl = AccountVerificationFragmentImpl.this;
                WebView webView = ((I4) accountVerificationFragmentImpl.y).j;
                if (webView != null) {
                    this.d = 1;
                    if (accountVerificationFragmentImpl.z.a(webView, this) == mn) {
                        return mn;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerificationFragmentImpl(@NotNull Pa2 urlsProvider, @NotNull Sd2 viewModelFactory, @NotNull H4 bindingProvider, @NotNull C4805k5 accountVerificationWebViewClient, @NotNull AbstractC3917g5 accountVerificationWebChromeClientApi, @NotNull Ch2 webViewCustomizer, @NotNull C3296d7 onBackPressedProvider, @NotNull InterfaceC2228Vi applyVerificationScriptUseCaseImpl, @NotNull C1952Ru geolocationPermissionUseCaseApi, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull AbstractC5341md2 verificationOpenCounterUseCase) {
        super(viewModelFactory, bindingProvider, accountVerificationWebViewClient, accountVerificationWebChromeClientApi, webViewCustomizer, onBackPressedProvider, geolocationPermissionUseCaseApi, preloadedWebViewUseCase, verificationOpenCounterUseCase);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(accountVerificationWebViewClient, "accountVerificationWebViewClient");
        Intrinsics.checkNotNullParameter(accountVerificationWebChromeClientApi, "accountVerificationWebChromeClientApi");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        Intrinsics.checkNotNullParameter(applyVerificationScriptUseCaseImpl, "applyVerificationScriptUseCaseImpl");
        Intrinsics.checkNotNullParameter(geolocationPermissionUseCaseApi, "geolocationPermissionUseCaseApi");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(verificationOpenCounterUseCase, "verificationOpenCounterUseCase");
        this.w = urlsProvider;
        this.x = viewModelFactory;
        this.y = bindingProvider;
        this.z = applyVerificationScriptUseCaseImpl;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        R4 r4 = new R4(this, 0);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new T4(new S4(this, 0), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(C3497e5.class), new U4(interfaceC3770fO0A, 0), new V4(interfaceC3770fO0A), r4);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String n() {
        return this.w.i();
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        return this.w.y();
    }

    @Override // com.base.feature.platform.screens.verification.AccountVerificationFragmentBase, com.api.feature.webpage.screen.SimpleWebViewFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }
}
