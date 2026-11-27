package defpackage;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

/* JADX INFO: loaded from: classes.dex */
public final class KX0 implements View.OnClickListener {
    public final /* synthetic */ MaterialDatePicker d;

    public KX0(MaterialDatePicker materialDatePicker) {
        this.d = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.d;
        materialDatePicker.A.setEnabled(materialDatePicker.i().Q0());
        materialDatePicker.y.toggle();
        materialDatePicker.m(materialDatePicker.y);
        materialDatePicker.l();
    }
}
