package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import defpackage.FA;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: wA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7347wA<T extends FA<? extends InterfaceC6653ss0<? extends C3506e70>>> extends ViewGroup implements HA {
    public float A;
    public float B;
    public boolean C;
    public C7482wo0[] D;
    public float E;
    public boolean F;
    public InterfaceC6446rt0 G;
    public ArrayList<Runnable> H;
    public boolean I;
    public boolean d;
    public T e;
    public boolean g;
    public boolean h;
    public float i;
    public C6783tW j;
    public Paint k;
    public Paint l;
    public Hl2 m;
    public boolean n;
    public CY o;
    public C4871kP0 p;
    public PA q;
    public String r;
    public R81 s;
    public C5294mP0 t;
    public AbstractC8032zS u;
    public GA v;
    public C4454ie2 w;
    public C7558xA x;
    public float y;
    public float z;

    public AbstractC7347wA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = null;
        this.g = true;
        this.h = true;
        this.i = 0.9f;
        this.j = new C6783tW(0);
        this.n = true;
        this.r = "No chart data available.";
        this.w = new C4454ie2();
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = false;
        this.E = 0.0f;
        this.F = true;
        this.H = new ArrayList<>();
        this.I = false;
        e();
    }

    public static void g(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                g(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public void b(Canvas canvas) {
        C7482wo0[] c7482wo0Arr;
        if (this.G == null || !this.F || (c7482wo0Arr = this.D) == null || c7482wo0Arr.length <= 0 || c7482wo0Arr[0] == null) {
            return;
        }
        int i = 0;
        while (true) {
            C7482wo0[] c7482wo0Arr2 = this.D;
            if (i >= c7482wo0Arr2.length) {
                return;
            }
            C7482wo0 c7482wo0 = c7482wo0Arr2[i];
            InterfaceC6653ss0 interfaceC6653ss0E = this.e.e(c7482wo0.f);
            C3506e70 c3506e70I = this.e.i(this.D[i]);
            int iP = interfaceC6653ss0E.p(c3506e70I);
            if (c3506e70I != null) {
                float f = iP;
                float fT = interfaceC6653ss0E.T();
                this.x.getClass();
                if (f <= fT * 1.0f) {
                    float[] fArr = {c7482wo0.h, c7482wo0.i};
                    C4454ie2 c4454ie2 = this.w;
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    if (c4454ie2.h(f2) && c4454ie2.i(f3)) {
                        this.G.b(c3506e70I, c7482wo0);
                        this.G.a(canvas, fArr[0], fArr[1]);
                    }
                }
            }
            i++;
        }
    }

    public C7482wo0 c(float f, float f2) {
        if (this.e != null) {
            return getHighlighter().a(f, f2);
        }
        b0.c("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    public final void d(C7482wo0 c7482wo0) {
        if (c7482wo0 == null) {
            this.D = null;
        } else {
            if (this.d) {
                c7482wo0.toString();
            }
            if (this.e.i(c7482wo0) == null) {
                this.D = null;
            } else {
                this.D = new C7482wo0[]{c7482wo0};
            }
        }
        setLastHighlighted(this.D);
        invalidate();
    }

    public void e() {
        setWillNotDraw(false);
        this.x = new C7558xA();
        Context context = getContext();
        DisplayMetrics displayMetrics = AbstractC8067zc2.a;
        if (context == null) {
            AbstractC8067zc2.b = ViewConfiguration.getMinimumFlingVelocity();
            AbstractC8067zc2.c = ViewConfiguration.getMaximumFlingVelocity();
            b0.c("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            AbstractC8067zc2.b = viewConfiguration.getScaledMinimumFlingVelocity();
            AbstractC8067zc2.c = viewConfiguration.getScaledMaximumFlingVelocity();
            AbstractC8067zc2.a = context.getResources().getDisplayMetrics();
        }
        this.E = AbstractC8067zc2.c(500.0f);
        CY cy = new CY();
        cy.f = "Description Label";
        cy.g = Paint.Align.RIGHT;
        cy.d = AbstractC8067zc2.c(8.0f);
        this.o = cy;
        C4871kP0 c4871kP0 = new C4871kP0();
        c4871kP0.f = new C5081lP0[0];
        c4871kP0.g = C4871kP0.c.d;
        c4871kP0.h = C4871kP0.e.d;
        c4871kP0.i = C4871kP0.d.d;
        c4871kP0.j = C4871kP0.a.d;
        c4871kP0.k = C4871kP0.b.g;
        c4871kP0.l = 8.0f;
        c4871kP0.m = 3.0f;
        c4871kP0.n = 6.0f;
        c4871kP0.o = 5.0f;
        c4871kP0.p = 3.0f;
        c4871kP0.q = 0.95f;
        c4871kP0.r = 0.0f;
        c4871kP0.s = 0.0f;
        c4871kP0.t = new ArrayList(16);
        c4871kP0.u = new ArrayList(16);
        c4871kP0.v = new ArrayList(16);
        c4871kP0.d = AbstractC8067zc2.c(10.0f);
        c4871kP0.b = AbstractC8067zc2.c(5.0f);
        c4871kP0.c = AbstractC8067zc2.c(3.0f);
        this.p = c4871kP0;
        C5294mP0 c5294mP0 = new C5294mP0(this.w, 2);
        c5294mP0.f = new ArrayList(16);
        c5294mP0.g = new Paint.FontMetrics();
        c5294mP0.h = new Path();
        c5294mP0.e = c4871kP0;
        Paint paint = new Paint(1);
        c5294mP0.c = paint;
        paint.setTextSize(AbstractC8067zc2.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        c5294mP0.d = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.t = c5294mP0;
        Hl2 hl2 = new Hl2();
        hl2.A = 1;
        hl2.B = Hl2.a.d;
        hl2.c = AbstractC8067zc2.c(4.0f);
        this.m = hl2;
        this.k = new Paint(1);
        Paint paint3 = new Paint(1);
        this.l = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.l.setTextAlign(Paint.Align.CENTER);
        this.l.setTextSize(AbstractC8067zc2.c(12.0f));
    }

    public abstract void f();

    public C7558xA getAnimator() {
        return this.x;
    }

    public C3791fV0 getCenter() {
        return C3791fV0.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public C3791fV0 getCenterOfView() {
        return getCenter();
    }

    public C3791fV0 getCenterOffsets() {
        RectF rectF = this.w.b;
        return C3791fV0.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.w.b;
    }

    public T getData() {
        return this.e;
    }

    public Vc2 getDefaultValueFormatter() {
        return this.j;
    }

    public CY getDescription() {
        return this.o;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.i;
    }

    public float getExtraBottomOffset() {
        return this.A;
    }

    public float getExtraLeftOffset() {
        return this.B;
    }

    public float getExtraRightOffset() {
        return this.z;
    }

    public float getExtraTopOffset() {
        return this.y;
    }

    public C7482wo0[] getHighlighted() {
        return this.D;
    }

    public InterfaceC1009Fs0 getHighlighter() {
        return this.v;
    }

    public ArrayList<Runnable> getJobs() {
        return this.H;
    }

    public C4871kP0 getLegend() {
        return this.p;
    }

    public C5294mP0 getLegendRenderer() {
        return this.t;
    }

    public InterfaceC6446rt0 getMarker() {
        return this.G;
    }

    @Deprecated
    public InterfaceC6446rt0 getMarkerView() {
        return getMarker();
    }

    @Override // defpackage.HA
    public float getMaxHighlightDistance() {
        return this.E;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public R81 getOnChartGestureListener() {
        return this.s;
    }

    public PA getOnTouchListener() {
        return this.q;
    }

    public AbstractC8032zS getRenderer() {
        return this.u;
    }

    public C4454ie2 getViewPortHandler() {
        return this.w;
    }

    public Hl2 getXAxis() {
        return this.m;
    }

    public float getXChartMax() {
        return this.m.x;
    }

    public float getXChartMin() {
        return this.m.y;
    }

    public float getXRange() {
        return this.m.z;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.e.a;
    }

    public float getYMin() {
        return this.e.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.I) {
            g(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.e == null) {
            if (TextUtils.isEmpty(this.r)) {
                return;
            }
            C3791fV0 center = getCenter();
            canvas.drawText(this.r, center.e, center.g, this.l);
            return;
        }
        if (this.C) {
            return;
        }
        a();
        this.C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) AbstractC8067zc2.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z = this.d;
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            C4454ie2 c4454ie2 = this.w;
            float f = i;
            float f2 = i2;
            RectF rectF = c4454ie2.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = c4454ie2.c - rectF.right;
            float fK = c4454ie2.k();
            c4454ie2.d = f2;
            c4454ie2.c = f;
            c4454ie2.b.set(f3, f4, f - f5, f2 - fK);
        } else if (z) {
            b0.e("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i + ", height: " + i2);
        }
        f();
        ArrayList<Runnable> arrayList = this.H;
        Iterator<Runnable> it = arrayList.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(T t) {
        this.e = t;
        this.C = false;
        if (t == null) {
            return;
        }
        float f = t.b;
        float f2 = t.a;
        float fD = AbstractC8067zc2.d(t.h() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        int iCeil = Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2;
        C6783tW c6783tW = this.j;
        c6783tW.b(iCeil);
        for (InterfaceC6653ss0 interfaceC6653ss0 : this.e.i) {
            if (interfaceC6653ss0.E() || interfaceC6653ss0.u() == c6783tW) {
                interfaceC6653ss0.v(c6783tW);
            }
        }
        f();
    }

    public void setDescription(CY cy) {
        this.o = cy;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.h = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.i = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.F = z;
    }

    public void setExtraBottomOffset(float f) {
        this.A = AbstractC8067zc2.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.B = AbstractC8067zc2.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.z = AbstractC8067zc2.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.y = AbstractC8067zc2.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.g = z;
    }

    public void setHighlighter(GA ga) {
        this.v = ga;
    }

    public void setLastHighlighted(C7482wo0[] c7482wo0Arr) {
        C7482wo0 c7482wo0;
        if (c7482wo0Arr == null || c7482wo0Arr.length <= 0 || (c7482wo0 = c7482wo0Arr[0]) == null) {
            this.q.g = null;
        } else {
            this.q.g = c7482wo0;
        }
    }

    public void setLogEnabled(boolean z) {
        this.d = z;
    }

    public void setMarker(InterfaceC6446rt0 interfaceC6446rt0) {
        this.G = interfaceC6446rt0;
    }

    @Deprecated
    public void setMarkerView(InterfaceC6446rt0 interfaceC6446rt0) {
        setMarker(interfaceC6446rt0);
    }

    public void setMaxHighlightDistance(float f) {
        this.E = AbstractC8067zc2.c(f);
    }

    public void setNoDataText(String str) {
        this.r = str;
    }

    public void setNoDataTextColor(int i) {
        this.l.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.l.setTypeface(typeface);
    }

    public void setOnChartGestureListener(R81 r81) {
        this.s = r81;
    }

    public void setOnTouchListener(PA pa) {
        this.q = pa;
    }

    public void setRenderer(AbstractC8032zS abstractC8032zS) {
        if (abstractC8032zS != null) {
            this.u = abstractC8032zS;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.n = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.I = z;
    }

    public void setOnChartValueSelectedListener(S81 s81) {
    }
}
