package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: Ch1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0743Ch1 implements R90 {
    public static final String q = AS0.d("Processor");
    public final Context e;
    public final androidx.work.a g;
    public final C4946kk2 h;
    public final WorkDatabase i;
    public final List<InterfaceC5046lD1> m;
    public final HashMap k = new HashMap();
    public final HashMap j = new HashMap();
    public final HashSet n = new HashSet();
    public final ArrayList o = new ArrayList();
    public PowerManager.WakeLock d = null;
    public final Object p = new Object();
    public final HashMap l = new HashMap();

    /* JADX INFO: renamed from: Ch1$a */
    public static class a implements Runnable {

        @NonNull
        public final C0743Ch1 d;

        @NonNull
        public final C3429dk2 e;

        @NonNull
        public final C6117qJ1 g;

        public a(@NonNull C0743Ch1 c0743Ch1, @NonNull C3429dk2 c3429dk2, @NonNull C6117qJ1 c6117qJ1) {
            this.d = c0743Ch1;
            this.e = c3429dk2;
            this.g = c6117qJ1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.g.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.d.a(this.e, zBooleanValue);
        }
    }

    public C0743Ch1(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull C4946kk2 c4946kk2, @NonNull WorkDatabase workDatabase, @NonNull List list) {
        this.e = context;
        this.g = aVar;
        this.h = c4946kk2;
        this.i = workDatabase;
        this.m = list;
    }

    public static boolean c(RunnableC2790al2 runnableC2790al2) {
        if (runnableC2790al2 == null) {
            AS0.c().getClass();
            return false;
        }
        runnableC2790al2.v = true;
        runnableC2790al2.h();
        runnableC2790al2.u.cancel(true);
        if (runnableC2790al2.j == null || !(runnableC2790al2.u.d instanceof AbstractC4575j0.b)) {
            Objects.toString(runnableC2790al2.i);
            AS0.c().getClass();
        } else {
            runnableC2790al2.j.stop();
        }
        AS0.c().getClass();
        return true;
    }

    @Override // defpackage.R90
    public final void a(@NonNull C3429dk2 c3429dk2, boolean z) {
        synchronized (this.p) {
            try {
                RunnableC2790al2 runnableC2790al2 = (RunnableC2790al2) this.k.get(c3429dk2.a);
                if (runnableC2790al2 != null && c3429dk2.equals(ED.i(runnableC2790al2.i))) {
                    this.k.remove(c3429dk2.a);
                }
                AS0.c().getClass();
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    ((R90) it.next()).a(c3429dk2, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@NonNull R90 r90) {
        synchronized (this.p) {
            this.o.add(r90);
        }
    }

    public final boolean d(@NonNull String str) {
        boolean z;
        synchronized (this.p) {
            try {
                z = this.k.containsKey(str) || this.j.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void e(@NonNull R90 r90) {
        synchronized (this.p) {
            this.o.remove(r90);
        }
    }

    public final void f(@NonNull C3429dk2 c3429dk2) {
        C4946kk2 c4946kk2 = this.h;
        c4946kk2.c.execute(new W10(1, this, c3429dk2));
    }

    public final void g(@NonNull String str, @NonNull C5565nh0 c5565nh0) {
        synchronized (this.p) {
            try {
                AS0.c().getClass();
                RunnableC2790al2 runnableC2790al2 = (RunnableC2790al2) this.k.remove(str);
                if (runnableC2790al2 != null) {
                    if (this.d == null) {
                        PowerManager.WakeLock wakeLockA = Bf2.a(this.e, "ProcessorForegroundLck");
                        this.d = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.j.put(str, runnableC2790al2);
                    C6333rM.startForegroundService(this.e, RW1.c(this.e, ED.i(runnableC2790al2.i), c5565nh0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(@NonNull C6135qP1 c6135qP1, WorkerParameters.a aVar) throws Throwable {
        Throwable th;
        C3429dk2 c3429dk2 = c6135qP1.a;
        final String str = c3429dk2.a;
        final ArrayList arrayList = new ArrayList();
        Bk2 bk2 = (Bk2) this.i.m(new Callable() { // from class: Bh1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.d.i;
                Sk2 sk2V = workDatabase.v();
                String str2 = str;
                arrayList.addAll(sk2V.a(str2));
                return workDatabase.u().o(str2);
            }
        });
        if (bk2 == null) {
            AS0.c().e(q, "Didn't find WorkSpec for id " + c3429dk2);
            f(c3429dk2);
            return false;
        }
        synchronized (this.p) {
            try {
                try {
                    try {
                        if (d(str)) {
                            Set set = (Set) this.l.get(str);
                            if (((C6135qP1) set.iterator().next()).a.b == c3429dk2.b) {
                                set.add(c6135qP1);
                                AS0 as0C = AS0.c();
                                c3429dk2.toString();
                                as0C.getClass();
                            } else {
                                f(c3429dk2);
                            }
                            return false;
                        }
                        if (bk2.t != c3429dk2.b) {
                            f(c3429dk2);
                            return false;
                        }
                        RunnableC2790al2.a aVar2 = new RunnableC2790al2.a(this.e, this.g, this.h, this, this.i, bk2, arrayList);
                        aVar2.g = this.m;
                        if (aVar != null) {
                            aVar2.i = aVar;
                        }
                        RunnableC2790al2 runnableC2790al2 = new RunnableC2790al2(aVar2);
                        C6117qJ1<Boolean> c6117qJ1 = runnableC2790al2.t;
                        c6117qJ1.f(new a(this, c6135qP1.a, c6117qJ1), this.h.c);
                        this.k.put(str, runnableC2790al2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(c6135qP1);
                        this.l.put(str, hashSet);
                        this.h.a.execute(runnableC2790al2);
                        AS0 as0C2 = AS0.c();
                        c3429dk2.toString();
                        as0C2.getClass();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    public final void i() {
        synchronized (this.p) {
            try {
                if (this.j.isEmpty()) {
                    Context context = this.e;
                    String str = RW1.n;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.e.startService(intent);
                    } catch (Throwable th) {
                        AS0.c().b(q, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.d;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.d = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
