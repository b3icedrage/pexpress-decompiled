package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class A extends u {
    public final /* synthetic */ B q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b, Context context) {
        super(context);
        this.q = b;
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.x
    public final void c(@NonNull View view, @NonNull RecyclerView.x.a aVar) {
        B b = this.q;
        int[] iArrB = b.b(b.a.getLayoutManager(), view);
        int i = iArrB[0];
        int i2 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) h(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            aVar.a = i;
            aVar.b = i2;
            aVar.c = iCeil;
            aVar.e = decelerateInterpolator;
            aVar.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final float g(@NonNull DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.u
    public final int h(int i) {
        return Math.min(100, super.h(i));
    }
}
