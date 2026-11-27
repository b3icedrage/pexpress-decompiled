package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: renamed from: r10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6262r10 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final View g;

    @NonNull
    public final TextInputEditText h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final Button j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    public C6262r10(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull View view, @NonNull TextInputEditText textInputEditText, @NonNull ImageView imageView, @NonNull Button button, @NonNull SpinKitView spinKitView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = view;
        this.h = textInputEditText;
        this.i = imageView;
        this.j = button;
        this.k = textView2;
        this.l = textView3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
