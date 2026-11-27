package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2637a3 implements InterfaceC7441wd2 {

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

    @NonNull
    public final NestedScrollView j;

    public C2637a3(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull NestedScrollView nestedScrollView) {
        this.d = constraintLayout;
        this.e = frameLayout;
        this.g = frameLayout2;
        this.h = frameLayout3;
        this.i = frameLayout4;
        this.j = nestedScrollView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
