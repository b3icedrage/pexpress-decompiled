package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class OK0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final FrameLayout e;

    @NonNull
    public final Toolbar g;

    @NonNull
    public final WebView h;

    public OK0(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull Toolbar toolbar, @NonNull WebView webView) {
        this.d = constraintLayout;
        this.e = frameLayout;
        this.g = toolbar;
        this.h = webView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
