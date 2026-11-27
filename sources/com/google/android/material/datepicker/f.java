package com.google.android.material.datepicker;

import android.view.View;
import defpackage.C2855b11;
import defpackage.Nl2;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Nl2 e;

    public f(Nl2 nl2, int i) {
        this.e = nl2;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Nl2 nl2 = this.e;
        C2855b11 c2855b11B = C2855b11.b(this.d, nl2.d.j.e);
        MaterialCalendar<?> materialCalendar = nl2.d;
        a aVar = materialCalendar.h;
        C2855b11 c2855b11 = aVar.d;
        Calendar calendar = c2855b11.d;
        Calendar calendar2 = c2855b11B.d;
        if (calendar2.compareTo(calendar) < 0) {
            c2855b11B = c2855b11;
        } else {
            C2855b11 c2855b12 = aVar.e;
            if (calendar2.compareTo(c2855b12.d) > 0) {
                c2855b11B = c2855b12;
            }
        }
        materialCalendar.j(c2855b11B);
        materialCalendar.k(MaterialCalendar.d.d);
    }
}
