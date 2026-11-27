package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import com.api.resources.WebViewLoaderView;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: renamed from: ci2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3211ci2 implements InterfaceC7441wd2 {

    @NonNull
    public final WebViewLoaderView d;

    @NonNull
    public final SpinKitView e;

    @NonNull
    public final LottieAnimationView g;

    @NonNull
    public final LinearLayout h;

    public C3211ci2(@NonNull WebViewLoaderView webViewLoaderView, @NonNull SpinKitView spinKitView, @NonNull LottieAnimationView lottieAnimationView, @NonNull LinearLayout linearLayout) {
        this.d = webViewLoaderView;
        this.e = spinKitView;
        this.g = lottieAnimationView;
        this.h = linearLayout;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
