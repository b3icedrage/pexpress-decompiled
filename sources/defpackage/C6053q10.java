package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: renamed from: q10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6053q10 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Button e;

    @NonNull
    public final MaterialCheckBox g;

    @NonNull
    public final View h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final Button j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    public C6053q10(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull View view, @NonNull ImageView imageView, @NonNull Button button2, @NonNull SpinKitView spinKitView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.d = constraintLayout;
        this.e = button;
        this.g = materialCheckBox;
        this.h = view;
        this.i = imageView;
        this.j = button2;
        this.k = textView2;
        this.l = textView3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
