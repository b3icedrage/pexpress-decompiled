package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: renamed from: eE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3531eE1 {
    public static final C6170qb a = C6170qb.d();

    public static void a(Trace trace, C2493Yi0 c2493Yi0) {
        int i = c2493Yi0.a;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        int i2 = c2493Yi0.b;
        if (i2 > 0) {
            trace.putMetric("_fr_slo", i2);
        }
        int i3 = c2493Yi0.c;
        if (i3 > 0) {
            trace.putMetric("_fr_fzn", i3);
        }
        String str = trace.h;
        a.a();
    }
}
