package com.base.feature.webpage.screens.knowledgeBase;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v;
import com.api.feature.webpage.screen.SimpleWebViewFragment;
import com.pexpress.tool.R;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3265cz0;
import defpackage.C3399dd0;
import defpackage.C5430n3;
import defpackage.C6755tM1;
import defpackage.C7239vg;
import defpackage.C7806yM1;
import defpackage.Ch2;
import defpackage.EnumC4403iP0;
import defpackage.FK0;
import defpackage.InterfaceC3770fO0;
import defpackage.KK0;
import defpackage.L81;
import defpackage.NK0;
import defpackage.OR;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC5007l3;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/webpage/screens/knowledgeBase/KnowledgeBaseFragmentBase;", "Lcom/api/feature/webpage/screen/SimpleWebViewFragment;", "LyM1;", "FeatureWebPageInAppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KnowledgeBaseFragmentBase extends SimpleWebViewFragment<C7806yM1> {

    @NotNull
    public final Sd2 q;

    @NotNull
    public final NK0 r;

    @NotNull
    public final KK0 s;

    @NotNull
    public final a t;

    public static final class a extends L81 {
        public a() {
            super(true);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [ak0, kotlin.jvm.functions.Function0] */
        @Override // defpackage.L81
        public final void a() {
            KnowledgeBaseFragmentBase knowledgeBaseFragmentBase = KnowledgeBaseFragmentBase.this;
            if (knowledgeBaseFragmentBase.r.f().canGoBack()) {
                knowledgeBaseFragmentBase.r.f().goBack();
                return;
            }
            this.a = false;
            ?? r1 = this.c;
            if (r1 != 0) {
                r1.invoke();
            }
            knowledgeBaseFragmentBase.requireActivity().getOnBackPressedDispatcher().c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeBaseFragmentBase(@NotNull Sd2 viewModelFactory, @NotNull NK0 bindingProvider, @NotNull C6755tM1 simpleWebChromeClient, @NotNull OR customWebViewClient, @NotNull Ch2 webViewCustomizer, @NotNull KK0 knowledgeBaseUrlProviderApi) {
        super(viewModelFactory, bindingProvider, simpleWebChromeClient, customWebViewClient, webViewCustomizer);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(simpleWebChromeClient, "simpleWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(knowledgeBaseUrlProviderApi, "knowledgeBaseUrlProviderApi");
        this.q = viewModelFactory;
        this.r = bindingProvider;
        this.s = knowledgeBaseUrlProviderApi;
        this.t = new a();
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C7239vg c7239vg = new C7239vg(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3399dd0(new C5430n3(this, 3), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7806yM1.class), new C3265cz0(interfaceC3770fO0A, 1), new FK0(interfaceC3770fO0A), c7239vg);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        return (String) this.s.a.d.getValue();
    }

    @Override // com.api.core.ViewModelFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().a(this, this.t);
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.r.d().setNavigationOnClickListener(new ViewOnClickListenerC5007l3(this, 3));
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment
    @NotNull
    public final String x() {
        String string = getString(R.string.knowledge_base);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
