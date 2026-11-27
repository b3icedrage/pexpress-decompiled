package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import defpackage.C1849Ql1;
import defpackage.LK1;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint d;
    public final LK1 e;
    public final boolean g;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        a.b c0306a;
        super(context, attributeSet);
        this.d = new Paint();
        LK1 lk1 = new LK1();
        this.e = lk1;
        this.g = true;
        setWillNotDraw(false);
        lk1.setCallback(this);
        if (attributeSet == null) {
            a(new a.C0306a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1849Ql1.a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                c0306a = new a.c();
                c0306a.a.p = false;
            } else {
                c0306a = new a.C0306a();
            }
            a(c0306a.b(typedArrayObtainStyledAttributes).a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(a aVar) {
        boolean zIsStarted;
        LK1 lk1 = this.e;
        lk1.f = aVar;
        if (aVar != null) {
            lk1.b.setXfermode(new PorterDuffXfermode(lk1.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        lk1.b();
        if (lk1.f != null) {
            ValueAnimator valueAnimator = lk1.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                lk1.e.cancel();
                lk1.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            a aVar2 = lk1.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (aVar2.t / aVar2.s) + 1.0f);
            lk1.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(lk1.f.r);
            lk1.e.setRepeatCount(lk1.f.q);
            ValueAnimator valueAnimator2 = lk1.e;
            a aVar3 = lk1.f;
            valueAnimator2.setDuration(aVar3.s + aVar3.t);
            lk1.e.addUpdateListener(lk1.a);
            if (zIsStarted) {
                lk1.e.start();
            }
        }
        lk1.invalidateSelf();
        if (aVar == null || !aVar.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.d);
        }
    }

    public final void b() {
        LK1 lk1 = this.e;
        ValueAnimator valueAnimator = lk1.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && lk1.getCallback() != null) {
                lk1.e.start();
            }
        }
    }

    public final void c() {
        LK1 lk1 = this.e;
        ValueAnimator valueAnimator = lk1.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        lk1.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.g) {
            this.e.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }
}
