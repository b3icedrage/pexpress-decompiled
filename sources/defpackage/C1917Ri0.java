package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: Ri0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1917Ri0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final LottieAnimationView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    public C1917Ri0(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = lottieAnimationView;
        this.g = textView;
        this.h = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
