package defpackage;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class CX0 implements View.OnClickListener {
    public final /* synthetic */ MaterialCalendar d;

    public CX0(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.d;
        MaterialCalendar.d dVar = materialCalendar.k;
        MaterialCalendar.d dVar2 = MaterialCalendar.d.e;
        MaterialCalendar.d dVar3 = MaterialCalendar.d.d;
        if (dVar == dVar2) {
            materialCalendar.k(dVar3);
        } else if (dVar == dVar3) {
            materialCalendar.k(dVar2);
        }
    }
}
