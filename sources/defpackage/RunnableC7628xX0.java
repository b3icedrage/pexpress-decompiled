package defpackage;

import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: renamed from: xX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7628xX0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ MaterialCalendar e;

    public RunnableC7628xX0(MaterialCalendar materialCalendar, int i) {
        this.e = materialCalendar;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.n.i0(this.d);
    }
}
