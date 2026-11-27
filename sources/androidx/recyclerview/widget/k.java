package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.C d;
    public final /* synthetic */ View e;
    public final /* synthetic */ ViewPropertyAnimator g;
    public final /* synthetic */ o h;

    public k(View view, ViewPropertyAnimator viewPropertyAnimator, o oVar, RecyclerView.C c) {
        this.h = oVar;
        this.d = c;
        this.e = view;
        this.g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.e.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.g.setListener(null);
        o oVar = this.h;
        RecyclerView.C c = this.d;
        oVar.c(c);
        oVar.o.remove(c);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.h.getClass();
    }
}
