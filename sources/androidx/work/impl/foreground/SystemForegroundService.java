package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.AS0;
import defpackage.C4736jk2;
import defpackage.C4988ky;
import defpackage.KP0;
import defpackage.QW1;
import defpackage.RW1;
import io.sentry.android.core.b0;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends KP0 {
    public static final String j = AS0.d("SystemFgService");
    public Handler e;
    public boolean g;
    public RW1 h;
    public NotificationManager i;

    public static class a {
        public static void a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    public static class b {
        public static void a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                AS0 as0C = AS0.c();
                String str = SystemForegroundService.j;
                if (((AS0.a) as0C).c <= 5) {
                    b0.f(str, "Unable to start foreground service", e);
                }
            }
        }
    }

    public final void a() {
        this.e = new Handler(Looper.getMainLooper());
        this.i = (NotificationManager) getApplicationContext().getSystemService("notification");
        RW1 rw1 = new RW1(getApplicationContext());
        this.h = rw1;
        if (rw1.m != null) {
            AS0.c().a(RW1.n, "A callback already exists.");
        } else {
            rw1.m = this;
        }
    }

    @Override // defpackage.KP0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.KP0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.h.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.g) {
            AS0.c().getClass();
            this.h.g();
            a();
            this.g = false;
        }
        if (intent == null) {
            return 3;
        }
        RW1 rw1 = this.h;
        rw1.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            AS0 as0C = AS0.c();
            Objects.toString(intent);
            as0C.getClass();
            rw1.e.a(new QW1(rw1, intent.getStringExtra("KEY_WORKSPEC_ID")));
            rw1.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            rw1.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            AS0.c().getClass();
            SystemForegroundService systemForegroundService = rw1.m;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.g = true;
            AS0.c().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        AS0 as0C2 = AS0.c();
        Objects.toString(intent);
        as0C2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        C4736jk2 c4736jk2 = rw1.d;
        c4736jk2.getClass();
        c4736jk2.d.a(new C4988ky(c4736jk2, uuidFromString));
        return 3;
    }
}
