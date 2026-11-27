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
public final class yn2 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final fn2 b;
    public boolean g;
    public final Intent h;
    public xn2 l;
    public Xm2 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final mn2 j = new IBinder.DeathRecipient() { // from class: mn2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            yn2 yn2Var = this.a;
            yn2Var.b.c("reportBinderDeath", new Object[0]);
            sn2 sn2Var = (sn2) yn2Var.i.get();
            if (sn2Var != null) {
                yn2Var.b.c("calling onBinderDied", new Object[0]);
                sn2Var.zza();
            } else {
                yn2Var.b.c("%s : Binder has died.", yn2Var.c);
                for (hn2 hn2Var : yn2Var.d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(yn2Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = hn2Var.d;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                yn2Var.d.clear();
            }
            synchronized (yn2Var.f) {
                yn2Var.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [mn2] */
    public yn2(Context context, fn2 fn2Var, Intent intent) {
        this.a = context;
        this.b = fn2Var;
        this.h = intent;
    }

    public static void b(yn2 yn2Var, hn2 hn2Var) {
        Xm2 xm2 = yn2Var.m;
        ArrayList<hn2> arrayList = yn2Var.d;
        fn2 fn2Var = yn2Var.b;
        if (xm2 != null || yn2Var.g) {
            if (!yn2Var.g) {
                hn2Var.run();
                return;
            } else {
                fn2Var.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(hn2Var);
                return;
            }
        }
        fn2Var.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(hn2Var);
        xn2 xn2Var = new xn2(yn2Var);
        yn2Var.l = xn2Var;
        yn2Var.g = true;
        if (yn2Var.a.bindService(yn2Var.h, xn2Var, 1)) {
            return;
        }
        fn2Var.c("Failed to bind to the service.", new Object[0]);
        yn2Var.g = false;
        for (hn2 hn2Var2 : arrayList) {
            An2 an2 = new An2("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = hn2Var2.d;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(an2);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
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

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new qn2(this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
