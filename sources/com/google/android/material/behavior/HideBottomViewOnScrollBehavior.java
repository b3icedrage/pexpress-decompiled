package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pexpress.tool.R;
import defpackage.C7013uc;
import defpackage.C7103v11;
import defpackage.U30;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    @NonNull
    public final LinkedHashSet<a> a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public int g;
    public ViewPropertyAnimator h;

    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet<>();
        this.f = 0;
        this.g = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.b = C7103v11.c(v.getContext(), R.attr.motionDurationLong2, 225);
        this.c = C7103v11.c(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = C7103v11.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, C7013uc.d);
        this.e = C7103v11.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, C7013uc.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, @NonNull int[] iArr) {
        LinkedHashSet<a> linkedHashSet = this.a;
        if (i > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator<a> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.h = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new U30(this, 1));
            return;
        }
        if (i >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator<a> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new U30(this, 1));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet<>();
        this.f = 0;
        this.g = 2;
    }
}
