package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3419di0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final LinearLayout i;

    @NonNull
    public final TextView j;

    public C3419di0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = imageView;
        this.g = textView;
        this.h = imageView2;
        this.i = linearLayout;
        this.j = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
