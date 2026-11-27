package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Lb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1426Lb0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final LinearLayout e;

    @NonNull
    public final LinearLayout g;

    @NonNull
    public final LinearLayout h;

    @NonNull
    public final LinearLayout i;

    public C1426Lb0(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.d = constraintLayout;
        this.e = linearLayout;
        this.g = linearLayout2;
        this.h = linearLayout3;
        this.i = linearLayout4;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
