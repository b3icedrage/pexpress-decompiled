package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class AV1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final FrameLayout e;

    @NonNull
    public final FrameLayout g;

    @NonNull
    public final FrameLayout h;

    @NonNull
    public final FrameLayout i;

    public AV1(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4) {
        this.d = constraintLayout;
        this.e = frameLayout;
        this.g = frameLayout2;
        this.h = frameLayout3;
        this.i = frameLayout4;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
