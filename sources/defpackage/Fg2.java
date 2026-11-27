package defpackage;

import android.os.SystemClock;
import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.impl.core.backend.abstractModels.EmptyWebSocketRequestImpl;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fg2<W> {
    public static final long v;
    public static final /* synthetic */ int w = 0;

    @NotNull
    public final C4923kf a;

    @NotNull
    public final IP0 b;

    @NotNull
    public final Tf2 c;

    @NotNull
    public final C7238vf2 d;

    @NotNull
    public final C1933Rn1 e;

    @NotNull
    public final C7242vg2 f;

    @NotNull
    public final InterfaceC4930kg2 g;
    public volatile boolean h;

    @Nullable
    public volatile String i;
    public volatile boolean j;
    public volatile int k;
    public volatile long l;

    @NotNull
    public final KW1 m;

    @NotNull
    public final String n;

    @NotNull
    public final ConcurrentLinkedDeque<WebSocketRequestAbstract> o;

    @NotNull
    public final Gson p;

    @NotNull
    public final KW1 q;

    @Nullable
    public final Qg2 r;

    @Nullable
    public C2936bP1 s;

    @Nullable
    public C2936bP1 t;

    @NotNull
    public final AtomicBoolean u;

    @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase", f = "WebSocketRequestExecutorBase.kt", l = {418, 419}, m = "executeRequest$suspendImpl")
    public static final class a<W> extends LM {
        public Fg2 d;
        public WebSocketRequestAbstract e;
        public /* synthetic */ Object g;
        public final /* synthetic */ Fg2<W> h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fg2<W> fg2, JM<? super a> jm) {
            super(jm);
            this.h = fg2;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return Fg2.i(this.h, null, this);
        }
    }

    static {
        b.a aVar = b.e;
        v = c.g(10000, R40.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Fg2(@NotNull C4923kf appDataRepository, @NotNull IP0 lifecycleRegistry, @NotNull Tf2 webSocketBestSelector, @NotNull C7238vf2 wsClientProviderApi, @NotNull C1933Rn1 readyToStartUpdatersProvider, @NotNull C7242vg2 webSocketListenerCommon, @NotNull InterfaceC4930kg2 webSocketConnectionRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(InterfaceC5125ld.class, "classW");
        Intrinsics.checkNotNullParameter(lifecycleRegistry, "lifecycleRegistry");
        Intrinsics.checkNotNullParameter(webSocketBestSelector, "webSocketBestSelector");
        Intrinsics.checkNotNullParameter(wsClientProviderApi, "wsClientProviderApi");
        Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
        Intrinsics.checkNotNullParameter(webSocketListenerCommon, "webSocketListenerCommon");
        Intrinsics.checkNotNullParameter(webSocketConnectionRepository, "webSocketConnectionRepository");
        this.a = appDataRepository;
        this.b = lifecycleRegistry;
        this.c = webSocketBestSelector;
        this.d = wsClientProviderApi;
        this.e = readyToStartUpdatersProvider;
        this.f = webSocketListenerCommon;
        this.g = webSocketConnectionRepository;
        this.l = -1L;
        this.m = XO0.b(new F6(this, 4));
        this.n = "WebSocket";
        this.o = new ConcurrentLinkedDeque<>();
        C4487in0 c4487in0 = new C4487in0();
        c4487in0.g = true;
        Gson gsonA = c4487in0.a();
        Intrinsics.checkNotNullExpressionValue(gsonA, "create(...)");
        this.p = gsonA;
        this.q = XO0.b(new C5770og(this, 6));
        this.u = new AtomicBoolean(false);
        webSocketListenerCommon.getClass();
        Intrinsics.checkNotNullParameter(this, "executor");
        webSocketListenerCommon.l = this;
        this.r = new Qg2(new Pg2(appDataRepository.r));
    }

    public static /* synthetic */ InterfaceC6396rf0 D(Vg2 vg2, String str, C3098cA c3098cA, String str2, String str3, int i) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return vg2.C(str, c3098cA, str, str2, str3);
    }

    public static final void a(Vg2 vg2, String str) {
        C1832Qg c1832Qg = U0.N;
        if (c1832Qg != null) {
            c1832Qg.invoke("lifecycle_emit", PW0.e(new Pair("executor", vg2.k()), new Pair("state", "Started"), new Pair("is_real", Boolean.valueOf(vg2 instanceof C3836fh2)), new Pair("src", str)));
        } else {
            vg2.getClass();
        }
        vg2.l = SystemClock.uptimeMillis();
        vg2.b.d(InterfaceC7394wP0.a.b.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(Fg2 fg2, LM lm) {
        Ig2 ig2;
        fg2.getClass();
        if (lm instanceof Ig2) {
            ig2 = (Ig2) lm;
            int i = ig2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ig2.h = i - Integer.MIN_VALUE;
            } else {
                ig2 = new Ig2(fg2, lm);
            }
        } else {
            ig2 = new Ig2(fg2, lm);
        }
        Object objR = ig2.e;
        MN mn = MN.d;
        int i2 = ig2.h;
        if (i2 == 0) {
            C1795Pt1.b(objR);
            ig2.d = fg2;
            ig2.h = 1;
            objR = fg2.r(ig2);
            if (objR == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fg2 = ig2.d;
            C1795Pt1.b(objR);
        }
        String url = (String) objR;
        C7238vf2 c7238vf2 = fg2.d;
        IP0 registry = fg2.b;
        c7238vf2.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(registry, "registry");
        if (C5777oh2.a(url)) {
            c7238vf2.d = url;
        }
        if (c7238vf2.c != null) {
            return objR;
        }
        synchronized (c7238vf2.g) {
            if (c7238vf2.c != null) {
                return objR;
            }
            C3109cD1 c3109cD1A = L31.a(c7238vf2.e, registry, c7238vf2.a, new C6818tf2(1, c7238vf2.b, C3528eD1.class, "provide", "provide(Lcom/google/gson/Gson;)Lcom/tinder/scarlet/MessageAdapter$Factory;", 0));
            c7238vf2.c = c3109cD1A;
            c7238vf2.f.c0(c3109cD1A);
            return objR;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(Vg2 vg2, LM lm) throws Throwable {
        Ug2 ug2;
        Fg2 fg2;
        vg2.getClass();
        if (lm instanceof Ug2) {
            ug2 = (Ug2) lm;
            int i = ug2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ug2.h = i - Integer.MIN_VALUE;
            } else {
                ug2 = new Ug2(vg2, lm);
            }
        } else {
            ug2 = new Ug2(vg2, lm);
        }
        Object objW = ug2.e;
        Object obj = MN.d;
        int i2 = ug2.h;
        if (i2 == 0) {
            C1795Pt1.b(objW);
            ug2.d = vg2;
            ug2.h = 1;
            objW = vg2.w(true, ug2);
            fg2 = vg2;
            if (objW == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fg2 fg3 = ug2.d;
            C1795Pt1.b(objW);
            fg2 = fg3;
        }
        String str = (String) objW;
        fg2.i = str;
        fg2.k++;
        C1832Qg c1832Qg = U0.N;
        if (c1832Qg != null) {
            c1832Qg.invoke("client_reconnect", PW0.e(new Pair("reconnect_count", new Integer(fg2.k)), new Pair("is_real", Boolean.valueOf(fg2.n()))));
        }
        return Boolean.valueOf(C5777oh2.a(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r7.d(r8, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <W> java.lang.Object i(defpackage.Fg2<W> r7, com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract r8, defpackage.JM<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof Fg2.a
            if (r0 == 0) goto L13
            r0 = r9
            Fg2$a r0 = (Fg2.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            Fg2$a r0 = new Fg2$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L80
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract r8 = r0.e
            Fg2 r7 = r0.d
            defpackage.C1795Pt1.b(r9)
            goto L72
        L3a:
            defpackage.C1795Pt1.b(r9)
            boolean r9 = r7.x(r8)
            com.google.gson.Gson r2 = r7.p
            if (r9 != 0) goto L83
            java.lang.String r9 = r7.k()
            java.lang.String r2 = r2.i(r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "OnMessageSend(false -  "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ")"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            io.sentry.android.core.b0.c(r9, r2)
            r0.d = r7
            r0.e = r8
            r0.i = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = defpackage.IW.b(r4, r0)
            if (r9 != r1) goto L72
            goto L7f
        L72:
            r9 = 0
            r0.d = r9
            r0.e = r9
            r0.i = r3
            java.lang.Object r7 = r7.d(r8, r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L83:
            r2.i(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Fg2.i(Fg2, com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract, JM):java.lang.Object");
    }

    public static boolean p(@NotNull WebSocketResponseAbstract webSocketResponseAbstract, @NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        boolean zEquals;
        Intrinsics.checkNotNullParameter(webSocketResponseAbstract, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (str2 != null) {
            zEquals = String.valueOf(webSocketResponseAbstract.getName()).equals(str2);
        } else {
            zEquals = String.valueOf(webSocketResponseAbstract.getName()).equals(name) || String.valueOf(webSocketResponseAbstract.getAction()).equals(str);
        }
        String requestId = webSocketResponseAbstract.getRequestId();
        return zEquals && (str3 == null || requestId == null || requestId.equals(str3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object s(Fg2 fg2, LM lm) {
        Jg2 jg2;
        if (lm instanceof Jg2) {
            jg2 = (Jg2) lm;
            int i = jg2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg2.h = i - Integer.MIN_VALUE;
            } else {
                jg2 = new Jg2(fg2, lm);
            }
        } else {
            jg2 = new Jg2(fg2, lm);
        }
        Object obj = jg2.e;
        MN mn = MN.d;
        int i2 = jg2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Tf2 tf2 = fg2.c;
            jg2.d = fg2;
            jg2.h = 1;
            if (tf2.a(jg2) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fg2 = jg2.d;
            C1795Pt1.b(obj);
        }
        return fg2.c.b();
    }

    public static /* synthetic */ Object z(Fg2 fg2, String str, WebSocketRequestAbstract webSocketRequestAbstract, JM jm, int i) {
        if ((i & 2) != 0) {
            webSocketRequestAbstract = fg2.g();
        }
        return fg2.y(str, webSocketRequestAbstract, str, jm);
    }

    public final void A(@NotNull EnumC3495e41 state) {
        boolean z;
        C1832Qg c1832Qg;
        Intrinsics.checkNotNullParameter(state, "state");
        EnumC3495e41 enumC3495e41 = (EnumC3495e41) j().f.d.getValue();
        BN1 bn1J = j();
        synchronized (bn1J) {
            try {
                Intrinsics.checkNotNullParameter(state, "state");
                GP1 gp1 = bn1J.e;
                gp1.getClass();
                gp1.m(null, state);
                if (state != EnumC3495e41.d) {
                    bn1J.g++;
                    bn1J.h = false;
                }
                bn1J.a(((Boolean) bn1J.d.invoke()).booleanValue());
                z = !bn1J.a || ((Boolean) bn1J.d.invoke()).booleanValue();
                if (z) {
                    GP1 gp2 = bn1J.b;
                    gp2.getClass();
                    gp2.m(null, state);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z || enumC3495e41 == state || (c1832Qg = U0.N) == null) {
            return;
        }
        c1832Qg.invoke("state_withheld", PW0.e(new Pair("is_real", Boolean.valueOf(n())), new Pair("state", state.name())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object B(@NotNull String str, @NotNull C3098cA c3098cA, @Nullable String str2, @Nullable String str3, @NotNull Function1 function1, @NotNull LM lm) {
        Og2 og2;
        if (lm instanceof Og2) {
            og2 = (Og2) lm;
            int i = og2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                og2.g = i - Integer.MIN_VALUE;
            } else {
                og2 = new Og2(this, lm);
            }
        } else {
            og2 = new Og2(this, lm);
        }
        Object objD = og2.d;
        MN mn = MN.d;
        int i2 = og2.g;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            InterfaceC6396rf0 interfaceC6396rf0C = C(str, c3098cA, str2, str3, null);
            og2.g = 1;
            objD = OZ1.d(v, new C2443Xr1(null, interfaceC6396rf0C, function1), og2);
            if (objD == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objD);
        }
        CommonResult commonResult = (CommonResult) objD;
        return commonResult == null ? new ResultError(new CommonError.TimeoutException()) : commonResult;
    }

    @NotNull
    public final InterfaceC6396rf0 C(@NotNull String name, @NotNull C3098cA response, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        int i = 1;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(response, "response");
        if (C1526Mj.m(new EnumC3495e41[]{EnumC3495e41.h, EnumC3495e41.g, EnumC3495e41.i}, this.a.r.getValue())) {
            return new C0658Bf0(new ResultError(new CommonError.NotWebSocketConnection()));
        }
        C3527eD0 c3527eD0 = new C3527eD0(new Rg2(response, this, name, str, str2, str3), i);
        Qg2 qg2 = this.r;
        Intrinsics.checkNotNull(qg2);
        return C4466ii.x(c3527eD0, C5020l60.d, qg2);
    }

    @Nullable
    public final Object d(@NotNull WebSocketRequestAbstract webSocketRequestAbstract, @NotNull JM<? super Unit> jm) {
        if (this.h) {
            Object objH = h(webSocketRequestAbstract, jm);
            return objH == MN.d ? objH : Unit.a;
        }
        this.o.add(webSocketRequestAbstract);
        return Unit.a;
    }

    public boolean e() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@NotNull LM lm) {
        Dg2 dg2;
        Fg2<W> fg2;
        Fg2<W> fg3;
        if (lm instanceof Dg2) {
            dg2 = (Dg2) lm;
            int i = dg2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg2.h = i - Integer.MIN_VALUE;
            } else {
                dg2 = new Dg2(this, lm);
            }
        } else {
            dg2 = new Dg2(this, lm);
        }
        Object obj = dg2.e;
        MN mn = MN.d;
        int i2 = dg2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                fg2 = dg2.d;
                C1795Pt1.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fg3 = dg2.d;
                C1795Pt1.b(obj);
            }
            fg3.A(EnumC3495e41.j);
            fg3.h = false;
            return Unit.a;
        }
        C1795Pt1.b(obj);
        if (!this.h) {
            return Unit.a;
        }
        this.h = false;
        this.j = true;
        InterfaceC4930kg2 interfaceC4930kg2 = this.g;
        dg2.d = this;
        dg2.h = 1;
        if (interfaceC4930kg2.b(dg2) != mn) {
            fg2 = this;
        }
        return mn;
        C1832Qg c1832Qg = U0.N;
        if (c1832Qg != null) {
            c1832Qg.invoke("lifecycle_emit", PW0.e(new Pair("executor", fg2.k()), new Pair("state", "Stopped.AndAborted"), new Pair("is_real", Boolean.valueOf(fg2.n()))));
        }
        fg2.b.d(InterfaceC7394wP0.a.c.C0528a.a);
        fg2.o.clear();
        GP1 gp1 = fg2.a.h;
        Boolean bool = Boolean.FALSE;
        gp1.getClass();
        gp1.m(null, bool);
        C1832Qg c1832Qg2 = U0.N;
        if (c1832Qg2 != null) {
            c1832Qg2.invoke("can_open_changed", PW0.e(new Pair(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool), new Pair(Payload.SOURCE, "close"), new Pair("is_real", Boolean.valueOf(fg2.n()))));
        }
        Eg2 eg2 = new Eg2(fg2, null);
        dg2.d = fg2;
        dg2.h = 2;
        if (OZ1.c(1000L, eg2, dg2) != mn) {
            fg3 = fg2;
            fg3.A(EnumC3495e41.j);
            fg3.h = false;
            return Unit.a;
        }
        return mn;
    }

    @NotNull
    public abstract EmptyWebSocketRequestImpl g();

    @Nullable
    public Object h(@NotNull WebSocketRequestAbstract webSocketRequestAbstract, @NotNull JM<? super Unit> jm) {
        return i(this, webSocketRequestAbstract, jm);
    }

    public final BN1 j() {
        return (BN1) this.m.getValue();
    }

    @NotNull
    public String k() {
        return this.n;
    }

    @Nullable
    public Object l(@NotNull String str, @NotNull Mg2 mg2) {
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull LM lm) {
        Hg2 hg2;
        Fg2 fg2;
        if (lm instanceof Hg2) {
            hg2 = (Hg2) lm;
            int i = hg2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hg2.h = i - Integer.MIN_VALUE;
            } else {
                hg2 = new Hg2(this, lm);
            }
        } else {
            hg2 = new Hg2(this, lm);
        }
        Object obj = hg2.e;
        MN mn = MN.d;
        int i2 = hg2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            fg2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fg2 = hg2.d;
            C1795Pt1.b(obj);
        }
        while (!fg2.o.isEmpty()) {
            WebSocketRequestAbstract webSocketRequestAbstractPollFirst = fg2.o.pollFirst();
            if (webSocketRequestAbstractPollFirst == null) {
                return Unit.a;
            }
            hg2.d = fg2;
            hg2.h = 1;
            if (fg2.h(webSocketRequestAbstractPollFirst, hg2) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }

    public boolean n() {
        return false;
    }

    public abstract boolean o();

    @Nullable
    public Object q(@NotNull C7242vg2.d dVar) {
        return Unit.a;
    }

    @Nullable
    public Object r(@NotNull Ig2 ig2) {
        return s(this, ig2);
    }

    @Nullable
    public abstract Object t(@NotNull C5980pg c5980pg, @NotNull LM lm);

    public final void v(@NotNull String trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (C5777oh2.a(this.i)) {
            this.f.f(trigger);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(boolean z, LM lm) throws Throwable {
        Kg2 kg2;
        P60 p60;
        C2590Zo1 c2590Zo1;
        Fg2<W> fg2;
        if (lm instanceof Kg2) {
            kg2 = (Kg2) lm;
            int i = kg2.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg2.k = i - Integer.MIN_VALUE;
            } else {
                kg2 = new Kg2(this, lm);
            }
        } else {
            kg2 = new Kg2(this, lm);
        }
        Object obj = kg2.i;
        MN mn = MN.d;
        int i2 = kg2.k;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            p60 = new P60();
            C2590Zo1 c2590Zo2 = new C2590Zo1();
            Lg2 lg2 = new Lg2(this, c2590Zo2, null);
            kg2.d = this;
            kg2.e = p60;
            kg2.g = c2590Zo2;
            kg2.h = z;
            kg2.k = 1;
            Object objP = C5189lv.p(p60, lg2, kg2);
            if (objP == mn) {
                return mn;
            }
            c2590Zo1 = c2590Zo2;
            obj = objP;
            fg2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = kg2.h;
            c2590Zo1 = kg2.g;
            p60 = kg2.e;
            fg2 = kg2.d;
            C1795Pt1.b(obj);
        }
        String str = (String) obj;
        if (!C5777oh2.a(str)) {
            C1832Qg c1832Qg = U0.N;
            if (c1832Qg != null) {
                c1832Qg.invoke("url_resolve_gave_up", PW0.e(new Pair("attempts", new Integer(c2590Zo1.d)), new Pair("failed_selection_rounds", new Integer(p60.g)), new Pair("is_real", Boolean.valueOf(fg2.n()))));
            }
            if (z) {
                int i3 = c2590Zo1.d;
                boolean zN = fg2.n();
                Pair<Integer, Integer> pair = p60.e;
                if (pair != null) {
                    int iIntValue = pair.d.intValue();
                    int iIntValue2 = pair.e.intValue();
                    C1598Ng c1598Ng = U0.J;
                    if (c1598Ng != null) {
                        c1598Ng.l(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(i3), Boolean.valueOf(zN));
                    }
                }
            }
        }
        return str;
    }

    public abstract boolean x(@NotNull WebSocketRequestAbstract webSocketRequestAbstract);

    @Nullable
    public final Object y(@NotNull String str, @NotNull WebSocketRequestAbstract webSocketRequestAbstract, @Nullable String str2, @NotNull JM jm) {
        webSocketRequestAbstract.c(str);
        webSocketRequestAbstract.b(str2);
        C6315rG c6315rG = (C6315rG) this.a.f.getValue();
        webSocketRequestAbstract.d(c6315rG != null ? c6315rG.a : null);
        Object objD = d(webSocketRequestAbstract, jm);
        return objD == MN.d ? objD : Unit.a;
    }
}
