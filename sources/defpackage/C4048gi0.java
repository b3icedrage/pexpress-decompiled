package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.rongi.rotate_layout.layout.RotateLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: gi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4048gi0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Button e;

    @NonNull
    public final FrameLayout g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final Button i;

    @NonNull
    public final TextView j;

    @NonNull
    public final TextView k;

    public C4048gi0(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = button;
        this.g = frameLayout;
        this.h = imageView;
        this.i = button2;
        this.j = textView;
        this.k = textView2;
    }

    @NonNull
    public static C4048gi0 b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_default_dialog_rotated, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.active_btn;
        Button button = (Button) C3476e.h(viewInflate, R.id.active_btn);
        if (button != null) {
            i = R.id.active_btn_layout;
            FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.active_btn_layout);
            if (frameLayout != null) {
                i = R.id.button_view;
                if (((LinearLayout) C3476e.h(viewInflate, R.id.button_view)) != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.icon);
                    if (imageView != null) {
                        i = R.id.main_container;
                        if (((ConstraintLayout) C3476e.h(viewInflate, R.id.main_container)) != null) {
                            i = R.id.passive_btn;
                            Button button2 = (Button) C3476e.h(viewInflate, R.id.passive_btn);
                            if (button2 != null) {
                                i = R.id.progress_circular;
                                if (((SpinKitView) C3476e.h(viewInflate, R.id.progress_circular)) != null) {
                                    i = R.id.rotatableAppBar;
                                    if (((RotateLayout) C3476e.h(viewInflate, R.id.rotatableAppBar)) != null) {
                                        i = R.id.spacer;
                                        if (((Space) C3476e.h(viewInflate, R.id.spacer)) != null) {
                                            i = R.id.subtitle;
                                            TextView textView = (TextView) C3476e.h(viewInflate, R.id.subtitle);
                                            if (textView != null) {
                                                i = R.id.title;
                                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title);
                                                if (textView2 != null) {
                                                    return new C4048gi0((ConstraintLayout) viewInflate, button, frameLayout, imageView, button2, textView, textView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
