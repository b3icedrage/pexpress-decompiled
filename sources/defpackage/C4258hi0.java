package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: hi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4258hi0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final FrameLayout g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final ConstraintLayout i;

    @NonNull
    public final MaterialButton j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    public C4258hi0(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull MaterialButton materialButton2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = frameLayout;
        this.h = imageView;
        this.i = constraintLayout2;
        this.j = materialButton2;
        this.k = textView;
        this.l = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
