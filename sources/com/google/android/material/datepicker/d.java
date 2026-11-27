package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC4613j91;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView d;
    public final /* synthetic */ e e;

    public d(e eVar, MaterialCalendarGridView materialCalendarGridView) {
        this.e = eVar;
        this.d = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.d;
        c cVarA = materialCalendarGridView.a();
        if (i < cVarA.b() || i > cVarA.d()) {
            return;
        }
        MaterialCalendar.c cVar = this.e.g;
        long jLongValue = materialCalendarGridView.a().getItem(i).longValue();
        MaterialCalendar materialCalendar = MaterialCalendar.this;
        if (materialCalendar.h.g.M0(jLongValue)) {
            materialCalendar.g.A();
            Iterator it = materialCalendar.d.iterator();
            while (it.hasNext()) {
                ((AbstractC4613j91) it.next()).a(materialCalendar.g.b1());
            }
            materialCalendar.n.getAdapter().a.b();
            RecyclerView recyclerView = materialCalendar.m;
            if (recyclerView != null) {
                recyclerView.getAdapter().a.b();
            }
        }
    }
}
