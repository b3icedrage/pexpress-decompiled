package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: Tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2096Tq extends AnimatorListenerAdapter {
    public final /* synthetic */ BaseTransientBottomBar d;

    public C2096Tq(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.d;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.j;
        int i = baseTransientBottomBar.c;
        int i2 = baseTransientBottomBar.a;
        int i3 = i - i2;
        snackbarContentLayout.d.setAlpha(0.0f);
        long j = i2;
        ViewPropertyAnimator duration = snackbarContentLayout.d.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.g;
        long j2 = i3;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.e.getVisibility() == 0) {
            snackbarContentLayout.e.setAlpha(0.0f);
            snackbarContentLayout.e.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
