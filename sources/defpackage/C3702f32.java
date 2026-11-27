package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: f32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3702f32 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final View e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final TextView h;

    @NonNull
    public final ImageButton i;

    @NonNull
    public final ConstraintLayout j;

    @NonNull
    public final TextView k;

    @NonNull
    public final ImageView l;

    @NonNull
    public final ImageView m;

    @NonNull
    public final ImageView n;

    @NonNull
    public final MaterialRadioButton o;

    @NonNull
    public final TextView p;

    @NonNull
    public final TextView q;

    @NonNull
    public final MaterialButton r;

    @NonNull
    public final ShimmerFrameLayout s;

    @NonNull
    public final ProgressBar t;

    public C3702f32(@NonNull MaterialCardView materialCardView, @NonNull View view, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull MaterialButton materialButton2, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull ProgressBar progressBar) {
        this.d = materialCardView;
        this.e = view;
        this.g = materialButton;
        this.h = textView;
        this.i = imageButton;
        this.j = constraintLayout;
        this.k = textView2;
        this.l = imageView;
        this.m = imageView2;
        this.n = imageView3;
        this.o = materialRadioButton;
        this.p = textView3;
        this.q = textView4;
        this.r = materialButton2;
        this.s = shimmerFrameLayout;
        this.t = progressBar;
    }

    @NonNull
    public static C3702f32 b(@NonNull View view) {
        int i = R.id.btn_spacer;
        View viewH = C3476e.h(view, R.id.btn_spacer);
        if (viewH != null) {
            i = R.id.indicator_edit_btn;
            MaterialButton materialButton = (MaterialButton) C3476e.h(view, R.id.indicator_edit_btn);
            if (materialButton != null) {
                i = R.id.indicator_params_description;
                TextView textView = (TextView) C3476e.h(view, R.id.indicator_params_description);
                if (textView != null) {
                    i = R.id.indicator_selection_arrow_next_button;
                    ImageButton imageButton = (ImageButton) C3476e.h(view, R.id.indicator_selection_arrow_next_button);
                    if (imageButton != null) {
                        i = R.id.indicator_selection_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C3476e.h(view, R.id.indicator_selection_container);
                        if (constraintLayout != null) {
                            i = R.id.indicator_selection_description;
                            TextView textView2 = (TextView) C3476e.h(view, R.id.indicator_selection_description);
                            if (textView2 != null) {
                                i = R.id.indicator_selection_illustration;
                                ImageView imageView = (ImageView) C3476e.h(view, R.id.indicator_selection_illustration);
                                if (imageView != null) {
                                    i = R.id.indicator_selection_lock_icon_v1;
                                    ImageView imageView2 = (ImageView) C3476e.h(view, R.id.indicator_selection_lock_icon_v1);
                                    if (imageView2 != null) {
                                        i = R.id.indicator_selection_lock_icon_v2;
                                        ImageView imageView3 = (ImageView) C3476e.h(view, R.id.indicator_selection_lock_icon_v2);
                                        if (imageView3 != null) {
                                            MaterialCardView materialCardView = (MaterialCardView) view;
                                            i = R.id.indicator_selection_radio_button;
                                            MaterialRadioButton materialRadioButton = (MaterialRadioButton) C3476e.h(view, R.id.indicator_selection_radio_button);
                                            if (materialRadioButton != null) {
                                                i = R.id.indicator_selection_title;
                                                TextView textView3 = (TextView) C3476e.h(view, R.id.indicator_selection_title);
                                                if (textView3 != null) {
                                                    i = R.id.indicator_shimmer_image;
                                                    if (((ImageView) C3476e.h(view, R.id.indicator_shimmer_image)) != null) {
                                                        i = R.id.indicator_shimmer_label_1;
                                                        if (((MaterialCardView) C3476e.h(view, R.id.indicator_shimmer_label_1)) != null) {
                                                            i = R.id.indicator_shimmer_label_2;
                                                            if (((MaterialCardView) C3476e.h(view, R.id.indicator_shimmer_label_2)) != null) {
                                                                i = R.id.indicator_shimmer_label_3;
                                                                if (((MaterialCardView) C3476e.h(view, R.id.indicator_shimmer_label_3)) != null) {
                                                                    i = R.id.indicator_show_details;
                                                                    TextView textView4 = (TextView) C3476e.h(view, R.id.indicator_show_details);
                                                                    if (textView4 != null) {
                                                                        i = R.id.indicator_show_details_btn;
                                                                        MaterialButton materialButton2 = (MaterialButton) C3476e.h(view, R.id.indicator_show_details_btn);
                                                                        if (materialButton2 != null) {
                                                                            i = R.id.robot_trading_indicator_selection_shimmer_container;
                                                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(view, R.id.robot_trading_indicator_selection_shimmer_container);
                                                                            if (shimmerFrameLayout != null) {
                                                                                i = R.id.trading_indicator_progress_bar;
                                                                                ProgressBar progressBar = (ProgressBar) C3476e.h(view, R.id.trading_indicator_progress_bar);
                                                                                if (progressBar != null) {
                                                                                    return new C3702f32(materialCardView, viewH, materialButton, textView, imageButton, constraintLayout, textView2, imageView, imageView2, imageView3, materialRadioButton, textView3, textView4, materialButton2, shimmerFrameLayout, progressBar);
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
