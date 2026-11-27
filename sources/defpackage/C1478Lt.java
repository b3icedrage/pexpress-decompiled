package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: renamed from: Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1478Lt extends AnimatorListenerAdapter {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1478Lt(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                int i = BottomAppBar.m0;
                ((BottomAppBar) obj).c0 = null;
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.d) {
            case 0:
                break;
            case 1:
                ((C7567xD) this.e).b.g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
