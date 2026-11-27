package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

/* JADX INFO: renamed from: Qi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1839Qi0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final DotsIndicator h;

    @NonNull
    public final ViewPager2 i;

    @NonNull
    public final ImageView j;

    public C1839Qi0(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull ImageView imageView, @NonNull DotsIndicator dotsIndicator, @NonNull ViewPager2 viewPager2, @NonNull ImageView imageView2) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = imageView;
        this.h = dotsIndicator;
        this.i = viewPager2;
        this.j = imageView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
