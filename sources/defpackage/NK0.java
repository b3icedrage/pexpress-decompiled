package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.appbar.AppBarLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class NK0 implements InterfaceC6965uM1 {
    public Object d;

    public NK0(int i) {
        switch (i) {
            case 1:
                this.d = new C3049bx(new AbstractC6598sd0[0]);
                break;
        }
    }

    @Override // defpackage.InterfaceC6856tq
    public void E() {
        OK0 ok0 = (OK0) this.d;
        if (ok0 != null) {
            ok0.h.destroy();
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
        View viewInflate = inflater.inflate(R.layout.knowledge_base_web_view_fragment, viewGroup, false);
        int i = R.id.appBarLayout;
        if (((AppBarLayout) C3476e.h(viewInflate, R.id.appBarLayout)) != null) {
            i = R.id.hexagon_loading;
            if (((SpinKitView) C3476e.h(viewInflate, R.id.hexagon_loading)) != null) {
                i = R.id.loading_view_holder;
                FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.loading_view_holder);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    int i2 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) C3476e.h(viewInflate, R.id.toolbar);
                    if (toolbar != null) {
                        i2 = R.id.web_view;
                        WebView webView = (WebView) C3476e.h(viewInflate, R.id.web_view);
                        if (webView != null) {
                            this.d = new OK0(constraintLayout, frameLayout, toolbar, webView);
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
        OK0 ok0 = (OK0) this.d;
        if (ok0 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        FrameLayout loadingViewHolder = ok0.e;
        Intrinsics.checkNotNullExpressionValue(loadingViewHolder, "loadingViewHolder");
        return loadingViewHolder;
    }

    @Override // defpackage.InterfaceC6965uM1
    @NotNull
    public Toolbar d() {
        OK0 ok0 = (OK0) this.d;
        if (ok0 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        Toolbar toolbar = ok0.g;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        return toolbar;
    }

    @Override // defpackage.InterfaceC7877yh2
    @NotNull
    public WebView f() {
        OK0 ok0 = (OK0) this.d;
        if (ok0 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        WebView webView = ok0.h;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        return webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumC6808td0 r(QS0 qs0) {
        C3049bx c3049bx = (C3049bx) this.d;
        c3049bx.b();
        for (AbstractC6598sd0 abstractC6598sd0 : (AbstractC6598sd0[]) c3049bx.g) {
            abstractC6598sd0.q();
        }
        return EnumC6808td0.e;
    }
}
