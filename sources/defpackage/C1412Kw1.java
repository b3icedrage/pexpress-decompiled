package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Kw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1412Kw1 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final MaterialCardView e;

    @NonNull
    public final MaterialRadioButton g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    public C1412Kw1(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = materialCardView;
        this.e = materialCardView2;
        this.g = materialRadioButton;
        this.h = textView;
        this.i = textView2;
    }

    @NonNull
    public static C1412Kw1 b(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.strategy_radio_button;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) C3476e.h(view, R.id.strategy_radio_button);
        if (materialRadioButton != null) {
            i = R.id.trading_strategies_strategy_description;
            TextView textView = (TextView) C3476e.h(view, R.id.trading_strategies_strategy_description);
            if (textView != null) {
                i = R.id.trading_strategies_strategy_layout;
                if (((ConstraintLayout) C3476e.h(view, R.id.trading_strategies_strategy_layout)) != null) {
                    i = R.id.trading_strategies_strategy_title;
                    TextView textView2 = (TextView) C3476e.h(view, R.id.trading_strategies_strategy_title);
                    if (textView2 != null) {
                        return new C1412Kw1(materialCardView, materialCardView, materialRadioButton, textView, textView2);
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
