package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2174Uq extends AnimatorListenerAdapter {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    public C2174Uq(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.e = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.d) {
            case 0:
                ((BaseTransientBottomBar) this.e).d();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.d) {
            case 0:
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.e;
                SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.j;
                snackbarContentLayout.d.setAlpha(1.0f);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.d.animate().alpha(0.0f);
                long j = baseTransientBottomBar.b;
                ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.g;
                long j2 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.e.getVisibility() == 0) {
                    snackbarContentLayout.e.setAlpha(1.0f);
                    snackbarContentLayout.e.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                ((BottomAppBar) this.e).getClass();
                throw null;
        }
    }

    public C2174Uq(BottomAppBar bottomAppBar) {
        this.e = bottomAppBar;
    }
}
