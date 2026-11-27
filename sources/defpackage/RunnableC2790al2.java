package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: al2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2790al2 implements Runnable {
    public static final String w = AS0.d("WorkerWrapper");
    public final Context d;
    public final String e;
    public final List<InterfaceC5046lD1> g;
    public final WorkerParameters.a h;
    public final Bk2 i;
    public c j;
    public final C4946kk2 k;
    public final androidx.work.a m;
    public final C0743Ch1 n;
    public final WorkDatabase o;
    public final Ck2 p;
    public final InterfaceC7627xX q;
    public final ArrayList r;
    public String s;
    public volatile boolean v;

    @NonNull
    public c.a l = new c.a.C0242a();

    @NonNull
    public final C6117qJ1<Boolean> t = new C6117qJ1<>();

    @NonNull
    public final C6117qJ1<c.a> u = new C6117qJ1<>();

    /* JADX INFO: renamed from: al2$a */
    public static class a {

        @NonNull
        public final Context a;

        @NonNull
        public final C0743Ch1 b;

        @NonNull
        public final C4946kk2 c;

        @NonNull
        public final androidx.work.a d;

        @NonNull
        public final WorkDatabase e;

        @NonNull
        public final Bk2 f;
        public List<InterfaceC5046lD1> g;
        public final ArrayList h;

        @NonNull
        public WorkerParameters.a i = new WorkerParameters.a();

        public a(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull C4946kk2 c4946kk2, @NonNull C0743Ch1 c0743Ch1, @NonNull WorkDatabase workDatabase, @NonNull Bk2 bk2, @NonNull ArrayList arrayList) {
            this.a = context.getApplicationContext();
            this.c = c4946kk2;
            this.b = c0743Ch1;
            this.d = aVar;
            this.e = workDatabase;
            this.f = bk2;
            this.h = arrayList;
        }
    }

    public RunnableC2790al2(@NonNull a aVar) {
        this.d = aVar.a;
        this.k = aVar.c;
        this.n = aVar.b;
        Bk2 bk2 = aVar.f;
        this.i = bk2;
        this.e = bk2.a;
        this.g = aVar.g;
        this.h = aVar.i;
        this.j = null;
        this.m = aVar.d;
        WorkDatabase workDatabase = aVar.e;
        this.o = workDatabase;
        this.p = workDatabase.u();
        this.q = workDatabase.p();
        this.r = aVar.h;
    }

    public final void a(c.a aVar) {
        boolean z = aVar instanceof c.a.C0243c;
        Bk2 bk2 = this.i;
        if (!z) {
            if (aVar instanceof c.a.b) {
                AS0.c().getClass();
                c();
                return;
            }
            AS0.c().getClass();
            if (bk2.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        AS0.c().getClass();
        if (bk2.c()) {
            d();
            return;
        }
        InterfaceC7627xX interfaceC7627xX = this.q;
        String str = this.e;
        Ck2 ck2 = this.p;
        WorkDatabase workDatabase = this.o;
        workDatabase.c();
        try {
            ck2.h(EnumC3638ek2.g, str);
            ck2.j(str, ((c.a.C0243c) this.l).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str2 : interfaceC7627xX.a(str)) {
                if (ck2.n(str2) == EnumC3638ek2.i && interfaceC7627xX.b(str2)) {
                    AS0.c().getClass();
                    ck2.h(EnumC3638ek2.d, str2);
                    ck2.q(str2, jCurrentTimeMillis);
                }
            }
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final void b() {
        boolean zH = h();
        WorkDatabase workDatabase = this.o;
        String str = this.e;
        if (!zH) {
            workDatabase.c();
            try {
                EnumC3638ek2 enumC3638ek2N = this.p.n(str);
                workDatabase.t().a(str);
                if (enumC3638ek2N == null) {
                    e(false);
                } else if (enumC3638ek2N == EnumC3638ek2.e) {
                    a(this.l);
                } else if (!enumC3638ek2N.b()) {
                    c();
                }
                workDatabase.n();
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        List<InterfaceC5046lD1> list = this.g;
        if (list != null) {
            Iterator<InterfaceC5046lD1> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(str);
            }
            C6308rD1.a(this.m, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.e;
        Ck2 ck2 = this.p;
        WorkDatabase workDatabase = this.o;
        workDatabase.c();
        try {
            ck2.h(EnumC3638ek2.d, str);
            ck2.q(str, System.currentTimeMillis());
            ck2.d(str, -1L);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.e;
        Ck2 ck2 = this.p;
        WorkDatabase workDatabase = this.o;
        workDatabase.c();
        try {
            ck2.q(str, System.currentTimeMillis());
            ck2.h(EnumC3638ek2.d, str);
            ck2.p(str);
            ck2.c(str);
            ck2.d(str, -1L);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final void e(boolean z) {
        boolean zContainsKey;
        this.o.c();
        try {
            if (!this.o.u().l()) {
                C3811fb1.a(this.d, RescheduleReceiver.class, false);
            }
            if (z) {
                this.p.h(EnumC3638ek2.d, this.e);
                this.p.d(this.e, -1L);
            }
            if (this.i != null && this.j != null) {
                C0743Ch1 c0743Ch1 = this.n;
                String str = this.e;
                synchronized (c0743Ch1.p) {
                    zContainsKey = c0743Ch1.j.containsKey(str);
                }
                if (zContainsKey) {
                    C0743Ch1 c0743Ch2 = this.n;
                    String str2 = this.e;
                    synchronized (c0743Ch2.p) {
                        c0743Ch2.j.remove(str2);
                        c0743Ch2.i();
                    }
                }
            }
            this.o.n();
            this.o.j();
            this.t.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.o.j();
            throw th;
        }
    }

    public final void f() {
        EnumC3638ek2 enumC3638ek2N = this.p.n(this.e);
        if (enumC3638ek2N == EnumC3638ek2.e) {
            AS0.c().getClass();
            e(true);
        } else {
            AS0 as0C = AS0.c();
            Objects.toString(enumC3638ek2N);
            as0C.getClass();
            e(false);
        }
    }

    public final void g() {
        String str = this.e;
        WorkDatabase workDatabase = this.o;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                Ck2 ck2 = this.p;
                if (zIsEmpty) {
                    ck2.j(str, ((c.a.C0242a) this.l).a);
                    workDatabase.n();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (ck2.n(str2) != EnumC3638ek2.j) {
                        ck2.h(EnumC3638ek2.h, str2);
                    }
                    linkedList.addAll(this.q.a(str2));
                }
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.v) {
            return false;
        }
        AS0.c().getClass();
        EnumC3638ek2 enumC3638ek2N = this.p.n(this.e);
        if (enumC3638ek2N == null) {
            e(false);
            return true;
        }
        e(!enumC3638ek2N.b());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: all -> 0x0066, TryCatch #2 {all -> 0x0066, blocks: (B:14:0x004f, B:17:0x0055, B:22:0x0069, B:24:0x006f, B:26:0x0073, B:36:0x0099, B:31:0x007c, B:33:0x0088), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #2 {all -> 0x0066, blocks: (B:14:0x004f, B:17:0x0055, B:22:0x0069, B:24:0x006f, B:26:0x0073, B:36:0x0099, B:31:0x007c, B:33:0x0088), top: B:81:0x004f }] */
    @Override // java.lang.Runnable
    public final void run() {
        GA0 ga0;
        b bVarA;
        boolean z;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.e;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList<String> arrayList = this.r;
        boolean z2 = true;
        for (String str2 : arrayList) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.s = sb.toString();
        Bk2 bk2 = this.i;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.o;
        workDatabase.c();
        try {
            EnumC3638ek2 enumC3638ek2 = bk2.b;
            EnumC3638ek2 enumC3638ek3 = EnumC3638ek2.d;
            if (enumC3638ek2 != enumC3638ek3) {
                f();
                workDatabase.n();
                AS0.c().getClass();
                workDatabase.j();
                return;
            }
            if (!bk2.c()) {
                if (bk2.b == enumC3638ek3 && bk2.k > 0) {
                    if (System.currentTimeMillis() < bk2.a()) {
                        AS0.c().getClass();
                        e(true);
                        workDatabase.n();
                        workDatabase.j();
                        return;
                    }
                }
            } else if (System.currentTimeMillis() < bk2.a()) {
                AS0.c().getClass();
                e(true);
                workDatabase.n();
                workDatabase.j();
                return;
            }
            workDatabase.n();
            workDatabase.j();
            boolean zC = bk2.c();
            Ck2 ck2 = this.p;
            androidx.work.a aVar = this.m;
            String str3 = w;
            if (zC) {
                bVarA = bk2.e;
            } else {
                C5027l8 c5027l8 = aVar.d;
                String str4 = bk2.d;
                c5027l8.getClass();
                String str5 = GA0.a;
                try {
                    ga0 = (GA0) Class.forName(str4).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    AS0.c().b(GA0.a, C5491nL.c("Trouble instantiating + ", str4), e);
                    ga0 = null;
                }
                if (ga0 == null) {
                    AS0.c().a(str3, "Could not create Input Merger " + bk2.d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bk2.e);
                arrayList2.addAll(ck2.s(str));
                bVarA = ga0.a(arrayList2);
            }
            UUID uuidFromString = UUID.fromString(str);
            ExecutorService executorService = aVar.a;
            C4946kk2 c4946kk2 = this.k;
            C7679xk2 c7679xk2 = new C7679xk2(workDatabase, c4946kk2);
            C3219ck2 c3219ck2 = new C3219ck2(workDatabase, this.n, c4946kk2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.a = uuidFromString;
            workerParameters.b = bVarA;
            workerParameters.c = new HashSet(arrayList);
            workerParameters.d = this.h;
            workerParameters.e = bk2.k;
            workerParameters.f = executorService;
            workerParameters.g = c4946kk2;
            Xk2 xk2 = aVar.c;
            workerParameters.h = xk2;
            workerParameters.i = c7679xk2;
            workerParameters.j = c3219ck2;
            c cVar = this.j;
            String str6 = bk2.c;
            if (cVar == null) {
                this.j = xk2.b(this.d, str6, workerParameters);
            }
            c cVar2 = this.j;
            if (cVar2 == null) {
                AS0.c().a(str3, "Could not create Worker " + str6);
                g();
                return;
            }
            if (cVar2.isUsed()) {
                AS0.c().a(str3, "Received an already-used Worker " + str6 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.j.setUsed();
            workDatabase.c();
            try {
                if (ck2.n(str) == enumC3638ek3) {
                    ck2.h(EnumC3638ek2.e, str);
                    ck2.t(str);
                    z = true;
                } else {
                    z = false;
                }
                workDatabase.n();
                workDatabase.j();
                if (!z) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                RunnableC2786ak2 runnableC2786ak2 = new RunnableC2786ak2(this.d, this.i, this.j, c3219ck2, this.k);
                c4946kk2.c.execute(runnableC2786ak2);
                C6117qJ1<Void> c6117qJ1 = runnableC2786ak2.d;
                KO ko = new KO(1, this, c6117qJ1);
                MW1 mw1 = new MW1();
                C6117qJ1<c.a> c6117qJ2 = this.u;
                c6117qJ2.f(ko, mw1);
                c6117qJ1.f(new Yk2(this, c6117qJ1), c4946kk2.c);
                c6117qJ2.f(new Zk2(this, this.s), c4946kk2.a);
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}
