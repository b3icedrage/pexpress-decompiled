package defpackage;

import io.sentry.protocol.C4519a;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4525g;
import io.sentry.protocol.F;
import io.sentry.protocol.o;
import io.sentry.protocol.u;
import io.sentry.util.C4527a;
import io.sentry.util.C4529c;
import io.sentry.util.p;
import io.sentry.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KD1 implements InterfaceC1015Fu0 {

    @Nullable
    public NG1 a;

    @Nullable
    public InterfaceC4302hv0 b;

    @NotNull
    public final WeakReference<InterfaceC2347Wu0> c;

    @Nullable
    public F d;

    @Nullable
    public String e;

    @Nullable
    public o f;

    @NotNull
    public ArrayList g;

    @NotNull
    public volatile Object h;

    @NotNull
    public final ConcurrentHashMap i;

    @NotNull
    public final ConcurrentHashMap j;

    @NotNull
    public final ConcurrentHashMap k;

    @NotNull
    public final CopyOnWriteArrayList l;

    @NotNull
    public volatile C2688aH1 m;

    @Nullable
    public volatile CI1 n;

    @NotNull
    public final C4527a o;

    @NotNull
    public final C4527a p;

    @NotNull
    public final C4527a q;

    @NotNull
    public final C4521c r;

    @NotNull
    public final CopyOnWriteArrayList s;

    @NotNull
    public C5364mj1 t;

    @NotNull
    public u u;

    @NotNull
    public InterfaceC1327Ju0 v;

    @NotNull
    public final Map<Throwable, q<WeakReference<InterfaceC2347Wu0>, String>> w;

    @NotNull
    public final io.sentry.featureflags.b x;

    public interface a {
        void a(@NotNull C5364mj1 c5364mj1);
    }

    public interface b {
        void a(@Nullable CI1 ci1);
    }

    public interface c {
        void a(@Nullable InterfaceC4302hv0 interfaceC4302hv0);
    }

    public static final class d {

        @Nullable
        public final CI1 a;

        @NotNull
        public final CI1 b;

        public d(@NotNull CI1 ci1, @Nullable CI1 ci2) {
            this.b = ci1;
            this.a = ci2;
        }
    }

    public KD1(@NotNull C2688aH1 c2688aH1) {
        io.sentry.featureflags.b bVar;
        this.c = new WeakReference<>(null);
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new CopyOnWriteArrayList();
        this.o = new C4527a();
        this.p = new C4527a();
        this.q = new C4527a();
        this.r = new C4521c();
        this.s = new CopyOnWriteArrayList();
        this.u = u.e;
        this.v = C3919g51.a;
        this.w = Collections.synchronizedMap(new WeakHashMap());
        p.b(c2688aH1, "SentryOptions is required.");
        this.m = c2688aH1;
        this.h = a(this.m.getMaxBreadcrumbs());
        if (c2688aH1.getMaxFeatureFlags() > 0) {
            io.sentry.featureflags.a aVar = new io.sentry.featureflags.a();
            new C4527a();
            aVar.a = new CopyOnWriteArrayList<>();
            bVar = aVar;
        } else {
            bVar = io.sentry.featureflags.c.a;
        }
        this.x = bVar;
        this.t = new C5364mj1();
    }

    @NotNull
    public static Queue<C0702Bu> a(int i) {
        return i > 0 ? new LW1(new C5674oC(i)) : new U10();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final InterfaceC1327Ju0 A() {
        return this.v;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void B(@Nullable InterfaceC4302hv0 interfaceC4302hv0) {
        C4527a.C0404a c0404aA = this.p.a();
        try {
            this.b = interfaceC4302hv0;
            for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.m.getScopeObservers()) {
                if (interfaceC4302hv0 != null) {
                    interfaceC1093Gu0.q(interfaceC4302hv0.getName());
                    interfaceC1093Gu0.r(interfaceC4302hv0.w(), this);
                } else {
                    interfaceC1093Gu0.q(null);
                    interfaceC1093Gu0.r(null, this);
                }
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void C() {
        this.r.n("robot_session");
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<io.sentry.internal.eventprocessor.a> D() {
        return this.l;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void E(@Nullable Object obj, @Nullable String str) {
        this.r.l(str, obj);
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(this.r);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<C2234Vk> F() {
        return new CopyOnWriteArrayList(this.s);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void G(@NotNull c cVar) {
        C4527a.C0404a c0404aA = this.p.a();
        try {
            cVar.a(this.b);
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C4521c H() {
        return this.r;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final String I() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<String> K() {
        return this.g;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final CI1 L(@NotNull b bVar) {
        C4527a.C0404a c0404aA = this.o.a();
        try {
            bVar.a(this.n);
            CI1 ci1Clone = this.n != null ? this.n.clone() : null;
            c0404aA.close();
            return ci1Clone;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C5364mj1 M(@NotNull a aVar) {
        C4527a.C0404a c0404aA = this.q.a();
        try {
            aVar.a(this.t);
            C5364mj1 c5364mj1 = new C5364mj1(this.t);
            c0404aA.close();
            return c5364mj1;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<N80> N() {
        return io.sentry.util.d.a(this.l);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final String O() {
        InterfaceC4302hv0 interfaceC4302hv0 = this.b;
        if (interfaceC4302hv0 != null) {
            return interfaceC4302hv0.getName();
        }
        return null;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void b(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeTag(str);
            return;
        }
        this.i.put(str, str2);
        for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.m.getScopeObservers()) {
            interfaceC1093Gu0.b(str, str2);
            interfaceC1093Gu0.k(this.i);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void c(@Nullable F f) {
        this.d = f;
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().c(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.InterfaceC1015Fu0
    public final void clear() {
        this.a = null;
        this.d = null;
        this.f = null;
        this.e = null;
        this.g.clear();
        this.h.clear();
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().i(this.h);
        }
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        u();
        this.s.clear();
    }

    @NotNull
    public final Object clone() {
        return new KD1(this);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final o d() {
        return this.f;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final InterfaceC2347Wu0 e() {
        InterfaceC2347Wu0 interfaceC2347Wu0P;
        InterfaceC2347Wu0 interfaceC2347Wu0 = this.c.get();
        if (interfaceC2347Wu0 != null) {
            return interfaceC2347Wu0;
        }
        InterfaceC4302hv0 interfaceC4302hv0 = this.b;
        return (interfaceC4302hv0 == null || (interfaceC2347Wu0P = interfaceC4302hv0.p()) == null) ? interfaceC4302hv0 : interfaceC2347Wu0P;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC1015Fu0 clone() {
        return new KD1(this);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final C4525g g() {
        return this.x.g();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Map<String, Object> getExtras() {
        return this.k;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final NG1 getLevel() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final CI1 getSession() {
        return this.n;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Map<String, String> getTags() {
        return C4529c.a(this.i);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final F getUser() {
        return this.d;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void h(@Nullable NG1 ng1) {
        this.a = ng1;
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(ng1);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final u k() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.InterfaceC1015Fu0
    public final void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0) {
        if (c0702Bu == null || (this.h instanceof U10)) {
            return;
        }
        if (c0841Do0 == null) {
            c0841Do0 = new C0841Do0();
        }
        C2688aH1.a beforeBreadcrumb = this.m.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                c0702Bu = beforeBreadcrumb.a(c0702Bu, c0841Do0);
            } catch (Throwable th) {
                this.m.getLogger().d(NG1.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
                if (th.getMessage() != null) {
                    c0702Bu.f(th.getMessage(), "sentry:message");
                }
            }
        }
        if (c0702Bu == null) {
            this.m.getLogger().a(NG1.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.h.add(c0702Bu);
        for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.m.getScopeObservers()) {
            interfaceC1093Gu0.g(c0702Bu);
            interfaceC1093Gu0.i(this.h);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void m(@NotNull List<String> list) {
        if (list == null) {
            return;
        }
        this.g = new ArrayList(list);
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().m(list);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void n(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.k.remove(str);
            for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.m.getScopeObservers()) {
                interfaceC1093Gu0.j(str);
                interfaceC1093Gu0.p(this.k);
            }
            return;
        }
        this.k.put(str, str2);
        for (InterfaceC1093Gu0 interfaceC1093Gu1 : this.m.getScopeObservers()) {
            interfaceC1093Gu1.n(str, str2);
            interfaceC1093Gu1.p(this.k);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void o(@NotNull u uVar) {
        this.u = uVar;
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().o(uVar);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C2688aH1 p() {
        return this.m;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Map<String, SF1> q() {
        return C4529c.a(this.j);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final InterfaceC4302hv0 r() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void removeTag(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.i.remove(str);
        for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.m.getScopeObservers()) {
            interfaceC1093Gu0.removeTag(str);
            interfaceC1093Gu0.k(this.i);
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final CI1 s() {
        C4527a.C0404a c0404aA = this.o.a();
        try {
            CI1 ci1 = null;
            if (this.n != null) {
                CI1 ci2 = this.n;
                ci2.getClass();
                ci2.b(N7.h());
                this.m.getContinuousProfiler().d();
                CI1 ci1Clone = this.n.clone();
                this.n = null;
                ci1 = ci1Clone;
            }
            c0404aA.close();
            return ci1;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final d t() {
        C4527a.C0404a c0404aA = this.o.a();
        try {
            if (this.n != null) {
                CI1 ci1 = this.n;
                ci1.getClass();
                ci1.b(N7.h());
                this.m.getContinuousProfiler().d();
            }
            CI1 ci2 = this.n;
            d dVar = null;
            if (this.m.getRelease() != null) {
                String distinctId = this.m.getDistinctId();
                F f = this.d;
                this.n = new CI1(CI1.b.Ok, N7.h(), N7.h(), 0, distinctId, C2432Xo.h(), Boolean.TRUE, null, null, f != null ? f.h : null, null, this.m.getEnvironment(), this.m.getRelease(), null);
                dVar = new d(this.n.clone(), ci2 != null ? ci2.clone() : null);
            } else {
                this.m.getLogger().a(NG1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            c0404aA.close();
            return dVar;
        } catch (Throwable th) {
            try {
                c0404aA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void u() {
        C4527a.C0404a c0404aA = this.p.a();
        try {
            this.b = null;
            c0404aA.close();
            for (InterfaceC1093Gu0 interfaceC1093Gu0 : this.m.getScopeObservers()) {
                interfaceC1093Gu0.q(null);
                interfaceC1093Gu0.r(null, this);
            }
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final io.sentry.featureflags.b v() {
        return this.x;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void w(@NotNull C5364mj1 c5364mj1) {
        this.t = c5364mj1;
        C3561eO1 c3561eO1 = new C3561eO1(c5364mj1.a, c5364mj1.b, "default", null);
        c3561eO1.m = "auto";
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().r(c3561eO1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue<Bu>] */
    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Queue<C0702Bu> x() {
        return this.h;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C5364mj1 y() {
        return this.t;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void z(@Nullable String str) {
        this.e = str;
        C4521c c4521c = this.r;
        C4519a c4519aD = c4521c.d();
        if (c4519aD == null) {
            c4519aD = new C4519a();
            c4521c.o(c4519aD);
        }
        if (str == null) {
            c4519aD.m = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c4519aD.m = arrayList;
        }
        Iterator<InterfaceC1093Gu0> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(c4521c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.Collection] */
    public KD1(@NotNull KD1 kd1) {
        F f;
        o oVar = null;
        this.c = new WeakReference<>(null);
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new CopyOnWriteArrayList();
        this.o = new C4527a();
        this.p = new C4527a();
        this.q = new C4527a();
        this.r = new C4521c();
        this.s = new CopyOnWriteArrayList();
        this.u = u.e;
        this.v = C3919g51.a;
        this.w = Collections.synchronizedMap(new WeakHashMap());
        this.b = kd1.b;
        this.c = kd1.c;
        this.n = kd1.n;
        this.m = kd1.m;
        this.a = kd1.a;
        this.v = kd1.v;
        F f2 = kd1.d;
        if (f2 != null) {
            f = new F();
            f.d = f2.d;
            f.g = f2.g;
            f.e = f2.e;
            f.h = f2.h;
            f.i = f2.i;
            f.j = f2.j;
            f.k = C4529c.a(f2.k);
            f.l = C4529c.a(f2.l);
        } else {
            f = null;
        }
        this.d = f;
        this.e = kd1.e;
        this.u = kd1.u;
        o oVar2 = kd1.f;
        if (oVar2 != null) {
            oVar = new o();
            oVar.d = oVar2.d;
            oVar.i = oVar2.i;
            oVar.e = oVar2.e;
            oVar.g = oVar2.g;
            oVar.j = C4529c.a(oVar2.j);
            oVar.k = C4529c.a(oVar2.k);
            oVar.m = C4529c.a(oVar2.m);
            oVar.p = C4529c.a(oVar2.p);
            oVar.h = oVar2.h;
            oVar.n = oVar2.n;
            oVar.l = oVar2.l;
            oVar.o = oVar2.o;
        }
        this.f = oVar;
        this.g = new ArrayList(kd1.g);
        this.l = new CopyOnWriteArrayList(kd1.l);
        C0702Bu[] c0702BuArr = (C0702Bu[]) kd1.h.toArray(new C0702Bu[0]);
        Queue<C0702Bu> queueA = a(kd1.m.getMaxBreadcrumbs());
        for (C0702Bu c0702Bu : c0702BuArr) {
            queueA.add(new C0702Bu(c0702Bu));
        }
        this.h = queueA;
        ConcurrentHashMap concurrentHashMap = kd1.i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.i = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = kd1.j;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), (SF1) entry2.getValue());
            }
        }
        this.j = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = kd1.k;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.k = concurrentHashMap6;
        this.r = new C4521c(kd1.r);
        this.s = new CopyOnWriteArrayList(kd1.s);
        this.x = kd1.x.clone();
        this.t = new C5364mj1(kd1.t);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void J(@NotNull u uVar) {
    }
}
