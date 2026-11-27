package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class IR1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final ShapeableImageView i;

    @NonNull
    public final TextView j;

    @NonNull
    public final ImageView k;

    @NonNull
    public final TextView l;

    @NonNull
    public final TextView m;

    public IR1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.d = constraintLayout;
        this.e = imageView;
        this.g = imageView2;
        this.h = textView;
        this.i = shapeableImageView;
        this.j = textView2;
        this.k = imageView3;
        this.l = textView3;
        this.m = textView4;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
