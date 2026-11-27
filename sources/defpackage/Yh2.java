package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CenteredToolbar;

/* JADX INFO: loaded from: classes.dex */
public final class Yh2 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final FrameLayout e;

    @NonNull
    public final CenteredToolbar g;

    @NonNull
    public final WebView h;

    public Yh2(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull CenteredToolbar centeredToolbar, @NonNull WebView webView) {
        this.d = constraintLayout;
        this.e = frameLayout;
        this.g = centeredToolbar;
        this.h = webView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
