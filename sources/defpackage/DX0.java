package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.e;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class DX0 implements View.OnClickListener {
    public final /* synthetic */ e d;
    public final /* synthetic */ MaterialCalendar e;

    public DX0(MaterialCalendar materialCalendar, e eVar) {
        this.e = materialCalendar;
        this.d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.e;
        int iL0 = ((LinearLayoutManager) materialCalendar.n.getLayoutManager()).L0() + 1;
        if (iL0 < materialCalendar.n.getAdapter().c()) {
            Calendar calendarC = Qb2.c(this.d.d.d.d);
            calendarC.add(2, iL0);
            materialCalendar.j(new C2855b11(calendarC));
        }
    }
}
