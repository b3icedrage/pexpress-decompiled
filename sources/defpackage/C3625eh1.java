package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.api.resources.CenteredToolbar;
import com.api.resources.WebViewLoaderView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: eh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3625eh1 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final WebViewLoaderView e;

    @NonNull
    public final FrameLayout g;

    @NonNull
    public final ImageButton h;

    @NonNull
    public final FrameLayout i;

    @NonNull
    public final CenteredToolbar j;

    public C3625eh1(@NonNull FrameLayout frameLayout, @NonNull WebViewLoaderView webViewLoaderView, @NonNull FrameLayout frameLayout2, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout3, @NonNull CenteredToolbar centeredToolbar) {
        this.d = frameLayout;
        this.e = webViewLoaderView;
        this.g = frameLayout2;
        this.h = imageButton;
        this.i = frameLayout3;
        this.j = centeredToolbar;
    }

    @NonNull
    public static C3625eh1 b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.preloaded_webview_common_fragment, viewGroup, false);
        int i = R.id.preloaded_common_loader_view;
        WebViewLoaderView webViewLoaderView = (WebViewLoaderView) C3476e.h(viewInflate, R.id.preloaded_common_loader_view);
        if (webViewLoaderView != null) {
            i = R.id.preloaded_common_loading_view_holder;
            FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.preloaded_common_loading_view_holder);
            if (frameLayout != null) {
                i = R.id.preloaded_common_reload_button;
                ImageButton imageButton = (ImageButton) C3476e.h(viewInflate, R.id.preloaded_common_reload_button);
                if (imageButton != null) {
                    i = R.id.preloaded_common_view_holder;
                    FrameLayout frameLayout2 = (FrameLayout) C3476e.h(viewInflate, R.id.preloaded_common_view_holder);
                    if (frameLayout2 != null) {
                        i = R.id.preloaded_common_web_view_container;
                        if (((LinearLayout) C3476e.h(viewInflate, R.id.preloaded_common_web_view_container)) != null) {
                            i = R.id.preloaded_common_web_view_toolbar;
                            CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.preloaded_common_web_view_toolbar);
                            if (centeredToolbar != null) {
                                return new C3625eh1((FrameLayout) viewInflate, webViewLoaderView, frameLayout, imageButton, frameLayout2, centeredToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
