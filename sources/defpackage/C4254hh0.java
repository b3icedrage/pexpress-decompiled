package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: hh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4254hh0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final ImageView g;

    public C4254hh0(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = imageView;
    }

    @NonNull
    public static C4254hh0 b(@NonNull View view) {
        int i = R.id.footer_item_description;
        TextView textView = (TextView) C3476e.h(view, R.id.footer_item_description);
        if (textView != null) {
            i = R.id.footer_item_icon;
            ImageView imageView = (ImageView) C3476e.h(view, R.id.footer_item_icon);
            if (imageView != null) {
                return new C4254hh0((ConstraintLayout) view, textView, imageView);
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
