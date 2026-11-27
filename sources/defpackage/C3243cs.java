package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3243cs implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final View e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    public C3243cs(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = view;
        this.g = textView;
        this.h = textView2;
    }

    @NonNull
    public static C3243cs b(@NonNull View view) {
        int i = R.id.divider;
        View viewH = C3476e.h(view, R.id.divider);
        if (viewH != null) {
            i = R.id.item_description;
            TextView textView = (TextView) C3476e.h(view, R.id.item_description);
            if (textView != null) {
                i = R.id.item_value;
                TextView textView2 = (TextView) C3476e.h(view, R.id.item_value);
                if (textView2 != null) {
                    return new C3243cs((ConstraintLayout) view, viewH, textView, textView2);
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
