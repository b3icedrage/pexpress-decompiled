package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.e;
import java.util.Calendar;

/* JADX INFO: renamed from: wX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC7418wX0 implements View.OnClickListener {
    public final /* synthetic */ e d;
    public final /* synthetic */ MaterialCalendar e;

    public ViewOnClickListenerC7418wX0(MaterialCalendar materialCalendar, e eVar) {
        this.e = materialCalendar;
        this.d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.e;
        int iM0 = ((LinearLayoutManager) materialCalendar.n.getLayoutManager()).M0() - 1;
        if (iM0 >= 0) {
            Calendar calendarC = Qb2.c(this.d.d.d.d);
            calendarC.add(2, iM0);
            materialCalendar.j(new C2855b11(calendarC));
        }
    }
}
