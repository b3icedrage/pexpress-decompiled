package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Dw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866Dw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C1412Kw1 e;

    @NonNull
    public final C1412Kw1 g;

    @NonNull
    public final ImageView h;

    public C0866Dw1(@NonNull ConstraintLayout constraintLayout, @NonNull C1412Kw1 c1412Kw1, @NonNull C1412Kw1 c1412Kw2, @NonNull ImageView imageView) {
        this.d = constraintLayout;
        this.e = c1412Kw1;
        this.g = c1412Kw2;
        this.h = imageView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
