package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class TW1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SystemForegroundService e;

    public TW1(SystemForegroundService systemForegroundService, int i) {
        this.e = systemForegroundService;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.i.cancel(this.d);
    }
}
