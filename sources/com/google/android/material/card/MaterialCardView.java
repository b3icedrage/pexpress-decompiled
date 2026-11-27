package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import defpackage.A;
import defpackage.A30;
import defpackage.C0564Aa;
import defpackage.C2083Tl1;
import defpackage.C6333rM;
import defpackage.C7001uY1;
import defpackage.C7080uu1;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.HX0;
import defpackage.InterfaceC5280mK1;
import defpackage.MX0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.RJ1;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC5280mK1 {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {com.pexpress.tool.R.attr.state_dragged};

    @NonNull
    public final HX0 l;
    public final boolean m;
    public boolean n;
    public boolean o;

    public interface a {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.materialCardViewStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CardView), attributeSet, com.pexpress.tool.R.attr.materialCardViewStyle);
        this.n = false;
        this.o = false;
        this.m = true;
        TypedArray typedArrayD = C7001uY1.d(getContext(), attributeSet, C2083Tl1.w, com.pexpress.tool.R.attr.materialCardViewStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CardView, new int[0]);
        HX0 hx0 = new HX0(this, attributeSet);
        this.l = hx0;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        NX0 nx0 = hx0.c;
        nx0.l(cardBackgroundColor);
        hx0.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        hx0.j();
        MaterialCardView materialCardView = hx0.a;
        ColorStateList colorStateListB = MX0.b(materialCardView.getContext(), typedArrayD, 11);
        hx0.n = colorStateListB;
        if (colorStateListB == null) {
            hx0.n = ColorStateList.valueOf(-1);
        }
        hx0.h = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z = typedArrayD.getBoolean(0, false);
        hx0.s = z;
        materialCardView.setLongClickable(z);
        hx0.l = MX0.b(materialCardView.getContext(), typedArrayD, 6);
        hx0.g(MX0.d(materialCardView.getContext(), typedArrayD, 2));
        hx0.f = typedArrayD.getDimensionPixelSize(5, 0);
        hx0.e = typedArrayD.getDimensionPixelSize(4, 0);
        hx0.g = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListB2 = MX0.b(materialCardView.getContext(), typedArrayD, 7);
        hx0.k = colorStateListB2;
        if (colorStateListB2 == null) {
            hx0.k = ColorStateList.valueOf(C8056za.h(materialCardView, com.pexpress.tool.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListB3 = MX0.b(materialCardView.getContext(), typedArrayD, 1);
        NX0 nx1 = hx0.d;
        nx1.l(colorStateListB3 == null ? ColorStateList.valueOf(0) : colorStateListB3);
        int[] iArr = C7080uu1.a;
        RippleDrawable rippleDrawable = hx0.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(hx0.k);
        }
        nx0.k(materialCardView.getCardElevation());
        float f = hx0.h;
        ColorStateList colorStateList = hx0.n;
        nx1.d.j = f;
        nx1.invalidateSelf();
        NX0.b bVar = nx1.d;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            nx1.onStateChange(nx1.getState());
        }
        materialCardView.setBackgroundInternal(hx0.d(nx0));
        Drawable drawableC = materialCardView.isClickable() ? hx0.c() : nx1;
        hx0.i = drawableC;
        materialCardView.setForeground(hx0.d(drawableC));
        typedArrayD.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l.c.getBounds());
        return rectF;
    }

    public final void d() {
        HX0 hx0;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (hx0 = this.l).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        hx0.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        hx0.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.l.c.d.c;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.l.d.d.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.l.j;
    }

    public int getCheckedIconGravity() {
        return this.l.g;
    }

    public int getCheckedIconMargin() {
        return this.l.e;
    }

    public int getCheckedIconSize() {
        return this.l.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.l.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.l.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.l.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.l.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.l.b.top;
    }

    public float getProgress() {
        return this.l.c.d.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.l.c.h();
    }

    public ColorStateList getRippleColor() {
        return this.l.k;
    }

    @NonNull
    public RJ1 getShapeAppearanceModel() {
        return this.l.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.l.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.l.n;
    }

    public int getStrokeWidth() {
        return this.l.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.x(this, this.l.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        HX0 hx0 = this.l;
        if (hx0 != null && hx0.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        if (this.n) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        HX0 hx0 = this.l;
        accessibilityNodeInfo.setCheckable(hx0 != null && hx0.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.l.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.m) {
            HX0 hx0 = this.l;
            if (!hx0.r) {
                hx0.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l.c.l(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        HX0 hx0 = this.l;
        hx0.c.k(hx0.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        NX0 nx0 = this.l.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        nx0.l(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.l.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.n != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.l.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        HX0 hx0 = this.l;
        if (hx0.g != i) {
            hx0.g = i;
            MaterialCardView materialCardView = hx0.a;
            hx0.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.l.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.l.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.l.g(C7652xe.d(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.l.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.l.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        HX0 hx0 = this.l;
        hx0.l = colorStateList;
        Drawable drawable = hx0.j;
        if (drawable != null) {
            A30.a.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        HX0 hx0 = this.l;
        if (hx0 != null) {
            Drawable drawable = hx0.i;
            MaterialCardView materialCardView = hx0.a;
            Drawable drawableC = materialCardView.isClickable() ? hx0.c() : hx0.d;
            hx0.i = drawableC;
            if (drawable != drawableC) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
                } else {
                    materialCardView.setForeground(hx0.d(drawableC));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l.k();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        HX0 hx0 = this.l;
        hx0.k();
        hx0.j();
    }

    public void setProgress(float f) {
        HX0 hx0 = this.l;
        hx0.c.m(f);
        NX0 nx0 = hx0.d;
        if (nx0 != null) {
            nx0.m(f);
        }
        NX0 nx1 = hx0.q;
        if (nx1 != null) {
            nx1.m(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0051  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        HX0 hx0 = this.l;
        RJ1.a aVarE = hx0.m.e();
        aVarE.e = new A(f);
        aVarE.f = new A(f);
        aVarE.g = new A(f);
        aVarE.h = new A(f);
        hx0.h(aVarE.a());
        hx0.i.invalidateSelf();
        if (hx0.i()) {
            hx0.j();
        } else if (hx0.a.getPreventCornerOverlap()) {
            NX0 nx0 = hx0.c;
            if (!nx0.d.a.d(nx0.g())) {
                hx0.j();
            }
        }
        if (hx0.i()) {
            hx0.k();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        HX0 hx0 = this.l;
        hx0.k = colorStateList;
        int[] iArr = C7080uu1.a;
        RippleDrawable rippleDrawable = hx0.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateList = C6333rM.getColorStateList(getContext(), i);
        HX0 hx0 = this.l;
        hx0.k = colorStateList;
        int[] iArr = C7080uu1.a;
        RippleDrawable rippleDrawable = hx0.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // defpackage.InterfaceC5280mK1
    public void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        setClipToOutline(rj1.d(getBoundsAsRectF()));
        this.l.h(rj1);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        HX0 hx0 = this.l;
        if (i != hx0.h) {
            hx0.h = i;
            NX0 nx0 = hx0.d;
            ColorStateList colorStateList = hx0.n;
            nx0.d.j = i;
            nx0.invalidateSelf();
            NX0.b bVar = nx0.d;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                nx0.onStateChange(nx0.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        HX0 hx0 = this.l;
        hx0.k();
        hx0.j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        HX0 hx0 = this.l;
        if (hx0 != null && hx0.s && isEnabled()) {
            this.n = !this.n;
            refreshDrawableState();
            d();
            hx0.f(this.n, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        HX0 hx0 = this.l;
        if (hx0.n != colorStateList) {
            hx0.n = colorStateList;
            NX0 nx0 = hx0.d;
            nx0.d.j = hx0.h;
            nx0.invalidateSelf();
            NX0.b bVar = nx0.d;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                nx0.onStateChange(nx0.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.l.c.l(ColorStateList.valueOf(i));
    }
}
