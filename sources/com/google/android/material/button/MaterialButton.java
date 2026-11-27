package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import defpackage.A;
import defpackage.A30;
import defpackage.AbstractC7727y;
import defpackage.C0564Aa;
import defpackage.C1979Sd;
import defpackage.C2083Tl1;
import defpackage.C5345me2;
import defpackage.C6333rM;
import defpackage.C7001uY1;
import defpackage.C7080uu1;
import defpackage.C7207vX0;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.Fe2;
import defpackage.InterfaceC5280mK1;
import defpackage.MX0;
import defpackage.OX0;
import defpackage.RJ1;
import io.sentry.android.core.b0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C1979Sd implements Checkable, InterfaceC5280mK1 {
    public static final int[] v = {R.attr.state_checkable};
    public static final int[] w = {R.attr.state_checked};

    @NonNull
    public final C7207vX0 h;

    @NonNull
    public final LinkedHashSet<a> i;
    public b j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public Drawable m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends AbstractC7727y {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public boolean g;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.g = parcel.readInt() == 1;
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.materialButtonStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Button), attributeSet, com.pexpress.tool.R.attr.materialButtonStyle);
        this.i = new LinkedHashSet<>();
        this.s = false;
        this.t = false;
        Context context2 = getContext();
        TypedArray typedArrayD = C7001uY1.d(context2, attributeSet, C2083Tl1.s, com.pexpress.tool.R.attr.materialButtonStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.r = typedArrayD.getDimensionPixelSize(12, 0);
        int i = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.k = Fe2.d(i, mode);
        this.l = MX0.b(getContext(), typedArrayD, 14);
        this.m = MX0.d(getContext(), typedArrayD, 10);
        this.u = typedArrayD.getInteger(11, 1);
        this.o = typedArrayD.getDimensionPixelSize(13, 0);
        C7207vX0 c7207vX0 = new C7207vX0(this, RJ1.b(context2, attributeSet, com.pexpress.tool.R.attr.materialButtonStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Button).a());
        this.h = c7207vX0;
        c7207vX0.c = typedArrayD.getDimensionPixelOffset(1, 0);
        c7207vX0.d = typedArrayD.getDimensionPixelOffset(2, 0);
        c7207vX0.e = typedArrayD.getDimensionPixelOffset(3, 0);
        c7207vX0.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            c7207vX0.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            RJ1.a aVarE = c7207vX0.b.e();
            aVarE.e = new A(f);
            aVarE.f = new A(f);
            aVarE.g = new A(f);
            aVarE.h = new A(f);
            c7207vX0.c(aVarE.a());
            c7207vX0.p = true;
        }
        c7207vX0.h = typedArrayD.getDimensionPixelSize(20, 0);
        c7207vX0.i = Fe2.d(typedArrayD.getInt(7, -1), mode);
        c7207vX0.j = MX0.b(getContext(), typedArrayD, 6);
        c7207vX0.k = MX0.b(getContext(), typedArrayD, 19);
        c7207vX0.l = MX0.b(getContext(), typedArrayD, 16);
        c7207vX0.q = typedArrayD.getBoolean(5, false);
        c7207vX0.t = typedArrayD.getDimensionPixelSize(9, 0);
        c7207vX0.r = typedArrayD.getBoolean(21, true);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            c7207vX0.o = true;
            setSupportBackgroundTintList(c7207vX0.j);
            setSupportBackgroundTintMode(c7207vX0.i);
        } else {
            c7207vX0.e();
        }
        setPaddingRelative(paddingStart + c7207vX0.c, paddingTop + c7207vX0.e, paddingEnd + c7207vX0.d, paddingBottom + c7207vX0.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.r);
        c(this.m != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        C7207vX0 c7207vX0 = this.h;
        return (c7207vX0 == null || c7207vX0.o) ? false : true;
    }

    public final void b() {
        int i = this.u;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.m, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.m, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.m, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.m;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.m = drawableMutate;
            A30.a.h(drawableMutate, this.l);
            PorterDuff.Mode mode = this.k;
            if (mode != null) {
                A30.a.i(this.m, mode);
            }
            int intrinsicWidth = this.o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.m.getIntrinsicWidth();
            }
            int intrinsicHeight = this.o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.m;
            int i = this.p;
            int i2 = this.q;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.m.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.u;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.m) || (((i3 == 3 || i3 == 4) && drawable5 != this.m) || ((i3 == 16 || i3 == 32) && drawable4 != this.m))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.m == null || getLayout() == null) {
            return;
        }
        int i3 = this.u;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.p = 0;
                if (i3 == 16) {
                    this.q = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.o;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.m.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.r) - getPaddingBottom()) / 2);
                if (this.q != iMax) {
                    this.q = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.q = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.u;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.p = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.o;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.m.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.r) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.u == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.p != paddingEnd) {
            this.p = paddingEnd;
            c(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        C7207vX0 c7207vX0 = this.h;
        return ((c7207vX0 == null || !c7207vX0.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.h.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.m;
    }

    public int getIconGravity() {
        return this.u;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.k;
    }

    public int getInsetBottom() {
        return this.h.f;
    }

    public int getInsetTop() {
        return this.h.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.h.l;
        }
        return null;
    }

    @NonNull
    public RJ1 getShapeAppearanceModel() {
        if (a()) {
            return this.h.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.h.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.h.h;
        }
        return 0;
    }

    @Override // defpackage.C1979Sd
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.h.j : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.C1979Sd
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.h.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.s;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            C0564Aa.x(this, this.h.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C7207vX0 c7207vX0 = this.h;
        if (c7207vX0 != null && c7207vX0.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, v);
        }
        if (this.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.C1979Sd, android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.s);
    }

    @Override // defpackage.C1979Sd, android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C7207vX0 c7207vX0 = this.h;
        accessibilityNodeInfo.setCheckable(c7207vX0 != null && c7207vX0.q);
        accessibilityNodeInfo.setChecked(this.s);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.C1979Sd, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.d);
        setChecked(cVar.g);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.g = this.s;
        return cVar;
    }

    @Override // defpackage.C1979Sd, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.h.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.m != null) {
            if (this.m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.n = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        C7207vX0 c7207vX0 = this.h;
        if (c7207vX0.b(false) != null) {
            c7207vX0.b(false).setTint(i);
        }
    }

    @Override // defpackage.C1979Sd, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        b0.e("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C7207vX0 c7207vX0 = this.h;
        c7207vX0.o = true;
        ColorStateList colorStateList = c7207vX0.j;
        MaterialButton materialButton = c7207vX0.a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c7207vX0.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.C1979Sd, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C7652xe.d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.h.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C7207vX0 c7207vX0 = this.h;
        if (c7207vX0 == null || !c7207vX0.q || !isEnabled() || this.s == z) {
            return;
        }
        this.s = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.s;
            if (!materialButtonToggleGroup.j) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator<a> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.t = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            C7207vX0 c7207vX0 = this.h;
            if (c7207vX0.p && c7207vX0.g == i) {
                return;
            }
            c7207vX0.g = i;
            c7207vX0.p = true;
            float f = i;
            RJ1.a aVarE = c7207vX0.b.e();
            aVarE.e = new A(f);
            aVarE.f = new A(f);
            aVarE.g = new A(f);
            aVarE.h = new A(f);
            c7207vX0.c(aVarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.h.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.m != drawable) {
            this.m = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.u != i) {
            this.u = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.r != i) {
            this.r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C7652xe.d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.o != i) {
            this.o = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.k != mode) {
            this.k = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C6333rM.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C7207vX0 c7207vX0 = this.h;
        c7207vX0.d(c7207vX0.e, i);
    }

    public void setInsetTop(int i) {
        C7207vX0 c7207vX0 = this.h;
        c7207vX0.d(i, c7207vX0.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.j = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.j;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            C7207vX0 c7207vX0 = this.h;
            if (c7207vX0.l != colorStateList) {
                c7207vX0.l = colorStateList;
                MaterialButton materialButton = c7207vX0.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C7080uu1.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(C6333rM.getColorStateList(getContext(), i));
        }
    }

    @Override // defpackage.InterfaceC5280mK1
    public void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.h.c(rj1);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            C7207vX0 c7207vX0 = this.h;
            c7207vX0.n = z;
            c7207vX0.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            C7207vX0 c7207vX0 = this.h;
            if (c7207vX0.k != colorStateList) {
                c7207vX0.k = colorStateList;
                c7207vX0.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(C6333rM.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            C7207vX0 c7207vX0 = this.h;
            if (c7207vX0.h != i) {
                c7207vX0.h = i;
                c7207vX0.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.C1979Sd
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C7207vX0 c7207vX0 = this.h;
        if (c7207vX0.j != colorStateList) {
            c7207vX0.j = colorStateList;
            if (c7207vX0.b(false) != null) {
                A30.a.h(c7207vX0.b(false), c7207vX0.j);
            }
        }
    }

    @Override // defpackage.C1979Sd
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C7207vX0 c7207vX0 = this.h;
        if (c7207vX0.i != mode) {
            c7207vX0.i = mode;
            if (c7207vX0.b(false) == null || c7207vX0.i == null) {
                return;
            }
            A30.a.i(c7207vX0.b(false), c7207vX0.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.h.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.s);
    }
}
