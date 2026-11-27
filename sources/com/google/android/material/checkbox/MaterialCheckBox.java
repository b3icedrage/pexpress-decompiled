package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.A30;
import defpackage.C1739Pb;
import defpackage.C2083Tl1;
import defpackage.C2135Ud;
import defpackage.C5807oq;
import defpackage.C6577sX0;
import defpackage.C6593sc;
import defpackage.C7001uY1;
import defpackage.C7652xe;
import defpackage.C7708xt1;
import defpackage.C8056za;
import defpackage.Fe2;
import defpackage.InterfaceC1817Qb;
import defpackage.MH;
import defpackage.MX0;
import defpackage.NH;
import defpackage.OX0;
import defpackage.WZ1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends C2135Ud {
    public static final int[] C = {R.attr.state_indeterminate};
    public static final int[] D = {R.attr.state_error};
    public static final int[][] E = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @SuppressLint({"DiscouragedApi"})
    public static final int F = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final C6593sc A;
    public final a B;

    @NonNull
    public final LinkedHashSet<c> i;

    @NonNull
    public final LinkedHashSet<b> j;
    public ColorStateList k;
    public boolean l;
    public boolean m;
    public boolean n;
    public CharSequence o;
    public Drawable p;
    public Drawable q;
    public boolean r;
    public ColorStateList s;
    public ColorStateList t;

    @NonNull
    public PorterDuff.Mode u;
    public int v;
    public int[] w;
    public boolean x;
    public CharSequence y;
    public CompoundButton.OnCheckedChangeListener z;

    public class a extends InterfaceC1817Qb.a {
        public a() {
        }

        @Override // defpackage.InterfaceC1817Qb.a
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.s;
            if (colorStateList != null) {
                A30.a.h(drawable, colorStateList);
            }
        }

        @Override // defpackage.InterfaceC1817Qb.a
        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.s;
            if (colorStateList != null) {
                A30.a.g(drawable, colorStateList.getColorForState(materialCheckBox.w, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public static class d extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int d;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d(parcel);
                dVar.d = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.d;
            if (i != 1) {
                str = i != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return C5807oq.b(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.d));
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.i = new LinkedHashSet<>();
        this.j = new LinkedHashSet<>();
        Context context2 = getContext();
        C6593sc c6593sc = new C6593sc(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
        Drawable drawableA = C7708xt1.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c6593sc.d = drawableA;
        drawableA.setCallback(c6593sc.j);
        new C6593sc.d(c6593sc.d.getConstantState());
        this.A = c6593sc;
        this.B = new a();
        Context context3 = getContext();
        this.p = NH.a(this);
        this.s = getSuperButtonTintList();
        setSupportButtonTintList(null);
        WZ1 wz1E = C7001uY1.e(context3, attributeSet, C2083Tl1.x, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.q = wz1E.b(2);
        Drawable drawable = this.p;
        TypedArray typedArray = wz1E.b;
        if (drawable != null && C6577sX0.b(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == F && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = C7652xe.d(context3, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = C7652xe.d(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.t = MX0.a(context3, wz1E, 3);
        this.u = Fe2.d(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = typedArray.getBoolean(10, false);
        this.m = typedArray.getBoolean(6, true);
        this.n = typedArray.getBoolean(9, false);
        this.o = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        wz1E.f();
        b();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i = this.v;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.k == null) {
            int iH = C8056za.h(this, R.attr.colorControlActivated);
            int iH2 = C8056za.h(this, R.attr.colorError);
            int iH3 = C8056za.h(this, R.attr.colorSurface);
            int iH4 = C8056za.h(this, R.attr.colorOnSurface);
            this.k = new ColorStateList(E, new int[]{C8056za.o(1.0f, iH3, iH2), C8056za.o(1.0f, iH3, iH), C8056za.o(0.54f, iH3, iH4), C8056za.o(0.38f, iH3, iH4), C8056za.o(0.38f, iH3, iH4)});
        }
        return this.k;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.s;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        int intrinsicHeight;
        int intrinsicWidth;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C6593sc.b bVar;
        Drawable drawableMutate = this.p;
        ColorStateList colorStateList3 = this.s;
        PorterDuff.Mode modeB = MH.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                A30.a.i(drawableMutate, modeB);
            }
        }
        this.p = drawableMutate;
        Drawable drawableMutate2 = this.q;
        ColorStateList colorStateList4 = this.t;
        PorterDuff.Mode mode = this.u;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                A30.a.i(drawableMutate2, mode);
            }
        }
        this.q = drawableMutate2;
        if (this.r) {
            C6593sc c6593sc = this.A;
            if (c6593sc != null) {
                Drawable drawable = c6593sc.d;
                a aVar = this.B;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.a == null) {
                        aVar.a = new C1739Pb(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.a);
                }
                ArrayList<InterfaceC1817Qb.a> arrayList = c6593sc.i;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c6593sc.i.size() == 0 && (bVar = c6593sc.h) != null) {
                        c6593sc.e.b.removeListener(bVar);
                        c6593sc.h = null;
                    }
                }
                c6593sc.c(aVar);
            }
            Drawable drawable2 = this.p;
            if ((drawable2 instanceof AnimatedStateListDrawable) && c6593sc != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(R.id.checked, R.id.unchecked, c6593sc, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, c6593sc, false);
            }
        }
        Drawable drawable3 = this.p;
        if (drawable3 != null && (colorStateList2 = this.s) != null) {
            A30.a.h(drawable3, colorStateList2);
        }
        Drawable drawable4 = this.q;
        if (drawable4 != null && (colorStateList = this.t) != null) {
            A30.a.h(drawable4, colorStateList);
        }
        Drawable drawable5 = this.p;
        Drawable drawable6 = this.q;
        if (drawable5 == null) {
            drawable5 = drawable6;
        } else if (drawable6 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable5, drawable6});
            if (drawable6.getIntrinsicWidth() == -1 || drawable6.getIntrinsicHeight() == -1) {
                int intrinsicWidth2 = drawable5.getIntrinsicWidth();
                intrinsicHeight = drawable5.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth2;
            } else if (drawable6.getIntrinsicWidth() > drawable5.getIntrinsicWidth() || drawable6.getIntrinsicHeight() > drawable5.getIntrinsicHeight()) {
                float intrinsicWidth3 = drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight();
                if (intrinsicWidth3 >= drawable5.getIntrinsicWidth() / drawable5.getIntrinsicHeight()) {
                    intrinsicWidth = drawable5.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
                } else {
                    intrinsicHeight = drawable5.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable5 = layerDrawable;
        }
        super.setButtonDrawable(drawable5);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.p;
    }

    public Drawable getButtonIconDrawable() {
        return this.q;
    }

    public ColorStateList getButtonIconTintList() {
        return this.t;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.u;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.s;
    }

    public int getCheckedState() {
        return this.v;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.o;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.v == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.s == null && this.t == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (this.n) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.w = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.w = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawableA = NH.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (Fe2.c(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            A30.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.d = getCheckedState();
        return dVar;
    }

    @Override // defpackage.C2135Ud, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C7652xe.d(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.q = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C7652xe.d(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.t == colorStateList) {
            return;
        }
        this.t = colorStateList;
        b();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.u == mode) {
            return;
        }
        this.u = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.s == colorStateList) {
            return;
        }
        this.s = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.m = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.v != i) {
            this.v = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.y == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.x) {
                return;
            }
            this.x = true;
            LinkedHashSet<b> linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.v != 2 && (onCheckedChangeListener = this.z) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.x = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.o = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        refreshDrawableState();
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.z = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.y = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.l = z;
        if (z) {
            MH.c(this, getMaterialThemeColorsTintList());
        } else {
            MH.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.C2135Ud, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
