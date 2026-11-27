package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class G42 extends AnimatorListenerAdapter {
    public final /* synthetic */ E42 d;

    public G42(E42 e42) {
        this.d = e42;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.o();
        animator.removeListener(this);
    }
}
