package com.github.rongi.rotate_layout.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.C1927Rl1;

/* JADX INFO: loaded from: classes.dex */
public class RotateLayout extends ViewGroup {
    public int d;
    public final Matrix e;
    public final Rect g;
    public final RectF h;
    public final RectF i;
    public final float[] j;
    public final float[] k;
    public boolean l;

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Matrix();
        this.g = new Rect();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1927Rl1.a);
        this.d = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public final Double a() {
        return Double.valueOf((((double) this.d) * 6.283185307179586d) / 360.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate(-this.d, getWidth() / 2.0f, getHeight() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float[] fArr = this.j;
        fArr[0] = x;
        fArr[1] = motionEvent.getY();
        Matrix matrix = this.e;
        float[] fArr2 = this.k;
        matrix.mapPoints(fArr2, fArr);
        motionEvent.setLocation(fArr2[0], fArr2[1]);
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        motionEvent.setLocation(fArr[0], fArr[1]);
        return zDispatchTouchEvent;
    }

    public int getAngle() {
        return this.d;
    }

    public View getView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.l || z) {
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, i5, i6);
            RectF rectF2 = this.i;
            Matrix matrix = this.e;
            matrix.setRotate(this.d, rectF.centerX(), rectF.centerY());
            matrix.mapRect(rectF2, rectF);
            rectF2.round(this.g);
            this.l = false;
        }
        View view = getView();
        if (view != null) {
            int measuredWidth = (i5 - view.getMeasuredWidth()) / 2;
            int measuredHeight = (i6 - view.getMeasuredHeight()) / 2;
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = getView();
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (Math.abs(this.d % 180) == 90) {
            measureChild(view, i2, i);
            setMeasuredDimension(View.resolveSize(view.getMeasuredHeight(), i), View.resolveSize(view.getMeasuredWidth(), i2));
            return;
        }
        if (Math.abs(this.d % 180) == 0) {
            measureChild(view, i, i2);
            setMeasuredDimension(View.resolveSize(view.getMeasuredWidth(), i), View.resolveSize(view.getMeasuredHeight(), i2));
            return;
        }
        measureChild(view, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(View.resolveSize((int) Math.ceil((Math.abs(Math.sin(a().doubleValue())) * ((double) view.getMeasuredHeight())) + (Math.abs(Math.cos(a().doubleValue())) * ((double) view.getMeasuredWidth()))), i), View.resolveSize((int) Math.ceil((Math.abs(Math.cos(a().doubleValue())) * ((double) view.getMeasuredHeight())) + (Math.abs(Math.sin(a().doubleValue())) * ((double) view.getMeasuredWidth()))), i2));
    }

    public void setAngle(int i) {
        if (this.d != i) {
            this.d = i;
            this.l = true;
            requestLayout();
            invalidate();
        }
    }
}
