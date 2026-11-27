package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.api.resources.CenteredToolbar;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class EX implements InterfaceC6965uM1 {

    @NotNull
    public final InterfaceC2773ah1 d;

    @NotNull
    public final C5027l8 e;

    @Nullable
    public WebView g;

    @Nullable
    public C3625eh1 h;

    public EX(@NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull C5027l8 addWebViewToHolderUseCase) {
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(addWebViewToHolderUseCase, "addWebViewToHolderUseCase");
        this.d = preloadedWebViewUseCase;
        this.e = addWebViewToHolderUseCase;
    }

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        C3625eh1 c3625eh1 = this.h;
        Intrinsics.checkNotNull(c3625eh1);
        FrameLayout holder = c3625eh1.i;
        Intrinsics.checkNotNullExpressionValue(holder, "preloadedCommonViewHolder");
        this.e.getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeAllViews();
        this.h = null;
    }

    @Override // defpackage.InterfaceC7877yh2
    public final void F(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C3625eh1 c3625eh1B = C3625eh1.b(inflater, viewGroup);
        this.h = c3625eh1B;
        Intrinsics.checkNotNull(c3625eh1B);
        c3625eh1B.g.setBackgroundResource(R.color.black);
        C3625eh1 c3625eh1 = this.h;
        Intrinsics.checkNotNull(c3625eh1);
        c3625eh1.e.setShowSecurityNote(true);
        WebView webViewF = this.d.f();
        if (webViewF != null) {
            this.g = webViewF;
            C3625eh1 c3625eh2 = this.h;
            Intrinsics.checkNotNull(c3625eh2);
            FrameLayout preloadedCommonViewHolder = c3625eh2.i;
            Intrinsics.checkNotNullExpressionValue(preloadedCommonViewHolder, "preloadedCommonViewHolder");
            this.e.getClass();
            C5027l8.c(webViewF, preloadedCommonViewHolder);
        }
        C3625eh1 c3625eh3 = this.h;
        Intrinsics.checkNotNull(c3625eh3);
        FrameLayout frameLayout = c3625eh3.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // defpackage.InterfaceC7877yh2
    public final View Y() {
        C3625eh1 c3625eh1 = this.h;
        Intrinsics.checkNotNull(c3625eh1);
        ImageButton preloadedCommonReloadButton = c3625eh1.h;
        Intrinsics.checkNotNullExpressionValue(preloadedCommonReloadButton, "preloadedCommonReloadButton");
        return preloadedCommonReloadButton;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public final FrameLayout a0() {
        C3625eh1 c3625eh1 = this.h;
        Intrinsics.checkNotNull(c3625eh1);
        FrameLayout preloadedCommonLoadingViewHolder = c3625eh1.g;
        Intrinsics.checkNotNullExpressionValue(preloadedCommonLoadingViewHolder, "preloadedCommonLoadingViewHolder");
        return preloadedCommonLoadingViewHolder;
    }

    @Override // defpackage.InterfaceC6965uM1
    @NotNull
    public final Toolbar d() {
        C3625eh1 c3625eh1 = this.h;
        Intrinsics.checkNotNull(c3625eh1);
        CenteredToolbar preloadedCommonWebViewToolbar = c3625eh1.j;
        Intrinsics.checkNotNullExpressionValue(preloadedCommonWebViewToolbar, "preloadedCommonWebViewToolbar");
        return preloadedCommonWebViewToolbar;
    }

    @Override // defpackage.InterfaceC7877yh2
    @Nullable
    public final WebView f() {
        return this.g;
    }
}
