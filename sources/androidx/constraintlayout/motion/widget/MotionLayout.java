package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.AbstractC4198hR;
import defpackage.AbstractInterpolatorC5634o11;
import defpackage.C1588Nd1;
import defpackage.C1742Pc;
import defpackage.C2425Xl1;
import defpackage.C3079c50;
import defpackage.C3422dj;
import defpackage.C3898g00;
import defpackage.C4289hr;
import defpackage.C4694ja0;
import defpackage.C4791k11;
import defpackage.C5214m11;
import defpackage.C5424n11;
import defpackage.C5589nn0;
import defpackage.C6017pq;
import defpackage.C6187qf0;
import defpackage.C6473s11;
import defpackage.C6495s7;
import defpackage.C6641so0;
import defpackage.C6748tK0;
import defpackage.C7173vM;
import defpackage.D02;
import defpackage.Di2;
import defpackage.E02;
import defpackage.EK;
import defpackage.GQ1;
import defpackage.HO1;
import defpackage.InterfaceC3911g31;
import defpackage.InterfaceC6222qo0;
import defpackage.InterpolatorC5001l11;
import defpackage.KK;
import defpackage.PP1;
import defpackage.RunnableC4584j20;
import defpackage.TK;
import defpackage.UK;
import defpackage.We2;
import defpackage.ZT;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC3911g31 {
    public static boolean K0;
    public int A;
    public RunnableC4584j20 A0;
    public int B;
    public final Rect B0;
    public int C;
    public boolean C0;
    public int D;
    public i D0;
    public int E;
    public final e E0;
    public boolean F;
    public boolean F0;
    public final HashMap<View, C5214m11> G;
    public final RectF G0;
    public long H;
    public View H0;
    public float I;
    public Matrix I0;
    public float J;
    public final ArrayList<Integer> J0;
    public float K;
    public long L;
    public float M;
    public boolean N;
    public boolean O;
    public h P;
    public int Q;
    public d R;
    public boolean S;
    public final GQ1 T;
    public final c U;
    public C3898g00 V;
    public int W;
    public int a0;
    public boolean b0;
    public float c0;
    public float d0;
    public long e0;
    public float f0;
    public boolean g0;
    public ArrayList<C5424n11> h0;
    public ArrayList<C5424n11> i0;
    public CopyOnWriteArrayList<h> j0;
    public int k0;
    public long l0;
    public float m0;
    public int n0;
    public float o0;
    public boolean p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public androidx.constraintlayout.motion.widget.a w;
    public float w0;
    public AbstractInterpolatorC5634o11 x;
    public final C7173vM x0;
    public Interpolator y;
    public boolean y0;
    public float z;
    public g z0;

    public class a implements Runnable {
        public final /* synthetic */ ViewGroup d;

        public a(ViewGroup viewGroup) {
            this.d = viewGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.z0.a();
        }
    }

    public class c extends AbstractInterpolatorC5634o11 {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c;

        public c() {
        }

        @Override // defpackage.AbstractInterpolatorC5634o11
        public final float a() {
            return MotionLayout.this.z;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > 0.0f) {
                float f3 = this.c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                motionLayout.z = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.b;
            }
            float f4 = this.c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            motionLayout.z = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.b;
        }
    }

    public class d {
        public float[] a;
        public final int[] b;
        public final float[] c;
        public Path d;
        public final Paint e;
        public final Paint f;
        public final Paint g;
        public final Paint h;
        public final Paint i;
        public final float[] j;
        public int k;
        public final Rect l = new Rect();
        public final int m = 1;

        public d() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.c = new float[100];
            this.b = new int[50];
        }

        public final void a(Canvas canvas, int i, int i2, C5214m11 c5214m11) {
            Canvas canvas2;
            int width;
            int height;
            float f;
            int[] iArr = this.b;
            boolean z = false;
            int i3 = 4;
            if (i == 4) {
                int i4 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (i4 < this.k) {
                    int i5 = iArr[i4];
                    boolean z4 = z2;
                    if (i5 == 1) {
                        z4 = true;
                    }
                    if (i5 == 0) {
                        z3 = true;
                    }
                    i4++;
                    z2 = z4;
                    z3 = z3;
                }
                if (z2) {
                    float[] fArr = this.a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
                }
                if (z3) {
                    b(canvas);
                }
            }
            if (i == 2) {
                float[] fArr2 = this.a;
                canvas2 = canvas;
                canvas2.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.g);
            } else {
                canvas2 = canvas;
            }
            if (i == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.a, this.e);
            View view = c5214m11.b;
            if (view != null) {
                width = view.getWidth();
                height = c5214m11.b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i6 = 1;
            while (i6 < i2 - 1) {
                if (i != i3 || iArr[i6 - 1] != 0) {
                    int i7 = i6 * 2;
                    float[] fArr3 = this.c;
                    float f2 = fArr3[i7];
                    float f3 = fArr3[i7 + 1];
                    this.d.reset();
                    this.d.moveTo(f2, f3 + 10.0f);
                    this.d.lineTo(f2 + 10.0f, f3);
                    this.d.lineTo(f2, f3 - 10.0f);
                    this.d.lineTo(f2 - 10.0f, f3);
                    this.d.close();
                    int i8 = i6 - 1;
                    c5214m11.u.get(i8);
                    Paint paint = this.i;
                    if (i == i3) {
                        int i9 = iArr[i8];
                        if (i9 == 1) {
                            d(canvas2, f2 - 0.0f, f3 - 0.0f);
                        } else if (i9 == 0) {
                            c(canvas2, f2 - 0.0f, f3 - 0.0f);
                        } else {
                            if (i9 == 2) {
                                f = f3;
                                e(canvas2, f2 - 0.0f, f - 0.0f, width, height);
                            }
                            canvas2.drawPath(this.d, paint);
                        }
                        f = f3;
                        canvas2.drawPath(this.d, paint);
                    } else {
                        f = f3;
                    }
                    if (i == 2) {
                        d(canvas2, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        c(canvas2, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        e(canvas2, f2 - 0.0f, f - 0.0f, width, height);
                    }
                    canvas2.drawPath(this.d, paint);
                }
                i6++;
                z = z;
                i3 = 4;
            }
            boolean z5 = z;
            float[] fArr4 = this.a;
            if (fArr4.length > 1) {
                float f4 = fArr4[z5 ? 1 : 0];
                float f5 = fArr4[1];
                Paint paint2 = this.f;
                canvas2.drawCircle(f4, f5, 8.0f, paint2);
                float[] fArr5 = this.a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float fMin = Math.min(f, f3);
            float fMax = Math.max(f2, f4);
            float fMax2 = Math.max(f, f3);
            float fMax3 = Math.max(f2, f4);
            Paint paint = this.g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
        }

        public final void c(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            Paint paint = this.h;
            paint.getTextBounds(str, 0, str.length(), this.l);
            Rect rect = this.l;
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
            float fMin3 = Math.min(f3, f5);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, fMin3, f2, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), this.l);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
        }

        public final void d(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
            float f10 = (f7 * f9) + f3;
            float f11 = (f9 * f8) + f4;
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            Paint paint = this.h;
            paint.getTextBounds(str, 0, str.length(), this.l);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.l.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        public final void e(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i))) + 0.5d)) / 100.0f);
            String string = sb.toString();
            Paint paint = this.h;
            paint.getTextBounds(string, 0, string.length(), this.l);
            Rect rect = this.l;
            canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, fMin, f2, paint2);
            String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), this.l);
            canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class e {
        public UK a = new UK();
        public UK b = new UK();
        public androidx.constraintlayout.widget.c c = null;
        public androidx.constraintlayout.widget.c d = null;
        public int e;
        public int f;

        public e() {
        }

        public static void c(UK uk, UK uk2) {
            TK c6641so0;
            ArrayList<TK> arrayList = uk.u0;
            HashMap<TK, TK> map = new HashMap<>();
            map.put(uk, uk2);
            uk2.u0.clear();
            uk2.j(uk, map);
            for (TK tk : arrayList) {
                if (tk instanceof C6017pq) {
                    c6641so0 = new C6017pq();
                } else if (tk instanceof C5589nn0) {
                    c6641so0 = new C5589nn0();
                } else if (tk instanceof C6187qf0) {
                    c6641so0 = new C6187qf0();
                } else if (tk instanceof C1588Nd1) {
                    c6641so0 = new C1588Nd1();
                } else {
                    c6641so0 = tk instanceof InterfaceC6222qo0 ? new C6641so0() : new TK();
                }
                uk2.u0.add(c6641so0);
                TK tk2 = c6641so0.V;
                if (tk2 != null) {
                    ((Di2) tk2).u0.remove(c6641so0);
                    c6641so0.G();
                }
                c6641so0.V = uk2;
                map.put(tk, c6641so0);
            }
            for (TK tk3 : arrayList) {
                map.get(tk3).j(tk3, map);
            }
        }

        public static TK d(UK uk, View view) {
            if (uk.h0 == view) {
                return uk;
            }
            ArrayList<TK> arrayList = uk.u0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TK tk = arrayList.get(i);
                if (tk.h0 == view) {
                    return tk;
                }
            }
            return null;
        }

        public final void a() {
            int i;
            SparseArray sparseArray;
            int[] iArr;
            int i2;
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            motionLayout.G.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                C5214m11 c5214m11 = new C5214m11(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, c5214m11);
                motionLayout.G.put(childAt, c5214m11);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = motionLayout.getChildAt(i4);
                C5214m11 c5214m12 = motionLayout.G.get(childAt2);
                if (c5214m12 == null) {
                    i = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                } else {
                    if (this.c != null) {
                        TK tkD = d(this.a, childAt2);
                        if (tkD != null) {
                            Rect rectQ = MotionLayout.q(motionLayout, tkD);
                            androidx.constraintlayout.widget.c cVar = this.c;
                            int width = motionLayout.getWidth();
                            int height = motionLayout.getHeight();
                            iArr = iArr2;
                            int i5 = cVar.c;
                            i2 = i4;
                            if (i5 != 0) {
                                C5214m11.f(rectQ, c5214m12.a, i5, width, height);
                            }
                            C6473s11 c6473s11 = c5214m12.f;
                            c6473s11.g = 0.0f;
                            c6473s11.h = 0.0f;
                            c5214m12.e(c6473s11);
                            sparseArray = sparseArray2;
                            i = childCount;
                            c6473s11.i(rectQ.left, rectQ.top, rectQ.width(), rectQ.height());
                            androidx.constraintlayout.widget.c.a aVarH = cVar.h(c5214m12.c);
                            c6473s11.b(aVarH);
                            androidx.constraintlayout.widget.c.C0228c c0228c = aVarH.d;
                            c5214m12.l = c0228c.g;
                            c5214m12.h.f(rectQ, cVar, i5, c5214m12.c);
                            c5214m12.C = aVarH.f.i;
                            c5214m12.E = c0228c.j;
                            c5214m12.F = c0228c.i;
                            Context context = c5214m12.b.getContext();
                            int i6 = c0228c.l;
                            String str = c0228c.k;
                            int i7 = c0228c.m;
                            if (i6 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                            } else if (i6 == -1) {
                                interpolatorLoadInterpolator = new InterpolatorC5001l11(C3079c50.c(str));
                            } else if (i6 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i6 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i6 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i6 != 4) {
                                interpolatorLoadInterpolator = i6 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            c5214m12.G = interpolatorLoadInterpolator;
                        } else {
                            i = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i2 = i4;
                            if (motionLayout.Q != 0) {
                                b0.c("MotionLayout", ZT.b() + "no widget for  " + ZT.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                    }
                    if (this.d != null) {
                        TK tkD2 = d(this.b, childAt2);
                        if (tkD2 != null) {
                            Rect rectQ2 = MotionLayout.q(motionLayout, tkD2);
                            androidx.constraintlayout.widget.c cVar2 = this.d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i8 = cVar2.c;
                            if (i8 != 0) {
                                C5214m11.f(rectQ2, c5214m12.a, i8, width2, height2);
                                rectQ2 = c5214m12.a;
                            }
                            C6473s11 c6473s12 = c5214m12.g;
                            c6473s12.g = 1.0f;
                            c6473s12.h = 1.0f;
                            c5214m12.e(c6473s12);
                            c6473s12.i(rectQ2.left, rectQ2.top, rectQ2.width(), rectQ2.height());
                            c6473s12.b(cVar2.h(c5214m12.c));
                            c5214m12.i.f(rectQ2, cVar2, i8, c5214m12.c);
                        } else if (motionLayout.Q != 0) {
                            b0.c("MotionLayout", ZT.b() + "no widget for  " + ZT.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i4 = i2 + 1;
                iArr2 = iArr;
                sparseArray2 = sparseArray;
                childCount = i;
            }
            int[] iArr3 = iArr2;
            int i9 = childCount;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray3 = sparseArray2;
                if (i10 >= i9) {
                    return;
                }
                sparseArray2 = sparseArray3;
                C5214m11 c5214m13 = (C5214m11) sparseArray2.get(iArr3[i10]);
                int i11 = c5214m13.f.o;
                if (i11 != -1) {
                    C5214m11 c5214m14 = (C5214m11) sparseArray2.get(i11);
                    c5214m13.f.l(c5214m14, c5214m14.f);
                    c5214m13.g.l(c5214m14, c5214m14.g);
                }
                i10++;
            }
        }

        public final void b(int i, int i2) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.B == motionLayout.getStartState()) {
                UK uk = this.b;
                androidx.constraintlayout.widget.c cVar = this.d;
                motionLayout.i(uk, optimizationLevel, (cVar == null || cVar.c == 0) ? i : i2, (cVar == null || cVar.c == 0) ? i2 : i);
                androidx.constraintlayout.widget.c cVar2 = this.c;
                if (cVar2 != null) {
                    UK uk2 = this.a;
                    int i3 = cVar2.c;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout.i(uk2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.c cVar3 = this.c;
            if (cVar3 != null) {
                UK uk3 = this.a;
                int i5 = cVar3.c;
                motionLayout.i(uk3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            UK uk4 = this.b;
            androidx.constraintlayout.widget.c cVar4 = this.d;
            int i6 = (cVar4 == null || cVar4.c == 0) ? i : i2;
            if (cVar4 == null || cVar4.c == 0) {
                i = i2;
            }
            motionLayout.i(uk4, optimizationLevel, i6, i);
        }

        public final void e(androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.c = cVar;
            this.d = cVar2;
            this.a = new UK();
            UK uk = new UK();
            this.b = uk;
            UK uk2 = this.a;
            boolean z = MotionLayout.K0;
            MotionLayout motionLayout = MotionLayout.this;
            UK uk3 = motionLayout.g;
            C4289hr.b bVar = uk3.y0;
            uk2.y0 = bVar;
            uk2.w0.f = bVar;
            C4289hr.b bVar2 = uk3.y0;
            uk.y0 = bVar2;
            uk.w0.f = bVar2;
            uk2.u0.clear();
            this.b.u0.clear();
            c(motionLayout.g, this.a);
            c(motionLayout.g, this.b);
            if (motionLayout.K > 0.5d) {
                if (cVar != null) {
                    g(this.a, cVar);
                }
                g(this.b, cVar2);
            } else {
                g(this.b, cVar2);
                if (cVar != null) {
                    g(this.a, cVar);
                }
            }
            this.a.z0 = motionLayout.f();
            UK uk4 = this.a;
            uk4.v0.c(uk4);
            this.b.z0 = motionLayout.f();
            UK uk5 = this.b;
            uk5.v0.c(uk5);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                TK.a aVar = TK.a.e;
                if (i == -2) {
                    this.a.Q(aVar);
                    this.b.Q(aVar);
                }
                if (layoutParams.height == -2) {
                    this.a.R(aVar);
                    this.b.R(aVar);
                }
            }
        }

        public final void f() {
            HashMap<View, C5214m11> map;
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.D;
            int i2 = motionLayout.E;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            motionLayout.u0 = mode;
            motionLayout.v0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i, i2);
            int i3 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                motionLayout.q0 = this.a.u();
                motionLayout.r0 = this.a.o();
                motionLayout.s0 = this.b.u();
                int iO = this.b.o();
                motionLayout.t0 = iO;
                motionLayout.p0 = (motionLayout.q0 == motionLayout.s0 && motionLayout.r0 == iO) ? false : true;
            }
            int i4 = motionLayout.q0;
            int i5 = motionLayout.r0;
            int i6 = motionLayout.u0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout.w0 * (motionLayout.s0 - i4)) + i4);
            }
            int i7 = motionLayout.v0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout.w0 * (motionLayout.t0 - i5)) + i5);
            }
            UK uk = this.a;
            motionLayout.h(i, i2, i4, i5, uk.I0 || this.b.I0, uk.J0 || this.b.J0);
            int childCount = motionLayout.getChildCount();
            motionLayout.E0.a();
            motionLayout.O = true;
            SparseArray sparseArray = new SparseArray();
            int i8 = 0;
            while (true) {
                map = motionLayout.G;
                if (i8 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i8);
                sparseArray.put(childAt.getId(), map.get(childAt));
                i8++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            androidx.constraintlayout.motion.widget.a.b bVar = motionLayout.w.c;
            int i9 = bVar != null ? bVar.p : -1;
            if (i9 != -1) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    C5214m11 c5214m11 = map.get(motionLayout.getChildAt(i10));
                    if (c5214m11 != null) {
                        c5214m11.B = i9;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                C5214m11 c5214m12 = map.get(motionLayout.getChildAt(i12));
                int i13 = c5214m12.f.o;
                if (i13 != -1) {
                    sparseBooleanArray.put(i13, true);
                    iArr[i11] = c5214m12.f.o;
                    i11++;
                }
            }
            for (int i14 = 0; i14 < i11; i14++) {
                C5214m11 c5214m13 = map.get(motionLayout.findViewById(iArr[i14]));
                if (c5214m13 != null) {
                    motionLayout.w.e(c5214m13);
                    c5214m13.g(width, height, motionLayout.getNanoTime());
                }
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = motionLayout.getChildAt(i15);
                C5214m11 c5214m14 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && c5214m14 != null) {
                    motionLayout.w.e(c5214m14);
                    c5214m14.g(width, height, motionLayout.getNanoTime());
                }
            }
            androidx.constraintlayout.motion.widget.a.b bVar2 = motionLayout.w.c;
            float f = bVar2 != null ? bVar2.i : 0.0f;
            if (f != 0.0f) {
                boolean z = ((double) f) < 0.0d;
                float fAbs = Math.abs(f);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i16 = 0; i16 < childCount; i16++) {
                    C5214m11 c5214m15 = map.get(motionLayout.getChildAt(i16));
                    if (!Float.isNaN(c5214m15.l)) {
                        for (int i17 = 0; i17 < childCount; i17++) {
                            C5214m11 c5214m16 = map.get(motionLayout.getChildAt(i17));
                            if (!Float.isNaN(c5214m16.l)) {
                                fMin = Math.min(fMin, c5214m16.l);
                                fMax = Math.max(fMax, c5214m16.l);
                            }
                        }
                        while (i3 < childCount) {
                            C5214m11 c5214m17 = map.get(motionLayout.getChildAt(i3));
                            if (!Float.isNaN(c5214m17.l)) {
                                c5214m17.n = 1.0f / (1.0f - fAbs);
                                if (z) {
                                    c5214m17.m = fAbs - (((fMax - c5214m17.l) / (fMax - fMin)) * fAbs);
                                } else {
                                    c5214m17.m = fAbs - (((c5214m17.l - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i3++;
                        }
                        return;
                    }
                    C6473s11 c6473s11 = c5214m15.g;
                    float f2 = c6473s11.i;
                    float f3 = c6473s11.j;
                    float f4 = z ? f3 - f2 : f3 + f2;
                    fMin2 = Math.min(fMin2, f4);
                    fMax2 = Math.max(fMax2, f4);
                }
                while (i3 < childCount) {
                    C5214m11 c5214m18 = map.get(motionLayout.getChildAt(i3));
                    C6473s11 c6473s12 = c5214m18.g;
                    float f5 = c6473s12.i;
                    float f6 = c6473s12.j;
                    float f7 = z ? f6 - f5 : f6 + f5;
                    c5214m18.n = 1.0f / (1.0f - fAbs);
                    c5214m18.m = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i3++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(UK uk, androidx.constraintlayout.widget.c cVar) {
            androidx.constraintlayout.widget.c.a aVar;
            androidx.constraintlayout.widget.c.a aVar2;
            SparseArray<TK> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.d.a aVar3 = new androidx.constraintlayout.widget.d.a();
            sparseArray.clear();
            sparseArray.put(0, uk);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), uk);
            if (cVar != null && cVar.c != 0) {
                UK uk2 = this.b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z = MotionLayout.K0;
                motionLayout.i(uk2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            for (TK tk : uk.u0) {
                tk.j0 = true;
                sparseArray.put(tk.h0.getId(), tk);
            }
            for (TK tk2 : uk.u0) {
                View view = tk2.h0;
                int id = view.getId();
                HashMap<Integer, androidx.constraintlayout.widget.c.a> map = cVar.f;
                if (map.containsKey(Integer.valueOf(id)) && (aVar2 = map.get(Integer.valueOf(id))) != null) {
                    aVar2.a(aVar3);
                }
                tk2.S(cVar.h(view.getId()).e.c);
                tk2.P(cVar.h(view.getId()).e.d);
                if (view instanceof androidx.constraintlayout.widget.b) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
                    int id2 = bVar.getId();
                    HashMap<Integer, androidx.constraintlayout.widget.c.a> map2 = cVar.f;
                    if (map2.containsKey(Integer.valueOf(id2)) && (aVar = map2.get(Integer.valueOf(id2))) != null && (tk2 instanceof C6641so0)) {
                        bVar.k(aVar, (C6641so0) tk2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).n();
                    }
                }
                aVar3.resolveLayoutDirection(motionLayout.getLayoutDirection());
                boolean z2 = MotionLayout.K0;
                motionLayout.b(false, view, tk2, aVar3, sparseArray);
                if (cVar.h(view.getId()).c.c == 1) {
                    tk2.i0 = view.getVisibility();
                } else {
                    tk2.i0 = cVar.h(view.getId()).c.b;
                }
            }
            for (TK tk3 : uk.u0) {
                if (tk3 instanceof We2) {
                    androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) tk3.h0;
                    InterfaceC6222qo0 interfaceC6222qo0 = (InterfaceC6222qo0) tk3;
                    bVar2.getClass();
                    interfaceC6222qo0.b();
                    for (int i = 0; i < bVar2.e; i++) {
                        interfaceC6222qo0.a(sparseArray.get(bVar2.d[i]));
                    }
                    We2 we2 = (We2) interfaceC6222qo0;
                    for (int i2 = 0; i2 < we2.v0; i2++) {
                        TK tk4 = we2.u0[i2];
                        if (tk4 != null) {
                            tk4.G = true;
                        }
                    }
                }
            }
        }
    }

    public static class f {
        public static final f b = new f();
        public VelocityTracker a;
    }

    public class g {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public g() {
        }

        public final void a() {
            int i = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    motionLayout.H(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        motionLayout.C(i);
                    } else {
                        motionLayout.D(i, i2);
                    }
                }
                motionLayout.setState(i.e);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                motionLayout.setProgress(this.a);
            } else {
                motionLayout.B(this.a, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            }
        }
    }

    public interface h {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class i {
        public static final i d;
        public static final i e;
        public static final i g;
        public static final i h;
        public static final /* synthetic */ i[] i;

        static {
            i iVar = new i("UNDEFINED", 0);
            d = iVar;
            i iVar2 = new i("SETUP", 1);
            e = iVar2;
            i iVar3 = new i("MOVING", 2);
            g = iVar3;
            i iVar4 = new i("FINISHED", 3);
            h = iVar4;
            i = new i[]{iVar, iVar2, iVar3, iVar4};
        }

        public i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) i.clone();
        }
    }

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        super(context, attributeSet);
        this.y = null;
        this.z = 0.0f;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = 0;
        this.F = true;
        this.G = new HashMap<>();
        this.H = 0L;
        this.I = 1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.M = 0.0f;
        this.O = false;
        this.Q = 0;
        this.S = false;
        this.T = new GQ1();
        this.U = new c();
        this.b0 = false;
        this.g0 = false;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = 0;
        this.l0 = -1L;
        this.m0 = 0.0f;
        this.n0 = 0;
        this.o0 = 0.0f;
        this.p0 = false;
        this.x0 = new C7173vM();
        this.y0 = false;
        this.A0 = null;
        new HashMap();
        this.B0 = new Rect();
        this.C0 = false;
        this.D0 = i.d;
        this.E0 = new e();
        this.F0 = false;
        this.G0 = new RectF();
        this.H0 = null;
        this.I0 = null;
        this.J0 = new ArrayList<>();
        K0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2425Xl1.n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.w = new androidx.constraintlayout.motion.widget.a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.B = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.M = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.O = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.Q == 0) {
                        this.Q = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.Q = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.w == null) {
                b0.c("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.w = null;
            }
        }
        if (this.Q != 0) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.w;
            if (aVar2 == null) {
                b0.c("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iG = aVar2.g();
                androidx.constraintlayout.motion.widget.a aVar3 = this.w;
                androidx.constraintlayout.widget.c cVarB = aVar3.b(aVar3.g());
                String strC = ZT.c(getContext(), iG);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbB = C6495s7.b("CHECK: ", strC, " ALL VIEWS SHOULD HAVE ID's ");
                        sbB.append(childAt.getClass().getName());
                        sbB.append(" does not!");
                        b0.e("MotionLayout", sbB.toString());
                    }
                    if (cVarB.i(id) == null) {
                        StringBuilder sbB2 = C6495s7.b("CHECK: ", strC, " NO CONSTRAINTS for ");
                        sbB2.append(ZT.d(childAt));
                        b0.e("MotionLayout", sbB2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) cVarB.f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = numArr[i4].intValue();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr[i5];
                    String strC2 = ZT.c(getContext(), i6);
                    if (findViewById(iArr[i5]) == null) {
                        b0.e("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
                    }
                    if (cVarB.h(i6).e.d == -1) {
                        b0.e("MotionLayout", C4694ja0.a("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                    if (cVarB.h(i6).e.c == -1) {
                        b0.e("MotionLayout", C4694ja0.a("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (androidx.constraintlayout.motion.widget.a.b bVar : this.w.d) {
                    androidx.constraintlayout.motion.widget.a.b bVar2 = this.w.c;
                    if (bVar.d == bVar.c) {
                        b0.c("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i7 = bVar.d;
                    int i8 = bVar.c;
                    String strC3 = ZT.c(getContext(), i7);
                    String strC4 = ZT.c(getContext(), i8);
                    if (sparseIntArray.get(i7) == i8) {
                        b0.c("MotionLayout", "CHECK: two transitions with the same start and end " + strC3 + "->" + strC4);
                    }
                    if (sparseIntArray2.get(i8) == i7) {
                        b0.c("MotionLayout", "CHECK: you can't have reverse transitions" + strC3 + "->" + strC4);
                    }
                    sparseIntArray.put(i7, i8);
                    sparseIntArray2.put(i8, i7);
                    if (this.w.b(i7) == null) {
                        b0.c("MotionLayout", " no such constraintSetStart " + strC3);
                    }
                    if (this.w.b(i8) == null) {
                        b0.c("MotionLayout", " no such constraintSetEnd " + strC3);
                    }
                }
            }
        }
        if (this.B != -1 || (aVar = this.w) == null) {
            return;
        }
        this.B = aVar.g();
        this.A = this.w.g();
        androidx.constraintlayout.motion.widget.a.b bVar3 = this.w.c;
        this.C = bVar3 != null ? bVar3.c : -1;
    }

    public static Rect q(MotionLayout motionLayout, TK tk) {
        int iW = tk.w();
        Rect rect = motionLayout.B0;
        rect.top = iW;
        rect.left = tk.v();
        rect.right = tk.u() + rect.left;
        rect.bottom = tk.o() + rect.top;
        return rect;
    }

    public final void A() {
        this.E0.f();
        invalidate();
    }

    public final void B(float f2, float f3) {
        if (!super.isAttachedToWindow()) {
            if (this.z0 == null) {
                this.z0 = new g();
            }
            g gVar = this.z0;
            gVar.a = f2;
            gVar.b = f3;
            return;
        }
        setProgress(f2);
        setState(i.g);
        this.z = f3;
        if (f3 != 0.0f) {
            r(f3 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f2 == 0.0f || f2 == 1.0f) {
                return;
            }
            r(f2 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public final void C(int i2) {
        setState(i.e);
        this.B = i2;
        this.A = -1;
        this.C = -1;
        KK kk = this.o;
        if (kk == null) {
            androidx.constraintlayout.motion.widget.a aVar = this.w;
            if (aVar != null) {
                aVar.b(i2).b(this);
                return;
            }
            return;
        }
        float f2 = -1;
        int i3 = kk.b;
        SparseArray<KK.a> sparseArray = kk.d;
        int i4 = 0;
        ConstraintLayout constraintLayout = kk.a;
        if (i3 != i2) {
            kk.b = i2;
            KK.a aVar2 = sparseArray.get(i2);
            while (true) {
                ArrayList<KK.b> arrayList = aVar2.b;
                if (i4 >= arrayList.size()) {
                    i4 = -1;
                    break;
                } else if (arrayList.get(i4).a(f2, f2)) {
                    break;
                } else {
                    i4++;
                }
            }
            ArrayList<KK.b> arrayList2 = aVar2.b;
            androidx.constraintlayout.widget.c cVar = i4 == -1 ? aVar2.d : arrayList2.get(i4).f;
            if (i4 != -1) {
                int i5 = arrayList2.get(i4).e;
            }
            if (cVar == null) {
                return;
            }
            kk.c = i4;
            cVar.b(constraintLayout);
            return;
        }
        KK.a aVarValueAt = i2 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i3);
        int i6 = kk.c;
        if (i6 == -1 || !aVarValueAt.b.get(i6).a(f2, f2)) {
            while (true) {
                ArrayList<KK.b> arrayList3 = aVarValueAt.b;
                if (i4 >= arrayList3.size()) {
                    i4 = -1;
                    break;
                } else if (arrayList3.get(i4).a(f2, f2)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (kk.c == i4) {
                return;
            }
            ArrayList<KK.b> arrayList4 = aVarValueAt.b;
            androidx.constraintlayout.widget.c cVar2 = i4 == -1 ? null : arrayList4.get(i4).f;
            if (i4 != -1) {
                int i7 = arrayList4.get(i4).e;
            }
            if (cVar2 == null) {
                return;
            }
            kk.c = i4;
            cVar2.b(constraintLayout);
        }
    }

    public final void D(int i2, int i3) {
        if (!super.isAttachedToWindow()) {
            if (this.z0 == null) {
                this.z0 = new g();
            }
            g gVar = this.z0;
            gVar.c = i2;
            gVar.d = i3;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null) {
            this.A = i2;
            this.C = i3;
            aVar.n(i2, i3);
            this.E0.e(this.w.b(i2), this.w.b(i3));
            A();
            this.K = 0.0f;
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public final void E(float f2, float f3, int i2) {
        float f4;
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        androidx.constraintlayout.motion.widget.b bVar6;
        androidx.constraintlayout.motion.widget.b bVar7;
        androidx.constraintlayout.motion.widget.a.b bVar8;
        float f5;
        androidx.constraintlayout.motion.widget.b bVar9;
        float f6 = f2;
        if (this.w == null || this.K == f6) {
            return;
        }
        this.S = true;
        this.H = getNanoTime();
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        androidx.constraintlayout.motion.widget.a.b bVar10 = aVar.c;
        float f7 = (bVar10 != null ? bVar10.h : aVar.j) / 1000.0f;
        this.I = f7;
        this.M = f6;
        this.O = true;
        GQ1 gq1 = this.T;
        float f8 = 0.0f;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            c cVar = this.U;
            f4 = 1.0f;
            if (i2 == 4) {
                float f9 = this.K;
                float f10 = aVar.f();
                cVar.a = f3;
                cVar.b = f9;
                cVar.c = f10;
                this.x = cVar;
            } else if (i2 == 5) {
                float f11 = this.K;
                float f12 = aVar.f();
                if (f3 > 0.0f) {
                    float f13 = f3 / f12;
                    if (((f3 * f13) - (((f12 * f13) * f13) / 2.0f)) + f11 > 1.0f) {
                        float f14 = this.K;
                        float f15 = this.w.f();
                        cVar.a = f3;
                        cVar.b = f14;
                        cVar.c = f15;
                        this.x = cVar;
                    } else {
                        float f16 = this.K;
                        float f17 = this.I;
                        float f18 = this.w.f();
                        bVar8 = this.w.c;
                        if (bVar8 != null || (bVar9 = bVar8.l) == null) {
                            f5 = 0.0f;
                        } else {
                            f5 = bVar9.s;
                        }
                        this.T.b(f16, f6, f3, f17, f18, f5);
                        this.z = 0.0f;
                        int i3 = this.B;
                        this.M = f6;
                        this.B = i3;
                        this.x = gq1;
                    }
                } else {
                    float f19 = (-f3) / f12;
                    if ((((f12 * f19) * f19) / 2.0f) + (f3 * f19) + f11 < 0.0f) {
                        float f110 = this.K;
                        float f111 = this.w.f();
                        cVar.a = f3;
                        cVar.b = f110;
                        cVar.c = f111;
                        this.x = cVar;
                    } else {
                        float f112 = this.K;
                        float f113 = this.I;
                        float f114 = this.w.f();
                        bVar8 = this.w.c;
                        if (bVar8 != null) {
                            f5 = 0.0f;
                        } else {
                            f5 = 0.0f;
                        }
                        this.T.b(f112, f6, f3, f113, f114, f5);
                        this.z = 0.0f;
                        int i4 = this.B;
                        this.M = f6;
                        this.B = i4;
                        this.x = gq1;
                    }
                }
            } else if (i2 == 6 || i2 == 7) {
            }
            this.N = false;
            this.H = getNanoTime();
            invalidate();
        }
        f4 = 1.0f;
        if (i2 == 1 || i2 == 7) {
            f6 = 0.0f;
        } else if (i2 == 2 || i2 == 6) {
            f6 = f4;
        }
        if (((bVar10 == null || (bVar7 = bVar10.l) == null) ? 0 : bVar7.D) == 0) {
            float f20 = this.K;
            float f21 = aVar.f();
            androidx.constraintlayout.motion.widget.a.b bVar11 = this.w.c;
            if (bVar11 != null && (bVar6 = bVar11.l) != null) {
                f8 = bVar6.s;
            }
            this.T.b(f20, f6, f3, f7, f21, f8);
        } else {
            float f22 = this.K;
            float f23 = (bVar10 == null || (bVar5 = bVar10.l) == null) ? 0.0f : bVar5.z;
            float f24 = (bVar10 == null || (bVar4 = bVar10.l) == null) ? 0.0f : bVar4.A;
            float f25 = (bVar10 == null || (bVar3 = bVar10.l) == null) ? 0.0f : bVar3.y;
            float f26 = (bVar10 == null || (bVar2 = bVar10.l) == null) ? 0.0f : bVar2.B;
            int i5 = (bVar10 == null || (bVar = bVar10.l) == null) ? 0 : bVar.C;
            if (gq1.b == null) {
                HO1 ho1 = new HO1();
                ho1.a = 0.5d;
                ho1.i = 0;
                gq1.b = ho1;
            }
            HO1 ho2 = gq1.b;
            gq1.c = ho2;
            ho2.c = f6;
            ho2.a = f25;
            ho2.e = f22;
            ho2.b = f24;
            ho2.g = f23;
            ho2.h = f26;
            ho2.i = i5;
            ho2.d = 0.0f;
        }
        int i6 = this.B;
        this.M = f6;
        this.B = i6;
        this.x = gq1;
        this.N = false;
        this.H = getNanoTime();
        invalidate();
    }

    public final void F() {
        r(1.0f);
        this.A0 = null;
    }

    public final void G() {
        r(0.0f);
    }

    public final void H(int i2) {
        PP1 pp1;
        if (!super.isAttachedToWindow()) {
            if (this.z0 == null) {
                this.z0 = new g();
            }
            this.z0.d = i2;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null && (pp1 = aVar.b) != null) {
            int i3 = this.B;
            float f2 = -1;
            PP1.a aVar2 = pp1.b.get(i2);
            if (aVar2 != null) {
                ArrayList<PP1.b> arrayList = aVar2.b;
                int i4 = aVar2.c;
                if (f2 != -1.0f && f2 != -1.0f) {
                    Iterator<PP1.b> it = arrayList.iterator();
                    PP1.b bVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (bVar != null) {
                                i3 = bVar.e;
                                break;
                            } else {
                                i3 = i4;
                                break;
                            }
                        }
                        PP1.b next = it.next();
                        if (next.a(f2, f2)) {
                            if (i3 == next.e) {
                                break;
                            } else {
                                bVar = next;
                            }
                        }
                    }
                } else if (i4 != i3) {
                    Iterator<PP1.b> it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i3 = i4;
                            break;
                        }
                    } while (i3 != it2.next().e);
                }
            } else {
                i3 = i2;
            }
            if (i3 != -1) {
                i2 = i3;
            }
        }
        int i5 = this.B;
        if (i5 == i2) {
            return;
        }
        if (this.A == i2) {
            r(0.0f);
            return;
        }
        if (this.C == i2) {
            r(1.0f);
            return;
        }
        this.C = i2;
        if (i5 != -1) {
            D(i5, i2);
            r(1.0f);
            this.K = 0.0f;
            F();
            return;
        }
        this.S = false;
        this.M = 1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = getNanoTime();
        this.H = getNanoTime();
        this.N = false;
        this.x = null;
        androidx.constraintlayout.motion.widget.a aVar3 = this.w;
        androidx.constraintlayout.motion.widget.a.b bVar2 = aVar3.c;
        this.I = (bVar2 != null ? bVar2.h : aVar3.j) / 1000.0f;
        this.A = -1;
        aVar3.n(-1, this.C);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, C5214m11> map = this.G;
        map.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            map.put(childAt, new C5214m11(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.O = true;
        androidx.constraintlayout.widget.c cVarB = this.w.b(i2);
        e eVar = this.E0;
        eVar.e(null, cVarB);
        A();
        eVar.a();
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            C5214m11 c5214m11 = map.get(childAt2);
            if (c5214m11 != null) {
                C6473s11 c6473s11 = c5214m11.f;
                c6473s11.g = 0.0f;
                c6473s11.h = 0.0f;
                c6473s11.i(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                C4791k11 c4791k11 = c5214m11.h;
                c4791k11.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                c4791k11.g = childAt2.getVisibility();
                c4791k11.d = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                c4791k11.h = childAt2.getElevation();
                c4791k11.i = childAt2.getRotation();
                c4791k11.j = childAt2.getRotationX();
                c4791k11.k = childAt2.getRotationY();
                c4791k11.l = childAt2.getScaleX();
                c4791k11.m = childAt2.getScaleY();
                c4791k11.n = childAt2.getPivotX();
                c4791k11.o = childAt2.getPivotY();
                c4791k11.p = childAt2.getTranslationX();
                c4791k11.q = childAt2.getTranslationY();
                c4791k11.r = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i8 = 0; i8 < childCount; i8++) {
            C5214m11 c5214m12 = map.get(getChildAt(i8));
            if (c5214m12 != null) {
                this.w.e(c5214m12);
                c5214m12.g(width, height, getNanoTime());
            }
        }
        androidx.constraintlayout.motion.widget.a.b bVar3 = this.w.c;
        float f3 = bVar3 != null ? bVar3.i : 0.0f;
        if (f3 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i9 = 0; i9 < childCount; i9++) {
                C6473s11 c6473s12 = map.get(getChildAt(i9)).g;
                float f4 = c6473s12.j + c6473s12.i;
                fMin = Math.min(fMin, f4);
                fMax = Math.max(fMax, f4);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                C5214m11 c5214m13 = map.get(getChildAt(i10));
                C6473s11 c6473s13 = c5214m13.g;
                float f5 = c6473s13.i;
                float f6 = c6473s13.j;
                c5214m13.n = 1.0f / (1.0f - f3);
                c5214m13.m = f3 - ((((f5 + f6) - fMin) * f3) / (fMax - fMin));
            }
        }
        this.J = 0.0f;
        this.K = 0.0f;
        this.O = true;
        invalidate();
    }

    public final void I(int i2, androidx.constraintlayout.widget.c cVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null) {
            aVar.g.put(i2, cVar);
        }
        this.E0.e(this.w.b(this.A), this.w.b(this.C));
        A();
        if (this.B == i2) {
            cVar.b(this);
        }
    }

    public final void J(int i2, View... viewArr) {
        String str;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null) {
            b0.c("MotionLayout", " no motionScene");
            return;
        }
        androidx.constraintlayout.motion.widget.d dVar = aVar.q;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.constraintlayout.motion.widget.c> it = dVar.b.iterator();
        androidx.constraintlayout.motion.widget.c cVar = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            str = dVar.d;
            if (!zHasNext) {
                break;
            }
            androidx.constraintlayout.motion.widget.c next = it.next();
            if (next.a == i2) {
                for (View view : viewArr) {
                    if (next.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    cVar = next;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = dVar.a;
                    int currentState = motionLayout.getCurrentState();
                    if (next.e != 2) {
                        if (currentState == -1) {
                            b0.e(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                        } else {
                            androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.w;
                            androidx.constraintlayout.widget.c cVarB = aVar2 == null ? null : aVar2.b(currentState);
                            if (cVarB != null) {
                                cVar = next;
                                cVar.a(dVar, dVar.a, currentState, cVarB, viewArr2);
                            }
                        }
                        cVar = next;
                    } else {
                        cVar = next;
                        cVar.a(dVar, dVar.a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (cVar == null) {
            b0.c(str, " Could not find ViewTransition");
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v35 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v50 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v7 ??, new type: s11
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r35v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r35v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r35v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v36 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v26 ??, new type: s11
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r38) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void g(int i2) {
        this.o = null;
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = aVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.B;
    }

    public ArrayList<androidx.constraintlayout.motion.widget.a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null) {
            return null;
        }
        return aVar.d;
    }

    public C3898g00 getDesignTool() {
        if (this.V == null) {
            this.V = new C3898g00();
        }
        return this.V;
    }

    public int getEndState() {
        return this.C;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.K;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.w;
    }

    public int getStartState() {
        return this.A;
    }

    public float getTargetPosition() {
        return this.M;
    }

    public Bundle getTransitionState() {
        if (this.z0 == null) {
            this.z0 = new g();
        }
        g gVar = this.z0;
        MotionLayout motionLayout = MotionLayout.this;
        gVar.d = motionLayout.C;
        gVar.c = motionLayout.A;
        gVar.b = motionLayout.getVelocity();
        gVar.a = motionLayout.getProgress();
        g gVar2 = this.z0;
        gVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", gVar2.a);
        bundle.putFloat("motion.velocity", gVar2.b);
        bundle.putInt("motion.StartState", gVar2.c);
        bundle.putInt("motion.EndState", gVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null) {
            androidx.constraintlayout.motion.widget.a.b bVar = aVar.c;
            this.I = (bVar != null ? bVar.h : aVar.j) / 1000.0f;
        }
        return (long) (this.I * 1000.0f);
    }

    public float getVelocity() {
        return this.z;
    }

    @Override // defpackage.InterfaceC3911g31
    public final void j(@NonNull View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.b0 || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.b0 = false;
    }

    @Override // defpackage.InterfaceC3701f31
    public final void k(@NonNull View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // defpackage.InterfaceC3701f31
    public final boolean l(@NonNull View view, @NonNull View view2, int i2, int i3) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        return (aVar == null || (bVar = aVar.c) == null || (bVar2 = bVar.l) == null || (bVar2.w & 2) != 0) ? false : true;
    }

    @Override // defpackage.InterfaceC3701f31
    public final void m(@NonNull View view, @NonNull View view2, int i2, int i3) {
        this.e0 = getNanoTime();
        this.f0 = 0.0f;
        this.c0 = 0.0f;
        this.d0 = 0.0f;
    }

    @Override // defpackage.InterfaceC3701f31
    public final void n(@NonNull View view, int i2) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null) {
            float f2 = this.f0;
            if (f2 == 0.0f) {
                return;
            }
            float f3 = this.c0 / f2;
            float f4 = this.d0 / f2;
            androidx.constraintlayout.motion.widget.a.b bVar2 = aVar.c;
            if (bVar2 == null || (bVar = bVar2.l) == null) {
                return;
            }
            bVar.m = false;
            MotionLayout motionLayout = bVar.r;
            float progress = motionLayout.getProgress();
            bVar.r.w(bVar.d, progress, bVar.h, bVar.g, bVar.n);
            float f5 = bVar.k;
            float[] fArr = bVar.n;
            float f6 = f5 != 0.0f ? (f3 * f5) / fArr[0] : (f4 * bVar.l) / fArr[1];
            if (!Float.isNaN(f6)) {
                progress += f6 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z = progress != 1.0f;
                int i3 = bVar.c;
                if ((i3 != 3) && z) {
                    motionLayout.E(((double) progress) >= 0.5d ? 1.0f : 0.0f, f6, i3);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3701f31
    public final void o(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        boolean z;
        float f2;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f3;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        int i5;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null || (bVar = aVar.c) == null || (z = bVar.o)) {
            return;
        }
        int i6 = -1;
        if (z || (bVar5 = bVar.l) == null || (i5 = bVar5.e) == -1 || view.getId() == i5) {
            androidx.constraintlayout.motion.widget.a.b bVar6 = aVar.c;
            if ((bVar6 == null || (bVar4 = bVar6.l) == null) ? false : bVar4.u) {
                androidx.constraintlayout.motion.widget.b bVar7 = bVar.l;
                if (bVar7 != null && (bVar7.w & 4) != 0) {
                    i6 = i3;
                }
                float f4 = this.J;
                if ((f4 == 1.0f || f4 == 0.0f) && view.canScrollVertically(i6)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.b bVar8 = bVar.l;
            if (bVar8 == null || (bVar8.w & 1) == 0) {
                f2 = 0.0f;
            } else {
                float f5 = i2;
                float f6 = i3;
                androidx.constraintlayout.motion.widget.a.b bVar9 = aVar.c;
                if (bVar9 == null || (bVar3 = bVar9.l) == null) {
                    f2 = 0.0f;
                    f3 = 0.0f;
                } else {
                    f2 = 0.0f;
                    bVar3.r.w(bVar3.d, bVar3.r.getProgress(), bVar3.h, bVar3.g, bVar3.n);
                    float f7 = bVar3.k;
                    float[] fArr = bVar3.n;
                    if (f7 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f3 = (f5 * f7) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f3 = (f6 * bVar3.l) / fArr[1];
                    }
                }
                float f8 = this.K;
                if ((f8 <= f2 && f3 < f2) || (f8 >= 1.0f && f3 > f2)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a((ViewGroup) view));
                    return;
                }
            }
            float f9 = this.J;
            long nanoTime = getNanoTime();
            float f10 = i2;
            this.c0 = f10;
            float f11 = i3;
            this.d0 = f11;
            this.f0 = (float) ((nanoTime - this.e0) * 1.0E-9d);
            this.e0 = nanoTime;
            androidx.constraintlayout.motion.widget.a.b bVar10 = aVar.c;
            if (bVar10 != null && (bVar2 = bVar10.l) != null) {
                MotionLayout motionLayout = bVar2.r;
                float progress = motionLayout.getProgress();
                if (!bVar2.m) {
                    bVar2.m = true;
                    motionLayout.setProgress(progress);
                }
                bVar2.r.w(bVar2.d, progress, bVar2.h, bVar2.g, bVar2.n);
                float f12 = bVar2.k;
                float[] fArr2 = bVar2.n;
                if (Math.abs((bVar2.l * fArr2[1]) + (f12 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f13 = bVar2.k;
                float fMax = Math.max(Math.min(progress + (f13 != f2 ? (f10 * f13) / fArr2[0] : (f11 * bVar2.l) / fArr2[1]), 1.0f), f2);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f9 != this.J) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            t(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.b0 = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.a.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null && (i2 = this.B) != -1) {
            androidx.constraintlayout.widget.c cVarB = aVar.b(i2);
            androidx.constraintlayout.motion.widget.a aVar2 = this.w;
            int i3 = 0;
            loop0: while (true) {
                SparseArray<androidx.constraintlayout.widget.c> sparseArray = aVar2.g;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i3);
                SparseIntArray sparseIntArray = aVar2.i;
                int i4 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (true) {
                    if (i4 > 0) {
                        if (i4 != iKeyAt) {
                            int i5 = size - 1;
                            if (size >= 0) {
                                i4 = sparseIntArray.get(i4);
                                size = i5;
                            }
                        }
                        b0.c("MotionScene", "Cannot be derived from yourself");
                        break loop0;
                    }
                    aVar2.m(iKeyAt, this);
                    i3++;
                }
            }
            if (cVarB != null) {
                cVarB.b(this);
            }
            this.A = this.B;
        }
        y();
        g gVar = this.z0;
        if (gVar != null) {
            if (this.C0) {
                post(new b());
                return;
            } else {
                gVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.w;
        if (aVar3 == null || (bVar = aVar3.c) == null || bVar.n != 4) {
            return;
        }
        F();
        setState(i.e);
        setState(i.g);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        androidx.constraintlayout.motion.widget.b bVar;
        int i2;
        RectF rectFB;
        MotionLayout motionLayout;
        int currentState;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null || !this.F) {
            return false;
        }
        androidx.constraintlayout.motion.widget.d dVar = aVar.q;
        if (dVar == null || (currentState = (motionLayout = dVar.a).getCurrentState()) == -1) {
            z = false;
        } else {
            HashSet<View> hashSet = dVar.c;
            ArrayList<androidx.constraintlayout.motion.widget.c> arrayList = dVar.b;
            if (hashSet == null) {
                dVar.c = new HashSet<>();
                for (androidx.constraintlayout.motion.widget.c cVar : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = motionLayout.getChildAt(i3);
                        if (cVar.c(childAt)) {
                            childAt.getId();
                            dVar.c.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<androidx.constraintlayout.motion.widget.c.a> arrayList2 = dVar.e;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (androidx.constraintlayout.motion.widget.c.a aVar2 : dVar.e) {
                    if (action != 1) {
                        if (action != 2) {
                            aVar2.getClass();
                        } else {
                            View view = aVar2.c.b;
                            Rect rect2 = aVar2.l;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x, (int) y) && !aVar2.h) {
                                aVar2.b();
                            }
                        }
                    } else if (!aVar2.h) {
                        aVar2.b();
                    }
                }
            }
            z = false;
            if (action == 0 || action == 1) {
                androidx.constraintlayout.motion.widget.a aVar3 = motionLayout.w;
                androidx.constraintlayout.widget.c cVarB = aVar3 == null ? null : aVar3.b(currentState);
                for (androidx.constraintlayout.motion.widget.c cVar2 : arrayList) {
                    int i4 = cVar2.b;
                    if (i4 == 1) {
                        if (action == 0) {
                            for (View view2 : dVar.c) {
                                if (cVar2.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        cVar2.a(dVar, dVar.a, currentState, cVarB, view2);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 2) {
                        if (action == 1) {
                            while (r2.hasNext()) {
                                if (cVar2.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        cVar2.a(dVar, dVar.a, currentState, cVarB, view2);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 3 && action == 0) {
                        while (r2.hasNext()) {
                            if (cVar2.c(view2)) {
                                view2.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    cVar2.a(dVar, dVar.a, currentState, cVarB, view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.motion.widget.a.b bVar2 = this.w.c;
        if (bVar2 == null || bVar2.o || (bVar = bVar2.l) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = bVar.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i2 = bVar.e) == -1) {
            return z;
        }
        View view3 = this.H0;
        if (view3 == null || view3.getId() != i2) {
            this.H0 = findViewById(i2);
        }
        View view4 = this.H0;
        if (view4 == null) {
            return z;
        }
        RectF rectF = this.G0;
        rectF.set(view4.getLeft(), this.H0.getTop(), this.H0.getRight(), this.H0.getBottom());
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || x((float) this.H0.getLeft(), (float) this.H0.getTop(), this.H0, motionEvent)) ? z : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) throws Throwable {
        MotionLayout motionLayout;
        this.y0 = true;
        try {
            if (this.w == null) {
                super.onLayout(z, i2, i3, i4, i5);
                this.y0 = false;
                return;
            }
            motionLayout = this;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            try {
                if (motionLayout.W != i6 || motionLayout.a0 != i7) {
                    A();
                    t(true);
                }
                motionLayout.W = i6;
                motionLayout.a0 = i7;
                motionLayout.y0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.y0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z;
        if (this.w == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.D == i2 && this.E == i3) ? false : true;
        if (this.F0) {
            this.F0 = false;
            y();
            z();
            z3 = true;
        }
        if (this.l) {
            z3 = true;
        }
        this.D = i2;
        this.E = i3;
        int iG = this.w.g();
        androidx.constraintlayout.motion.widget.a.b bVar = this.w.c;
        int i4 = bVar == null ? -1 : bVar.c;
        UK uk = this.g;
        e eVar = this.E0;
        if ((!z3 && iG == eVar.e && i4 == eVar.f) || this.A == -1) {
            if (z3) {
                super.onMeasure(i2, i3);
            }
            z = true;
        } else {
            super.onMeasure(i2, i3);
            eVar.e(this.w.b(iG), this.w.b(i4));
            eVar.f();
            eVar.e = iG;
            eVar.f = i4;
            z = false;
        }
        if (this.p0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iU = uk.u() + getPaddingRight() + getPaddingLeft();
            int iO = uk.o() + paddingBottom;
            int i5 = this.u0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.q0;
                iU = (int) ((this.w0 * (this.s0 - i6)) + i6);
                requestLayout();
            }
            int i7 = this.v0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                int i8 = this.r0;
                iO = (int) ((this.w0 * (this.t0 - i8)) + i8);
                requestLayout();
            }
            setMeasuredDimension(iU, iO);
        }
        float fSignum = Math.signum(this.M - this.K);
        long nanoTime = getNanoTime();
        AbstractInterpolatorC5634o11 abstractInterpolatorC5634o11 = this.x;
        float interpolation = this.K + (!(abstractInterpolatorC5634o11 instanceof GQ1) ? (((nanoTime - this.L) * fSignum) * 1.0E-9f) / this.I : 0.0f);
        if (this.N) {
            interpolation = this.M;
        }
        if ((fSignum <= 0.0f || interpolation < this.M) && (fSignum > 0.0f || interpolation > this.M)) {
            z2 = false;
        } else {
            interpolation = this.M;
        }
        if (abstractInterpolatorC5634o11 != null && !z2) {
            interpolation = this.S ? abstractInterpolatorC5634o11.getInterpolation((nanoTime - this.H) * 1.0E-9f) : abstractInterpolatorC5634o11.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.M) || (fSignum <= 0.0f && interpolation <= this.M)) {
            interpolation = this.M;
        }
        this.w0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.y;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f2 = interpolation;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            C5214m11 c5214m11 = this.G.get(childAt);
            if (c5214m11 != null) {
                c5214m11.d(f2, nanoTime2, this.x0, childAt);
            }
        }
        if (this.p0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null) {
            boolean zF = f();
            aVar.p = zF;
            androidx.constraintlayout.motion.widget.a.b bVar2 = aVar.c;
            if (bVar2 == null || (bVar = bVar2.l) == null) {
                return;
            }
            bVar.c(zF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x020d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0216  */
    /* JADX WARN: Code duplicated, block: B:111:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x0229  */
    /* JADX WARN: Code duplicated, block: B:116:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0273  */
    /* JADX WARN: Code duplicated, block: B:119:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x028e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0296  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:128:0x0301  */
    /* JADX WARN: Code duplicated, block: B:131:0x030c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0318  */
    /* JADX WARN: Code duplicated, block: B:136:0x031f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0325  */
    /* JADX WARN: Code duplicated, block: B:140:0x034b  */
    /* JADX WARN: Code duplicated, block: B:143:0x036f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0373  */
    /* JADX WARN: Code duplicated, block: B:147:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0379  */
    /* JADX WARN: Code duplicated, block: B:149:0x037b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0386  */
    /* JADX WARN: Code duplicated, block: B:156:0x038f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0394  */
    /* JADX WARN: Code duplicated, block: B:160:0x0399  */
    /* JADX WARN: Code duplicated, block: B:161:0x039e  */
    /* JADX WARN: Code duplicated, block: B:163:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:178:0x0407  */
    /* JADX WARN: Code duplicated, block: B:180:0x0438  */
    /* JADX WARN: Code duplicated, block: B:182:0x043d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0474 A[PHI: r8 r9
      0x0474: PHI (r8v12 float) = (r8v4 float), (r8v27 float) binds: [B:181:0x043b, B:179:0x042d] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r9v34 float) = (r9v29 float), (r9v40 float) binds: [B:181:0x043b, B:179:0x042d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x048f  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:189:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:191:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:219:0x0542  */
    /* JADX WARN: Code duplicated, block: B:221:0x054a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0550  */
    /* JADX WARN: Code duplicated, block: B:224:0x0555  */
    /* JADX WARN: Code duplicated, block: B:225:0x0566  */
    /* JADX WARN: Code duplicated, block: B:227:0x0570  */
    /* JADX WARN: Code duplicated, block: B:230:0x0579  */
    /* JADX WARN: Code duplicated, block: B:232:0x057c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0581  */
    /* JADX WARN: Code duplicated, block: B:237:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:239:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:244:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:248:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:251:0x0609  */
    /* JADX WARN: Code duplicated, block: B:252:0x060d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0621  */
    /* JADX WARN: Code duplicated, block: B:258:0x062a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0639  */
    /* JADX WARN: Code duplicated, block: B:263:0x063f  */
    /* JADX WARN: Code duplicated, block: B:265:0x0645 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:266:0x0647  */
    /* JADX WARN: Code duplicated, block: B:267:0x0649  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:274:0x065d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0662  */
    /* JADX WARN: Code duplicated, block: B:278:0x0667  */
    /* JADX WARN: Code duplicated, block: B:279:0x066c  */
    /* JADX WARN: Code duplicated, block: B:282:0x0674  */
    /* JADX WARN: Code duplicated, block: B:283:0x067a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0683  */
    /* JADX WARN: Code duplicated, block: B:287:0x0694  */
    /* JADX WARN: Code duplicated, block: B:289:0x069b  */
    /* JADX WARN: Code duplicated, block: B:292:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:293:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:296:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:297:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:300:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:301:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:304:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:305:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:308:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:310:0x0704  */
    /* JADX WARN: Code duplicated, block: B:313:0x070a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0758  */
    /* JADX WARN: Code duplicated, block: B:340:0x075e  */
    /* JADX WARN: Code duplicated, block: B:342:0x0764  */
    /* JADX WARN: Code duplicated, block: B:343:0x0768  */
    /* JADX WARN: Code duplicated, block: B:346:0x078a  */
    /* JADX WARN: Code duplicated, block: B:350:0x0792  */
    /* JADX WARN: Code duplicated, block: B:351:0x0799  */
    /* JADX WARN: Code duplicated, block: B:354:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        f fVar;
        VelocityTracker velocityTracker;
        f fVar2;
        int i2;
        androidx.constraintlayout.motion.widget.b bVar2;
        f fVar3;
        boolean z;
        i iVar;
        float[] fArr;
        MotionLayout motionLayout;
        VelocityTracker velocityTracker2;
        int action;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        float xVelocity;
        VelocityTracker velocityTracker5;
        float yVelocity;
        float progress;
        int i3;
        char c2;
        char c3;
        float f2;
        float f3;
        float f4;
        float fAbs;
        float f5;
        int i4;
        float rawY;
        float rawX;
        float progress2;
        int i5;
        char c4;
        char c5;
        float f6;
        float fMax;
        float progress3;
        boolean z2;
        VelocityTracker velocityTracker6;
        VelocityTracker velocityTracker7;
        float xVelocity2;
        VelocityTracker velocityTracker8;
        float yVelocity2;
        float f7;
        VelocityTracker velocityTracker9;
        int action2;
        int[] iArr;
        VelocityTracker velocityTracker10;
        VelocityTracker velocityTracker11;
        float xVelocity3;
        VelocityTracker velocityTracker12;
        float yVelocity3;
        float progress4;
        int i6;
        int i7;
        float right;
        float f8;
        int top;
        int bottom;
        int i8;
        float degrees;
        float f9;
        int i9;
        float width;
        float height;
        int i10;
        int i11;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float progress5;
        boolean z3;
        int i12;
        float f10;
        ?? r20;
        float fMax2;
        float progress6;
        boolean z4;
        VelocityTracker velocityTracker13;
        VelocityTracker velocityTracker14;
        float xVelocity4;
        VelocityTracker velocityTracker15;
        float yVelocity4;
        MotionEvent motionEvent2;
        androidx.constraintlayout.motion.widget.a.b bVar3;
        RectF rectFA;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null || !this.F || !aVar.o()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.a aVar2 = this.w;
        androidx.constraintlayout.motion.widget.a.b bVar4 = aVar2.c;
        if (bVar4 != null && bVar4.o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF = new RectF();
        f fVar4 = aVar2.o;
        MotionLayout motionLayout2 = aVar2.a;
        if (fVar4 == null) {
            motionLayout2.getClass();
            f fVar5 = f.b;
            fVar5.a = VelocityTracker.obtain();
            aVar2.o = fVar5;
        }
        VelocityTracker velocityTracker16 = aVar2.o.a;
        if (velocityTracker16 != null) {
            velocityTracker16.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                aVar2.r = motionEvent.getRawX();
                aVar2.s = motionEvent.getRawY();
                aVar2.l = motionEvent;
                aVar2.m = false;
                androidx.constraintlayout.motion.widget.b bVar5 = aVar2.c.l;
                if (bVar5 != null) {
                    RectF rectFA2 = bVar5.a(motionLayout2, rectF);
                    if (rectFA2 == null || rectFA2.contains(aVar2.l.getX(), aVar2.l.getY())) {
                        RectF rectFB = aVar2.c.l.b(motionLayout2, rectF);
                        if (rectFB == null || rectFB.contains(aVar2.l.getX(), aVar2.l.getY())) {
                            aVar2.n = false;
                        } else {
                            aVar2.n = true;
                        }
                        androidx.constraintlayout.motion.widget.b bVar6 = aVar2.c.l;
                        float f11 = aVar2.r;
                        float f12 = aVar2.s;
                        bVar6.p = f11;
                        bVar6.q = f12;
                    } else {
                        aVar2.l = null;
                        aVar2.m = true;
                    }
                }
            } else if (action3 == 2 && !aVar2.m) {
                float rawY3 = motionEvent.getRawY() - aVar2.s;
                float rawX3 = motionEvent.getRawX() - aVar2.r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = aVar2.l) != null) {
                    if (currentState != -1) {
                        ArrayList<androidx.constraintlayout.motion.widget.a.b> arrayListH = aVar2.h(currentState);
                        RectF rectF2 = new RectF();
                        float f13 = 0.0f;
                        androidx.constraintlayout.motion.widget.a.b bVar7 = null;
                        for (androidx.constraintlayout.motion.widget.a.b bVar8 : arrayListH) {
                            if (!bVar8.o) {
                                androidx.constraintlayout.motion.widget.b bVar9 = bVar8.l;
                                if (bVar9 != null) {
                                    bVar9.c(aVar2.p);
                                    RectF rectFB2 = bVar8.l.b(motionLayout2, rectF2);
                                    if ((rectFB2 == null || rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) && ((rectFA = bVar8.l.a(motionLayout2, rectF2)) == null || rectFA.contains(motionEvent2.getX(), motionEvent2.getY()))) {
                                        androidx.constraintlayout.motion.widget.b bVar10 = bVar8.l;
                                        float fAtan3 = (bVar10.l * rawY3) + (bVar10.k * rawX3);
                                        if (bVar10.j) {
                                            float x = motionEvent2.getX();
                                            bVar8.l.getClass();
                                            float f14 = x - 0.5f;
                                            float y = motionEvent2.getY();
                                            bVar8.l.getClass();
                                            float f15 = y - 0.5f;
                                            fAtan3 = ((float) (Math.atan2(rawY3 + f15, rawX3 + f14) - Math.atan2(f14, f15))) * 10.0f;
                                        }
                                        float f16 = fAtan3 * (bVar8.c == currentState ? -1.0f : 1.1f);
                                        if (f16 > f13) {
                                            f13 = f16;
                                            bVar7 = bVar8;
                                        }
                                    }
                                } else {
                                    rawY3 = rawY3;
                                    rawX3 = rawX3;
                                    motionEvent2 = motionEvent2;
                                }
                                rawY3 = rawY3;
                                rawX3 = rawX3;
                                motionEvent2 = motionEvent2;
                            }
                        }
                        bVar3 = bVar7;
                    } else {
                        bVar3 = aVar2.c;
                    }
                    if (bVar3 != null) {
                        setTransition(bVar3);
                        RectF rectFB3 = aVar2.c.l.b(motionLayout2, rectF);
                        aVar2.n = (rectFB3 == null || rectFB3.contains(aVar2.l.getX(), aVar2.l.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.b bVar11 = aVar2.c.l;
                        float f17 = aVar2.r;
                        float f18 = aVar2.s;
                        bVar11.p = f17;
                        bVar11.q = f18;
                        bVar11.m = false;
                    }
                    if (!aVar2.m) {
                        bVar = aVar2.c;
                        if (bVar != null) {
                            fVar3 = aVar2.o;
                            z = bVar2.j;
                            iVar = i.h;
                            fArr = bVar2.n;
                            motionLayout = bVar2.r;
                            if (z) {
                                velocityTracker9 = fVar3.a;
                                if (velocityTracker9 != null) {
                                    velocityTracker9.addMovement(motionEvent);
                                }
                                action2 = motionEvent.getAction();
                                if (action2 != 0) {
                                    iArr = bVar2.o;
                                    if (action2 == 1) {
                                        bVar2.m = false;
                                        velocityTracker10 = fVar3.a;
                                        if (velocityTracker10 != null) {
                                            velocityTracker10.computeCurrentVelocity(16);
                                        }
                                        velocityTracker11 = fVar3.a;
                                        if (velocityTracker11 != null) {
                                            xVelocity3 = velocityTracker11.getXVelocity();
                                        } else {
                                            xVelocity3 = 0.0f;
                                        }
                                        velocityTracker12 = fVar3.a;
                                        if (velocityTracker12 != null) {
                                            yVelocity3 = velocityTracker12.getYVelocity();
                                        } else {
                                            yVelocity3 = 0.0f;
                                        }
                                        progress4 = motionLayout.getProgress();
                                        float width2 = motionLayout.getWidth() / 2.0f;
                                        float height2 = motionLayout.getHeight() / 2.0f;
                                        i6 = bVar2.i;
                                        if (i6 != -1) {
                                            View viewFindViewById2 = motionLayout.findViewById(i6);
                                            motionLayout.getLocationOnScreen(iArr);
                                            right = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f8 = iArr[1];
                                            top = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i7 = bVar2.d;
                                            if (i7 != -1) {
                                                View viewFindViewById3 = motionLayout.findViewById(motionLayout.G.get(motionLayout.findViewById(i7)).f.o);
                                                motionLayout.getLocationOnScreen(iArr);
                                                right = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f8 = iArr[1];
                                                top = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width2;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i8 = bVar2.d;
                                                if (i8 != -1) {
                                                    bVar2.r.w(i8, progress4, bVar2.h, bVar2.g, bVar2.n);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f9 = progress4;
                                                } else {
                                                    f9 = (((degrees * 3.0f) * bVar2.v) / fArr[1]) + progress4;
                                                }
                                                if (f9 == 0.0f) {
                                                    if (0.0f < f9) {
                                                        motionLayout.setState(iVar);
                                                    } else {
                                                        motionLayout.setState(iVar);
                                                    }
                                                } else if (0.0f < f9) {
                                                    motionLayout.setState(iVar);
                                                } else {
                                                    motionLayout.setState(iVar);
                                                }
                                            }
                                        }
                                        float f19 = right;
                                        height2 = ((bottom + top) / 2.0f) + f8;
                                        width2 = f19;
                                        float rawX5 = motionEvent.getRawX() - width2;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i8 = bVar2.d;
                                        if (i8 != -1) {
                                            bVar2.r.w(i8, progress4, bVar2.h, bVar2.g, bVar2.n);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f9 = (((degrees * 3.0f) * bVar2.v) / fArr[1]) + progress4;
                                        } else {
                                            f9 = progress4;
                                        }
                                        if (f9 == 0.0f) {
                                            if (0.0f < f9) {
                                                motionLayout.setState(iVar);
                                            } else {
                                                motionLayout.setState(iVar);
                                            }
                                        } else if (0.0f < f9) {
                                            motionLayout.setState(iVar);
                                        } else {
                                            motionLayout.setState(iVar);
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width = motionLayout.getWidth() / 2.0f;
                                        height = motionLayout.getHeight() / 2.0f;
                                        i10 = bVar2.i;
                                        if (i10 != -1) {
                                            View viewFindViewById4 = motionLayout.findViewById(i10);
                                            motionLayout.getLocationOnScreen(iArr);
                                            float right2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            height = ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f) + iArr[1];
                                            width = right2;
                                        } else {
                                            i11 = bVar2.d;
                                            if (i11 != -1) {
                                                viewFindViewById = motionLayout.findViewById(motionLayout.G.get(motionLayout.findViewById(i11)).f.o);
                                                if (viewFindViewById == null) {
                                                    b0.c("TouchResponse", "could not find view to animate to");
                                                } else {
                                                    motionLayout.getLocationOnScreen(iArr);
                                                    width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                    height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                                }
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(bVar2.q - height, bVar2.p - width)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        if (Math.abs(fAtan2) <= 0.01d) {
                                            progress5 = motionLayout.getProgress();
                                            if (bVar2.m) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                                bVar2.m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i12 = bVar2.d;
                                            if (i12 != -1) {
                                                boolean z5 = z3;
                                                f10 = progress5;
                                                bVar2.r.w(i12, f10, bVar2.h, bVar2.g, bVar2.n);
                                                fArr[z5 ? 1 : 0] = (float) Math.toDegrees(fArr[z5 ? 1 : 0]);
                                                r20 = z5;
                                            } else {
                                                f10 = progress5;
                                                boolean z6 = z3;
                                                fArr[z6 ? 1 : 0] = 360.0f;
                                                r20 = z6;
                                            }
                                            fMax2 = Math.max(Math.min(((bVar2.v * fAtan2) / fArr[r20]) + f10, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.s(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.s(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = fVar3.a;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                                }
                                                velocityTracker14 = fVar3.a;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = fVar3.a;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d2 = yVelocity4;
                                                double d3 = xVelocity4;
                                                motionLayout.z = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d2, d3) - dAtan2) * Math.hypot(d2, d3)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.z = 0.0f;
                                            }
                                            bVar2.p = motionEvent.getRawX();
                                            bVar2.q = motionEvent.getRawY();
                                        } else {
                                            progress5 = motionLayout.getProgress();
                                            if (bVar2.m) {
                                                z3 = true;
                                                bVar2.m = true;
                                                motionLayout.setProgress(progress5);
                                            } else {
                                                z3 = true;
                                            }
                                            i12 = bVar2.d;
                                            if (i12 != -1) {
                                                boolean z7 = z3;
                                                f10 = progress5;
                                                bVar2.r.w(i12, f10, bVar2.h, bVar2.g, bVar2.n);
                                                fArr[z7 ? 1 : 0] = (float) Math.toDegrees(fArr[z7 ? 1 : 0]);
                                                r20 = z7;
                                            } else {
                                                f10 = progress5;
                                                boolean z8 = z3;
                                                fArr[z8 ? 1 : 0] = 360.0f;
                                                r20 = z8;
                                            }
                                            fMax2 = Math.max(Math.min(((bVar2.v * fAtan2) / fArr[r20]) + f10, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.s(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.s(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = fVar3.a;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                                }
                                                velocityTracker14 = fVar3.a;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = fVar3.a;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d4 = yVelocity4;
                                                double d5 = xVelocity4;
                                                motionLayout.z = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d4, d5) - dAtan2) * Math.hypot(d4, d5)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.z = 0.0f;
                                            }
                                            bVar2.p = motionEvent.getRawX();
                                            bVar2.q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    bVar2.p = motionEvent.getRawX();
                                    bVar2.q = motionEvent.getRawY();
                                    bVar2.m = false;
                                }
                            } else {
                                velocityTracker2 = fVar3.a;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                action = motionEvent.getAction();
                                if (action == 0) {
                                    bVar2.p = motionEvent.getRawX();
                                    bVar2.q = motionEvent.getRawY();
                                    bVar2.m = false;
                                } else if (action == 1) {
                                    bVar2.m = false;
                                    velocityTracker3 = fVar3.a;
                                    if (velocityTracker3 != null) {
                                        velocityTracker3.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                    }
                                    velocityTracker4 = fVar3.a;
                                    if (velocityTracker4 != null) {
                                        xVelocity = velocityTracker4.getXVelocity();
                                    } else {
                                        xVelocity = 0.0f;
                                    }
                                    velocityTracker5 = fVar3.a;
                                    if (velocityTracker5 != null) {
                                        yVelocity = velocityTracker5.getYVelocity();
                                    } else {
                                        yVelocity = 0.0f;
                                    }
                                    progress = motionLayout.getProgress();
                                    i3 = bVar2.d;
                                    if (i3 != -1) {
                                        bVar2.r.w(i3, progress, bVar2.h, bVar2.g, bVar2.n);
                                        c2 = 1;
                                        c3 = 0;
                                    } else {
                                        float fMin = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                        c2 = 1;
                                        fArr[1] = bVar2.l * fMin;
                                        c3 = 0;
                                        fArr[0] = fMin * bVar2.k;
                                    }
                                    f2 = bVar2.k;
                                    f3 = fArr[c3];
                                    f4 = fArr[c2];
                                    if (f2 != 0.0f) {
                                        fAbs = xVelocity / f3;
                                    } else {
                                        fAbs = yVelocity / f4;
                                    }
                                    if (Float.isNaN(fAbs)) {
                                        f5 = progress;
                                    } else {
                                        f5 = (fAbs / 3.0f) + progress;
                                    }
                                    if (f5 == 0.0f) {
                                        if (0.0f < f5) {
                                            motionLayout.setState(iVar);
                                        } else {
                                            motionLayout.setState(iVar);
                                        }
                                    } else if (0.0f < f5) {
                                        motionLayout.setState(iVar);
                                    } else {
                                        motionLayout.setState(iVar);
                                    }
                                } else if (action == 2) {
                                    rawY = motionEvent.getRawY() - bVar2.q;
                                    rawX = motionEvent.getRawX() - bVar2.p;
                                    if (Math.abs((bVar2.l * rawY) + (bVar2.k * rawX)) <= bVar2.x) {
                                        progress2 = motionLayout.getProgress();
                                        if (!bVar2.m) {
                                            bVar2.m = true;
                                            motionLayout.setProgress(progress2);
                                        }
                                        i5 = bVar2.d;
                                        if (i5 != -1) {
                                            bVar2.r.w(i5, progress2, bVar2.h, bVar2.g, bVar2.n);
                                            c4 = 1;
                                            c5 = 0;
                                        } else {
                                            float fMin2 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c4 = 1;
                                            fArr[1] = bVar2.l * fMin2;
                                            c5 = 0;
                                            fArr[0] = fMin2 * bVar2.k;
                                        }
                                        if (Math.abs(((bVar2.l * fArr[c4]) + (bVar2.k * fArr[c5])) * bVar2.v) < 0.01d) {
                                            fArr[0] = 0.01f;
                                            fArr[c4] = 0.01f;
                                        }
                                        if (bVar2.k != 0.0f) {
                                            f6 = rawX / fArr[0];
                                        } else {
                                            f6 = rawY / fArr[c4];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                        if (bVar2.c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (bVar2.c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = motionLayout.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != 0.0f) {
                                                if (progress3 == 0.0f) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout.s(z2);
                                            } else {
                                                if (progress3 == 0.0f) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout.s(z2);
                                            }
                                            motionLayout.setProgress(fMax);
                                            velocityTracker6 = fVar3.a;
                                            if (velocityTracker6 != null) {
                                                velocityTracker6.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                            }
                                            velocityTracker7 = fVar3.a;
                                            if (velocityTracker7 != null) {
                                                xVelocity2 = velocityTracker7.getXVelocity();
                                            } else {
                                                xVelocity2 = 0.0f;
                                            }
                                            velocityTracker8 = fVar3.a;
                                            if (velocityTracker8 != null) {
                                                yVelocity2 = velocityTracker8.getYVelocity();
                                            } else {
                                                yVelocity2 = 0.0f;
                                            }
                                            if (bVar2.k != 0.0f) {
                                                f7 = xVelocity2 / fArr[0];
                                            } else {
                                                f7 = yVelocity2 / fArr[1];
                                            }
                                            motionLayout.z = f7;
                                        } else {
                                            motionLayout.z = 0.0f;
                                        }
                                        bVar2.p = motionEvent.getRawX();
                                        bVar2.q = motionEvent.getRawY();
                                    } else {
                                        progress2 = motionLayout.getProgress();
                                        if (!bVar2.m) {
                                            bVar2.m = true;
                                            motionLayout.setProgress(progress2);
                                        }
                                        i5 = bVar2.d;
                                        if (i5 != -1) {
                                            bVar2.r.w(i5, progress2, bVar2.h, bVar2.g, bVar2.n);
                                            c4 = 1;
                                            c5 = 0;
                                        } else {
                                            float fMin3 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c4 = 1;
                                            fArr[1] = bVar2.l * fMin3;
                                            c5 = 0;
                                            fArr[0] = fMin3 * bVar2.k;
                                        }
                                        if (Math.abs(((bVar2.l * fArr[c4]) + (bVar2.k * fArr[c5])) * bVar2.v) < 0.01d) {
                                            fArr[0] = 0.01f;
                                            fArr[c4] = 0.01f;
                                        }
                                        if (bVar2.k != 0.0f) {
                                            f6 = rawX / fArr[0];
                                        } else {
                                            f6 = rawY / fArr[c4];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                        if (bVar2.c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (bVar2.c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = motionLayout.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != 0.0f) {
                                                if (progress3 == 0.0f) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout.s(z2);
                                            } else {
                                                if (progress3 == 0.0f) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout.s(z2);
                                            }
                                            motionLayout.setProgress(fMax);
                                            velocityTracker6 = fVar3.a;
                                            if (velocityTracker6 != null) {
                                                velocityTracker6.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                            }
                                            velocityTracker7 = fVar3.a;
                                            if (velocityTracker7 != null) {
                                                xVelocity2 = velocityTracker7.getXVelocity();
                                            } else {
                                                xVelocity2 = 0.0f;
                                            }
                                            velocityTracker8 = fVar3.a;
                                            if (velocityTracker8 != null) {
                                                yVelocity2 = velocityTracker8.getYVelocity();
                                            } else {
                                                yVelocity2 = 0.0f;
                                            }
                                            if (bVar2.k != 0.0f) {
                                                f7 = xVelocity2 / fArr[0];
                                            } else {
                                                f7 = yVelocity2 / fArr[1];
                                            }
                                            motionLayout.z = f7;
                                        } else {
                                            motionLayout.z = 0.0f;
                                        }
                                        bVar2.p = motionEvent.getRawX();
                                        bVar2.q = motionEvent.getRawY();
                                    }
                                }
                            }
                        }
                        aVar2.r = motionEvent.getRawX();
                        aVar2.s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            velocityTracker = fVar.a;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                fVar2 = null;
                                fVar.a = null;
                            } else {
                                fVar2 = null;
                            }
                            aVar2.o = fVar2;
                            i2 = this.B;
                            if (i2 != -1) {
                                aVar2.a(i2, this);
                            }
                        }
                    }
                }
            } else if (!aVar2.m) {
                bVar = aVar2.c;
                if (bVar != null) {
                    fVar3 = aVar2.o;
                    z = bVar2.j;
                    iVar = i.h;
                    fArr = bVar2.n;
                    motionLayout = bVar2.r;
                    if (z) {
                        velocityTracker9 = fVar3.a;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        action2 = motionEvent.getAction();
                        if (action2 != 0) {
                            iArr = bVar2.o;
                            if (action2 == 1) {
                                bVar2.m = false;
                                velocityTracker10 = fVar3.a;
                                if (velocityTracker10 != null) {
                                    velocityTracker10.computeCurrentVelocity(16);
                                }
                                velocityTracker11 = fVar3.a;
                                if (velocityTracker11 != null) {
                                    xVelocity3 = velocityTracker11.getXVelocity();
                                } else {
                                    xVelocity3 = 0.0f;
                                }
                                velocityTracker12 = fVar3.a;
                                if (velocityTracker12 != null) {
                                    yVelocity3 = velocityTracker12.getYVelocity();
                                } else {
                                    yVelocity3 = 0.0f;
                                }
                                progress4 = motionLayout.getProgress();
                                float width3 = motionLayout.getWidth() / 2.0f;
                                float height3 = motionLayout.getHeight() / 2.0f;
                                i6 = bVar2.i;
                                if (i6 != -1) {
                                    View viewFindViewById5 = motionLayout.findViewById(i6);
                                    motionLayout.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f8 = iArr[1];
                                    top = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i7 = bVar2.d;
                                    if (i7 != -1) {
                                        View viewFindViewById6 = motionLayout.findViewById(motionLayout.G.get(motionLayout.findViewById(i7)).f.o);
                                        motionLayout.getLocationOnScreen(iArr);
                                        right = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f8 = iArr[1];
                                        top = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width3;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i8 = bVar2.d;
                                        if (i8 != -1) {
                                            bVar2.r.w(i8, progress4, bVar2.h, bVar2.g, bVar2.n);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY6, xVelocity3 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f9 = (((degrees * 3.0f) * bVar2.v) / fArr[1]) + progress4;
                                        } else {
                                            f9 = progress4;
                                        }
                                        if (f9 == 0.0f) {
                                            if (0.0f < f9) {
                                                motionLayout.setState(iVar);
                                            } else {
                                                motionLayout.setState(iVar);
                                            }
                                        } else if (0.0f < f9) {
                                            motionLayout.setState(iVar);
                                        } else {
                                            motionLayout.setState(iVar);
                                        }
                                    }
                                }
                                float f110 = right;
                                height3 = ((bottom + top) / 2.0f) + f8;
                                width3 = f110;
                                float rawX7 = motionEvent.getRawX() - width3;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i8 = bVar2.d;
                                if (i8 != -1) {
                                    bVar2.r.w(i8, progress4, bVar2.h, bVar2.g, bVar2.n);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY7, xVelocity3 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f9 = (((degrees * 3.0f) * bVar2.v) / fArr[1]) + progress4;
                                } else {
                                    f9 = progress4;
                                }
                                if (f9 == 0.0f) {
                                    if (0.0f < f9) {
                                        motionLayout.setState(iVar);
                                    } else {
                                        motionLayout.setState(iVar);
                                    }
                                } else if (0.0f < f9) {
                                    motionLayout.setState(iVar);
                                } else {
                                    motionLayout.setState(iVar);
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width = motionLayout.getWidth() / 2.0f;
                                height = motionLayout.getHeight() / 2.0f;
                                i10 = bVar2.i;
                                if (i10 != -1) {
                                    View viewFindViewById7 = motionLayout.findViewById(i10);
                                    motionLayout.getLocationOnScreen(iArr);
                                    float right3 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    height = ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f) + iArr[1];
                                    width = right3;
                                } else {
                                    i11 = bVar2.d;
                                    if (i11 != -1) {
                                        viewFindViewById = motionLayout.findViewById(motionLayout.G.get(motionLayout.findViewById(i11)).f.o);
                                        if (viewFindViewById == null) {
                                            b0.c("TouchResponse", "could not find view to animate to");
                                        } else {
                                            motionLayout.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                            height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                        }
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(bVar2.q - height, bVar2.p - width)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                if (Math.abs(fAtan2) <= 0.01d) {
                                    progress5 = motionLayout.getProgress();
                                    if (bVar2.m) {
                                        z3 = true;
                                        bVar2.m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = bVar2.d;
                                    if (i12 != -1) {
                                        boolean z9 = z3;
                                        f10 = progress5;
                                        bVar2.r.w(i12, f10, bVar2.h, bVar2.g, bVar2.n);
                                        fArr[z9 ? 1 : 0] = (float) Math.toDegrees(fArr[z9 ? 1 : 0]);
                                        r20 = z9;
                                    } else {
                                        f10 = progress5;
                                        boolean z10 = z3;
                                        fArr[z10 ? 1 : 0] = 360.0f;
                                        r20 = z10;
                                    }
                                    fMax2 = Math.max(Math.min(((bVar2.v * fAtan2) / fArr[r20]) + f10, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.s(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.s(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = fVar3.a;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                        }
                                        velocityTracker14 = fVar3.a;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = fVar3.a;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d6 = yVelocity4;
                                        double d7 = xVelocity4;
                                        motionLayout.z = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d6, d7) - dAtan2) * Math.hypot(d6, d7)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.z = 0.0f;
                                    }
                                    bVar2.p = motionEvent.getRawX();
                                    bVar2.q = motionEvent.getRawY();
                                } else {
                                    progress5 = motionLayout.getProgress();
                                    if (bVar2.m) {
                                        z3 = true;
                                        bVar2.m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = bVar2.d;
                                    if (i12 != -1) {
                                        boolean z11 = z3;
                                        f10 = progress5;
                                        bVar2.r.w(i12, f10, bVar2.h, bVar2.g, bVar2.n);
                                        fArr[z11 ? 1 : 0] = (float) Math.toDegrees(fArr[z11 ? 1 : 0]);
                                        r20 = z11;
                                    } else {
                                        f10 = progress5;
                                        boolean z12 = z3;
                                        fArr[z12 ? 1 : 0] = 360.0f;
                                        r20 = z12;
                                    }
                                    fMax2 = Math.max(Math.min(((bVar2.v * fAtan2) / fArr[r20]) + f10, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.s(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.s(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = fVar3.a;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                        }
                                        velocityTracker14 = fVar3.a;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = fVar3.a;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d8 = yVelocity4;
                                        double d9 = xVelocity4;
                                        motionLayout.z = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d8, d9) - dAtan2) * Math.hypot(d8, d9)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.z = 0.0f;
                                    }
                                    bVar2.p = motionEvent.getRawX();
                                    bVar2.q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            bVar2.p = motionEvent.getRawX();
                            bVar2.q = motionEvent.getRawY();
                            bVar2.m = false;
                        }
                    } else {
                        velocityTracker2 = fVar3.a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        action = motionEvent.getAction();
                        if (action == 0) {
                            bVar2.p = motionEvent.getRawX();
                            bVar2.q = motionEvent.getRawY();
                            bVar2.m = false;
                        } else if (action == 1) {
                            bVar2.m = false;
                            velocityTracker3 = fVar3.a;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                            }
                            velocityTracker4 = fVar3.a;
                            if (velocityTracker4 != null) {
                                xVelocity = velocityTracker4.getXVelocity();
                            } else {
                                xVelocity = 0.0f;
                            }
                            velocityTracker5 = fVar3.a;
                            if (velocityTracker5 != null) {
                                yVelocity = velocityTracker5.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            progress = motionLayout.getProgress();
                            i3 = bVar2.d;
                            if (i3 != -1) {
                                bVar2.r.w(i3, progress, bVar2.h, bVar2.g, bVar2.n);
                                c2 = 1;
                                c3 = 0;
                            } else {
                                float fMin4 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c2 = 1;
                                fArr[1] = bVar2.l * fMin4;
                                c3 = 0;
                                fArr[0] = fMin4 * bVar2.k;
                            }
                            f2 = bVar2.k;
                            f3 = fArr[c3];
                            f4 = fArr[c2];
                            if (f2 != 0.0f) {
                                fAbs = xVelocity / f3;
                            } else {
                                fAbs = yVelocity / f4;
                            }
                            if (Float.isNaN(fAbs)) {
                                f5 = (fAbs / 3.0f) + progress;
                            } else {
                                f5 = progress;
                            }
                            if (f5 == 0.0f) {
                                if (0.0f < f5) {
                                    motionLayout.setState(iVar);
                                } else {
                                    motionLayout.setState(iVar);
                                }
                            } else if (0.0f < f5) {
                                motionLayout.setState(iVar);
                            } else {
                                motionLayout.setState(iVar);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - bVar2.q;
                            rawX = motionEvent.getRawX() - bVar2.p;
                            if (Math.abs((bVar2.l * rawY) + (bVar2.k * rawX)) <= bVar2.x) {
                                progress2 = motionLayout.getProgress();
                                if (!bVar2.m) {
                                    bVar2.m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i5 = bVar2.d;
                                if (i5 != -1) {
                                    bVar2.r.w(i5, progress2, bVar2.h, bVar2.g, bVar2.n);
                                    c4 = 1;
                                    c5 = 0;
                                } else {
                                    float fMin5 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c4 = 1;
                                    fArr[1] = bVar2.l * fMin5;
                                    c5 = 0;
                                    fArr[0] = fMin5 * bVar2.k;
                                }
                                if (Math.abs(((bVar2.l * fArr[c4]) + (bVar2.k * fArr[c5])) * bVar2.v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c4] = 0.01f;
                                }
                                if (bVar2.k != 0.0f) {
                                    f6 = rawX / fArr[0];
                                } else {
                                    f6 = rawY / fArr[c4];
                                }
                                fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                if (bVar2.c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (bVar2.c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f) {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.s(z2);
                                    } else {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.s(z2);
                                    }
                                    motionLayout.setProgress(fMax);
                                    velocityTracker6 = fVar3.a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                    }
                                    velocityTracker7 = fVar3.a;
                                    if (velocityTracker7 != null) {
                                        xVelocity2 = velocityTracker7.getXVelocity();
                                    } else {
                                        xVelocity2 = 0.0f;
                                    }
                                    velocityTracker8 = fVar3.a;
                                    if (velocityTracker8 != null) {
                                        yVelocity2 = velocityTracker8.getYVelocity();
                                    } else {
                                        yVelocity2 = 0.0f;
                                    }
                                    if (bVar2.k != 0.0f) {
                                        f7 = xVelocity2 / fArr[0];
                                    } else {
                                        f7 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.z = f7;
                                } else {
                                    motionLayout.z = 0.0f;
                                }
                                bVar2.p = motionEvent.getRawX();
                                bVar2.q = motionEvent.getRawY();
                            } else {
                                progress2 = motionLayout.getProgress();
                                if (!bVar2.m) {
                                    bVar2.m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i5 = bVar2.d;
                                if (i5 != -1) {
                                    bVar2.r.w(i5, progress2, bVar2.h, bVar2.g, bVar2.n);
                                    c4 = 1;
                                    c5 = 0;
                                } else {
                                    float fMin6 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c4 = 1;
                                    fArr[1] = bVar2.l * fMin6;
                                    c5 = 0;
                                    fArr[0] = fMin6 * bVar2.k;
                                }
                                if (Math.abs(((bVar2.l * fArr[c4]) + (bVar2.k * fArr[c5])) * bVar2.v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c4] = 0.01f;
                                }
                                if (bVar2.k != 0.0f) {
                                    f6 = rawX / fArr[0];
                                } else {
                                    f6 = rawY / fArr[c4];
                                }
                                fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                if (bVar2.c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (bVar2.c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f) {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.s(z2);
                                    } else {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.s(z2);
                                    }
                                    motionLayout.setProgress(fMax);
                                    velocityTracker6 = fVar3.a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                    }
                                    velocityTracker7 = fVar3.a;
                                    if (velocityTracker7 != null) {
                                        xVelocity2 = velocityTracker7.getXVelocity();
                                    } else {
                                        xVelocity2 = 0.0f;
                                    }
                                    velocityTracker8 = fVar3.a;
                                    if (velocityTracker8 != null) {
                                        yVelocity2 = velocityTracker8.getYVelocity();
                                    } else {
                                        yVelocity2 = 0.0f;
                                    }
                                    if (bVar2.k != 0.0f) {
                                        f7 = xVelocity2 / fArr[0];
                                    } else {
                                        f7 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.z = f7;
                                } else {
                                    motionLayout.z = 0.0f;
                                }
                                bVar2.p = motionEvent.getRawX();
                                bVar2.q = motionEvent.getRawY();
                            }
                        }
                    }
                }
                aVar2.r = motionEvent.getRawX();
                aVar2.s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    velocityTracker = fVar.a;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        fVar2 = null;
                        fVar.a = null;
                    } else {
                        fVar2 = null;
                    }
                    aVar2.o = fVar2;
                    i2 = this.B;
                    if (i2 != -1) {
                        aVar2.a(i2, this);
                    }
                }
            }
        } else if (!aVar2.m) {
            bVar = aVar2.c;
            if (bVar != null && (bVar2 = bVar.l) != null && !aVar2.n) {
                fVar3 = aVar2.o;
                z = bVar2.j;
                iVar = i.h;
                fArr = bVar2.n;
                motionLayout = bVar2.r;
                if (z) {
                    velocityTracker9 = fVar3.a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        iArr = bVar2.o;
                        if (action2 == 1) {
                            bVar2.m = false;
                            velocityTracker10 = fVar3.a;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(16);
                            }
                            velocityTracker11 = fVar3.a;
                            if (velocityTracker11 != null) {
                                xVelocity3 = velocityTracker11.getXVelocity();
                            } else {
                                xVelocity3 = 0.0f;
                            }
                            velocityTracker12 = fVar3.a;
                            if (velocityTracker12 != null) {
                                yVelocity3 = velocityTracker12.getYVelocity();
                            } else {
                                yVelocity3 = 0.0f;
                            }
                            progress4 = motionLayout.getProgress();
                            float width4 = motionLayout.getWidth() / 2.0f;
                            float height4 = motionLayout.getHeight() / 2.0f;
                            i6 = bVar2.i;
                            if (i6 != -1) {
                                View viewFindViewById8 = motionLayout.findViewById(i6);
                                motionLayout.getLocationOnScreen(iArr);
                                right = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f8 = iArr[1];
                                top = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i7 = bVar2.d;
                                if (i7 != -1) {
                                    View viewFindViewById9 = motionLayout.findViewById(motionLayout.G.get(motionLayout.findViewById(i7)).f.o);
                                    motionLayout.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f8 = iArr[1];
                                    top = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width4;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i8 = bVar2.d;
                                    if (i8 != -1) {
                                        bVar2.r.w(i8, progress4, bVar2.h, bVar2.g, bVar2.n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY8, xVelocity3 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f9 = (((degrees * 3.0f) * bVar2.v) / fArr[1]) + progress4;
                                    } else {
                                        f9 = progress4;
                                    }
                                    if (f9 == 0.0f && f9 != 1.0f && (i9 = bVar2.c) != 3) {
                                        float fAbs2 = (degrees * bVar2.v) / fArr[1];
                                        float f20 = ((double) f9) < 0.5d ? 0.0f : 1.0f;
                                        if (i9 == 6) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f20 = 1.0f;
                                        }
                                        if (bVar2.c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f20 = 0.0f;
                                        }
                                        motionLayout.E(f20, fAbs2 * 3.0f, bVar2.c);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            motionLayout.setState(iVar);
                                        }
                                    } else if (0.0f < f9 || 1.0f <= f9) {
                                        motionLayout.setState(iVar);
                                    }
                                }
                            }
                            float f111 = right;
                            height4 = ((bottom + top) / 2.0f) + f8;
                            width4 = f111;
                            float rawX9 = motionEvent.getRawX() - width4;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i8 = bVar2.d;
                            if (i8 != -1) {
                                bVar2.r.w(i8, progress4, bVar2.h, bVar2.g, bVar2.n);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY9, xVelocity3 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f9 = (((degrees * 3.0f) * bVar2.v) / fArr[1]) + progress4;
                            } else {
                                f9 = progress4;
                            }
                            if (f9 == 0.0f) {
                                if (0.0f < f9) {
                                    motionLayout.setState(iVar);
                                } else {
                                    motionLayout.setState(iVar);
                                }
                            } else if (0.0f < f9) {
                                motionLayout.setState(iVar);
                            } else {
                                motionLayout.setState(iVar);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width = motionLayout.getWidth() / 2.0f;
                            height = motionLayout.getHeight() / 2.0f;
                            i10 = bVar2.i;
                            if (i10 != -1) {
                                View viewFindViewById10 = motionLayout.findViewById(i10);
                                motionLayout.getLocationOnScreen(iArr);
                                float right4 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                height = ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f) + iArr[1];
                                width = right4;
                            } else {
                                i11 = bVar2.d;
                                if (i11 != -1) {
                                    viewFindViewById = motionLayout.findViewById(motionLayout.G.get(motionLayout.findViewById(i11)).f.o);
                                    if (viewFindViewById == null) {
                                        b0.c("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                    }
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(bVar2.q - height, bVar2.p - width)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            if (Math.abs(fAtan2) <= 0.01d || bVar2.m) {
                                progress5 = motionLayout.getProgress();
                                if (bVar2.m) {
                                    z3 = true;
                                    bVar2.m = true;
                                    motionLayout.setProgress(progress5);
                                } else {
                                    z3 = true;
                                }
                                i12 = bVar2.d;
                                if (i12 != -1) {
                                    boolean z13 = z3;
                                    f10 = progress5;
                                    bVar2.r.w(i12, f10, bVar2.h, bVar2.g, bVar2.n);
                                    fArr[z13 ? 1 : 0] = (float) Math.toDegrees(fArr[z13 ? 1 : 0]);
                                    r20 = z13;
                                } else {
                                    f10 = progress5;
                                    boolean z14 = z3;
                                    fArr[z14 ? 1 : 0] = 360.0f;
                                    r20 = z14;
                                }
                                fMax2 = Math.max(Math.min(((bVar2.v * fAtan2) / fArr[r20]) + f10, 1.0f), 0.0f);
                                progress6 = motionLayout.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        if (progress6 == 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        motionLayout.s(z4);
                                    }
                                    motionLayout.setProgress(fMax2);
                                    velocityTracker13 = fVar3.a;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                    }
                                    velocityTracker14 = fVar3.a;
                                    if (velocityTracker14 != null) {
                                        xVelocity4 = velocityTracker14.getXVelocity();
                                    } else {
                                        xVelocity4 = 0.0f;
                                    }
                                    velocityTracker15 = fVar3.a;
                                    if (velocityTracker15 != null) {
                                        yVelocity4 = velocityTracker15.getYVelocity();
                                    } else {
                                        yVelocity4 = 0.0f;
                                    }
                                    double d10 = yVelocity4;
                                    double d11 = xVelocity4;
                                    motionLayout.z = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d10, d11) - dAtan2) * Math.hypot(d10, d11)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    motionLayout.z = 0.0f;
                                }
                                bVar2.p = motionEvent.getRawX();
                                bVar2.q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        bVar2.p = motionEvent.getRawX();
                        bVar2.q = motionEvent.getRawY();
                        bVar2.m = false;
                    }
                } else {
                    velocityTracker2 = fVar3.a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    action = motionEvent.getAction();
                    if (action == 0) {
                        bVar2.p = motionEvent.getRawX();
                        bVar2.q = motionEvent.getRawY();
                        bVar2.m = false;
                    } else if (action == 1) {
                        bVar2.m = false;
                        velocityTracker3 = fVar3.a;
                        if (velocityTracker3 != null) {
                            velocityTracker3.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                        }
                        velocityTracker4 = fVar3.a;
                        if (velocityTracker4 != null) {
                            xVelocity = velocityTracker4.getXVelocity();
                        } else {
                            xVelocity = 0.0f;
                        }
                        velocityTracker5 = fVar3.a;
                        if (velocityTracker5 != null) {
                            yVelocity = velocityTracker5.getYVelocity();
                        } else {
                            yVelocity = 0.0f;
                        }
                        progress = motionLayout.getProgress();
                        i3 = bVar2.d;
                        if (i3 != -1) {
                            bVar2.r.w(i3, progress, bVar2.h, bVar2.g, bVar2.n);
                            c2 = 1;
                            c3 = 0;
                        } else {
                            float fMin7 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                            c2 = 1;
                            fArr[1] = bVar2.l * fMin7;
                            c3 = 0;
                            fArr[0] = fMin7 * bVar2.k;
                        }
                        f2 = bVar2.k;
                        f3 = fArr[c3];
                        f4 = fArr[c2];
                        if (f2 != 0.0f) {
                            fAbs = xVelocity / f3;
                        } else {
                            fAbs = yVelocity / f4;
                        }
                        if (Float.isNaN(fAbs)) {
                            f5 = (fAbs / 3.0f) + progress;
                        } else {
                            f5 = progress;
                        }
                        if (f5 == 0.0f && f5 != 1.0f && (i4 = bVar2.c) != 3) {
                            float f21 = ((double) f5) < 0.5d ? 0.0f : 1.0f;
                            if (i4 == 6) {
                                if (progress + fAbs < 0.0f) {
                                    fAbs = Math.abs(fAbs);
                                }
                                f21 = 1.0f;
                            }
                            if (bVar2.c == 7) {
                                if (progress + fAbs > 1.0f) {
                                    fAbs = -Math.abs(fAbs);
                                }
                                f21 = 0.0f;
                            }
                            motionLayout.E(f21, fAbs, bVar2.c);
                            if (0.0f >= progress || 1.0f <= progress) {
                                motionLayout.setState(iVar);
                            }
                        } else if (0.0f < f5 || 1.0f <= f5) {
                            motionLayout.setState(iVar);
                        }
                    } else if (action == 2) {
                        rawY = motionEvent.getRawY() - bVar2.q;
                        rawX = motionEvent.getRawX() - bVar2.p;
                        if (Math.abs((bVar2.l * rawY) + (bVar2.k * rawX)) <= bVar2.x || bVar2.m) {
                            progress2 = motionLayout.getProgress();
                            if (!bVar2.m) {
                                bVar2.m = true;
                                motionLayout.setProgress(progress2);
                            }
                            i5 = bVar2.d;
                            if (i5 != -1) {
                                bVar2.r.w(i5, progress2, bVar2.h, bVar2.g, bVar2.n);
                                c4 = 1;
                                c5 = 0;
                            } else {
                                float fMin8 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c4 = 1;
                                fArr[1] = bVar2.l * fMin8;
                                c5 = 0;
                                fArr[0] = fMin8 * bVar2.k;
                            }
                            if (Math.abs(((bVar2.l * fArr[c4]) + (bVar2.k * fArr[c5])) * bVar2.v) < 0.01d) {
                                fArr[0] = 0.01f;
                                fArr[c4] = 0.01f;
                            }
                            if (bVar2.k != 0.0f) {
                                f6 = rawX / fArr[0];
                            } else {
                                f6 = rawY / fArr[c4];
                            }
                            fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                            if (bVar2.c == 6) {
                                fMax = Math.max(fMax, 0.01f);
                            }
                            if (bVar2.c == 7) {
                                fMax = Math.min(fMax, 0.99f);
                            }
                            progress3 = motionLayout.getProgress();
                            if (fMax != progress3) {
                                if (progress3 != 0.0f || progress3 == 1.0f) {
                                    if (progress3 == 0.0f) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    motionLayout.s(z2);
                                }
                                motionLayout.setProgress(fMax);
                                velocityTracker6 = fVar3.a;
                                if (velocityTracker6 != null) {
                                    velocityTracker6.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                                }
                                velocityTracker7 = fVar3.a;
                                if (velocityTracker7 != null) {
                                    xVelocity2 = velocityTracker7.getXVelocity();
                                } else {
                                    xVelocity2 = 0.0f;
                                }
                                velocityTracker8 = fVar3.a;
                                if (velocityTracker8 != null) {
                                    yVelocity2 = velocityTracker8.getYVelocity();
                                } else {
                                    yVelocity2 = 0.0f;
                                }
                                if (bVar2.k != 0.0f) {
                                    f7 = xVelocity2 / fArr[0];
                                } else {
                                    f7 = yVelocity2 / fArr[1];
                                }
                                motionLayout.z = f7;
                            } else {
                                motionLayout.z = 0.0f;
                            }
                            bVar2.p = motionEvent.getRawX();
                            bVar2.q = motionEvent.getRawY();
                        }
                    }
                }
            }
            aVar2.r = motionEvent.getRawX();
            aVar2.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (fVar = aVar2.o) != null) {
                velocityTracker = fVar.a;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    fVar2 = null;
                    fVar.a = null;
                } else {
                    fVar2 = null;
                }
                aVar2.o = fVar2;
                i2 = this.B;
                if (i2 != -1) {
                    aVar2.a(i2, this);
                }
            }
        }
        androidx.constraintlayout.motion.widget.a.b bVar12 = this.w.c;
        if ((bVar12.r & 4) != 0) {
            return bVar12.l.m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C5424n11) {
            C5424n11 c5424n11 = (C5424n11) view;
            if (this.j0 == null) {
                this.j0 = new CopyOnWriteArrayList<>();
            }
            this.j0.add(c5424n11);
            if (c5424n11.m) {
                if (this.h0 == null) {
                    this.h0 = new ArrayList<>();
                }
                this.h0.add(c5424n11);
            }
            if (c5424n11.n) {
                if (this.i0 == null) {
                    this.i0 = new ArrayList<>();
                }
                this.i0.add(c5424n11);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C5424n11> arrayList = this.h0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C5424n11> arrayList2 = this.i0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void r(float f2) {
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        float f3 = this.K;
        float f4 = this.J;
        if (f3 != f4 && this.N) {
            this.K = f4;
        }
        float f5 = this.K;
        if (f5 == f2) {
            return;
        }
        this.S = false;
        this.M = f2;
        androidx.constraintlayout.motion.widget.a.b bVar = aVar.c;
        this.I = (bVar != null ? bVar.h : aVar.j) / 1000.0f;
        setProgress(f2);
        this.x = null;
        this.y = this.w.d();
        this.N = false;
        this.H = getNanoTime();
        this.O = true;
        this.J = f5;
        this.K = f5;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        androidx.constraintlayout.motion.widget.a.b bVar;
        if (!this.p0 && this.B == -1 && (aVar = this.w) != null && (bVar = aVar.c) != null) {
            int i2 = bVar.q;
            if (i2 == 0) {
                return;
            }
            if (i2 == 2) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.G.get(getChildAt(i3)).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C5214m11 c5214m11 = this.G.get(getChildAt(i2));
            if (c5214m11 != null && "button".equals(ZT.d(c5214m11.b)) && c5214m11.A != null) {
                int i3 = 0;
                while (true) {
                    C6748tK0[] c6748tK0Arr = c5214m11.A;
                    if (i3 < c6748tK0Arr.length) {
                        c6748tK0Arr[i3].g(c5214m11.b, z ? -100.0f : 100.0f);
                        i3++;
                    }
                }
            }
        }
    }

    public void setDebugMode(int i2) {
        this.Q = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.C0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.F = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.w != null) {
            setState(i.g);
            Interpolator interpolatorD = this.w.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<C5424n11> arrayList = this.i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.i0.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<C5424n11> arrayList = this.h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.h0.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            b0.e("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.z0 == null) {
                this.z0 = new g();
            }
            this.z0.a = f2;
            return;
        }
        i iVar = i.h;
        i iVar2 = i.g;
        if (f2 <= 0.0f) {
            if (this.K == 1.0f && this.B == this.C) {
                setState(iVar2);
            }
            this.B = this.A;
            if (this.K == 0.0f) {
                setState(iVar);
            }
        } else if (f2 >= 1.0f) {
            if (this.K == 0.0f && this.B == this.A) {
                setState(iVar2);
            }
            this.B = this.C;
            if (this.K == 1.0f) {
                setState(iVar);
            }
        } else {
            this.B = -1;
            setState(iVar2);
        }
        if (this.w == null) {
            return;
        }
        this.N = true;
        this.M = f2;
        this.J = f2;
        this.L = -1L;
        this.H = -1L;
        this.x = null;
        this.O = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        androidx.constraintlayout.motion.widget.b bVar;
        this.w = aVar;
        boolean zF = f();
        aVar.p = zF;
        androidx.constraintlayout.motion.widget.a.b bVar2 = aVar.c;
        if (bVar2 != null && (bVar = bVar2.l) != null) {
            bVar.c(zF);
        }
        A();
    }

    public void setStartState(int i2) {
        if (super.isAttachedToWindow()) {
            this.B = i2;
            return;
        }
        if (this.z0 == null) {
            this.z0 = new g();
        }
        g gVar = this.z0;
        gVar.c = i2;
        gVar.d = i2;
    }

    public void setState(i iVar) {
        i iVar2 = i.h;
        if (iVar == iVar2 && this.B == -1) {
            return;
        }
        i iVar3 = this.D0;
        this.D0 = iVar;
        i iVar4 = i.g;
        if (iVar3 == iVar4 && iVar == iVar4) {
            u();
        }
        int iOrdinal = iVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && iVar == iVar2) {
                v();
                return;
            }
            return;
        }
        if (iVar == iVar4) {
            u();
        }
        if (iVar == iVar2) {
            v();
        }
    }

    public void setTransition(int i2) {
        androidx.constraintlayout.motion.widget.a.b next;
        float f2;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar != null) {
            Iterator<androidx.constraintlayout.motion.widget.a.b> it = aVar.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.a != i2);
            this.A = next.d;
            this.C = next.c;
            if (!super.isAttachedToWindow()) {
                if (this.z0 == null) {
                    this.z0 = new g();
                }
                g gVar = this.z0;
                gVar.c = this.A;
                gVar.d = this.C;
                return;
            }
            int i3 = this.B;
            if (i3 == this.A) {
                f2 = 0.0f;
            } else {
                f2 = i3 == this.C ? 1.0f : Float.NaN;
            }
            androidx.constraintlayout.motion.widget.a aVar2 = this.w;
            aVar2.c = next;
            androidx.constraintlayout.motion.widget.b bVar = next.l;
            if (bVar != null) {
                bVar.c(aVar2.p);
            }
            this.E0.e(this.w.b(this.A), this.w.b(this.C));
            A();
            if (this.K != f2) {
                if (f2 == 0.0f) {
                    s(true);
                    this.w.b(this.A).b(this);
                } else if (f2 == 1.0f) {
                    s(false);
                    this.w.b(this.C).b(this);
                }
            }
            this.K = Float.isNaN(f2) ? 0.0f : f2;
            if (!Float.isNaN(f2)) {
                setProgress(f2);
            } else {
                ZT.b();
                G();
            }
        }
    }

    public void setTransitionDuration(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null) {
            b0.c("MotionLayout", "MotionScene not defined");
            return;
        }
        androidx.constraintlayout.motion.widget.a.b bVar = aVar.c;
        if (bVar != null) {
            bVar.h = Math.max(i2, 8);
        } else {
            aVar.j = i2;
        }
    }

    public void setTransitionListener(h hVar) {
        this.P = hVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.z0 == null) {
            this.z0 = new g();
        }
        g gVar = this.z0;
        gVar.getClass();
        gVar.a = bundle.getFloat("motion.progress");
        gVar.b = bundle.getFloat("motion.velocity");
        gVar.c = bundle.getInt("motion.StartState");
        gVar.d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.z0.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0178  */
    /* JADX WARN: Code duplicated, block: B:102:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x0214  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:49:0x00ae, B:60:0x00d4, B:62:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    public final void t(boolean z) {
        boolean z2;
        char c2;
        i iVar;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        View childAt;
        C5214m11 c5214m11;
        boolean z3;
        if (this.L == -1) {
            this.L = getNanoTime();
        }
        float f3 = this.K;
        float f4 = 0.0f;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.B = -1;
        }
        boolean z4 = false;
        if (this.g0 || (this.O && (z || this.M != f3))) {
            float fSignum = Math.signum(this.M - f3);
            long nanoTime2 = getNanoTime();
            AbstractInterpolatorC5634o11 abstractInterpolatorC5634o11 = this.x;
            float f5 = abstractInterpolatorC5634o11 == null ? (((nanoTime2 - this.L) * fSignum) * 1.0E-9f) / this.I : 0.0f;
            float f6 = this.K + f5;
            if (this.N) {
                f6 = this.M;
            }
            if ((fSignum <= 0.0f || f6 < this.M) && (fSignum > 0.0f || f6 > this.M)) {
                z2 = false;
            } else {
                f6 = this.M;
                this.O = false;
                z2 = true;
            }
            this.K = f6;
            this.J = f6;
            this.L = nanoTime2;
            if (abstractInterpolatorC5634o11 == null || z2) {
                this.z = f5;
            } else {
                if (this.S) {
                    float interpolation2 = abstractInterpolatorC5634o11.getInterpolation((nanoTime2 - this.H) * 1.0E-9f);
                    AbstractInterpolatorC5634o11 abstractInterpolatorC5634o12 = this.x;
                    GQ1 gq1 = this.T;
                    if (abstractInterpolatorC5634o12 == gq1) {
                        c2 = gq1.c.a() ? (char) 2 : (char) 1;
                    } else {
                        c2 = 0;
                    }
                    this.K = interpolation2;
                    this.L = nanoTime2;
                    AbstractInterpolatorC5634o11 abstractInterpolatorC5634o13 = this.x;
                    if (abstractInterpolatorC5634o13 != null) {
                        float fA = abstractInterpolatorC5634o13.a();
                        this.z = fA;
                        if (Math.abs(fA) * this.I <= 1.0E-5f && c2 == 2) {
                            this.O = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.K = 1.0f;
                            this.O = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f6 = interpolation2;
                        } else {
                            this.K = 0.0f;
                            this.O = false;
                            f6 = 0.0f;
                        }
                    } else {
                        f6 = interpolation2;
                    }
                } else {
                    float interpolation3 = abstractInterpolatorC5634o11.getInterpolation(f6);
                    AbstractInterpolatorC5634o11 abstractInterpolatorC5634o14 = this.x;
                    if (abstractInterpolatorC5634o14 != null) {
                        this.z = abstractInterpolatorC5634o14.a();
                    } else {
                        this.z = ((abstractInterpolatorC5634o14.getInterpolation(f6 + f5) - interpolation3) * fSignum) / f5;
                    }
                    f6 = interpolation3;
                }
                if (Math.abs(this.z) > 1.0E-5f) {
                    setState(i.g);
                }
                iVar = i.h;
                if (c2 != 1) {
                    if ((fSignum <= 0.0f && f6 >= this.M) || (fSignum <= 0.0f && f6 <= this.M)) {
                        f6 = this.M;
                        this.O = false;
                    }
                    if (f6 < 1.0f || f6 <= 0.0f) {
                        this.O = false;
                        setState(iVar);
                    }
                }
                childCount = getChildCount();
                this.g0 = false;
                nanoTime = getNanoTime();
                this.w0 = f6;
                interpolator = this.y;
                if (interpolator == null) {
                    interpolation = f6;
                } else {
                    interpolation = interpolator.getInterpolation(f6);
                }
                interpolator2 = this.y;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.I) + f6);
                    this.z = interpolation4;
                    this.z = interpolation4 - this.y.getInterpolation(f6);
                }
                i2 = 0;
                while (i2 < childCount) {
                    childAt = getChildAt(i2);
                    c5214m11 = this.G.get(childAt);
                    if (c5214m11 != null) {
                        this.g0 = c5214m11.d(interpolation, nanoTime, this.x0, childAt) | this.g0;
                    }
                    i2++;
                    f4 = f4;
                }
                f2 = f4;
                boolean z5 = (fSignum <= 0.0f && f6 >= this.M) || (fSignum <= f2 && f6 <= this.M);
                if (!this.g0 && !this.O && z5) {
                    setState(iVar);
                }
                if (this.p0) {
                    requestLayout();
                }
                this.g0 = (!z5) | this.g0;
                if (f6 <= f2 && (i5 = this.A) != -1 && this.B != i5) {
                    this.B = i5;
                    this.w.b(i5).a(this);
                    setState(iVar);
                    z4 = true;
                }
                if (f6 >= 1.0d) {
                    i3 = this.B;
                    i4 = this.C;
                    if (i3 != i4) {
                        this.B = i4;
                        this.w.b(i4).a(this);
                        setState(iVar);
                        z4 = true;
                    }
                }
                if (!this.g0 || this.O) {
                    invalidate();
                } else if ((fSignum > 0.0f && f6 == 1.0f) || (fSignum < f2 && f6 == f2)) {
                    setState(iVar);
                }
                if (!this.g0 && !this.O && ((fSignum > 0.0f && f6 == 1.0f) || (fSignum < f2 && f6 == f2))) {
                    y();
                }
            }
            c2 = 0;
            if (Math.abs(this.z) > 1.0E-5f) {
                setState(i.g);
            }
            iVar = i.h;
            if (c2 != 1) {
                if (fSignum <= 0.0f) {
                    f6 = this.M;
                    this.O = false;
                } else {
                    f6 = this.M;
                    this.O = false;
                }
                if (f6 < 1.0f) {
                    this.O = false;
                    setState(iVar);
                } else {
                    this.O = false;
                    setState(iVar);
                }
            }
            childCount = getChildCount();
            this.g0 = false;
            nanoTime = getNanoTime();
            this.w0 = f6;
            interpolator = this.y;
            if (interpolator == null) {
                interpolation = f6;
            } else {
                interpolation = interpolator.getInterpolation(f6);
            }
            interpolator2 = this.y;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.I) + f6);
                this.z = interpolation5;
                this.z = interpolation5 - this.y.getInterpolation(f6);
            }
            i2 = 0;
            while (i2 < childCount) {
                childAt = getChildAt(i2);
                c5214m11 = this.G.get(childAt);
                if (c5214m11 != null) {
                    this.g0 = c5214m11.d(interpolation, nanoTime, this.x0, childAt) | this.g0;
                }
                i2++;
                f4 = f4;
            }
            f2 = f4;
            if (fSignum <= 0.0f) {
            }
            if (!this.g0) {
                setState(iVar);
            }
            if (this.p0) {
                requestLayout();
            }
            this.g0 = (!z5) | this.g0;
            if (f6 <= f2) {
                this.B = i5;
                this.w.b(i5).a(this);
                setState(iVar);
                z4 = true;
            }
            if (f6 >= 1.0d) {
                i3 = this.B;
                i4 = this.C;
                if (i3 != i4) {
                    this.B = i4;
                    this.w.b(i4).a(this);
                    setState(iVar);
                    z4 = true;
                }
            }
            if (this.g0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.g0) {
                y();
            }
        } else {
            f2 = 0.0f;
        }
        float f7 = this.K;
        if (f7 < 1.0f) {
            if (f7 <= f2) {
                int i6 = this.B;
                int i7 = this.A;
                z3 = i6 == i7 ? z4 : true;
                this.B = i7;
            }
            this.F0 |= z4;
            if (z4 && !this.y0) {
                requestLayout();
            }
            this.J = this.K;
        }
        int i8 = this.B;
        int i9 = this.C;
        z3 = i8 == i9 ? z4 : true;
        this.B = i9;
        z4 = z3;
        this.F0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.J = this.K;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return ZT.c(context, this.A) + "->" + ZT.c(context, this.C) + " (pos:" + this.K + " Dpos/Dt:" + this.z;
    }

    public final void u() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        CopyOnWriteArrayList<h> copyOnWriteArrayList2;
        if ((this.P == null && ((copyOnWriteArrayList2 = this.j0) == null || copyOnWriteArrayList2.isEmpty())) || this.o0 == this.J) {
            return;
        }
        if (this.n0 != -1 && (copyOnWriteArrayList = this.j0) != null) {
            Iterator<h> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.n0 = -1;
        this.o0 = this.J;
        CopyOnWriteArrayList<h> copyOnWriteArrayList3 = this.j0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<h> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public final void v() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.P != null || ((copyOnWriteArrayList = this.j0) != null && !copyOnWriteArrayList.isEmpty())) && this.n0 == -1) {
            this.n0 = this.B;
            ArrayList<Integer> arrayList = this.J0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) C1742Pc.c(1, arrayList)).intValue() : -1;
            int i2 = this.B;
            if (iIntValue != i2 && i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        z();
        RunnableC4584j20 runnableC4584j20 = this.A0;
        if (runnableC4584j20 != null) {
            runnableC4584j20.run();
        }
    }

    public final void w(int i2, float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        View viewC = c(i2);
        C5214m11 c5214m11 = this.G.get(viewC);
        if (c5214m11 == null) {
            b0.e("MotionLayout", "WARNING could not find view id " + (viewC == null ? EK.e(i2, "") : viewC.getContext().getResources().getResourceName(i2)));
            return;
        }
        float[] fArr2 = c5214m11.v;
        float fA = c5214m11.a(f2, fArr2);
        AbstractC4198hR[] abstractC4198hRArr = c5214m11.j;
        int i3 = 0;
        if (abstractC4198hRArr != null) {
            double d2 = fA;
            abstractC4198hRArr[0].e(d2, c5214m11.q);
            c5214m11.j[0].c(d2, c5214m11.p);
            float f5 = fArr2[0];
            while (true) {
                dArr = c5214m11.q;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] * ((double) f5);
                i3++;
            }
            C3422dj c3422dj = c5214m11.k;
            if (c3422dj != null) {
                double[] dArr2 = c5214m11.p;
                if (dArr2.length > 0) {
                    c3422dj.c(d2, dArr2);
                    c5214m11.k.e(d2, c5214m11.q);
                    int[] iArr = c5214m11.o;
                    double[] dArr3 = c5214m11.q;
                    double[] dArr4 = c5214m11.p;
                    c5214m11.f.getClass();
                    C6473s11.k(f3, f4, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = c5214m11.o;
                double[] dArr5 = c5214m11.p;
                c5214m11.f.getClass();
                C6473s11.k(f3, f4, fArr, iArr2, dArr, dArr5);
            }
        } else {
            C6473s11 c6473s11 = c5214m11.g;
            float f6 = c6473s11.i;
            C6473s11 c6473s12 = c5214m11.f;
            float f7 = f6 - c6473s12.i;
            float f8 = c6473s11.j - c6473s12.j;
            float f9 = c6473s11.k - c6473s12.k;
            float f10 = (c6473s11.l - c6473s12.l) + f8;
            fArr[0] = ((f9 + f7) * f3) + ((1.0f - f3) * f7);
            fArr[1] = (f10 * f4) + ((1.0f - f4) * f8);
        }
        viewC.getY();
    }

    public final boolean x(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (x((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f3) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            RectF rectF = this.G0;
            rectF.set(f2, f3, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f3) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f4 = -f2;
                float f5 = -f3;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f4, f5);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f4, -f5);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f4, f5);
                    if (this.I0 == null) {
                        this.I0 = new Matrix();
                    }
                    matrix.invert(this.I0);
                    motionEventObtain.transform(this.I0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void y() {
        androidx.constraintlayout.motion.widget.a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        View viewFindViewById;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        if (aVar.a(this.B, this)) {
            requestLayout();
            return;
        }
        int i2 = this.B;
        if (i2 != -1) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.w;
            ArrayList<androidx.constraintlayout.motion.widget.a.b> arrayList = aVar2.d;
            for (androidx.constraintlayout.motion.widget.a.b bVar3 : arrayList) {
                if (bVar3.m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0224a> it = bVar3.m.iterator();
                    while (it.hasNext()) {
                        it.next().b(this);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.a.b> arrayList2 = aVar2.f;
            for (androidx.constraintlayout.motion.widget.a.b bVar4 : arrayList2) {
                if (bVar4.m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0224a> it2 = bVar4.m.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.a.b bVar5 : arrayList) {
                if (bVar5.m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0224a> it3 = bVar5.m.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(this, i2, bVar5);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.a.b bVar6 : arrayList2) {
                if (bVar6.m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0224a> it4 = bVar6.m.iterator();
                    while (it4.hasNext()) {
                        it4.next().a(this, i2, bVar6);
                    }
                }
            }
        }
        if (!this.w.o() || (bVar = this.w.c) == null || (bVar2 = bVar.l) == null) {
            return;
        }
        int i3 = bVar2.d;
        if (i3 != -1) {
            MotionLayout motionLayout = bVar2.r;
            viewFindViewById = motionLayout.findViewById(i3);
            if (viewFindViewById == null) {
                b0.c("TouchResponse", "cannot find TouchAnchorId @id/" + ZT.c(motionLayout.getContext(), bVar2.d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new D02());
            nestedScrollView.setOnScrollChangeListener(new E02());
        }
    }

    public final void z() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if (this.P == null && ((copyOnWriteArrayList = this.j0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.J0;
        for (Integer num : arrayList) {
            h hVar = this.P;
            if (hVar != null) {
                num.getClass();
                hVar.a();
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.j0;
            if (copyOnWriteArrayList2 != null) {
                for (h hVar2 : copyOnWriteArrayList2) {
                    num.getClass();
                    hVar2.a();
                }
            }
        }
        arrayList.clear();
    }

    public void setTransition(androidx.constraintlayout.motion.widget.a.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.w;
        aVar.c = bVar;
        if (bVar != null && (bVar2 = bVar.l) != null) {
            bVar2.c(aVar.p);
        }
        setState(i.e);
        int i2 = this.B;
        androidx.constraintlayout.motion.widget.a.b bVar3 = this.w.c;
        if (i2 == (bVar3 == null ? -1 : bVar3.c)) {
            this.K = 1.0f;
            this.J = 1.0f;
            this.M = 1.0f;
        } else {
            this.K = 0.0f;
            this.J = 0.0f;
            this.M = 0.0f;
        }
        this.L = (bVar.r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.w.g();
        androidx.constraintlayout.motion.widget.a aVar2 = this.w;
        androidx.constraintlayout.motion.widget.a.b bVar4 = aVar2.c;
        int i3 = bVar4 != null ? bVar4.c : -1;
        if (iG == this.A && i3 == this.C) {
            return;
        }
        this.A = iG;
        this.C = i3;
        aVar2.n(iG, i3);
        androidx.constraintlayout.widget.c cVarB = this.w.b(this.A);
        androidx.constraintlayout.widget.c cVarB2 = this.w.b(this.C);
        e eVar = this.E0;
        eVar.e(cVarB, cVarB2);
        int i4 = this.A;
        int i5 = this.C;
        eVar.e = i4;
        eVar.f = i5;
        eVar.f();
        A();
    }
}
