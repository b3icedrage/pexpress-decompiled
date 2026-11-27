package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CenteredToolbar;

/* JADX INFO: renamed from: c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3082c6 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final FrameLayout e;

    @NonNull
    public final FrameLayout g;

    @NonNull
    public final CenteredToolbar h;

    @NonNull
    public final FrameLayout i;

    @NonNull
    public final FrameLayout j;

    public C3082c6(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull CenteredToolbar centeredToolbar, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4) {
        this.d = constraintLayout;
        this.e = frameLayout;
        this.g = frameLayout2;
        this.h = centeredToolbar;
        this.i = frameLayout3;
        this.j = frameLayout4;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
