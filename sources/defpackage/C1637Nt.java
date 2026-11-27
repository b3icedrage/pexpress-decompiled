package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1637Nt extends AnimatorListenerAdapter {
    public boolean d;
    public final /* synthetic */ ActionMenuView e;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ BottomAppBar i;

    public C1637Nt(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.i = bottomAppBar;
        this.e = actionMenuView;
        this.g = i;
        this.h = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.d) {
            return;
        }
        this.i.E(this.e, this.g, this.h, false);
    }
}
