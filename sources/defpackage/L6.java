package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class L6 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C5928pQ1 e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final C5928pQ1 h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final C5928pQ1 j;

    public L6(@NonNull ConstraintLayout constraintLayout, @NonNull C5928pQ1 c5928pQ1, @NonNull ImageView imageView, @NonNull C5928pQ1 c5928pQ2, @NonNull ImageView imageView2, @NonNull C5928pQ1 c5928pQ3) {
        this.d = constraintLayout;
        this.e = c5928pQ1;
        this.g = imageView;
        this.h = c5928pQ2;
        this.i = imageView2;
        this.j = c5928pQ3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
