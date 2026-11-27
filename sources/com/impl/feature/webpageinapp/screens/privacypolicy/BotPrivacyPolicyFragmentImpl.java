package com.impl.feature.webpageinapp.screens.privacypolicy;

import android.webkit.WebView;
import androidx.lifecycle.v;
import com.api.feature.webpage.screen.SimpleWebViewFragment;
import com.pexpress.tool.R;
import defpackage.C1167Ht;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C6201qi2;
import defpackage.C6755tM1;
import defpackage.C7386wM1;
import defpackage.C7806yM1;
import defpackage.Ch2;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6965uM1;
import defpackage.JM;
import defpackage.LM;
import defpackage.Pa2;
import defpackage.Q2;
import defpackage.S2;
import defpackage.Sd2;
import defpackage.T2;
import defpackage.U2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/webpageinapp/screens/privacypolicy/BotPrivacyPolicyFragmentImpl;", "Lcom/api/feature/webpage/screen/SimpleWebViewFragment;", "LyM1;", "FeatureWebPageInAppImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BotPrivacyPolicyFragmentImpl extends SimpleWebViewFragment<C7806yM1> {

    @NotNull
    public final Sd2 q;

    @NotNull
    public final Pa2 r;

    @NotNull
    public final C6201qi2 s;

    @InterfaceC3368dU(c = "com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl", f = "BotPrivacyPolicyFragmentImpl.kt", l = {44, 47, 46}, m = "onReadyToStartScript")
    public static final class a extends LM {
        public Object d;
        public WebView e;
        public /* synthetic */ Object g;
        public int i;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return BotPrivacyPolicyFragmentImpl.this.v(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotPrivacyPolicyFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC6965uM1 bindingProvider, @NotNull Pa2 urlsProvider, @NotNull C6755tM1 customWebChromeClient, @NotNull C7386wM1 customWebViewClient, @NotNull Ch2 webViewCustomizer, @NotNull C6201qi2 scriptsManager) {
        super(viewModelFactory, bindingProvider, customWebChromeClient, customWebViewClient, webViewCustomizer);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
        this.q = viewModelFactory;
        this.r = urlsProvider;
        this.s = scriptsManager;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        Q2 q2 = new Q2(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new T2(new S2(this, 2), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7806yM1.class), new U2(interfaceC3770fO0A, 2), new C1167Ht(interfaceC3770fO0A), q2);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        return this.r.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (defpackage.LE.e(r8, (java.lang.String) r9, r0) == r1) goto L28;
     */
    @Override // com.api.feature.webpage.screen.WebViewFragment
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@org.jetbrains.annotations.Nullable android.webkit.WebView r8, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl.a
            if (r0 == 0) goto L13
            r0 = r9
            com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl$a r0 = (com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl$a r0 = new com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.C1795Pt1.b(r9)
            goto L7b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.d
            android.webkit.WebView r8 = (android.webkit.WebView) r8
            defpackage.C1795Pt1.b(r9)
            goto L6e
        L3e:
            android.webkit.WebView r8 = r0.e
            java.lang.Object r2 = r0.d
            com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl r2 = (com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl) r2
            defpackage.C1795Pt1.b(r9)
            goto L57
        L48:
            defpackage.C1795Pt1.b(r9)
            r0.d = r7
            r0.e = r8
            r0.i = r6
            kotlin.Unit r9 = kotlin.Unit.a
            if (r9 != r1) goto L56
            goto L7a
        L56:
            r2 = r7
        L57:
            if (r8 == 0) goto L7e
            qi2 r9 = r2.s
            Pa2 r2 = r2.r
            java.lang.String r2 = r2.v()
            r0.d = r8
            r0.e = r3
            r0.i = r5
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L6e
            goto L7a
        L6e:
            java.lang.String r9 = (java.lang.String) r9
            r0.d = r3
            r0.i = r4
            java.lang.Object r8 = defpackage.LE.e(r8, r9, r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L7e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl.v(android.webkit.WebView, JM):java.lang.Object");
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment
    @NotNull
    public final String x() {
        String string = requireContext().getString(R.string.privacy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
