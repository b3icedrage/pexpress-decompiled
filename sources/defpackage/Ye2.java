package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Ye2 extends J42 {
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ View e;
    public final /* synthetic */ View g;
    public final /* synthetic */ Ze2 h;

    public Ye2(Ze2 ze2, ViewGroup viewGroup, View view, View view2) {
        this.h = ze2;
        this.d = viewGroup;
        this.e = view;
        this.g = view2;
    }

    @Override // defpackage.J42, E42.d
    public final void a() {
        this.d.getOverlay().remove(this.e);
    }

    @Override // E42.d
    public final void b(@NonNull E42 e42) {
        this.g.setTag(R.id.save_overlay_view, null);
        this.d.getOverlay().remove(this.e);
        e42.z(this);
    }

    @Override // defpackage.J42, E42.d
    public final void e() {
        View view = this.e;
        if (view.getParent() == null) {
            this.d.getOverlay().add(view);
            return;
        }
        Ze2 ze2 = this.h;
        ArrayList<Animator> arrayList = ze2.q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).cancel();
        }
        ArrayList<E42.d> arrayList2 = ze2.u;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) ze2.u.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((E42.d) arrayList3.get(i)).c();
        }
    }
}
