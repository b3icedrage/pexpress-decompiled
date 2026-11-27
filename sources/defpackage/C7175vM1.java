package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CenteredToolbar;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.appbar.AppBarLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7175vM1 implements InterfaceC6965uM1, C2943bS.b {
    public Object d;

    public /* synthetic */ C7175vM1(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC6856tq
    public void E() {
        Yh2 yh2 = (Yh2) this.d;
        if (yh2 != null) {
            yh2.h.destroy();
        } else {
            Intrinsics.l("binding");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC7877yh2
    public void F(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.web_view_fragment, viewGroup, false);
        int i = R.id.appBarLayout;
        if (((AppBarLayout) C3476e.h(viewInflate, R.id.appBarLayout)) != null) {
            i = R.id.hexagon_loading;
            if (((SpinKitView) C3476e.h(viewInflate, R.id.hexagon_loading)) != null) {
                i = R.id.loading_view_holder;
                FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.loading_view_holder);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    int i2 = R.id.toolbar;
                    CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.toolbar);
                    if (centeredToolbar != null) {
                        i2 = R.id.web_view;
                        WebView webView = (WebView) C3476e.h(viewInflate, R.id.web_view);
                        if (webView != null) {
                            this.d = new Yh2(constraintLayout, frameLayout, centeredToolbar, webView);
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                    i = i2;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC7877yh2
    @Nullable
    public View Y() {
        return null;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public FrameLayout a0() {
        Yh2 yh2 = (Yh2) this.d;
        if (yh2 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        FrameLayout loadingViewHolder = yh2.e;
        Intrinsics.checkNotNullExpressionValue(loadingViewHolder, "loadingViewHolder");
        return loadingViewHolder;
    }

    @Override // defpackage.InterfaceC6965uM1
    @NotNull
    public Toolbar d() {
        Yh2 yh2 = (Yh2) this.d;
        if (yh2 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        CenteredToolbar toolbar = yh2.g;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        return toolbar;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public WebView f() {
        Yh2 yh2 = (Yh2) this.d;
        if (yh2 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        WebView webView = yh2.h;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        return webView;
    }

    @Override // defpackage.C2943bS.b
    public Iterable r(Object obj) {
        return (Iterable) ((C4385iJ0) this.d).get((RI0) obj);
    }
}
