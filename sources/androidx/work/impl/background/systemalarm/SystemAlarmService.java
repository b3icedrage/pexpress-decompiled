package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.AS0;
import defpackage.Bf2;
import defpackage.Cf2;
import defpackage.KP0;
import defpackage.OW1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends KP0 {
    public OW1 e;
    public boolean g;

    static {
        AS0.d("SystemAlarmService");
    }

    public final void a() {
        this.g = true;
        AS0.c().getClass();
        String str = Bf2.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (Cf2.a) {
            linkedHashMap.putAll(Cf2.b);
            Unit unit = Unit.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                AS0.c().e(Bf2.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.KP0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OW1 ow1 = new OW1(this);
        this.e = ow1;
        if (ow1.m != null) {
            AS0.c().a(OW1.n, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            ow1.m = this;
        }
        this.g = false;
    }

    @Override // defpackage.KP0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.g = true;
        OW1 ow1 = this.e;
        ow1.getClass();
        AS0.c().getClass();
        ow1.h.e(ow1);
        ow1.m = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.g) {
            AS0.c().getClass();
            OW1 ow1 = this.e;
            ow1.getClass();
            AS0.c().getClass();
            ow1.h.e(ow1);
            ow1.m = null;
            OW1 ow2 = new OW1(this);
            this.e = ow2;
            if (ow2.m != null) {
                AS0.c().a(OW1.n, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                ow2.m = this;
            }
            this.g = false;
        }
        if (intent == null) {
            return 3;
        }
        this.e.b(i2, intent);
        return 3;
    }
}
