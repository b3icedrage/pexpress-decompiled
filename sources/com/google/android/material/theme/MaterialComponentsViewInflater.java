package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.C1278Je;
import defpackage.C1823Qd;
import defpackage.C1979Sd;
import defpackage.C2135Ud;
import defpackage.C6997uX0;
import defpackage.C7021ue;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C1278Je {
    @Override // defpackage.C1278Je
    @NonNull
    public final C1823Qd a(@NonNull Context context, AttributeSet attributeSet) {
        return new C6997uX0(context, attributeSet);
    }

    @Override // defpackage.C1278Je
    @NonNull
    public final C1979Sd b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.C1278Je
    @NonNull
    public final C2135Ud c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // defpackage.C1278Je
    @NonNull
    public final C7021ue d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // defpackage.C1278Je
    @NonNull
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
