package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import defpackage.AU;
import defpackage.BU;
import defpackage.C3006bj2;
import defpackage.C4121h31;
import defpackage.C5345me2;
import defpackage.C5555ne2;
import defpackage.Cd2;
import defpackage.InterfaceC3701f31;
import defpackage.InterfaceC3911g31;
import defpackage.LA0;
import defpackage.Ti2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements AU, InterfaceC3701f31, InterfaceC3911g31 {
    public static final int[] F = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public ViewPropertyAnimator A;
    public final a B;
    public final b C;
    public final c D;
    public final C4121h31 E;
    public int d;
    public int e;
    public ContentFrameLayout g;
    public ActionBarContainer h;
    public BU i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;

    @NonNull
    public C3006bj2 u;

    @NonNull
    public C3006bj2 v;

    @NonNull
    public C3006bj2 w;

    @NonNull
    public C3006bj2 x;
    public d y;
    public OverScroller z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.o = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.o = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.A = actionBarOverlayLayout.h.animate().translationY(0.0f).setListener(actionBarOverlayLayout.B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.A = actionBarOverlayLayout.h.animate().translationY(-actionBarOverlayLayout.h.getHeight()).setListener(actionBarOverlayLayout.B);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C3006bj2 c3006bj2 = C3006bj2.b;
        this.u = c3006bj2;
        this.v = c3006bj2;
        this.w = c3006bj2;
        this.x = c3006bj2;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        r(context);
        this.E = new C4121h31();
    }

    public static boolean p(@NonNull View view, @NonNull Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.AU
    public final boolean a() {
        s();
        return this.i.a();
    }

    @Override // defpackage.AU
    public final void b() {
        s();
        this.i.b();
    }

    @Override // defpackage.AU
    public final boolean c() {
        s();
        return this.i.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // defpackage.AU
    public final void d(f fVar, j.a aVar) {
        s();
        this.i.d(fVar, aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.j == null || this.k) {
            return;
        }
        if (this.h.getVisibility() == 0) {
            translationY = (int) (this.h.getTranslationY() + this.h.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.j.setBounds(0, translationY, getWidth(), this.j.getIntrinsicHeight() + translationY);
        this.j.draw(canvas);
    }

    @Override // defpackage.AU
    public final boolean e() {
        s();
        return this.i.e();
    }

    @Override // defpackage.AU
    public final boolean f() {
        s();
        return this.i.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.AU
    public final boolean g() {
        s();
        return this.i.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C4121h31 c4121h31 = this.E;
        return c4121h31.b | c4121h31.a;
    }

    public CharSequence getTitle() {
        s();
        return this.i.getTitle();
    }

    @Override // defpackage.AU
    public final void h(int i) {
        s();
        if (i == 2) {
            this.i.getClass();
        } else if (i == 5) {
            this.i.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // defpackage.AU
    public final void i() {
        s();
        this.i.h();
    }

    @Override // defpackage.InterfaceC3911g31
    public final void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        k(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.InterfaceC3701f31
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.InterfaceC3701f31
    public final boolean l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.InterfaceC3701f31
    public final void m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.InterfaceC3701f31
    public final void n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.InterfaceC3701f31
    public final void o(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        s();
        C3006bj2 c3006bj2G = C3006bj2.g(this, windowInsets);
        boolean zP = p(this.h, new Rect(c3006bj2G.b(), c3006bj2G.d(), c3006bj2G.c(), c3006bj2G.a()), false);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        Rect rect = this.r;
        Cd2.d.b(this, c3006bj2G, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C3006bj2.k kVar = c3006bj2G.a;
        C3006bj2 c3006bj2L = kVar.l(i, i2, i3, i4);
        this.u = c3006bj2L;
        boolean z = true;
        if (!this.v.equals(c3006bj2L)) {
            this.v = this.u;
            zP = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = zP;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return kVar.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        Cd2.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        C3006bj2.e cVar;
        s();
        measureChildWithMargins(this.h, i, 0, i2, 0);
        e eVar = (e) this.h.getLayoutParams();
        int iMax = Math.max(0, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.h.getMeasuredState());
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        boolean z = (getWindowSystemUiVisibility() & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        if (z) {
            measuredHeight = this.d;
            if (this.m && this.h.getTabContainer() != null) {
                measuredHeight += this.d;
            }
        } else {
            measuredHeight = this.h.getVisibility() != 8 ? this.h.getMeasuredHeight() : 0;
        }
        Rect rect = this.r;
        Rect rect2 = this.t;
        rect2.set(rect);
        C3006bj2 c3006bj2 = this.u;
        this.w = c3006bj2;
        if (this.l || z) {
            LA0 la0B = LA0.b(c3006bj2.b(), this.w.d() + measuredHeight, this.w.c(), this.w.a());
            C3006bj2 c3006bj3 = this.w;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                cVar = new C3006bj2.d(c3006bj3);
            } else {
                cVar = i3 >= 29 ? new C3006bj2.c(c3006bj3) : new C3006bj2.b(c3006bj3);
            }
            cVar.g(la0B);
            this.w = cVar.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.w = c3006bj2.a.l(0, measuredHeight, 0, 0);
        }
        p(this.g, rect2, true);
        if (!this.x.equals(this.w)) {
            C3006bj2 c3006bj4 = this.w;
            this.x = c3006bj4;
            ContentFrameLayout contentFrameLayout = this.g;
            WindowInsets windowInsetsF = c3006bj4.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = Cd2.c.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    C3006bj2.g(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.g, i, 0, i2, 0);
        e eVar2 = (e) this.g.getLayoutParams();
        int iMax3 = Math.max(iMax, this.g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.z.getFinalY() > this.h.getHeight()) {
            q();
            this.D.run();
        } else {
            q();
            this.C.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        Ti2 ti2;
        C5555ne2 c5555ne2;
        this.E.a = i;
        this.p = getActionBarHideOffset();
        q();
        d dVar = this.y;
        if (dVar == null || (c5555ne2 = (ti2 = (Ti2) dVar).s) == null) {
            return;
        }
        c5555ne2.a();
        ti2.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.h.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.h.getHeight()) {
            q();
            postDelayed(this.C, 600L);
        } else {
            q();
            postDelayed(this.D, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        d dVar = this.y;
        if (dVar != null) {
            Ti2 ti2 = (Ti2) dVar;
            ti2.o = !z2;
            if (z || !z2) {
                if (ti2.p) {
                    ti2.p = false;
                    ti2.u(true);
                }
            } else if (!ti2.p) {
                ti2.p = true;
                ti2.u(true);
            }
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || this.y == null) {
            return;
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        Cd2.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.e = i;
        d dVar = this.y;
        if (dVar != null) {
            ((Ti2) dVar).n = i;
        }
    }

    public final void q() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.j = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.k = context.getApplicationInfo().targetSdkVersion < 19;
        this.z = new OverScroller(context);
    }

    public final void s() {
        BU wrapper;
        if (this.g == null) {
            this.g = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.h = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof BU) {
                wrapper = (BU) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.i = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.h.setTranslationY(-Math.max(0, Math.min(i, this.h.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.y = dVar;
        if (getWindowToken() != null) {
            ((Ti2) this.y).n = this.e;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                Cd2.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.i.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.i.l(i);
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
        this.k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.AU
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.i.setWindowCallback(callback);
    }

    @Override // defpackage.AU
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.i.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.i.setIcon(drawable);
    }
}
