package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Mi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1524Mi0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList i;

    public RunnableC1524Mi0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.d = i;
        this.e = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.d; i++) {
            View view = (View) this.e.get(i);
            String str = (String) this.g.get(i);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.d.v(view, str);
            Cd2.d.v((View) this.h.get(i), (String) this.i.get(i));
        }
    }
}
