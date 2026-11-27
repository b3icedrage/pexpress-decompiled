package com.impl.feature.platform.screens.withdraw;

import androidx.lifecycle.v;
import com.base.feature.platform.screens.withdraw.WithdrawFragmentBase;
import defpackage.Bj2;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3296d7;
import defpackage.C6201qi2;
import defpackage.C6819tg;
import defpackage.C7113v4;
import defpackage.C7323w4;
import defpackage.C7534x4;
import defpackage.Ch2;
import defpackage.Dj2;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC2773ah1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.JM;
import defpackage.Kj2;
import defpackage.LM;
import defpackage.Mj2;
import defpackage.Oj2;
import defpackage.Pa2;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/platform/screens/withdraw/WithdrawFragmentImpl;", "Lcom/base/feature/platform/screens/withdraw/WithdrawFragmentBase;", "LKj2;", "FeaturePlatformImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithdrawFragmentImpl extends WithdrawFragmentBase<Kj2> {

    @NotNull
    public final Pa2 v;

    @NotNull
    public final Sd2 w;

    @NotNull
    public final Bj2 x;

    @NotNull
    public final C6201qi2 y;

    @NotNull
    public final C3296d7 z;

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl", f = "WithdrawFragmentImpl.kt", l = {44, 45}, m = "onReadyToStartScript")
    public static final class a extends LM {
        public WithdrawFragmentImpl d;
        public /* synthetic */ Object e;
        public int h;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return WithdrawFragmentImpl.this.v(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawFragmentImpl(@NotNull Pa2 urlsProvider, @NotNull Sd2 viewModelFactory, @NotNull Bj2 bindingProvider, @NotNull Mj2 customWebChromeClient, @NotNull Oj2 customWebViewClient, @NotNull C6201qi2 scriptsManager, @NotNull Ch2 webViewCustomizer, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull C3296d7 onBackPressedProvider) {
        super(viewModelFactory, bindingProvider, customWebChromeClient, customWebViewClient, webViewCustomizer, preloadedWebViewUseCase);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        this.v = urlsProvider;
        this.w = viewModelFactory;
        this.x = bindingProvider;
        this.y = scriptsManager;
        this.z = onBackPressedProvider;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6819tg c6819tg = new C6819tg(this, 6);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7323w4(new C7113v4(this, 6), 5));
        return C2151Ui0.a(this, C2017Sp1.a.b(Kj2.class), new C7534x4(interfaceC3770fO0A, 3), new Dj2(interfaceC3770fO0A), c6819tg);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String n() {
        return this.v.i();
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        return this.v.t();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r1.z(r6, r5) == r0) goto L24;
     */
    @Override // com.api.feature.webpage.screen.WebViewFragment
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@org.jetbrains.annotations.Nullable android.webkit.WebView r5, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl.a
            if (r5 == 0) goto L13
            r5 = r6
            com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl$a r5 = (com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl.a) r5
            int r0 = r5.h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.h = r0
            goto L18
        L13:
            com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl$a r5 = new com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl$a
            r5.<init>(r6)
        L18:
            java.lang.Object r6 = r5.e
            MN r0 = defpackage.MN.d
            int r1 = r5.h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl r1 = r5.d
            defpackage.C1795Pt1.b(r6)
            goto L45
        L38:
            defpackage.C1795Pt1.b(r6)
            r5.d = r4
            r5.h = r3
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r0) goto L44
            goto L58
        L44:
            r1 = r4
        L45:
            Bj2 r6 = r1.x
            Cj2 r6 = (defpackage.Cj2) r6
            android.webkit.WebView r6 = r6.j
            if (r6 == 0) goto L5c
            r3 = 0
            r5.d = r3
            r5.h = r2
            java.lang.Object r5 = r1.z(r6, r5)
            if (r5 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L5c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl.v(android.webkit.WebView, JM):java.lang.Object");
    }

    @Override // com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi
    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final C3296d7 getZ() {
        return this.z;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[PHI: r9 r10
      0x0093: PHI (r9v3 android.webkit.WebView) = (r9v2 android.webkit.WebView), (r9v9 android.webkit.WebView) binds: [B:28:0x0090, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r10v10 java.lang.Object) = (r10v9 java.lang.Object), (r10v1 java.lang.Object) binds: [B:28:0x0090, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (defpackage.LE.e(r9, (java.lang.String) r10, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(android.webkit.WebView r9, defpackage.LM r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.Ej2
            if (r0 == 0) goto L13
            r0 = r10
            Ej2 r0 = (defpackage.Ej2) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            Ej2 r0 = new Ej2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L56
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            defpackage.C1795Pt1.b(r10)
            goto La0
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.d
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            defpackage.C1795Pt1.b(r10)
            goto L93
        L42:
            android.webkit.WebView r9 = r0.e
            java.lang.Object r2 = r0.d
            com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl r2 = (com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl) r2
            defpackage.C1795Pt1.b(r10)
            goto L7e
        L4c:
            android.webkit.WebView r9 = r0.e
            java.lang.Object r2 = r0.d
            com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl r2 = (com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl) r2
            defpackage.C1795Pt1.b(r10)
            goto L6f
        L56:
            defpackage.C1795Pt1.b(r10)
            Pa2 r10 = r8.v
            java.lang.String r10 = r10.l()
            r0.d = r8
            r0.e = r9
            r0.i = r7
            qi2 r2 = r8.y
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto L6e
            goto L9f
        L6e:
            r2 = r8
        L6f:
            java.lang.String r10 = (java.lang.String) r10
            r0.d = r2
            r0.e = r9
            r0.i = r6
            java.lang.Object r10 = defpackage.LE.e(r9, r10, r0)
            if (r10 != r1) goto L7e
            goto L9f
        L7e:
            qi2 r10 = r2.y
            Pa2 r2 = r2.v
            java.lang.String r2 = r2.r()
            r0.d = r9
            r0.e = r3
            r0.i = r5
            java.lang.Object r10 = r10.a(r2, r0)
            if (r10 != r1) goto L93
            goto L9f
        L93:
            java.lang.String r10 = (java.lang.String) r10
            r0.d = r3
            r0.i = r4
            java.lang.Object r9 = defpackage.LE.e(r9, r10, r0)
            if (r9 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl.z(android.webkit.WebView, LM):java.lang.Object");
    }
}
