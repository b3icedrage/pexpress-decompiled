package defpackage;

import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5709oN1 implements Pa2 {

    @NotNull
    public final C6201qi2 a;

    @NotNull
    public final VK1 b;

    @NotNull
    public final InterfaceC1131Hh c;

    @Nullable
    public WebView d;
    public boolean e;

    @NotNull
    public final GP1 f;
    public boolean g;

    @NotNull
    public EnumC5076lN1 h;

    @NotNull
    public final String i;

    /* JADX INFO: renamed from: oN1$a */
    public final class a extends WebChromeClient {
        public boolean a;

        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@Nullable WebView webView, int i) {
            String url;
            AbstractC5709oN1 abstractC5709oN1 = AbstractC5709oN1.this;
            if (i == 100) {
                Boolean bool = Boolean.TRUE;
                GP1 gp1 = abstractC5709oN1.f;
                gp1.getClass();
                gp1.m(null, bool);
            }
            if (i == 100 && abstractC5709oN1.e) {
                WebView webView2 = abstractC5709oN1.d;
                if (webView2 != null) {
                    C7644xc.f(webView2);
                }
                abstractC5709oN1.F().c();
                abstractC5709oN1.e = false;
            }
            if (i < 60) {
                this.a = false;
                return;
            }
            if (this.a) {
                return;
            }
            this.a = true;
            if (webView == null || (url = webView.getUrl()) == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* JADX INFO: renamed from: oN1$b */
    public class b extends WebViewClient {

        /* JADX INFO: renamed from: oN1$b$a */
        @InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$CustomWebViewClient$shouldInterceptRequest$1", f = "SocialLoginWithWebView.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public final /* synthetic */ AbstractC5709oN1 d;

            /* JADX INFO: renamed from: oN1$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0455a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnumC5076lN1.values().length];
                    try {
                        EnumC5076lN1 enumC5076lN1 = EnumC5076lN1.d;
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC5709oN1 abstractC5709oN1, JM<? super a> jm) {
                super(2, jm);
                this.d = abstractC5709oN1;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                String str;
                MN mn = MN.d;
                C1795Pt1.b(obj);
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                AbstractC5709oN1 abstractC5709oN1 = this.d;
                String url = ((C7178vN1) abstractC5709oN1).j.p();
                Intrinsics.checkNotNullParameter(cookieManager, "<this>");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter("ssid", "cookieName");
                String cookie = cookieManager.getCookie(url);
                String str2 = null;
                if (cookie != null) {
                    Iterator it = StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        String str3 = (String) it.next();
                        if (StringsKt.C(str3, "ssid", false)) {
                            str = (String) StringsKt__StringsKt.split$default(str3, new String[]{"="}, false, 0, 6, null).get(1);
                            break;
                        }
                    }
                    if (!Intrinsics.a(str, "deleted")) {
                        str2 = str;
                    }
                }
                if (str2 != null && !abstractC5709oN1.g) {
                    abstractC5709oN1.g = true;
                    WebView webView = abstractC5709oN1.d;
                    if (webView != null) {
                        webView.post(new RunnableC3538eH(2, abstractC5709oN1, str2));
                    }
                }
                return Unit.a;
            }
        }

        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            AbstractC5709oN1.this.F().b(request, errorResponse);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            C5189lv.k(C3286d41.a, C6266r20.c, new a(AbstractC5709oN1.this, null), 2);
            return super.shouldInterceptRequest(view, request);
        }
    }

    public AbstractC5709oN1(@NotNull C6201qi2 scriptsManager, @NotNull VK1 showDialogUseCase, @NotNull InterfaceC1131Hh appRepository) {
        Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
        Intrinsics.checkNotNullParameter(showDialogUseCase, "showDialogUseCase");
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        this.a = scriptsManager;
        this.b = showDialogUseCase;
        this.c = appRepository;
        this.f = C1589Ne.i(Boolean.FALSE);
        this.h = EnumC5076lN1.d;
        this.i = "socialAuth(\"google\");";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String A() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String B() {
        return ((C7178vN1) this).l();
    }

    @Nullable
    public abstract Unit C();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(EnumC5076lN1 enumC5076lN1, LM lm) throws Throwable {
        C6129qN1 c6129qN1;
        AbstractC5709oN1 obj;
        if (lm instanceof C6129qN1) {
            c6129qN1 = (C6129qN1) lm;
            int i = c6129qN1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6129qN1.i = i - Integer.MIN_VALUE;
            } else {
                c6129qN1 = new C6129qN1(this, lm);
            }
        } else {
            c6129qN1 = new C6129qN1(this, lm);
        }
        Object obj2 = c6129qN1.g;
        Object obj3 = MN.d;
        int i2 = c6129qN1.i;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            WebView webView = new WebView(F().a().getContext());
            this.d = webView;
            webView.setLayoutParams(new ConstraintLayout.a(-1, -1));
            webView.setElevation(10.0f);
            c6129qN1.d = this;
            c6129qN1.e = enumC5076lN1;
            c6129qN1.i = 1;
            WebStorage.getInstance().deleteAllData();
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
            RV rv = C6266r20.a;
            Object objP = C5189lv.p(QV0.a, new YM(cookieManager, null), c6129qN1);
            if (objP != obj3) {
                objP = Unit.a;
            }
            if (objP == obj3) {
                return obj3;
            }
            obj = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC5076lN1 = c6129qN1.e;
            obj = c6129qN1.d;
            C1795Pt1.b(obj2);
        }
        WebView webView2 = obj.d;
        if (webView2 != null) {
            WebSettings settings = webView2.getSettings();
            webView2.setWebChromeClient(obj.new a());
            webView2.setWebViewClient(obj.new b());
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowContentAccess(true);
            settings.setUserAgentString("Mozilla/5.0 (Linux; Android 8.0; Pixel 2 Build/OPD3.170816.012) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.61 Mobile Safari/537.36");
            webView2.setHorizontalScrollBarEnabled(false);
            Intrinsics.checkNotNullParameter(webView2, "<this>");
            Intrinsics.checkNotNullParameter(obj, "obj");
            webView2.addJavascriptInterface(obj, "Android");
            webView2.setOverScrollMode(2);
        }
        obj.g = false;
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = obj.f;
        gp1.getClass();
        gp1.m(null, bool);
        C5189lv.k(C3286d41.a, null, new C6548sN1(obj, null), 3);
        WebView webView3 = obj.d;
        if (webView3 != null) {
            webView3.setVisibility(4);
        }
        WebView webView4 = obj.d;
        if (webView4 != null) {
            obj.F().a().removeView(webView4);
            obj.F().a().addView(webView4, obj.F().a().getChildCount());
        }
        C5189lv.k(C3784fT.a, null, new C5919pN1(obj, enumC5076lN1, null), 3);
        return Unit.a;
    }

    @NotNull
    public final InterfaceC4866kN1 F() {
        Intrinsics.l("socialBinding");
        throw null;
    }

    @Override // defpackage.Pa2
    @NotNull
    public String a() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String b() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String d() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String i() {
        return C5491nL.c(".", w());
    }

    @Override // defpackage.Pa2
    @NotNull
    public String j() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String k() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String m() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String n() {
        return ((C7178vN1) this).g();
    }

    @Override // defpackage.Pa2
    @NotNull
    public String o() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String r() {
        return ((C7178vN1) this).l();
    }

    @Override // defpackage.Pa2
    @NotNull
    public String s() {
        return ((C7178vN1) this).l();
    }

    @JavascriptInterface
    public final void socialButtonClicked(boolean z) {
        if (z) {
            WebView webView = this.d;
            if (webView != null) {
                webView.post(new RunnableC5499nN1(this, 0));
                return;
            }
            return;
        }
        WebView webView2 = this.d;
        if (webView2 != null) {
            webView2.post(new RunnableC3329dH(this, 3));
        }
    }

    @Override // defpackage.Pa2
    @NotNull
    public String u() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String v() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String w() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public String x() {
        return ((C7178vN1) this).l();
    }

    public final void E() {
    }
}
