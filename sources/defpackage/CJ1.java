package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CenteredToolbar;

/* JADX INFO: loaded from: classes.dex */
public final class CJ1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final CenteredToolbar e;

    @NonNull
    public final C7357wD0 g;

    @NonNull
    public final YZ1 h;

    @NonNull
    public final YZ1 i;

    public CJ1(@NonNull ConstraintLayout constraintLayout, @NonNull CenteredToolbar centeredToolbar, @NonNull C7357wD0 c7357wD0, @NonNull YZ1 yz1, @NonNull YZ1 yz2) {
        this.d = constraintLayout;
        this.e = centeredToolbar;
        this.g = c7357wD0;
        this.h = yz1;
        this.i = yz2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
