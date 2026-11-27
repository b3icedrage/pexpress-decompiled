package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: renamed from: qD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6098qD0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ShimmerFrameLayout e;

    @NonNull
    public final RecyclerView g;

    @NonNull
    public final TextView h;

    public C6098qD0(@NonNull ConstraintLayout constraintLayout, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.d = constraintLayout;
        this.e = shimmerFrameLayout;
        this.g = recyclerView;
        this.h = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
