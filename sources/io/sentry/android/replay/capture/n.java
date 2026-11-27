package io.sentry.android.replay.capture;

import defpackage.C6254qz;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {
    public final /* synthetic */ C6254qz d;

    public n(C6254qz c6254qz) {
        this.d = c6254qz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.invoke();
    }
}
