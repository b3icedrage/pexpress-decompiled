package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class T30 extends AnimatorListenerAdapter {
    public final /* synthetic */ V30 d;

    public T30(V30 v30) {
        this.d = v30;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        V30 v30 = this.d;
        ArrayList arrayList = v30.j;
        if (arrayList == null || v30.k) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1817Qb.a) it.next()).b(v30);
        }
    }
}
