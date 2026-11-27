package defpackage;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class WG1 extends AbstractC3118cG1 {

    @NotNull
    public final Date d;
    public final long e;

    public WG1() {
        this(N7.h(), System.nanoTime());
    }

    @Override // defpackage.AbstractC3118cG1, java.lang.Comparable
    /* JADX INFO: renamed from: b */
    public final int compareTo(@NotNull AbstractC3118cG1 abstractC3118cG1) {
        if (!(abstractC3118cG1 instanceof WG1)) {
            return super.compareTo(abstractC3118cG1);
        }
        WG1 wg1 = (WG1) abstractC3118cG1;
        long time = this.d.getTime();
        long time2 = wg1.d.getTime();
        return time == time2 ? Long.valueOf(this.e).compareTo(Long.valueOf(wg1.e)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // defpackage.AbstractC3118cG1
    public final long e(@NotNull AbstractC3118cG1 abstractC3118cG1) {
        return abstractC3118cG1 instanceof WG1 ? this.e - ((WG1) abstractC3118cG1).e : super.e(abstractC3118cG1);
    }

    @Override // defpackage.AbstractC3118cG1
    public final long f(@Nullable AbstractC3118cG1 abstractC3118cG1) {
        if (abstractC3118cG1 == null || !(abstractC3118cG1 instanceof WG1)) {
            return super.f(abstractC3118cG1);
        }
        WG1 wg1 = (WG1) abstractC3118cG1;
        int iCompareTo = compareTo(abstractC3118cG1);
        long j = this.e;
        long j2 = wg1.e;
        if (iCompareTo < 0) {
            return i() + (j2 - j);
        }
        return wg1.i() + (j - j2);
    }

    @Override // defpackage.AbstractC3118cG1
    public final long i() {
        return this.d.getTime() * 1000000;
    }

    public WG1(@NotNull Date date, long j) {
        this.d = date;
        this.e = j;
    }
}
