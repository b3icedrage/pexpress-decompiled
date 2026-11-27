package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2516Yq extends AnimatorListenerAdapter {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2516Yq(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.d) {
            case 0:
                ((BaseTransientBottomBar) this.e).e();
                break;
            default:
                C4802k40 c4802k40 = (C4802k40) this.e;
                c4802k40.q();
                c4802k40.r.start();
                break;
        }
    }
}
