package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;
import defpackage.A;
import defpackage.A30;
import defpackage.C4162hF;
import defpackage.C6683t11;
import defpackage.C7080uu1;
import defpackage.Fe2;
import defpackage.InterfaceC3014bl2;
import defpackage.NX0;
import defpackage.RJ1;
import defpackage.SX1;
import defpackage.XX1;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends NX0 implements Drawable.Callback, XX1.b {
    public static final int[] J0 = {R.attr.state_enabled};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public ColorStateList B;
    public PorterDuff.Mode B0;
    public ColorStateList C;
    public int[] C0;
    public float D;
    public ColorStateList D0;
    public float E;

    @NonNull
    public WeakReference<InterfaceC0309a> E0;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public float G;
    public boolean G0;
    public ColorStateList H;
    public int H0;
    public CharSequence I;
    public boolean I0;
    public boolean J;
    public Drawable K;
    public ColorStateList L;
    public float M;
    public boolean N;
    public boolean O;
    public Drawable P;
    public RippleDrawable Q;
    public ColorStateList R;
    public float S;
    public SpannableStringBuilder T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public ColorStateList X;
    public C6683t11 Y;
    public C6683t11 Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;

    @NonNull
    public final Context i0;
    public final Paint j0;
    public final Paint.FontMetrics k0;
    public final RectF l0;
    public final PointF m0;
    public final Path n0;

    @NonNull
    public final XX1 o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public int w0;
    public int x0;
    public ColorFilter y0;
    public PorterDuffColorFilter z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0309a {
        void a();
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action);
        this.E = -1.0f;
        this.j0 = new Paint(1);
        this.k0 = new Paint.FontMetrics();
        this.l0 = new RectF();
        this.m0 = new PointF();
        this.n0 = new Path();
        this.x0 = 255;
        this.B0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference<>(null);
        j(context);
        this.i0 = context;
        XX1 xx1 = new XX1(this);
        this.o0 = xx1;
        this.I = "";
        xx1.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J0;
        setState(iArr);
        if (!Arrays.equals(this.C0, iArr)) {
            this.C0 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.G0 = true;
        int[] iArr2 = C7080uu1.a;
        K0.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.U != z) {
            this.U = z;
            float fT = t();
            if (!z && this.v0) {
                this.v0 = false;
            }
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.W != drawable) {
            float fT = t();
            this.W = drawable;
            float fT2 = t();
            X(this.W);
            r(this.W);
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.V && (drawable = this.W) != null && this.U) {
                A30.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z) {
        if (this.V != z) {
            boolean zU = U();
            this.V = z;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    r(this.W);
                } else {
                    X(this.W);
                }
                invalidateSelf();
                y();
            }
        }
    }

    @Deprecated
    public final void E(float f) {
        if (this.E != f) {
            this.E = f;
            RJ1.a aVarE = this.d.a.e();
            aVarE.e = new A(f);
            aVarE.f = new A(f);
            aVarE.g = new A(f);
            aVarE.h = new A(f);
            setShapeAppearanceModel(aVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void F(Drawable drawable) {
        ?? B;
        Object obj = this.K;
        if (obj != null) {
            boolean z = obj instanceof InterfaceC3014bl2;
            B = obj;
            if (z) {
                B = ((InterfaceC3014bl2) obj).b();
            }
        } else {
            B = 0;
        }
        if (B != drawable) {
            float fT = t();
            this.K = drawable != null ? drawable.mutate() : null;
            float fT2 = t();
            X(B);
            if (V()) {
                r(this.K);
            }
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void G(float f) {
        if (this.M != f) {
            float fT = t();
            this.M = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (V()) {
                A30.a.h(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z) {
        if (this.J != z) {
            boolean zV = V();
            this.J = z;
            boolean zV2 = V();
            if (zV != zV2) {
                if (zV2) {
                    r(this.K);
                } else {
                    X(this.K);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.I0) {
                NX0.b bVar = this.d;
                if (bVar.d != colorStateList) {
                    bVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        if (this.G != f) {
            this.G = f;
            this.j0.setStrokeWidth(f);
            if (this.I0) {
                this.d.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void L(Drawable drawable) {
        ?? B;
        Object obj = this.P;
        if (obj != null) {
            boolean z = obj instanceof InterfaceC3014bl2;
            B = obj;
            if (z) {
                B = ((InterfaceC3014bl2) obj).b();
            }
        } else {
            B = 0;
        }
        if (B != drawable) {
            float fU = u();
            this.P = drawable != null ? drawable.mutate() : null;
            int[] iArr = C7080uu1.a;
            this.Q = new RippleDrawable(C7080uu1.c(this.H), this.P, K0);
            float fU2 = u();
            X(B);
            if (W()) {
                r(this.P);
            }
            invalidateSelf();
            if (fU != fU2) {
                y();
            }
        }
    }

    public final void M(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f) {
        if (this.S != f) {
            this.S = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (W()) {
                A30.a.h(this.P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.O != z) {
            boolean zW = W();
            this.O = z;
            boolean zW2 = W();
            if (zW != zW2) {
                if (zW2) {
                    r(this.P);
                } else {
                    X(this.P);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f) {
        if (this.c0 != f) {
            float fT = t();
            this.c0 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void S(float f) {
        if (this.b0 != f) {
            float fT = t();
            this.b0 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.D0 = null;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.V && this.W != null && this.v0;
    }

    public final boolean V() {
        return this.J && this.K != null;
    }

    public final boolean W() {
        return this.O && this.P != null;
    }

    @Override // XX1.b
    public final void a() {
        y();
        invalidateSelf();
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.x0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.I0;
        Paint paint = this.j0;
        RectF rectF = this.l0;
        if (!z) {
            paint.setColor(this.p0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (!this.I0) {
            paint.setColor(this.q0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.y0;
            if (colorFilter == null) {
                colorFilter = this.z0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (this.I0) {
            super.draw(canvas);
        }
        if (this.G > 0.0f && !this.I0) {
            paint.setColor(this.s0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.I0) {
                ColorFilter colorFilter2 = this.y0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.z0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.G / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.E - (this.G / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.t0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.I0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.n0;
            NX0.b bVar = this.d;
            this.v.a(bVar.a, bVar.i, rectF2, this.u, path);
            e(canvas2, paint, path, this.d.a, g());
        } else {
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (V()) {
            s(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.K.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.K.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (U()) {
            s(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.G0 && this.I != null) {
            PointF pointF = this.m0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.I;
            XX1 xx1 = this.o0;
            if (charSequence != null) {
                float fT = t() + this.a0 + this.d0;
                if (A30.b.a(this) == 0) {
                    pointF.x = bounds.left + fT;
                } else {
                    pointF.x = bounds.right - fT;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = xx1.a;
                Paint.FontMetrics fontMetrics = this.k0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.I != null) {
                float fT2 = t() + this.a0 + this.d0;
                float fU = u() + this.h0 + this.e0;
                if (A30.b.a(this) == 0) {
                    rectF.left = bounds.left + fT2;
                    rectF.right = bounds.right - fU;
                } else {
                    rectF.left = bounds.left + fU;
                    rectF.right = bounds.right - fT2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            SX1 sx1 = xx1.f;
            TextPaint textPaint2 = xx1.a;
            if (sx1 != null) {
                textPaint2.drawableState = getState();
                xx1.f.e(this.i0, textPaint2, xx1.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(xx1.a(this.I.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.I;
            if (z2 && this.F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.F0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (W()) {
            rectF.setEmpty();
            if (W()) {
                float f8 = this.h0 + this.g0;
                if (A30.b.a(this) == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.S;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.S;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f11 = this.S;
                float f12 = fExactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.P.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = C7080uu1.a;
            this.Q.setBounds(this.P.getBounds());
            this.Q.jumpToCurrentState();
            this.Q.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.x0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.o0.a(this.I.toString()) + t() + this.a0 + this.d0 + this.e0 + this.h0), this.H0);
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.D, this.E);
        } else {
            outline.setRoundRect(bounds, this.E);
            outline2 = outline;
        }
        outline2.setAlpha(this.x0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (w(this.B) || w(this.C) || w(this.F)) {
            return true;
        }
        SX1 sx1 = this.o0.f;
        if (sx1 == null || (colorStateList = sx1.j) == null || !colorStateList.isStateful()) {
            return (this.V && this.W != null && this.U) || x(this.K) || x(this.W) || w(this.A0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (V()) {
            zOnLayoutDirectionChanged |= A30.b.b(this.K, i);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= A30.b.b(this.W, i);
        }
        if (W()) {
            zOnLayoutDirectionChanged |= A30.b.b(this.P, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (V()) {
            zOnLevelChange |= this.K.setLevel(i);
        }
        if (U()) {
            zOnLevelChange |= this.W.setLevel(i);
        }
        if (W()) {
            zOnLevelChange |= this.P.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.C0);
    }

    public final void r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        A30.b.b(drawable, A30.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(this.C0);
            }
            A30.a.h(drawable, this.R);
            return;
        }
        Drawable drawable2 = this.K;
        if (drawable == drawable2 && this.N) {
            A30.a.h(drawable2, this.L);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void s(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f = this.a0 + this.b0;
            Drawable drawable = this.v0 ? this.W : this.K;
            float intrinsicWidth = this.M;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (A30.b.a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.v0 ? this.W : this.K;
            float fCeil = this.M;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(Fe2.b(this.i0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.y0 != colorFilter) {
            this.y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.B0 != mode) {
            this.B0 = mode;
            ColorStateList colorStateList = this.A0;
            this.z0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (V()) {
            visible |= this.K.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (W()) {
            visible |= this.P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return 0.0f;
        }
        float f = this.b0;
        Drawable drawable = this.v0 ? this.W : this.K;
        float intrinsicWidth = this.M;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.c0;
    }

    public final float u() {
        if (W()) {
            return this.f0 + this.S + this.g0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.I0 ? h() : this.E;
    }

    public final void y() {
        InterfaceC0309a interfaceC0309a = this.E0.get();
        if (interfaceC0309a != null) {
            interfaceC0309a.a();
        }
    }

    public final boolean z(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.B;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.p0) : 0);
        if (this.p0 != iC) {
            this.p0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.C;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.q0) : 0);
        if (this.q0 != iC2) {
            this.q0 = iC2;
            zOnStateChange = true;
        }
        int iB = C4162hF.b(iC2, iC);
        if ((this.r0 != iB) | (this.d.c == null)) {
            this.r0 = iB;
            l(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.F;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.s0) : 0;
        if (this.s0 != colorForState) {
            this.s0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !C7080uu1.d(iArr)) ? 0 : this.D0.getColorForState(iArr, this.t0);
        if (this.t0 != colorForState2) {
            this.t0 = colorForState2;
        }
        SX1 sx1 = this.o0.f;
        int colorForState3 = (sx1 == null || (colorStateList = sx1.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.u0);
        if (this.u0 != colorForState3) {
            this.u0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.U) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.v0 == z || this.W == null) {
            z2 = false;
        } else {
            float fT = t();
            this.v0 = z;
            if (fT != t()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.A0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.w0) : 0;
        if (this.w0 != colorForState4) {
            this.w0 = colorForState4;
            ColorStateList colorStateList6 = this.A0;
            PorterDuff.Mode mode = this.B0;
            this.z0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (x(this.K)) {
            state |= this.K.setState(iArr);
        }
        if (x(this.W)) {
            state |= this.W.setState(iArr);
        }
        if (x(this.P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.P.setState(iArr3);
        }
        int[] iArr4 = C7080uu1.a;
        if (x(this.Q)) {
            state |= this.Q.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            y();
        }
        return state;
    }
}
