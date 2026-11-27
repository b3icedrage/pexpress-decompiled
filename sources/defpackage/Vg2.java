package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import com.impl.core.backend.abstractModels.EmptyWebSocketRequestImpl;
import com.impl.core.backend.abstractModels.RawWebSocketRequest;
import com.impl.core.backend.abstractModels.WebSocketRequestImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class Vg2 extends Fg2<InterfaceC5125ld> {
    public static final long L;
    public static final long M;
    public static final /* synthetic */ int N = 0;

    @NotNull
    public final CZ1 A;

    @NotNull
    public final O3 B;

    @NotNull
    public final KW1 C;

    @NotNull
    public final String D;

    @NotNull
    public final Object E;

    @Nullable
    public C2936bP1 F;

    @Nullable
    public C2936bP1 G;

    @NotNull
    public final C7893yl2 H;

    @NotNull
    public final RV I;

    @NotNull
    public final C4795k21 J;
    public volatile long K;

    @NotNull
    public final Tf2 x;

    @NotNull
    public final C6197qh2 y;

    @NotNull
    public final AbstractC3104cC z;

    @InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl$1", f = "WebSocketRequestExecutorImpl.kt", l = {84}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Vg2$a$a, reason: collision with other inner class name */
        public static final class C0161a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ Vg2 d;

            public C0161a(Vg2 vg2) {
                this.d = vg2;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                EnumC3495e41 enumC3495e41;
                EnumC3495e41 enumC3495e42;
                C1832Qg c1832Qg;
                EnumC4164hF1 enumC4164hF1 = (EnumC4164hF1) obj;
                Vg2 vg2 = this.d;
                boolean z = enumC4164hF1 == EnumC4164hF1.h;
                int i = Vg2.N;
                BN1 bn1J = vg2.j();
                synchronized (bn1J) {
                    bn1J.a(z);
                    enumC3495e41 = null;
                    if (bn1J.a == z && (enumC3495e42 = (EnumC3495e41) bn1J.e.getValue()) != null) {
                        GP1 gp1 = bn1J.b;
                        gp1.getClass();
                        gp1.m(null, enumC3495e42);
                        enumC3495e41 = enumC3495e42;
                    }
                }
                if (enumC3495e41 != null && (c1832Qg = U0.N) != null) {
                    c1832Qg.invoke("state_republished", PW0.e(new Pair("is_real", Boolean.valueOf(vg2 instanceof C3836fh2)), new Pair("state", enumC3495e41.name())));
                }
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return Vg2.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                Vg2 vg2 = Vg2.this;
                C1699On1 c1699On1L = vg2.B.l();
                C0161a c0161a = new C0161a(vg2);
                this.d = 1;
                if (c1699On1L.d.c(c0161a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            throw new C3342dL0();
        }
    }

    static {
        b.a aVar = b.e;
        R40 r40 = R40.SECONDS;
        long jG = c.g(25, r40);
        L = jG;
        long jG2 = c.g(50, r40);
        M = jG2;
        long jL = b.l(jG);
        long jL2 = b.l(jG2);
        long j = (((jL2 + jL) - 1) / jL) * jL;
        if (jL >= jL2 || j >= 60000) {
            throw new IllegalArgumentException(("D1 pong-timeout first-fires at " + j + "ms; must be < 60000ms watchdog (PING_DELAY=" + b.s(jG) + ", PONG_TIMEOUT=" + b.s(jG2) + ")").toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vg2(@NotNull C4923kf appDataRepository, @NotNull IP0 lifecycleRegistry, @NotNull Tf2 webSocketBestSelector, @NotNull C6197qh2 webSocketUrlProvider, @NotNull C7238vf2 scarletClientProvider, @NotNull C1933Rn1 readyToStartUpdatersProvider, @NotNull C7242vg2 webSocketListener, @NotNull InterfaceC4930kg2 webSocketConnectionRepository, @NotNull AbstractC3104cC ciSessionProvider, @NotNull CZ1 timeZoneOffsetProviderApi, @NotNull O3 accountModeSelectionUseCase) {
        super(appDataRepository, lifecycleRegistry, webSocketBestSelector, scarletClientProvider, readyToStartUpdatersProvider, webSocketListener, webSocketConnectionRepository);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(lifecycleRegistry, "lifecycleRegistry");
        Intrinsics.checkNotNullParameter(webSocketBestSelector, "webSocketBestSelector");
        Intrinsics.checkNotNullParameter(webSocketUrlProvider, "webSocketUrlProvider");
        Intrinsics.checkNotNullParameter(scarletClientProvider, "scarletClientProvider");
        Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
        Intrinsics.checkNotNullParameter(webSocketListener, "webSocketListener");
        Intrinsics.checkNotNullParameter(webSocketConnectionRepository, "webSocketConnectionRepository");
        Intrinsics.checkNotNullParameter(ciSessionProvider, "ciSessionProvider");
        Intrinsics.checkNotNullParameter(timeZoneOffsetProviderApi, "timeZoneOffsetProviderApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        this.x = webSocketBestSelector;
        this.y = webSocketUrlProvider;
        this.z = ciSessionProvider;
        this.A = timeZoneOffsetProviderApi;
        this.B = accountModeSelectionUseCase;
        this.C = XO0.b(new C1449Lj(webSocketConnectionRepository, 6));
        webSocketConnectionRepository.a(this);
        C5189lv.k(C7235vf.a, null, new a(null), 3);
        this.D = "WebSocketDemo";
        this.E = XO0.a(EnumC4403iP0.d, new C4797k3(scarletClientProvider, 10));
        this.H = new C7893yl2();
        this.I = C6266r20.a;
        this.J = ED.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object E(Vg2 vg2, LM lm) {
        Xg2 xg2;
        if (lm instanceof Xg2) {
            xg2 = (Xg2) lm;
            int i = xg2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg2.g = i - Integer.MIN_VALUE;
            } else {
                xg2 = new Xg2(vg2, lm);
            }
        } else {
            xg2 = new Xg2(vg2, lm);
        }
        Object obj = xg2.d;
        MN mn = MN.d;
        int i2 = xg2.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            vg2.A(EnumC3495e41.k);
            xg2.g = 1;
            C5189lv.k(C7235vf.a, null, new Gg2(vg2, null), 3);
            if (Unit.a == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r0 r1 r4 r8
      0x0045: PHI (r0v13 int) = (r0v10 int), (r0v28 int) binds: [B:48:0x00f0, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r1v23 java.lang.Object) = (r1v20 java.lang.Object), (r1v1 java.lang.Object) binds: [B:48:0x00f0, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r4v14 java.lang.String) = (r4v11 java.lang.String), (r4v21 java.lang.String) binds: [B:48:0x00f0, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r8v3 Vg2) = (r8v2 Vg2), (r8v8 Vg2) binds: [B:48:0x00f0, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        if (r0.f(r2) == r3) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object G(defpackage.Vg2 r17, defpackage.LM r18) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Vg2.G(Vg2, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object H(Vg2 vg2, LM lm) {
        Zg2 zg2;
        if (lm instanceof Zg2) {
            zg2 = (Zg2) lm;
            int i = zg2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zg2.h = i - Integer.MIN_VALUE;
            } else {
                zg2 = new Zg2(vg2, lm);
            }
        } else {
            zg2 = new Zg2(vg2, lm);
        }
        Object obj = zg2.e;
        MN mn = MN.d;
        int i2 = zg2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            zg2.d = vg2;
            zg2.h = 1;
            if (vg2.y.f(vg2 instanceof C3836fh2, zg2) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vg2 = zg2.d;
            C1795Pt1.b(obj);
        }
        vg2.getClass();
        boolean z = vg2 instanceof C3836fh2;
        C6197qh2 c6197qh2 = vg2.y;
        if (z) {
            String str = c6197qh2.j;
            return str == null ? "" : str;
        }
        String str2 = c6197qh2.i;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [Vg2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [h21] */
    /* JADX WARN: Type inference failed for: r7v3, types: [Fg2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [h21] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [Vg2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object I(defpackage.Vg2 r7, defpackage.C5980pg r8, defpackage.LM r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.C2774ah2
            if (r0 == 0) goto L13
            r0 = r9
            ah2 r0 = (defpackage.C2774ah2) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ah2 r0 = new ah2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.d
            h21 r7 = (defpackage.InterfaceC4117h21) r7
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L8c
        L32:
            r8 = move-exception
            goto L99
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            h21 r7 = r0.g
            java.lang.Object r8 = r0.d
            Vg2 r8 = (defpackage.Vg2) r8
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L47:
            h21 r7 = r0.g
            kotlin.jvm.functions.Function1 r8 = r0.e
            java.lang.Object r2 = r0.d
            Vg2 r2 = (defpackage.Vg2) r2
            defpackage.C1795Pt1.b(r9)
            r9 = r7
            r7 = r2
            goto L69
        L55:
            defpackage.C1795Pt1.b(r9)
            k21 r9 = r7.J
            r0.d = r7
            r0.e = r8
            r0.g = r9
            r0.j = r5
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L69
            goto L8b
        L69:
            r0.d = r7     // Catch: java.lang.Throwable -> L97
            r0.e = r8     // Catch: java.lang.Throwable -> L97
            r0.g = r9     // Catch: java.lang.Throwable -> L97
            r0.j = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r7.f(r0)     // Catch: java.lang.Throwable -> L97
            if (r8 != r1) goto L78
            goto L8b
        L78:
            r8 = r7
            r7 = r9
        L7a:
            r0.d = r7     // Catch: java.lang.Throwable -> L32
            r0.e = r6     // Catch: java.lang.Throwable -> L32
            r0.g = r6     // Catch: java.lang.Throwable -> L32
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            r8.getClass()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = E(r8, r0)     // Catch: java.lang.Throwable -> L32
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L32
            r9.getClass()     // Catch: java.lang.Throwable -> L32
            r7.b(r6)
            return r9
        L95:
            r7 = r9
            goto L99
        L97:
            r8 = move-exception
            goto L95
        L99:
            r7.b(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Vg2.I(Vg2, pg, LM):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @NotNull
    public final InterfaceC5125ld F() {
        return (InterfaceC5125ld) this.E.getValue();
    }

    @Nullable
    public final Object J(@NotNull RawWebSocketRequest rawWebSocketRequest, @NotNull JM<? super Unit> jm) {
        Object objZ = Fg2.z(this, "", rawWebSocketRequest, jm, 12);
        return objZ == MN.d ? objZ : Unit.a;
    }

    @Override // defpackage.Fg2
    @NotNull
    public final EmptyWebSocketRequestImpl g() {
        return new EmptyWebSocketRequestImpl();
    }

    @Override // defpackage.Fg2
    @Nullable
    public final Object h(@NotNull WebSocketRequestAbstract webSocketRequestAbstract, @NotNull JM<? super Unit> jm) {
        Object objI = Fg2.i(this, webSocketRequestAbstract, jm);
        return objI == MN.d ? objI : Unit.a;
    }

    @Override // defpackage.Fg2
    @NotNull
    public String k() {
        return this.D;
    }

    @Override // defpackage.Fg2
    @Nullable
    public final Object l(@NotNull String str, @NotNull Mg2 mg2) {
        Object objG = this.y.g(mg2, str, this instanceof C3836fh2);
        return objG == MN.d ? objG : Unit.a;
    }

    @Override // defpackage.Fg2
    public boolean n() {
        return this instanceof C3836fh2;
    }

    @Override // defpackage.Fg2
    public final boolean o() {
        return this.B.l().d.getValue() == EnumC4164hF1.h;
    }

    @Override // defpackage.Fg2
    @Nullable
    public final Object q(@NotNull C7242vg2.d dVar) {
        return G(this, dVar);
    }

    @Override // defpackage.Fg2
    @Nullable
    public final Object r(@NotNull Ig2 ig2) {
        return H(this, ig2);
    }

    @Override // defpackage.Fg2
    @Nullable
    public final Object t(@NotNull C5980pg c5980pg, @NotNull LM lm) {
        return I(this, c5980pg, lm);
    }

    @Override // defpackage.Fg2
    public final boolean x(@NotNull WebSocketRequestAbstract request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof EmptyWebSocketRequestImpl) {
            return F().f(VE.c(request.getName()));
        }
        if (request instanceof RawWebSocketRequest) {
            return F().b(((RawWebSocketRequest) request).getRawMessage());
        }
        return request instanceof WebSocketRequestImpl ? F().f(WE.f(request.getName(), ((WebSocketRequestImpl) request).getPayload())) : F().f(WE.f(request.getName(), request));
    }
}
