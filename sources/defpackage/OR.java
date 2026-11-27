package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.api.feature.analytics.reporters.ReporterApi;
import io.sentry.android.core.b0;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class OR extends WebViewClient {

    @Nullable
    public final ReporterApi a;

    @NotNull
    public Function1<? super WebView, Unit> b;

    @NotNull
    public Function0<Unit> c;

    @Nullable
    public Kh2 d;

    public OR() {
        this(null);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        if (webView != null) {
            WeakHashMap<WebView, String> weakHashMap = ZD1.a;
            Intrinsics.checkNotNullParameter(webView, "webView");
            WeakHashMap<WebView, String> weakHashMap2 = ZD1.a;
            synchronized (weakHashMap2) {
                try {
                    String str2 = weakHashMap2.get(webView);
                    if (str2 == null) {
                        return;
                    }
                    WebHistoryItem currentItem = webView.copyBackForwardList().getCurrentItem();
                    String originalUrl = currentItem != null ? currentItem.getOriginalUrl() : null;
                    if (!(str != null && Intrinsics.a(StringsKt.e0(str2, '/'), StringsKt.e0(str, '/')))) {
                        if (!(originalUrl != null && Intrinsics.a(StringsKt.e0(str2, '/'), StringsKt.e0(originalUrl, '/')))) {
                            return;
                        }
                    }
                    weakHashMap2.remove(webView);
                    webView.clearHistory();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        this.c.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        b0.c("ERROR_WEB_VIEW", String.valueOf(renderProcessGoneDetail));
        if (webView != null) {
            webView.destroy();
        }
        this.b.invoke(webView);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        String string;
        Kh2 kh2 = this.d;
        if (kh2 == null || webView == null || webResourceRequest == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        Uri url = webResourceRequest.getUrl();
        if (url == null || (string = url.toString()) == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC2205Va0 interfaceC2205Va0A = kh2.a(context, string, webResourceRequest.isForMainFrame());
        if (Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.g.a)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (interfaceC2205Va0A instanceof InterfaceC2205Va0.f) {
            webView.post(new O8(1, webView, (InterfaceC2205Va0.f) interfaceC2205Va0A));
            return true;
        }
        if (Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.h.a) || Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.d.a) || Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.e.a) || Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.b.a) || Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.c.a) || Intrinsics.a(interfaceC2205Va0A, InterfaceC2205Va0.a.a)) {
            return true;
        }
        throw new C6489s51();
    }

    public OR(@Nullable ReporterApi reporterApi) {
        this.a = reporterApi;
        this.b = new C4195hQ(1);
        this.c = new NR(0);
    }
}
