package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import defpackage.AbstractC1470Lq;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y30<S extends AbstractC1470Lq> {
    public C6513sC a;
    public V30 b;

    public final void a(@NonNull Canvas canvas, @NonNull Rect rect, float f) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        this.a.getClass();
        C5464nC c5464nC = (C5464nC) this;
        float fWidth = rect.width() / c5464nC.e();
        float fHeight = rect.height() / c5464nC.e();
        C6513sC c6513sC = c5464nC.a;
        float f2 = (c6513sC.g / 2.0f) + c6513sC.h;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        c5464nC.c = c6513sC.i == 0 ? 1 : -1;
        int i = c6513sC.a;
        c5464nC.d = i * f;
        c5464nC.e = c6513sC.b * f;
        c5464nC.f = (c6513sC.g - i) / 2.0f;
        ObjectAnimator objectAnimator3 = c5464nC.b.h;
        if (((objectAnimator3 != null && objectAnimator3.isRunning()) && c6513sC.e == 2) || ((objectAnimator = c5464nC.b.i) != null && objectAnimator.isRunning() && c6513sC.f == 1)) {
            c5464nC.f = (((1.0f - f) * c6513sC.a) / 2.0f) + c5464nC.f;
            return;
        }
        ObjectAnimator objectAnimator4 = c5464nC.b.h;
        if ((objectAnimator4 != null && objectAnimator4.isRunning() && c6513sC.e == 1) || ((objectAnimator2 = c5464nC.b.i) != null && objectAnimator2.isRunning() && c6513sC.f == 2)) {
            c5464nC.f -= ((1.0f - f) * c6513sC.a) / 2.0f;
        }
    }
}
