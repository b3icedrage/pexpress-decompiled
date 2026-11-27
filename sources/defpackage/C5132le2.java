package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: le2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5132le2 extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC5765oe2 d;

    public C5132le2(InterfaceC5765oe2 interfaceC5765oe2, View view) {
        this.d = interfaceC5765oe2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.e();
    }
}
