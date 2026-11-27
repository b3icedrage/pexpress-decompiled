package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes.dex */
public final class FA0 implements InterfaceC7441wd2 {

    @NonNull
    public final CardView d;

    @NonNull
    public final TextView e;

    public FA0(@NonNull CardView cardView, @NonNull TextView textView) {
        this.d = cardView;
        this.e = textView;
    }

    @NonNull
    public static FA0 b(@NonNull View view) {
        CardView cardView = (CardView) view;
        TextView textView = (TextView) C3476e.h(view, R.id.hint_text);
        if (textView != null) {
            return new FA0(cardView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.hint_text)));
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
