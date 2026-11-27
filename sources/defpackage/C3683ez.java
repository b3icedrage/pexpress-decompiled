package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.b;

/* JADX INFO: renamed from: ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3683ez extends u {
    public final /* synthetic */ CarouselLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3683ez(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public final PointF a(int i) {
        CarouselLayoutManager carouselLayoutManager = this.q;
        b bVar = carouselLayoutManager.u;
        if (bVar == null) {
            return null;
        }
        return new PointF(carouselLayoutManager.H0(bVar.a, i) - carouselLayoutManager.p, 0.0f);
    }

    @Override // androidx.recyclerview.widget.u
    public final int f(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.q;
        return (int) (carouselLayoutManager.p - carouselLayoutManager.H0(carouselLayoutManager.u.a, RecyclerView.m.F(view)));
    }
}
