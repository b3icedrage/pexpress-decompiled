package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: tU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6777tU<R> implements InterfaceC6981uS.a, Runnable, Comparable<RunnableC6777tU<?>>, C5751ob0.d {
    public InterfaceC3129cK0 A;
    public InterfaceC3129cK0 B;
    public Object C;
    public CS D;
    public InterfaceC6771tS<?> E;
    public volatile InterfaceC6981uS F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public final Q60.c h;
    public final C5751ob0.c i;
    public C2082Tl0 l;
    public InterfaceC3129cK0 m;
    public EnumC7035uh1 n;
    public V60 o;
    public int p;
    public int q;
    public AbstractC2634a20 r;
    public C4227ha1 s;
    public U60 t;
    public int u;
    public e v;
    public d w;
    public boolean x;
    public Object y;
    public Thread z;
    public final C6567sU<R> d = new C6567sU<>();
    public final ArrayList e = new ArrayList();
    public final RP1.a g = new RP1.a();
    public final b<?> j = new b<>();
    public final c k = new c();

    /* JADX INFO: renamed from: tU$a */
    public final class a<Z> {
        public final CS a;

        public a(CS cs) {
            this.a = cs;
        }
    }

    /* JADX INFO: renamed from: tU$b */
    public static class b<Z> {
        public InterfaceC3129cK0 a;
        public InterfaceC5398mt1<Z> b;
        public C4670jS0<Z> c;
    }

    /* JADX INFO: renamed from: tU$c */
    public static class c {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: tU$d */
    public static final class d {
        public static final d d;
        public static final d e;
        public static final d g;
        public static final /* synthetic */ d[] h;

        static {
            d dVar = new d("INITIALIZE", 0);
            d = dVar;
            d dVar2 = new d("SWITCH_TO_SOURCE_SERVICE", 1);
            e = dVar2;
            d dVar3 = new d("DECODE_DATA", 2);
            g = dVar3;
            h = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: tU$e */
    public static final class e {
        public static final e d;
        public static final e e;
        public static final e g;
        public static final e h;
        public static final e i;
        public static final e j;
        public static final /* synthetic */ e[] k;

        static {
            e eVar = new e("INITIALIZE", 0);
            d = eVar;
            e eVar2 = new e("RESOURCE_CACHE", 1);
            e = eVar2;
            e eVar3 = new e("DATA_CACHE", 2);
            g = eVar3;
            e eVar4 = new e("SOURCE", 3);
            h = eVar4;
            e eVar5 = new e("ENCODE", 4);
            i = eVar5;
            e eVar6 = new e("FINISHED", 5);
            j = eVar6;
            k = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) k.clone();
        }
    }

    public RunnableC6777tU(Q60.c cVar, C5751ob0.c cVar2) {
        this.h = cVar;
        this.i = cVar2;
    }

    @Override // defpackage.InterfaceC6981uS.a
    public final void b(InterfaceC3129cK0 interfaceC3129cK0, Object obj, InterfaceC6771tS<?> interfaceC6771tS, CS cs, InterfaceC3129cK0 interfaceC3129cK1) {
        this.A = interfaceC3129cK0;
        this.C = obj;
        this.E = interfaceC6771tS;
        this.D = cs;
        this.B = interfaceC3129cK1;
        this.I = interfaceC3129cK0 != this.d.a().get(0);
        if (Thread.currentThread() != this.z) {
            q(d.g);
        } else {
            l();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull RunnableC6777tU<?> runnableC6777tU) {
        RunnableC6777tU<?> runnableC6777tU2 = runnableC6777tU;
        int iOrdinal = this.n.ordinal() - runnableC6777tU2.n.ordinal();
        return iOrdinal == 0 ? this.u - runnableC6777tU2.u : iOrdinal;
    }

    @Override // defpackage.InterfaceC6981uS.a
    public final void e(InterfaceC3129cK0 interfaceC3129cK0, Exception exc, InterfaceC6771tS<?> interfaceC6771tS, CS cs) {
        interfaceC6771tS.b();
        C2160Ul0 c2160Ul0 = new C2160Ul0("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsA = interfaceC6771tS.a();
        c2160Ul0.e = interfaceC3129cK0;
        c2160Ul0.g = cs;
        c2160Ul0.h = clsA;
        this.e.add(c2160Ul0);
        if (Thread.currentThread() != this.z) {
            q(d.e);
        } else {
            r();
        }
    }

    @Override // defpackage.C5751ob0.d
    @NonNull
    public final RP1.a f() {
        return this.g;
    }

    public final <Data> InterfaceC3667et1<R> i(InterfaceC6771tS<?> interfaceC6771tS, Data data, CS cs) {
        if (data == null) {
            interfaceC6771tS.b();
            return null;
        }
        try {
            int i = C6562sS0.a;
            SystemClock.elapsedRealtimeNanos();
            InterfaceC3667et1<R> interfaceC3667et1K = k(data, cs);
            if (Log.isLoggable("DecodeJob", 2)) {
                interfaceC3667et1K.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.o);
                Thread.currentThread().getName();
            }
            return interfaceC3667et1K;
        } finally {
            interfaceC6771tS.b();
        }
    }

    public final <Data> InterfaceC3667et1<R> k(Data data, CS cs) {
        Class<?> cls = data.getClass();
        C6567sU<R> c6567sU = this.d;
        C5930pR0<Data, ?, R> c5930pR0C = c6567sU.c(cls);
        C4227ha1 c4227ha1 = this.s;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = cs == CS.h || c6567sU.r;
            Z91<Boolean> z91 = C6900u30.i;
            Boolean bool = (Boolean) c4227ha1.c(z91);
            if (bool == null || (bool.booleanValue() && !z)) {
                c4227ha1 = new C4227ha1();
                C6667sx c6667sx = this.s.b;
                C6667sx c6667sx2 = c4227ha1.b;
                c6667sx2.j(c6667sx);
                c6667sx2.put(z91, Boolean.valueOf(z));
            }
        }
        C4227ha1 c4227ha2 = c4227ha1;
        com.bumptech.glide.load.data.a aVarG = this.l.a().g(data);
        try {
            return c5930pR0C.a(this.p, this.q, new a(cs), c4227ha2, aVarG);
        } finally {
            aVarG.b();
        }
    }

    public final void l() {
        C4670jS0 c4670jS0I;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.C + ", cache key: " + this.A + ", fetcher: " + this.E;
            int i = C6562sS0.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.o);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C4670jS0 c4670jS0 = null;
        try {
            c4670jS0I = i(this.E, this.C, this.D);
        } catch (C2160Ul0 e2) {
            InterfaceC3129cK0 interfaceC3129cK0 = this.B;
            CS cs = this.D;
            e2.e = interfaceC3129cK0;
            e2.g = cs;
            e2.h = null;
            this.e.add(e2);
            c4670jS0I = null;
        }
        if (c4670jS0I == null) {
            r();
            return;
        }
        CS cs2 = this.D;
        boolean z = this.I;
        if (c4670jS0I instanceof InterfaceC3518eA0) {
            ((InterfaceC3518eA0) c4670jS0I).a();
        }
        if (this.j.c != null) {
            c4670jS0 = (C4670jS0) C4670jS0.i.a();
            c4670jS0.h = false;
            c4670jS0.g = true;
            c4670jS0.e = c4670jS0I;
            c4670jS0I = c4670jS0;
        }
        t();
        U60 u60 = this.t;
        synchronized (u60) {
            u60.s = c4670jS0I;
            u60.t = cs2;
            u60.A = z;
        }
        synchronized (u60) {
            try {
                u60.e.a();
                if (u60.z) {
                    u60.s.b();
                    u60.g();
                } else {
                    if (u60.d.d.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (u60.u) {
                        throw new IllegalStateException("Already have resource");
                    }
                    U60.c cVar = u60.i;
                    InterfaceC3667et1<?> interfaceC3667et1 = u60.s;
                    boolean z2 = u60.p;
                    V60 v60 = u60.o;
                    Q60 q60 = u60.g;
                    cVar.getClass();
                    u60.x = new W60<>(interfaceC3667et1, z2, true, v60, q60);
                    u60.u = true;
                    U60.e eVar = u60.d;
                    eVar.getClass();
                    ArrayList<U60.d> arrayList = new ArrayList(eVar.d);
                    u60.d(arrayList.size() + 1);
                    u60.j.c(u60, u60.o, u60.x);
                    for (U60.d dVar : arrayList) {
                        dVar.b.execute(new U60.b(dVar.a));
                    }
                    u60.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v = e.i;
        try {
            b<?> bVar = this.j;
            if (bVar.c != null) {
                Q60.c cVar2 = this.h;
                C4227ha1 c4227ha1 = this.s;
                bVar.getClass();
                try {
                    cVar2.a().b(bVar.a, new U31(bVar.b, bVar.c, c4227ha1));
                    bVar.c.a();
                } catch (Throwable th2) {
                    bVar.c.a();
                    throw th2;
                }
            }
            if (c4670jS0 != null) {
                c4670jS0.a();
            }
            c cVar3 = this.k;
            synchronized (cVar3) {
                cVar3.b = true;
                zA = cVar3.a();
            }
            if (zA) {
                p();
            }
        } catch (Throwable th3) {
            if (c4670jS0 != null) {
                c4670jS0.a();
            }
            throw th3;
        }
    }

    public final InterfaceC6981uS m() {
        int iOrdinal = this.v.ordinal();
        C6567sU<R> c6567sU = this.d;
        if (iOrdinal == 1) {
            return new C4087gt1(c6567sU, this);
        }
        if (iOrdinal == 2) {
            return new C5512nS(c6567sU.a(), c6567sU, this);
        }
        if (iOrdinal == 3) {
            return new YN1(c6567sU, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.v);
    }

    public final e n(e eVar) {
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.r.b();
            e eVar2 = e.e;
            return zB ? eVar2 : n(eVar2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.r.a();
            e eVar3 = e.g;
            return zA ? eVar3 : n(eVar3);
        }
        e eVar4 = e.j;
        if (iOrdinal != 2) {
            if (iOrdinal != 3 && iOrdinal != 5) {
                throw new IllegalArgumentException("Unrecognized stage: " + eVar);
            }
        } else if (!this.x) {
            return e.h;
        }
        return eVar4;
    }

    public final void o() {
        boolean zA;
        t();
        C2160Ul0 c2160Ul0 = new C2160Ul0("Failed to load resource", new ArrayList(this.e));
        U60 u60 = this.t;
        synchronized (u60) {
            u60.v = c2160Ul0;
        }
        synchronized (u60) {
            try {
                u60.e.a();
                if (u60.z) {
                    u60.g();
                } else {
                    if (u60.d.d.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (u60.w) {
                        throw new IllegalStateException("Already failed once");
                    }
                    u60.w = true;
                    V60 v60 = u60.o;
                    U60.e eVar = u60.d;
                    eVar.getClass();
                    ArrayList<U60.d> arrayList = new ArrayList(eVar.d);
                    u60.d(arrayList.size() + 1);
                    u60.j.c(u60, v60, null);
                    for (U60.d dVar : arrayList) {
                        dVar.b.execute(new U60.a(dVar.a));
                    }
                    u60.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.k;
        synchronized (cVar) {
            cVar.c = true;
            zA = cVar.a();
        }
        if (zA) {
            p();
        }
    }

    public final void p() {
        c cVar = this.k;
        synchronized (cVar) {
            cVar.b = false;
            cVar.a = false;
            cVar.c = false;
        }
        b<?> bVar = this.j;
        bVar.a = null;
        bVar.b = null;
        bVar.c = null;
        C6567sU<R> c6567sU = this.d;
        c6567sU.c = null;
        c6567sU.d = null;
        c6567sU.n = null;
        c6567sU.g = null;
        c6567sU.k = null;
        c6567sU.i = null;
        c6567sU.o = null;
        c6567sU.j = null;
        c6567sU.p = null;
        c6567sU.a.clear();
        c6567sU.l = false;
        c6567sU.b.clear();
        c6567sU.m = false;
        this.G = false;
        this.l = null;
        this.m = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.t = null;
        this.v = null;
        this.F = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.H = false;
        this.y = null;
        this.e.clear();
        this.i.b(this);
    }

    public final void q(d dVar) {
        this.w = dVar;
        U60 u60 = this.t;
        (u60.q ? u60.m : u60.l).execute(this);
    }

    public final void r() {
        this.z = Thread.currentThread();
        int i = C6562sS0.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.H && this.F != null && !(zA = this.F.a())) {
            this.v = n(this.v);
            this.F = m();
            if (this.v == e.h) {
                q(d.e);
                return;
            }
        }
        if ((this.v == e.j || this.H) && !zA) {
            o();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6771tS<?> interfaceC6771tS = this.E;
        try {
            try {
                if (this.H) {
                    o();
                    if (interfaceC6771tS != null) {
                        interfaceC6771tS.b();
                        return;
                    }
                    return;
                }
                s();
                if (interfaceC6771tS != null) {
                    interfaceC6771tS.b();
                }
            } catch (Throwable th) {
                if (interfaceC6771tS != null) {
                    interfaceC6771tS.b();
                }
                throw th;
            }
        } catch (C1805Px e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.v);
            }
            if (this.v != e.i) {
                this.e.add(th2);
                o();
            }
            if (!this.H) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void s() {
        int iOrdinal = this.w.ordinal();
        if (iOrdinal == 0) {
            this.v = n(e.d);
            this.F = m();
            r();
        } else if (iOrdinal == 1) {
            r();
        } else if (iOrdinal == 2) {
            l();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.w);
        }
    }

    public final void t() {
        this.g.a();
        if (this.G) {
            throw new IllegalStateException("Already notified", this.e.isEmpty() ? null : (Throwable) C1742Pc.c(1, this.e));
        }
        this.G = true;
    }
}
