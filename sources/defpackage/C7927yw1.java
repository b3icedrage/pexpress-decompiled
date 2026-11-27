package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: yw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7927yw1 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final MaterialCardView e;

    @NonNull
    public final MaterialRadioButton g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final ShimmerFrameLayout j;

    public C7927yw1(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ShimmerFrameLayout shimmerFrameLayout) {
        this.d = materialCardView;
        this.e = materialCardView2;
        this.g = materialRadioButton;
        this.h = textView;
        this.i = textView2;
        this.j = shimmerFrameLayout;
    }

    @NonNull
    public static C7927yw1 b(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.account_radio_button;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) C3476e.h(view, R.id.account_radio_button);
        if (materialRadioButton != null) {
            i = R.id.account_selection_account_layout;
            if (((ConstraintLayout) C3476e.h(view, R.id.account_selection_account_layout)) != null) {
                i = R.id.account_selection_account_title;
                TextView textView = (TextView) C3476e.h(view, R.id.account_selection_account_title);
                if (textView != null) {
                    i = R.id.account_value;
                    TextView textView2 = (TextView) C3476e.h(view, R.id.account_value);
                    if (textView2 != null) {
                        i = R.id.account_value_shimmer;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(view, R.id.account_value_shimmer);
                        if (shimmerFrameLayout != null) {
                            return new C7927yw1(materialCardView, materialCardView, materialRadioButton, textView, textView2, shimmerFrameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
