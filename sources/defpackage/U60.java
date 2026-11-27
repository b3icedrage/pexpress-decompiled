package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class U60<R> implements C5751ob0.d {
    public static final c B = new c();
    public boolean A;
    public final e d;
    public final RP1.a e;
    public final Q60 g;
    public final C5751ob0.c h;
    public final c i;
    public final Q60 j;
    public final ExecutorServiceC2238Vl0 k;
    public final ExecutorServiceC2238Vl0 l;
    public final ExecutorServiceC2238Vl0 m;
    public final AtomicInteger n;
    public V60 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public InterfaceC3667et1<?> s;
    public CS t;
    public boolean u;
    public C2160Ul0 v;
    public boolean w;
    public W60<?> x;
    public RunnableC6777tU<R> y;
    public volatile boolean z;

    public class a implements Runnable {
        public final DM1 d;

        public a(DM1 dm1) {
            this.d = dm1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DM1 dm1 = this.d;
            dm1.a.a();
            synchronized (dm1.b) {
                synchronized (U60.this) {
                    try {
                        e eVar = U60.this.d;
                        DM1 dm2 = this.d;
                        eVar.getClass();
                        if (eVar.d.contains(new d(dm2, C3387da0.b))) {
                            U60 u60 = U60.this;
                            DM1 dm3 = this.d;
                            u60.getClass();
                            try {
                                dm3.g(u60.v, 5);
                            } catch (Throwable th) {
                                throw new C1805Px(th);
                            }
                        }
                        U60.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        public final DM1 d;

        public b(DM1 dm1) {
            this.d = dm1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DM1 dm1 = this.d;
            dm1.a.a();
            synchronized (dm1.b) {
                synchronized (U60.this) {
                    try {
                        e eVar = U60.this.d;
                        DM1 dm2 = this.d;
                        eVar.getClass();
                        if (eVar.d.contains(new d(dm2, C3387da0.b))) {
                            U60.this.x.a();
                            U60 u60 = U60.this;
                            DM1 dm3 = this.d;
                            u60.getClass();
                            try {
                                dm3.h(u60.x, u60.t, u60.A);
                                U60.this.h(this.d);
                            } catch (Throwable th) {
                                throw new C1805Px(th);
                            }
                        }
                        U60.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {
        public final DM1 a;
        public final Executor b;

        public d(DM1 dm1, Executor executor) {
            this.a = dm1;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final ArrayList d;

        public e(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<d> iterator() {
            return this.d.iterator();
        }
    }

    public U60() {
        throw null;
    }

    public U60(ExecutorServiceC2238Vl0 executorServiceC2238Vl0, ExecutorServiceC2238Vl0 executorServiceC2238Vl1, ExecutorServiceC2238Vl0 executorServiceC2238Vl2, ExecutorServiceC2238Vl0 executorServiceC2238Vl3, Q60 q60, Q60 q61, C5751ob0.c cVar) {
        c cVar2 = B;
        this.d = new e(new ArrayList(2));
        this.e = new RP1.a();
        this.n = new AtomicInteger();
        this.k = executorServiceC2238Vl0;
        this.l = executorServiceC2238Vl1;
        this.m = executorServiceC2238Vl3;
        this.j = q60;
        this.g = q61;
        this.h = cVar;
        this.i = cVar2;
    }

    public final synchronized void a(DM1 dm1, Executor executor) {
        try {
            this.e.a();
            e eVar = this.d;
            eVar.getClass();
            eVar.d.add(new d(dm1, executor));
            if (this.u) {
                d(1);
                executor.execute(new b(dm1));
            } else if (this.w) {
                d(1);
                executor.execute(new a(dm1));
            } else {
                UE.c("Cannot add callbacks to a cancelled EngineJob", !this.z);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (e()) {
            return;
        }
        this.z = true;
        RunnableC6777tU<R> runnableC6777tU = this.y;
        runnableC6777tU.H = true;
        InterfaceC6981uS interfaceC6981uS = runnableC6777tU.F;
        if (interfaceC6981uS != null) {
            interfaceC6981uS.cancel();
        }
        Q60 q60 = this.j;
        V60 v60 = this.o;
        synchronized (q60) {
            C4376iG0 c4376iG0 = q60.a;
            c4376iG0.getClass();
            HashMap map = (HashMap) (this.r ? c4376iG0.e : c4376iG0.d);
            if (equals(map.get(v60))) {
                map.remove(v60);
            }
        }
    }

    public final void c() {
        W60<?> w60;
        synchronized (this) {
            try {
                this.e.a();
                UE.c("Not yet complete!", e());
                int iDecrementAndGet = this.n.decrementAndGet();
                UE.c("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    w60 = this.x;
                    g();
                } else {
                    w60 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (w60 != null) {
            w60.e();
        }
    }

    public final synchronized void d(int i) {
        W60<?> w60;
        UE.c("Not yet complete!", e());
        if (this.n.getAndAdd(i) == 0 && (w60 = this.x) != null) {
            w60.a();
        }
    }

    public final boolean e() {
        return this.w || this.u || this.z;
    }

    @Override // defpackage.C5751ob0.d
    @NonNull
    public final RP1.a f() {
        return this.e;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.o == null) {
            throw new IllegalArgumentException();
        }
        this.d.d.clear();
        this.o = null;
        this.x = null;
        this.s = null;
        this.w = false;
        this.z = false;
        this.u = false;
        this.A = false;
        RunnableC6777tU<R> runnableC6777tU = this.y;
        RunnableC6777tU.c cVar = runnableC6777tU.k;
        synchronized (cVar) {
            cVar.a = true;
            zA = cVar.a();
        }
        if (zA) {
            runnableC6777tU.p();
        }
        this.y = null;
        this.v = null;
        this.t = null;
        this.h.b(this);
    }

    public final synchronized void h(DM1 dm1) {
        try {
            this.e.a();
            e eVar = this.d;
            eVar.d.remove(new d(dm1, C3387da0.b));
            if (this.d.d.isEmpty()) {
                b();
                if (this.u || this.w) {
                    if (this.n.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
