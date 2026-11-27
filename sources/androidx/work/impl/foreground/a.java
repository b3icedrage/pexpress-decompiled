package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Notification e;
    public final /* synthetic */ int g;
    public final /* synthetic */ SystemForegroundService h;

    public a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.h = systemForegroundService;
        this.d = i;
        this.e = notification;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.g;
        Notification notification = this.e;
        int i3 = this.d;
        SystemForegroundService systemForegroundService = this.h;
        if (i >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i3, notification, i2);
        } else if (i >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i3, notification, i2);
        } else {
            systemForegroundService.startForeground(i3, notification);
        }
    }
}
