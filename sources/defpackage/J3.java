package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class J3 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final SV0 e;

    @NonNull
    public final ShapeableImageView g;

    @NonNull
    public final View h;

    @NonNull
    public final TextView i;

    @NonNull
    public final ImageView j;

    @NonNull
    public final TextView k;

    public J3(@NonNull ConstraintLayout constraintLayout, @NonNull SV0 sv0, @NonNull ShapeableImageView shapeableImageView, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = sv0;
        this.g = shapeableImageView;
        this.h = view;
        this.i = textView;
        this.j = imageView;
        this.k = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
