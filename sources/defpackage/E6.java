package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes.dex */
public final class E6 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final MaterialCardView e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final TextView h;

    public E6(@NonNull FrameLayout frameLayout, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.d = frameLayout;
        this.e = materialCardView;
        this.g = imageView;
        this.h = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
