package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: c42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3077c42 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final ImageButton e;

    @NonNull
    public final TextView g;

    @NonNull
    public final ConstraintLayout h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final ImageView j;

    @NonNull
    public final MaterialRadioButton k;

    @NonNull
    public final TextView l;

    @NonNull
    public final ImageView m;

    @NonNull
    public final TextView n;

    @NonNull
    public final TextView o;

    @NonNull
    public final FrameLayout p;

    @NonNull
    public final TextView q;

    public C3077c42(@NonNull MaterialCardView materialCardView, @NonNull ImageButton imageButton, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FrameLayout frameLayout, @NonNull TextView textView5) {
        this.d = materialCardView;
        this.e = imageButton;
        this.g = textView;
        this.h = constraintLayout;
        this.i = imageView;
        this.j = imageView2;
        this.k = materialRadioButton;
        this.l = textView2;
        this.m = imageView3;
        this.n = textView3;
        this.o = textView4;
        this.p = frameLayout;
        this.q = textView5;
    }

    @NonNull
    public static C3077c42 b(@NonNull View view) {
        int i = R.id.strategy_selection_arrow_next_button;
        ImageButton imageButton = (ImageButton) C3476e.h(view, R.id.strategy_selection_arrow_next_button);
        if (imageButton != null) {
            i = R.id.strategy_selection_at_least;
            TextView textView = (TextView) C3476e.h(view, R.id.strategy_selection_at_least);
            if (textView != null) {
                i = R.id.strategy_selection_bottom_barrier;
                if (((Barrier) C3476e.h(view, R.id.strategy_selection_bottom_barrier)) != null) {
                    i = R.id.strategy_selection_bottom_spacer;
                    if (C3476e.h(view, R.id.strategy_selection_bottom_spacer) != null) {
                        i = R.id.strategy_selection_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C3476e.h(view, R.id.strategy_selection_container);
                        if (constraintLayout != null) {
                            i = R.id.strategy_selection_illustration;
                            ImageView imageView = (ImageView) C3476e.h(view, R.id.strategy_selection_illustration);
                            if (imageView != null) {
                                i = R.id.strategy_selection_lock_icon;
                                ImageView imageView2 = (ImageView) C3476e.h(view, R.id.strategy_selection_lock_icon);
                                if (imageView2 != null) {
                                    i = R.id.strategy_selection_radio_button;
                                    MaterialRadioButton materialRadioButton = (MaterialRadioButton) C3476e.h(view, R.id.strategy_selection_radio_button);
                                    if (materialRadioButton != null) {
                                        i = R.id.strategy_selection_recommended_balance;
                                        TextView textView2 = (TextView) C3476e.h(view, R.id.strategy_selection_recommended_balance);
                                        if (textView2 != null) {
                                            i = R.id.strategy_selection_risk_icon;
                                            ImageView imageView3 = (ImageView) C3476e.h(view, R.id.strategy_selection_risk_icon);
                                            if (imageView3 != null) {
                                                i = R.id.strategy_selection_risk_label;
                                                TextView textView3 = (TextView) C3476e.h(view, R.id.strategy_selection_risk_label);
                                                if (textView3 != null) {
                                                    i = R.id.strategy_selection_show_details;
                                                    TextView textView4 = (TextView) C3476e.h(view, R.id.strategy_selection_show_details);
                                                    if (textView4 != null) {
                                                        i = R.id.strategy_selection_show_details_frame;
                                                        FrameLayout frameLayout = (FrameLayout) C3476e.h(view, R.id.strategy_selection_show_details_frame);
                                                        if (frameLayout != null) {
                                                            i = R.id.strategy_selection_title;
                                                            TextView textView5 = (TextView) C3476e.h(view, R.id.strategy_selection_title);
                                                            if (textView5 != null) {
                                                                return new C3077c42((MaterialCardView) view, imageButton, textView, constraintLayout, imageView, imageView2, materialRadioButton, textView2, imageView3, textView3, textView4, frameLayout, textView5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
