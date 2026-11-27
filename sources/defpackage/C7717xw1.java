package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: renamed from: xw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7717xw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final AppCompatImageView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final C7927yw1 i;

    @NonNull
    public final TextView j;

    @NonNull
    public final ConstraintLayout k;

    @NonNull
    public final ShimmerFrameLayout l;

    @NonNull
    public final C7927yw1 m;

    public C7717xw1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView2, @NonNull C7927yw1 c7927yw1, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull C7927yw1 c7927yw2) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = appCompatImageView;
        this.h = textView2;
        this.i = c7927yw1;
        this.j = textView3;
        this.k = constraintLayout2;
        this.l = shimmerFrameLayout;
        this.m = c7927yw2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
