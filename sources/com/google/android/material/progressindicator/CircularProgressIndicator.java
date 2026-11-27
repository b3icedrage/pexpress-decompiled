package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import defpackage.AbstractC1392Kq;
import defpackage.C1180Hx0;
import defpackage.C4318i00;
import defpackage.C5464nC;
import defpackage.C6303rC;
import defpackage.C6513sC;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicator extends AbstractC1392Kq<C6513sC> {
    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        C6513sC c6513sC = (C6513sC) this.d;
        C5464nC c5464nC = new C5464nC(c6513sC);
        C6303rC c6303rC = new C6303rC(c6513sC);
        C1180Hx0 c1180Hx0 = new C1180Hx0(context2, c6513sC);
        c1180Hx0.p = c5464nC;
        c5464nC.b = c1180Hx0;
        c1180Hx0.q = c6303rC;
        c6303rC.a = c1180Hx0;
        setIndeterminateDrawable(c1180Hx0);
        setProgressDrawable(new C4318i00(getContext(), c6513sC, new C5464nC(c6513sC)));
    }

    public int getIndicatorDirection() {
        return ((C6513sC) this.d).i;
    }

    public int getIndicatorInset() {
        return ((C6513sC) this.d).h;
    }

    public int getIndicatorSize() {
        return ((C6513sC) this.d).g;
    }

    public void setIndicatorDirection(int i) {
        ((C6513sC) this.d).i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        Object obj = this.d;
        if (((C6513sC) obj).h != i) {
            ((C6513sC) obj).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        Object obj = this.d;
        if (((C6513sC) obj).g != iMax) {
            ((C6513sC) obj).g = iMax;
            ((C6513sC) obj).getClass();
            invalidate();
        }
    }

    @Override // defpackage.AbstractC1392Kq
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((C6513sC) this.d).getClass();
    }
}
