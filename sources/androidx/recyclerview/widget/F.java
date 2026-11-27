package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    public static int a(RecyclerView.y yVar, z zVar, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.v() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.m.F(view) - RecyclerView.m.F(view2)) + 1;
        }
        return Math.min(zVar.l(), zVar.b(view2) - zVar.e(view));
    }

    public static int b(RecyclerView.y yVar, z zVar, View view, View view2, RecyclerView.m mVar, boolean z, boolean z2) {
        if (mVar.v() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (yVar.b() - Math.max(RecyclerView.m.F(view), RecyclerView.m.F(view2))) - 1) : Math.max(0, Math.min(RecyclerView.m.F(view), RecyclerView.m.F(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(zVar.b(view2) - zVar.e(view)) / (Math.abs(RecyclerView.m.F(view) - RecyclerView.m.F(view2)) + 1))) + (zVar.k() - zVar.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.y yVar, z zVar, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.v() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.b();
        }
        return (int) (((zVar.b(view2) - zVar.e(view)) / (Math.abs(RecyclerView.m.F(view) - RecyclerView.m.F(view2)) + 1)) * yVar.b());
    }
}
