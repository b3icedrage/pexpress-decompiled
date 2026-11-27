package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: y40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7745y40 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final AppCompatImageButton e;

    @NonNull
    public final MaterialTextView g;

    @NonNull
    public final TextInputEditText h;

    @NonNull
    public final MotionLayout i;

    @NonNull
    public final MaterialButton j;

    public C7745y40(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull MaterialTextView materialTextView, @NonNull TextInputEditText textInputEditText, @NonNull MotionLayout motionLayout, @NonNull MaterialButton materialButton) {
        this.d = frameLayout;
        this.e = appCompatImageButton;
        this.g = materialTextView;
        this.h = textInputEditText;
        this.i = motionLayout;
        this.j = materialButton;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
