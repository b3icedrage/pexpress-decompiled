package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import defpackage.C2083Tl1;
import defpackage.C7001uY1;
import defpackage.C7021ue;
import defpackage.C8056za;
import defpackage.MH;
import defpackage.MX0;
import defpackage.OX0;

/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C7021ue {
    public static final int[][] k = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList i;
    public boolean j;

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.radioButtonStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayD = C7001uY1.d(context2, attributeSet, C2083Tl1.y, com.pexpress.tool.R.attr.radioButtonStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            MH.c(this, MX0.b(context2, typedArrayD, 0));
        }
        this.j = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.i == null) {
            int iH = C8056za.h(this, com.pexpress.tool.R.attr.colorControlActivated);
            int iH2 = C8056za.h(this, com.pexpress.tool.R.attr.colorOnSurface);
            int iH3 = C8056za.h(this, com.pexpress.tool.R.attr.colorSurface);
            this.i = new ColorStateList(k, new int[]{C8056za.o(1.0f, iH3, iH), C8056za.o(0.54f, iH3, iH2), C8056za.o(0.38f, iH3, iH2), C8056za.o(0.38f, iH3, iH2)});
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j && MH.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.j = z;
        if (z) {
            MH.c(this, getMaterialThemeColorsTintList());
        } else {
            MH.c(this, null);
        }
    }
}
