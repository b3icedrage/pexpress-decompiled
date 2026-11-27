package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3595ea {

    @NotNull
    public final MI a;

    @NotNull
    public final BP1 b;

    @NotNull
    public final EM c;

    @NotNull
    public final Y90 d;

    @NotNull
    public final Y90 e;

    @NotNull
    public final Y90 f;

    @NotNull
    public final Y90 g;

    @NotNull
    public final JZ1 h;
    public LQ1 i;
    public LQ1 j;
    public C1821Qc0 k;

    @NotNull
    public final DS0 l;
    public C1644Nv0 m;

    @NotNull
    public final C7624xW n;

    @NotNull
    public final R00 o;

    /* JADX INFO: renamed from: ea$a */
    public static final class a extends ML0 implements Function1<InterfaceC5978pf1, Unit> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC5978pf1 interfaceC5978pf1) {
            InterfaceC5978pf1 it = interfaceC5978pf1;
            Intrinsics.checkNotNullParameter(it, "it");
            M80 m80 = it instanceof M80 ? (M80) it : null;
            if (m80 != null) {
                m80.flush();
            }
            return Unit.a;
        }
    }

    public C3595ea(@NotNull MI configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        BP1 store = new BP1();
        EM amplitudeScope = LN.a(C0564Aa.a());
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
        Y90 amplitudeDispatcher = new Y90(executorServiceNewCachedThreadPool);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        Y90 networkIODispatcher = new Y90(executorServiceNewSingleThreadExecutor);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor2, "newSingleThreadExecutor()");
        Y90 storageIODispatcher = new Y90(executorServiceNewSingleThreadExecutor2);
        ExecutorService executorServiceNewSingleThreadExecutor3 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor3, "newSingleThreadExecutor()");
        Y90 retryDispatcher = new Y90(executorServiceNewSingleThreadExecutor3);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        Intrinsics.checkNotNullParameter(amplitudeDispatcher, "amplitudeDispatcher");
        Intrinsics.checkNotNullParameter(networkIODispatcher, "networkIODispatcher");
        Intrinsics.checkNotNullParameter(storageIODispatcher, "storageIODispatcher");
        Intrinsics.checkNotNullParameter(retryDispatcher, "retryDispatcher");
        this.a = configuration;
        this.b = store;
        this.c = amplitudeScope;
        this.d = amplitudeDispatcher;
        this.e = networkIODispatcher;
        this.f = storageIODispatcher;
        this.g = retryDispatcher;
        R00 r00 = new R00();
        Set<String> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "synchronizedSet(mutableSetOf())");
        r00.b = setSynchronizedSet;
        this.o = r00;
        if (StringsKt.I("f85374691559c6d41e766cab7118bc7c") || configuration.b <= 0 || configuration.c <= 0) {
            throw new IllegalArgumentException("invalid configuration");
        }
        C4693ja c4693ja = (C4693ja) this;
        c4693ja.a.getClass();
        KZ1 kz1 = new KZ1(null);
        Intrinsics.checkNotNullParameter(c4693ja, "<set-?>");
        kz1.b = c4693ja;
        this.h = kz1;
        this.l = configuration.f.a(this);
        C7624xW c7624xWD = C5189lv.d(amplitudeScope, amplitudeDispatcher, ON.e, new C2967ba(c4693ja, c4693ja, null));
        this.n = c7624xWD;
        c7624xWD.start();
    }

    public static void i(C3595ea c3595ea, C7923yv0 identify) {
        LinkedHashMap linkedHashMapL;
        c3595ea.getClass();
        Intrinsics.checkNotNullParameter(identify, "identify");
        C8133zv0 c8133zv0 = new C8133zv0();
        synchronized (identify) {
            linkedHashMapL = PW0.l(identify.b);
            for (Map.Entry entry : linkedHashMapL.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    linkedHashMapL.put(str, PW0.l((Map) value));
                }
            }
        }
        c8133zv0.P = linkedHashMapL;
        c3595ea.j(c8133zv0);
    }

    public static /* synthetic */ void m(C3595ea c3595ea, String str, Map map, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        c3595ea.l(str, map, null);
    }

    @NotNull
    public final void a(@NotNull InterfaceC5978pf1 plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        if (!(plugin instanceof AbstractC4609j81)) {
            this.h.a(plugin);
            return;
        }
        BP1 bp1 = this.b;
        AbstractC4609j81 plugin2 = (AbstractC4609j81) plugin;
        bp1.getClass();
        Intrinsics.checkNotNullParameter(plugin2, "plugin");
        Intrinsics.checkNotNullParameter(this, "amplitude");
        synchronized (bp1.c) {
            plugin2.a(this);
            bp1.c.add(plugin2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        JZ1 jz1 = this.h;
        a closure = a.d;
        jz1.getClass();
        Intrinsics.checkNotNullParameter(closure, "closure");
        Iterator it = jz1.a.entrySet().iterator();
        while (it.hasNext()) {
            DY0 dy0 = (DY0) ((Map.Entry) it.next()).getValue();
            dy0.getClass();
            Intrinsics.checkNotNullParameter(closure, "closure");
            synchronized (dy0.a) {
                try {
                    Iterator it2 = dy0.a.iterator();
                    while (it2.hasNext()) {
                        closure.invoke((InterfaceC5978pf1) it2.next());
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Nullable
    public final void c() {
        if (this.m != null) {
            String str = d().a.a().b;
        }
    }

    @NotNull
    public final C1644Nv0 d() {
        C1644Nv0 c1644Nv0 = this.m;
        if (c1644Nv0 != null) {
            return c1644Nv0;
        }
        Intrinsics.l("idContainer");
        throw null;
    }

    @NotNull
    public final LQ1 e() {
        LQ1 lq1 = this.j;
        if (lq1 != null) {
            return lq1;
        }
        Intrinsics.l("identifyInterceptStorage");
        throw null;
    }

    @NotNull
    public final C1821Qc0 f() {
        C1821Qc0 c1821Qc0 = this.k;
        if (c1821Qc0 != null) {
            return c1821Qc0;
        }
        Intrinsics.l("identityStorage");
        throw null;
    }

    @NotNull
    public final LQ1 g() {
        LQ1 lq1 = this.i;
        if (lq1 != null) {
            return lq1;
        }
        Intrinsics.l("storage");
        throw null;
    }

    @Nullable
    public final void h() {
        if (this.m != null) {
            String str = d().a.a().a;
        }
    }

    public final void j(C0612Aq c0612Aq) {
        this.a.getClass();
        if (c0612Aq.c == null) {
            c0612Aq.c = Long.valueOf(System.currentTimeMillis());
        }
        this.l.a("Logged event with type: " + c0612Aq.a());
        this.h.d(c0612Aq);
    }

    @NotNull
    public final void k(@Nullable String str) {
        C5189lv.k(this.c, this.d, new C4435ia(this, str, null), 2);
    }

    @NotNull
    public final void l(@NotNull String eventType, @Nullable Map map, @Nullable F80 options) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C0612Aq c0612Aq = new C0612Aq();
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        c0612Aq.N = eventType;
        c0612Aq.O = map != null ? PW0.l(map) : null;
        if (options != null) {
            Intrinsics.checkNotNullParameter(options, "options");
            String str = options.a;
            if (str != null) {
                c0612Aq.a = str;
            }
            String str2 = options.b;
            if (str2 != null) {
                c0612Aq.b = str2;
            }
            Long l = options.c;
            if (l != null) {
                c0612Aq.c = Long.valueOf(l.longValue());
            }
            Long l2 = options.d;
            if (l2 != null) {
                c0612Aq.d = Long.valueOf(l2.longValue());
            }
            String str3 = options.f;
            if (str3 != null) {
                c0612Aq.f = str3;
            }
            Double d = options.g;
            if (d != null) {
                c0612Aq.g = Double.valueOf(d.doubleValue());
            }
            Double d2 = options.h;
            if (d2 != null) {
                c0612Aq.h = Double.valueOf(d2.doubleValue());
            }
            String str4 = options.i;
            if (str4 != null) {
                c0612Aq.i = str4;
            }
            String str5 = options.j;
            if (str5 != null) {
                c0612Aq.j = str5;
            }
            String str6 = options.k;
            if (str6 != null) {
                c0612Aq.k = str6;
            }
            String str7 = options.l;
            if (str7 != null) {
                c0612Aq.l = str7;
            }
            String str8 = options.m;
            if (str8 != null) {
                c0612Aq.m = str8;
            }
            String str9 = options.n;
            if (str9 != null) {
                c0612Aq.n = str9;
            }
            String str10 = options.o;
            if (str10 != null) {
                c0612Aq.o = str10;
            }
            String str11 = options.p;
            if (str11 != null) {
                c0612Aq.p = str11;
            }
            String str12 = options.q;
            if (str12 != null) {
                c0612Aq.q = str12;
            }
            String str13 = options.r;
            if (str13 != null) {
                c0612Aq.r = str13;
            }
            String str14 = options.s;
            if (str14 != null) {
                c0612Aq.s = str14;
            }
            String str15 = options.t;
            if (str15 != null) {
                c0612Aq.t = str15;
            }
            String str16 = options.u;
            if (str16 != null) {
                c0612Aq.u = str16;
            }
            String str17 = options.v;
            if (str17 != null) {
                c0612Aq.v = str17;
            }
            String str18 = options.w;
            if (str18 != null) {
                c0612Aq.w = str18;
            }
            String str19 = options.x;
            if (str19 != null) {
                c0612Aq.x = str19;
            }
            String str20 = options.y;
            if (str20 != null) {
                c0612Aq.y = str20;
            }
            String str21 = options.z;
            if (str21 != null) {
                c0612Aq.z = str21;
            }
            String str22 = options.A;
            if (str22 != null) {
                c0612Aq.A = str22;
            }
            String str23 = options.B;
            if (str23 != null) {
                c0612Aq.B = str23;
            }
            String str24 = options.C;
            if (str24 != null) {
                c0612Aq.C = str24;
            }
            C1825Qd1 c1825Qd1 = options.D;
            if (c1825Qd1 != null) {
                c0612Aq.D = c1825Qd1;
            }
            C2046Sz0 c2046Sz0 = options.E;
            if (c2046Sz0 != null) {
                c0612Aq.E = c2046Sz0;
            }
            Double d3 = options.F;
            if (d3 != null) {
                c0612Aq.F = Double.valueOf(d3.doubleValue());
            }
            Double d4 = options.G;
            if (d4 != null) {
                c0612Aq.G = Double.valueOf(d4.doubleValue());
            }
            Integer num = options.H;
            if (num != null) {
                c0612Aq.H = Integer.valueOf(num.intValue());
            }
            String str25 = options.I;
            if (str25 != null) {
                c0612Aq.I = str25;
            }
            String str26 = options.J;
            if (str26 != null) {
                c0612Aq.J = str26;
            }
            InterfaceC1060Gj0<? super C0612Aq, ? super Integer, ? super String, Unit> interfaceC1060Gj0 = options.K;
            if (interfaceC1060Gj0 != null) {
                c0612Aq.K = interfaceC1060Gj0;
            }
            String str27 = options.L;
            if (str27 != null) {
                c0612Aq.L = str27;
            }
            Long l3 = options.e;
            if (l3 != null) {
                c0612Aq.e = Long.valueOf(l3.longValue());
            }
        }
        j(c0612Aq);
    }
}
