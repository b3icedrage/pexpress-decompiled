package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Pf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1753Pf1 implements InterfaceC7441wd2 {

    @NonNull
    public final CardView d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    public C1753Pf1(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.d = cardView;
        this.e = imageView;
        this.g = textView;
    }

    @NonNull
    public static C1753Pf1 b(@NonNull View view) {
        int i = R.id.popular_question_icon;
        ImageView imageView = (ImageView) C3476e.h(view, R.id.popular_question_icon);
        if (imageView != null) {
            i = R.id.popular_question_item_text;
            TextView textView = (TextView) C3476e.h(view, R.id.popular_question_item_text);
            if (textView != null) {
                return new C1753Pf1((CardView) view, imageView, textView);
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
