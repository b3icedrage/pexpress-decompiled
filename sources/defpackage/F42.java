package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class F42 extends AnimatorListenerAdapter {
    public final /* synthetic */ C8092zj d;
    public final /* synthetic */ E42 e;

    public F42(E42 e42, C8092zj c8092zj) {
        this.e = e42;
        this.d = c8092zj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.remove(animator);
        this.e.q.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e.q.add(animator);
    }
}
