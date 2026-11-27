package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.C2083Tl1;
import defpackage.C6577sX0;
import defpackage.MX0;
import defpackage.OX0;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (C6577sX0.b(context2, com.pexpress.tool.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C2083Tl1.B;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iC = -1;
            for (int i = 0; i < 2 && iC < 0; i++) {
                iC = MX0.c(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iC != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, C2083Tl1.A);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iC2 = -1;
                for (int i2 = 0; i2 < 2 && iC2 < 0; i2++) {
                    iC2 = MX0.c(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iC2 >= 0) {
                    setLineHeight(iC2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (C6577sX0.b(context, com.pexpress.tool.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C2083Tl1.A);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iC = -1;
            for (int i2 = 0; i2 < 2 && iC < 0; i2++) {
                iC = MX0.c(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iC >= 0) {
                setLineHeight(iC);
            }
        }
    }
}
