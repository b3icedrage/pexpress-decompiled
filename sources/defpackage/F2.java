package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class F2 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final L2 g;

    @NonNull
    public final L2 h;

    public F2(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull L2 l2, @NonNull L2 l3) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = l2;
        this.h = l3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
