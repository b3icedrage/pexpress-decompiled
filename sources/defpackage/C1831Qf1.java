package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: renamed from: Qf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1831Qf1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C1753Pf1 e;

    @NonNull
    public final RecyclerView g;

    @NonNull
    public final ShimmerFrameLayout h;

    public C1831Qf1(@NonNull ConstraintLayout constraintLayout, @NonNull C1753Pf1 c1753Pf1, @NonNull RecyclerView recyclerView, @NonNull ShimmerFrameLayout shimmerFrameLayout) {
        this.d = constraintLayout;
        this.e = c1753Pf1;
        this.g = recyclerView;
        this.h = shimmerFrameLayout;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
