package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: Aw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0632Aw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final ShimmerFrameLayout j;

    @NonNull
    public final MaterialCardView k;

    public C0632Aw1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull MaterialCardView materialCardView) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = imageView;
        this.h = textView2;
        this.i = textView3;
        this.j = shimmerFrameLayout;
        this.k = materialCardView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
