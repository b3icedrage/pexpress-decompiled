package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes.dex */
public final class YZ1 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final SwitchMaterial g;

    @NonNull
    public final TextView h;

    public YZ1(@NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull SwitchMaterial switchMaterial, @NonNull TextView textView2) {
        this.d = materialCardView;
        this.e = textView;
        this.g = switchMaterial;
        this.h = textView2;
    }

    @NonNull
    public static YZ1 b(@NonNull View view) {
        int i = R.id.item_description;
        TextView textView = (TextView) C3476e.h(view, R.id.item_description);
        if (textView != null) {
            i = R.id.item_switch;
            SwitchMaterial switchMaterial = (SwitchMaterial) C3476e.h(view, R.id.item_switch);
            if (switchMaterial != null) {
                i = R.id.item_title;
                TextView textView2 = (TextView) C3476e.h(view, R.id.item_title);
                if (textView2 != null) {
                    return new YZ1((MaterialCardView) view, textView, switchMaterial, textView2);
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
