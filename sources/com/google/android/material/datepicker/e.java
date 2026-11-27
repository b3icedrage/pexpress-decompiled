package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.pexpress.tool.R;
import defpackage.Bd2;
import defpackage.C2855b11;
import defpackage.C5345me2;
import defpackage.Cd2;
import defpackage.InterfaceC6774tT;
import defpackage.Qb2;
import defpackage.VT;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends RecyclerView.e<a> {

    @NonNull
    public final com.google.android.material.datepicker.a d;
    public final InterfaceC6774tT<?> e;
    public final VT f;
    public final MaterialCalendar.c g;
    public final int h;

    public static class a extends RecyclerView.C {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public a(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            new Bd2(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public e(@NonNull ContextThemeWrapper contextThemeWrapper, InterfaceC6774tT interfaceC6774tT, @NonNull com.google.android.material.datepicker.a aVar, VT vt, MaterialCalendar.c cVar) {
        C2855b11 c2855b11 = aVar.d;
        C2855b11 c2855b12 = aVar.h;
        if (c2855b11.d.compareTo(c2855b12.d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c2855b12.d.compareTo(aVar.e.d) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.h = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * c.k) + (MaterialDatePicker.k(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = aVar;
        this.e = interfaceC6774tT;
        this.f = vt;
        this.g = cVar;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.d.k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long d(int i) {
        Calendar calendarC = Qb2.c(this.d.d.d);
        calendarC.add(2, i);
        calendarC.set(5, 1);
        Calendar calendarC2 = Qb2.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(@NonNull RecyclerView.C c, int i) {
        a aVar = (a) c;
        com.google.android.material.datepicker.a aVar2 = this.d;
        Calendar calendarC = Qb2.c(aVar2.d.d);
        calendarC.add(2, i);
        C2855b11 c2855b11 = new C2855b11(calendarC);
        aVar.u.setText(c2855b11.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !c2855b11.equals(materialCalendarGridView.a().d)) {
            c cVar = new c(c2855b11, this.e, aVar2, this.f);
            materialCalendarGridView.setNumColumns(c2855b11.h);
            materialCalendarGridView.setAdapter((ListAdapter) cVar);
        } else {
            materialCalendarGridView.invalidate();
            c cVarA = materialCalendarGridView.a();
            Iterator<Long> it = cVarA.g.iterator();
            while (it.hasNext()) {
                cVarA.f(materialCalendarGridView, it.next().longValue());
            }
            InterfaceC6774tT<?> interfaceC6774tT = cVarA.e;
            if (interfaceC6774tT != null) {
                Iterator<Long> it2 = interfaceC6774tT.V0().iterator();
                while (it2.hasNext()) {
                    cVarA.f(materialCalendarGridView, it2.next().longValue());
                }
                cVarA.g = interfaceC6774tT.V0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new d(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    @NonNull
    public final RecyclerView.C i(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.k(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.h));
        return new a(linearLayout, true);
    }
}
