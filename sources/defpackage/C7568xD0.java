package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: xD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7568xD0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextView g;

    public C7568xD0(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = textView2;
    }

    @NonNull
    public static C7568xD0 b(@NonNull View view) {
        int i = R.id.step_count_text;
        TextView textView = (TextView) C3476e.h(view, R.id.step_count_text);
        if (textView != null) {
            i = R.id.step_description_text;
            TextView textView2 = (TextView) C3476e.h(view, R.id.step_description_text);
            if (textView2 != null) {
                return new C7568xD0((ConstraintLayout) view, textView, textView2);
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
