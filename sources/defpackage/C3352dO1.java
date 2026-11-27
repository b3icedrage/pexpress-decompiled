package defpackage;

import io.sentry.protocol.C4521c;
import io.sentry.protocol.k;
import io.sentry.protocol.u;
import io.sentry.util.p;
import io.sentry.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3352dO1 implements InterfaceC2347Wu0 {

    @NotNull
    public final AbstractC3118cG1 a;

    @Nullable
    public AbstractC3118cG1 b;

    @NotNull
    public final C3561eO1 c;

    @NotNull
    public final C7581xH1 d;

    @Nullable
    public Throwable e;

    @NotNull
    public final RD1 f;

    @NotNull
    public final C4659jO1 i;

    @Nullable
    public InterfaceC3981gO1 j;
    public boolean g = false;

    @NotNull
    public final AtomicBoolean h = new AtomicBoolean(false);

    @NotNull
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    @NotNull
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public C3352dO1(@NotNull C7581xH1 c7581xH1, @NotNull RD1 rd1, @NotNull C3561eO1 c3561eO1, @NotNull C4659jO1 c4659jO1, @Nullable C6741tI c6741tI) {
        new C4521c();
        this.c = c3561eO1;
        c3561eO1.m = c4659jO1.d;
        p.b(c7581xH1, "transaction is required");
        this.d = c7581xH1;
        p.b(rd1, "Scopes are required");
        this.f = rd1;
        this.i = c4659jO1;
        this.j = c6741tI;
        AbstractC3118cG1 abstractC3118cG1 = c4659jO1.a;
        if (abstractC3118cG1 != null) {
            this.a = abstractC3118cG1;
        } else {
            this.a = rd1.p().getDateProvider().now();
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void A(@Nullable EnumC4869kO1 enumC4869kO1) {
        r(enumC4869kO1, this.f.p().getDateProvider().now());
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final AbstractC3118cG1 B() {
        return this.a;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final String a() {
        return (String) this.c.l.get("ws_auth.outcome");
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void b(@Nullable String str, @Nullable String str2) {
        C3561eO1 c3561eO1 = this.c;
        if (str == null) {
            c3561eO1.getClass();
        } else if (str2 == null) {
            c3561eO1.l.remove(str);
        } else {
            c3561eO1.l.put(str, str2);
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final C7160vH1 d() {
        C3561eO1 c3561eO1 = this.c;
        u uVar = c3561eO1.d;
        L02 l02 = c3561eO1.h;
        return new C7160vH1(uVar, c3561eO1.e, l02 == null ? null : l02.a);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final boolean e() {
        return this.g;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void g(@NotNull String str, @NotNull Long l, @NotNull InterfaceC4010gY0.a aVar) {
        if (this.g) {
            this.f.p().getLogger().a(NG1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new k(l, aVar.apiName()));
        C7581xH1 c7581xH1 = this.d;
        C3352dO1 c3352dO1 = c7581xH1.b;
        if (c3352dO1 == this || c3352dO1.l.containsKey(str)) {
            return;
        }
        c7581xH1.g(str, l, aVar);
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final String getDescription() {
        return this.c.j;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final EnumC4869kO1 getStatus() {
        return this.c.k;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void h(@NotNull Number number, @NotNull String str) {
        if (this.g) {
            this.f.p().getLogger().a(NG1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new k(number, null));
        C7581xH1 c7581xH1 = this.d;
        C3352dO1 c3352dO1 = c7581xH1.b;
        if (c3352dO1 == this || c3352dO1.l.containsKey(str)) {
            return;
        }
        c7581xH1.h(number, str);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void i(@Nullable Throwable th) {
        this.e = th;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final boolean j() {
        return false;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final C2249Vp k(@Nullable List<String> list) {
        return this.d.k(list);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void l() {
        A(this.c.k);
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void m(@Nullable Object obj, @Nullable String str) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void o(@Nullable EnumC4869kO1 enumC4869kO1) {
        this.c.k = enumC4869kO1;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void q(@Nullable String str) {
        this.c.j = str;
    }

    @Override // defpackage.InterfaceC2347Wu0
    public final void r(@Nullable EnumC4869kO1 enumC4869kO1, @Nullable AbstractC3118cG1 abstractC3118cG1) {
        AbstractC3118cG1 abstractC3118cG2;
        AbstractC3118cG1 abstractC3118cG3;
        if (this.g || !this.h.compareAndSet(false, true)) {
            return;
        }
        C3561eO1 c3561eO1 = this.c;
        c3561eO1.k = enumC4869kO1;
        RD1 rd1 = this.f;
        if (abstractC3118cG1 == null) {
            abstractC3118cG1 = rd1.p().getDateProvider().now();
        }
        this.b = abstractC3118cG1;
        C4659jO1 c4659jO1 = this.i;
        c4659jO1.getClass();
        boolean z = c4659jO1.c;
        C7581xH1 c7581xH1 = this.d;
        if (z) {
            C4401iO1 c4401iO1 = c7581xH1.b.c.e;
            C4401iO1 c4401iO2 = c3561eO1.e;
            boolean zEquals = c4401iO1.equals(c4401iO2);
            CopyOnWriteArrayList<C3352dO1> copyOnWriteArrayList = c7581xH1.c;
            List<C3352dO1> list = copyOnWriteArrayList;
            if (!zEquals) {
                ArrayList arrayList = new ArrayList();
                for (C3352dO1 c3352dO1 : copyOnWriteArrayList) {
                    C4401iO1 c4401iO3 = c3352dO1.c.g;
                    if (c4401iO3 != null && c4401iO3.equals(c4401iO2)) {
                        arrayList.add(c3352dO1);
                    }
                }
                list = arrayList;
            }
            AbstractC3118cG1 abstractC3118cG4 = null;
            AbstractC3118cG1 abstractC3118cG5 = null;
            for (C3352dO1 c3352dO2 : list) {
                if (abstractC3118cG4 == null || c3352dO2.a.e(abstractC3118cG4) < 0) {
                    abstractC3118cG4 = c3352dO2.a;
                }
                if (abstractC3118cG5 == null || ((abstractC3118cG3 = c3352dO2.b) != null && abstractC3118cG3.e(abstractC3118cG5) > 0)) {
                    abstractC3118cG5 = c3352dO2.b;
                }
            }
            if (c4659jO1.c && abstractC3118cG5 != null && (((abstractC3118cG2 = this.b) == null || abstractC3118cG2.e(abstractC3118cG5) > 0) && this.b != null)) {
                this.b = abstractC3118cG5;
            }
        }
        Throwable cause = this.e;
        if (cause != null) {
            String str = c7581xH1.e;
            KD1 kd1 = rd1.e.a;
            kd1.getClass();
            p.b(cause, "throwable is required");
            p.b(str, "transactionName is required");
            while (cause.getCause() != null && cause.getCause() != cause) {
                cause = cause.getCause();
            }
            Map<Throwable, q<WeakReference<InterfaceC2347Wu0>, String>> map = kd1.w;
            if (!map.containsKey(cause)) {
                map.put(cause, new q<>(new WeakReference(this), str));
            }
        }
        InterfaceC3981gO1 interfaceC3981gO1 = this.j;
        if (interfaceC3981gO1 != null) {
            interfaceC3981gO1.c(this);
        }
        this.g = true;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 t(@NotNull String str) {
        return y(str, null);
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 v(@NotNull String str, @Nullable String str2, @Nullable AbstractC3118cG1 abstractC3118cG1, @NotNull EnumC6511sB0 enumC6511sB0) {
        return z(str, str2, abstractC3118cG1, enumC6511sB0, new C4659jO1());
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final C3561eO1 w() {
        return this.c;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @Nullable
    public final AbstractC3118cG1 x() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 y(@NotNull String str, @Nullable String str2) {
        if (this.g) {
            return C5017l51.a;
        }
        C4401iO1 c4401iO1 = this.c.e;
        C7581xH1 c7581xH1 = this.d;
        c7581xH1.getClass();
        C4659jO1 c4659jO1 = new C4659jO1();
        C3561eO1 c3561eO1 = c7581xH1.b.c;
        c3561eO1.getClass();
        C3561eO1 c3561eO2 = new C3561eO1(c3561eO1.d, new C4401iO1(), c4401iO1, str, null, c3561eO1.h, null, "manual");
        c3561eO2.j = str2;
        c3561eO2.p = EnumC6511sB0.SENTRY;
        return c7581xH1.E(c3561eO2, c4659jO1);
    }

    @Override // defpackage.InterfaceC2347Wu0
    @NotNull
    public final InterfaceC2347Wu0 z(@NotNull String str, @Nullable String str2, @Nullable AbstractC3118cG1 abstractC3118cG1, @NotNull EnumC6511sB0 enumC6511sB0, @NotNull C4659jO1 c4659jO1) {
        if (this.g) {
            return C5017l51.a;
        }
        C4401iO1 c4401iO1 = this.c.e;
        C7581xH1 c7581xH1 = this.d;
        C3561eO1 c3561eO1 = c7581xH1.b.c;
        c3561eO1.getClass();
        C3561eO1 c3561eO2 = new C3561eO1(c3561eO1.d, new C4401iO1(), c4401iO1, str, null, c3561eO1.h, null, "manual");
        c3561eO2.j = str2;
        c3561eO2.p = enumC6511sB0;
        c4659jO1.a = abstractC3118cG1;
        return c7581xH1.E(c3561eO2, c4659jO1);
    }

    public C3352dO1(@NotNull C4804k42 c4804k42, @NotNull C7581xH1 c7581xH1, @NotNull RD1 rd1, @NotNull C5437n42 c5437n42) {
        new C4521c();
        this.c = c4804k42;
        c4804k42.m = c5437n42.d;
        p.b(c7581xH1, "sentryTracer is required");
        this.d = c7581xH1;
        this.f = rd1;
        this.j = null;
        AbstractC3118cG1 abstractC3118cG1 = c5437n42.a;
        if (abstractC3118cG1 != null) {
            this.a = abstractC3118cG1;
        } else {
            this.a = rd1.p().getDateProvider().now();
        }
        this.i = c5437n42;
    }
}
