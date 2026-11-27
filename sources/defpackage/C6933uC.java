package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: uC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6933uC extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC7564xC d;

    public C6933uC(InterfaceC7564xC interfaceC7564xC) {
        this.d = interfaceC7564xC;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.b();
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.a();
        throw null;
    }
}
