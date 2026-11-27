package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.pexpress.tool.R;
import defpackage.C1874Qu;
import defpackage.C2083Tl1;
import defpackage.C5345me2;
import defpackage.C7013uc;
import defpackage.C7103v11;
import defpackage.Cd2;
import defpackage.Fe2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public final ValueAnimator d;
    public boolean e;
    public final ArrayList g;
    public final int h;
    public final float i;
    public final Paint j;
    public final RectF k;
    public final int l;
    public float m;
    public boolean n;
    public double o;
    public int p;
    public int q;

    public interface a {
        void a(float f);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.d = new ValueAnimator();
        this.g = new ArrayList();
        Paint paint = new Paint();
        this.j = paint;
        this.k = new RectF();
        this.q = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.l, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        C7103v11.c(context, R.attr.motionDurationLong2, HttpPlatformResponse.MAX_MESSAGE_LENGTH);
        C7103v11.d(context, R.attr.motionEasingEmphasizedInterpolator, C7013uc.b);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.i = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.p * 0.66f) : this.p;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.m = f2;
        this.o = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.q);
        float fCos = (((float) Math.cos(this.o)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.o))) + height;
        float f3 = this.h;
        this.k.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.q);
        float f = width;
        float f2 = iA;
        float fCos = (((float) Math.cos(this.o)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.o))) + f3;
        Paint paint = this.j;
        paint.setStrokeWidth(0.0f);
        int i = this.h;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.o);
        double d = iA - i;
        paint.setStrokeWidth(this.l);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.o) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.i, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d.isRunning()) {
            return;
        }
        b(this.m);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.n = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.n;
            if (this.e) {
                this.q = C1874Qu.l((float) (getWidth() / 2), (float) (getHeight() / 2), x, y) <= ((float) a(2)) + Fe2.b(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.n;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.m != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            b(f);
            z3 = true;
        }
        this.n = z4 | z3;
        return true;
    }
}
