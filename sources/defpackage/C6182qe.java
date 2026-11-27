package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6182qe {

    @NonNull
    public final ImageView a;
    public UZ1 b;
    public int c = 0;

    public C6182qe(@NonNull ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        UZ1 uz1;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            R30.a(drawable);
        }
        if (drawable == null || (uz1 = this.b) == null) {
            return;
        }
        C5552ne.e(drawable, uz1, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = C3855fm1.f;
        WZ1 wz1E = WZ1.e(context, attributeSet, iArr, i);
        Cd2.k(imageView, imageView.getContext(), iArr, attributeSet, wz1E.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = wz1E.b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = C7652xe.d(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                R30.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                C0709Bw0.c(imageView, wz1E.a(2));
            }
            if (typedArray.hasValue(3)) {
                C0709Bw0.d(imageView, R30.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            wz1E.f();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable drawableD = C7652xe.d(imageView.getContext(), i);
            if (drawableD != null) {
                R30.a(drawableD);
            }
            imageView.setImageDrawable(drawableD);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
