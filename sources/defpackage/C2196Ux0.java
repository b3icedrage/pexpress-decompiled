package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: Ux0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2196Ux0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final C2274Vx0 h;

    public C2196Ux0(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull C2274Vx0 c2274Vx0) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = materialButton2;
        this.h = c2274Vx0;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
