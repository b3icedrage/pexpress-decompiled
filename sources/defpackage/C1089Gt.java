package defpackage;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: renamed from: Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1089Gt extends Drawable {

    @NonNull
    public final Paint b;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public RJ1 o;
    public ColorStateList p;
    public final SJ1 a = SJ1.a.a;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final a g = new a();
    public boolean n = true;

    /* JADX INFO: renamed from: Gt$a */
    public class a extends Drawable.ConstantState {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return C1089Gt.this;
        }
    }

    public C1089Gt(RJ1 rj1) {
        this.o = rj1;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        boolean z = this.n;
        Paint paint = this.b;
        Rect rect = this.d;
        if (z) {
            copyBounds(rect);
            float fHeight = this.h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C4162hF.b(this.i, this.m), C4162hF.b(this.j, this.m), C4162hF.b(C4162hF.d(this.j, 0), this.m), C4162hF.b(C4162hF.d(this.l, 0), this.m), C4162hF.b(this.l, this.m), C4162hF.b(this.k, this.m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        InterfaceC7807yN interfaceC7807yN = this.o.e;
        RectF rectF2 = this.f;
        rectF2.set(getBounds());
        float fMin = Math.min(interfaceC7807yN.a(rectF2), rectF.width() / 2.0f);
        RJ1 rj1 = this.o;
        rectF2.set(getBounds());
        if (rj1.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void getOutline(@NonNull Outline outline) {
        RJ1 rj1 = this.o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (rj1.d(rectF)) {
            InterfaceC7807yN interfaceC7807yN = this.o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC7807yN.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.e;
        rectF2.set(rect);
        RJ1 rj2 = this.o;
        Path path = this.c;
        this.a.a(rj2, 1.0f, rectF2, null, path);
        S30.a(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        RJ1 rj1 = this.o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (!rj1.d(rectF)) {
            return true;
        }
        int iRound = Math.round(this.h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
