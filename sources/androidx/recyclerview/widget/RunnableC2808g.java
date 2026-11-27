package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2808g implements Runnable {
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ o e;

    public RunnableC2808g(o oVar, ArrayList arrayList) {
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
                oVar.m.remove(arrayList);
                return;
            }
            o.b bVar = (o.b) it.next();
            RecyclerView.C c = bVar.a;
            oVar.getClass();
            View view = c.a;
            int i = bVar.d - bVar.b;
            int i2 = bVar.e - bVar.c;
            if (i != 0) {
                view.animate().translationX(0.0f);
            }
            if (i2 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            oVar.p.add(c);
            viewPropertyAnimatorAnimate.setDuration(oVar.e).setListener(new l(oVar, c, i, view, i2, viewPropertyAnimatorAnimate)).start();
        }
    }
}
