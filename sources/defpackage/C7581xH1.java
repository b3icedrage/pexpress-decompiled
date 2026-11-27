package defpackage;

import com.google.android.gms.common.Scopes;
import io.sentry.protocol.B;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.E;
import io.sentry.protocol.u;
import io.sentry.util.C4527a;
import io.sentry.util.p;
import io.sentry.util.w;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7581xH1 implements InterfaceC4302hv0 {

    @NotNull
    public final C3352dO1 b;

    @NotNull
    public final RD1 d;

    @NotNull
    public final String e;

    @Nullable
    public volatile a g;

    @Nullable
    public volatile C7791yH1 h;

    @Nullable
    public volatile Timer i;

    @NotNull
    public final C4527a j;

    @NotNull
    public final C4527a k;

    @NotNull
    public final AtomicBoolean l;

    @NotNull
    public final AtomicBoolean m;

    @NotNull
    public final E n;

    @NotNull
    public final EnumC6511sB0 o;

    @NotNull
    public final C4521c p;

    @Nullable
    public final JH q;

    @NotNull
    public final C5437n42 r;

    @NotNull
    public final u a = new u();

    @NotNull
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @NotNull
    public b f = b.c;

    /* JADX INFO: renamed from: xH1$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C7581xH1 c7581xH1 = C7581xH1.this;
            EnumC4869kO1 status = c7581xH1.getStatus();
            if (status == null) {
                status = EnumC4869kO1.OK;
            }
            c7581xH1.r(status, null);
            c7581xH1.l.set(false);
        }
    }

    /* JADX INFO: renamed from: xH1$b */
    public static final class b {
        public static final b c = new b(false, null);
        public final boolean a;

        @Nullable
        public final EnumC4869kO1 b;

        public b(boolean z, @Nullable EnumC4869kO1 enumC4869kO1) {
            this.a = z;
            this.b = enumC4869kO1;
        }
    }

    public C7581xH1(@NotNull C4804k42 c4804k42, @NotNull RD1 rd1, @NotNull C5437n42 c5437n42, @Nullable JH jh) {
        this.i = null;
        C4527a c4527a = new C4527a();
        this.j = c4527a;
        this.k = new C4527a();
        this.l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        C4521c c4521c = new C4521c();
        this.p = c4521c;
        C3352dO1 c3352dO1 = new C3352dO1(c4804k42, this, rd1, c5437n42);
        this.b = c3352dO1;
        this.e = c4804k42.t;
        this.o = c4804k42.p;
        this.d = rd1;
        Boolean bool = Boolean.TRUE;
        jh = bool.equals(H()) ? jh : null;
        this.q = jh;
        this.n = c4804k42.u;
        this.r = c5437n42;
        I(c3352dO1);
        u uVarG = G();
        if (!uVarG.equals(u.e) && bool.equals(H())) {
            c4521c.l(Scopes.PROFILE, new C1522Mh1(uVarG));
        }
        if (jh != null) {
            jh.d(this);
        }
        if (c5437n42.g == null && c5437n42.h == null) {
            return;
        }
        boolean z = true;
        this.i = new Timer(true);
        Long l = c5437n42.h;
        if (l != null) {
            C4527a.C0404a c0404aA = c4527a.a();
            try {
                if (this.i != null) {
                    C();
                    atomicBoolean.set(true);
                    this.h = new C7791yH1(this);
                    try {
                        this.i.schedule(this.h, l.longValue());
                    } catch (Throwable th) {
                        this.d.p().getLogger().d(NG1.WARNING, "Failed to schedule finish timer", th);
                        EnumC4869kO1 status = getStatus();
                        if (status == null) {
                            status = EnumC4869kO1.DEADLINE_EXCEEDED;
                        }
                        if (this.r.g == null) {
                            z = false;
                        }
                        f(status, z, null);
                        this.m.set(false);
                    }
                }
                c0404aA.close();
            } catch (Throwable th2) {
                try {
                    c0404aA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        u();
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void A(@Nullable EnumC4869kO1 enumC4869kO1) {
        r(enumC4869kO1, null);
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final AbstractC3118cG1 B() {
        return this.b.a;
    }

    public final void C() {
        C4527a.C0404a c0404aA = this.j.a();
        try {
            if (this.h != null) {
                this.h.cancel();
                this.m.set(false);
                this.h = null;
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

    public final void D() {
        C4527a.C0404a c0404aA = this.j.a();
        try {
            if (this.g != null) {
                this.g.cancel();
                this.l.set(false);
                this.g = null;
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

    @NotNull
    public final InterfaceC2347Wu0 E(@NotNull C3561eO1 c3561eO1, @NotNull C4659jO1 c4659jO1) {
        boolean z = this.b.g;
        C5017l51 c5017l51 = C5017l51.a;
        if (!z) {
            if (this.o.equals(c3561eO1.p)) {
                RD1 rd1 = this.d;
                if (!w.a(c4659jO1.d, rd1.p().getIgnoredSpanOrigins())) {
                    String str = c3561eO1.j;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                    int size = copyOnWriteArrayList.size();
                    int maxSpans = rd1.p().getMaxSpans();
                    String str2 = c3561eO1.i;
                    if (size >= maxSpans) {
                        rd1.p().getLogger().a(NG1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str2, str);
                        return c5017l51;
                    }
                    p.b(c3561eO1.g, "parentSpanId is required");
                    p.b(str2, "operation is required");
                    D();
                    C3352dO1 c3352dO1 = new C3352dO1(this, this.d, c3561eO1, c4659jO1, new C6741tI(this));
                    I(c3352dO1);
                    copyOnWriteArrayList.add(c3352dO1);
                    JH jh = this.q;
                    if (jh != null) {
                        jh.e(c3352dO1);
                    }
                    return c3352dO1;
                }
            }
        }
        return c5017l51;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    public final void F(@Nullable EnumC4869kO1 enumC4869kO1, @Nullable AbstractC3118cG1 abstractC3118cG1, boolean z, @Nullable C0841Do0 c0841Do0) {
        C1136Hi1 c1136Hi1C;
        AbstractC3118cG1 abstractC3118cG2 = this.b.b;
        if (abstractC3118cG1 == null) {
            abstractC3118cG1 = abstractC3118cG2;
        }
        if (abstractC3118cG1 == null) {
            abstractC3118cG1 = this.d.p().getDateProvider().now();
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((C3352dO1) it.next()).i.getClass();
        }
        this.f = new b(true, enumC4869kO1);
        if (this.b.g) {
            return;
        }
        if (this.r.f) {
            ListIterator listIterator = this.c.listIterator();
            while (listIterator.hasNext()) {
                C3352dO1 c3352dO1 = (C3352dO1) listIterator.next();
                if (!c3352dO1.g && c3352dO1.b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        C3352dO1 c3352dO2 = this.b;
        c3352dO2.j = new XF1(this, c3352dO2.j, atomicReference);
        c3352dO2.r(this.f.b, abstractC3118cG1);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(H())) {
            L02 l02 = this.b.c.h;
            if (bool.equals(l02 == null ? null : l02.d)) {
                c1136Hi1C = this.d.p().getTransactionProfiler().c(this, (List) atomicReference.get(), this.d.p());
            } else {
                c1136Hi1C = null;
            }
        } else {
            c1136Hi1C = null;
        }
        if (this.d.p().isContinuousProfilingEnabled()) {
            EnumC5147li1 profileLifecycle = this.d.p().getProfileLifecycle();
            EnumC5147li1 enumC5147li1 = EnumC5147li1.TRACE;
            if (profileLifecycle == enumC5147li1 && this.b.c.s.equals(u.e)) {
                this.d.p().getContinuousProfiler().c(enumC5147li1);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        RD1 rd1 = this.d;
        if (rd1.isEnabled()) {
            try {
                final InterfaceC1015Fu0 interfaceC1015Fu0I = rd1.e.i(null);
                interfaceC1015Fu0I.G(new KD1.c() { // from class: wH1
                    @Override // KD1.c
                    public final void a(InterfaceC4302hv0 interfaceC4302hv0) {
                        C7581xH1 c7581xH1 = this.d;
                        c7581xH1.getClass();
                        if (interfaceC4302hv0 == c7581xH1) {
                            interfaceC1015Fu0I.u();
                        }
                    }
                });
            } catch (Throwable th) {
                rd1.p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th);
            }
        } else {
            rd1.p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        B b2 = new B(this);
        if (this.i != null) {
            C4527a.C0404a c0404aA = this.j.a();
            try {
                if (this.i != null) {
                    D();
                    C();
                    this.i.cancel();
                    this.i = null;
                }
                c0404aA.close();
            } catch (Throwable th2) {
                try {
                    c0404aA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (z && this.c.isEmpty() && this.r.g != null) {
            this.d.p().getLogger().a(NG1.DEBUG, "Dropping idle transaction %s because it has no child spans", this.e);
        } else {
            b2.x.putAll(this.b.l);
            this.d.x(b2, c(), c0841Do0, c1136Hi1C);
        }
    }

    @NotNull
    public final u G() {
        C3352dO1 c3352dO1 = this.b;
        return !c3352dO1.c.s.equals(u.e) ? c3352dO1.c.s : this.d.p().getContinuousProfiler().e();
    }

    @Nullable
    public final Boolean H() {
        L02 l02 = this.b.c.h;
        if (l02 == null) {
            return null;
        }
        return l02.a;
    }

    public final void I(@NotNull C3352dO1 c3352dO1) {
        io.sentry.util.thread.a threadChecker = this.d.p().getThreadChecker();
        u uVarG = G();
        if (!uVarG.equals(u.e)) {
            Boolean bool = Boolean.TRUE;
            L02 l02 = c3352dO1.c.h;
            if (bool.equals(l02 == null ? null : l02.a)) {
                c3352dO1.m(uVarG.toString(), "profiler_id");
            }
        }
        c3352dO1.m(String.valueOf(threadChecker.b()), "thread.id");
        c3352dO1.m(threadChecker.a(), "thread.name");
    }

    public final void J(@NotNull C2171Up c2171Up) {
        C3352dO1 c3352dO1 = this.b;
        RD1 rd1 = this.d;
        C4527a.C0404a c0404aA = this.k.a();
        try {
            if (c2171Up.f) {
                AtomicReference atomicReference = new AtomicReference();
                if (rd1.isEnabled()) {
                    try {
                        atomicReference.set(rd1.e.i(null).k());
                    } catch (Throwable th) {
                        rd1.p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                } else {
                    rd1.p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                c2171Up.e(c3352dO1.c.d, (u) atomicReference.get(), rd1.p(), c3352dO1.c.h, this.e, this.n);
                c2171Up.f = false;
            }
            c0404aA.close();
        } catch (Throwable th2) {
            try {
                c0404aA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final String a() {
        return this.b.a();
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void b(@Nullable String str, @Nullable String str2) {
        C3352dO1 c3352dO1 = this.b;
        if (c3352dO1.g) {
            this.d.p().getLogger().a(NG1.DEBUG, "The transaction is already finished. Tag %s cannot be set", str);
        } else {
            c3352dO1.b(str, str2);
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final H02 c() {
        C2171Up c2171Up;
        if (!this.d.p().isTraceSampling() || (c2171Up = this.b.c.q) == null) {
            return null;
        }
        J(c2171Up);
        return c2171Up.f();
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final C7160vH1 d() {
        return this.b.d();
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final boolean e() {
        return this.b.g;
    }

    @Override // defpackage.InterfaceC4302hv0
    @NotNull
    public final void f(@NotNull EnumC4869kO1 enumC4869kO1, boolean z, @Nullable C0841Do0 c0841Do0) {
        if (this.b.g) {
            return;
        }
        AbstractC3118cG1 abstractC3118cG1Now = this.d.p().getDateProvider().now();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C3352dO1 c3352dO1 = (C3352dO1) listIterator.previous();
            c3352dO1.j = null;
            c3352dO1.r(enumC4869kO1, abstractC3118cG1Now);
        }
        F(enumC4869kO1, abstractC3118cG1Now, z, c0841Do0);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void g(@NotNull String str, @NotNull Long l, @NotNull InterfaceC4010gY0.a aVar) {
        this.b.g(str, l, aVar);
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final String getDescription() {
        return this.b.c.j;
    }

    @Override // defpackage.InterfaceC4302hv0
    @NotNull
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final EnumC4869kO1 getStatus() {
        return this.b.c.k;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void h(@NotNull Number number, @NotNull String str) {
        this.b.h(number, str);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void i(@Nullable Throwable th) {
        C3352dO1 c3352dO1 = this.b;
        if (c3352dO1.g) {
            this.d.p().getLogger().a(NG1.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            c3352dO1.e = th;
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final boolean j() {
        return false;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final C2249Vp k(@Nullable List<String> list) {
        C2171Up c2171Up;
        if (!this.d.p().isTraceSampling() || (c2171Up = this.b.c.q) == null) {
            return null;
        }
        J(c2171Up);
        return C2249Vp.a(c2171Up, list);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void l() {
        r(getStatus(), null);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void m(@Nullable Object obj, @Nullable String str) {
        C3352dO1 c3352dO1 = this.b;
        if (c3352dO1.g) {
            this.d.p().getLogger().a(NG1.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            c3352dO1.m(obj, str);
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final void n() {
        RD1 rd1 = this.d;
        if (!rd1.isEnabled()) {
            rd1.p().getLogger().a(NG1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            rd1.e.i(null).B(this);
        } catch (Throwable th) {
            rd1.p().getLogger().d(NG1.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void o(@Nullable EnumC4869kO1 enumC4869kO1) {
        C3352dO1 c3352dO1 = this.b;
        if (c3352dO1.g) {
            this.d.p().getLogger().a(NG1.DEBUG, "The transaction is already finished. Status %s cannot be set", enumC4869kO1 == null ? "null" : enumC4869kO1.name());
        } else {
            c3352dO1.c.k = enumC4869kO1;
        }
    }

    @Override // defpackage.InterfaceC4302hv0
    @Nullable
    public final InterfaceC2347Wu0 p() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C3352dO1 c3352dO1 = (C3352dO1) listIterator.previous();
            if (!c3352dO1.g) {
                return c3352dO1;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void q(@Nullable String str) {
        C3352dO1 c3352dO1 = this.b;
        if (c3352dO1.g) {
            this.d.p().getLogger().a(NG1.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            c3352dO1.c.j = str;
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void r(@Nullable EnumC4869kO1 enumC4869kO1, @Nullable AbstractC3118cG1 abstractC3118cG1) {
        F(enumC4869kO1, abstractC3118cG1, true, null);
    }

    @Override // defpackage.InterfaceC4302hv0
    @NotNull
    public final u s() {
        return this.a;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 t(@NotNull String str) {
        return y(str, null);
    }

    @Override // defpackage.InterfaceC4302hv0
    public final void u() {
        Long l;
        C4527a.C0404a c0404aA = this.j.a();
        try {
            if (this.i != null && (l = this.r.g) != null) {
                D();
                this.l.set(true);
                this.g = new a();
                try {
                    this.i.schedule(this.g, l.longValue());
                } catch (Throwable th) {
                    this.d.p().getLogger().d(NG1.WARNING, "Failed to schedule finish timer", th);
                    EnumC4869kO1 status = getStatus();
                    if (status == null) {
                        status = EnumC4869kO1.OK;
                    }
                    r(status, null);
                    this.l.set(false);
                }
            }
            c0404aA.close();
        } catch (Throwable th2) {
            try {
                c0404aA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 v(@NotNull String str, @Nullable String str2, @Nullable AbstractC3118cG1 abstractC3118cG1, @NotNull EnumC6511sB0 enumC6511sB0) {
        return z(str, str2, abstractC3118cG1, enumC6511sB0, new C4659jO1());
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final C3561eO1 w() {
        return this.b.c;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final AbstractC3118cG1 x() {
        return this.b.b;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 y(@NotNull String str, @Nullable String str2) {
        return z(str, str2, null, EnumC6511sB0.SENTRY, new C4659jO1());
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 z(@NotNull String str, @Nullable String str2, @Nullable AbstractC3118cG1 abstractC3118cG1, @NotNull EnumC6511sB0 enumC6511sB0, @NotNull C4659jO1 c4659jO1) {
        boolean z = this.b.g;
        C5017l51 c5017l51 = C5017l51.a;
        if (z || !this.o.equals(enumC6511sB0)) {
            return c5017l51;
        }
        int size = this.c.size();
        RD1 rd1 = this.d;
        if (size < rd1.p().getMaxSpans()) {
            return this.b.z(str, str2, abstractC3118cG1, enumC6511sB0, c4659jO1);
        }
        rd1.p().getLogger().a(NG1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c5017l51;
    }
}
