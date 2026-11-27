package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5884pC extends AnimatorListenerAdapter {
    public final /* synthetic */ C6303rC d;

    public C5884pC(C6303rC c6303rC) {
        this.d = c6303rC;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C6303rC c6303rC = this.d;
        c6303rC.h = (c6303rC.h + 4) % c6303rC.g.c.length;
    }
}
