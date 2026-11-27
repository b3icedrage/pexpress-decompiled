package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.C2096Tq;
import defpackage.C2516Yq;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar d;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        BaseTransientBottomBar baseTransientBottomBar = this.d;
        BaseTransientBottomBar.f fVar = baseTransientBottomBar.i;
        if (fVar == null) {
            return;
        }
        ViewParent parent = fVar.getParent();
        BaseTransientBottomBar.f fVar2 = baseTransientBottomBar.i;
        if (parent != null) {
            fVar2.setVisibility(0);
        }
        if (fVar2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.d);
            valueAnimatorOfFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f);
            valueAnimatorOfFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(baseTransientBottomBar.a);
            animatorSet.addListener(new C2516Yq(baseTransientBottomBar, i));
            animatorSet.start();
            return;
        }
        int height = fVar2.getHeight();
        ViewGroup.LayoutParams layoutParams = fVar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        fVar2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.e);
        valueAnimator.setDuration(baseTransientBottomBar.c);
        valueAnimator.addListener(new C2096Tq(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
