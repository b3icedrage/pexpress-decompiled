package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.f;
import com.pexpress.tool.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Nl2 extends RecyclerView.e<a> {
    public final MaterialCalendar<?> d;

    public static class a extends RecyclerView.C {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public Nl2(MaterialCalendar<?> materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.d.h.j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(@NonNull RecyclerView.C c, int i) {
        MaterialCalendar<?> materialCalendar = this.d;
        int i2 = materialCalendar.h.d.g + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((a) c).u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(Qb2.d().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0945Ex c0945Ex = materialCalendar.l;
        Calendar calendarD = Qb2.d();
        C0867Dx c0867Dx = calendarD.get(1) == i2 ? c0945Ex.f : c0945Ex.d;
        Iterator<Long> it = materialCalendar.g.V0().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(it.next().longValue());
            if (calendarD.get(1) == i2) {
                c0867Dx = c0945Ex.e;
            }
        }
        c0867Dx.b(textView);
        textView.setOnClickListener(new f(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    @NonNull
    public final RecyclerView.C i(@NonNull ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
