package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: iy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4559iy0 implements InterfaceC7441wd2 {

    @NonNull
    public final CardView d;

    @NonNull
    public final EditText e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    public C4559iy0(@NonNull CardView cardView, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = cardView;
        this.e = editText;
        this.g = textView;
        this.h = textView2;
    }

    @NonNull
    public static C4559iy0 b(@NonNull View view) {
        int i = R.id.indicator_edittext;
        EditText editText = (EditText) C3476e.h(view, R.id.indicator_edittext);
        if (editText != null) {
            i = R.id.indicator_manual_config_name;
            if (((LinearLayout) C3476e.h(view, R.id.indicator_manual_config_name)) != null) {
                i = R.id.text_minus;
                TextView textView = (TextView) C3476e.h(view, R.id.text_minus);
                if (textView != null) {
                    i = R.id.text_plus;
                    TextView textView2 = (TextView) C3476e.h(view, R.id.text_plus);
                    if (textView2 != null) {
                        return new C4559iy0((CardView) view, editText, textView, textView2);
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
