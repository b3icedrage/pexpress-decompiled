package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pexpress.tool.R;
import defpackage.BY;
import defpackage.C0564Aa;
import defpackage.C1033Ga0;
import defpackage.C1089Gt;
import defpackage.C1556Mt;
import defpackage.C2083Tl1;
import defpackage.C2174Uq;
import defpackage.C2703aM1;
import defpackage.C2990bf2;
import defpackage.C3451dr1;
import defpackage.C5134lf0;
import defpackage.C5345me2;
import defpackage.C5347mf0;
import defpackage.C5552ne;
import defpackage.C5977pf0;
import defpackage.C6182qe;
import defpackage.C6683t11;
import defpackage.C6796ta0;
import defpackage.C7001uY1;
import defpackage.Cd2;
import defpackage.Fe2;
import defpackage.InterfaceC5280mK1;
import defpackage.InterfaceC6586sa0;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.RJ1;
import defpackage.ViewTreeObserverOnPreDrawListenerC5767of0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends C2990bf2 implements InterfaceC6586sa0, InterfaceC5280mK1, CoordinatorLayout.b {
    public ColorStateList e;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public final Rect p;
    public final Rect q;

    @NonNull
    public final C6182qe r;

    @NonNull
    public final C6796ta0 s;
    public C5977pf0 t;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.b.f {
        @Override // com.google.android.material.floatingactionbutton.b.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.b.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.p = new Rect();
        this.q = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = C7001uY1.d(context2, attributeSet, C2083Tl1.n, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = MX0.b(context2, typedArrayD, 1);
        this.g = Fe2.d(typedArrayD.getInt(2, -1), null);
        this.j = MX0.b(context2, typedArrayD, 12);
        this.k = typedArrayD.getInt(7, -1);
        this.l = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, 0.0f);
        float dimension2 = typedArrayD.getDimension(9, 0.0f);
        float dimension3 = typedArrayD.getDimension(11, 0.0f);
        this.o = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        C6683t11 c6683t11A = C6683t11.a(context2, typedArrayD, 15);
        C6683t11 c6683t11A2 = C6683t11.a(context2, typedArrayD, 8);
        C3451dr1 c3451dr1 = RJ1.m;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C2083Tl1.z, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        RJ1 rj1A = RJ1.a(context2, resourceId, resourceId2, c3451dr1).a();
        boolean z = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        C6182qe c6182qe = new C6182qe(this);
        this.r = c6182qe;
        c6182qe.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.s = new C6796ta0(this);
        getImpl().n(rj1A);
        getImpl().g(this.e, this.g, this.j, dimensionPixelSize);
        getImpl().k = dimensionPixelSize2;
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.h != dimension) {
            impl.h = dimension;
            impl.k(dimension, impl.i, impl.j);
        }
        com.google.android.material.floatingactionbutton.b impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.k(impl2.h, dimension2, impl2.j);
        }
        com.google.android.material.floatingactionbutton.b impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.k(impl3.h, impl3.i, dimension3);
        }
        getImpl().m = c6683t11A;
        getImpl().n = c6683t11A2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.t == null) {
            this.t = new C5977pf0(this, new b());
        }
        return this.t;
    }

    @Override // defpackage.InterfaceC6586sa0
    public final boolean a() {
        return this.s.b;
    }

    public final void d() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList<>();
        }
        impl.t.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(@NonNull C2174Uq c2174Uq) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList<>();
        }
        impl.s.add(c2174Uq);
    }

    public final void f() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        c cVar = new c();
        if (impl.u == null) {
            impl.u = new ArrayList<>();
        }
        impl.u.add(cVar);
    }

    public final int g(int i) {
        int i2 = this.l;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.l;
    }

    public int getExpandedComponentIdHint() {
        return this.s.c;
    }

    public C6683t11 getHideMotionSpec() {
        return getImpl().n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.j;
    }

    @NonNull
    public RJ1 getShapeAppearanceModel() {
        RJ1 rj1 = getImpl().a;
        rj1.getClass();
        return rj1;
    }

    public C6683t11 getShowMotionSpec() {
        return getImpl().m;
    }

    public int getSize() {
        return this.k;
    }

    public int getSizeDimension() {
        return g(this.k);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.h;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.i;
    }

    public boolean getUseCompatPadding() {
        return this.o;
    }

    public final void h(C1556Mt c1556Mt, boolean z) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar = c1556Mt == null ? null : new com.google.android.material.floatingactionbutton.a(this, c1556Mt);
        if (impl.v.getVisibility() == 0) {
            if (impl.r == 1) {
                return;
            }
        } else if (impl.r != 2) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        FloatingActionButton floatingActionButton = impl.v;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            floatingActionButton.b(z ? 8 : 4, z);
            if (aVar != null) {
                aVar.a.a(aVar.b);
                return;
            }
            return;
        }
        C6683t11 c6683t11 = impl.n;
        AnimatorSet animatorSetB = c6683t11 != null ? impl.b(c6683t11, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, com.google.android.material.floatingactionbutton.b.F, com.google.android.material.floatingactionbutton.b.G);
        animatorSetB.addListener(new C5134lf0(impl, z, aVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.v.getVisibility() == 0) {
            if (impl.r != 1) {
                return false;
            }
        } else if (impl.r == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.v.getVisibility() != 0) {
            if (impl.r != 2) {
                return false;
            }
        } else if (impl.r == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(@NonNull Rect rect) {
        int i = rect.left;
        Rect rect2 = this.p;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.h;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.i;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C5552ne.c(colorForState, mode));
    }

    public final void m(C1556Mt.a aVar, boolean z) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.v.getVisibility() != 0) {
            if (impl.r == 2) {
                return;
            }
        } else if (impl.r != 1) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.m == null;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        FloatingActionButton floatingActionButton = impl.v;
        boolean z3 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.A;
        if (!z3) {
            floatingActionButton.b(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        C6683t11 c6683t11 = impl.m;
        AnimatorSet animatorSetB = c6683t11 != null ? impl.b(c6683t11, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, com.google.android.material.floatingactionbutton.b.D, com.google.android.material.floatingactionbutton.b.E);
        animatorSetB.addListener(new C5347mf0(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        NX0 nx0 = impl.b;
        FloatingActionButton floatingActionButton = impl.v;
        if (nx0 != null) {
            C0564Aa.x(floatingActionButton, nx0);
        }
        if (impl instanceof C5977pf0) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.B == null) {
            impl.B = new ViewTreeObserverOnPreDrawListenerC5767of0(impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.B);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.v.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC5767of0 viewTreeObserverOnPreDrawListenerC5767of0 = impl.B;
        if (viewTreeObserverOnPreDrawListenerC5767of0 != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC5767of0);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.m = (sizeDimension - this.n) / 2;
        getImpl().q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.p;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1033Ga0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1033Ga0 c1033Ga0 = (C1033Ga0) parcelable;
        super.onRestoreInstanceState(c1033Ga0.d);
        Bundle orDefault = c1033Ga0.g.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        C6796ta0 c6796ta0 = this.s;
        c6796ta0.getClass();
        c6796ta0.b = orDefault.getBoolean("expanded", false);
        c6796ta0.c = orDefault.getInt("expandedComponentIdHint", 0);
        if (c6796ta0.b) {
            View view = c6796ta0.a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C1033Ga0 c1033Ga0 = new C1033Ga0(parcelableOnSaveInstanceState);
        C2703aM1<String, Bundle> c2703aM1 = c1033Ga0.g;
        C6796ta0 c6796ta0 = this.s;
        c6796ta0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c6796ta0.b);
        bundle.putInt("expandedComponentIdHint", c6796ta0.c);
        c2703aM1.put("expandableWidgetHelper", bundle);
        return c1033Ga0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (isLaidOut()) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.q;
                rect.set(0, 0, width, height);
                k(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            com.google.android.material.floatingactionbutton.b impl = getImpl();
            NX0 nx0 = impl.b;
            if (nx0 != null) {
                nx0.setTintList(colorStateList);
            }
            C1089Gt c1089Gt = impl.d;
            if (c1089Gt != null) {
                if (colorStateList != null) {
                    c1089Gt.m = colorStateList.getColorForState(c1089Gt.getState(), c1089Gt.m);
                }
                c1089Gt.p = colorStateList;
                c1089Gt.n = true;
                c1089Gt.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            NX0 nx0 = getImpl().b;
            if (nx0 != null) {
                nx0.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.k(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.k(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.k(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.l) {
            this.l = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        NX0 nx0 = getImpl().b;
        if (nx0 != null) {
            nx0.k(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.s.c = i;
    }

    public void setHideMotionSpec(C6683t11 c6683t11) {
        getImpl().n = c6683t11;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C6683t11.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            com.google.android.material.floatingactionbutton.b impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.h != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.r.c(i);
        l();
    }

    public void setMaxImageSize(int i) {
        this.n = i;
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<com.google.android.material.floatingactionbutton.b.f> arrayList = getImpl().u;
        if (arrayList != null) {
            Iterator<com.google.android.material.floatingactionbutton.b.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<com.google.android.material.floatingactionbutton.b.f> arrayList = getImpl().u;
        if (arrayList != null) {
            Iterator<com.google.android.material.floatingactionbutton.b.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        impl.g = z;
        impl.q();
    }

    @Override // defpackage.InterfaceC5280mK1
    public void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        getImpl().n(rj1);
    }

    public void setShowMotionSpec(C6683t11 c6683t11) {
        getImpl().m = c6683t11;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C6683t11.b(getContext(), i));
    }

    public void setSize(int i) {
        this.l = 0;
        if (i != this.k) {
            this.k = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.o != z) {
            this.o = z;
            getImpl().i();
        }
    }

    @Override // defpackage.C2990bf2, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(@NonNull View view, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.p;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListE = coordinatorLayout.e(floatingActionButton);
            int size = arrayListE.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListE.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            Rect rect = floatingActionButton.p;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!(this.b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            BY.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
            } else {
                floatingActionButton.m(null, false);
            }
            return true;
        }

        public final boolean t(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!(this.b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
            } else {
                floatingActionButton.m(null, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.o);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            getImpl().m(this.j);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }
}
