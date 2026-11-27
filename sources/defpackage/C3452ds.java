package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3452ds implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final SwitchMaterial h;

    public C3452ds(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SwitchMaterial switchMaterial) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = textView2;
        this.h = switchMaterial;
    }

    @NonNull
    public static C3452ds b(@NonNull View view) {
        int i = R.id.item_description;
        TextView textView = (TextView) C3476e.h(view, R.id.item_description);
        if (textView != null) {
            i = R.id.item_lower_description;
            TextView textView2 = (TextView) C3476e.h(view, R.id.item_lower_description);
            if (textView2 != null) {
                i = R.id.item_switch;
                SwitchMaterial switchMaterial = (SwitchMaterial) C3476e.h(view, R.id.item_switch);
                if (switchMaterial != null) {
                    return new C3452ds((ConstraintLayout) view, textView, textView2, switchMaterial);
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
