package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* JADX INFO: renamed from: Gw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1100Gw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final Group h;

    @NonNull
    public final View i;

    @NonNull
    public final SwitchMaterial j;

    @NonNull
    public final EditText k;

    @NonNull
    public final MaterialCardView l;

    @NonNull
    public final TextView m;

    @NonNull
    public final TextView n;

    @NonNull
    public final SwitchMaterial o;

    @NonNull
    public final EditText p;

    @NonNull
    public final MaterialCardView q;

    @NonNull
    public final View r;

    @NonNull
    public final ShimmerFrameLayout s;

    @NonNull
    public final ShimmerFrameLayout t;

    @NonNull
    public final View u;

    public C1100Gw1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Group group, @NonNull View view, @NonNull SwitchMaterial switchMaterial, @NonNull EditText editText, @NonNull MaterialCardView materialCardView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SwitchMaterial switchMaterial2, @NonNull EditText editText2, @NonNull MaterialCardView materialCardView2, @NonNull View view2, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull ShimmerFrameLayout shimmerFrameLayout2, @NonNull View view3) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = textView2;
        this.h = group;
        this.i = view;
        this.j = switchMaterial;
        this.k = editText;
        this.l = materialCardView;
        this.m = textView3;
        this.n = textView4;
        this.o = switchMaterial2;
        this.p = editText2;
        this.q = materialCardView2;
        this.r = view2;
        this.s = shimmerFrameLayout;
        this.t = shimmerFrameLayout2;
        this.u = view3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
