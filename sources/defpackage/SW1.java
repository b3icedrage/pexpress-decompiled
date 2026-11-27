package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class SW1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Notification e;
    public final /* synthetic */ SystemForegroundService g;

    public SW1(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.g = systemForegroundService;
        this.d = i;
        this.e = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.i.notify(this.d, this.e);
    }
}
