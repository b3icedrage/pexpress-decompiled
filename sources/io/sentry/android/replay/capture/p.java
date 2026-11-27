package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Runnable {
    public final /* synthetic */ q d;

    public p(q qVar) {
        this.d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.invoke();
    }
}
