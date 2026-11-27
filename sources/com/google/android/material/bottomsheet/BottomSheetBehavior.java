package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.onesignal.core.activities.PermissionsActivity;
import com.pexpress.tool.R;
import defpackage.AbstractC7727y;
import defpackage.C1952Ru;
import defpackage.C2083Tl1;
import defpackage.C3040bu;
import defpackage.C3249cu;
import defpackage.C3458du;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C5807oq;
import defpackage.Cd2;
import defpackage.EK;
import defpackage.Fe2;
import defpackage.Gd2;
import defpackage.MA0;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.R1;
import defpackage.RJ1;
import defpackage.Vi2;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.e A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public Gd2 M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;

    @NonNull
    public final ArrayList<c> W;
    public VelocityTracker X;
    public int Y;
    public int Z;
    public final int a;
    public boolean a0;
    public boolean b;
    public HashMap b0;
    public final float c;
    public final SparseIntArray c0;
    public final int d;
    public final b d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final NX0 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final RJ1 y;
    public boolean z;

    public class a implements Runnable {
        public final /* synthetic */ View d;
        public final /* synthetic */ int e;

        public a(View view, int i) {
            this.d = view;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.F(this.d, this.e, false);
        }
    }

    public class b extends Gd2.c {
        public b() {
        }

        @Override // Gd2.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // Gd2.c
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return C1952Ru.h(i, BottomSheetBehavior.this.y(), getViewVerticalDragRange(view));
        }

        @Override // Gd2.c
        public final int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
        }

        @Override // Gd2.c
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        @Override // Gd2.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.u(i2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0085  */
        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        @Override // Gd2.c
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (bottomSheetBehavior.b) {
                    i = 3;
                } else {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    bottomSheetBehavior.getClass();
                    if (top <= bottomSheetBehavior.E) {
                        i = 3;
                    }
                }
            } else if (bottomSheetBehavior.I && bottomSheetBehavior.E(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                    if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.T) / 2) {
                        i = 5;
                    } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.y()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                        i = 3;
                    }
                } else {
                    i = 5;
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.b) {
                    int i2 = bottomSheetBehavior.E;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                            i = 3;
                        } else {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (bottomSheetBehavior.b) {
                i = 4;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                    bottomSheetBehavior.getClass();
                } else {
                    i = 4;
                }
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.F(view, i, true);
        }

        @Override // Gd2.c
        public final boolean tryCaptureView(@NonNull View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.L;
            if (i2 == 1 || bottomSheetBehavior.a0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.Y == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public void a(@NonNull View view) {
        }

        public abstract void b(@NonNull View view);

        public abstract void c(@NonNull View view, int i);
    }

    public class e {
        public int a;
        public boolean b;
        public final a c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                Gd2 gd2 = bottomSheetBehavior.M;
                if (gd2 != null && gd2.f()) {
                    eVar.a(eVar.a);
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.D(eVar.a);
                }
            }
        }

        public e() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            V v = bottomSheetBehavior.U.get();
            a aVar = this.c;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            v.postOnAnimation(aVar);
            this.b = true;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.c0 = new SparseIntArray();
        this.d0 = new b();
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (Cd2.d.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewV = v(viewGroup.getChildAt(i));
            if (viewV != null) {
                return viewV;
            }
        }
        return null;
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> w(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int x(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                C(4);
            }
            G();
        }
    }

    public final void B(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        J();
    }

    public final void C(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(C5807oq.b(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            b0.e("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && z(i) <= this.D) ? 3 : i;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            D(i);
            return;
        }
        V v = this.U.get();
        a aVar = new a(v, i2);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (v.isAttachedToWindow()) {
                v.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    public final void D(int i) {
        V v;
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            I(true);
        } else if (i == 6 || i == 5 || i == 4) {
            I(false);
        }
        H(i, true);
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i2 >= arrayList.size()) {
                G();
                return;
            } else {
                arrayList.get(i2).c(v, i);
                i2++;
            }
        }
    }

    public final boolean E(@NonNull View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    public final void F(View view, int i, boolean z) {
        int iZ = z(i);
        Gd2 gd2 = this.M;
        if (gd2 == null || (!z ? gd2.q(view, view.getLeft(), iZ) : gd2.o(view.getLeft(), iZ))) {
            D(i);
            return;
        }
        D(2);
        H(i, true);
        this.A.a(i);
    }

    public final void G() {
        V v;
        int iA;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        Cd2.i(v, 524288);
        Cd2.g(v, 0);
        Cd2.i(v, 262144);
        Cd2.g(v, 0);
        Cd2.i(v, 1048576);
        Cd2.g(v, 0);
        SparseIntArray sparseIntArray = this.c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            Cd2.i(v, i);
            Cd2.g(v, 0);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.L != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C3458du c3458du = new C3458du(this, 6);
            ArrayList arrayListE = Cd2.e(v);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListE.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        int i5 = Cd2.d[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListE.size(); i6++) {
                            z &= ((C5426n2.a) arrayListE.get(i6)).a() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                    }
                    iA = i3;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C5426n2.a) arrayListE.get(i2)).a).getLabel())) {
                    iA = ((C5426n2.a) arrayListE.get(i2)).a();
                    break;
                }
                i2++;
            }
            if (iA != -1) {
                C5426n2.a aVar = new C5426n2.a(null, iA, string, c3458du, null);
                View.AccessibilityDelegate accessibilityDelegateC = Cd2.c(v);
                R1 r1 = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof R1.a ? ((R1.a) accessibilityDelegateC).a : new R1(accessibilityDelegateC);
                if (r1 == null) {
                    r1 = new R1();
                }
                Cd2.l(v, r1);
                Cd2.i(v, aVar.a());
                Cd2.e(v).add(aVar);
                Cd2.g(v, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I && this.L != 5) {
            Cd2.j(v, C5426n2.a.j, new C3458du(this, 5));
        }
        int i7 = this.L;
        if (i7 == 3) {
            Cd2.j(v, C5426n2.a.i, new C3458du(this, this.b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            Cd2.j(v, C5426n2.a.h, new C3458du(this, this.b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            Cd2.j(v, C5426n2.a.i, new C3458du(this, 4));
            Cd2.j(v, C5426n2.a.h, new C3458du(this, 3));
        }
    }

    public final void H(int i, boolean z) {
        NX0 nx0 = this.i;
        ValueAnimator valueAnimator = this.B;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || y() == 0);
        if (this.z == z2 || nx0 == null) {
            return;
        }
        this.z = z2;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            nx0.m(this.z ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
            return;
        }
        float f = z2 ? 0.0f : 1.0f;
        valueAnimator.setFloatValues(1.0f - f, f);
        valueAnimator.start();
    }

    public final void I(boolean z) {
        WeakReference<V> weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.b0 != null) {
                    return;
                } else {
                    this.b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.b0 = null;
        }
    }

    public final void J() {
        V v;
        if (this.U != null) {
            s();
            if (this.L != 4 || (v = this.U.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(@NonNull CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        Gd2 gd2;
        if (!v.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference<View> weakReference = this.V;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.p(view, x, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.p(v, x, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (this.N || (gd2 = this.M) == null || !gd2.p(motionEvent)) {
            WeakReference<View> weakReference2 = this.V;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Z - motionEvent.getY()) <= this.M.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        NX0 nx0 = this.i;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            boolean z = (i3 < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                Fe2.a(v, new C3249cu(this, z));
            }
            MA0 ma0 = new MA0(v);
            if (i3 >= 30) {
                v.setWindowInsetsAnimationCallback(new Vi2.d.a(ma0));
            } else {
                PathInterpolator pathInterpolator = Vi2.c.e;
                Object tag = v.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener aVar = new Vi2.c.a(v, ma0);
                v.setTag(R.id.tag_window_insets_animation_callback, aVar);
                if (tag == null) {
                    v.setOnApplyWindowInsetsListener(aVar);
                }
            }
            this.U = new WeakReference<>(v);
            if (nx0 != null) {
                v.setBackground(nx0);
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = Cd2.d.i(v);
                }
                nx0.k(fI);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    Cd2.d.q(v, colorStateList);
                }
            }
            G();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new Gd2(coordinatorLayout.getContext(), coordinatorLayout, this.d0);
        }
        int top = v.getTop();
        coordinatorLayout.r(v, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.R = height;
        int i4 = this.T;
        int i5 = i4 - height;
        int i6 = this.w;
        if (i5 < i6) {
            if (this.r) {
                this.R = i4;
            } else {
                this.R = i4 - i6;
            }
        }
        this.D = Math.max(0, i4 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i7 = this.L;
        if (i7 == 3) {
            v.offsetTopAndBottom(y());
        } else if (i7 == 6) {
            v.offsetTopAndBottom(this.E);
        } else if (this.I && i7 == 5) {
            v.offsetTopAndBottom(this.T);
        } else if (i7 == 4) {
            v.offsetTopAndBottom(this.G);
        } else if (i7 == 1 || i7 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        H(this.L, false);
        this.V = new WeakReference<>(v(v));
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i2 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i2).a(v);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), x(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(@NonNull View view) {
        WeakReference<View> weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        boolean z = this.K;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < y()) {
                int iY = top - y();
                iArr[1] = iY;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                v.offsetTopAndBottom(-iY);
                D(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                v.offsetTopAndBottom(-i2);
                D(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.G;
            if (i4 > i5 && !this.I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                v.offsetTopAndBottom(-i6);
                D(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, C5345me2> weakHashMap4 = Cd2.a;
                v.offsetTopAndBottom(-i2);
                D(1);
            }
        }
        u(v.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(@NonNull View view, @NonNull Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = dVar.h;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = dVar.i;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = dVar.j;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = dVar.k;
            }
        }
        int i2 = dVar.g;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final Parcelable o(@NonNull View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == y()) {
            D(3);
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (weakReference != null && view == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.b && v.getTop() > this.E) {
                    i3 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.c);
                    yVelocity = this.X.getYVelocity(this.Y);
                }
                if (E(v, yVelocity)) {
                    i3 = 5;
                } else if (this.O == 0) {
                    top2 = v.getTop();
                    if (this.b) {
                        i2 = this.E;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = v.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.O == 0) {
                top2 = v.getTop();
                if (this.b) {
                    i2 = this.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = v.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            F(v, i3, false);
            this.P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        Gd2 gd2 = this.M;
        if (gd2 != null && (this.K || i == 1)) {
            gd2.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            Gd2 gd3 = this.M;
            if (fAbs > gd3.b) {
                gd3.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int iT = t();
        if (this.b) {
            this.G = Math.max(this.T - iT, this.D);
        } else {
            this.G = this.T - iT;
        }
    }

    public final int t() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v;
        }
        return (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void u(int i) {
        V v = this.U.get();
        if (v != null) {
            ArrayList<c> arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != y()) {
                y();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).b(v);
            }
        }
    }

    public final int y() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int z(int i) {
        if (i == 3) {
            return y();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(EK.e(i, "Invalid state to get top offset: "));
    }

    public static class d extends AbstractC7727y {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public final int g;
        public final int h;
        public final boolean i;
        public final boolean j;
        public final boolean k;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final d createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1;
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
        }

        public d(@NonNull BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.g = bottomSheetBehavior.L;
            this.h = bottomSheetBehavior.e;
            this.i = bottomSheetBehavior.b;
            this.j = bottomSheetBehavior.I;
            this.k = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.c0 = new SparseIntArray();
        this.d0 = new b();
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = MX0.b(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.y = RJ1.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        RJ1 rj1 = this.y;
        if (rj1 != null) {
            NX0 nx0 = new NX0(rj1);
            this.i = nx0;
            nx0.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new C3040bu(this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            B(i);
        } else {
            B(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        A(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.b != z) {
            this.b = z;
            if (this.U != null) {
                s();
            }
            D((this.b && this.L == 6) ? 3 : this.L);
            H(this.L, true);
            G();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.C = i2;
                    H(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    H(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(11, PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
            this.o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, @NonNull int[] iArr) {
    }
}
