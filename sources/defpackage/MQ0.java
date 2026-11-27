package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class MQ0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ NQ0 d;

    public MQ0(NQ0 nq0) {
        this.d = nq0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Z30 z30;
        if (i == -1 || (z30 = this.d.g) == null) {
            return;
        }
        z30.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
