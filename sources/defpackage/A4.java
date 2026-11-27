package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class A4 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final L2 e;

    @NonNull
    public final L2 g;

    @NonNull
    public final C7476wm1 h;

    public A4(@NonNull ConstraintLayout constraintLayout, @NonNull L2 l2, @NonNull L2 l3, @NonNull C7476wm1 c7476wm1) {
        this.d = constraintLayout;
        this.e = l2;
        this.g = l3;
        this.h = c7476wm1;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
