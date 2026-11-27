package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: My, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1571My implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final WebView g;

    @NonNull
    public final SpinKitView h;

    @NonNull
    public final ConstraintLayout i;

    @NonNull
    public final SpinKitView j;

    public C1571My(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull WebView webView, @NonNull SpinKitView spinKitView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull SpinKitView spinKitView2) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = webView;
        this.h = spinKitView;
        this.i = constraintLayout2;
        this.j = spinKitView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
