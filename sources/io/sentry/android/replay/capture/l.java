package io.sentry.android.replay.capture;

import defpackage.C7225vc1;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Runnable {
    public final /* synthetic */ C7225vc1 d;

    public l(C7225vc1 c7225vc1) {
        this.d = c7225vc1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.invoke();
    }
}
