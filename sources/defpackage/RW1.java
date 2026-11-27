package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.foreground.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RW1 implements Sj2, R90 {
    public static final String n = AS0.d("SystemFgDispatcher");
    public final C4736jk2 d;
    public final C4946kk2 e;
    public final Object g = new Object();
    public C3429dk2 h;
    public final LinkedHashMap i;
    public final HashMap j;
    public final HashSet k;
    public final Tj2 l;
    public SystemForegroundService m;

    public RW1(@NonNull Context context) {
        C4736jk2 c4736jk2B = C4736jk2.b(context);
        this.d = c4736jk2B;
        this.e = c4736jk2B.d;
        this.h = null;
        this.i = new LinkedHashMap();
        this.k = new HashSet();
        this.j = new HashMap();
        this.l = new Tj2(c4736jk2B.j, this);
        c4736jk2B.f.b(this);
    }

    @NonNull
    public static Intent b(@NonNull Context context, @NonNull C3429dk2 c3429dk2, @NonNull C5565nh0 c5565nh0) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c5565nh0.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c5565nh0.b);
        intent.putExtra("KEY_NOTIFICATION", c5565nh0.c);
        intent.putExtra("KEY_WORKSPEC_ID", c3429dk2.a);
        intent.putExtra("KEY_GENERATION", c3429dk2.b);
        return intent;
    }

    @NonNull
    public static Intent c(@NonNull Context context, @NonNull C3429dk2 c3429dk2, @NonNull C5565nh0 c5565nh0) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c3429dk2.a);
        intent.putExtra("KEY_GENERATION", c3429dk2.b);
        intent.putExtra("KEY_NOTIFICATION_ID", c5565nh0.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c5565nh0.b);
        intent.putExtra("KEY_NOTIFICATION", c5565nh0.c);
        return intent;
    }

    @Override // defpackage.R90
    public final void a(@NonNull C3429dk2 c3429dk2, boolean z) {
        Map.Entry entry;
        synchronized (this.g) {
            try {
                Bk2 bk2 = (Bk2) this.j.remove(c3429dk2);
                if (bk2 != null ? this.k.remove(bk2) : false) {
                    this.l.b(this.k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5565nh0 c5565nh0 = (C5565nh0) this.i.remove(c3429dk2);
        if (c3429dk2.equals(this.h) && this.i.size() > 0) {
            Iterator it = this.i.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.h = (C3429dk2) entry.getKey();
            if (this.m != null) {
                C5565nh0 c5565nh1 = (C5565nh0) entry.getValue();
                SystemForegroundService systemForegroundService = this.m;
                systemForegroundService.e.post(new a(systemForegroundService, c5565nh1.a, c5565nh1.c, c5565nh1.b));
                SystemForegroundService systemForegroundService2 = this.m;
                systemForegroundService2.e.post(new TW1(systemForegroundService2, c5565nh1.a));
            }
        }
        SystemForegroundService systemForegroundService3 = this.m;
        if (c5565nh0 == null || systemForegroundService3 == null) {
            return;
        }
        AS0 as0C = AS0.c();
        c3429dk2.toString();
        as0C.getClass();
        systemForegroundService3.e.post(new TW1(systemForegroundService3, c5565nh0.a));
    }

    @Override // defpackage.Sj2
    public final void d(@NonNull ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bk2 bk2 = (Bk2) it.next();
            String str = bk2.a;
            AS0.c().getClass();
            C3429dk2 c3429dk2I = ED.i(bk2);
            C4736jk2 c4736jk2 = this.d;
            c4736jk2.d.a(new JQ1(c4736jk2, new C6135qP1(c3429dk2I), true));
        }
    }

    public final void e(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C3429dk2 c3429dk2 = new C3429dk2(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AS0.c().getClass();
        if (notification == null || this.m == null) {
            return;
        }
        C5565nh0 c5565nh0 = new C5565nh0(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.i;
        linkedHashMap.put(c3429dk2, c5565nh0);
        if (this.h == null) {
            this.h = c3429dk2;
            SystemForegroundService systemForegroundService = this.m;
            systemForegroundService.e.post(new a(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.m;
        systemForegroundService2.e.post(new SW1(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((C5565nh0) ((Map.Entry) it.next()).getValue()).b;
        }
        C5565nh0 c5565nh1 = (C5565nh0) linkedHashMap.get(this.h);
        if (c5565nh1 != null) {
            SystemForegroundService systemForegroundService3 = this.m;
            systemForegroundService3.e.post(new a(systemForegroundService3, c5565nh1.a, c5565nh1.c, i));
        }
    }

    public final void g() {
        this.m = null;
        synchronized (this.g) {
            this.l.c();
        }
        this.d.f.e(this);
    }

    @Override // defpackage.Sj2
    public final void f(@NonNull List<Bk2> list) {
    }
}
