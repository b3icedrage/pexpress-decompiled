package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.n;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.registration.screens.captcha.CaptchaFragmentDialog;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import java.io.ByteArrayInputStream;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1104Gy implements InterfaceC7931yy {

    @NotNull
    public final Context a;

    @NotNull
    public final Pa2 b;

    @NotNull
    public final C3296d7 c;

    @NotNull
    public final C4923kf d;

    @NotNull
    public final Sa2 e;

    @NotNull
    public final ReporterApi f;

    @Nullable
    public C1571My g;

    @Nullable
    public Pair<? extends FragmentManager, Integer> h;
    public boolean i;

    @Nullable
    public CaptchaFragmentDialog j;
    public boolean k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final KW1 m;

    @NotNull
    public final AtomicReference<Function1<String, Unit>> n;

    @Nullable
    public volatile C2316Wk o;

    @Nullable
    public EnumC1964Ry p;

    @Nullable
    public CaptchaDestination q;

    @Nullable
    public String r;
    public boolean s;

    @NotNull
    public final String t;

    @NotNull
    public final KW1 u;
    public int v;

    /* JADX INFO: renamed from: Gy$b */
    public /* synthetic */ class b extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((AbstractC1104Gy) this.e).g();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Gy$c */
    public /* synthetic */ class c extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC1104Gy abstractC1104Gy = (AbstractC1104Gy) this.e;
            abstractC1104Gy.n.set(null);
            C2316Wk c2316Wk = abstractC1104Gy.o;
            if (c2316Wk != null) {
                c2316Wk.a("dismissed", "captcha.dismissed");
            }
            abstractC1104Gy.o = null;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Gy$d */
    @InterfaceC3368dU(c = "com.base.feature.registration.usecases.CaptchaDialogUseCaseBase$init$lambda$3$$inlined$launchAndCollectIn$default$1", f = "CaptchaDialogUseCaseBase.kt", l = {48}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ GP1 g;
        public final /* synthetic */ C1571My h;
        public final /* synthetic */ AbstractC1104Gy i;

        /* JADX INFO: renamed from: Gy$d$a */
        @InterfaceC3368dU(c = "com.base.feature.registration.usecases.CaptchaDialogUseCaseBase$init$lambda$3$$inlined$launchAndCollectIn$default$1$1", f = "CaptchaDialogUseCaseBase.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ GP1 g;
            public final /* synthetic */ C1571My h;
            public final /* synthetic */ AbstractC1104Gy i;

            /* JADX INFO: renamed from: Gy$d$a$a, reason: collision with other inner class name */
            public static final class C0040a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ C1571My e;
                public final /* synthetic */ AbstractC1104Gy g;

                public C0040a(KN kn, C1571My c1571My, AbstractC1104Gy abstractC1104Gy) {
                    this.e = c1571My;
                    this.g = abstractC1104Gy;
                    this.d = kn;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.InterfaceC6606sf0
                public final Object a(T t, JM<? super Unit> jm) {
                    String string;
                    boolean zBooleanValue = ((Boolean) t).booleanValue();
                    C1571My c1571My = this.e;
                    c1571My.e.setEnabled(!zBooleanValue);
                    MaterialButton materialButton = c1571My.e;
                    if (zBooleanValue) {
                        string = "";
                    } else {
                        string = this.g.a.getString(R.string.refresh_text);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                    materialButton.setText(string);
                    SpinKitView loadingProgressBar = c1571My.j;
                    Intrinsics.checkNotNullExpressionValue(loadingProgressBar, "loadingProgressBar");
                    loadingProgressBar.setVisibility(zBooleanValue ? 0 : 8);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GP1 gp1, JM jm, C1571My c1571My, AbstractC1104Gy abstractC1104Gy) {
                super(2, jm);
                this.g = gp1;
                this.h = c1571My;
                this.i = abstractC1104Gy;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h, this.i);
                aVar.e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) throws Throwable {
                MN mn = MN.d;
                int i = this.d;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                    return Unit.a;
                }
                C1795Pt1.b(obj);
                C0040a c0040a = new C0040a((KN) this.e, this.h, this.i);
                this.d = 1;
                this.g.c(c0040a, this);
                return mn;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FP0 fp0, GP1 gp1, JM jm, C1571My c1571My, AbstractC1104Gy abstractC1104Gy) {
            super(2, jm);
            this.e = fp0;
            this.g = gp1;
            this.h = c1571My;
            this.i = abstractC1104Gy;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new d(this.e, this.g, jm, this.h, this.i);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h, this.i);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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

    public AbstractC1104Gy(@NotNull Context context, @NotNull Pa2 urlsProvider, @NotNull C3296d7 activityOnBackPressedProvider, @NotNull C4923kf appDataRepository, @NotNull Sa2 userAgentProvider, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = context;
        this.b = urlsProvider;
        this.c = activityOnBackPressedProvider;
        this.d = appDataRepository;
        this.e = userAgentProvider;
        this.f = reporter;
        this.l = C1589Ne.i(Boolean.FALSE);
        this.m = XO0.b(new C7946z2(this, 2));
        this.n = new AtomicReference<>(null);
        this.t = "";
        this.u = XO0.b(new C8141zy(this, 0));
    }

    public static final boolean c(AbstractC1104Gy abstractC1104Gy, WebResourceRequest webResourceRequest) {
        Uri url;
        abstractC1104Gy.getClass();
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        boolean z = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Set<String> set = C1182Hy.a;
        if (!z) {
            if (string == null) {
                string = "";
            }
            String strX = StringsKt.X(StringsKt.X(string, '#'), '?');
            String strU = StringsKt.U('/', StringsKt.V(strX, "://", strX), "");
            if (kotlin.text.d.o(strU, "recaptcha/", false)) {
                String strW = StringsKt.W('/', strU, strU);
                if (kotlin.text.d.h(strW, ".js", false) || C1182Hy.a.contains(strW)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final void d(AbstractC1104Gy abstractC1104Gy, WebResourceRequest webResourceRequest, String str, String str2) {
        CaptchaDestination captchaDestination;
        Uri url;
        CaptchaFragmentDialog captchaFragmentDialog = abstractC1104Gy.j;
        if (captchaFragmentDialog == null || !captchaFragmentDialog.s || (captchaDestination = abstractC1104Gy.q) == null || abstractC1104Gy.s) {
            return;
        }
        abstractC1104Gy.s = true;
        String[] elements = {(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.getHost(), str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String message = CollectionsKt.J(C1526Mj.o(elements), ": ", null, null, null, 62);
        C2316Wk c2316Wk = abstractC1104Gy.o;
        if (c2316Wk != null) {
            Intrinsics.checkNotNullParameter(message, "message");
            int i = c2316Wk.d + 1;
            c2316Wk.d = i;
            String strValueOf = String.valueOf(i);
            InterfaceC3220cl interfaceC3220cl = c2316Wk.b;
            interfaceC3220cl.b("captcha.load_failures", strValueOf);
            String[] elements2 = {str, message};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            interfaceC3220cl.b("captcha.load_error", KS1.B(100, CollectionsKt.J(C1526Mj.o(elements2), ":", null, null, null, 62)));
            C1730Oy.a("captcha.load_failed", EnumC0936Eu.e, PW0.e(new Pair("flow", c2316Wk.a), new Pair("code", str), new Pair("message", message)));
        }
        String str3 = abstractC1104Gy.r;
        if (str3 == null) {
            return;
        }
        C1493Ly.b(abstractC1104Gy.f, captchaDestination, "webview_load", str, message, C1493Ly.a(captchaDestination), str3);
    }

    public static final void e(AbstractC1104Gy abstractC1104Gy) {
        abstractC1104Gy.k = true;
        C1571My c1571My = abstractC1104Gy.g;
        if (c1571My != null) {
            SpinKitView commonProgressBar = c1571My.h;
            Intrinsics.checkNotNullExpressionValue(commonProgressBar, "commonProgressBar");
            C7644xc.d(3, 0L, commonProgressBar);
            WebView captchaFragmentWebView = c1571My.g;
            Intrinsics.checkNotNullExpressionValue(captchaFragmentWebView, "captchaFragmentWebView");
            C7644xc.d(3, 0L, captchaFragmentWebView);
            ConstraintLayout errorBlock = c1571My.i;
            Intrinsics.checkNotNullExpressionValue(errorBlock, "errorBlock");
            C7644xc.f(errorBlock);
        }
    }

    public static final void f(AbstractC1104Gy abstractC1104Gy, WebResourceRequest webResourceRequest, String str, String str2) {
        CaptchaFragmentDialog captchaFragmentDialog = abstractC1104Gy.j;
        if (captchaFragmentDialog == null || !captchaFragmentDialog.s) {
            return;
        }
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        C1988Sg c1988Sg = U0.O;
        if (c1988Sg != null) {
            c1988Sg.l("auth", "captcha.subresource_failed", EnumC0936Eu.d, PW0.e(new Pair("host", url != null ? url.getHost() : null), new Pair("path", url != null ? url.getPath() : null), new Pair("code", str), new Pair("message", str2)));
        }
    }

    @Override // defpackage.InterfaceC7931yy
    public final void a(@NotNull FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.h = new Pair<>(fragmentManager, Integer.valueOf(i));
        Context context = this.a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.captcha_fragment, (ViewGroup) null, false);
        int i2 = R.id.active_btn;
        MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.active_btn);
        if (materialButton != null) {
            i2 = R.id.captcha_fragment_web_view;
            WebView captchaFragmentWebView = (WebView) C3476e.h(viewInflate, R.id.captcha_fragment_web_view);
            if (captchaFragmentWebView != null) {
                i2 = R.id.captcha_fragment_web_view_container;
                if (((ConstraintLayout) C3476e.h(viewInflate, R.id.captcha_fragment_web_view_container)) != null) {
                    i2 = R.id.commonProgressBar;
                    SpinKitView spinKitView = (SpinKitView) C3476e.h(viewInflate, R.id.commonProgressBar);
                    if (spinKitView != null) {
                        i2 = R.id.error_block;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C3476e.h(viewInflate, R.id.error_block);
                        if (constraintLayout != null) {
                            i2 = R.id.error_text;
                            TextView textView = (TextView) C3476e.h(viewInflate, R.id.error_text);
                            if (textView != null) {
                                i2 = R.id.loadingProgressBar;
                                SpinKitView spinKitView2 = (SpinKitView) C3476e.h(viewInflate, R.id.loadingProgressBar);
                                if (spinKitView2 != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                    C1571My c1571My = new C1571My(constraintLayout2, materialButton, captchaFragmentWebView, spinKitView, constraintLayout, textView, spinKitView2);
                                    Intrinsics.checkNotNullExpressionValue(c1571My, "inflate(...)");
                                    this.j = new CaptchaFragmentDialog(fragmentManager, i, this.c, c1571My, this.d, new C0636Ay(this, c1571My), new b(0, this, AbstractC1104Gy.class, "cancelByUser", "cancelByUser()V", 0), new C5560ng(this, 1), new c(0, this, AbstractC1104Gy.class, "dismissedBySystem", "dismissedBySystem()V", 0));
                                    this.g = c1571My;
                                    textView.setText(context.getString(R.string.something_went_wrong_tittle));
                                    materialButton.setOnClickListener(new ViewOnClickListenerC0714By(0, this, c1571My));
                                    constraintLayout2.setOnClickListener(new ViewOnClickListenerC0792Cy(this, 0));
                                    this.v = 0;
                                    Intrinsics.checkNotNullExpressionValue(captchaFragmentWebView, "captchaFragmentWebView");
                                    captchaFragmentWebView.setAlpha(0.0f);
                                    WebStorage.getInstance().deleteAllData();
                                    captchaFragmentWebView.setWebViewClient(new a());
                                    captchaFragmentWebView.clearCache(true);
                                    captchaFragmentWebView.clearHistory();
                                    WebSettings settings = captchaFragmentWebView.getSettings();
                                    settings.setJavaScriptEnabled(true);
                                    settings.setDisplayZoomControls(false);
                                    settings.setUserAgentString((String) this.e.b.getValue());
                                    Intrinsics.checkNotNullParameter(captchaFragmentWebView, "<this>");
                                    Intrinsics.checkNotNullParameter(this, "obj");
                                    captchaFragmentWebView.addJavascriptInterface(this, "Android");
                                    captchaFragmentWebView.setHorizontalScrollBarEnabled(false);
                                    captchaFragmentWebView.setOverScrollMode(2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.InterfaceC7931yy
    public final void b(@NotNull Function1 onTokenAction, @NotNull CaptchaDestination captchaDestination, @NotNull String flow, @Nullable C2316Wk c2316Wk) {
        EnumC1964Ry enumC1964Ry;
        Intrinsics.checkNotNullParameter(onTokenAction, "onTokenAction");
        Intrinsics.checkNotNullParameter(captchaDestination, "captchaDestination");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Pair<? extends FragmentManager, Integer> pair = this.h;
        if (pair != null) {
            if (!this.i) {
                pair = null;
            }
            if (pair != null) {
                FragmentManager fragmentManager = (FragmentManager) pair.d;
                int iIntValue = pair.e.intValue();
                this.i = false;
                a(fragmentManager, iIntValue);
            }
        }
        this.o = c2316Wk;
        this.q = captchaDestination;
        this.r = flow;
        if (captchaDestination instanceof CaptchaDestination.Login) {
            enumC1964Ry = EnumC1964Ry.Login;
        } else if (captchaDestination instanceof CaptchaDestination.Registration) {
            enumC1964Ry = EnumC1964Ry.Registration;
        } else if (captchaDestination instanceof CaptchaDestination.RemindPass) {
            enumC1964Ry = EnumC1964Ry.ForgetPassword;
        } else {
            if (!(captchaDestination instanceof CaptchaDestination.SmsSend)) {
                throw new C6489s51();
            }
            enumC1964Ry = EnumC1964Ry.Login;
        }
        this.p = enumC1964Ry;
        C1571My c1571My = this.g;
        if (c1571My != null) {
            WebView webView = c1571My.g;
            webView.setAlpha(0.0f);
            WebStorage.getInstance().deleteAllData();
            webView.reload();
            webView.clearCache(true);
            webView.setWebViewClient(new a());
            webView.loadUrl((String) this.m.getValue());
        }
        CaptchaFragmentDialog captchaFragmentDialog = this.j;
        if (captchaFragmentDialog != null) {
            captchaFragmentDialog.s = true;
            FragmentManager fragmentManager2 = captchaFragmentDialog.h;
            fragmentManager2.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager2);
            Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction()");
            aVar.c(captchaFragmentDialog.i, captchaFragmentDialog, null, 1);
            if (!aVar.h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            aVar.g = true;
            aVar.i = captchaFragmentDialog.r;
            aVar.e(true);
        }
        this.n.set(onTokenAction);
    }

    @JavascriptInterface
    public final void captchaTokenSuccess(@NotNull String result, boolean z) {
        Intrinsics.checkNotNullParameter(result, "result");
        Function1<String, Unit> andSet = this.n.getAndSet(null);
        if (andSet == null) {
            return;
        }
        if (z) {
            this.v++;
        }
        C2316Wk c2316Wk = this.o;
        if (c2316Wk != null) {
            InterfaceC3220cl interfaceC3220cl = c2316Wk.b;
            interfaceC3220cl.b("captcha.outcome", "solved");
            interfaceC3220cl.b("captcha.auto", String.valueOf(z));
            c2316Wk.c.a(true);
            C1730Oy.a("captcha.solved", EnumC0936Eu.d, PW0.e(new Pair("flow", c2316Wk.a), new Pair("auto", Boolean.valueOf(z))));
        }
        this.o = null;
        andSet.invoke(result);
        CaptchaFragmentDialog captchaFragmentDialog = this.j;
        if (captchaFragmentDialog != null) {
            captchaFragmentDialog.s = false;
            captchaFragmentDialog.j.a = captchaFragmentDialog.q;
            try {
                FragmentManager fragmentManager = captchaFragmentDialog.h;
                fragmentManager.getClass();
                fragmentManager.v(fragmentManager.new n(null, -1, 0), false);
            } catch (Exception unused) {
            }
        }
    }

    public final void g() {
        this.n.set(null);
        C2316Wk c2316Wk = this.o;
        if (c2316Wk != null) {
            c2316Wk.a(c2316Wk.d > 0 ? "load_failed" : "closed", "captcha.closed");
        }
        this.o = null;
        CaptchaFragmentDialog captchaFragmentDialog = this.j;
        if (captchaFragmentDialog != null) {
            captchaFragmentDialog.s = false;
            captchaFragmentDialog.j.a = captchaFragmentDialog.q;
            try {
                FragmentManager fragmentManager = captchaFragmentDialog.h;
                fragmentManager.getClass();
                fragmentManager.v(fragmentManager.new n(null, -1, 0), false);
            } catch (Exception unused) {
            }
        }
    }

    @NotNull
    public String h() {
        return this.t;
    }

    @NotNull
    public String i() {
        return "\n            <html xmlns=\"http://www.w3.org/1999/xhtml\">\n                <head>\n                    <style>\n                        \n            body {\n                transform:scale(1.0);\n                -webkit-transform:scale(1.0);\n                background-color: rgb(34, 34, 34);\n                display: flex;\n                align-items: flex-start;\n                justify-content: center;\n                margin: 0;\n                padding: 8px 0;\n            }\n            h1 {\n                margin: 0;\n            }\n        \n                        body > div > div {\n                            height: fit-content !important;\n                        }\n                    </style>\n                    <script>\n                        function successfulReCAPTCHA(response) {\n                            Android.captchaTokenSuccess(response);\n                        }\n                    </script>\n                    <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\n                </head>\n                <body>\n                    <h1>\n                        <div class=\"g-recaptcha\" \n                        data-callback=\"successfulReCAPTCHA\"\n                        data-sitekey=\"|SITEKEY|\"\n                        data-theme=\"dark\"></div>\n                    </h1>\n                </body>\n            </html>\n        ";
    }

    /* JADX INFO: renamed from: Gy$a */
    public final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            C1571My c1571My;
            AbstractC1104Gy abstractC1104Gy = AbstractC1104Gy.this;
            GP1 gp1 = abstractC1104Gy.l;
            Boolean bool = Boolean.FALSE;
            gp1.getClass();
            gp1.m(null, bool);
            if (abstractC1104Gy.k || (c1571My = abstractC1104Gy.g) == null) {
                return;
            }
            SpinKitView commonProgressBar = c1571My.h;
            Intrinsics.checkNotNullExpressionValue(commonProgressBar, "commonProgressBar");
            C7644xc.d(3, 0L, commonProgressBar);
            ConstraintLayout errorBlock = c1571My.i;
            Intrinsics.checkNotNullExpressionValue(errorBlock, "errorBlock");
            C7644xc.d(3, 0L, errorBlock);
            WebView captchaFragmentWebView = c1571My.g;
            Intrinsics.checkNotNullExpressionValue(captchaFragmentWebView, "captchaFragmentWebView");
            C7644xc.f(captchaFragmentWebView);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            AbstractC1104Gy abstractC1104Gy = AbstractC1104Gy.this;
            GP1 gp1 = abstractC1104Gy.l;
            Boolean bool = Boolean.TRUE;
            gp1.getClass();
            gp1.m(null, bool);
            abstractC1104Gy.k = false;
            abstractC1104Gy.s = false;
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            CharSequence description;
            Objects.toString(webResourceRequest);
            Objects.toString(webResourceError);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            String string = null;
            String string2 = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()).toString() : null;
            if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                string = description.toString();
            }
            AbstractC1104Gy abstractC1104Gy = AbstractC1104Gy.this;
            if (!AbstractC1104Gy.c(abstractC1104Gy, webResourceRequest)) {
                AbstractC1104Gy.f(abstractC1104Gy, webResourceRequest, string2, string);
            } else {
                AbstractC1104Gy.d(abstractC1104Gy, webResourceRequest, string2, string);
                AbstractC1104Gy.e(abstractC1104Gy);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (webResourceResponse != null) {
                webResourceResponse.getStatusCode();
            }
            Objects.toString(url);
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            String string = webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()).toString() : null;
            AbstractC1104Gy abstractC1104Gy = AbstractC1104Gy.this;
            if (!AbstractC1104Gy.c(abstractC1104Gy, webResourceRequest)) {
                AbstractC1104Gy.f(abstractC1104Gy, webResourceRequest, string, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
            } else {
                AbstractC1104Gy.d(abstractC1104Gy, webResourceRequest, string, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
                AbstractC1104Gy.e(abstractC1104Gy);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            if (renderProcessGoneDetail != null) {
                renderProcessGoneDetail.didCrash();
            }
            AbstractC1104Gy abstractC1104Gy = AbstractC1104Gy.this;
            CaptchaFragmentDialog captchaFragmentDialog = abstractC1104Gy.j;
            if (captchaFragmentDialog != null && captchaFragmentDialog.s) {
                String message = "crash=" + (renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null) + " priority=" + (renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null);
                CaptchaDestination captchaDestination = abstractC1104Gy.q;
                C2316Wk c2316Wk = abstractC1104Gy.o;
                if (c2316Wk != null) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    int i = c2316Wk.d + 1;
                    c2316Wk.d = i;
                    String strValueOf = String.valueOf(i);
                    InterfaceC3220cl interfaceC3220cl = c2316Wk.b;
                    interfaceC3220cl.b("captcha.load_failures", strValueOf);
                    String[] elements = {"render_process_gone", message};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    interfaceC3220cl.b("captcha.load_error", KS1.B(100, CollectionsKt.J(C1526Mj.o(elements), ":", null, null, null, 62)));
                    C1730Oy.a("captcha.load_failed", EnumC0936Eu.e, PW0.e(new Pair("flow", c2316Wk.a), new Pair("code", "render_process_gone"), new Pair("message", message)));
                }
                if (captchaDestination != null && (str = abstractC1104Gy.r) != null) {
                    C1493Ly.b(abstractC1104Gy.f, captchaDestination, "webview_load", "render_process_gone", message, C1493Ly.a(captchaDestination), str);
                }
                abstractC1104Gy.g();
            }
            if (webView != null) {
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.destroy();
            }
            abstractC1104Gy.i = true;
            return true;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable String str) {
            AbstractC1104Gy abstractC1104Gy = AbstractC1104Gy.this;
            if (!Intrinsics.a(str, (String) abstractC1104Gy.m.getValue())) {
                return super.shouldInterceptRequest(webView, str);
            }
            EnumC1964Ry enumC1964Ry = abstractC1104Gy.p;
            String str2 = enumC1964Ry != null ? enumC1964Ry.d : null;
            if (str2 == null) {
                str2 = "";
            }
            String strI = abstractC1104Gy.i();
            String strH = (String) abstractC1104Gy.u.getValue();
            if (strH == null) {
                strH = abstractC1104Gy.h();
            }
            return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(kotlin.text.d.g(kotlin.text.d.m(kotlin.text.d.m(strI, "|SITEKEY|", strH), "|ACTION|", str2))));
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            Uri url;
            return shouldInterceptRequest(webView, (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
        }
    }
}
