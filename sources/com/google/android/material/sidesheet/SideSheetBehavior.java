package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.onesignal.core.activities.PermissionsActivity;
import com.pexpress.tool.R;
import defpackage.AbstractC7727y;
import defpackage.C1952Ru;
import defpackage.C2083Tl1;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C6450ru1;
import defpackage.Cd2;
import defpackage.EK;
import defpackage.Gd2;
import defpackage.IL1;
import defpackage.InterfaceC6265r2;
import defpackage.JK1;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.RJ1;
import defpackage.RunnableC4378iH;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final C6450ru1 a;
    public final NX0 b;
    public final ColorStateList c;
    public final RJ1 d;
    public final SideSheetBehavior<V>.c e;
    public final float f;
    public final boolean g;
    public int h;
    public Gd2 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public WeakReference<V> o;
    public WeakReference<View> p;
    public final int q;
    public VelocityTracker r;
    public int s;

    @NonNull
    public final LinkedHashSet t;
    public final a u;

    public class a extends Gd2.c {
        public a() {
        }

        @Override // Gd2.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return C1952Ru.h(i, sideSheetBehavior.a.a(), sideSheetBehavior.m);
        }

        @Override // Gd2.c
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // Gd2.c
        public final int getViewHorizontalDragRange(@NonNull View view) {
            return SideSheetBehavior.this.m;
        }

        @Override // Gd2.c
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // Gd2.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.p;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                C6450ru1 c6450ru1 = sideSheetBehavior.a;
                int left = view.getLeft();
                view.getRight();
                int i5 = c6450ru1.a.m;
                if (left <= i5) {
                    marginLayoutParams.rightMargin = i5 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.t;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            C6450ru1 c6450ru2 = sideSheetBehavior.a;
            SideSheetBehavior<? extends View> sideSheetBehavior2 = c6450ru2.a;
            c6450ru2.a();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((JK1) it.next()).b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0047  */
        @Override // Gd2.c
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            C6450ru1 c6450ru1 = sideSheetBehavior.a;
            c6450ru1.getClass();
            int i = 3;
            if (f >= 0.0f) {
                float right = view.getRight();
                SideSheetBehavior<? extends View> sideSheetBehavior2 = c6450ru1.a;
                if (Math.abs((sideSheetBehavior2.k * f) + right) > 0.5f) {
                    if ((Math.abs(f) > Math.abs(f2) && f2 > PermissionsActivity.DELAY_TIME_CALLBACK_CALL) || view.getLeft() > (sideSheetBehavior2.m - c6450ru1.a()) / 2) {
                        i = 5;
                    }
                } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                    int left = view.getLeft();
                    if (Math.abs(left - c6450ru1.a()) >= Math.abs(left - sideSheetBehavior2.m)) {
                        i = 5;
                    }
                } else {
                    i = 5;
                }
            }
            sideSheetBehavior.u(view, i, true);
        }

        @Override // Gd2.c
        public final boolean tryCaptureView(@NonNull View view, int i) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.o) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class c {
        public int a;
        public boolean b;
        public final RunnableC4378iH c = new RunnableC4378iH(this, 1);

        public c() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.o;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            V v = sideSheetBehavior.o.get();
            RunnableC4378iH runnableC4378iH = this.c;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            v.postOnAnimation(runnableC4378iH);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.e = new c();
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.q = -1;
        this.t = new LinkedHashSet();
        this.u = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(@NonNull CoordinatorLayout.f fVar) {
        this.o = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.o = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        Gd2 gd2;
        VelocityTracker velocityTracker;
        if ((!v.isShown() && Cd2.d(v) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.r) != null) {
            velocityTracker.recycle();
            this.r = null;
        }
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
        this.r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (gd2 = this.i) == null || !gd2.p(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        int i2;
        int i3;
        View viewFindViewById;
        NX0 nx0 = this.b;
        C6450ru1 c6450ru1 = this.a;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.o == null) {
            this.o = new WeakReference<>(v);
            if (nx0 != null) {
                v.setBackground(nx0);
                float fI = this.f;
                if (fI == -1.0f) {
                    fI = Cd2.d.i(v);
                }
                nx0.k(fI);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    Cd2.d.q(v, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (v.getVisibility() != i4) {
                v.setVisibility(i4);
            }
            v();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            if (Cd2.d(v) == null) {
                Cd2.m(v, v.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.i == null) {
            this.i = new Gd2(coordinatorLayout.getContext(), coordinatorLayout, this.u);
        }
        c6450ru1.getClass();
        int left2 = v.getLeft() - c6450ru1.a.n;
        coordinatorLayout.r(v, i);
        this.m = coordinatorLayout.getWidth();
        this.l = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            c6450ru1.getClass();
            i2 = marginLayoutParams.rightMargin;
        } else {
            i2 = 0;
        }
        this.n = i2;
        int i5 = this.h;
        if (i5 == 1 || i5 == 2) {
            c6450ru1.getClass();
            left = left2 - (v.getLeft() - c6450ru1.a.n);
        } else if (i5 != 3) {
            if (i5 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            left = c6450ru1.a.m;
        }
        v.offsetLeftAndRight(left);
        if (this.p == null && (i3 = this.q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.p = new WeakReference<>(viewFindViewById);
        }
        for (JK1 jk1 : this.t) {
            if (jk1 instanceof IL1) {
                ((IL1) jk1).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(@NonNull View view, @NonNull Parcelable parcelable) {
        int i = ((b) parcelable).g;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final Parcelable o(@NonNull View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new b(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.r) != null) {
            velocityTracker.recycle();
            this.r = null;
        }
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
        this.r.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float fAbs = Math.abs(this.s - motionEvent.getX());
            Gd2 gd2 = this.i;
            if (fAbs > gd2.b) {
                gd2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void s(int i) {
        V v;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference<V> weakReference = this.o;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((JK1) it.next()).a();
        }
        v();
    }

    public final boolean t() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void u(View view, int i, boolean z) {
        int iA;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a.a;
        if (i == 3) {
            iA = sideSheetBehavior.a.a();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(EK.e(i, "Invalid state to get outer edge offset: "));
            }
            iA = sideSheetBehavior.a.a.m;
        }
        Gd2 gd2 = sideSheetBehavior.i;
        if (gd2 == null || (!z ? gd2.q(view, iA, view.getTop()) : gd2.o(iA, view.getTop()))) {
            s(i);
        } else {
            s(2);
            this.e.a(i);
        }
    }

    public final void v() {
        V v;
        WeakReference<V> weakReference = this.o;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        Cd2.i(v, 262144);
        Cd2.g(v, 0);
        Cd2.i(v, 1048576);
        Cd2.g(v, 0);
        final int i = 5;
        if (this.h != 5) {
            Cd2.j(v, C5426n2.a.j, new InterfaceC6265r2() { // from class: GL1
                @Override // defpackage.InterfaceC6265r2
                public final boolean a(View view) {
                    final SideSheetBehavior sideSheetBehavior = this.a;
                    sideSheetBehavior.getClass();
                    final int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(C5807oq.b(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.o;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.s(i2);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.o.get();
                    Runnable runnable = new Runnable() { // from class: HL1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                            View view3 = (View) sideSheetBehavior2.o.get();
                            if (view3 != null) {
                                sideSheetBehavior2.u(view3, i2, false);
                            }
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        if (view2.isAttachedToWindow()) {
                            view2.post(runnable);
                            return true;
                        }
                    }
                    runnable.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            Cd2.j(v, C5426n2.a.h, new InterfaceC6265r2() { // from class: GL1
                @Override // defpackage.InterfaceC6265r2
                public final boolean a(View view) {
                    final SideSheetBehavior sideSheetBehavior = this.a;
                    sideSheetBehavior.getClass();
                    final int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        throw new IllegalArgumentException(C5807oq.b(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.o;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.s(i3);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.o.get();
                    Runnable runnable = new Runnable() { // from class: HL1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                            View view3 = (View) sideSheetBehavior2.o.get();
                            if (view3 != null) {
                                sideSheetBehavior2.u(view3, i3, false);
                            }
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        if (view2.isAttachedToWindow()) {
                            view2.post(runnable);
                            return true;
                        }
                    }
                    runnable.run();
                    return true;
                }
            });
        }
    }

    public static class b extends AbstractC7727y {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int g;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new b[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt();
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g);
        }

        public b(@NonNull SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.g = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new c();
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.q = -1;
        this.t = new LinkedHashSet();
        this.u = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.J);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = MX0.b(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = RJ1.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.q = resourceId;
            WeakReference<View> weakReference = this.p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.p = null;
            WeakReference<V> weakReference2 = this.o;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    if (v.isLaidOut()) {
                        v.requestLayout();
                    }
                }
            }
        }
        RJ1 rj1 = this.d;
        if (rj1 != null) {
            NX0 nx0 = new NX0(rj1);
            this.b = nx0;
            nx0.j(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.a == null) {
            this.a = new C6450ru1(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
