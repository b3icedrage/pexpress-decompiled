package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CenteredToolbar;

/* JADX INFO: renamed from: di1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3420di1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C4049gi1 e;

    @NonNull
    public final C4049gi1 g;

    @NonNull
    public final C4049gi1 h;

    @NonNull
    public final C4259hi1 i;

    @NonNull
    public final C5360mi1 j;

    @NonNull
    public final TextView k;

    @NonNull
    public final CenteredToolbar l;

    @NonNull
    public final TextView m;

    public C3420di1(@NonNull ConstraintLayout constraintLayout, @NonNull C4049gi1 c4049gi1, @NonNull C4049gi1 c4049gi2, @NonNull C4049gi1 c4049gi3, @NonNull C4259hi1 c4259hi1, @NonNull C5360mi1 c5360mi1, @NonNull TextView textView, @NonNull CenteredToolbar centeredToolbar, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = c4049gi1;
        this.g = c4049gi2;
        this.h = c4049gi3;
        this.i = c4259hi1;
        this.j = c5360mi1;
        this.k = textView;
        this.l = centeredToolbar;
        this.m = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
