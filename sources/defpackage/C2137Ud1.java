package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.api.resources.WebViewLoaderView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ud1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2137Ud1 implements InterfaceC2059Td1 {

    @Nullable
    public C5764oe1 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC7877yh2
    public final void F(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // defpackage.InterfaceC6856tq
    @Nullable
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.platform_fragment, viewGroup, false);
        int i = R.id.loader_view;
        if (((WebViewLoaderView) C3476e.h(viewInflate, R.id.loader_view)) != null) {
            i = R.id.loading_view_holder;
            FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.loading_view_holder);
            if (frameLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                WebView webView = (WebView) C3476e.h(viewInflate, R.id.platform_web_view);
                if (webView != null) {
                    this.d = new C5764oe1(frameLayout2, frameLayout, webView);
                    return frameLayout2;
                }
                i = R.id.platform_web_view;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC7877yh2
    @Nullable
    public final View Y() {
        return null;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public final FrameLayout a0() {
        C5764oe1 c5764oe1 = this.d;
        Intrinsics.checkNotNull(c5764oe1);
        FrameLayout loadingViewHolder = c5764oe1.e;
        Intrinsics.checkNotNullExpressionValue(loadingViewHolder, "loadingViewHolder");
        return loadingViewHolder;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public final WebView f() {
        C5764oe1 c5764oe1 = this.d;
        Intrinsics.checkNotNull(c5764oe1);
        WebView platformWebView = c5764oe1.g;
        Intrinsics.checkNotNullExpressionValue(platformWebView, "platformWebView");
        return platformWebView;
    }
}
