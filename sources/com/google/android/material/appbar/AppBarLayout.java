package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.AbstractC2010Sn0;
import defpackage.AbstractC2166Un0;
import defpackage.AbstractC7727y;
import defpackage.C0564Aa;
import defpackage.C1353Kd;
import defpackage.C1952Ru;
import defpackage.C2083Tl1;
import defpackage.C3006bj2;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C7001uY1;
import defpackage.C7013uc;
import defpackage.C7103v11;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.InterfaceC3282d31;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.R1;
import defpackage.Re2;
import defpackage.Yd2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final /* synthetic */ int B = 0;
    public Behavior A;
    public int d;
    public int e;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public C3006bj2 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public WeakReference<View> q;
    public final ColorStateList r;
    public ValueAnimator s;
    public final ValueAnimator.AnimatorUpdateListener t;
    public final ArrayList u;
    public final long v;
    public final TimeInterpolator w;
    public int[] x;
    public Drawable y;
    public final float z;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC2010Sn0<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public b m;
        public WeakReference<View> n;
        public boolean o;

        public class a extends R1 {
            public a() {
            }

            @Override // defpackage.R1
            public final void d(View view, @NonNull C5426n2 c5426n2) {
                this.a.onInitializeAccessibilityNodeInfo(view, c5426n2.a);
                c5426n2.l(BaseBehavior.this.o);
                c5426n2.i(ScrollView.class.getName());
            }
        }

        public static class b extends AbstractC7727y {
            public static final Parcelable.Creator<b> CREATOR = new a();
            public boolean g;
            public boolean h;
            public int i;
            public float j;
            public boolean k;

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
                this.g = parcel.readByte() != 0;
                this.h = parcel.readByte() != 0;
                this.i = parcel.readInt();
                this.j = parcel.readFloat();
                this.k = parcel.readByte() != 0;
            }

            @Override // defpackage.AbstractC7727y, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.i);
                parcel.writeFloat(this.j);
                parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static View D(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC3282d31) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005d  */
        public static void I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((c) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    } else {
                        zF = true;
                    }
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (appBarLayout.o) {
                zF = appBarLayout.f(D(coordinatorLayout));
            }
            boolean zE = appBarLayout.e(zF);
            if (!z) {
                if (zE) {
                    ArrayList<View> orDefault = coordinatorLayout.e.b.getOrDefault(appBarLayout, null);
                    ArrayList arrayList = coordinatorLayout.h;
                    arrayList.clear();
                    if (orDefault != null) {
                        arrayList.addAll(orDefault);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        public final void B(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(t() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iT = t();
            if (iT == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(C7013uc.e);
                this.l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iT, i);
            this.l.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void E(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, t() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.o) {
                appBarLayout2.e(appBarLayout2.f(view));
            }
        }

        public final b F(Parcelable parcelable, @NonNull T t) {
            int iS = s();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC7727y.e;
                    }
                    b bVar = new b(parcelable);
                    boolean z = iS == 0;
                    bVar.h = z;
                    bVar.g = !z && (-iS) >= t.getTotalScrollRange();
                    bVar.i = i;
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    bVar.k = bottom == t.getTopInset() + childAt.getMinimumHeight();
                    bVar.j = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int iT = t() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i2 = -iT;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i3 = cVar2.a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        if (t.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= t.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iT < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iT < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    B(coordinatorLayout, t, C1952Ru.h(topInset + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
        public final void H(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            View childAt;
            BaseBehavior<T> baseBehavior;
            Cd2.i(coordinatorLayout, C5426n2.a.f.a());
            boolean z = false;
            Cd2.g(coordinatorLayout, 0);
            Cd2.i(coordinatorLayout, C5426n2.a.g.a());
            Cd2.g(coordinatorLayout, 0);
            if (t.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = coordinatorLayout.getChildAt(i);
                    if (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                        break;
                    } else {
                        i++;
                    }
                }
                View view = childAt;
                if (view != null) {
                    int childCount2 = t.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        if (((c) t.getChildAt(i2).getLayoutParams()).a != 0) {
                            if (Cd2.c(coordinatorLayout) == null) {
                                Cd2.l(coordinatorLayout, new a());
                            }
                            boolean z2 = true;
                            if (t() != (-t.getTotalScrollRange())) {
                                Cd2.j(coordinatorLayout, C5426n2.a.f, new com.google.android.material.appbar.c(t, false));
                                z = true;
                            }
                            if (t() == 0) {
                                baseBehavior = this;
                                z2 = z;
                            } else if (view.canScrollVertically(-1)) {
                                int i3 = -t.getDownNestedPreScrollRange();
                                if (i3 != 0) {
                                    baseBehavior = this;
                                    Cd2.j(coordinatorLayout, C5426n2.a.g, new com.google.android.material.appbar.b(baseBehavior, coordinatorLayout, t, view, i3));
                                } else {
                                    baseBehavior = this;
                                    z2 = z;
                                }
                            } else {
                                baseBehavior = this;
                                Cd2.j(coordinatorLayout, C5426n2.a.g, new com.google.android.material.appbar.c(t, true));
                            }
                            baseBehavior.o = z2;
                            return;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r7v13, types: [Ld] */
        @Override // defpackage.Xd2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            int iRound;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.m;
            if (bVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            B(coordinatorLayout, appBarLayout, i2);
                        } else {
                            A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            B(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (bVar.g) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (bVar.h) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(bVar.i);
                int i3 = -childAt.getBottom();
                if (this.m.k) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.m.j) + i3;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.j = 0;
            this.m = null;
            int iH = C1952Ru.h(s(), -appBarLayout.getTotalScrollRange(), 0);
            Yd2 yd2 = this.a;
            if (yd2 == null) {
                this.b = iH;
            } else if (yd2.d != iH) {
                yd2.d = iH;
                yd2.a();
            }
            I(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.d = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                appBarLayout.postInvalidateOnAnimation();
            }
            H(coordinatorLayout, appBarLayout);
            final View viewD = D(coordinatorLayout);
            if (viewD != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    viewD.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: Ld
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = this.a;
                            View view3 = viewD;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                    return true;
                }
                viewD.setOnKeyListener(new View.OnKeyListener() { // from class: Md
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i4, KeyEvent keyEvent) {
                        View view3 = viewD;
                        AppBarLayout appBarLayout2 = appBarLayout;
                        this.d.getClass();
                        AppBarLayout.BaseBehavior.C(keyEvent, view3, appBarLayout2);
                        return false;
                    }
                });
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, t() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0) {
                H(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(@NonNull View view, Parcelable parcelable) {
            if (parcelable instanceof b) {
                this.m = (b) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(@NonNull View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b bVarF = F(absSavedState, (AppBarLayout) view);
            return bVarF == null ? absSavedState : bVarF;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.o || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.o) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.n = new WeakReference<>(view2);
        }

        @Override // defpackage.Xd2
        public final int t() {
            return s() + this.j;
        }

        @Override // defpackage.AbstractC2010Sn0
        public final boolean v(View view) {
            WeakReference<View> weakReference = this.n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // defpackage.AbstractC2010Sn0
        public final int w(@NonNull View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // defpackage.AbstractC2010Sn0
        public final int x(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // defpackage.AbstractC2010Sn0
        public final void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.o) {
                appBarLayout.e(appBarLayout.f(D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:65:0x014e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0155  */
        @Override // defpackage.AbstractC2010Sn0
        public final int z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            int top;
            boolean z;
            int i4;
            b bVar;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iT = t();
            int i5 = 0;
            if (i2 == 0 || iT < i2 || iT > i3) {
                this.j = 0;
            } else {
                int iH = C1952Ru.h(i, i2, i3);
                if (iT != iH) {
                    if (!appBarLayout.i) {
                        top = iH;
                        break;
                    }
                    int iAbs = Math.abs(iH);
                    int childCount = appBarLayout.getChildCount();
                    int i6 = 0;
                    while (true) {
                        if (i6 < childCount) {
                            View childAt = appBarLayout.getChildAt(i6);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i6++;
                            } else if (interpolator != null) {
                                int i7 = cVar.a;
                                if ((i7 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                    if ((i7 & 2) != 0) {
                                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iH);
                                    break;
                                }
                            }
                        }
                        top = iH;
                        break;
                    }
                    Yd2 yd2 = this.a;
                    if (yd2 != null) {
                        if (yd2.d != top) {
                            yd2.d = top;
                            yd2.a();
                            z = true;
                        }
                        int i8 = iT - iH;
                        this.j = iH - top;
                        if (z) {
                            for (i4 = 0; i4 < appBarLayout.getChildCount(); i4++) {
                                c cVar2 = (c) appBarLayout.getChildAt(i4).getLayoutParams();
                                bVar = cVar2.b;
                                if (bVar == null && (cVar2.a & 1) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i4);
                                    float fS = s();
                                    Rect rect = bVar.a;
                                    childAt2.getDrawingRect(rect);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                    rect.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect.top - Math.abs(fS);
                                    if (fAbs <= 0.0f) {
                                        float fAbs2 = Math.abs(fAbs / rect.height());
                                        float f2 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
                                        float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (f2 * f2)));
                                        childAt2.setTranslationY(fHeight);
                                        Rect rect2 = bVar.b;
                                        childAt2.getDrawingRect(rect2);
                                        rect2.offset(0, (int) (-fHeight));
                                        WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                                        childAt2.setClipBounds(rect2);
                                    } else {
                                        WeakHashMap<View, C5345me2> weakHashMap4 = Cd2.a;
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                    }
                                }
                            }
                        }
                        if (!z && appBarLayout.i) {
                            coordinatorLayout.c(appBarLayout);
                        }
                        appBarLayout.d = s();
                        if (!appBarLayout.willNotDraw()) {
                            WeakHashMap<View, C5345me2> weakHashMap5 = Cd2.a;
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        I(coordinatorLayout, appBarLayout, iH, iH < iT ? -1 : 1, false);
                        i5 = i8;
                    } else {
                        this.b = top;
                    }
                    z = false;
                    int i9 = iT - iH;
                    this.j = iH - top;
                    if (z) {
                        while (i4 < appBarLayout.getChildCount()) {
                            c cVar3 = (c) appBarLayout.getChildAt(i4).getLayoutParams();
                            bVar = cVar3.b;
                            if (bVar == null) {
                            }
                        }
                    }
                    if (!z) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.d = s();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, C5345me2> weakHashMap6 = Cd2.a;
                        appBarLayout.postInvalidateOnAnimation();
                    }
                    I(coordinatorLayout, appBarLayout, iH, iH < iT ? -1 : 1, false);
                    i5 = i9;
                }
            }
            H(coordinatorLayout, appBarLayout);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC2166Un0 {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            int iH;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j + this.e;
                if (this.f == 0) {
                    iH = 0;
                } else {
                    float fW = w(view2);
                    int i = this.f;
                    iH = C1952Ru.h((int) (fW * i), 0, i);
                }
                int i2 = bottom - iH;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o) {
                    appBarLayout.e(appBarLayout.f(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            if (view instanceof AppBarLayout) {
                Cd2.i(coordinatorLayout, C5426n2.a.f.a());
                Cd2.g(coordinatorLayout, 0);
                Cd2.i(coordinatorLayout, C5426n2.a.g.a());
                Cd2.g(coordinatorLayout, 0);
                Cd2.l(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.AbstractC2166Un0
        public final AppBarLayout v(@NonNull ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.AbstractC2166Un0
        public final float w(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
                int iT = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).t() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iT > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iT / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.AbstractC2166Un0
        public final int x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.G);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {
        public int a;
        public b b;
        public Interpolator c;
    }

    public interface d {
        void a();
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.e = -1;
        this.g = -1;
        this.h = -1;
        this.j = 0;
        this.u = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = C7001uY1.d(context3, attributeSet, Re2.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = C7001uY1.d(context2, attributeSet, C2083Tl1.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            setBackground(drawable);
            ColorStateList colorStateListB = MX0.b(context2, typedArrayD2, 6);
            this.r = colorStateListB;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                final NX0 nx0 = new NX0();
                nx0.l(ColorStateList.valueOf(colorDrawable.getColor()));
                if (colorStateListB != null) {
                    nx0.setAlpha(this.n ? 255 : 0);
                    nx0.l(colorStateListB);
                    this.t = new ValueAnimator.AnimatorUpdateListener() { // from class: Jd
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i2 = AppBarLayout.B;
                            AppBarLayout appBarLayout = this.d;
                            int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            NX0 nx1 = nx0;
                            nx1.setAlpha(iFloatValue);
                            for (AppBarLayout.d dVar : appBarLayout.u) {
                                ColorStateList colorStateList = nx1.d.c;
                                if (colorStateList != null) {
                                    colorStateList.withAlpha(iFloatValue).getDefaultColor();
                                    dVar.a();
                                }
                            }
                        }
                    };
                } else {
                    nx0.j(context2);
                    this.t = new ValueAnimator.AnimatorUpdateListener() { // from class: Id
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i2 = AppBarLayout.B;
                            AppBarLayout appBarLayout = this.d;
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            nx0.k(fFloatValue);
                            Drawable drawable2 = appBarLayout.y;
                            if (drawable2 instanceof NX0) {
                                ((NX0) drawable2).k(fFloatValue);
                            }
                            Iterator it = appBarLayout.u.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.d) it.next()).a();
                            }
                        }
                    };
                }
                setBackground(nx0);
            }
            this.v = C7103v11.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.w = C7103v11.d(context2, R.attr.motionEasingStandardInterpolator, C7013uc.a);
            if (typedArrayD2.hasValue(4)) {
                d(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                Re2.a(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (i >= 26) {
                if (typedArrayD2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
                }
                if (typedArrayD2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
                }
            }
            this.z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.o = typedArrayD2.getBoolean(5, false);
            this.p = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            Cd2.d.u(this, new C1353Kd(this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.b);
        cVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.A;
        BaseBehavior.b bVarF = (behavior == null || this.e == -1 || this.j != 0) ? null : behavior.F(AbstractC7727y.e, this);
        this.e = -1;
        this.g = -1;
        this.h = -1;
        if (bVarF != null) {
            Behavior behavior2 = this.A;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = bVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        this.j = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.y == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.d);
        this.y.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z) {
        if (this.l || this.n == z) {
            return false;
        }
        this.n = z;
        refreshDrawableState();
        if (!this.o || !(getBackground() instanceof NX0)) {
            return true;
        }
        if (this.r != null) {
            g(z ? 0.0f : 255.0f, z ? 255.0f : 0.0f);
            return true;
        }
        float f = this.z;
        g(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i;
        if (this.q == null && (i = this.p) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.p);
            }
            if (viewFindViewById != null) {
                this.q = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.q;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f, float f2) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.v);
        this.s.setInterpolator(this.w);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.t;
        if (animatorUpdateListener != null) {
            this.s.addUpdateListener(animatorUpdateListener);
        }
        this.s.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = cVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap<View, C5345me2> weakHashMap4 = Cd2.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.g = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = cVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.h = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.p;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.j;
    }

    public Drawable getStatusBarForeground() {
        return this.y;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C3006bj2 c3006bj2 = this.k;
        if (c3006bj2 != null) {
            return c3006bj2.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = cVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.e = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.x == null) {
            this.x = new int[4];
        }
        int[] iArr = this.x;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.m;
        iArr[0] = z ? R.attr.state_liftable : -2130969650;
        iArr[1] = (z && this.n) ? R.attr.state_lifted : -2130969651;
        iArr[2] = z ? R.attr.state_collapsible : -2130969646;
        iArr[3] = (z && this.n) ? R.attr.state_collapsed : -2130969645;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.i = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((c) getChildAt(i5).getLayoutParams()).c != null) {
                this.i = true;
                break;
            }
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.l) {
            return;
        }
        if (!this.o) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((c) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = C1952Ru.h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0564Aa.w(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.o = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.p = -1;
        if (view != null) {
            this.q = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.p = i;
        WeakReference<View> weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.l = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.y = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.y.setState(getDrawableState());
                }
                Drawable drawable3 = this.y;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                A30.b.b(drawable3, getLayoutDirection());
                this.y.setVisible(getVisibility() == 0, false);
                this.y.setCallback(this);
            }
            if (this.y != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C7652xe.d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        Re2.a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
