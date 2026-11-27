package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ce2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3195ce2 implements RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a(@NonNull View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) nVar).width != -1 || ((ViewGroup.MarginLayoutParams) nVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
