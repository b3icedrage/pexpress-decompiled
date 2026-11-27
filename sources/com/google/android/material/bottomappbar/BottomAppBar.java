package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.AbstractC7727y;
import defpackage.C0564Aa;
import defpackage.C1478Lt;
import defpackage.C1556Mt;
import defpackage.C1637Nt;
import defpackage.C1715Ot;
import defpackage.C2018Sq;
import defpackage.C2174Uq;
import defpackage.C5345me2;
import defpackage.C7013uc;
import defpackage.C7103v11;
import defpackage.Cd2;
import defpackage.Fe2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int m0 = 0;
    public Integer b0;
    public AnimatorSet c0;
    public AnimatorSet d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public Behavior l0;

    public class a implements Runnable {
        public final /* synthetic */ ActionMenuView d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean g;

        public a(ActionMenuView actionMenuView, int i, boolean z) {
            this.d = actionMenuView;
            this.e = i;
            this.g = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.e;
            boolean z = this.g;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.d;
            actionMenuView.setTranslationX(bottomAppBar.z(actionMenuView, i, z));
        }
    }

    public static class b extends AbstractC7727y {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int g;
        public boolean h;

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
            this.h = parcel.readInt() != 0;
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C7103v11.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return A(this.e0);
    }

    private float getFabTranslationY() {
        if (this.g0 == 1) {
            return -getTopEdgeTreatment().h;
        }
        View viewY = y();
        return viewY != null ? (-((getMeasuredHeight() + getBottomInset()) - viewY.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    @NonNull
    private C1715Ot getTopEdgeTreatment() {
        throw null;
    }

    public final float A(int i) {
        boolean zC = Fe2.c(this);
        if (i != 1) {
            return 0.0f;
        }
        View viewY = y();
        return ((getMeasuredWidth() / 2) - ((this.h0 == -1 || viewY == null) ? 0 : (viewY.getMeasuredWidth() / 2) + this.h0)) * (zC ? -1 : 1);
    }

    public final boolean B() {
        View viewY = y();
        FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void C() {
        C1715Ot topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.k0 && B()) {
            int i = this.g0;
        }
        throw null;
    }

    public final void D(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().g) {
            return;
        }
        getTopEdgeTreatment().g = f;
        throw null;
    }

    public final void E(@NonNull ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        a aVar = new a(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().h;
    }

    public int getFabAlignmentMode() {
        return this.e0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.h0;
    }

    public int getFabAnchorMode() {
        return this.g0;
    }

    public int getFabAnimationMode() {
        return this.f0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().d;
    }

    public boolean getHideOnScroll() {
        return this.j0;
    }

    public int getMenuAlignmentMode() {
        return this.i0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.x(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.c0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.d0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (B()) {
            E(actionMenuView, this.e0, this.k0, false);
        } else {
            E(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.d);
        this.e0 = bVar.g;
        this.k0 = bVar.h;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.g = this.e0;
        bVar.h = this.k0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        A30.a.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C1715Ot topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.h = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        int i3 = 1;
        boolean z = this.k0;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (B()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - z(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new C1637Nt(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.d0 = animatorSet3;
            animatorSet3.addListener(new C2018Sq(this, i3));
            this.d0.start();
        }
        if (this.e0 != i && isLaidOut()) {
            AnimatorSet animatorSet4 = this.c0;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f0 == 1) {
                View viewY = y();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null, "translationX", A(i));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewY2 = y();
                FloatingActionButton floatingActionButton = viewY2 instanceof FloatingActionButton ? (FloatingActionButton) viewY2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new C1556Mt(this, i), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(C7103v11.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C7013uc.a));
            this.c0 = animatorSet5;
            animatorSet5.addListener(new C1478Lt(this, 0));
            this.c0.start();
        }
        this.e0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.h0 == i) {
            return;
        }
        this.h0 = i;
        C();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.g0 = i;
        C();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.f0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().i) {
            return;
        }
        getTopEdgeTreatment().i = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().e = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().d = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.j0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                E(actionMenuView, this.e0, B(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.b0 != null) {
            drawable = drawable.mutate();
            A30.a.g(drawable, this.b0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.b0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final View y() {
        if (getParent() instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
            ArrayList<View> orDefault = coordinatorLayout.e.b.getOrDefault(this, null);
            ArrayList<View> arrayList = coordinatorLayout.h;
            arrayList.clear();
            if (orDefault != null) {
                arrayList.addAll(orDefault);
            }
            for (View view : arrayList) {
                if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final int z(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.i0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zC = Fe2.c(this);
        int measuredWidth = zC ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = zC ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zC ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            i2 = zC ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - (right + i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.l0 == null) {
            this.l0 = new Behavior();
        }
        return this.l0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @NonNull
        public final Rect i;
        public WeakReference<BottomAppBar> j;
        public int k;
        public final a l;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.j.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    int measuredWidth = floatingActionButton.getMeasuredWidth();
                    int measuredHeight = floatingActionButton.getMeasuredHeight();
                    Rect rect = behavior.i;
                    rect.set(0, 0, measuredWidth, measuredHeight);
                    floatingActionButton.k(rect);
                    int iHeight = rect.height();
                    bottomAppBar.D(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.k == 0) {
                    if (bottomAppBar.g0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (Fe2.c(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i9 = BottomAppBar.m0;
                bottomAppBar.C();
                throw null;
            }
        }

        public Behavior() {
            this.l = new a();
            this.i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.j = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.m0;
            View viewY = bottomAppBar.y();
            if (viewY != null) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (!viewY.isLaidOut()) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewY.getLayoutParams();
                    fVar.d = 17;
                    int i3 = bottomAppBar.g0;
                    if (i3 == 1) {
                        fVar.d = 49;
                    }
                    if (i3 == 0) {
                        fVar.d |= 80;
                    }
                    this.k = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewY.getLayoutParams())).bottomMargin;
                    if (viewY instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewY;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d();
                        floatingActionButton.e(new C2174Uq(bottomAppBar));
                        floatingActionButton.f();
                    }
                    viewY.addOnLayoutChangeListener(this.l);
                    bottomAppBar.C();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i);
            super.h(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.l = new a();
            this.i = new Rect();
        }
    }
}
