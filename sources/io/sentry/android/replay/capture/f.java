package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ g d;

    public f(g gVar) {
        this.d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.invoke();
    }
}
