package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import defpackage.C2083Tl1;
import defpackage.C5345me2;
import defpackage.C5649o50;
import defpackage.C7001uY1;
import defpackage.C8056za;
import defpackage.Cd2;
import defpackage.FW1;
import defpackage.OX0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends FW1 {
    public static final int[][] e0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @NonNull
    public final C5649o50 a0;
    public ColorStateList b0;
    public ColorStateList c0;
    public boolean d0;

    public SwitchMaterial(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.switchStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.a0 = new C5649o50(context2);
        int[] iArr = C2083Tl1.L;
        C7001uY1.a(context2, attributeSet, com.pexpress.tool.R.attr.switchStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        C7001uY1.b(context2, attributeSet, iArr, com.pexpress.tool.R.attr.switchStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.pexpress.tool.R.attr.switchStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.d0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.b0 == null) {
            int iH = C8056za.h(this, com.pexpress.tool.R.attr.colorSurface);
            int iH2 = C8056za.h(this, com.pexpress.tool.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.pexpress.tool.R.dimen.mtrl_switch_thumb_elevation);
            C5649o50 c5649o50 = this.a0;
            if (c5649o50.a) {
                float fI = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    fI += Cd2.d.i((View) parent);
                }
                dimension += fI;
            }
            int iA = c5649o50.a(iH, dimension);
            this.b0 = new ColorStateList(e0, new int[]{C8056za.o(1.0f, iH, iH2), iA, C8056za.o(0.38f, iH, iH2), iA});
        }
        return this.b0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.c0 == null) {
            int iH = C8056za.h(this, com.pexpress.tool.R.attr.colorSurface);
            int iH2 = C8056za.h(this, com.pexpress.tool.R.attr.colorControlActivated);
            int iH3 = C8056za.h(this, com.pexpress.tool.R.attr.colorOnSurface);
            this.c0 = new ColorStateList(e0, new int[]{C8056za.o(0.54f, iH, iH2), C8056za.o(0.32f, iH, iH3), C8056za.o(0.12f, iH, iH2), C8056za.o(0.12f, iH, iH3)});
        }
        return this.c0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.d0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.d0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
