package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class QE1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final MaterialButton h;

    @NonNull
    public final MaterialButton i;

    @NonNull
    public final TextView j;

    public QE1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull TextView textView) {
        this.d = constraintLayout;
        this.e = imageView;
        this.g = imageView2;
        this.h = materialButton;
        this.i = materialButton2;
        this.j = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
