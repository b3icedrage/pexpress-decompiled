package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: zw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8137zw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    public C8137zw1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView) {
        this.d = constraintLayout;
        this.e = imageView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
