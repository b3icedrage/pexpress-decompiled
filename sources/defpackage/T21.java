package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class T21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float d;
    public final /* synthetic */ S21 e;

    public T21(S21 s21, float f) {
        this.e = s21;
        this.d = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.c(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.d);
    }
}
