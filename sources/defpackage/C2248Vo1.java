package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2248Vo1 implements RecyclerView.q {

    @Nullable
    public final C7724xz a;

    @NotNull
    public final GestureDetector b;

    public C2248Vo1(@Nullable Context context, @Nullable C7724xz c7724xz) {
        this.a = c7724xz;
        this.b = new GestureDetector(context, new C2170Uo1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(@NotNull RecyclerView rv, @NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean b(@NotNull RecyclerView view, @NotNull MotionEvent e) {
        View viewD;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(e, "e");
        float x = e.getX();
        float y = e.getY();
        int iE = view.j.e() - 1;
        while (true) {
            if (iE < 0) {
                viewD = null;
                break;
            }
            viewD = view.j.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (x >= viewD.getLeft() + translationX && x <= viewD.getRight() + translationX && y >= viewD.getTop() + translationY && y <= viewD.getBottom() + translationY) {
                break;
            }
            iE--;
        }
        if (viewD == null) {
            return false;
        }
        C7724xz c7724xz = this.a;
        if (!this.b.onTouchEvent(e)) {
            return false;
        }
        RecyclerView.C cK = RecyclerView.K(viewD);
        int iH = -1;
        if (cK != null && (recyclerView = cK.r) != null) {
            iH = recyclerView.H(cK);
        }
        AbstractC7934yz abstractC7934yz = (AbstractC7934yz) c7724xz.d;
        UL0 ul0 = abstractC7934yz.g.f.get(iH);
        Intrinsics.checkNotNull(ul0);
        abstractC7934yz.f.invoke(ul0);
        ul0.getClass();
        abstractC7934yz.e.a(new Locale(ul0.g));
        return false;
    }
}
