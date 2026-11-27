package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ui2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7040ui2 implements InterfaceC6830ti2 {

    @NotNull
    public final Context a;

    @NotNull
    public final E41 b;

    @NotNull
    public final Handler c;

    /* JADX INFO: renamed from: ui2$a */
    public final class a extends WebViewClient {

        @NotNull
        public final WebView a;
        public boolean b;
        public final /* synthetic */ C7040ui2 c;

        public a(@NotNull C7040ui2 c7040ui2, WebView window) {
            Intrinsics.checkNotNullParameter(window, "window");
            this.c = c7040ui2;
            this.a = window;
        }

        public final void a(String url) {
            D41 d41A;
            if (this.b || url.equals("about:blank")) {
                return;
            }
            this.b = true;
            this.a.stopLoading();
            C7040ui2 c7040ui2 = this.c;
            c7040ui2.c.post(new RunnableC4408iR(this, 2));
            E41 e41 = c7040ui2.b;
            e41.getClass();
            Context context = c7040ui2.a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Set<String> set = C6620si2.a;
            Intrinsics.checkNotNullParameter(url, "url");
            if (CollectionsKt.z(C6620si2.a, C6620si2.b(url))) {
                d41A = e41.a(context, url);
            } else if (C6620si2.a(url)) {
                d41A = D41.g.a;
            } else {
                InterfaceC2205Va0 interfaceC2205Va0A = e41.a.a(context, url, true);
                d41A = interfaceC2205Va0A instanceof InterfaceC2205Va0.f ? e41.a(context, ((InterfaceC2205Va0.f) interfaceC2205Va0A).a) : new D41.a(interfaceC2205Va0A);
            }
            d41A.getClass();
            C6620si2.b(url);
            Uri.parse(url).getHost();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            if (str != null) {
                a(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            Uri url;
            String string;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                return true;
            }
            a(string);
            return true;
        }
    }

    public C7040ui2(@NotNull Context context, @NotNull Kh2 externalLinks, @NotNull InterfaceC7874yh appLinkLauncher, @NotNull BR customTabs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalLinks, "externalLinks");
        Intrinsics.checkNotNullParameter(appLinkLauncher, "appLinkLauncher");
        Intrinsics.checkNotNullParameter(customTabs, "customTabs");
        this.a = context;
        this.b = new E41(externalLinks, appLinkLauncher, customTabs);
        this.c = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.InterfaceC6830ti2
    public final boolean a(@NotNull WebView opener, @NotNull Message resultMsg) {
        Intrinsics.checkNotNullParameter(opener, "opener");
        Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
        Object obj = resultMsg.obj;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        WebView webView = new WebView(opener.getContext());
        a aVar = new a(this, webView);
        webView.setWebViewClient(aVar);
        webViewTransport.setWebView(webView);
        resultMsg.sendToTarget();
        this.c.postDelayed(new RunnableC6824th0(aVar, 2), 10000L);
        return true;
    }
}
