package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Zv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2611Zv1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    public C2611Zv1(@NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.d = constraintLayout;
        this.e = imageView;
        this.g = textView;
        this.h = textView2;
    }

    @NonNull
    public static C2611Zv1 b(@NonNull View view) {
        int i = R.id.settings_icon;
        ImageView imageView = (ImageView) C3476e.h(view, R.id.settings_icon);
        if (imageView != null) {
            i = R.id.settings_title_text;
            TextView textView = (TextView) C3476e.h(view, R.id.settings_title_text);
            if (textView != null) {
                i = R.id.settings_value_text;
                TextView textView2 = (TextView) C3476e.h(view, R.id.settings_value_text);
                if (textView2 != null) {
                    return new C2611Zv1(imageView, textView, textView2, (ConstraintLayout) view);
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
