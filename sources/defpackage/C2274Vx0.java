package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: Vx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2274Vx0 implements InterfaceC7441wd2 {

    @NonNull
    public final NestedScrollView d;

    @NonNull
    public final CardView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final ImageView j;

    @NonNull
    public final ImageView k;

    @NonNull
    public final TextView l;

    @NonNull
    public final ShapeableImageView m;

    @NonNull
    public final TextView n;

    @NonNull
    public final LinearLayout o;

    public C2274Vx0(@NonNull NestedScrollView nestedScrollView, @NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView4, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView5, @NonNull LinearLayout linearLayout) {
        this.d = nestedScrollView;
        this.e = cardView;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = imageView;
        this.k = imageView2;
        this.l = textView4;
        this.m = shapeableImageView;
        this.n = textView5;
        this.o = linearLayout;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
