package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: Oi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1684Oi1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    public C1684Oi1(@NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = imageView;
        this.h = textView;
        this.i = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
