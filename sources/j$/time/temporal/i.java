package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
enum i implements t {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    private final String a;

    static {
        Duration duration = Duration.c;
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.t
    public final m p(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            r rVar = j.c;
            return mVar.e(Math.addExact(mVar.j(rVar), j), rVar);
        }
        if (i == 2) {
            return mVar.i(j / 4, b.YEARS).i((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
