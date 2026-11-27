package defpackage;

import android.annotation.SuppressLint;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Dh2 implements Ch2 {

    @NotNull
    public final OL0 a;

    @NotNull
    public final RL0 b;

    @NotNull
    public final AbstractC3104cC c;

    @NotNull
    public final Nh2 d;

    @NotNull
    public final Kh2 e;

    @NotNull
    public final Eh2 f;

    @NotNull
    public final InterfaceC6830ti2 g;

    public Dh2(@NotNull C4923kf appData, @NotNull OL0 languageCookieManager, @NotNull RL0 languageListCommon, @NotNull AbstractC3104cC ciSessionProviderApi, @NotNull Nh2 webViewFileChooser, @NotNull Kh2 webViewExternalLinks, @NotNull Eh2 webViewDownloads, @NotNull InterfaceC6830ti2 webViewWindows) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(languageCookieManager, "languageCookieManager");
        Intrinsics.checkNotNullParameter(languageListCommon, "languageListCommon");
        Intrinsics.checkNotNullParameter(ciSessionProviderApi, "ciSessionProviderApi");
        Intrinsics.checkNotNullParameter(webViewFileChooser, "webViewFileChooser");
        Intrinsics.checkNotNullParameter(webViewExternalLinks, "webViewExternalLinks");
        Intrinsics.checkNotNullParameter(webViewDownloads, "webViewDownloads");
        Intrinsics.checkNotNullParameter(webViewWindows, "webViewWindows");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(languageCookieManager, "languageCookieManager");
        Intrinsics.checkNotNullParameter(languageListCommon, "languageListCommon");
        this.a = languageCookieManager;
        this.b = languageListCommon;
        this.c = ciSessionProviderApi;
        this.d = webViewFileChooser;
        this.e = webViewExternalLinks;
        this.f = webViewDownloads;
        this.g = webViewWindows;
    }

    @Override // defpackage.Ch2
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(@NotNull WebView webView, @NotNull OR customWebViewClient, @NotNull KR customWebChromeClient) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Nh2 nh2 = this.d;
        if (nh2 != null) {
            nh2.a();
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setScrollBarStyle(33554432);
        webView.setScrollbarFadingEnabled(false);
        customWebViewClient.d = this.e;
        webView.setWebViewClient(customWebViewClient);
        customWebChromeClient.j = nh2;
        customWebChromeClient.k = this.g;
        webView.setWebChromeClient(customWebChromeClient);
        Eh2 eh2 = this.f;
        if (eh2 != null) {
            eh2.a(webView);
        }
    }

    @Override // defpackage.Ch2
    public final void b(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.g == null) {
            return;
        }
        webView.getSettings().setSupportMultipleWindows(true);
    }

    @Override // defpackage.Ch2
    public final void c(@NotNull WebView webView, @NotNull String domain) {
        String strA;
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(webView, "webView");
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        Intrinsics.checkNotNull(cookieManager);
        String str = (String) this.c.o().d.getValue();
        String strM = (str == null || (strA = C2884b82.a(str)) == null) ? null : d.m(strA, "+", "%20");
        if (strM == null) {
            strM = "";
        }
        ZM.b(cookieManager, domain, "ci_session", strM);
        Intrinsics.checkNotNullParameter(cookieManager, "<this>");
        Intrinsics.checkNotNullParameter(domain, "domain");
        OL0 ol0 = this.a;
        ol0.getClass();
        ZM.b(cookieManager, domain, "lang", ol0.a(this.b.defaultValue()));
    }
}
