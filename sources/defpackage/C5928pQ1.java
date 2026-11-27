package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: pQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5928pQ1 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    public C5928pQ1(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = linearLayout;
        this.e = imageView;
        this.g = imageView2;
        this.h = textView;
        this.i = textView2;
    }

    @NonNull
    public static C5928pQ1 b(@NonNull View view) {
        int i = R.id.activation_top_steps_inner_circle;
        ImageView imageView = (ImageView) C3476e.h(view, R.id.activation_top_steps_inner_circle);
        if (imageView != null) {
            i = R.id.activation_top_steps_middle_circle;
            ImageView imageView2 = (ImageView) C3476e.h(view, R.id.activation_top_steps_middle_circle);
            if (imageView2 != null) {
                i = R.id.activation_top_steps_outer_circle;
                if (((ImageView) C3476e.h(view, R.id.activation_top_steps_outer_circle)) != null) {
                    i = R.id.activation_top_steps_step_name;
                    TextView textView = (TextView) C3476e.h(view, R.id.activation_top_steps_step_name);
                    if (textView != null) {
                        i = R.id.activation_top_steps_step_number;
                        TextView textView2 = (TextView) C3476e.h(view, R.id.activation_top_steps_step_number);
                        if (textView2 != null) {
                            return new C5928pQ1((LinearLayout) view, imageView, imageView2, textView, textView2);
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
