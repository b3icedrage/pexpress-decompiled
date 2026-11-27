package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.AbstractC4613j91;
import defpackage.InterfaceC6774tT;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int e;
    public InterfaceC6774tT<S> g;
    public com.google.android.material.datepicker.a h;

    public class a extends AbstractC4613j91<S> {
        public a() {
        }

        @Override // defpackage.AbstractC4613j91
        public final void a(S s) {
            Iterator<AbstractC4613j91<S>> it = MaterialTextInputPicker.this.d.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("THEME_RES_ID_KEY");
        this.g = (InterfaceC6774tT) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.h = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.e));
        InterfaceC6774tT<S> interfaceC6774tT = this.g;
        new a();
        return interfaceC6774tT.j1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.g);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.h);
    }
}
