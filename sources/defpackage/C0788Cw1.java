package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: Cw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788Cw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final SpinKitView g;

    public C0788Cw1(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull SpinKitView spinKitView) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = spinKitView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
