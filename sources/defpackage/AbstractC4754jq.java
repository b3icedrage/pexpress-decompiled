package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import defpackage.AbstractC5174lq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RtlHardcoded"})
public abstract class AbstractC4754jq<T extends AbstractC5174lq<? extends InterfaceC3035bs0<? extends C3506e70>>> extends AbstractC7347wA<T> implements InterfaceC5387mq {
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Paint S;
    public Paint T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float a0;
    public boolean b0;
    public Kl2 c0;
    public Kl2 d0;
    public Ll2 e0;
    public Ll2 f0;
    public B42 g0;
    public B42 h0;
    public Il2 i0;
    public RectF j0;
    public Matrix k0;
    public boolean l0;
    public C3581eV0 m0;
    public C3581eV0 n0;
    public float[] o0;

    public AbstractC4754jq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = 100;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = false;
        this.V = false;
        this.W = false;
        this.a0 = 15.0f;
        this.b0 = false;
        this.j0 = new RectF();
        this.k0 = new Matrix();
        new Matrix();
        this.l0 = false;
        this.m0 = C3581eV0.b(0.0d, 0.0d);
        this.n0 = C3581eV0.b(0.0d, 0.0d);
        this.o0 = new float[2];
    }

    @Override // defpackage.AbstractC7347wA
    public void a() {
        if (!this.l0) {
            RectF rectF = this.j0;
            rectF.left = 0.0f;
            rectF.right = 0.0f;
            rectF.top = 0.0f;
            rectF.bottom = 0.0f;
            C4871kP0 c4871kP0 = this.p;
            if (c4871kP0 != null && c4871kP0.a) {
                int iOrdinal = c4871kP0.i.ordinal();
                if (iOrdinal == 0) {
                    int iOrdinal2 = this.p.h.ordinal();
                    if (iOrdinal2 == 0) {
                        float f = rectF.top;
                        C4871kP0 c4871kP1 = this.p;
                        rectF.top = Math.min(c4871kP1.s, this.w.d * c4871kP1.q) + this.p.c + f;
                    } else if (iOrdinal2 == 2) {
                        float f2 = rectF.bottom;
                        C4871kP0 c4871kP2 = this.p;
                        rectF.bottom = Math.min(c4871kP2.s, this.w.d * c4871kP2.q) + this.p.c + f2;
                    }
                } else if (iOrdinal == 1) {
                    int iOrdinal3 = this.p.g.ordinal();
                    if (iOrdinal3 == 0) {
                        float f3 = rectF.left;
                        C4871kP0 c4871kP3 = this.p;
                        rectF.left = Math.min(c4871kP3.r, this.w.c * c4871kP3.q) + this.p.b + f3;
                    } else if (iOrdinal3 == 1) {
                        int iOrdinal4 = this.p.h.ordinal();
                        if (iOrdinal4 == 0) {
                            float f4 = rectF.top;
                            C4871kP0 c4871kP4 = this.p;
                            rectF.top = Math.min(c4871kP4.s, this.w.d * c4871kP4.q) + this.p.c + f4;
                        } else if (iOrdinal4 == 2) {
                            float f5 = rectF.bottom;
                            C4871kP0 c4871kP5 = this.p;
                            rectF.bottom = Math.min(c4871kP5.s, this.w.d * c4871kP5.q) + this.p.c + f5;
                        }
                    } else if (iOrdinal3 == 2) {
                        float f6 = rectF.right;
                        C4871kP0 c4871kP6 = this.p;
                        rectF.right = Math.min(c4871kP6.r, this.w.c * c4871kP6.q) + this.p.b + f6;
                    }
                }
            }
            float fE = rectF.left + 0.0f;
            float f7 = rectF.top + 0.0f;
            float fE2 = rectF.right + 0.0f;
            float f8 = rectF.bottom + 0.0f;
            Kl2 kl2 = this.c0;
            boolean z = kl2.a;
            Kl2.b bVar = Kl2.b.d;
            if (z && kl2.q && kl2.E == bVar) {
                fE += kl2.e(this.e0.f);
            }
            Kl2 kl3 = this.d0;
            if (kl3.a && kl3.q && kl3.E == bVar) {
                fE2 += kl3.e(this.f0.f);
            }
            Hl2 hl2 = this.m;
            if (hl2.a && hl2.q) {
                float f9 = hl2.A + hl2.c;
                Hl2.a aVar = hl2.B;
                if (aVar == Hl2.a.e) {
                    f8 += f9;
                } else if (aVar == Hl2.a.d) {
                    f7 += f9;
                } else if (aVar == Hl2.a.g) {
                    f8 += f9;
                    f7 += f9;
                }
            }
            float extraTopOffset = getExtraTopOffset() + f7;
            float extraRightOffset = getExtraRightOffset() + fE2;
            float extraBottomOffset = getExtraBottomOffset() + f8;
            float extraLeftOffset = getExtraLeftOffset() + fE;
            float fC = AbstractC8067zc2.c(this.a0);
            C4454ie2 c4454ie2 = this.w;
            c4454ie2.b.set(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), c4454ie2.c - Math.max(fC, extraRightOffset), c4454ie2.d - Math.max(fC, extraBottomOffset));
            if (this.d) {
                this.w.b.toString();
            }
        }
        B42 b42 = this.h0;
        this.d0.getClass();
        b42.g();
        B42 b43 = this.g0;
        this.c0.getClass();
        b43.g();
        k();
    }

    @Override // android.view.View
    public final void computeScroll() {
        PA pa = this.q;
        if (pa instanceof C4964kq) {
            C4964kq c4964kq = (C4964kq) pa;
            C3791fV0 c3791fV0 = c4964kq.u;
            if (c3791fV0.e == 0.0f && c3791fV0.g == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = c3791fV0.e;
            AbstractC4754jq abstractC4754jq = c4964kq.i;
            c3791fV0.e = abstractC4754jq.getDragDecelerationFrictionCoef() * f;
            float dragDecelerationFrictionCoef = abstractC4754jq.getDragDecelerationFrictionCoef() * c3791fV0.g;
            c3791fV0.g = dragDecelerationFrictionCoef;
            float f2 = (jCurrentAnimationTimeMillis - c4964kq.s) / 1000.0f;
            float f3 = c3791fV0.e * f2;
            float f4 = dragDecelerationFrictionCoef * f2;
            C3791fV0 c3791fV1 = c4964kq.t;
            float f5 = c3791fV1.e + f3;
            c3791fV1.e = f5;
            float f6 = c3791fV1.g + f4;
            c3791fV1.g = f6;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f5, f6, 0);
            boolean z = abstractC4754jq.O;
            C3791fV0 c3791fV2 = c4964kq.l;
            c4964kq.c(motionEventObtain, z ? c3791fV1.e - c3791fV2.e : 0.0f, abstractC4754jq.P ? c3791fV1.g - c3791fV2.g : 0.0f);
            motionEventObtain.recycle();
            C4454ie2 viewPortHandler = abstractC4754jq.getViewPortHandler();
            Matrix matrix = c4964kq.j;
            viewPortHandler.l(matrix, abstractC4754jq, false);
            c4964kq.j = matrix;
            c4964kq.s = jCurrentAnimationTimeMillis;
            if (Math.abs(c3791fV0.e) >= 0.01d || Math.abs(c3791fV0.g) >= 0.01d) {
                DisplayMetrics displayMetrics = AbstractC8067zc2.a;
                abstractC4754jq.postInvalidateOnAnimation();
                return;
            }
            abstractC4754jq.a();
            abstractC4754jq.postInvalidate();
            C3791fV0 c3791fV3 = c4964kq.u;
            c3791fV3.e = 0.0f;
            c3791fV3.g = 0.0f;
        }
    }

    @Override // defpackage.AbstractC7347wA
    public void e() {
        super.e();
        this.c0 = new Kl2(Kl2.a.d);
        this.d0 = new Kl2(Kl2.a.e);
        this.g0 = new B42(this.w);
        this.h0 = new B42(this.w);
        this.e0 = new Ll2(this.w, this.c0, this.g0);
        this.f0 = new Ll2(this.w, this.d0, this.h0);
        this.i0 = new Il2(this.w, this.m, this.g0);
        setHighlighter(new GA(this));
        Matrix matrix = this.w.a;
        C4964kq c4964kq = new C4964kq();
        c4964kq.d = PA.a.d;
        c4964kq.e = 0;
        c4964kq.i = this;
        c4964kq.h = new GestureDetector(getContext(), c4964kq);
        c4964kq.j = new Matrix();
        c4964kq.k = new Matrix();
        c4964kq.l = C3791fV0.b(0.0f, 0.0f);
        c4964kq.m = C3791fV0.b(0.0f, 0.0f);
        c4964kq.n = 1.0f;
        c4964kq.o = 1.0f;
        c4964kq.p = 1.0f;
        c4964kq.s = 0L;
        c4964kq.t = C3791fV0.b(0.0f, 0.0f);
        c4964kq.u = C3791fV0.b(0.0f, 0.0f);
        c4964kq.j = matrix;
        c4964kq.v = AbstractC8067zc2.c(3.0f);
        c4964kq.w = AbstractC8067zc2.c(3.5f);
        this.q = c4964kq;
        Paint paint = new Paint();
        this.S = paint;
        paint.setStyle(Paint.Style.FILL);
        this.S.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.T = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.T.setColor(-16777216);
        this.T.setStrokeWidth(AbstractC8067zc2.c(1.0f));
    }

    /* JADX WARN: Code duplicated, block: B:173:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x0125  */
    /* JADX WARN: Code duplicated, block: B:41:0x0161  */
    /* JADX WARN: Code duplicated, block: B:44:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    @Override // defpackage.AbstractC7347wA
    public final void f() {
        C4871kP0.b bVar;
        ArrayList arrayList;
        float f;
        int i;
        String strA;
        InterfaceC4083gs0 interfaceC4083gs0;
        InterfaceC6449ru0 interfaceC6449ru0;
        int i2;
        if (this.e == null) {
            return;
        }
        AbstractC8032zS abstractC8032zS = this.u;
        if (abstractC8032zS != null) {
            abstractC8032zS.f();
        }
        h();
        Ll2 ll2 = this.e0;
        Kl2 kl2 = this.c0;
        ll2.b(kl2.y, kl2.x);
        Ll2 ll3 = this.f0;
        Kl2 kl3 = this.d0;
        ll3.b(kl3.y, kl3.x);
        Il2 il2 = this.i0;
        Hl2 hl2 = this.m;
        il2.b(hl2.y, hl2.x);
        if (this.p != null) {
            C5294mP0 c5294mP0 = this.t;
            T t = this.e;
            C4871kP0 c4871kP0 = c5294mP0.e;
            c4871kP0.getClass();
            ArrayList arrayList2 = c5294mP0.f;
            arrayList2.clear();
            int i3 = 0;
            while (true) {
                int iG = t.g();
                bVar = C4871kP0.b.d;
                if (i3 >= iG) {
                    break;
                }
                InterfaceC6653ss0 interfaceC6653ss0E = t.e(i3);
                List<Integer> listH = interfaceC6653ss0E.H();
                int iT = interfaceC6653ss0E.T();
                if (interfaceC6653ss0E instanceof InterfaceC2825as0) {
                    InterfaceC2825as0 interfaceC2825as0 = (InterfaceC2825as0) interfaceC6653ss0E;
                    if (interfaceC2825as0.M()) {
                        String[] strArrO = interfaceC2825as0.O();
                        for (int i4 = 0; i4 < listH.size() && i4 < interfaceC2825as0.I(); i4++) {
                            arrayList2.add(new C5081lP0(strArrO[i4 % strArrO.length], interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i4).intValue()));
                        }
                        if (interfaceC2825as0.a() != null) {
                            arrayList2.add(new C5081lP0(interfaceC6653ss0E.a(), bVar, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (interfaceC6653ss0E instanceof InterfaceC6449ru0) {
                        interfaceC6449ru0 = (InterfaceC6449ru0) interfaceC6653ss0E;
                        for (i2 = 0; i2 < listH.size() && i2 < iT; i2++) {
                            interfaceC6449ru0.y(i2).getClass();
                            arrayList2.add(new C5081lP0(null, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i2).intValue()));
                        }
                        if (interfaceC6449ru0.a() != null) {
                            arrayList2.add(new C5081lP0(interfaceC6653ss0E.a(), bVar, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (interfaceC6653ss0E instanceof InterfaceC4083gs0) {
                        interfaceC4083gs0 = (InterfaceC4083gs0) interfaceC6653ss0E;
                        if (interfaceC4083gs0.b0() != 1122867) {
                            int iB0 = interfaceC4083gs0.b0();
                            int iP = interfaceC4083gs0.P();
                            arrayList2.add(new C5081lP0(null, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, iB0));
                            arrayList2.add(new C5081lP0(interfaceC6653ss0E.a(), interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, iP));
                        } else {
                            for (i = 0; i < listH.size() && i < iT; i++) {
                                if (i < listH.size() - 1 || i >= iT - 1) {
                                    strA = t.e(i3).a();
                                } else {
                                    strA = null;
                                }
                                arrayList2.add(new C5081lP0(strA, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i).intValue()));
                            }
                        }
                    } else {
                        while (i < listH.size()) {
                            if (i < listH.size() - 1) {
                                strA = t.e(i3).a();
                            } else {
                                strA = t.e(i3).a();
                            }
                            arrayList2.add(new C5081lP0(strA, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i).intValue()));
                        }
                    }
                } else if (interfaceC6653ss0E instanceof InterfaceC6449ru0) {
                    interfaceC6449ru0 = (InterfaceC6449ru0) interfaceC6653ss0E;
                    while (i2 < listH.size()) {
                        interfaceC6449ru0.y(i2).getClass();
                        arrayList2.add(new C5081lP0(null, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i2).intValue()));
                    }
                    if (interfaceC6449ru0.a() != null) {
                        arrayList2.add(new C5081lP0(interfaceC6653ss0E.a(), bVar, Float.NaN, Float.NaN, null, 1122867));
                    }
                } else if (interfaceC6653ss0E instanceof InterfaceC4083gs0) {
                    interfaceC4083gs0 = (InterfaceC4083gs0) interfaceC6653ss0E;
                    if (interfaceC4083gs0.b0() != 1122867) {
                        int iB1 = interfaceC4083gs0.b0();
                        int iP2 = interfaceC4083gs0.P();
                        arrayList2.add(new C5081lP0(null, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, iB1));
                        arrayList2.add(new C5081lP0(interfaceC6653ss0E.a(), interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, iP2));
                    } else {
                        while (i < listH.size()) {
                            if (i < listH.size() - 1) {
                                strA = t.e(i3).a();
                            } else {
                                strA = t.e(i3).a();
                            }
                            arrayList2.add(new C5081lP0(strA, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i).intValue()));
                        }
                    }
                } else {
                    while (i < listH.size()) {
                        if (i < listH.size() - 1) {
                            strA = t.e(i3).a();
                        } else {
                            strA = t.e(i3).a();
                        }
                        arrayList2.add(new C5081lP0(strA, interfaceC6653ss0E.l(), interfaceC6653ss0E.B(), interfaceC6653ss0E.x(), null, listH.get(i).intValue()));
                    }
                }
                i3++;
            }
            c4871kP0.f = (C5081lP0[]) arrayList2.toArray(new C5081lP0[arrayList2.size()]);
            Paint paint = c5294mP0.c;
            paint.setTextSize(c4871kP0.d);
            paint.setColor(c4871kP0.e);
            float f2 = c4871kP0.l;
            float fC = AbstractC8067zc2.c(f2);
            float fC2 = AbstractC8067zc2.c(c4871kP0.p);
            float f3 = c4871kP0.o;
            float fC3 = AbstractC8067zc2.c(f3);
            float fC4 = AbstractC8067zc2.c(c4871kP0.n);
            float fC5 = AbstractC8067zc2.c(0.0f);
            C5081lP0[] c5081lP0Arr = c4871kP0.f;
            int length = c5081lP0Arr.length;
            AbstractC8067zc2.c(f3);
            C5081lP0[] c5081lP0Arr2 = c4871kP0.f;
            int length2 = c5081lP0Arr2.length;
            int i5 = 0;
            float f4 = 0.0f;
            float f5 = 0.0f;
            while (i5 < length2) {
                C5081lP0 c5081lP0 = c5081lP0Arr2[i5];
                float f6 = f2;
                float fC6 = AbstractC8067zc2.c(Float.isNaN(c5081lP0.c) ? f6 : c5081lP0.c);
                if (fC6 > f5) {
                    f5 = fC6;
                }
                String str = c5081lP0.a;
                if (str != null) {
                    float fMeasureText = (int) paint.measureText(str);
                    if (fMeasureText > f4) {
                        f4 = fMeasureText;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = 0.0f;
            for (C5081lP0 c5081lP1 : c4871kP0.f) {
                String str2 = c5081lP1.a;
                if (str2 != null) {
                    float fA = AbstractC8067zc2.a(paint, str2);
                    if (fA > f7) {
                        f7 = fA;
                    }
                }
            }
            int iOrdinal = c4871kP0.i.ordinal();
            if (iOrdinal == 0) {
                Paint.FontMetrics fontMetrics = AbstractC8067zc2.e;
                paint.getFontMetrics(fontMetrics);
                float f8 = fontMetrics.descent - fontMetrics.ascent;
                paint.getFontMetrics(fontMetrics);
                float f9 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + fC5;
                ((C4454ie2) c5294mP0.b).b.width();
                ArrayList arrayList3 = c4871kP0.u;
                arrayList3.clear();
                ArrayList arrayList4 = c4871kP0.t;
                arrayList4.clear();
                ArrayList arrayList5 = c4871kP0.v;
                arrayList5.clear();
                float fMax = 0.0f;
                int i6 = -1;
                int i7 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (i7 < length) {
                    int i8 = length;
                    C5081lP0 c5081lP2 = c5081lP0Arr[i7];
                    float f12 = f9;
                    boolean z = c5081lP2.b != bVar;
                    float f13 = c5081lP2.c;
                    float fC7 = Float.isNaN(f13) ? fC : AbstractC8067zc2.c(f13);
                    arrayList3.add(Boolean.FALSE);
                    float f14 = i6 == -1 ? 0.0f : f10 + fC2;
                    String str3 = c5081lP2.a;
                    if (str3 != null) {
                        arrayList4.add(AbstractC8067zc2.b(paint, str3));
                        arrayList = arrayList3;
                        f10 = f14 + (z ? fC3 + fC7 : 0.0f) + ((C3391db0) arrayList4.get(i7)).e;
                    } else {
                        C3391db0 c3391db0 = (C3391db0) C3391db0.h.b();
                        arrayList = arrayList3;
                        c3391db0.e = 0.0f;
                        c3391db0.g = 0.0f;
                        arrayList4.add(c3391db0);
                        if (!z) {
                            fC7 = 0.0f;
                        }
                        f10 = f14 + fC7;
                        if (i6 == -1) {
                            i6 = i7;
                        }
                    }
                    if (str3 != null || i7 == i8 - 1) {
                        float f15 = (f11 == 0.0f ? 0.0f : fC4) + f10 + f11;
                        if (i7 == i8 - 1) {
                            C3391db0 c3391db1 = (C3391db0) C3391db0.h.b();
                            c3391db1.e = f15;
                            c3391db1.g = f8;
                            arrayList5.add(c3391db1);
                            fMax = Math.max(fMax, f15);
                        }
                        f11 = f15;
                    }
                    if (str3 != null) {
                        i6 = -1;
                    }
                    i7++;
                    length = i8;
                    f9 = f12;
                    arrayList3 = arrayList;
                }
                float f16 = f9;
                c4871kP0.r = fMax;
                c4871kP0.s = (f16 * (arrayList5.size() == 0 ? 0 : arrayList5.size() - 1)) + (f8 * arrayList5.size());
            } else if (iOrdinal == 1) {
                Paint.FontMetrics fontMetrics2 = AbstractC8067zc2.e;
                paint.getFontMetrics(fontMetrics2);
                float f17 = fontMetrics2.descent - fontMetrics2.ascent;
                float fMax2 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                int i9 = 0;
                boolean z2 = false;
                while (i9 < length) {
                    C5081lP0 c5081lP3 = c5081lP0Arr[i9];
                    float f20 = f17;
                    boolean z3 = c5081lP3.b != bVar;
                    float f21 = c5081lP3.c;
                    float fC8 = Float.isNaN(f21) ? fC : AbstractC8067zc2.c(f21);
                    if (!z2) {
                        f19 = 0.0f;
                    }
                    if (z3) {
                        if (z2) {
                            f19 += fC2;
                        }
                        f19 += fC8;
                    }
                    String str4 = c5081lP3.a;
                    if (str4 != null) {
                        if (z3 && !z2) {
                            f = f19 + fC3;
                        } else if (z2) {
                            fMax2 = Math.max(fMax2, f19);
                            f18 += f20 + fC5;
                            f = 0.0f;
                            z2 = false;
                        } else {
                            f = f19;
                        }
                        float fMeasureText2 = f + ((int) paint.measureText(str4));
                        if (i9 < length - 1) {
                            f18 = f20 + fC5 + f18;
                        }
                        f19 = fMeasureText2;
                    } else {
                        f19 += fC8;
                        if (i9 < length - 1) {
                            f19 += fC2;
                        }
                        z2 = true;
                    }
                    fMax2 = Math.max(fMax2, f19);
                    i9++;
                    f17 = f20;
                }
                c4871kP0.r = fMax2;
                c4871kP0.s = f18;
            }
            c4871kP0.s += c4871kP0.c;
            c4871kP0.r += c4871kP0.b;
        }
        a();
    }

    public Kl2 getAxisLeft() {
        return this.c0;
    }

    public Kl2 getAxisRight() {
        return this.d0;
    }

    @Override // defpackage.AbstractC7347wA, defpackage.HA, defpackage.InterfaceC5387mq
    public /* bridge */ /* synthetic */ AbstractC5174lq getData() {
        return (AbstractC5174lq) super.getData();
    }

    public Z81 getDrawListener() {
        return null;
    }

    @Override // defpackage.InterfaceC5387mq
    public float getHighestVisibleX() {
        B42 b42I = i(Kl2.a.d);
        RectF rectF = this.w.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        C3581eV0 c3581eV0 = this.n0;
        b42I.c(f, f2, c3581eV0);
        return (float) Math.min(this.m.x, c3581eV0.e);
    }

    @Override // defpackage.InterfaceC5387mq
    public float getLowestVisibleX() {
        B42 b42I = i(Kl2.a.d);
        RectF rectF = this.w.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        C3581eV0 c3581eV0 = this.m0;
        b42I.c(f, f2, c3581eV0);
        return (float) Math.max(this.m.y, c3581eV0.e);
    }

    @Override // defpackage.AbstractC7347wA, defpackage.HA
    public int getMaxVisibleCount() {
        return this.J;
    }

    public float getMinOffset() {
        return this.a0;
    }

    public Ll2 getRendererLeftYAxis() {
        return this.e0;
    }

    public Ll2 getRendererRightYAxis() {
        return this.f0;
    }

    public Il2 getRendererXAxis() {
        return this.i0;
    }

    @Override // android.view.View
    public float getScaleX() {
        C4454ie2 c4454ie2 = this.w;
        if (c4454ie2 == null) {
            return 1.0f;
        }
        return c4454ie2.i;
    }

    @Override // android.view.View
    public float getScaleY() {
        C4454ie2 c4454ie2 = this.w;
        if (c4454ie2 == null) {
            return 1.0f;
        }
        return c4454ie2.j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // defpackage.AbstractC7347wA, defpackage.HA
    public float getYChartMax() {
        return Math.max(this.c0.x, this.d0.x);
    }

    @Override // defpackage.AbstractC7347wA, defpackage.HA
    public float getYChartMin() {
        return Math.min(this.c0.y, this.d0.y);
    }

    public void h() {
        Hl2 hl2 = this.m;
        Object obj = this.e;
        hl2.a(((AbstractC5174lq) obj).d, ((AbstractC5174lq) obj).c);
        Kl2 kl2 = this.c0;
        AbstractC5174lq abstractC5174lq = (AbstractC5174lq) this.e;
        Kl2.a aVar = Kl2.a.d;
        kl2.a(abstractC5174lq.k(aVar), ((AbstractC5174lq) this.e).j(aVar));
        Kl2 kl3 = this.d0;
        AbstractC5174lq abstractC5174lq2 = (AbstractC5174lq) this.e;
        Kl2.a aVar2 = Kl2.a.e;
        kl3.a(abstractC5174lq2.k(aVar2), ((AbstractC5174lq) this.e).j(aVar2));
    }

    public final B42 i(Kl2.a aVar) {
        return aVar == Kl2.a.d ? this.g0 : this.h0;
    }

    public final void j(float f) {
        C4454ie2 c4454ie2 = this.w;
        B42 b42I = i(Kl2.a.d);
        F11 f11 = (F11) F11.k.b();
        f11.g = c4454ie2;
        f11.h = f;
        f11.i = b42I;
        f11.j = this;
        C4454ie2 c4454ie3 = this.w;
        if (c4454ie3.d <= 0.0f || c4454ie3.c <= 0.0f) {
            this.H.add(f11);
        } else {
            post(f11);
        }
    }

    public void k() {
        if (this.d) {
            Hl2 hl2 = this.m;
            float f = hl2.y;
            float f2 = hl2.x;
            float f3 = hl2.z;
        }
        B42 b42 = this.h0;
        Hl2 hl3 = this.m;
        float f4 = hl3.y;
        float f5 = hl3.z;
        Kl2 kl2 = this.d0;
        b42.h(f4, f5, kl2.z, kl2.y);
        B42 b43 = this.g0;
        Hl2 hl4 = this.m;
        float f6 = hl4.y;
        float f7 = hl4.z;
        Kl2 kl3 = this.c0;
        b43.h(f6, f7, kl3.z, kl3.y);
    }

    public final void l(float f, float f2) {
        float f3 = this.m.z;
        float f4 = f3 / f;
        float f5 = f3 / f2;
        C4454ie2 c4454ie2 = this.w;
        c4454ie2.getClass();
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        if (f5 == 0.0f) {
            f5 = Float.MAX_VALUE;
        }
        c4454ie2.g = f4;
        c4454ie2.h = f5;
        c4454ie2.j(c4454ie2.a, c4454ie2.b);
    }

    @Override // defpackage.AbstractC7347wA, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Paint paint;
        float f;
        ArrayList arrayList;
        float f2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i3;
        C4871kP0.c cVar;
        C4871kP0.b bVar;
        C4871kP0.c cVar2;
        String str;
        int i4;
        C5294mP0 c5294mP0;
        Canvas canvas2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i5;
        C5294mP0 c5294mP1;
        Canvas canvas3;
        float fMeasureText;
        Paint paint2;
        float fWidth;
        C4454ie2 c4454ie2;
        Hl2 hl2;
        Hl2.a aVar;
        AbstractC4754jq<T> abstractC4754jq = this;
        Canvas canvas4 = canvas;
        Hl2.a aVar2 = Hl2.a.i;
        Hl2.a aVar3 = Hl2.a.e;
        Hl2.a aVar4 = Hl2.a.h;
        Hl2.a aVar5 = Hl2.a.d;
        float f8 = 0.0f;
        super.onDraw(canvas);
        if (abstractC4754jq.e == null) {
            return;
        }
        System.currentTimeMillis();
        if (abstractC4754jq.U) {
            canvas4.drawRect(abstractC4754jq.w.b, abstractC4754jq.S);
        }
        if (abstractC4754jq.V) {
            canvas4.drawRect(abstractC4754jq.w.b, abstractC4754jq.T);
        }
        if (abstractC4754jq.K) {
            ((AbstractC5174lq) abstractC4754jq.e).d(abstractC4754jq.getLowestVisibleX(), abstractC4754jq.getHighestVisibleX());
            Hl2 hl3 = abstractC4754jq.m;
            AbstractC5174lq abstractC5174lq = (AbstractC5174lq) abstractC4754jq.e;
            hl3.a(abstractC5174lq.d, abstractC5174lq.c);
            Kl2 kl2 = abstractC4754jq.c0;
            if (kl2.a) {
                AbstractC5174lq abstractC5174lq2 = (AbstractC5174lq) abstractC4754jq.e;
                Kl2.a aVar6 = Kl2.a.d;
                kl2.a(abstractC5174lq2.k(aVar6), ((AbstractC5174lq) abstractC4754jq.e).j(aVar6));
            }
            Kl2 kl3 = abstractC4754jq.d0;
            if (kl3.a) {
                AbstractC5174lq abstractC5174lq3 = (AbstractC5174lq) abstractC4754jq.e;
                Kl2.a aVar7 = Kl2.a.e;
                kl3.a(abstractC5174lq3.k(aVar7), ((AbstractC5174lq) abstractC4754jq.e).j(aVar7));
            }
            abstractC4754jq.a();
        }
        Kl2 kl4 = abstractC4754jq.c0;
        if (kl4.a) {
            abstractC4754jq.e0.b(kl4.y, kl4.x);
        }
        Kl2 kl5 = abstractC4754jq.d0;
        if (kl5.a) {
            abstractC4754jq.f0.b(kl5.y, kl5.x);
        }
        Hl2 hl4 = abstractC4754jq.m;
        if (hl4.a) {
            abstractC4754jq.i0.b(hl4.y, hl4.x);
        }
        Il2 il2 = abstractC4754jq.i0;
        Hl2 hl5 = il2.i;
        if (hl5.p && hl5.a) {
            Paint paint3 = il2.g;
            paint3.setColor(hl5.i);
            paint3.setStrokeWidth(hl5.j);
            paint3.setPathEffect(null);
            Hl2.a aVar8 = hl5.B;
            C4454ie2 c4454ie3 = (C4454ie2) il2.b;
            Hl2.a aVar9 = Hl2.a.g;
            if (aVar8 == aVar5 || aVar8 == aVar4 || aVar8 == aVar9) {
                RectF rectF = c4454ie3.b;
                float f9 = rectF.left;
                float f10 = rectF.top;
                c4454ie2 = c4454ie3;
                hl2 = hl5;
                aVar = aVar9;
                i = 1;
                i2 = 2;
                canvas4.drawLine(f9, f10, rectF.right, f10, paint3);
            } else {
                c4454ie2 = c4454ie3;
                hl2 = hl5;
                aVar = aVar9;
                i = 1;
                i2 = 2;
            }
            Hl2.a aVar10 = hl2.B;
            if (aVar10 == aVar3 || aVar10 == aVar2 || aVar10 == aVar) {
                RectF rectF2 = c4454ie2.b;
                float f11 = rectF2.left;
                float f12 = rectF2.bottom;
                float f13 = rectF2.right;
                canvas4 = canvas;
                canvas4.drawLine(f11, f12, f13, f12, paint3);
            } else {
                canvas4 = canvas;
            }
        } else {
            i = 1;
            i2 = 2;
        }
        abstractC4754jq.e0.f(canvas4);
        abstractC4754jq.f0.f(canvas4);
        if (abstractC4754jq.m.s) {
            abstractC4754jq.i0.e(canvas4);
        }
        if (abstractC4754jq.c0.s) {
            abstractC4754jq.e0.g(canvas4);
        }
        if (abstractC4754jq.d0.s) {
            abstractC4754jq.f0.g(canvas4);
        }
        boolean z = abstractC4754jq.m.a;
        boolean z2 = abstractC4754jq.c0.a;
        boolean z3 = abstractC4754jq.d0.a;
        int iSave = canvas4.save();
        canvas4.clipRect(abstractC4754jq.w.b);
        abstractC4754jq.u.b(canvas4);
        if (!abstractC4754jq.m.s) {
            abstractC4754jq.i0.e(canvas4);
        }
        if (!abstractC4754jq.c0.s) {
            abstractC4754jq.e0.g(canvas4);
        }
        if (!abstractC4754jq.d0.s) {
            abstractC4754jq.f0.g(canvas4);
        }
        C7482wo0[] c7482wo0Arr = abstractC4754jq.D;
        if (c7482wo0Arr != null && c7482wo0Arr.length > 0 && c7482wo0Arr[0] != null) {
            abstractC4754jq.u.d(canvas4, c7482wo0Arr);
        }
        canvas4.restoreToCount(iSave);
        abstractC4754jq.u.c(canvas4);
        if (abstractC4754jq.m.a) {
            Il2 il3 = abstractC4754jq.i0;
            ArrayList arrayList4 = il3.i.r;
            if (arrayList4 != null && arrayList4.size() > 0) {
                float[] fArr = il3.m;
                fArr[0] = 0.0f;
                fArr[i] = 0.0f;
                int i6 = 0;
                while (i6 < arrayList4.size()) {
                    if (((QP0) arrayList4.get(i6)).a) {
                        int iSave2 = canvas4.save();
                        RectF rectF3 = il3.n;
                        C4454ie2 c4454ie4 = (C4454ie2) il3.b;
                        rectF3.set(c4454ie4.b);
                        rectF3.inset(-0.0f, f8);
                        canvas4.clipRect(rectF3);
                        fArr[0] = f8;
                        fArr[i] = f8;
                        il3.d.f(fArr);
                        float f14 = fArr[0];
                        float[] fArr2 = il3.o;
                        fArr2[0] = f14;
                        RectF rectF4 = c4454ie4.b;
                        fArr2[i] = rectF4.top;
                        fArr2[i2] = fArr[0];
                        fArr2[3] = rectF4.bottom;
                        Path path = il3.p;
                        path.reset();
                        path.moveTo(fArr2[0], fArr2[i]);
                        path.lineTo(fArr2[i2], fArr2[3]);
                        Paint paint4 = il3.h;
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setColor(0);
                        paint4.setStrokeWidth(0.0f);
                        paint4.setPathEffect(null);
                        canvas4.drawPath(path, paint4);
                        canvas4.restoreToCount(iSave2);
                    }
                    i6++;
                    f8 = 0.0f;
                }
            }
        }
        if (abstractC4754jq.c0.a) {
            abstractC4754jq.e0.h(canvas4);
        }
        if (abstractC4754jq.d0.a) {
            abstractC4754jq.f0.h(canvas4);
        }
        Il2 il4 = abstractC4754jq.i0;
        Hl2 hl6 = il4.i;
        if (hl6.a && hl6.q) {
            float f15 = hl6.c;
            Paint paint5 = il4.f;
            paint5.setTypeface(null);
            paint5.setTextSize(hl6.d);
            paint5.setColor(hl6.e);
            C3791fV0 c3791fV0B = C3791fV0.b(0.0f, 0.0f);
            Hl2.a aVar11 = hl6.B;
            C4454ie2 c4454ie5 = (C4454ie2) il4.b;
            if (aVar11 == aVar5) {
                c3791fV0B.e = 0.5f;
                c3791fV0B.g = 1.0f;
                il4.d(canvas4, c4454ie5.b.top - f15, c3791fV0B);
            } else if (aVar11 == aVar4) {
                c3791fV0B.e = 0.5f;
                c3791fV0B.g = 1.0f;
                il4.d(canvas4, c4454ie5.b.top + f15 + hl6.A, c3791fV0B);
            } else if (aVar11 == aVar3) {
                c3791fV0B.e = 0.5f;
                c3791fV0B.g = 0.0f;
                il4.d(canvas4, c4454ie5.b.bottom + f15, c3791fV0B);
            } else if (aVar11 == aVar2) {
                c3791fV0B.e = 0.5f;
                c3791fV0B.g = 0.0f;
                il4.d(canvas4, (c4454ie5.b.bottom - f15) - hl6.A, c3791fV0B);
            } else {
                c3791fV0B.e = 0.5f;
                c3791fV0B.g = 1.0f;
                il4.d(canvas4, c4454ie5.b.top - f15, c3791fV0B);
                c3791fV0B.e = 0.5f;
                c3791fV0B.g = 0.0f;
                il4.d(canvas4, c4454ie5.b.bottom + f15, c3791fV0B);
            }
            C3791fV0.c(c3791fV0B);
        }
        abstractC4754jq.e0.e(canvas4);
        abstractC4754jq.f0.e(canvas4);
        if (abstractC4754jq.W) {
            int iSave3 = canvas4.save();
            canvas4.clipRect(abstractC4754jq.w.b);
            abstractC4754jq.u.e(canvas4);
            canvas4.restoreToCount(iSave3);
        } else {
            abstractC4754jq.u.e(canvas4);
        }
        C5294mP0 c5294mP2 = abstractC4754jq.t;
        C4871kP0 c4871kP0 = c5294mP2.e;
        if (c4871kP0.a) {
            Paint paint6 = c5294mP2.c;
            paint6.setTextSize(c4871kP0.d);
            paint6.setColor(c4871kP0.e);
            Paint.FontMetrics fontMetrics = c5294mP2.g;
            DisplayMetrics displayMetrics = AbstractC8067zc2.a;
            paint6.getFontMetrics(fontMetrics);
            float f16 = fontMetrics.descent - fontMetrics.ascent;
            paint6.getFontMetrics(fontMetrics);
            float fC = AbstractC8067zc2.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float fA = f16 - (AbstractC8067zc2.a(paint6, "ABC") / 2.0f);
            C5081lP0[] c5081lP0Arr = c4871kP0.f;
            float fC2 = AbstractC8067zc2.c(c4871kP0.o);
            float fC3 = AbstractC8067zc2.c(c4871kP0.n);
            float fC4 = AbstractC8067zc2.c(c4871kP0.l);
            float fC5 = AbstractC8067zc2.c(c4871kP0.p);
            float f17 = c4871kP0.c;
            float f18 = c4871kP0.b;
            C4871kP0.c cVar3 = c4871kP0.g;
            int iOrdinal = cVar3.ordinal();
            C4871kP0.d dVar = C4871kP0.d.e;
            C4871kP0.a aVar12 = C4871kP0.a.d;
            C4871kP0.a aVar13 = C4871kP0.a.e;
            float f19 = fC5;
            C4871kP0.d dVar2 = c4871kP0.i;
            C4871kP0.a aVar14 = c4871kP0.j;
            C4454ie2 c4454ie6 = (C4454ie2) c5294mP2.b;
            if (iOrdinal == 0) {
                paint = paint6;
                f = dVar2 == dVar ? f18 : c4454ie6.b.left + f18;
                if (aVar14 == aVar13) {
                    f += c4871kP0.r;
                }
            } else if (iOrdinal == i) {
                if (dVar2 == dVar) {
                    fWidth = c4454ie6.c / 2.0f;
                } else {
                    RectF rectF5 = c4454ie6.b;
                    fWidth = (rectF5.width() / 2.0f) + rectF5.left;
                }
                f = fWidth + (aVar14 == aVar12 ? f18 : -f18);
                if (dVar2 == dVar) {
                    paint = paint6;
                    f = (float) (((double) f) + (aVar14 == aVar12 ? (((double) (-c4871kP0.r)) / 2.0d) + ((double) f18) : (((double) c4871kP0.r) / 2.0d) - ((double) f18)));
                } else {
                    paint = paint6;
                }
            } else if (iOrdinal != i2) {
                paint = paint6;
                f = 0.0f;
            } else {
                f = (dVar2 == dVar ? c4454ie6.c : c4454ie6.b.right) - f18;
                if (aVar14 == aVar12) {
                    f -= c4871kP0.r;
                }
                paint = paint6;
            }
            int iOrdinal2 = dVar2.ordinal();
            C4871kP0.b bVar2 = C4871kP0.b.d;
            C4871kP0.c cVar4 = C4871kP0.c.e;
            C4871kP0.e eVar = c4871kP0.h;
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    int iOrdinal3 = eVar.ordinal();
                    if (iOrdinal3 == 0) {
                        f5 = (cVar3 == cVar4 ? 0.0f : c4454ie6.b.top) + f17;
                    } else if (iOrdinal3 == 1) {
                        f5 = c4871kP0.c + ((c4454ie6.d / 2.0f) - (c4871kP0.s / 2.0f));
                    } else if (iOrdinal3 != 2) {
                        f5 = 0.0f;
                    } else {
                        f5 = (cVar3 == cVar4 ? c4454ie6.d : c4454ie6.b.bottom) - (c4871kP0.s + f17);
                    }
                    float f20 = f5;
                    float f21 = 0.0f;
                    int i7 = 0;
                    boolean z4 = false;
                    while (i7 < c5081lP0Arr.length) {
                        C5081lP0 c5081lP0 = c5081lP0Arr[i7];
                        boolean z5 = c5081lP0.b != bVar2;
                        float f22 = c5081lP0.c;
                        float fC6 = Float.isNaN(f22) ? fC4 : AbstractC8067zc2.c(f22);
                        if (z5) {
                            fMeasureText = aVar14 == aVar12 ? f + f21 : f - (fC6 - f21);
                            f6 = f;
                            f7 = f19;
                            i5 = i7;
                            c5294mP2.b(canvas, fMeasureText, f20 + fA, c5081lP0, c5294mP2.e);
                            c5294mP1 = c5294mP2;
                            canvas3 = canvas;
                            if (aVar14 == aVar12) {
                                fMeasureText += fC6;
                            }
                        } else {
                            f6 = f;
                            f7 = f19;
                            i5 = i7;
                            c5294mP1 = c5294mP2;
                            canvas3 = canvas;
                            fMeasureText = f6;
                        }
                        String str2 = c5081lP0.a;
                        if (str2 != null) {
                            if (z5 && !z4) {
                                fMeasureText += aVar14 == aVar12 ? fC2 : -fC2;
                            } else if (z4) {
                                fMeasureText = f6;
                            }
                            paint2 = paint;
                            if (aVar14 == aVar13) {
                                fMeasureText -= (int) paint2.measureText(str2);
                            }
                            if (z4) {
                                f20 += f16 + fC;
                                canvas3.drawText(str2, fMeasureText, f20 + f16, c5294mP1.c);
                            } else {
                                canvas3.drawText(str2, fMeasureText, f20 + f16, c5294mP1.c);
                            }
                            f20 = f16 + fC + f20;
                            f21 = 0.0f;
                        } else {
                            paint2 = paint;
                            f21 = fC6 + f7 + f21;
                            z4 = true;
                        }
                        int i8 = i5 + 1;
                        f19 = f7;
                        c5294mP2 = c5294mP1;
                        i7 = i8;
                        paint = paint2;
                        f = f6;
                    }
                }
                abstractC4754jq = this;
            } else {
                float f23 = f;
                ArrayList arrayList5 = c4871kP0.v;
                ArrayList arrayList6 = c4871kP0.t;
                float f24 = f19;
                ArrayList arrayList7 = c4871kP0.u;
                int iOrdinal4 = eVar.ordinal();
                if (iOrdinal4 != 0) {
                    arrayList = arrayList6;
                    if (iOrdinal4 != 1) {
                        f2 = iOrdinal4 != 2 ? 0.0f : (c4454ie6.d - f17) - c4871kP0.s;
                    } else {
                        f2 = ((c4454ie6.d - c4871kP0.s) / 2.0f) + f17;
                    }
                } else {
                    arrayList = arrayList6;
                    f2 = f17;
                }
                int length = c5081lP0Arr.length;
                float f25 = f2;
                float f26 = f23;
                int i9 = 0;
                int i10 = 0;
                while (i10 < length) {
                    float f27 = f26;
                    C5081lP0 c5081lP1 = c5081lP0Arr[i10];
                    int i11 = length;
                    boolean z6 = c5081lP1.b != bVar2;
                    float f28 = c5081lP1.c;
                    float fC7 = Float.isNaN(f28) ? fC4 : AbstractC8067zc2.c(f28);
                    if (i10 < arrayList7.size() && ((Boolean) arrayList7.get(i10)).booleanValue()) {
                        f25 = f16 + fC + f25;
                        f27 = f23;
                    }
                    if (f27 == f23 && cVar3 == cVar4 && i9 < arrayList5.size()) {
                        f27 = ((aVar14 == aVar13 ? ((C3391db0) arrayList5.get(i9)).e : -((C3391db0) arrayList5.get(i9)).e) / 2.0f) + f27;
                        i9++;
                    }
                    float f29 = f27;
                    int i12 = i9;
                    float f30 = f29;
                    String str3 = c5081lP1.a;
                    boolean z7 = str3 == null;
                    if (z6) {
                        if (aVar14 == aVar13) {
                            f30 -= fC7;
                        }
                        cVar = cVar3;
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList;
                        i3 = i11;
                        bVar = bVar2;
                        i4 = i10;
                        cVar2 = cVar4;
                        str = str3;
                        float f31 = f30;
                        c5294mP2.b(canvas, f31, f25 + fA, c5081lP1, c5294mP2.e);
                        c5294mP0 = c5294mP2;
                        canvas2 = canvas;
                        f30 = aVar14 == aVar12 ? f31 + fC7 : f31;
                    } else {
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList;
                        i3 = i11;
                        cVar = cVar3;
                        bVar = bVar2;
                        cVar2 = cVar4;
                        str = str3;
                        i4 = i10;
                        c5294mP0 = c5294mP2;
                        canvas2 = canvas;
                    }
                    if (z7) {
                        f3 = f24;
                        f4 = f30 + (aVar14 == aVar13 ? -f3 : f3);
                    } else {
                        if (z6) {
                            f30 += aVar14 == aVar13 ? -fC2 : fC2;
                        }
                        if (aVar14 == aVar13) {
                            f30 -= ((C3391db0) arrayList3.get(i4)).e;
                        }
                        canvas2.drawText(str, f30, f25 + f16, c5294mP0.c);
                        if (aVar14 == aVar12) {
                            f30 += ((C3391db0) arrayList3.get(i4)).e;
                        }
                        f4 = f30 + (aVar14 == aVar13 ? -fC3 : fC3);
                        f3 = f24;
                    }
                    f26 = f4;
                    int i13 = i4 + 1;
                    f24 = f3;
                    c5294mP2 = c5294mP0;
                    length = i3;
                    bVar2 = bVar;
                    cVar3 = cVar;
                    cVar4 = cVar2;
                    arrayList = arrayList3;
                    i10 = i13;
                    i9 = i12;
                    arrayList7 = arrayList2;
                }
                abstractC4754jq = this;
            }
        }
        CY cy = abstractC4754jq.o;
        if (cy != null && cy.a) {
            abstractC4754jq.k.setTypeface(null);
            abstractC4754jq.k.setTextSize(abstractC4754jq.o.d);
            abstractC4754jq.k.setColor(abstractC4754jq.o.e);
            abstractC4754jq.k.setTextAlign(abstractC4754jq.o.g);
            float width = abstractC4754jq.getWidth();
            C4454ie2 c4454ie7 = abstractC4754jq.w;
            float f32 = (width - (c4454ie7.c - c4454ie7.b.right)) - abstractC4754jq.o.b;
            float height = abstractC4754jq.getHeight() - abstractC4754jq.w.k();
            CY cy2 = abstractC4754jq.o;
            canvas.drawText(cy2.f, f32, height - cy2.c, abstractC4754jq.k);
        }
        b(canvas);
        if (abstractC4754jq.d) {
            System.currentTimeMillis();
        }
    }

    @Override // defpackage.AbstractC7347wA, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.o0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z = this.b0;
        Kl2.a aVar = Kl2.a.d;
        if (z) {
            RectF rectF = this.w.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            i(aVar).e(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.b0) {
            i(aVar).f(fArr);
            this.w.a(fArr, this);
        } else {
            C4454ie2 c4454ie2 = this.w;
            c4454ie2.l(c4454ie2.a, this, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        PA pa = this.q;
        if (pa == null || this.e == null || !this.n) {
            return false;
        }
        return ((C4964kq) pa).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.K = z;
    }

    public void setBorderColor(int i) {
        this.T.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.T.setStrokeWidth(AbstractC8067zc2.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.W = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.M = z;
    }

    public void setDragEnabled(boolean z) {
        this.O = z;
        this.P = z;
    }

    public void setDragOffsetX(float f) {
        C4454ie2 c4454ie2 = this.w;
        c4454ie2.getClass();
        c4454ie2.l = AbstractC8067zc2.c(f);
    }

    public void setDragOffsetY(float f) {
        C4454ie2 c4454ie2 = this.w;
        c4454ie2.getClass();
        c4454ie2.m = AbstractC8067zc2.c(f);
    }

    public void setDragXEnabled(boolean z) {
        this.O = z;
    }

    public void setDragYEnabled(boolean z) {
        this.P = z;
    }

    public void setDrawBorders(boolean z) {
        this.V = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.U = z;
    }

    public void setGridBackgroundColor(int i) {
        this.S.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.N = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.b0 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.J = i;
    }

    public void setMinOffset(float f) {
        this.a0 = f;
    }

    public void setPinchZoom(boolean z) {
        this.L = z;
    }

    public void setRendererLeftYAxis(Ll2 ll2) {
        this.e0 = ll2;
    }

    public void setRendererRightYAxis(Ll2 ll2) {
        this.f0 = ll2;
    }

    public void setScaleEnabled(boolean z) {
        this.Q = z;
        this.R = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.Q = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.R = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.m.z / f;
        C4454ie2 c4454ie2 = this.w;
        c4454ie2.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        c4454ie2.g = f2;
        c4454ie2.j(c4454ie2.a, c4454ie2.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.m.z / f;
        C4454ie2 c4454ie2 = this.w;
        c4454ie2.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        c4454ie2.h = f2;
        c4454ie2.j(c4454ie2.a, c4454ie2.b);
    }

    public void setXAxisRenderer(Il2 il2) {
        this.i0 = il2;
    }

    public void setOnDrawListener(Z81 z81) {
    }
}
