package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: oe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5764oe1 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final FrameLayout e;

    @NonNull
    public final WebView g;

    public C5764oe1(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull WebView webView) {
        this.d = frameLayout;
        this.e = frameLayout2;
        this.g = webView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
