package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.pexpress.tool.R;
import defpackage.C2083Tl1;
import defpackage.C6333rM;
import defpackage.InterfaceC5280mK1;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.RJ1;
import defpackage.SJ1;

/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC5280mK1 {
    public final SJ1 h;
    public final RectF i;
    public final RectF j;
    public final Paint k;
    public final Paint l;
    public final Path m;
    public ColorStateList n;
    public NX0 o;
    public RJ1 p;
    public float q;
    public final Path r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public boolean y;

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public class a extends ViewOutlineProvider {
        public final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.p == null) {
                return;
            }
            if (shapeableImageView.o == null) {
                shapeableImageView.o = new NX0(shapeableImageView.p);
            }
            RectF rectF = shapeableImageView.i;
            Rect rect = this.a;
            rectF.round(rect);
            shapeableImageView.o.setBounds(rect);
            shapeableImageView.o.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.h = SJ1.a.a;
        this.m = new Path();
        this.y = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.i = new RectF();
        this.j = new RectF();
        this.r = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C2083Tl1.I, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.n = MX0.b(context2, typedArrayObtainStyledAttributes, 9);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.s = dimensionPixelSize;
        this.t = dimensionPixelSize;
        this.u = dimensionPixelSize;
        this.v = dimensionPixelSize;
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.p = RJ1.b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new a());
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        RectF rectF = this.i;
        rectF.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        RJ1 rj1 = this.p;
        Path path = this.m;
        this.h.a(rj1, 1.0f, rectF, null, path);
        Path path2 = this.r;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.v;
    }

    public final int getContentPaddingEnd() {
        int i = this.x;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.s : this.u;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.w != Integer.MIN_VALUE || this.x != Integer.MIN_VALUE) {
            if (c() && (i2 = this.x) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && (i = this.w) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.s;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (this.w != Integer.MIN_VALUE || this.x != Integer.MIN_VALUE) {
            if (c() && (i2 = this.w) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && (i = this.x) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.u;
    }

    public final int getContentPaddingStart() {
        int i = this.w;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.u : this.s;
    }

    public int getContentPaddingTop() {
        return this.t;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public RJ1 getShapeAppearanceModel() {
        return this.p;
    }

    public ColorStateList getStrokeColor() {
        return this.n;
    }

    public float getStrokeWidth() {
        return this.q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.r, this.l);
        if (this.n == null) {
            return;
        }
        Paint paint = this.k;
        paint.setStrokeWidth(this.q);
        int colorForState = this.n.getColorForState(getDrawableState(), this.n.getDefaultColor());
        if (this.q <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.m, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.y && isLayoutDirectionResolved()) {
            this.y = true;
            if (!isPaddingRelative() && this.w == Integer.MIN_VALUE && this.x == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.InterfaceC5280mK1
    public void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        this.p = rj1;
        NX0 nx0 = this.o;
        if (nx0 != null) {
            nx0.setShapeAppearanceModel(rj1);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.n = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C6333rM.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.q != f) {
            this.q = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }
}
