package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import com.pexpress.tool.R;
import defpackage.C3855fm1;
import defpackage.C5345me2;
import defpackage.C6277r5;
import defpackage.Cd2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean d;
    public b e;
    public View g;
    public View h;
    public Drawable i;
    public Drawable j;
    public Drawable k;
    public final boolean l;
    public boolean m;
    public final int n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6277r5 c6277r5 = new C6277r5(this);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setBackground(c6277r5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.a);
        boolean z = false;
        this.i = typedArrayObtainStyledAttributes.getDrawable(0);
        this.j = typedArrayObtainStyledAttributes.getDrawable(2);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.l = true;
            this.k = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.l ? !(this.i != null || this.j != null) : this.k == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful()) {
            this.i.setState(getDrawableState());
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.j.setState(getDrawableState());
        }
        Drawable drawable3 = this.k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.d || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        b bVar = this.e;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (bVar == null || bVar.getVisibility() == 8) ? false : true;
        if (bVar != null && bVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.getLayoutParams();
            int measuredHeight2 = measuredHeight - bVar.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            bVar.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.l) {
            Drawable drawable2 = this.k;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.i != null) {
                if (this.g.getVisibility() == 0) {
                    this.i.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
                } else {
                    View view = this.h;
                    if (view == null || view.getVisibility() != 0) {
                        this.i.setBounds(0, 0, 0, 0);
                    } else {
                        this.i.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                    }
                }
                z3 = true;
            }
            this.m = z4;
            if (!z4 || (drawable = this.j) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iA;
        int i3;
        if (this.g == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.n) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.g == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        b bVar = this.e;
        if (bVar == null || bVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.g;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.h;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.h);
        } else {
            iA = a(this.g);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.e) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.g;
            if (view != null) {
                this.i.setBounds(view.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            }
        }
        boolean z = false;
        if (!this.l ? !(this.i != null || this.j != null) : this.k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.k);
        }
        this.k = drawable;
        boolean z = this.l;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.i != null || this.j != null) : this.k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.j);
        }
        this.j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.m && (drawable2 = this.j) != null) {
                drawable2.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
            }
        }
        boolean z = false;
        if (!this.l ? !(this.i != null || this.j != null) : this.k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b bVar) {
        b bVar2 = this.e;
        if (bVar2 != null) {
            removeView(bVar2);
        }
        this.e = bVar;
        if (bVar != null) {
            addView(bVar);
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.d = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.i;
        boolean z = this.l;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.j && this.m) {
            return true;
        }
        return (drawable == this.k && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
