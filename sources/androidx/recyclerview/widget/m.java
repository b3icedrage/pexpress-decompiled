package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {
    public final /* synthetic */ o.a d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ View g;
    public final /* synthetic */ o h;

    public m(o oVar, o.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.h = oVar;
        this.d = aVar;
        this.e = viewPropertyAnimator;
        this.g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        View view = this.g;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        o.a aVar = this.d;
        RecyclerView.C c = aVar.a;
        o oVar = this.h;
        oVar.c(c);
        oVar.r.remove(aVar.a);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.C c = this.d.a;
        this.h.getClass();
    }
}
