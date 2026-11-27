package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6523sF0 extends RecyclerView.l {
    public final int a = C7279vr.f(16);
    public final int b = C7279vr.f(4);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.y state) {
        AbstractC3926g70 abstractC3926g70C;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        parent.getClass();
        RecyclerView.C cK = RecyclerView.K(view);
        if (-1 != ((cK == null || (recyclerView = cK.r) == null) ? -1 : recyclerView.H(cK))) {
            RecyclerView.C cJ = parent.J(view);
            boolean z = cJ instanceof EZ0;
            int i = this.a;
            if (!z) {
                if (cJ instanceof C5068lL) {
                    outRect.top = i;
                    return;
                } else {
                    if (cJ instanceof G92) {
                        outRect.top = i;
                        return;
                    }
                    return;
                }
            }
            AbstractC7844yZ0 abstractC7844yZ0 = (AbstractC7844yZ0) ((RA) ((EZ0) cJ).u.d.d());
            if (abstractC7844yZ0 == null || (abstractC3926g70C = abstractC7844yZ0.c()) == null) {
                abstractC3926g70C = AbstractC3926g70.d.a;
            }
            if (Intrinsics.a(abstractC3926g70C, AbstractC3926g70.d.a) ? true : Intrinsics.a(abstractC3926g70C, AbstractC3926g70.b.a)) {
                outRect.top = i;
            } else {
                outRect.top = this.b;
            }
        }
    }
}
