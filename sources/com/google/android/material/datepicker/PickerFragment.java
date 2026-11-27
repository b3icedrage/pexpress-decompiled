package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import defpackage.AbstractC4613j91;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet<AbstractC4613j91<S>> d = new LinkedHashSet<>();

    public void i(MaterialDatePicker.d dVar) {
        this.d.add(dVar);
    }
}
