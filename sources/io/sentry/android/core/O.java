package io.sentry.android.core;

import defpackage.SD1;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends TimerTask {
    public final /* synthetic */ P d;

    public O(P p) {
        this.d = p;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        P p = this.d;
        boolean z = p.k;
        SD1 sd1 = p.j;
        if (z) {
            sd1.s();
        }
        sd1.p().getReplayController().stop();
        sd1.p().getContinuousProfiler().a(false);
    }
}
