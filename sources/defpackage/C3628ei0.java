package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: ei0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3628ei0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Button e;

    @NonNull
    public final View g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final Button i;

    @NonNull
    public final TextView j;

    @NonNull
    public final TextView k;

    public C3628ei0(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull TextView textView, @NonNull View view, @NonNull ImageView imageView, @NonNull Button button2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.d = constraintLayout;
        this.e = button;
        this.g = view;
        this.h = imageView;
        this.i = button2;
        this.j = textView2;
        this.k = textView3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
