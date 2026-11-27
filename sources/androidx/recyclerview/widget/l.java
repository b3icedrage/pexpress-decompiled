package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.C d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ViewPropertyAnimator i;
    public final /* synthetic */ o j;

    public l(o oVar, RecyclerView.C c, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.j = oVar;
        this.d = c;
        this.e = i;
        this.g = view;
        this.h = i2;
        this.i = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.e;
        View view = this.g;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.i.setListener(null);
        o oVar = this.j;
        RecyclerView.C c = this.d;
        oVar.c(c);
        oVar.p.remove(c);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.j.getClass();
    }
}
