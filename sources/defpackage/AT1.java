package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class AT1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final DotsIndicator e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final ViewPager2 h;

    public AT1(@NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull MaterialButton materialButton, @NonNull DotsIndicator dotsIndicator) {
        this.d = constraintLayout;
        this.e = dotsIndicator;
        this.g = materialButton;
        this.h = viewPager2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
