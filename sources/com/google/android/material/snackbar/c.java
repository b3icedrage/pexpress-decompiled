package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import defpackage.C1581Nb0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar d;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.d = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1581Nb0 c1581Nb0 = BaseTransientBottomBar.w;
        this.d.i.setTranslationY(iIntValue);
    }
}
