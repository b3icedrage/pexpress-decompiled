package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2810i implements Runnable {
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ o e;

    public RunnableC2810i(o oVar, ArrayList arrayList) {
        this.e = oVar;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            o oVar = this.e;
            if (!zHasNext) {
                arrayList.clear();
                oVar.l.remove(arrayList);
                return;
            }
            RecyclerView.C c = (RecyclerView.C) it.next();
            oVar.getClass();
            View view = c.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            oVar.o.add(c);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(oVar.c).setListener(new k(view, viewPropertyAnimatorAnimate, oVar, c)).start();
        }
    }
}
