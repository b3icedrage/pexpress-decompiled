package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: qC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6094qC extends AnimatorListenerAdapter {
    public final /* synthetic */ C6303rC d;

    public C6094qC(C6303rC c6303rC) {
        this.d = c6303rC;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C6303rC c6303rC = this.d;
        ObjectAnimator objectAnimator = c6303rC.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AbstractC1392Kq.c cVar = c6303rC.k;
        if (cVar != null) {
            cVar.a(c6303rC.a);
        }
    }
}
