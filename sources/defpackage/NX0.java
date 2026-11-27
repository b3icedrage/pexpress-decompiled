package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;
import io.sentry.android.core.b0;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class NX0 extends Drawable implements InterfaceC5280mK1 {
    public static final Paint A;
    public b d;
    public final C3549eK1.f[] e;
    public final C3549eK1.f[] g;
    public final BitSet h;
    public boolean i;
    public final Matrix j;
    public final Path k;
    public final Path l;
    public final RectF m;
    public final RectF n;
    public final Region o;
    public final Region p;
    public RJ1 q;
    public final Paint r;
    public final Paint s;
    public final QJ1 t;

    @NonNull
    public final a u;
    public final SJ1 v;
    public PorterDuffColorFilter w;
    public PorterDuffColorFilter x;

    @NonNull
    public final RectF y;
    public boolean z;

    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        A = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public NX0() {
        this(new RJ1());
    }

    public final void b(@NonNull RectF rectF, @NonNull Path path) {
        b bVar = this.d;
        this.v.a(bVar.a, bVar.i, rectF, this.u, path);
        if (this.d.h != 1.0f) {
            Matrix matrix = this.j;
            matrix.reset();
            float f = this.d.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.y, true);
    }

    public final int c(int i) {
        b bVar = this.d;
        float f = bVar.m + 0.0f + bVar.l;
        C5649o50 c5649o50 = bVar.b;
        return c5649o50 != null ? c5649o50.a(i, f) : i;
    }

    public final void d(@NonNull Canvas canvas) {
        if (this.h.cardinality() > 0) {
            b0.e("NX0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.d.o;
        Path path = this.k;
        QJ1 qj1 = this.t;
        if (i != 0) {
            canvas.drawPath(path, qj1.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            C3549eK1.f fVar = this.e[i2];
            int i3 = this.d.n;
            Matrix matrix = C3549eK1.f.b;
            fVar.a(matrix, qj1, i3, canvas);
            this.g[i2].a(matrix, qj1, this.d.n, canvas);
        }
        if (this.z) {
            b bVar = this.d;
            int iSin = (int) (Math.sin(Math.toRadians(bVar.p)) * ((double) bVar.o));
            b bVar2 = this.d;
            int iCos = (int) (Math.cos(Math.toRadians(bVar2.p)) * ((double) bVar2.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, A);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Paint paint = this.r;
        paint.setColorFilter(this.w);
        int alpha = paint.getAlpha();
        int i = this.d.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.s;
        paint2.setColorFilter(this.x);
        paint2.setStrokeWidth(this.d.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.d.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.i;
        Path path = this.k;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            RJ1 rj1 = this.d.a;
            RJ1.a aVarE = rj1.e();
            InterfaceC7807yN c5870p8 = rj1.e;
            if (!(c5870p8 instanceof C3451dr1)) {
                c5870p8 = new C5870p8(f, c5870p8);
            }
            aVarE.e = c5870p8;
            InterfaceC7807yN c5870p9 = rj1.f;
            if (!(c5870p9 instanceof C3451dr1)) {
                c5870p9 = new C5870p8(f, c5870p9);
            }
            aVarE.f = c5870p9;
            InterfaceC7807yN c5870p10 = rj1.h;
            if (!(c5870p10 instanceof C3451dr1)) {
                c5870p10 = new C5870p8(f, c5870p10);
            }
            aVarE.h = c5870p10;
            InterfaceC7807yN c5870p11 = rj1.g;
            if (!(c5870p11 instanceof C3451dr1)) {
                c5870p11 = new C5870p8(f, c5870p11);
            }
            aVarE.g = c5870p11;
            RJ1 rj1A = aVarE.a();
            this.q = rj1A;
            float f2 = this.d.i;
            RectF rectF = this.n;
            rectF.set(g());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.v.a(rj1A, f2, rectF, null, this.l);
            b(g(), path);
            this.i = false;
        }
        b bVar = this.d;
        bVar.getClass();
        if (bVar.n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.d.a.d(g()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                b bVar2 = this.d;
                int iSin = (int) (Math.sin(Math.toRadians(bVar2.p)) * ((double) bVar2.o));
                b bVar3 = this.d;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(bVar3.p)) * ((double) bVar3.o)));
                if (this.z) {
                    RectF rectF2 = this.y;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.d.n * 2) + ((int) rectF2.width()) + iWidth, (this.d.n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.d.n) - iWidth;
                    float f4 = (getBounds().top - this.d.n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        b bVar4 = this.d;
        Paint.Style style = bVar4.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, bVar4.a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RJ1 rj1, @NonNull RectF rectF) {
        if (!rj1.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = rj1.f.a(rectF) * this.d.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(@NonNull Canvas canvas) {
        Paint paint = this.s;
        Path path = this.l;
        RJ1 rj1 = this.q;
        RectF rectF = this.n;
        rectF.set(g());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, rj1, rectF);
    }

    @NonNull
    public final RectF g() {
        RectF rectF = this.m;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void getOutline(@NonNull Outline outline) {
        this.d.getClass();
        if (this.d.a.d(g())) {
            outline.setRoundRect(getBounds(), h() * this.d.i);
        } else {
            RectF rectFG = g();
            Path path = this.k;
            b(rectFG, path);
            S30.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.d.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.o;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.k;
        b(rectFG, path);
        Region region2 = this.p;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.d.a.e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.d.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.s.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.i = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.d.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.d.getClass();
        ColorStateList colorStateList2 = this.d.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.d.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.d.b = new C5649o50(context);
        q();
    }

    public final void k(float f) {
        b bVar = this.d;
        if (bVar.m != f) {
            bVar.m = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        b bVar = this.d;
        if (bVar.c != colorStateList) {
            bVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f) {
        b bVar = this.d;
        if (bVar.i != f) {
            bVar.i = f;
            this.i = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.d = new b(this.d);
        return this;
    }

    public final void n() {
        this.t.a(-12303292);
        this.d.getClass();
        super.invalidateSelf();
    }

    public final boolean o(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.d.c == null || color2 == (colorForState2 = this.d.c.getColorForState(iArr, (color2 = (paint2 = this.r).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.d.d == null || color == (colorForState = this.d.d.getColorForState(iArr, (color = (paint = this.s).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.i = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = o(iArr) || p();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        PorterDuffColorFilter porterDuffColorFilter3 = this.x;
        b bVar = this.d;
        ColorStateList colorStateList = bVar.e;
        PorterDuff.Mode mode = bVar.f;
        Paint paint = this.r;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.w = porterDuffColorFilter;
        this.d.getClass();
        this.x = null;
        this.d.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.w) && Objects.equals(porterDuffColorFilter3, this.x)) ? false : true;
    }

    public final void q() {
        b bVar = this.d;
        float f = bVar.m + 0.0f;
        bVar.n = (int) Math.ceil(0.75f * f);
        this.d.o = (int) Math.ceil(f * 0.25f);
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.d;
        if (bVar.k != i) {
            bVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.InterfaceC5280mK1
    public final void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        this.d.a = rj1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.d.e = colorStateList;
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.d;
        if (bVar.f != mode) {
            bVar.f = mode;
            p();
            super.invalidateSelf();
        }
    }

    public NX0(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        this(RJ1.b(context, attributeSet, i, i2).a());
    }

    public NX0(@NonNull RJ1 rj1) {
        this(new b(rj1));
    }

    public NX0(@NonNull b bVar) {
        SJ1 sj1;
        this.e = new C3549eK1.f[4];
        this.g = new C3549eK1.f[4];
        this.h = new BitSet(8);
        this.j = new Matrix();
        this.k = new Path();
        this.l = new Path();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new Region();
        this.p = new Region();
        Paint paint = new Paint(1);
        this.r = paint;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.t = new QJ1();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            sj1 = SJ1.a.a;
        } else {
            sj1 = new SJ1();
        }
        this.v = sj1;
        this.y = new RectF();
        this.z = true;
        this.d = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.u = new a();
    }

    public static class b extends Drawable.ConstantState {

        @NonNull
        public RJ1 a;
        public C5649o50 b;
        public ColorStateList c;
        public ColorStateList d;
        public ColorStateList e;
        public PorterDuff.Mode f;
        public Rect g;
        public final float h;
        public float i;
        public float j;
        public int k;
        public float l;
        public float m;
        public int n;
        public int o;
        public final int p;
        public final Paint.Style q;

        public b(@NonNull RJ1 rj1) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = Paint.Style.FILL_AND_STROKE;
            this.a = rj1;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            NX0 nx0 = new NX0(this);
            nx0.i = true;
            return nx0;
        }

        public b(@NonNull b bVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = Paint.Style.FILL_AND_STROKE;
            this.a = bVar.a;
            this.b = bVar.b;
            this.j = bVar.j;
            this.c = bVar.c;
            this.d = bVar.d;
            this.f = bVar.f;
            this.e = bVar.e;
            this.k = bVar.k;
            this.h = bVar.h;
            this.o = bVar.o;
            this.i = bVar.i;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.p = bVar.p;
            this.q = bVar.q;
            if (bVar.g != null) {
                this.g = new Rect(bVar.g);
            }
        }
    }
}
