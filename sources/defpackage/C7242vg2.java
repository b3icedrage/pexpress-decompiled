package defpackage;

import android.os.SystemClock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7242vg2 {

    @NotNull
    public final Tf2 a;
    public int b;

    @Nullable
    public C2936bP1 c;
    public volatile long d;
    public volatile long e;
    public volatile int f;
    public volatile boolean g;
    public volatile boolean h;

    @NotNull
    public final Cl2 i;

    @NotNull
    public final O60 j;

    @NotNull
    public final C7320w30 k;

    @Nullable
    public Fg2<?> l;

    @NotNull
    public final KW1 m;

    @NotNull
    public final KW1 n;
    public final long o;

    /* JADX INFO: renamed from: vg2$a */
    public /* synthetic */ class a extends C2784ak0 implements Function0<Long> {
        public static final a m = new a(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: vg2$b */
    public /* synthetic */ class b extends C2784ak0 implements Function0<Long> {
        public static final b m = new b(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: vg2$c */
    public /* synthetic */ class c extends C2784ak0 implements Function0<Long> {
        public static final c m = new c(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: vg2$d */
    @InterfaceC3368dU(c = "com.base.core.backend.WebSocketListener$listener$2$1", f = "WebSocketListener.kt", l = {153, 154, 183, 214, 216, 260, 262, 281, 283}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<Pf2.a, JM<? super Unit>, Object> {
        public Fg2 d;
        public int e;
        public /* synthetic */ Object g;

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            d dVar = C7242vg2.this.new d(jm);
            dVar.g = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pf2.a aVar, JM<? super Unit> jm) {
            return ((d) create(aVar, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:180:0x0419  */
        /* JADX WARN: Code duplicated, block: B:183:0x0431  */
        /* JADX WARN: Code duplicated, block: B:185:0x043b  */
        /* JADX WARN: Code duplicated, block: B:188:0x044c  */
        /* JADX WARN: Code duplicated, block: B:190:0x0454  */
        /* JADX WARN: Code duplicated, block: B:194:0x048d A[PHI: r0 r3
          0x048d: PHI (r0v123 Fg2<?>) = (r0v121 Fg2<?>), (r0v124 Fg2<?>) binds: [B:192:0x0489, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE]
          0x048d: PHI (r3v64 El2) = (r3v61 El2), (r3v66 El2) binds: [B:192:0x0489, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:197:0x04a5  */
        /* JADX WARN: Code duplicated, block: B:200:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:202:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:205:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:209:0x04e2  */
        /* JADX WARN: Code duplicated, block: B:237:0x0583  */
        /* JADX WARN: Code duplicated, block: B:248:0x05a6  */
        /* JADX WARN: Code duplicated, block: B:249:0x05ab  */
        /* JADX WARN: Code duplicated, block: B:252:0x05b2  */
        /* JADX WARN: Code duplicated, block: B:255:0x05c0  */
        /* JADX WARN: Code duplicated, block: B:258:0x05d0  */
        /* JADX WARN: Code duplicated, block: B:259:0x05d5  */
        /* JADX WARN: Code duplicated, block: B:271:0x0617  */
        /* JADX WARN: Code duplicated, block: B:277:0x063a  */
        /* JADX WARN: Code restructure failed: missing block: B:313:0x0744, code lost:
        
            if (defpackage.C7242vg2.b(r3, r25) == r2) goto L336;
         */
        /* JADX WARN: Code restructure failed: missing block: B:335:0x07f6, code lost:
        
            if (defpackage.C7242vg2.b(r3, r25) == r2) goto L336;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x022a, code lost:
        
            if (r3.m(r25) == r2) goto L336;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 2070
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7242vg2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C7242vg2(@NotNull Tf2 webSocketBestSelector, @NotNull C5698oK connectionStatus) {
        Intrinsics.checkNotNullParameter(webSocketBestSelector, "webSocketBestSelector");
        Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
        this.a = webSocketBestSelector;
        this.d = -1L;
        this.e = -1L;
        a aVar = a.m;
        this.i = new Cl2(0);
        c cVar = c.m;
        this.j = new O60(new C7121v6(connectionStatus, 9));
        b now = b.m;
        Intrinsics.checkNotNullParameter(now, "now");
        this.k = new C7320w30();
        this.m = XO0.b(new C4927kg(this, 9));
        this.n = XO0.b(new C7946z2(this, 7));
        this.o = 20000L;
    }

    public static final void a(C7242vg2 c7242vg2) {
        C1832Qg c1832Qg;
        O60 o60 = c7242vg2.j;
        if (o60.f < o60.c || !((Boolean) o60.a.invoke()).booleanValue()) {
            return;
        }
        Fg2<?> fg2D = c7242vg2.d();
        boolean z = !c7242vg2.j.g;
        String str = fg2D.i;
        if (str != null) {
            if (!C5777oh2.a(str)) {
                str = null;
            }
            if (str == null) {
                return;
            }
            if (!fg2D.e()) {
                if (fg2D.f.i.b() || (c1832Qg = U0.N) == null) {
                    return;
                }
                c1832Qg.invoke("endpoint_rotation_skipped", OW0.b(new Pair("is_real", Boolean.valueOf(fg2D.n()))));
                return;
            }
            if (fg2D.u.compareAndSet(false, true)) {
                C5189lv.k(C3286d41.a, null, new Mg2(fg2D, str, z, null), 3);
                O60 o61 = c7242vg2.j;
                o61.f = 0;
                o61.g = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(C7242vg2 c7242vg2, LM lm) {
        C7663xg2 c7663xg2;
        c7242vg2.getClass();
        if (lm instanceof C7663xg2) {
            c7663xg2 = (C7663xg2) lm;
            int i = c7663xg2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7663xg2.h = i - Integer.MIN_VALUE;
            } else {
                c7663xg2 = new C7663xg2(c7242vg2, lm);
            }
        } else {
            c7663xg2 = new C7663xg2(c7242vg2, lm);
        }
        Object obj = c7663xg2.e;
        MN mn = MN.d;
        int i2 = c7663xg2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2936bP1 c2936bP1 = c7242vg2.c;
            if (c2936bP1 != null) {
                c7663xg2.d = c7242vg2;
                c7663xg2.h = 1;
                c2936bP1.l(null);
                Object objB1 = c2936bP1.b1(c7663xg2);
                if (objB1 != mn) {
                    objB1 = Unit.a;
                }
                if (objB1 == mn) {
                    return mn;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7242vg2 = c7663xg2.d;
            C1795Pt1.b(obj);
        }
        c7242vg2.c = null;
        return Unit.a;
    }

    public static final void c(C7242vg2 c7242vg2, EnumC3495e41 enumC3495e41) {
        c7242vg2.d().A(enumC3495e41);
    }

    @NotNull
    public final Fg2<?> d() {
        return (Fg2) this.m.getValue();
    }

    public long e() {
        return this.o;
    }

    public final void f(@NotNull String trigger) {
        C1284Jg c1284Jg;
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (this.e < 0) {
            this.e = System.currentTimeMillis();
        }
        this.f++;
        if (this.i.b() || (c1284Jg = U0.E) == null) {
            return;
        }
        c1284Jg.k(trigger, Integer.valueOf(this.f), Boolean.valueOf(d().n()));
    }
}
