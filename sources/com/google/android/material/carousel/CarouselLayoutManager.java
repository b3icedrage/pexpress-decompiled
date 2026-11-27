package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.pexpress.tool.R;
import defpackage.C1742Pc;
import defpackage.C1952Ru;
import defpackage.C3683ez;
import defpackage.C4162hF;
import defpackage.C5345me2;
import defpackage.C7013uc;
import defpackage.Cd2;
import defpackage.InterfaceC5948pX0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.m {
    public int p;
    public int q;
    public int r;
    public com.google.android.material.carousel.a v;
    public final b s = new b();
    public int w = 0;

    @NonNull
    public final com.google.android.material.carousel.c t = new com.google.android.material.carousel.c();
    public com.google.android.material.carousel.b u = null;

    public static final class a {
        public View a;
        public float b;
        public c c;
    }

    public static class b extends RecyclerView.l {
        public final Paint a;
        public List<com.google.android.material.carousel.a.b> b;

        public b() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void e(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
            Paint paint = this.a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (com.google.android.material.carousel.a.b bVar : this.b) {
                float f = bVar.c;
                ThreadLocal<double[]> threadLocal = C4162hF.a;
                float f2 = 1.0f - f;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * f) + (Color.blue(-65281) * f2))));
                float fE = ((CarouselLayoutManager) recyclerView.getLayoutManager()).E();
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                float fB = carouselLayoutManager.o - carouselLayoutManager.B();
                float f3 = bVar.b;
                canvas.drawLine(f3, fE, f3, fB, paint);
            }
        }
    }

    public static class c {
        public final com.google.android.material.carousel.a.b a;
        public final com.google.android.material.carousel.a.b b;

        public c(com.google.android.material.carousel.a.b bVar, com.google.android.material.carousel.a.b bVar2) {
            if (bVar.a > bVar2.a) {
                throw new IllegalArgumentException();
            }
            this.a = bVar;
            this.b = bVar2;
        }
    }

    public CarouselLayoutManager() {
        m0();
    }

    public static c I0(List<com.google.android.material.carousel.a.b> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.google.android.material.carousel.a.b bVar = list.get(i5);
            float f6 = z ? bVar.b : bVar.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new c(list.get(i), list.get(i3));
    }

    public final int B0(int i, int i2) {
        return J0() ? i - i2 : i + i2;
    }

    public final void C0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        int iF0 = F0(i);
        while (i < yVar.b()) {
            a aVarM0 = M0(tVar, iF0, i);
            float f = aVarM0.b;
            c cVar = aVarM0.c;
            if (K0(f, cVar)) {
                return;
            }
            iF0 = B0(iF0, (int) this.v.a);
            if (!L0(f, cVar)) {
                View view = aVarM0.a;
                float f2 = this.v.a / 2.0f;
                b(view, -1, false);
                RecyclerView.m.L(view, (int) (f - f2), E(), (int) (f + f2), this.o - B());
            }
            i++;
        }
    }

    public final void D0(int i, RecyclerView.t tVar) {
        int iF0 = F0(i);
        while (i >= 0) {
            a aVarM0 = M0(tVar, iF0, i);
            float f = aVarM0.b;
            c cVar = aVarM0.c;
            if (L0(f, cVar)) {
                return;
            }
            int i2 = (int) this.v.a;
            iF0 = J0() ? iF0 + i2 : iF0 - i2;
            if (!K0(f, cVar)) {
                View view = aVarM0.a;
                float f2 = this.v.a / 2.0f;
                b(view, 0, false);
                RecyclerView.m.L(view, (int) (f - f2), E(), (int) (f + f2), this.o - B());
            }
            i--;
        }
    }

    public final float E0(View view, float f, c cVar) {
        com.google.android.material.carousel.a.b bVar = cVar.a;
        float f2 = bVar.b;
        com.google.android.material.carousel.a.b bVar2 = cVar.b;
        float f3 = bVar2.b;
        float f4 = bVar.a;
        float f5 = bVar2.a;
        float fB = C7013uc.b(f2, f3, f4, f5, f);
        if (bVar2 != this.v.b() && bVar != this.v.d()) {
            return fB;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return (((1.0f - bVar2.c) + ((((ViewGroup.MarginLayoutParams) nVar).rightMargin + ((ViewGroup.MarginLayoutParams) nVar).leftMargin) / this.v.a)) * (f - f5)) + fB;
    }

    public final int F0(int i) {
        return B0((J0() ? this.n : 0) - this.p, (int) (this.v.a * i));
    }

    public final void G0(RecyclerView.t tVar, RecyclerView.y yVar) {
        while (v() > 0) {
            View viewU = u(0);
            Rect rect = new Rect();
            RecyclerView.L(viewU, rect);
            float fCenterX = rect.centerX();
            if (!L0(fCenterX, I0(this.v.b, fCenterX, true))) {
                break;
            } else {
                i0(viewU, tVar);
            }
        }
        while (v() - 1 >= 0) {
            View viewU2 = u(v() - 1);
            Rect rect2 = new Rect();
            RecyclerView.L(viewU2, rect2);
            float fCenterX2 = rect2.centerX();
            if (!K0(fCenterX2, I0(this.v.b, fCenterX2, true))) {
                break;
            } else {
                i0(viewU2, tVar);
            }
        }
        if (v() == 0) {
            D0(this.w - 1, tVar);
            C0(this.w, tVar, yVar);
        } else {
            int iF = RecyclerView.m.F(u(0));
            int iF2 = RecyclerView.m.F(u(v() - 1));
            D0(iF - 1, tVar);
            C0(iF2 + 1, tVar, yVar);
        }
    }

    public final int H0(com.google.android.material.carousel.a aVar, int i) {
        boolean zJ0 = J0();
        float f = aVar.a;
        if (zJ0) {
            return (int) (((this.n - aVar.c().a) - (i * f)) - (f / 2.0f));
        }
        return (int) ((f / 2.0f) + ((i * f) - aVar.a().a));
    }

    public final boolean J0() {
        return A() == 1;
    }

    public final boolean K0(float f, c cVar) {
        com.google.android.material.carousel.a.b bVar = cVar.a;
        float f2 = bVar.d;
        com.google.android.material.carousel.a.b bVar2 = cVar.b;
        float fB = C7013uc.b(f2, bVar2.d, bVar.b, bVar2.b, f);
        int i = (int) f;
        int i2 = (int) (fB / 2.0f);
        int i3 = J0() ? i + i2 : i - i2;
        if (J0()) {
            return i3 < 0;
        }
        return i3 > this.n;
    }

    public final boolean L0(float f, c cVar) {
        com.google.android.material.carousel.a.b bVar = cVar.a;
        float f2 = bVar.d;
        com.google.android.material.carousel.a.b bVar2 = cVar.b;
        int iB0 = B0((int) f, (int) (C7013uc.b(f2, bVar2.d, bVar.b, bVar2.b, f) / 2.0f));
        if (J0()) {
            return iB0 > this.n;
        }
        return iB0 < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a M0(RecyclerView.t tVar, float f, int i) {
        float f2 = this.v.a / 2.0f;
        View view = tVar.k(i, Long.MAX_VALUE).a;
        N0(view);
        float fB0 = B0((int) f, (int) f2);
        c cVarI0 = I0(this.v.b, fB0, false);
        float fE0 = E0(view, fB0, cVarI0);
        if (view instanceof InterfaceC5948pX0) {
            float f3 = cVarI0.a.c;
            float f4 = cVarI0.b.c;
            LinearInterpolator linearInterpolator = C7013uc.a;
            ((InterfaceC5948pX0) view).a();
        }
        a aVar = new a();
        aVar.a = view;
        aVar.b = fE0;
        aVar.c = cVarI0;
        return aVar;
    }

    public final void N0(@NonNull View view) {
        if (!(view instanceof InterfaceC5948pX0)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Rect rect = new Rect();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        com.google.android.material.carousel.b bVar = this.u;
        view.measure(RecyclerView.m.w(true, this.n, this.l, D() + C() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + i, (int) (bVar != null ? bVar.a.a : ((ViewGroup.MarginLayoutParams) nVar).width)), RecyclerView.m.w(false, this.o, this.m, B() + E() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) nVar).height));
    }

    public final void O0() {
        com.google.android.material.carousel.a aVarB;
        com.google.android.material.carousel.a aVar;
        int i = this.r;
        int i2 = this.q;
        if (i <= i2) {
            if (J0()) {
                List<com.google.android.material.carousel.a> list = this.u.c;
                aVar = list.get(list.size() - 1);
            } else {
                List<com.google.android.material.carousel.a> list2 = this.u.b;
                aVar = list2.get(list2.size() - 1);
            }
            this.v = aVar;
        } else {
            com.google.android.material.carousel.b bVar = this.u;
            float f = this.p;
            float f2 = i2;
            float f3 = i;
            float f4 = bVar.f + f2;
            float f5 = f3 - bVar.g;
            if (f < f4) {
                aVarB = com.google.android.material.carousel.b.b(bVar.b, C7013uc.b(1.0f, 0.0f, f2, f4, f), bVar.d);
            } else if (f > f5) {
                aVarB = com.google.android.material.carousel.b.b(bVar.c, C7013uc.b(0.0f, 1.0f, f5, f3, f), bVar.e);
            } else {
                aVarB = bVar.a;
            }
            this.v = aVarB;
        }
        List<com.google.android.material.carousel.a.b> list3 = this.v.b;
        b bVar2 = this.s;
        bVar2.getClass();
        bVar2.b = Collections.unmodifiableList(list3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R(@NonNull AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.m.F(u(0)));
            accessibilityEvent.setToIndex(RecyclerView.m.F(u(v() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z;
        float f;
        float f2;
        int i;
        com.google.android.material.carousel.a aVar;
        int paddingStart;
        com.google.android.material.carousel.a aVar2;
        int paddingEnd;
        float f3;
        float f4;
        com.google.android.material.carousel.c.a aVar3;
        List<com.google.android.material.carousel.a.b> list;
        int i2;
        int i3;
        int i4;
        int i5;
        if (yVar.b() <= 0) {
            g0(tVar);
            this.w = 0;
            return;
        }
        boolean zJ0 = J0();
        boolean z2 = this.u == null;
        if (z2) {
            View view = tVar.k(0, Long.MAX_VALUE).a;
            N0(view);
            this.t.getClass();
            float f5 = this.n;
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            float f6 = ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
            float dimension = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f6;
            float dimension2 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f6;
            f = 1.0f;
            float measuredWidth = view.getMeasuredWidth();
            f2 = 2.0f;
            float fMin = Math.min(measuredWidth + f6, f5);
            float f7 = (measuredWidth / 3.0f) + f6;
            float dimension3 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f6;
            float dimension4 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f6;
            if (f7 < dimension3) {
                dimension4 = dimension3;
            } else if (f7 <= dimension4) {
                dimension4 = f7;
            }
            float f8 = (fMin + dimension4) / 2.0f;
            int[] iArr = com.google.android.material.carousel.c.e;
            int[] iArr2 = com.google.android.material.carousel.c.f;
            int i6 = Integer.MIN_VALUE;
            int i7 = 1;
            for (int i8 = 0; i8 < 2; i8++) {
                int i9 = iArr2[i8];
                if (i9 > i6) {
                    i6 = i9;
                }
            }
            float f9 = f5 - (i6 * f8);
            int i10 = iArr[0];
            z = zJ0;
            int iMax = (int) Math.max(1.0d, Math.floor((f9 - ((i10 > Integer.MIN_VALUE ? i10 : Integer.MIN_VALUE) * dimension2)) / fMin));
            int iCeil = (int) Math.ceil(f5 / fMin);
            int i11 = (iCeil - iMax) + 1;
            int[] iArr3 = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr3[i12] = iCeil - i12;
            }
            com.google.android.material.carousel.c.a aVar4 = null;
            int i13 = 0;
            int i14 = 1;
            loop2: while (true) {
                if (i13 >= i11) {
                    f3 = f6;
                    f4 = 0.0f;
                    aVar3 = aVar4;
                    break;
                }
                int i15 = iArr3[i13];
                int i16 = i11;
                int i17 = 0;
                f4 = 0.0f;
                while (i17 < 2) {
                    int i18 = iArr2[i17];
                    int i19 = i17;
                    int[] iArr4 = iArr3;
                    com.google.android.material.carousel.c.a aVar5 = aVar4;
                    int i20 = 0;
                    while (true) {
                        i5 = i7;
                        if (i20 < i5) {
                            f3 = f6;
                            int i21 = i14;
                            float f10 = dimension2;
                            float f11 = f5;
                            com.google.android.material.carousel.c.a aVar6 = new com.google.android.material.carousel.c.a(i21, dimension4, dimension, f10, iArr[i20], f8, i18, fMin, i15, f11);
                            float f12 = aVar6.h;
                            int i22 = i20;
                            if (aVar5 == null || f12 < aVar5.h) {
                                if (f12 == 0.0f) {
                                    aVar3 = aVar6;
                                    break loop2;
                                }
                                aVar5 = aVar6;
                            }
                            i7 = 1;
                            i14 = i21 + 1;
                            i20 = i22 + 1;
                            f6 = f3;
                            dimension2 = f10;
                            f5 = f11;
                        }
                    }
                    i7 = i5;
                    i17 = i19 + 1;
                    aVar4 = aVar5;
                    iArr3 = iArr4;
                    dimension2 = dimension2;
                    f5 = f5;
                }
                i13++;
                f5 = f5;
                i11 = i16;
                iArr3 = iArr3;
                i7 = 1;
            }
            float dimension5 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_gone_size) + f3;
            float f13 = dimension5 / 2.0f;
            float f14 = f4 - f13;
            float f15 = (aVar3.f / 2.0f) + f4;
            int i23 = aVar3.g;
            float fMax = Math.max(0, i23 - 1);
            float f16 = aVar3.f;
            float f17 = (fMax * f16) + f15;
            float f18 = (f16 / 2.0f) + f17;
            int i24 = aVar3.d;
            if (i24 > 0) {
                f17 = (aVar3.e / 2.0f) + f18;
            }
            if (i24 > 0) {
                f18 = (aVar3.e / 2.0f) + f17;
            }
            int i25 = aVar3.c;
            float f19 = i25 > 0 ? (aVar3.b / 2.0f) + f18 : f17;
            float f20 = this.n + f13;
            float f21 = 1.0f - ((dimension5 - f3) / (f16 - f3));
            float f22 = f3;
            float f23 = 1.0f - ((aVar3.b - f22) / (f16 - f22));
            float f24 = 1.0f - ((aVar3.e - f22) / (f16 - f22));
            com.google.android.material.carousel.a.C0308a c0308a = new com.google.android.material.carousel.a.C0308a(f16);
            c0308a.a(f14, f21, dimension5, false);
            float f25 = aVar3.f;
            if (i23 > 0 && f25 > f4) {
                int i26 = 0;
                while (i26 < i23) {
                    c0308a.a((i26 * f25) + f15, f4, f25, true);
                    i26++;
                    i23 = i23;
                    f4 = 0.0f;
                }
            }
            if (i24 > 0) {
                c0308a.a(f17, f24, aVar3.e, false);
            }
            if (i25 > 0) {
                float f26 = aVar3.b;
                if (i25 > 0 && f26 > 0.0f) {
                    for (int i27 = 0; i27 < i25; i27++) {
                        c0308a.a((i27 * f26) + f19, f23, f26, false);
                    }
                }
            }
            c0308a.a(f20, f21, dimension5, false);
            com.google.android.material.carousel.a aVarB = c0308a.b();
            if (z) {
                com.google.android.material.carousel.a.C0308a c0308a2 = new com.google.android.material.carousel.a.C0308a(aVarB.a);
                float f27 = aVarB.b().b - (aVarB.b().d / 2.0f);
                List<com.google.android.material.carousel.a.b> list2 = aVarB.b;
                int size = list2.size() - 1;
                while (size >= 0) {
                    com.google.android.material.carousel.a.b bVar = list2.get(size);
                    float f28 = bVar.d;
                    c0308a2.a((f28 / 2.0f) + f27, bVar.c, f28, size >= aVarB.c && size <= aVarB.d);
                    f27 += bVar.d;
                    size--;
                }
                aVarB = c0308a2.b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVarB);
            int i28 = 0;
            while (true) {
                list = aVarB.b;
                if (i28 >= list.size()) {
                    i2 = -1;
                    break;
                } else {
                    if (list.get(i28).b >= 0.0f) {
                        i2 = i28;
                        break;
                    }
                    i28++;
                }
            }
            float f29 = aVarB.a().b - (aVarB.a().d / 2.0f);
            int i29 = aVarB.d;
            int i30 = aVarB.c;
            if (f29 > 0.0f && aVarB.a() != aVarB.b() && i2 != -1) {
                int i31 = 1;
                int i32 = (i30 - 1) - i2;
                float f30 = aVarB.b().b - (aVarB.b().d / 2.0f);
                int i33 = 0;
                while (i33 <= i32) {
                    com.google.android.material.carousel.a aVar7 = (com.google.android.material.carousel.a) C1742Pc.c(i31, arrayList);
                    int size2 = list.size() - i31;
                    int i34 = (i2 + i33) - i31;
                    if (i34 >= 0) {
                        float f31 = list.get(i34).c;
                        int size3 = aVar7.d;
                        while (true) {
                            List<com.google.android.material.carousel.a.b> list3 = aVar7.b;
                            if (size3 >= list3.size()) {
                                i4 = 1;
                                size3 = list3.size() - 1;
                                break;
                            } else {
                                if (f31 == list3.get(size3).c) {
                                    i4 = 1;
                                    break;
                                }
                                size3++;
                            }
                        }
                        size2 = size3 - 1;
                    } else {
                        i4 = 1;
                    }
                    arrayList.add(com.google.android.material.carousel.b.c(aVar7, i2, size2, f30, (i30 - i33) - 1, (i29 - i33) - 1));
                    i33++;
                    i31 = i4;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(aVarB);
            int size4 = list.size() - 1;
            while (true) {
                if (size4 < 0) {
                    size4 = -1;
                    break;
                } else if (list.get(size4).b <= this.n) {
                    break;
                } else {
                    size4--;
                }
            }
            if ((aVarB.c().d / 2.0f) + aVarB.c().b >= this.n || aVarB.c() == aVarB.d()) {
                i = -1;
            } else if (size4 == -1) {
                i = -1;
            } else {
                int i35 = size4 - i29;
                float f32 = aVarB.b().b - (aVarB.b().d / 2.0f);
                int i36 = 0;
                while (i36 < i35) {
                    com.google.android.material.carousel.a aVar8 = (com.google.android.material.carousel.a) C1742Pc.c(1, arrayList2);
                    int i37 = (size4 - i36) + 1;
                    if (i37 < list.size()) {
                        float f33 = list.get(i37).c;
                        int i38 = aVar8.c - 1;
                        while (true) {
                            if (i38 < 0) {
                                i38 = 0;
                                break;
                            } else if (f33 == aVar8.b.get(i38).c) {
                                break;
                            } else {
                                i38--;
                            }
                        }
                        i3 = i38 + 1;
                    } else {
                        i3 = 0;
                    }
                    int i39 = size4;
                    arrayList2.add(com.google.android.material.carousel.b.c(aVar8, i39, i3, f32, i30 + i36 + 1, i29 + i36 + 1));
                    i36++;
                    size4 = i39;
                }
                i = -1;
            }
            this.u = new com.google.android.material.carousel.b(aVarB, arrayList, arrayList2);
        } else {
            z = zJ0;
            f = 1.0f;
            f2 = 2.0f;
            i = -1;
        }
        com.google.android.material.carousel.b bVar2 = this.u;
        boolean zJ1 = J0();
        if (zJ1) {
            List<com.google.android.material.carousel.a> list4 = bVar2.c;
            aVar = list4.get(list4.size() - 1);
        } else {
            List<com.google.android.material.carousel.a> list5 = bVar2.b;
            aVar = list5.get(list5.size() - 1);
        }
        com.google.android.material.carousel.a.b bVarC = zJ1 ? aVar.c() : aVar.a();
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            paddingStart = recyclerView.getPaddingStart();
        } else {
            paddingStart = 0;
        }
        if (zJ1) {
            i = 1;
        }
        float f34 = paddingStart * i;
        int i40 = (int) bVarC.a;
        int i41 = (int) (aVar.a / f2);
        int i42 = (int) ((f34 + (J0() ? this.n : 0)) - (J0() ? i40 + i41 : i40 - i41));
        com.google.android.material.carousel.b bVar3 = this.u;
        boolean zJ2 = J0();
        if (zJ2) {
            List<com.google.android.material.carousel.a> list6 = bVar3.b;
            aVar2 = list6.get(list6.size() - 1);
        } else {
            List<com.google.android.material.carousel.a> list7 = bVar3.c;
            aVar2 = list7.get(list7.size() - 1);
        }
        com.google.android.material.carousel.a.b bVarA = zJ2 ? aVar2.a() : aVar2.c();
        float fB = (yVar.b() - 1) * aVar2.a;
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            paddingEnd = recyclerView2.getPaddingEnd();
        } else {
            paddingEnd = 0;
        }
        float f35 = (fB + paddingEnd) * (zJ2 ? -1.0f : f);
        float f36 = bVarA.a - (J0() ? this.n : 0);
        int i43 = Math.abs(f36) > Math.abs(f35) ? 0 : (int) ((f35 - f36) + ((J0() ? 0 : this.n) - bVarA.a));
        int i44 = z ? i43 : i42;
        this.q = i44;
        if (z) {
            i43 = i42;
        }
        this.r = i43;
        if (z2) {
            this.p = i42;
        } else {
            int i45 = this.p;
            this.p = (i45 < i44 ? i44 - i45 : i45 > i43 ? i43 - i45 : 0) + i45;
        }
        this.w = C1952Ru.h(this.w, 0, yVar.b());
        O0();
        p(tVar);
        G0(tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(RecyclerView.y yVar) {
        if (v() == 0) {
            this.w = 0;
        } else {
            this.w = RecyclerView.m.F(u(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int j(@NonNull RecyclerView.y yVar) {
        return (int) this.u.a.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(@NonNull RecyclerView.y yVar) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(@NonNull RecyclerView.y yVar) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean l0(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        com.google.android.material.carousel.b bVar = this.u;
        if (bVar != null) {
            int iH0 = H0(bVar.a, RecyclerView.m.F(view)) - this.p;
            if (!z2 && iH0 != 0) {
                recyclerView.scrollBy(iH0, 0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n0(int i, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        int i2 = this.p;
        int i3 = this.q;
        int i4 = this.r;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.p = i2 + i;
        O0();
        float f = this.v.a / 2.0f;
        int iF0 = F0(RecyclerView.m.F(u(0)));
        Rect rect = new Rect();
        for (int i6 = 0; i6 < v(); i6++) {
            View viewU = u(i6);
            float fB0 = B0(iF0, (int) f);
            c cVarI0 = I0(this.v.b, fB0, false);
            float fE0 = E0(viewU, fB0, cVarI0);
            if (viewU instanceof InterfaceC5948pX0) {
                float f2 = cVarI0.a.c;
                float f3 = cVarI0.b.c;
                LinearInterpolator linearInterpolator = C7013uc.a;
                ((InterfaceC5948pX0) viewU).a();
            }
            RecyclerView.L(viewU, rect);
            viewU.offsetLeftAndRight((int) (fE0 - (rect.left + f)));
            iF0 = B0(iF0, (int) this.v.a);
        }
        G0(tVar, yVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void o0(int i) {
        com.google.android.material.carousel.b bVar = this.u;
        if (bVar == null) {
            return;
        }
        this.p = H0(bVar.a, i);
        this.w = C1952Ru.h(i, 0, Math.max(0, z() - 1));
        O0();
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void y(@NonNull View view, @NonNull Rect rect) {
        RecyclerView.L(view, rect);
        float fCenterX = rect.centerX();
        c cVarI0 = I0(this.v.b, fCenterX, true);
        com.google.android.material.carousel.a.b bVar = cVarI0.a;
        float f = bVar.d;
        com.google.android.material.carousel.a.b bVar2 = cVarI0.b;
        float fWidth = (rect.width() - C7013uc.b(f, bVar2.d, bVar.b, bVar2.b, fCenterX)) / 2.0f;
        rect.set((int) (rect.left + fWidth), rect.top, (int) (rect.right - fWidth), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void y0(RecyclerView recyclerView, int i) {
        C3683ez c3683ez = new C3683ez(this, recyclerView.getContext());
        c3683ez.a = i;
        z0(c3683ez);
    }
}
