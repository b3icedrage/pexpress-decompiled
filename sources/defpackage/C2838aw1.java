package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: aw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2838aw1 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    public C2838aw1(@NonNull MaterialCardView materialCardView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = materialCardView;
        this.e = imageView;
        this.g = textView;
        this.h = textView2;
    }

    @NonNull
    public static C2838aw1 b(@NonNull View view) {
        int i = R.id.ic_settings_item;
        ImageView imageView = (ImageView) C3476e.h(view, R.id.ic_settings_item);
        if (imageView != null) {
            i = R.id.settings_description_text;
            TextView textView = (TextView) C3476e.h(view, R.id.settings_description_text);
            if (textView != null) {
                i = R.id.settings_header_text;
                TextView textView2 = (TextView) C3476e.h(view, R.id.settings_header_text);
                if (textView2 != null) {
                    MaterialCardView materialCardView = (MaterialCardView) view;
                    if (((ConstraintLayout) C3476e.h(view, R.id.trading_strategies_strategy_layout)) != null) {
                        return new C2838aw1(materialCardView, imageView, textView, textView2);
                    }
                    i = R.id.trading_strategies_strategy_layout;
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
