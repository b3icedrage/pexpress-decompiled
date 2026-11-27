package defpackage;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class BX0 extends RecyclerView.r {
    public final /* synthetic */ e a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ MaterialCalendar c;

    public BX0(MaterialCalendar materialCalendar, e eVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = eVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(@NonNull RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(@NonNull RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.c;
        int iL0 = i < 0 ? ((LinearLayoutManager) materialCalendar.n.getLayoutManager()).L0() : ((LinearLayoutManager) materialCalendar.n.getLayoutManager()).M0();
        a aVar = this.a.d;
        Calendar calendarC = Qb2.c(aVar.d.d);
        calendarC.add(2, iL0);
        materialCalendar.j = new C2855b11(calendarC);
        Calendar calendarC2 = Qb2.c(aVar.d.d);
        calendarC2.add(2, iL0);
        calendarC2.set(5, 1);
        Calendar calendarC3 = Qb2.c(calendarC2);
        calendarC3.get(2);
        calendarC3.get(1);
        calendarC3.getMaximum(7);
        calendarC3.getActualMaximum(5);
        calendarC3.getTimeInMillis();
        this.b.setText(Qb2.b("yMMMM", Locale.getDefault()).format(new Date(calendarC3.getTimeInMillis())));
    }
}
