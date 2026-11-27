package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class IO1 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    public static final h A;
    public static final i B;
    public static final k C;
    public static final a D;
    public static final b E;
    public static final Rect w = new Rect();
    public static final c x = new c("rotateX", 1);
    public static final d y = new d("rotate", 1);
    public static final e z = new e("rotateY", 1);
    public float h;
    public float i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public ValueAnimator r;
    public float d = 1.0f;
    public float e = 1.0f;
    public float g = 1.0f;
    public int s = 255;
    public Rect t = w;
    public final Camera u = new Camera();
    public final Matrix v = new Matrix();

    public static class a extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void b(Object obj, float f) {
            ((IO1) obj).i(f);
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Float.valueOf(((IO1) obj).d);
        }
    }

    public static class b extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void a(int i, Object obj) {
            ((IO1) obj).setAlpha(i);
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((IO1) obj).s);
        }
    }

    public static class c extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void a(int i, Object obj) {
            ((IO1) obj).k = i;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((IO1) obj).k);
        }
    }

    public static class d extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void a(int i, Object obj) {
            ((IO1) obj).o = i;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((IO1) obj).o);
        }
    }

    public static class e extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void a(int i, Object obj) {
            ((IO1) obj).l = i;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((IO1) obj).l);
        }
    }

    public static class f extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void a(int i, Object obj) {
            ((IO1) obj).m = i;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((IO1) obj).m);
        }
    }

    public static class g extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void a(int i, Object obj) {
            ((IO1) obj).n = i;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((IO1) obj).n);
        }
    }

    public static class h extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void b(Object obj, float f) {
            ((IO1) obj).p = f;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Float.valueOf(((IO1) obj).p);
        }
    }

    public static class i extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void b(Object obj, float f) {
            ((IO1) obj).q = f;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Float.valueOf(((IO1) obj).q);
        }
    }

    public static class j extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void b(Object obj, float f) {
            ((IO1) obj).e = f;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Float.valueOf(((IO1) obj).e);
        }
    }

    public static class k extends AbstractC4455if0 {
        @Override // defpackage.AbstractC4455if0
        public final void b(Object obj, float f) {
            ((IO1) obj).g = f;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Float.valueOf(((IO1) obj).g);
        }
    }

    static {
        new f("translateX", 1);
        new g("translateY", 1);
        A = new h("translateXPercentage", 0);
        B = new i("translateYPercentage", 0);
        new j("scaleX", 0);
        C = new k("scaleY", 0);
        D = new a("scale", 0);
        E = new b("alpha", 1);
    }

    public static Rect b(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i2 = iMin / 2;
        return new Rect(iCenterX - i2, iCenterY - i2, iCenterX + i2, iCenterY + i2);
    }

    public abstract void d(Canvas canvas);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth = this.m;
        if (iWidth == 0) {
            iWidth = (int) (getBounds().width() * this.p);
        }
        int iHeight = this.n;
        if (iHeight == 0) {
            iHeight = (int) (getBounds().height() * this.q);
        }
        canvas.translate(iWidth, iHeight);
        canvas.scale(this.e, this.g, this.h, this.i);
        canvas.rotate(this.o, this.h, this.i);
        if (this.k != 0 || this.l != 0) {
            Camera camera = this.u;
            camera.save();
            camera.rotateX(this.k);
            camera.rotateY(this.l);
            Matrix matrix = this.v;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.h, -this.i);
            matrix.postTranslate(this.h, this.i);
            camera.restore();
            canvas.concat(matrix);
        }
        d(canvas);
    }

    public abstract int e();

    public abstract ValueAnimator f();

    public abstract void g(int i2);

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i2, int i3, int i4, int i5) {
        Rect rect = new Rect(i2, i3, i4, i5);
        this.t = rect;
        this.h = rect.centerX();
        this.i = this.t.centerY();
    }

    public final void i(float f2) {
        this.d = f2;
        this.e = f2;
        this.g = f2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.r;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.s = i2;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.r == null) {
                this.r = f();
            }
            ValueAnimator valueAnimator2 = this.r;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.r.setStartDelay(this.j);
            }
            ValueAnimator valueAnimator3 = this.r;
            this.r = valueAnimator3;
            if (valueAnimator3 == null) {
                return;
            }
            if (!valueAnimator3.isStarted()) {
                valueAnimator3.start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.r.removeAllUpdateListeners();
        this.r.end();
        this.d = 1.0f;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0.0f;
        this.q = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
    }
}
