package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class U30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ U30(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.d) {
            case 0:
                super.onAnimationEnd(animator);
                V30 v30 = (V30) this.e;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = v30.j;
                if (arrayList != null && !v30.k) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1817Qb.a) it.next()).a(v30);
                    }
                    break;
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.e).h = null;
                break;
        }
    }
}
