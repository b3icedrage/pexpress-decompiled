package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.github.chrisbanes.photoview.PhotoView;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;

/* JADX INFO: renamed from: zd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC8070zd1 implements View.OnTouchListener, View.OnLayoutChangeListener {
    public final a A;
    public final PhotoView l;
    public final GestureDetector m;
    public final C5509nR n;
    public View.OnClickListener t;
    public View.OnLongClickListener u;
    public d v;
    public final AccelerateDecelerateInterpolator d = new AccelerateDecelerateInterpolator();
    public int e = HttpPlatformResponse.MAX_MESSAGE_LENGTH;
    public float g = 1.0f;
    public float h = 1.75f;
    public float i = 3.0f;
    public boolean j = true;
    public boolean k = false;
    public final Matrix o = new Matrix();
    public final Matrix p = new Matrix();
    public final Matrix q = new Matrix();
    public final RectF r = new RectF();
    public final float[] s = new float[9];
    public int w = 2;
    public int x = 2;
    public boolean y = true;
    public ImageView.ScaleType z = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: zd1$a */
    public class a {
        public a() {
        }

        public final void a(float f, float f2, float f3) {
            ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = ViewOnTouchListenerC8070zd1.this;
            if (viewOnTouchListenerC8070zd1.d() < viewOnTouchListenerC8070zd1.i || f < 1.0f) {
                viewOnTouchListenerC8070zd1.getClass();
                viewOnTouchListenerC8070zd1.q.postScale(f, f, f2, f3);
                viewOnTouchListenerC8070zd1.a();
            }
        }
    }

    /* JADX INFO: renamed from: zd1$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: zd1$c */
    public class c implements Runnable {
        public final float d;
        public final float e;
        public final long g = System.currentTimeMillis();
        public final float h;
        public final float i;

        public c(float f, float f2, float f3, float f4) {
            this.d = f3;
            this.e = f4;
            this.h = f;
            this.i = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.g) * 1.0f;
            ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = ViewOnTouchListenerC8070zd1.this;
            float interpolation = viewOnTouchListenerC8070zd1.d.getInterpolation(Math.min(1.0f, fCurrentTimeMillis / viewOnTouchListenerC8070zd1.e));
            float f = this.i;
            float f2 = this.h;
            viewOnTouchListenerC8070zd1.A.a(BX.a(f, f2, interpolation, f2) / viewOnTouchListenerC8070zd1.d(), this.d, this.e);
            if (interpolation < 1.0f) {
                viewOnTouchListenerC8070zd1.l.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: zd1$d */
    public class d implements Runnable {
        public final OverScroller d;
        public int e;
        public int g;

        public d(Context context) {
            this.d = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.d;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = ViewOnTouchListenerC8070zd1.this;
                viewOnTouchListenerC8070zd1.q.postTranslate(this.e - currX, this.g - currY);
                viewOnTouchListenerC8070zd1.a();
                this.e = currX;
                this.g = currY;
                viewOnTouchListenerC8070zd1.l.postOnAnimation(this);
            }
        }
    }

    public ViewOnTouchListenerC8070zd1(PhotoView photoView) {
        a aVar = new a();
        this.A = aVar;
        this.l = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.n = new C5509nR(photoView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new C0575Ad1(this));
        this.m = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC0653Bd1(this));
    }

    public final void a() {
        if (b()) {
            this.l.setImageMatrix(c());
        }
    }

    public final boolean b() {
        RectF rectF;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Matrix matrixC = c();
        Drawable drawable = this.l.getDrawable();
        float f6 = 0.0f;
        if (drawable != null) {
            rectF = this.r;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrixC.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        PhotoView photoView = this.l;
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (fHeight <= height) {
            int i = b.a[this.z.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (height - fHeight) / 2.0f;
                    f5 = rectF.top;
                } else {
                    f4 = height - fHeight;
                    f5 = rectF.top;
                }
                f = f4 - f5;
            } else {
                f = -rectF.top;
            }
            this.x = 2;
        } else {
            float f7 = rectF.top;
            if (f7 > 0.0f) {
                this.x = 0;
                f = -f7;
            } else {
                float f8 = rectF.bottom;
                if (f8 < height) {
                    this.x = 1;
                    f = height - f8;
                } else {
                    this.x = -1;
                    f = 0.0f;
                }
            }
        }
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (fWidth <= width) {
            int i2 = b.a[this.z.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (width - fWidth) / 2.0f;
                    f3 = rectF.left;
                } else {
                    f2 = width - fWidth;
                    f3 = rectF.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -rectF.left;
            }
            this.w = 2;
        } else {
            float f9 = rectF.left;
            if (f9 > 0.0f) {
                this.w = 0;
                f6 = -f9;
            } else {
                float f10 = rectF.right;
                if (f10 < width) {
                    f6 = width - f10;
                    this.w = 1;
                } else {
                    this.w = -1;
                }
            }
        }
        this.q.postTranslate(f6, f);
        return true;
    }

    public final Matrix c() {
        Matrix matrix = this.p;
        matrix.set(this.o);
        matrix.postConcat(this.q);
        return matrix;
    }

    public final float d() {
        Matrix matrix = this.q;
        float[] fArr = this.s;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void e(float f, float f2, float f3, boolean z) {
        if (f < this.g || f > this.i) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.l.post(new c(d(), f, f2, f3));
        } else {
            this.q.setScale(f, f, f2, f3);
            a();
        }
    }

    public final void f() {
        if (this.y) {
            g(this.l.getDrawable());
            return;
        }
        Matrix matrix = this.q;
        matrix.reset();
        matrix.postRotate(0.0f);
        a();
        this.l.setImageMatrix(c());
        b();
    }

    public final void g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.l;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.o;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        ImageView.ScaleType scaleType = this.z;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((width - (f * fMax)) / 2.0f, (height - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((width - (f * fMin)) / 2.0f, (height - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = b.a[this.z.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.q;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        a();
        this.l.setImageMatrix(c());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        g(this.l.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C5509nR c5509nR;
        GestureDetector gestureDetector;
        ScaleGestureDetector scaleGestureDetector;
        boolean zIsInProgress;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (!this.y || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = null;
        if (action != 0) {
            if (action == 1 || action == 3) {
                float fD = d();
                float f = this.g;
                RectF rectF2 = this.r;
                if (fD < f) {
                    b();
                    Matrix matrixC = c();
                    Drawable drawable = this.l.getDrawable();
                    if (drawable != null) {
                        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        matrixC.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF3 = rectF;
                        view.post(new c(d(), this.g, rectF3.centerX(), rectF3.centerY()));
                        z = true;
                    }
                } else if (d() > this.i) {
                    b();
                    Matrix matrixC2 = c();
                    Drawable drawable2 = this.l.getDrawable();
                    if (drawable2 != null) {
                        rectF2.set(0.0f, 0.0f, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                        matrixC2.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF4 = rectF;
                        view.post(new c(d(), this.i, rectF4.centerX(), rectF4.centerY()));
                        z = true;
                    }
                }
            }
            c5509nR = this.n;
            if (c5509nR != null) {
                scaleGestureDetector = c5509nR.c;
                zIsInProgress = scaleGestureDetector.isInProgress();
                z2 = c5509nR.e;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    c5509nR.a(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                if (!zIsInProgress || scaleGestureDetector.isInProgress()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2 || c5509nR.e) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3 && z4) {
                    z5 = true;
                }
                this.k = z5;
                z = true;
            }
            gestureDetector = this.m;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.d.forceFinished(true);
            this.v = null;
        }
        z = false;
        c5509nR = this.n;
        if (c5509nR != null) {
            scaleGestureDetector = c5509nR.c;
            zIsInProgress = scaleGestureDetector.isInProgress();
            z2 = c5509nR.e;
            scaleGestureDetector.onTouchEvent(motionEvent);
            c5509nR.a(motionEvent);
            if (zIsInProgress) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (z2) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z3) {
                z5 = true;
            }
            this.k = z5;
            z = true;
        }
        gestureDetector = this.m;
        if (gestureDetector == null) {
        }
        return z;
    }
}
