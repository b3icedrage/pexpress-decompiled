package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.view.ScrollingView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import defpackage.C3289d50;
import defpackage.C3491e31;
import defpackage.C4121h31;
import defpackage.C4450id2;
import defpackage.C4708jd2;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C7102v10;
import defpackage.Cd2;
import defpackage.Ed2;
import defpackage.InterfaceC3282d31;
import defpackage.InterfaceC3911g31;
import defpackage.R1;
import defpackage.SK;
import io.sentry.android.core.b0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC3911g31, InterfaceC3282d31, ScrollingView {
    public static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a G = new a();
    public static final int[] H = {R.attr.fillViewport};
    public e A;
    public final C4121h31 B;
    public final C3491e31 C;
    public float D;
    public final C7102v10 E;
    public final float d;
    public long e;
    public final Rect g;
    public final OverScroller h;

    @NonNull
    public final EdgeEffect i;

    @NonNull
    public final EdgeEffect j;
    public int k;
    public boolean l;
    public boolean m;
    public View n;
    public boolean o;
    public VelocityTracker p;
    public boolean q;
    public boolean r;
    public final int s;
    public final int t;
    public final int u;
    public int v;
    public final int[] w;
    public final int[] x;
    public int y;
    public int z;

    public static class a extends R1 {
        @Override // defpackage.R1
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // defpackage.R1
        public final void d(View view, C5426n2 c5426n2) {
            int scrollRange;
            this.a.onInitializeAccessibilityNodeInfo(view, c5426n2.a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c5426n2.i(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c5426n2.l(true);
            if (nestedScrollView.getScrollY() > 0) {
                c5426n2.b(C5426n2.a.g);
                c5426n2.b(C5426n2.a.k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c5426n2.b(C5426n2.a.f);
                c5426n2.b(C5426n2.a.l);
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006c  */
        /* JADX WARN: Code duplicated, block: B:28:0x0089  */
        @Override // defpackage.R1
        public final boolean g(View view, int i, Bundle bundle) {
            int iMin;
            if (super.g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i == 4096) {
                    iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    }
                } else if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    }
                } else if (i == 16908346) {
                    iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public class c {
        public c() {
        }
    }

    public interface d {
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int d;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e(parcel);
                eVar.d = parcel.readInt();
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return SK.b(sb, this.d, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
        }
    }

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.pexpress.tool.R.attr.nestedScrollViewStyle);
        this.g = new Rect();
        this.l = true;
        this.m = false;
        this.n = null;
        this.o = false;
        this.r = true;
        this.v = -1;
        this.w = new int[2];
        this.x = new int[2];
        this.E = new C7102v10(getContext(), new c());
        int i = Build.VERSION.SDK_INT;
        this.i = i >= 31 ? C3289d50.b.a(context, attributeSet) : new EdgeEffect(context);
        this.j = i >= 31 ? C3289d50.b.a(context, attributeSet) : new EdgeEffect(context);
        this.d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.s = viewConfiguration.getScaledTouchSlop();
        this.t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, com.pexpress.tool.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.B = new C4121h31();
        this.C = new C3491e31(this);
        setNestedScrollingEnabled(true);
        Cd2.l(this, G);
    }

    public static boolean f(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && f((View) parent, nestedScrollView);
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !g(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.g;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !g(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean c(@NonNull KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.g.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? e(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? e(130) : a(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return e(33);
                    }
                    if (keyCode == 93) {
                        return e(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.h.isFinished()) {
            return;
        }
        this.h.computeScrollOffset();
        int currY = this.h.getCurrY();
        int i2 = currY - this.z;
        int height = getHeight();
        EdgeEffect edgeEffect = this.j;
        EdgeEffect edgeEffect2 = this.i;
        if (i2 <= 0 || C3289d50.a(edgeEffect2) == 0.0f) {
            if (i2 < 0 && C3289d50.a(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(C3289d50.b(edgeEffect, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect.finish();
                }
            }
            int i3 = i2;
            this.z = currY;
            iArr = this.x;
            iArr[1] = 0;
            this.C.c(0, i3, iArr, null, 1);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.C.d(0, scrollY2, 0, i4, this.w, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.h.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.h.getCurrVelocity());
                    }
                }
                this.h.abortAnimation();
                x(1);
            }
            if (this.h.isFinished()) {
                x(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(C3289d50.b(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect2.finish();
        }
        i2 -= iRound;
        int i5 = i2;
        this.z = currY;
        iArr = this.x;
        iArr[1] = 0;
        this.C.c(0, i5, iArr, null, 1);
        i = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            p(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i - scrollY4;
            iArr[1] = 0;
            this.C.d(0, scrollY4, 0, i6, this.w, 1, iArr);
            i = i6 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.h.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.h.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.h.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.h.getCurrVelocity());
            }
            this.h.abortAnimation();
            x(1);
        }
        if (this.h.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            x(1);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final void d(int i) {
        if (getChildCount() > 0) {
            this.h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            v(2, 1);
            this.z = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.C.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.C.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.C.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.C.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.i;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.j;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean g(View view, int i, int i2) {
        Rect rect = this.g;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C4121h31 c4121h31 = this.B;
        return c4121h31.b | c4121h31.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.D;
    }

    public final void h(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.C.f(0);
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.k = (int) motionEvent.getY(i);
            this.v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.C.d;
    }

    @Override // defpackage.InterfaceC3911g31
    public final void j(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        h(i4, i5, iArr);
    }

    @Override // defpackage.InterfaceC3701f31
    public final void k(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        h(i4, i5, null);
    }

    @Override // defpackage.InterfaceC3701f31
    public final boolean l(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // defpackage.InterfaceC3701f31
    public final void m(@NonNull View view, @NonNull View view2, int i, int i2) {
        C4121h31 c4121h31 = this.B;
        if (i2 == 1) {
            c4121h31.b = i;
        } else {
            c4121h31.a = i;
        }
        v(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(@NonNull View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // defpackage.InterfaceC3701f31
    public final void n(@NonNull View view, int i) {
        C4121h31 c4121h31 = this.B;
        if (i == 1) {
            c4121h31.b = 0;
        } else {
            c4121h31.a = 0;
        }
        x(i);
    }

    @Override // defpackage.InterfaceC3701f31
    public final void o(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        this.C.c(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        float axisValue;
        int i;
        int width;
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f;
        long j;
        float f2;
        float fSqrt;
        int i4;
        int i5;
        if (motionEvent.getAction() != 8 || this.o) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i = 26;
        } else {
            axisValue = 0.0f;
            i = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C7102v10 c7102v10 = this.E;
        c7102v10.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i6 = c7102v10.f;
        int[] iArr = c7102v10.h;
        int i7 = 1;
        if (i6 == source && c7102v10.g == deviceId && c7102v10.e == i) {
            z = false;
            i2 = 20;
            i3 = 0;
        } else {
            Context context = c7102v10.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i2 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i3 = 0;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                Method method = Ed2.a;
                scaledMinimumFlingVelocity = Ed2.c.b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = Ed2.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i8 >= 34) {
                scaledMaximumFlingVelocity = Ed2.c.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c7102v10.f = source;
            c7102v10.g = deviceId;
            c7102v10.e = i;
            z = true;
        }
        if (iArr[i3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c7102v10.c;
            if (velocityTracker2 == null) {
                return true;
            }
            velocityTracker2.recycle();
            c7102v10.c = null;
            return true;
        }
        if (c7102v10.c == null) {
            c7102v10.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker3 = c7102v10.c;
        Map<VelocityTracker, C4708jd2> map = C4450id2.a;
        velocityTracker3.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map<VelocityTracker, C4708jd2> map2 = C4450id2.a;
            if (!map2.containsKey(velocityTracker3)) {
                map2.put(velocityTracker3, new C4708jd2());
            }
            C4708jd2 c4708jd2 = map2.get(velocityTracker3);
            c4708jd2.getClass();
            long eventTime = motionEvent.getEventTime();
            int i9 = c4708jd2.d;
            long[] jArr = c4708jd2.b;
            if (i9 != 0 && eventTime - jArr[c4708jd2.e] > 40) {
                c4708jd2.d = i3;
                c4708jd2.c = 0.0f;
            }
            int i10 = (c4708jd2.e + 1) % 20;
            c4708jd2.e = i10;
            int i11 = c4708jd2.d;
            if (i11 != i2) {
                c4708jd2.d = i11 + 1;
            }
            c4708jd2.a[i10] = motionEvent.getAxisValue(26);
            jArr[c4708jd2.e] = eventTime;
        }
        float f3 = Float.MAX_VALUE;
        velocityTracker3.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, Float.MAX_VALUE);
        C4708jd2 c4708jd3 = C4450id2.a.get(velocityTracker3);
        if (c4708jd3 != null) {
            int i12 = c4708jd3.d;
            if (i12 < 2) {
                velocityTracker = velocityTracker3;
                f2 = Float.MAX_VALUE;
                i4 = 1000;
                fSqrt = 0.0f;
            } else {
                int i13 = c4708jd3.e;
                int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                long[] jArr2 = c4708jd3.b;
                long j2 = jArr2[i13];
                while (true) {
                    j = jArr2[i14];
                    if (j2 - j <= 100) {
                        break;
                    }
                    c4708jd3.d--;
                    i14 = (i14 + 1) % 20;
                }
                int i15 = c4708jd3.d;
                if (i15 < 2) {
                    velocityTracker = velocityTracker3;
                    f2 = Float.MAX_VALUE;
                    i4 = 1000;
                    fSqrt = 0.0f;
                } else {
                    float[] fArr = c4708jd3.a;
                    if (i15 == 2) {
                        int i16 = (i14 + 1) % 20;
                        long j3 = jArr2[i16];
                        if (j == j3) {
                            velocityTracker = velocityTracker3;
                            f2 = Float.MAX_VALUE;
                            i4 = 1000;
                            fSqrt = 0.0f;
                        } else {
                            velocityTracker = velocityTracker3;
                            f2 = Float.MAX_VALUE;
                            i4 = 1000;
                            fSqrt = fArr[i16] / (j3 - j);
                        }
                    } else {
                        float f4 = 0.0f;
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            if (i17 >= c4708jd3.d - 1) {
                                break;
                            }
                            int i19 = i17 + i14;
                            long j4 = jArr2[i19 % 20];
                            int i20 = (i19 + 1) % 20;
                            if (jArr2[i20] == j4) {
                                i5 = i7;
                            } else {
                                i18++;
                                float fSqrt2 = (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
                                float f5 = fArr[i20] / (jArr2[i20] - j4);
                                float fAbs = (Math.abs(f5) * (f5 - fSqrt2)) + f4;
                                i5 = i7;
                                if (i18 == i5) {
                                    fAbs *= 0.5f;
                                }
                                f4 = fAbs;
                            }
                            i17 += i5;
                            f3 = f3;
                            i7 = i5;
                            velocityTracker3 = velocityTracker3;
                        }
                        velocityTracker = velocityTracker3;
                        f2 = f3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f4) * 2.0f)) * (f4 < 0.0f ? -1.0f : 1.0f);
                        i4 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    }
                }
            }
            float f6 = fSqrt * i4;
            c4708jd3.c = f6;
            if (f6 < (-Math.abs(f2))) {
                c4708jd3.c = -Math.abs(f2);
            } else if (c4708jd3.c > Math.abs(f2)) {
                c4708jd3.c = Math.abs(f2);
            }
        } else {
            velocityTracker = velocityTracker3;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = C4450id2.a.a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker4 = velocityTracker;
            if (i == 0) {
                yVelocity = velocityTracker4.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                C4708jd2 c4708jd4 = C4450id2.a.get(velocityTracker4);
                yVelocity = (c4708jd4 == null || i != 26) ? 0.0f : c4708jd4.c;
            }
        }
        NestedScrollView nestedScrollView = NestedScrollView.this;
        float f7 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f7);
        if (z || (fSignum != Math.signum(c7102v10.d) && fSignum != 0.0f)) {
            nestedScrollView.h.abortAnimation();
        }
        if (Math.abs(f7) < iArr[0]) {
            return true;
        }
        int i21 = iArr[1];
        float fMax = Math.max(-i21, Math.min(f7, i21));
        if (fMax == 0.0f) {
            f = 0.0f;
        } else {
            nestedScrollView.h.abortAnimation();
            nestedScrollView.d((int) fMax);
            f = fMax;
        }
        c7102v10.d = f;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.o) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!w(motionEvent) && this.h.isFinished()) {
                        z = false;
                    }
                    this.o = z;
                    velocityTracker = this.p;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.p = null;
                    }
                } else {
                    this.k = y;
                    this.v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.p;
                    if (velocityTracker3 == null) {
                        this.p = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.p.addMovement(motionEvent);
                    this.h.computeScrollOffset();
                    if (!w(motionEvent) && this.h.isFinished()) {
                        z = false;
                    }
                    this.o = z;
                    v(2, 0);
                }
            } else {
                if (!w(motionEvent)) {
                    z = false;
                }
                this.o = z;
                velocityTracker = this.p;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.p = null;
                }
            }
        } else if (i == 1) {
            this.o = false;
            this.v = -1;
            velocityTracker2 = this.p;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.p = null;
            }
            if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            x(0);
        } else if (i == 2) {
            int i2 = this.v;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    b0.c("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.k) > this.s && (2 & getNestedScrollAxes()) == 0) {
                        this.o = true;
                        this.k = y2;
                        if (this.p == null) {
                            this.p = VelocityTracker.obtain();
                        }
                        this.p.addMovement(motionEvent);
                        this.y = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.o = false;
            this.v = -1;
            velocityTracker2 = this.p;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.p = null;
            }
            if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            x(0);
        } else if (i == 6) {
            i(motionEvent);
        }
        return this.o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.l = false;
        View view = this.n;
        if (view != null && f(view, this)) {
            View view2 = this.n;
            Rect rect = this.g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.n = null;
        if (!this.m) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.d);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        d((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return this.C.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        this.C.c(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        h(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        m(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && g(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.A = eVar;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.d = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !g(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.g;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.r) {
                u(0, iB, 250, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.y);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.j;
            EdgeEffect edgeEffect2 = this.i;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.p;
                velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.v);
                if (Math.abs(yVelocity) >= this.t) {
                    if (C3289d50.a(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            d(-yVelocity);
                        }
                    } else if (C3289d50.a(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            d(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!this.C.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            d(i2);
                        }
                    }
                } else if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.v = -1;
                this.o = false;
                VelocityTracker velocityTracker2 = this.p;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.p = null;
                }
                x(0);
                this.i.onRelease();
                this.j.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.v);
                if (iFindPointerIndex == -1) {
                    b0.c("NestedScrollView", "Invalid pointerId=" + this.v + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.k - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (C3289d50.a(edgeEffect2) != 0.0f) {
                        float f3 = -C3289d50.b(edgeEffect2, -height, x);
                        if (C3289d50.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (C3289d50.a(edgeEffect) != 0.0f) {
                        float fB = C3289d50.b(edgeEffect, height, 1.0f - x);
                        if (C3289d50.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fB;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.o && Math.abs(i4) > this.s) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.o = true;
                        i4 = i4 > 0 ? i4 - this.s : i4 + this.s;
                    }
                    if (this.o) {
                        int iS = s(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.k = y - iS;
                        this.y += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.o && getChildCount() > 0 && this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.v = -1;
                this.o = false;
                VelocityTracker velocityTracker3 = this.p;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.p = null;
                }
                x(0);
                this.i.onRelease();
                this.j.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.k = (int) motionEvent.getY(actionIndex);
                this.v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                i(motionEvent);
                this.k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.h.isFinished()) {
                this.h.abortAnimation();
                x(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.k = y2;
            this.v = pointerId;
            v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.p;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.C.f(1)) {
                this.h.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.h.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void q(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.g;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            s(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.l) {
            this.n = view2;
        } else {
            Rect rect = this.g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
                return z2;
            }
            u(0, iB, 250, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.p) != null) {
            velocityTracker.recycle();
            this.p = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.l = true;
        super.requestLayout();
    }

    public final int s(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            v(2, i3);
        }
        boolean zC = this.C.c(0, i, this.x, this.w, i3);
        int[] iArr = this.x;
        int[] iArr2 = this.w;
        if (zC) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = p(i4, 0, scrollY, scrollRange) && !this.C.f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.C.d(0, scrollY2, 0, i4 - scrollY2, this.w, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.j;
        EdgeEffect edgeEffect2 = this.i;
        if (i8 < 0) {
            if (z3) {
                C3289d50.b(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            C3289d50.b(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.p) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            x(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.q) {
            this.q = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C3491e31 c3491e31 = this.C;
        if (c3491e31.d) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.d.z(c3491e31.c);
        }
        c3491e31.d = z;
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.r = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.C.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        x(0);
    }

    public final boolean t(@NonNull EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fA = C3289d50.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.d * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d2 = F;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f))) < fA;
    }

    public final void u(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.h.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            if (z) {
                v(2, 1);
            } else {
                x(1);
            }
            this.z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.h.isFinished()) {
                this.h.abortAnimation();
                x(1);
            }
            scrollBy(i, i2);
        }
        this.e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void v(int i, int i2) {
        this.C.g(2, i2);
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.i;
        if (C3289d50.a(edgeEffect) != 0.0f) {
            C3289d50.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.j;
        if (C3289d50.a(edgeEffect2) == 0.0f) {
            return z;
        }
        C3289d50.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void x(int i) {
        this.C.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
