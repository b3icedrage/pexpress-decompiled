package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class u extends RecyclerView.x {

    @SuppressLint({"UnknownNullness"})
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    @SuppressLint({"UnknownNullness"})
    public u(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    @Override // androidx.recyclerview.widget.RecyclerView.x
    @SuppressLint({"UnknownNullness"})
    public void c(View view, RecyclerView.x.a aVar) {
        int i;
        PointF pointF = this.k;
        int i2 = -1;
        int iE = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iF = f(view, i);
        PointF pointF2 = this.k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else if (f2 > 0.0f) {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        RecyclerView.m mVar = this.c;
        if (mVar != null && mVar.e()) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            iE = e((view.getTop() - ((RecyclerView.n) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getBottom() + ((RecyclerView.n) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin, mVar.E(), mVar.o - mVar.B(), i2);
        }
        int iCeil = (int) Math.ceil(((double) h((int) Math.sqrt((iE * iE) + (iF * iF)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            aVar.a = -iF;
            aVar.b = -iE;
            aVar.c = iCeil;
            aVar.e = decelerateInterpolator;
            aVar.f = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int f(View view, int i) {
        RecyclerView.m mVar = this.c;
        if (mVar == null || !mVar.d()) {
            return 0;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return e((view.getLeft() - ((RecyclerView.n) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, view.getRight() + ((RecyclerView.n) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.C(), mVar.n - mVar.D(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public float g(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int h(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = g(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }
}
