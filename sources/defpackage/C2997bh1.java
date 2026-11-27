package defpackage;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2997bh1 implements InterfaceC2773ah1 {

    @NotNull
    public final Context a;

    @NotNull
    public final PR b;

    @NotNull
    public final Ch2 c;

    @NotNull
    public final AbstractC7420wY d;

    @NotNull
    public final AbstractC6789tY e;

    @NotNull
    public final Pa2 f;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public WebView i;

    @NotNull
    public final FP1 j;

    @Nullable
    public EM k;

    /* JADX INFO: renamed from: bh1$a */
    @InterfaceC3368dU(c = "com.base.feature.platform.usecases.PreloadedWebViewUseCaseBase$setPreloaded$1", f = "PreloadedWebViewUseCaseBase.kt", l = {71}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ WebView g;
        public final /* synthetic */ String h;

        /* JADX INFO: renamed from: bh1$a$a, reason: collision with other inner class name */
        public static final class C0252a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2997bh1 d;
            public final /* synthetic */ WebView e;

            public C0252a(C2997bh1 c2997bh1, WebView webView, String str) {
                this.d = c2997bh1;
                this.e = webView;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objC = this.d.b.c(this.e, jm);
                return objC == MN.d ? objC : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebView webView, String str, JM<? super a> jm) {
            super(2, jm);
            this.g = webView;
            this.h = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2997bh1.this.new a(this.g, this.h, jm);
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
                C2997bh1 c2997bh1 = C2997bh1.this;
                C1811Pz c1811Pz = c2997bh1.e.g;
                C0252a c0252a = new C0252a(c2997bh1, this.g, this.h);
                this.d = 1;
                if (c1811Pz.c(c0252a, this) == mn) {
                    return mn;
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

    /* JADX INFO: renamed from: bh1$b */
    @InterfaceC3368dU(c = "com.base.feature.platform.usecases.PreloadedWebViewUseCaseBase$setPreloaded$2", f = "PreloadedWebViewUseCaseBase.kt", l = {78}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: bh1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2997bh1 d;

            public a(C2997bh1 c2997bh1) {
                this.d = c2997bh1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ((Boolean) obj).getClass();
                this.d.b.d();
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2997bh1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2997bh1 c2997bh1 = C2997bh1.this;
                C1699On1 c1699On1 = c2997bh1.e.c;
                a aVar = new a(c2997bh1);
                this.d = 1;
                Object objC = c1699On1.d.c(new C3206ch1(aVar), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
                    return mn;
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

    public C2997bh1(@NotNull Context context, @NotNull PR customizeDepositWebViewUseCase, @NotNull Ch2 webViewCustomizer, @NotNull AbstractC7420wY depositWebViewClient, @NotNull AbstractC6789tY depositWebChromeClient, @NotNull Pa2 urlsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customizeDepositWebViewUseCase, "customizeDepositWebViewUseCase");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(depositWebViewClient, "depositWebViewClient");
        Intrinsics.checkNotNullParameter(depositWebChromeClient, "depositWebChromeClient");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        this.a = context;
        this.b = customizeDepositWebViewUseCase;
        this.c = webViewCustomizer;
        this.d = depositWebViewClient;
        this.e = depositWebChromeClient;
        this.f = urlsProvider;
        this.j = customizeDepositWebViewUseCase.b();
    }

    @Override // defpackage.InterfaceC2773ah1
    public final void a(boolean z) {
        this.b.a(z);
    }

    @Override // defpackage.InterfaceC2773ah1
    @NotNull
    public final FP1 b() {
        return this.j;
    }

    @Override // defpackage.InterfaceC2773ah1
    @Nullable
    public final WebView f() {
        return this.i;
    }

    @Override // defpackage.InterfaceC2773ah1
    public final void g() {
        this.h = null;
        String str = this.g;
        if (str != null) {
            k(str, true);
        }
    }

    @Override // defpackage.InterfaceC2773ah1
    public final void h() {
        WebView webView;
        WebView webView2 = this.i;
        if (webView2 != null) {
            this.c.c(webView2, this.f.i());
        }
        String str = this.h;
        if (str != null) {
            WebView webView3 = this.i;
            if (webView3 != null) {
                Intrinsics.checkNotNull(str);
                C0957Fb.r(webView3, str);
                return;
            }
            return;
        }
        String str2 = this.g;
        if (str2 == null || (webView = this.i) == null) {
            return;
        }
        C0957Fb.r(webView, str2);
    }

    @Override // defpackage.InterfaceC2773ah1
    public final void i() {
        k(null, false);
    }

    @Override // defpackage.InterfaceC2773ah1
    public final void j(@NotNull String url, @NotNull OR webViewClient, @NotNull KR webChromeClient) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(webChromeClient, "webChromeClient");
        WebView webView = this.i;
        if (webView == null) {
            return;
        }
        this.h = url;
        EM em = this.k;
        if (em != null) {
            LN.c(em, null);
        }
        this.k = null;
        Ch2 ch2 = this.c;
        ch2.a(webView, webViewClient, webChromeClient);
        ch2.c(webView, this.f.i());
        WebView webView2 = this.i;
        if (webView2 != null) {
            C0957Fb.r(webView2, url);
        }
    }

    @Override // defpackage.InterfaceC2773ah1
    public final void k(@Nullable String str, boolean z) {
        WebView webView;
        this.g = str;
        String str2 = this.h;
        if (str2 != null) {
            return;
        }
        if (str == null) {
            WebView webView2 = this.i;
            if (webView2 != null) {
                webView2.loadUrl("about:blank");
            }
            this.i = null;
            EM em = this.k;
            if (em != null) {
                LN.c(em, null);
            }
            this.k = null;
            return;
        }
        PR pr = this.b;
        Pa2 pa2 = this.f;
        Ch2 ch2 = this.c;
        if (!z) {
            if (str2 != null) {
                return;
            }
            WebView webView3 = this.i;
            if (webView3 != null) {
                ch2.c(webView3, pa2.i());
                pr.e(webView3);
            }
            String str3 = this.g;
            if (str3 == null || (webView = this.i) == null) {
                return;
            }
            C0957Fb.r(webView, str3);
            return;
        }
        WebView webView4 = this.i;
        if (webView4 == null) {
            webView4 = new WebView(this.a);
            ch2.b(webView4);
        }
        this.i = webView4;
        ch2.a(webView4, this.d, this.e);
        EM em2 = this.k;
        if (em2 != null) {
            LN.c(em2, null);
        }
        EM emB = LN.b();
        this.k = emB;
        C5189lv.k(emB, null, new a(webView4, str, null), 3);
        C5189lv.k(emB, null, new b(null), 3);
        ch2.c(webView4, pa2.i());
        pr.e(webView4);
        C0957Fb.r(webView4, str);
    }
}
