package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: renamed from: c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3086c7 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final BottomNavigationView e;

    @NonNull
    public final C4412iS0 g;

    @NonNull
    public final ConstraintLayout h;

    public C3086c7(@NonNull ConstraintLayout constraintLayout, @NonNull BottomNavigationView bottomNavigationView, @NonNull C4412iS0 c4412iS0, @NonNull ConstraintLayout constraintLayout2) {
        this.d = constraintLayout;
        this.e = bottomNavigationView;
        this.g = c4412iS0;
        this.h = constraintLayout2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
