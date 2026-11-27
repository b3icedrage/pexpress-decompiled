package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.api.resources.CenteredToolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class I4 extends H4 {

    @NotNull
    public final InterfaceC2773ah1 d;

    @NotNull
    public final C5027l8 e;

    @NotNull
    public final Pa2 g;

    @NotNull
    public final AbstractC4595j5 h;

    @NotNull
    public final AbstractC3917g5 i;

    @Nullable
    public WebView j;

    @Nullable
    public C3625eh1 k;

    public I4(@NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull C5027l8 addWebViewToHolderUseCase, @NotNull Pa2 urlsProvider, @NotNull AbstractC4595j5 webViewClient, @NotNull AbstractC3917g5 webChromeClient) {
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(addWebViewToHolderUseCase, "addWebViewToHolderUseCase");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(webChromeClient, "webChromeClient");
        this.d = preloadedWebViewUseCase;
        this.e = addWebViewToHolderUseCase;
        this.g = urlsProvider;
        this.h = webViewClient;
        this.i = webChromeClient;
    }

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        C3625eh1 c3625eh1 = this.k;
        Intrinsics.checkNotNull(c3625eh1);
        FrameLayout holder = c3625eh1.i;
        Intrinsics.checkNotNullExpressionValue(holder, "preloadedCommonViewHolder");
        this.e.getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeAllViews();
        this.d.g();
        this.k = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C3625eh1 c3625eh1B = C3625eh1.b(inflater, viewGroup);
        this.k = c3625eh1B;
        Intrinsics.checkNotNull(c3625eh1B);
        c3625eh1B.e.setShowLogo(false);
        InterfaceC2773ah1 interfaceC2773ah1 = this.d;
        WebView webViewF = interfaceC2773ah1.f();
        if (webViewF != null) {
            this.j = webViewF;
            C3625eh1 c3625eh1 = this.k;
            Intrinsics.checkNotNull(c3625eh1);
            FrameLayout preloadedCommonViewHolder = c3625eh1.i;
            Intrinsics.checkNotNullExpressionValue(preloadedCommonViewHolder, "preloadedCommonViewHolder");
            this.e.getClass();
            C5027l8.c(webViewF, preloadedCommonViewHolder);
            interfaceC2773ah1.j(this.g.y(), this.h, this.i);
        }
        C3625eh1 c3625eh2 = this.k;
        Intrinsics.checkNotNull(c3625eh2);
        FrameLayout frameLayout = c3625eh2.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // defpackage.H4, defpackage.InterfaceC7877yh2
    public final View Y() {
        C3625eh1 c3625eh1 = this.k;
        Intrinsics.checkNotNull(c3625eh1);
        ImageButton preloadedCommonReloadButton = c3625eh1.h;
        Intrinsics.checkNotNullExpressionValue(preloadedCommonReloadButton, "preloadedCommonReloadButton");
        return preloadedCommonReloadButton;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public final FrameLayout a0() {
        C3625eh1 c3625eh1 = this.k;
        Intrinsics.checkNotNull(c3625eh1);
        FrameLayout preloadedCommonLoadingViewHolder = c3625eh1.g;
        Intrinsics.checkNotNullExpressionValue(preloadedCommonLoadingViewHolder, "preloadedCommonLoadingViewHolder");
        return preloadedCommonLoadingViewHolder;
    }

    @Override // defpackage.InterfaceC6965uM1
    @NotNull
    public final Toolbar d() {
        C3625eh1 c3625eh1 = this.k;
        Intrinsics.checkNotNull(c3625eh1);
        CenteredToolbar preloadedCommonWebViewToolbar = c3625eh1.j;
        Intrinsics.checkNotNullExpressionValue(preloadedCommonWebViewToolbar, "preloadedCommonWebViewToolbar");
        return preloadedCommonWebViewToolbar;
    }

    @Override // defpackage.InterfaceC7877yh2
    @Nullable
    public final WebView f() {
        return this.j;
    }
}
