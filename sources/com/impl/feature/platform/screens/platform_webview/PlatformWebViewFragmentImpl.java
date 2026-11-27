package com.impl.feature.platform.screens.platform_webview;

import androidx.lifecycle.v;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import defpackage.AbstractC3198cf1;
import defpackage.AbstractC4456if1;
import defpackage.C1280Je1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C3474dz0;
import defpackage.C3827ff1;
import defpackage.C5135lf1;
import defpackage.C5500nO;
import defpackage.C5558nf1;
import defpackage.Ch2;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC2297Wd1;
import defpackage.InterfaceC3770fO0;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/platform/screens/platform_webview/PlatformWebViewFragmentImpl;", "Lcom/base/feature/platform/screens/platform_webview/PlatformFragmentBase;", "Lnf1;", "FeaturePlatformImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformWebViewFragmentImpl extends PlatformFragmentBase<C5558nf1> {

    @NotNull
    public final Sd2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformWebViewFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull C3827ff1 bindingProvider, @NotNull InterfaceC2297Wd1 platformCallbacks, @NotNull C1280Je1 resourceProvider, @NotNull AbstractC3198cf1 customWebChromeClient, @NotNull AbstractC4456if1 customWebViewClient, @NotNull ReporterApi reporter, @NotNull Ch2 webViewCustomizer) {
        super(platformCallbacks, bindingProvider, resourceProvider, webViewCustomizer, customWebChromeClient, customWebViewClient, reporter);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(platformCallbacks, "platformCallbacks");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        this.t = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5500nO c5500nO = new C5500nO(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3238cq0(new C3265cz0(this, 4), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5558nf1.class), new C3474dz0(interfaceC3770fO0A, 2), new C5135lf1(interfaceC3770fO0A), c5500nO);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        return "";
    }
}
