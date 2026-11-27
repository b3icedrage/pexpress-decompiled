package com.api.feature.platform.screens.common;

import android.os.Bundle;
import android.view.View;
import com.api.feature.webpage.screen.SimpleWebViewFragment;
import defpackage.AbstractC3745fG;
import defpackage.AbstractC4165hG;
import defpackage.C1523Mi;
import defpackage.C1621Nn1;
import defpackage.C2778ai2;
import defpackage.C3296d7;
import defpackage.C3535eG;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.Ch2;
import defpackage.FP0;
import defpackage.InterfaceC6965uM1;
import defpackage.KR;
import defpackage.KW1;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/feature/platform/screens/common/CommonNavigateToVerificationFragmentApi;", "LfG;", "VM", "Lcom/api/feature/webpage/screen/SimpleWebViewFragment;", "FeaturePlatformApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CommonNavigateToVerificationFragmentApi<VM extends AbstractC3745fG> extends SimpleWebViewFragment<VM> {

    @NotNull
    public final InterfaceC6965uM1 q;

    @NotNull
    public final AbstractC4165hG r;

    @NotNull
    public final KW1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonNavigateToVerificationFragmentApi(@NotNull InterfaceC6965uM1 bindingProvider, @NotNull KR customWebChromeClient, @NotNull AbstractC4165hG commonNavigateToVerificationWebViewClient, @NotNull Sd2 viewModelFactory, @NotNull Ch2 webViewCustomizer) {
        super(viewModelFactory, bindingProvider, customWebChromeClient, commonNavigateToVerificationWebViewClient, webViewCustomizer);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(commonNavigateToVerificationWebViewClient, "commonNavigateToVerificationWebViewClient");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        this.q = bindingProvider;
        this.r = commonNavigateToVerificationWebViewClient;
        this.s = XO0.b(new C1523Mi(this, 1));
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void d() {
        C2778ai2 c2778ai2 = (C2778ai2) this.s.getValue();
        if (c2778ai2 != null) {
            c2778ai2.a();
        }
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void f() {
        C2778ai2 c2778ai2 = (C2778ai2) this.s.getValue();
        if (c2778ai2 != null) {
            c2778ai2.a.a = c2778ai2.d;
        }
    }

    @Override // com.api.core.BindingFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C2778ai2 c2778ai2 = (C2778ai2) this.s.getValue();
        if (c2778ai2 != null) {
            c2778ai2.a();
        }
        super.onDestroyView();
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C1621Nn1 c1621Nn1 = this.r.g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C3535eG(viewLifecycleOwner, c1621Nn1, null, this), 3);
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public abstract C3296d7 getA();
}
