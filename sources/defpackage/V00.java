package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class V00 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final DotsIndicator g;

    @NonNull
    public final ViewPager2 h;

    public V00(@NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull MaterialButton materialButton, @NonNull DotsIndicator dotsIndicator) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = dotsIndicator;
        this.h = viewPager2;
    }

    @NonNull
    public static V00 b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_default, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button;
        MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.button);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = R.id.dots_indicator;
            DotsIndicator dotsIndicator = (DotsIndicator) C3476e.h(viewInflate, R.id.dots_indicator);
            if (dotsIndicator != null) {
                i2 = R.id.view_pager;
                ViewPager2 viewPager2 = (ViewPager2) C3476e.h(viewInflate, R.id.view_pager);
                if (viewPager2 != null) {
                    return new V00(constraintLayout, viewPager2, materialButton, dotsIndicator);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
