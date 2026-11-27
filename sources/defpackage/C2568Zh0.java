package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Zh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2568Zh0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Button e;

    @NonNull
    public final FrameLayout g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final ConstraintLayout i;

    @NonNull
    public final Button j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    public C2568Zh0(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = button;
        this.g = frameLayout;
        this.h = imageView;
        this.i = constraintLayout2;
        this.j = button2;
        this.k = textView;
        this.l = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
