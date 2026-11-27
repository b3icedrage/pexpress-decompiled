package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.C0867Dx;
import defpackage.C0945Ex;
import defpackage.C1037Gb1;
import defpackage.C2855b11;
import defpackage.InterfaceC6774tT;
import defpackage.Qb2;
import defpackage.VT;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseAdapter {
    public static final int k = Qb2.e(null).getMaximum(4);
    public static final int l = (Qb2.e(null).getMaximum(7) + Qb2.e(null).getMaximum(5)) - 1;
    public final C2855b11 d;
    public final InterfaceC6774tT<?> e;
    public Collection<Long> g;
    public C0945Ex h;
    public final a i;
    public final VT j;

    public c(C2855b11 c2855b11, InterfaceC6774tT<?> interfaceC6774tT, a aVar, VT vt) {
        this.d = c2855b11;
        this.e = interfaceC6774tT;
        this.i = aVar;
        this.j = vt;
        this.g = interfaceC6774tT.V0();
    }

    public final int b() {
        int firstDayOfWeek = this.i.i;
        C2855b11 c2855b11 = this.d;
        Calendar calendar = c2855b11.d;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c2855b11.h : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < b() || i > d()) {
            return null;
        }
        int iB = (i - b()) + 1;
        Calendar calendarC = Qb2.c(this.d.d);
        calendarC.set(5, iB);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int d() {
        return (b() + this.d.i) - 1;
    }

    public final void e(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        C0867Dx c0867Dx;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z3 = false;
        boolean z4 = Qb2.d().getTimeInMillis() == j;
        InterfaceC6774tT<?> interfaceC6774tT = this.e;
        Iterator<C1037Gb1<Long, Long>> it = interfaceC6774tT.L().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Long l2 = it.next().a;
            if (l2 != null && l2.longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator<C1037Gb1<Long, Long>> it2 = interfaceC6774tT.L().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Long l3 = it2.next().b;
            if (l3 != null && l3.longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarD = Qb2.d();
        Calendar calendarE = Qb2.e(null);
        calendarE.setTimeInMillis(j);
        String str = calendarD.get(1) == calendarE.get(1) ? Qb2.b("MMMEd", Locale.getDefault()).format(new Date(j)) : Qb2.b("yMMMEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.i.g.M0(j)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC6774tT.V0().iterator();
            while (it3.hasNext()) {
                if (Qb2.a(j) == Qb2.a(it3.next().longValue())) {
                    z3 = true;
                    break;
                }
            }
            textView.setSelected(z3);
            if (z3) {
                c0867Dx = this.h.b;
            } else {
                c0867Dx = Qb2.d().getTimeInMillis() == j ? this.h.c : this.h.a;
            }
        } else {
            textView.setEnabled(false);
            c0867Dx = this.h.g;
        }
        if (this.j == null || i == -1) {
            c0867Dx.b(textView);
            return;
        }
        int i2 = this.d.g;
        c0867Dx.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j) {
        C2855b11 c2855b11E = C2855b11.e(j);
        C2855b11 c2855b11 = this.d;
        if (c2855b11E.equals(c2855b11)) {
            Calendar calendarC = Qb2.c(c2855b11.d);
            calendarC.setTimeInMillis(j);
            int i = calendarC.get(5);
            e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().b() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return l;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.d.h;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    @NonNull
    public final View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        int i2;
        Context context = viewGroup.getContext();
        if (this.h == null) {
            this.h = new C0945Ex(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iB = i - b();
        if (iB >= 0) {
            C2855b11 c2855b11 = this.d;
            if (iB >= c2855b11.i) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iB + 1;
                textView.setTag(c2855b11);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i2 = -1;
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        e(textView, item.longValue(), i2);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
