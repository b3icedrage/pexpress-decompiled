package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Xl2 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final C7266vm2 b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final C4019gb i;
    public final WeakReference j;
    public final C7687xm2 k;
    public final AtomicInteger l;
    public Wl2 m;
    public InterfaceC6846tm2 n;

    /* JADX WARN: Type inference failed for: r1v3, types: [xm2] */
    public Xl2(Context context, C7266vm2 c7266vm2, Intent intent) {
        C4019gb c4019gb = C4019gb.e;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.k = new IBinder.DeathRecipient() { // from class: xm2
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                Xl2 xl2 = this.a;
                xl2.b.a("reportBinderDeath", new Object[0]);
                Bm2 bm2 = (Bm2) xl2.j.get();
                if (bm2 != null) {
                    xl2.b.a("calling onBinderDied", new Object[0]);
                    bm2.a();
                } else {
                    xl2.b.a("%s : Binder has died.", xl2.c);
                    Iterator it = xl2.d.iterator();
                    while (it.hasNext()) {
                        ((AbstractRunnableC7477wm2) it.next()).a(new RemoteException(String.valueOf(xl2.c).concat(" : Binder has died.")));
                    }
                    xl2.d.clear();
                }
                synchronized (xl2.f) {
                    xl2.c();
                }
            }
        };
        this.l = new AtomicInteger(0);
        this.a = context;
        this.b = c7266vm2;
        this.c = "IntegrityService";
        this.h = intent;
        this.i = c4019gb;
        this.j = new WeakReference(null);
    }

    public static void b(Xl2 xl2, Zl2 zl2) {
        InterfaceC6846tm2 interfaceC6846tm2 = xl2.n;
        ArrayList arrayList = xl2.d;
        C7266vm2 c7266vm2 = xl2.b;
        if (interfaceC6846tm2 != null || xl2.g) {
            if (!xl2.g) {
                zl2.run();
                return;
            } else {
                c7266vm2.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zl2);
                return;
            }
        }
        c7266vm2.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(zl2);
        Wl2 wl2 = new Wl2(xl2);
        xl2.m = wl2;
        xl2.g = true;
        if (xl2.a.bindService(xl2.h, wl2, 1)) {
            return;
        }
        c7266vm2.a("Failed to bind to the service.", new Object[0]);
        xl2.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC7477wm2) it.next()).a(new Yl2("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
