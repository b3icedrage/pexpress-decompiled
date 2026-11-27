package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: Pi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1762Pi1 implements InterfaceC7441wd2 {

    @NonNull
    public final MotionLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final TextView g;

    @NonNull
    public final ImageView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final MotionLayout j;

    @NonNull
    public final ImageView k;

    @NonNull
    public final MaterialButton l;

    public C1762Pi1(@NonNull MotionLayout motionLayout, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull MotionLayout motionLayout2, @NonNull ImageView imageView2, @NonNull MaterialButton materialButton2) {
        this.d = motionLayout;
        this.e = materialButton;
        this.g = textView;
        this.h = imageView;
        this.i = textView2;
        this.j = motionLayout2;
        this.k = imageView2;
        this.l = materialButton2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
