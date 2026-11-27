package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: Sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2018Sq extends AnimatorListenerAdapter {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2018Sq(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((BaseTransientBottomBar) obj).d();
                break;
            case 1:
                int i = BottomAppBar.m0;
                ((BottomAppBar) obj).d0 = null;
                break;
            default:
                ((C7567xD) obj).b.g(false);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.d) {
            case 1:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C2018Sq(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.d = 0;
        this.e = baseTransientBottomBar;
    }

    private final void a(Animator animator) {
    }
}
