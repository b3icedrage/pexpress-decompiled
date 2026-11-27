package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3444dp0 extends q {
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3444dp0(@NotNull Context context, int i, int i2) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = i;
        this.f = i2;
    }

    @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.l
    public final void c(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.y state) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        parent.getClass();
        RecyclerView.C cK = RecyclerView.K(view);
        int iH = -1;
        if (cK != null && (recyclerView = cK.r) != null) {
            iH = recyclerView.H(cK);
        }
        RecyclerView.e adapter = parent.getAdapter();
        if (adapter != null) {
            int iC = adapter.c();
            int i = this.e;
            int i2 = this.f;
            if (iH == 0) {
                outRect.left = i2;
                outRect.right = i;
            } else if (iH == iC) {
                outRect.right = i2;
            } else {
                outRect.right = i;
            }
        }
    }
}
