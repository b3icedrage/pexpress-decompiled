package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2809h implements Runnable {
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ o e;

    public RunnableC2809h(o oVar, ArrayList arrayList) {
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
                oVar.n.remove(arrayList);
                return;
            }
            o.a aVar = (o.a) it.next();
            oVar.getClass();
            RecyclerView.C c = aVar.a;
            View view = c == null ? null : c.a;
            RecyclerView.C c2 = aVar.b;
            View view2 = c2 != null ? c2.a : null;
            ArrayList<RecyclerView.C> arrayList2 = oVar.r;
            long j = oVar.f;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j);
                arrayList2.add(aVar.a);
                duration.translationX(aVar.e - aVar.c);
                duration.translationY(aVar.f - aVar.d);
                duration.alpha(0.0f).setListener(new m(oVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(aVar.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new n(oVar, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
