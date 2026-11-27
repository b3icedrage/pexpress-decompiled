package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2811j extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.C d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ View g;
    public final /* synthetic */ o h;

    public C2811j(View view, ViewPropertyAnimator viewPropertyAnimator, o oVar, RecyclerView.C c) {
        this.h = oVar;
        this.d = c;
        this.e = viewPropertyAnimator;
        this.g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.g.setAlpha(1.0f);
        o oVar = this.h;
        RecyclerView.C c = this.d;
        oVar.c(c);
        oVar.q.remove(c);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.h.getClass();
    }
}
