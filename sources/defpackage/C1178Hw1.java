package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Hw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1178Hw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final C3077c42 g;

    public C1178Hw1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull C3077c42 c3077c42) {
        this.d = constraintLayout;
        this.e = imageView;
        this.g = c3077c42;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
