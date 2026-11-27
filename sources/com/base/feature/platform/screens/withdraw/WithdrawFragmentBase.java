package com.base.feature.platform.screens.withdraw;

import com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi;
import com.pexpress.tool.R;
import defpackage.Bj2;
import defpackage.Ch2;
import defpackage.InterfaceC2773ah1;
import defpackage.Jj2;
import defpackage.Mj2;
import defpackage.Oj2;
import defpackage.Sd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/platform/screens/withdraw/WithdrawFragmentBase;", "LJj2;", "VM", "Lcom/api/feature/platform/screens/common/CommonNavigateToVerificationFragmentApi;", "FeaturePlatformBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WithdrawFragmentBase<VM extends Jj2> extends CommonNavigateToVerificationFragmentApi<VM> {

    @NotNull
    public final InterfaceC2773ah1 t;
    public final boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawFragmentBase(@NotNull Sd2 viewModelFactory, @NotNull Bj2 bindingProvider, @NotNull Mj2 customWebChromeClient, @NotNull Oj2 customWebViewClient, @NotNull Ch2 webViewCustomizer, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase) {
        super(bindingProvider, customWebChromeClient, customWebViewClient, viewModelFactory, webViewCustomizer);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        this.t = preloadedWebViewUseCase;
        this.u = true;
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getU() {
        return this.u;
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment
    @NotNull
    public final String x() {
        String string = requireContext().getString(R.string.withdraw_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
