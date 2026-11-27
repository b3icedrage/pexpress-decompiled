package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Runnable {
    public final /* synthetic */ j d;

    public i(j jVar) {
        this.d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.invoke();
    }
}
