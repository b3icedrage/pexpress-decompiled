package defpackage;

import android.os.SystemClock;
import androidx.lifecycle.g;
import com.api.core.ActivityStateProvider;
import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import com.api.core.backend.domain.models.requestModels.CommonAddDealRequest;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.core.backend.modelsOurSideRequest.events.EventBetRequest;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.impl.core.backend.modelsRequest.MakeABetRequestImpl;
import com.pexpress.tool.AppImpl;
import defpackage.H32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class S02<T extends H32> {
    public static final long s0;
    public static final long t0;

    @NotNull
    public static final IntRange u0;

    @NotNull
    public final C1699On1 A;

    @NotNull
    public final GP1 B;

    @NotNull
    public final C1699On1 C;

    @NotNull
    public final GP1 D;

    @NotNull
    public final C1699On1 E;

    @NotNull
    public final GP1 F;

    @NotNull
    public final C1699On1 G;

    @NotNull
    public final C6120qK1 H;

    @NotNull
    public final C1621Nn1 I;

    @NotNull
    public final GP1 J;

    @NotNull
    public final C1699On1 K;

    @NotNull
    public final C6120qK1 L;

    @NotNull
    public final C1621Nn1 M;

    @NotNull
    public final AtomicInteger N;

    @NotNull
    public final C3735fC1 O;

    @NotNull
    public final GP1 P;

    @NotNull
    public final C1699On1 Q;

    @NotNull
    public final GP1 R;

    @NotNull
    public final GP1 S;

    @NotNull
    public final GP1 T;

    @NotNull
    public final C1699On1 U;

    @Nullable
    public C2513Yp V;
    public boolean W;
    public int X;
    public long Y;

    @Nullable
    public C2936bP1 Z;

    @NotNull
    public final AbstractC7949z22 a;

    @Nullable
    public C2936bP1 a0;

    @NotNull
    public final AbstractC7004uZ1 b;
    public boolean b0;

    @NotNull
    public final C4923kf c;

    @Nullable
    public InterfaceC7187vQ1 c0;

    @NotNull
    public final UV0 d;

    @Nullable
    public Double d0;

    @NotNull
    public final C4934kh2 e;

    @Nullable
    public Double e0;

    @NotNull
    public final ActivityStateProvider f;

    @NotNull
    public EnumC4164hF1 f0;

    @NotNull
    public final ReporterApi g;

    @NotNull
    public InterfaceC5721oR1 g0;

    @NotNull
    public final G41 h;

    @NotNull
    public E10 h0;

    @NotNull
    public final O3 i;

    @Nullable
    public Double i0;

    @NotNull
    public final EQ j;

    @Nullable
    public T j0;

    @NotNull
    public final InterfaceC4824k92 k;

    @NotNull
    public Q10 k0;

    @NotNull
    public final U7 l;
    public boolean l0;

    @NotNull
    public final OM m;

    @Nullable
    public S12 m0;

    @NotNull
    public final InterfaceC3012bl0 n;
    public long n0;

    @NotNull
    public final L32 o;

    @Nullable
    public String o0;

    @NotNull
    public final C3149cR p;
    public int p0;

    @NotNull
    public final C6348rR q;
    public long q0;

    @NotNull
    public final U22 r;
    public int r0;

    @NotNull
    public final C4612j90 s;

    @NotNull
    public final GP1 t;

    @NotNull
    public final C6120qK1 u;

    @NotNull
    public final C6120qK1 v;

    @NotNull
    public final C1621Nn1 w;

    @NotNull
    public final C1621Nn1 x;

    @NotNull
    public final C1699On1 y;

    @NotNull
    public final GP1 z;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4164hF1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC4164hF1 enumC4164hF1 = EnumC4164hF1.g;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Ia2.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Ia2 ia2 = Ia2.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr2;
        }
    }

    static {
        b.a aVar = b.e;
        s0 = c.g(20000, R40.MILLISECONDS);
        t0 = c.g(5, R40.SECONDS);
        u0 = new IntRange(28, 30, 1);
    }

    public S02(@NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull C4923kf appData, @NotNull UV0 makeABetRequestBuilder, @NotNull C4934kh2 webSocketServiceProvider, @NotNull ActivityStateProvider activityStateProvider, @NotNull ReporterApi reporter, @NotNull G41 nextBetStateManager, @NotNull NQ currentIndicatorProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider, @NotNull InterfaceC4824k92 unsentBetIdsUseCase, @NotNull U7 addRobotBetIdUseCase, @NotNull OM convertCurrencyUseCase, @NotNull InterfaceC3012bl0 getCurrencyRatesUseCase, @NotNull L32 tradingRepository, @NotNull C3149cR currentStrategyProvider, @NotNull C6348rR customIndicatorsExperimentProvider, @NotNull U22 tradingDefaultsProvider, @NotNull C4612j90 eventsFlowsProvider) {
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(makeABetRequestBuilder, "makeABetRequestBuilder");
        Intrinsics.checkNotNullParameter(webSocketServiceProvider, "webSocketServiceProvider");
        Intrinsics.checkNotNullParameter(activityStateProvider, "activityStateProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nextBetStateManager, "nextBetStateManager");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(unsentBetIdsUseCase, "unsentBetIdsUseCase");
        Intrinsics.checkNotNullParameter(addRobotBetIdUseCase, "addRobotBetIdUseCase");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        Intrinsics.checkNotNullParameter(getCurrencyRatesUseCase, "getCurrencyRatesUseCase");
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        Intrinsics.checkNotNullParameter(currentStrategyProvider, "currentStrategyProvider");
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProvider, "customIndicatorsExperimentProvider");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        this.a = tradingAssetsProvider;
        this.b = timeSelectionsProvider;
        this.c = appData;
        this.d = makeABetRequestBuilder;
        this.e = webSocketServiceProvider;
        this.f = activityStateProvider;
        this.g = reporter;
        this.h = nextBetStateManager;
        this.i = accountModeSelectionUseCase;
        this.j = currencySignProvider;
        this.k = unsentBetIdsUseCase;
        this.l = addRobotBetIdUseCase;
        this.m = convertCurrencyUseCase;
        this.n = getCurrencyRatesUseCase;
        this.o = tradingRepository;
        this.p = currentStrategyProvider;
        this.q = customIndicatorsExperimentProvider;
        this.r = tradingDefaultsProvider;
        this.s = eventsFlowsProvider;
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.t = gp1I;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.u = c6120qK1G;
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.v = c6120qK1G2;
        this.w = C4466ii.e(c6120qK1G);
        this.x = C4466ii.e(c6120qK1G2);
        this.y = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(0);
        this.z = gp1I2;
        this.A = C4466ii.f(gp1I2);
        GP1 gp1I3 = C1589Ne.i("rsi");
        this.B = gp1I3;
        this.C = C4466ii.f(gp1I3);
        GP1 gp1I4 = C1589Ne.i(H32.a.CALL_UP);
        this.D = gp1I4;
        this.E = C4466ii.f(gp1I4);
        Double dValueOf = Double.valueOf(0.0d);
        GP1 gp1I5 = C1589Ne.i(dValueOf);
        this.F = gp1I5;
        this.G = C4466ii.f(gp1I5);
        C6120qK1 c6120qK1G3 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.H = c6120qK1G3;
        this.I = C4466ii.e(c6120qK1G3);
        GP1 gp1I6 = C1589Ne.i(0);
        this.J = gp1I6;
        this.K = C4466ii.f(gp1I6);
        C6120qK1 c6120qK1G4 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.L = c6120qK1G4;
        this.M = C4466ii.e(c6120qK1G4);
        this.N = new AtomicInteger();
        this.O = new C3735fC1(new C7945z12(this, null));
        GP1 gp1I7 = C1589Ne.i(null);
        this.P = gp1I7;
        this.Q = C4466ii.f(gp1I7);
        GP1 gp1I8 = C1589Ne.i(PW0.c());
        this.R = gp1I8;
        C4466ii.f(gp1I8);
        this.S = C1589Ne.i(C5653o60.d);
        GP1 gp1I9 = C1589Ne.i(null);
        this.T = gp1I9;
        this.U = C4466ii.f(gp1I9);
        this.Y = -1L;
        this.d0 = dValueOf;
        this.e0 = dValueOf;
        this.f0 = EnumC4164hF1.g;
        this.g0 = C7122v60.i;
        this.h0 = C4600j60.b;
        this.i0 = dValueOf;
        this.k0 = Q10.INDICATOR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r10.I(r11, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(defpackage.S02 r10, defpackage.C2337Wr r11, defpackage.LM r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C6474s12
            if (r0 == 0) goto L13
            r0 = r12
            s12 r0 = (defpackage.C6474s12) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            s12 r0 = new s12
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            defpackage.C1795Pt1.b(r12)
            goto La0
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            S02 r10 = r0.d
            defpackage.C1795Pt1.b(r12)
            goto L93
        L3d:
            Wr r11 = r0.e
            S02 r10 = r0.d
            defpackage.C1795Pt1.b(r12)
            goto L7f
        L45:
            defpackage.C1795Pt1.b(r12)
            long r7 = r11.a
            r10.Y = r7
        L4c:
            GP1 r12 = r10.T
            java.lang.Object r2 = r12.getValue()
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L5c
            long r7 = r7.longValue()
            goto L5e
        L5c:
            long r7 = r11.a
        L5e:
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            boolean r12 = r12.d(r2, r9)
            if (r12 == 0) goto L4c
            java.lang.Long r12 = new java.lang.Long
            long r7 = r11.b
            r12.<init>(r7)
            r0.d = r10
            r0.e = r11
            r0.i = r6
            long r6 = r11.c
            java.lang.Object r12 = r10.R(r6, r12, r0)
            if (r12 != r1) goto L7f
            goto L9f
        L7f:
            U32 r12 = new U32
            long r6 = r11.c
            r12.<init>()
            r0.d = r10
            r0.e = r3
            r0.i = r5
            java.lang.Object r11 = r10.H(r12, r0)
            if (r11 != r1) goto L93
            goto L9f
        L93:
            long r11 = r10.Y
            r0.d = r3
            r0.i = r4
            java.lang.Object r10 = r10.I(r11, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.A(S02, Wr, LM):java.lang.Object");
    }

    public static void L(S02 s02, C2099Tr response, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        s02.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        s02.K(response.b, response.a, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(S02 s02, InterfaceC7187vQ1 interfaceC7187vQ1, LM lm) {
        C7525x12 c7525x12;
        S02 s03;
        long jLongValue;
        S02 s04;
        S02 s05;
        long j;
        NT0 nt0;
        S02 s06;
        TX0 tx0;
        if (lm instanceof C7525x12) {
            c7525x12 = (C7525x12) lm;
            int i = c7525x12.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7525x12.j = i - Integer.MIN_VALUE;
            } else {
                c7525x12 = new C7525x12(s02, lm);
            }
        } else {
            c7525x12 = new C7525x12(s02, lm);
        }
        Object objE = c7525x12.h;
        MN mn = MN.d;
        switch (c7525x12.j) {
            case 0:
                C1795Pt1.b(objE);
                if (((Boolean) s02.y.d.getValue()).booleanValue()) {
                    if (interfaceC7187vQ1 instanceof QT0) {
                        c7525x12.d = s02;
                        c7525x12.e = s02;
                        c7525x12.j = 1;
                        objE = ((QT0) interfaceC7187vQ1).e(c7525x12);
                        if (objE != mn) {
                            s03 = s02;
                            jLongValue = ((Number) objE).longValue();
                            c7525x12.d = s03;
                            c7525x12.e = s02;
                            c7525x12.g = jLongValue;
                            c7525x12.j = 2;
                            objE = s03.p(c7525x12);
                            if (objE != mn) {
                                s04 = s02;
                                s05 = s03;
                                j = jLongValue;
                                nt0 = new NT0(j, ((Number) objE).doubleValue());
                                c7525x12.d = s05;
                                c7525x12.e = null;
                                c7525x12.j = 3;
                                if (s04.H(nt0, c7525x12) != mn) {
                                    s02 = s05;
                                }
                            }
                        }
                    } else if (interfaceC7187vQ1 instanceof XX0) {
                        c7525x12.d = s02;
                        c7525x12.e = interfaceC7187vQ1;
                        c7525x12.j = 4;
                        if (s02.x(c7525x12) != mn) {
                            c7525x12.d = s02;
                            c7525x12.e = s02;
                            c7525x12.j = 5;
                            objE = ((XX0) interfaceC7187vQ1).e(c7525x12);
                            if (objE != mn) {
                                s06 = s02;
                                tx0 = new TX0(((Number) objE).longValue(), ((Number) s06.G.d.getValue()).doubleValue());
                                c7525x12.d = s06;
                                c7525x12.e = null;
                                c7525x12.j = 6;
                                if (s02.H(tx0, c7525x12) != mn) {
                                    s02 = s06;
                                }
                            }
                        }
                    }
                    return mn;
                }
                s02.T();
                return Unit.a;
            case 1:
                s02 = (S02) c7525x12.e;
                s03 = c7525x12.d;
                C1795Pt1.b(objE);
                jLongValue = ((Number) objE).longValue();
                c7525x12.d = s03;
                c7525x12.e = s02;
                c7525x12.g = jLongValue;
                c7525x12.j = 2;
                objE = s03.p(c7525x12);
                if (objE != mn) {
                    s04 = s02;
                    s05 = s03;
                    j = jLongValue;
                    nt0 = new NT0(j, ((Number) objE).doubleValue());
                    c7525x12.d = s05;
                    c7525x12.e = null;
                    c7525x12.j = 3;
                    if (s04.H(nt0, c7525x12) != mn) {
                        s02 = s05;
                        s02.T();
                        return Unit.a;
                    }
                }
                return mn;
            case 2:
                j = c7525x12.g;
                s04 = (S02) c7525x12.e;
                s05 = c7525x12.d;
                C1795Pt1.b(objE);
                nt0 = new NT0(j, ((Number) objE).doubleValue());
                c7525x12.d = s05;
                c7525x12.e = null;
                c7525x12.j = 3;
                if (s04.H(nt0, c7525x12) != mn) {
                    s02 = s05;
                    s02.T();
                    return Unit.a;
                }
                return mn;
            case 3:
            case 6:
                s02 = c7525x12.d;
                C1795Pt1.b(objE);
                s02.T();
                return Unit.a;
            case 4:
                interfaceC7187vQ1 = (InterfaceC7187vQ1) c7525x12.e;
                s02 = c7525x12.d;
                C1795Pt1.b(objE);
                c7525x12.d = s02;
                c7525x12.e = s02;
                c7525x12.j = 5;
                objE = ((XX0) interfaceC7187vQ1).e(c7525x12);
                if (objE != mn) {
                    s06 = s02;
                    tx0 = new TX0(((Number) objE).longValue(), ((Number) s06.G.d.getValue()).doubleValue());
                    c7525x12.d = s06;
                    c7525x12.e = null;
                    c7525x12.j = 6;
                    if (s02.H(tx0, c7525x12) != mn) {
                        s02 = s06;
                        s02.T();
                        return Unit.a;
                    }
                }
                return mn;
            case 5:
                s02 = (S02) c7525x12.e;
                s06 = c7525x12.d;
                C1795Pt1.b(objE);
                tx0 = new TX0(((Number) objE).longValue(), ((Number) s06.G.d.getValue()).doubleValue());
                c7525x12.d = s06;
                c7525x12.e = null;
                c7525x12.j = 6;
                if (s02.H(tx0, c7525x12) != mn) {
                    s02 = s06;
                    s02.T();
                    return Unit.a;
                }
                return mn;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0235 A[Catch: all -> 0x0229, TryCatch #5 {all -> 0x0229, blocks: (B:97:0x021b, B:104:0x0231, B:106:0x0235, B:107:0x0254), top: B:182:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:110:0x026e  */
    /* JADX WARN: Code duplicated, block: B:114:0x028d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0297  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02df  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x0313  */
    /* JADX WARN: Code duplicated, block: B:141:0x031c  */
    /* JADX WARN: Code duplicated, block: B:142:0x031f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0323  */
    /* JADX WARN: Code duplicated, block: B:146:0x0328  */
    /* JADX WARN: Code duplicated, block: B:147:0x032b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0332  */
    /* JADX WARN: Code duplicated, block: B:150:0x033b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0354  */
    /* JADX WARN: Code duplicated, block: B:165:0x0366  */
    /* JADX WARN: Code duplicated, block: B:167:0x036a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0371  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #0 {all -> 0x01f0, blocks: (B:82:0x01d8, B:84:0x01ea), top: B:173:0x01d8, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    public static final Object b(S02 s02, LM lm) throws Throwable {
        L12 l12;
        S02 s03;
        String requestId;
        C4253hh c4253hh;
        S12 s12;
        I32 params;
        MakeABetRequestImpl makeABetRequestImpl;
        H32.a direction;
        MakeABetRequestImpl.BetDirectionImpl betDirectionImpl;
        MakeABetRequestImpl.AccountTypeImpl accountTypeImpl;
        String requestId2;
        Object obj;
        S12 s13;
        C3623eh c3623eh;
        Object objA;
        String str;
        int i;
        C3279d22 c3279d22;
        WebSocketRequestAbstract webSocketRequestAbstract;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C3833fh c3833fh;
        InterfaceC2441Xr interfaceC2441Xr;
        InterfaceC2441Xr interfaceC2441Xr2;
        InterfaceC7187vQ1 interfaceC7187vQ1;
        InterfaceC2441Xr interfaceC2441Xr3;
        S02 s04;
        List listS;
        ArrayList arrayList;
        Iterator it;
        int i2;
        S02 s05;
        String str7;
        JQ jq;
        String str8;
        S02 s06;
        S02 s07;
        S02 s08 = s02;
        int i3 = 1;
        if (lm instanceof L12) {
            l12 = (L12) lm;
            int i4 = l12.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l12.l = i4 - Integer.MIN_VALUE;
            } else {
                l12 = new L12(s08, lm);
            }
        } else {
            l12 = new L12(s08, lm);
        }
        Object objM = l12.j;
        MN mn = MN.d;
        int i5 = l12.l;
        try {
            switch (i5) {
                case 0:
                    C1795Pt1.b(objM);
                    Objects.toString(s08.a0);
                    Objects.toString(s08.j0);
                    l12.d = s08;
                    l12.l = 1;
                    objM = Boolean.TRUE;
                    if (objM == mn) {
                        return mn;
                    }
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 2;
                    objM = s08.M(l12);
                    if (objM == mn) {
                        return mn;
                    }
                    if (((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    GP1 gp1 = s08.D;
                    T t = s08.j0;
                    Intrinsics.checkNotNull(t);
                    gp1.setValue(t.a());
                    GP1 gp2 = s08.z;
                    T t2 = s08.j0;
                    Intrinsics.checkNotNull(t2);
                    Integer num = new Integer(t2.e());
                    gp2.getClass();
                    gp2.m(null, num);
                    l12.d = s08;
                    l12.l = 3;
                    if (s08.Z() == mn) {
                        return mn;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 4;
                    objM = s08.X(l12);
                    if (objM == mn) {
                        return mn;
                    }
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 5;
                    if (s08.a0(l12) == mn) {
                        return mn;
                    }
                    s03 = s08;
                    Objects.toString(s03.a0);
                    UV0 uv0 = s03.d;
                    T t3 = s03.j0;
                    Intrinsics.checkNotNull(t3);
                    uv0.getClass();
                    params = (I32) t3;
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str9 = params.d;
                    long j = params.b;
                    MakeABetRequestImpl.BetDirectionImpl.INSTANCE.getClass();
                    direction = params.a;
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    if (direction == H32.a.CALL_UP) {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.CALL_UP;
                    } else {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.PUT_DOWN;
                    }
                    MakeABetRequestImpl.BetDirectionImpl betDirectionImpl2 = betDirectionImpl;
                    MakeABetRequestImpl.AccountTypeImpl.INSTANCE.getClass();
                    if (params.c) {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.DEMO;
                    } else {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.REAL;
                    }
                    MakeABetRequestImpl.AccountTypeImpl accountTypeImpl2 = accountTypeImpl;
                    b.a aVar = b.e;
                    makeABetRequestImpl = new MakeABetRequestImpl(str9, j, betDirectionImpl2, accountTypeImpl2, params.f, (int) b.r(params.e, R40.SECONDS));
                    requestId2 = makeABetRequestImpl.getRequestId();
                    obj = "";
                    if (requestId2 == null) {
                        requestId = "";
                    } else {
                        requestId = requestId2;
                    }
                    s03.o0 = requestId;
                    s13 = s03.m0;
                    if (s13 != null) {
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        s13.a = requestId;
                    }
                    s03.n0 = System.currentTimeMillis();
                    c3623eh = U0.p;
                    if (c3623eh != null) {
                        c3623eh.invoke(requestId);
                    }
                    try {
                        F41 state = F41.d;
                        G41 g41 = s03.h;
                        g41.getClass();
                        Intrinsics.checkNotNullParameter(state, "state");
                        GP1 gp3 = g41.a;
                        gp3.getClass();
                        gp3.m(null, state);
                        try {
                            C1717Ot1.a aVar2 = C1717Ot1.e;
                            c3279d22 = (C3279d22) CollectionsKt.firstOrNull(s03.I.d.b());
                            if (c3279d22 != null || (objA = c3279d22.l) == null) {
                                objA = "";
                            }
                        } catch (Throwable th) {
                            C1717Ot1.a aVar3 = C1717Ot1.e;
                            objA = C1795Pt1.a(th);
                        }
                        if (objA instanceof C1717Ot1.b) {
                            obj = objA;
                        }
                        str = (String) obj;
                        EQ eq = s03.j;
                        l12.d = s03;
                        l12.e = makeABetRequestImpl;
                        l12.g = requestId;
                        l12.h = str;
                        l12.i = 1;
                        l12.l = 6;
                        objM = eq.a(false, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        i = 1;
                        s03 = s03;
                        webSocketRequestAbstract = makeABetRequestImpl;
                        str2 = str;
                        str3 = requestId;
                        try {
                            str4 = (String) objM;
                            if (s03.f0 == EnumC4164hF1.h) {
                                str5 = "real";
                            } else {
                                str5 = "demo";
                            }
                            str6 = str5;
                            c3833fh = U0.q;
                            if (c3833fh != null) {
                                T t4 = s03.j0;
                                Intrinsics.checkNotNull(t4);
                                Double d = new Double(t4.e());
                                T t5 = s03.j0;
                                Intrinsics.checkNotNull(t5);
                                c3833fh.q(str3, str2, d, str4, t5.a().d, str6);
                            }
                            T t6 = s03.j0;
                            Intrinsics.checkNotNull(t6);
                            l12.d = s03;
                            l12.e = str3;
                            l12.g = null;
                            l12.h = null;
                            l12.i = i;
                            l12.l = 7;
                            objM = s03.v(webSocketRequestAbstract, t6, l12);
                            if (objM == mn) {
                                return mn;
                            }
                            requestId = str3;
                            s03 = s03;
                            try {
                                interfaceC2441Xr = (InterfaceC2441Xr) objM;
                                Objects.toString(s03.a0);
                                Objects.toString(interfaceC2441Xr);
                                l12.d = s03;
                                l12.e = requestId;
                                l12.g = interfaceC2441Xr;
                                l12.i = i;
                                l12.l = 8;
                                if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                                    return mn;
                                }
                                interfaceC2441Xr2 = interfaceC2441Xr;
                                s03 = s03;
                                try {
                                    Objects.toString(s03.a0);
                                    interfaceC7187vQ1 = s03.c0;
                                    if (interfaceC7187vQ1 != null) {
                                        double dDoubleValue = ((Number) s03.G.d.getValue()).doubleValue();
                                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                                        arrayList = new ArrayList();
                                        for (Object obj2 : listS) {
                                            str7 = ((JQ) obj2).f;
                                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                                            if (jq != null) {
                                                str8 = jq.f;
                                            } else {
                                                str8 = null;
                                            }
                                            if (Intrinsics.a(str7, str8)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        it = arrayList.iterator();
                                        i2 = 0;
                                        while (it.hasNext() && ((JQ) it.next()).i > 0.0d) {
                                            i2++;
                                        }
                                        C7398wQ1 c7398wQ1 = new C7398wQ1(i2, dDoubleValue);
                                        l12.d = s03;
                                        l12.e = interfaceC2441Xr2;
                                        l12.g = null;
                                        l12.l = 9;
                                        objM = interfaceC7187vQ1.b(c7398wQ1, l12);
                                        if (objM == mn) {
                                            return mn;
                                        }
                                        s05 = s03;
                                        if (((Boolean) objM).booleanValue()) {
                                            interfaceC2441Xr3 = interfaceC2441Xr2;
                                            s06 = s05;
                                        } else {
                                            interfaceC2441Xr3 = interfaceC2441Xr2;
                                            s04 = s05;
                                        }
                                        if (i3 != 0) {
                                            return Unit.a;
                                        }
                                        Objects.toString(s06.a0);
                                        if (interfaceC2441Xr3 == null) {
                                            Objects.toString(s06.a0);
                                            s06.T();
                                        } else {
                                            l12.d = s06;
                                            l12.e = null;
                                            l12.g = null;
                                            l12.l = 10;
                                            objM = s06.Y(interfaceC2441Xr3, l12);
                                            s07 = s06;
                                            if (objM == mn) {
                                                return mn;
                                            }
                                            if (((Boolean) objM).booleanValue()) {
                                                Objects.toString(s07.a0);
                                            }
                                        }
                                        return Unit.a;
                                    }
                                    interfaceC2441Xr3 = interfaceC2441Xr2;
                                    s04 = s03;
                                    i3 = 0;
                                    s06 = s04;
                                    if (i3 != 0) {
                                        return Unit.a;
                                    }
                                    Objects.toString(s06.a0);
                                    if (interfaceC2441Xr3 == null) {
                                        Objects.toString(s06.a0);
                                        s06.T();
                                    } else {
                                        l12.d = s06;
                                        l12.e = null;
                                        l12.g = null;
                                        l12.l = 10;
                                        objM = s06.Y(interfaceC2441Xr3, l12);
                                        s07 = s06;
                                        if (objM == mn) {
                                            return mn;
                                        }
                                        if (((Boolean) objM).booleanValue()) {
                                            Objects.toString(s07.a0);
                                        }
                                    }
                                    return Unit.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i3 = 0;
                                    if (i3 != 0) {
                                        c4253hh = U0.s;
                                        if (c4253hh != null) {
                                            c4253hh.invoke(null, requestId);
                                        }
                                        s12 = s03.m0;
                                        if (s12 != null) {
                                            s12.a = null;
                                        }
                                        s03.o0 = null;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i3 = i;
                                if (i3 != 0) {
                                    c4253hh = U0.s;
                                    if (c4253hh != null) {
                                        c4253hh.invoke(null, requestId);
                                    }
                                    s12 = s03.m0;
                                    if (s12 != null) {
                                        s12.a = null;
                                    }
                                    s03.o0 = null;
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i3 = i;
                            requestId = str3;
                            if (i3 != 0) {
                                c4253hh = U0.s;
                                if (c4253hh != null) {
                                    c4253hh.invoke(null, requestId);
                                }
                                s12 = s03.m0;
                                if (s12 != null) {
                                    s12.a = null;
                                }
                                s03.o0 = null;
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (i3 != 0) {
                            c4253hh = U0.s;
                            if (c4253hh != null) {
                                c4253hh.invoke(null, requestId);
                            }
                            s12 = s03.m0;
                            if (s12 != null) {
                                s12.a = null;
                            }
                            s03.o0 = null;
                        }
                        throw th;
                    }
                case 1:
                    s08 = l12.d;
                    C1795Pt1.b(objM);
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 2;
                    objM = s08.M(l12);
                    if (objM == mn) {
                        return mn;
                    }
                    if (((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    GP1 gp4 = s08.D;
                    T t7 = s08.j0;
                    Intrinsics.checkNotNull(t7);
                    gp4.setValue(t7.a());
                    GP1 gp5 = s08.z;
                    T t8 = s08.j0;
                    Intrinsics.checkNotNull(t8);
                    Integer num2 = new Integer(t8.e());
                    gp5.getClass();
                    gp5.m(null, num2);
                    l12.d = s08;
                    l12.l = 3;
                    if (s08.Z() == mn) {
                        return mn;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 4;
                    objM = s08.X(l12);
                    if (objM == mn) {
                        return mn;
                    }
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 5;
                    if (s08.a0(l12) == mn) {
                        return mn;
                    }
                    s03 = s08;
                    Objects.toString(s03.a0);
                    UV0 uv1 = s03.d;
                    T t9 = s03.j0;
                    Intrinsics.checkNotNull(t9);
                    uv1.getClass();
                    params = (I32) t9;
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str10 = params.d;
                    long j2 = params.b;
                    MakeABetRequestImpl.BetDirectionImpl.INSTANCE.getClass();
                    direction = params.a;
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    if (direction == H32.a.CALL_UP) {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.CALL_UP;
                    } else {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.PUT_DOWN;
                    }
                    MakeABetRequestImpl.BetDirectionImpl betDirectionImpl3 = betDirectionImpl;
                    MakeABetRequestImpl.AccountTypeImpl.INSTANCE.getClass();
                    if (params.c) {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.DEMO;
                    } else {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.REAL;
                    }
                    MakeABetRequestImpl.AccountTypeImpl accountTypeImpl3 = accountTypeImpl;
                    b.a aVar4 = b.e;
                    makeABetRequestImpl = new MakeABetRequestImpl(str10, j2, betDirectionImpl3, accountTypeImpl3, params.f, (int) b.r(params.e, R40.SECONDS));
                    requestId2 = makeABetRequestImpl.getRequestId();
                    obj = "";
                    if (requestId2 == null) {
                        requestId = "";
                    } else {
                        requestId = requestId2;
                    }
                    s03.o0 = requestId;
                    s13 = s03.m0;
                    if (s13 != null) {
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        s13.a = requestId;
                    }
                    s03.n0 = System.currentTimeMillis();
                    c3623eh = U0.p;
                    if (c3623eh != null) {
                        c3623eh.invoke(requestId);
                    }
                    F41 state2 = F41.d;
                    G41 g42 = s03.h;
                    g42.getClass();
                    Intrinsics.checkNotNullParameter(state2, "state");
                    GP1 gp6 = g42.a;
                    gp6.getClass();
                    gp6.m(null, state2);
                    C1717Ot1.a aVar5 = C1717Ot1.e;
                    c3279d22 = (C3279d22) CollectionsKt.firstOrNull(s03.I.d.b());
                    if (c3279d22 != null) {
                        objA = "";
                    } else {
                        objA = "";
                    }
                    if (objA instanceof C1717Ot1.b) {
                        obj = objA;
                    }
                    str = (String) obj;
                    EQ eq2 = s03.j;
                    l12.d = s03;
                    l12.e = makeABetRequestImpl;
                    l12.g = requestId;
                    l12.h = str;
                    l12.i = 1;
                    l12.l = 6;
                    objM = eq2.a(false, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    i = 1;
                    s03 = s03;
                    webSocketRequestAbstract = makeABetRequestImpl;
                    str2 = str;
                    str3 = requestId;
                    str4 = (String) objM;
                    if (s03.f0 == EnumC4164hF1.h) {
                        str5 = "real";
                    } else {
                        str5 = "demo";
                    }
                    str6 = str5;
                    c3833fh = U0.q;
                    if (c3833fh != null) {
                        T t10 = s03.j0;
                        Intrinsics.checkNotNull(t10);
                        Double d2 = new Double(t10.e());
                        T t11 = s03.j0;
                        Intrinsics.checkNotNull(t11);
                        c3833fh.q(str3, str2, d2, str4, t11.a().d, str6);
                    }
                    T t12 = s03.j0;
                    Intrinsics.checkNotNull(t12);
                    l12.d = s03;
                    l12.e = str3;
                    l12.g = null;
                    l12.h = null;
                    l12.i = i;
                    l12.l = 7;
                    objM = s03.v(webSocketRequestAbstract, t12, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    requestId = str3;
                    s03 = s03;
                    interfaceC2441Xr = (InterfaceC2441Xr) objM;
                    Objects.toString(s03.a0);
                    Objects.toString(interfaceC2441Xr);
                    l12.d = s03;
                    l12.e = requestId;
                    l12.g = interfaceC2441Xr;
                    l12.i = i;
                    l12.l = 8;
                    if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                        return mn;
                    }
                    interfaceC2441Xr2 = interfaceC2441Xr;
                    s03 = s03;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue2 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ2 = new C7398wQ1(i2, dDoubleValue2);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ2, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 2:
                    s08 = l12.d;
                    C1795Pt1.b(objM);
                    if (((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    GP1 gp7 = s08.D;
                    T t13 = s08.j0;
                    Intrinsics.checkNotNull(t13);
                    gp7.setValue(t13.a());
                    GP1 gp8 = s08.z;
                    T t14 = s08.j0;
                    Intrinsics.checkNotNull(t14);
                    Integer num3 = new Integer(t14.e());
                    gp8.getClass();
                    gp8.m(null, num3);
                    l12.d = s08;
                    l12.l = 3;
                    if (s08.Z() == mn) {
                        return mn;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 4;
                    objM = s08.X(l12);
                    if (objM == mn) {
                        return mn;
                    }
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 5;
                    if (s08.a0(l12) == mn) {
                        return mn;
                    }
                    s03 = s08;
                    Objects.toString(s03.a0);
                    UV0 uv2 = s03.d;
                    T t15 = s03.j0;
                    Intrinsics.checkNotNull(t15);
                    uv2.getClass();
                    params = (I32) t15;
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str11 = params.d;
                    long j3 = params.b;
                    MakeABetRequestImpl.BetDirectionImpl.INSTANCE.getClass();
                    direction = params.a;
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    if (direction == H32.a.CALL_UP) {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.CALL_UP;
                    } else {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.PUT_DOWN;
                    }
                    MakeABetRequestImpl.BetDirectionImpl betDirectionImpl4 = betDirectionImpl;
                    MakeABetRequestImpl.AccountTypeImpl.INSTANCE.getClass();
                    if (params.c) {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.DEMO;
                    } else {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.REAL;
                    }
                    MakeABetRequestImpl.AccountTypeImpl accountTypeImpl4 = accountTypeImpl;
                    b.a aVar6 = b.e;
                    makeABetRequestImpl = new MakeABetRequestImpl(str11, j3, betDirectionImpl4, accountTypeImpl4, params.f, (int) b.r(params.e, R40.SECONDS));
                    requestId2 = makeABetRequestImpl.getRequestId();
                    obj = "";
                    if (requestId2 == null) {
                        requestId = "";
                    } else {
                        requestId = requestId2;
                    }
                    s03.o0 = requestId;
                    s13 = s03.m0;
                    if (s13 != null) {
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        s13.a = requestId;
                    }
                    s03.n0 = System.currentTimeMillis();
                    c3623eh = U0.p;
                    if (c3623eh != null) {
                        c3623eh.invoke(requestId);
                    }
                    F41 state3 = F41.d;
                    G41 g43 = s03.h;
                    g43.getClass();
                    Intrinsics.checkNotNullParameter(state3, "state");
                    GP1 gp9 = g43.a;
                    gp9.getClass();
                    gp9.m(null, state3);
                    C1717Ot1.a aVar7 = C1717Ot1.e;
                    c3279d22 = (C3279d22) CollectionsKt.firstOrNull(s03.I.d.b());
                    if (c3279d22 != null) {
                        objA = "";
                    } else {
                        objA = "";
                    }
                    if (objA instanceof C1717Ot1.b) {
                        obj = objA;
                    }
                    str = (String) obj;
                    EQ eq3 = s03.j;
                    l12.d = s03;
                    l12.e = makeABetRequestImpl;
                    l12.g = requestId;
                    l12.h = str;
                    l12.i = 1;
                    l12.l = 6;
                    objM = eq3.a(false, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    i = 1;
                    s03 = s03;
                    webSocketRequestAbstract = makeABetRequestImpl;
                    str2 = str;
                    str3 = requestId;
                    str4 = (String) objM;
                    if (s03.f0 == EnumC4164hF1.h) {
                        str5 = "real";
                    } else {
                        str5 = "demo";
                    }
                    str6 = str5;
                    c3833fh = U0.q;
                    if (c3833fh != null) {
                        T t16 = s03.j0;
                        Intrinsics.checkNotNull(t16);
                        Double d3 = new Double(t16.e());
                        T t17 = s03.j0;
                        Intrinsics.checkNotNull(t17);
                        c3833fh.q(str3, str2, d3, str4, t17.a().d, str6);
                    }
                    T t18 = s03.j0;
                    Intrinsics.checkNotNull(t18);
                    l12.d = s03;
                    l12.e = str3;
                    l12.g = null;
                    l12.h = null;
                    l12.i = i;
                    l12.l = 7;
                    objM = s03.v(webSocketRequestAbstract, t18, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    requestId = str3;
                    s03 = s03;
                    interfaceC2441Xr = (InterfaceC2441Xr) objM;
                    Objects.toString(s03.a0);
                    Objects.toString(interfaceC2441Xr);
                    l12.d = s03;
                    l12.e = requestId;
                    l12.g = interfaceC2441Xr;
                    l12.i = i;
                    l12.l = 8;
                    if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                        return mn;
                    }
                    interfaceC2441Xr2 = interfaceC2441Xr;
                    s03 = s03;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue3 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ3 = new C7398wQ1(i2, dDoubleValue3);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ3, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 3:
                    s08 = l12.d;
                    C1795Pt1.b(objM);
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 4;
                    objM = s08.X(l12);
                    if (objM == mn) {
                        return mn;
                    }
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 5;
                    if (s08.a0(l12) == mn) {
                        return mn;
                    }
                    s03 = s08;
                    Objects.toString(s03.a0);
                    UV0 uv3 = s03.d;
                    T t19 = s03.j0;
                    Intrinsics.checkNotNull(t19);
                    uv3.getClass();
                    params = (I32) t19;
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str12 = params.d;
                    long j4 = params.b;
                    MakeABetRequestImpl.BetDirectionImpl.INSTANCE.getClass();
                    direction = params.a;
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    if (direction == H32.a.CALL_UP) {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.CALL_UP;
                    } else {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.PUT_DOWN;
                    }
                    MakeABetRequestImpl.BetDirectionImpl betDirectionImpl5 = betDirectionImpl;
                    MakeABetRequestImpl.AccountTypeImpl.INSTANCE.getClass();
                    if (params.c) {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.DEMO;
                    } else {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.REAL;
                    }
                    MakeABetRequestImpl.AccountTypeImpl accountTypeImpl5 = accountTypeImpl;
                    b.a aVar8 = b.e;
                    makeABetRequestImpl = new MakeABetRequestImpl(str12, j4, betDirectionImpl5, accountTypeImpl5, params.f, (int) b.r(params.e, R40.SECONDS));
                    requestId2 = makeABetRequestImpl.getRequestId();
                    obj = "";
                    if (requestId2 == null) {
                        requestId = "";
                    } else {
                        requestId = requestId2;
                    }
                    s03.o0 = requestId;
                    s13 = s03.m0;
                    if (s13 != null) {
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        s13.a = requestId;
                    }
                    s03.n0 = System.currentTimeMillis();
                    c3623eh = U0.p;
                    if (c3623eh != null) {
                        c3623eh.invoke(requestId);
                    }
                    F41 state4 = F41.d;
                    G41 g44 = s03.h;
                    g44.getClass();
                    Intrinsics.checkNotNullParameter(state4, "state");
                    GP1 gp10 = g44.a;
                    gp10.getClass();
                    gp10.m(null, state4);
                    C1717Ot1.a aVar9 = C1717Ot1.e;
                    c3279d22 = (C3279d22) CollectionsKt.firstOrNull(s03.I.d.b());
                    if (c3279d22 != null) {
                        objA = "";
                    } else {
                        objA = "";
                    }
                    if (objA instanceof C1717Ot1.b) {
                        obj = objA;
                    }
                    str = (String) obj;
                    EQ eq4 = s03.j;
                    l12.d = s03;
                    l12.e = makeABetRequestImpl;
                    l12.g = requestId;
                    l12.h = str;
                    l12.i = 1;
                    l12.l = 6;
                    objM = eq4.a(false, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    i = 1;
                    s03 = s03;
                    webSocketRequestAbstract = makeABetRequestImpl;
                    str2 = str;
                    str3 = requestId;
                    str4 = (String) objM;
                    if (s03.f0 == EnumC4164hF1.h) {
                        str5 = "real";
                    } else {
                        str5 = "demo";
                    }
                    str6 = str5;
                    c3833fh = U0.q;
                    if (c3833fh != null) {
                        T t110 = s03.j0;
                        Intrinsics.checkNotNull(t110);
                        Double d4 = new Double(t110.e());
                        T t111 = s03.j0;
                        Intrinsics.checkNotNull(t111);
                        c3833fh.q(str3, str2, d4, str4, t111.a().d, str6);
                    }
                    T t112 = s03.j0;
                    Intrinsics.checkNotNull(t112);
                    l12.d = s03;
                    l12.e = str3;
                    l12.g = null;
                    l12.h = null;
                    l12.i = i;
                    l12.l = 7;
                    objM = s03.v(webSocketRequestAbstract, t112, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    requestId = str3;
                    s03 = s03;
                    interfaceC2441Xr = (InterfaceC2441Xr) objM;
                    Objects.toString(s03.a0);
                    Objects.toString(interfaceC2441Xr);
                    l12.d = s03;
                    l12.e = requestId;
                    l12.g = interfaceC2441Xr;
                    l12.i = i;
                    l12.l = 8;
                    if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                        return mn;
                    }
                    interfaceC2441Xr2 = interfaceC2441Xr;
                    s03 = s03;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue4 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ4 = new C7398wQ1(i2, dDoubleValue4);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ4, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 4:
                    s08 = l12.d;
                    C1795Pt1.b(objM);
                    if (!((Boolean) objM).booleanValue()) {
                        return Unit.a;
                    }
                    Objects.toString(s08.a0);
                    l12.d = s08;
                    l12.l = 5;
                    if (s08.a0(l12) == mn) {
                        return mn;
                    }
                    s03 = s08;
                    Objects.toString(s03.a0);
                    UV0 uv4 = s03.d;
                    T t113 = s03.j0;
                    Intrinsics.checkNotNull(t113);
                    uv4.getClass();
                    params = (I32) t113;
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str13 = params.d;
                    long j5 = params.b;
                    MakeABetRequestImpl.BetDirectionImpl.INSTANCE.getClass();
                    direction = params.a;
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    if (direction == H32.a.CALL_UP) {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.CALL_UP;
                    } else {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.PUT_DOWN;
                    }
                    MakeABetRequestImpl.BetDirectionImpl betDirectionImpl6 = betDirectionImpl;
                    MakeABetRequestImpl.AccountTypeImpl.INSTANCE.getClass();
                    if (params.c) {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.DEMO;
                    } else {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.REAL;
                    }
                    MakeABetRequestImpl.AccountTypeImpl accountTypeImpl6 = accountTypeImpl;
                    b.a aVar10 = b.e;
                    makeABetRequestImpl = new MakeABetRequestImpl(str13, j5, betDirectionImpl6, accountTypeImpl6, params.f, (int) b.r(params.e, R40.SECONDS));
                    requestId2 = makeABetRequestImpl.getRequestId();
                    obj = "";
                    if (requestId2 == null) {
                        requestId = "";
                    } else {
                        requestId = requestId2;
                    }
                    s03.o0 = requestId;
                    s13 = s03.m0;
                    if (s13 != null) {
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        s13.a = requestId;
                    }
                    s03.n0 = System.currentTimeMillis();
                    c3623eh = U0.p;
                    if (c3623eh != null) {
                        c3623eh.invoke(requestId);
                    }
                    F41 state5 = F41.d;
                    G41 g45 = s03.h;
                    g45.getClass();
                    Intrinsics.checkNotNullParameter(state5, "state");
                    GP1 gp11 = g45.a;
                    gp11.getClass();
                    gp11.m(null, state5);
                    C1717Ot1.a aVar11 = C1717Ot1.e;
                    c3279d22 = (C3279d22) CollectionsKt.firstOrNull(s03.I.d.b());
                    if (c3279d22 != null) {
                        objA = "";
                    } else {
                        objA = "";
                    }
                    if (objA instanceof C1717Ot1.b) {
                        obj = objA;
                    }
                    str = (String) obj;
                    EQ eq5 = s03.j;
                    l12.d = s03;
                    l12.e = makeABetRequestImpl;
                    l12.g = requestId;
                    l12.h = str;
                    l12.i = 1;
                    l12.l = 6;
                    objM = eq5.a(false, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    i = 1;
                    s03 = s03;
                    webSocketRequestAbstract = makeABetRequestImpl;
                    str2 = str;
                    str3 = requestId;
                    str4 = (String) objM;
                    if (s03.f0 == EnumC4164hF1.h) {
                        str5 = "real";
                    } else {
                        str5 = "demo";
                    }
                    str6 = str5;
                    c3833fh = U0.q;
                    if (c3833fh != null) {
                        T t114 = s03.j0;
                        Intrinsics.checkNotNull(t114);
                        Double d5 = new Double(t114.e());
                        T t115 = s03.j0;
                        Intrinsics.checkNotNull(t115);
                        c3833fh.q(str3, str2, d5, str4, t115.a().d, str6);
                    }
                    T t116 = s03.j0;
                    Intrinsics.checkNotNull(t116);
                    l12.d = s03;
                    l12.e = str3;
                    l12.g = null;
                    l12.h = null;
                    l12.i = i;
                    l12.l = 7;
                    objM = s03.v(webSocketRequestAbstract, t116, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    requestId = str3;
                    s03 = s03;
                    interfaceC2441Xr = (InterfaceC2441Xr) objM;
                    Objects.toString(s03.a0);
                    Objects.toString(interfaceC2441Xr);
                    l12.d = s03;
                    l12.e = requestId;
                    l12.g = interfaceC2441Xr;
                    l12.i = i;
                    l12.l = 8;
                    if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                        return mn;
                    }
                    interfaceC2441Xr2 = interfaceC2441Xr;
                    s03 = s03;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue5 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ5 = new C7398wQ1(i2, dDoubleValue5);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ5, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 5:
                    s08 = l12.d;
                    C1795Pt1.b(objM);
                    s03 = s08;
                    Objects.toString(s03.a0);
                    UV0 uv5 = s03.d;
                    T t117 = s03.j0;
                    Intrinsics.checkNotNull(t117);
                    uv5.getClass();
                    params = (I32) t117;
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str14 = params.d;
                    long j6 = params.b;
                    MakeABetRequestImpl.BetDirectionImpl.INSTANCE.getClass();
                    direction = params.a;
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    if (direction == H32.a.CALL_UP) {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.CALL_UP;
                    } else {
                        betDirectionImpl = MakeABetRequestImpl.BetDirectionImpl.PUT_DOWN;
                    }
                    MakeABetRequestImpl.BetDirectionImpl betDirectionImpl7 = betDirectionImpl;
                    MakeABetRequestImpl.AccountTypeImpl.INSTANCE.getClass();
                    if (params.c) {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.DEMO;
                    } else {
                        accountTypeImpl = MakeABetRequestImpl.AccountTypeImpl.REAL;
                    }
                    MakeABetRequestImpl.AccountTypeImpl accountTypeImpl7 = accountTypeImpl;
                    b.a aVar12 = b.e;
                    makeABetRequestImpl = new MakeABetRequestImpl(str14, j6, betDirectionImpl7, accountTypeImpl7, params.f, (int) b.r(params.e, R40.SECONDS));
                    requestId2 = makeABetRequestImpl.getRequestId();
                    obj = "";
                    if (requestId2 == null) {
                        requestId = "";
                    } else {
                        requestId = requestId2;
                    }
                    s03.o0 = requestId;
                    s13 = s03.m0;
                    if (s13 != null) {
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        s13.a = requestId;
                    }
                    s03.n0 = System.currentTimeMillis();
                    c3623eh = U0.p;
                    if (c3623eh != null) {
                        c3623eh.invoke(requestId);
                    }
                    F41 state6 = F41.d;
                    G41 g46 = s03.h;
                    g46.getClass();
                    Intrinsics.checkNotNullParameter(state6, "state");
                    GP1 gp12 = g46.a;
                    gp12.getClass();
                    gp12.m(null, state6);
                    C1717Ot1.a aVar13 = C1717Ot1.e;
                    c3279d22 = (C3279d22) CollectionsKt.firstOrNull(s03.I.d.b());
                    if (c3279d22 != null) {
                        objA = "";
                    } else {
                        objA = "";
                    }
                    if (objA instanceof C1717Ot1.b) {
                        obj = objA;
                    }
                    str = (String) obj;
                    EQ eq6 = s03.j;
                    l12.d = s03;
                    l12.e = makeABetRequestImpl;
                    l12.g = requestId;
                    l12.h = str;
                    l12.i = 1;
                    l12.l = 6;
                    objM = eq6.a(false, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    i = 1;
                    s03 = s03;
                    webSocketRequestAbstract = makeABetRequestImpl;
                    str2 = str;
                    str3 = requestId;
                    str4 = (String) objM;
                    if (s03.f0 == EnumC4164hF1.h) {
                        str5 = "real";
                    } else {
                        str5 = "demo";
                    }
                    str6 = str5;
                    c3833fh = U0.q;
                    if (c3833fh != null) {
                        T t118 = s03.j0;
                        Intrinsics.checkNotNull(t118);
                        Double d6 = new Double(t118.e());
                        T t119 = s03.j0;
                        Intrinsics.checkNotNull(t119);
                        c3833fh.q(str3, str2, d6, str4, t119.a().d, str6);
                    }
                    T t1110 = s03.j0;
                    Intrinsics.checkNotNull(t1110);
                    l12.d = s03;
                    l12.e = str3;
                    l12.g = null;
                    l12.h = null;
                    l12.i = i;
                    l12.l = 7;
                    objM = s03.v(webSocketRequestAbstract, t1110, l12);
                    if (objM == mn) {
                        return mn;
                    }
                    requestId = str3;
                    s03 = s03;
                    interfaceC2441Xr = (InterfaceC2441Xr) objM;
                    Objects.toString(s03.a0);
                    Objects.toString(interfaceC2441Xr);
                    l12.d = s03;
                    l12.e = requestId;
                    l12.g = interfaceC2441Xr;
                    l12.i = i;
                    l12.l = 8;
                    if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                        return mn;
                    }
                    interfaceC2441Xr2 = interfaceC2441Xr;
                    s03 = s03;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue6 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ6 = new C7398wQ1(i2, dDoubleValue6);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ6, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 6:
                    int i6 = l12.i;
                    str = l12.h;
                    requestId = (String) l12.g;
                    WebSocketRequestAbstract webSocketRequestAbstract2 = (WebSocketRequestAbstract) l12.e;
                    S02 s09 = l12.d;
                    try {
                        C1795Pt1.b(objM);
                        webSocketRequestAbstract = webSocketRequestAbstract2;
                        s03 = s09;
                        i = i6;
                        str2 = str;
                        str3 = requestId;
                        str4 = (String) objM;
                        if (s03.f0 == EnumC4164hF1.h) {
                            str5 = "real";
                        } else {
                            str5 = "demo";
                        }
                        str6 = str5;
                        c3833fh = U0.q;
                        if (c3833fh != null) {
                            T t1111 = s03.j0;
                            Intrinsics.checkNotNull(t1111);
                            Double d7 = new Double(t1111.e());
                            T t1112 = s03.j0;
                            Intrinsics.checkNotNull(t1112);
                            c3833fh.q(str3, str2, d7, str4, t1112.a().d, str6);
                        }
                        T t1113 = s03.j0;
                        Intrinsics.checkNotNull(t1113);
                        l12.d = s03;
                        l12.e = str3;
                        l12.g = null;
                        l12.h = null;
                        l12.i = i;
                        l12.l = 7;
                        objM = s03.v(webSocketRequestAbstract, t1113, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        requestId = str3;
                        s03 = s03;
                        interfaceC2441Xr = (InterfaceC2441Xr) objM;
                        Objects.toString(s03.a0);
                        Objects.toString(interfaceC2441Xr);
                        l12.d = s03;
                        l12.e = requestId;
                        l12.g = interfaceC2441Xr;
                        l12.i = i;
                        l12.l = 8;
                        if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                            return mn;
                        }
                        interfaceC2441Xr2 = interfaceC2441Xr;
                        s03 = s03;
                        Objects.toString(s03.a0);
                        interfaceC7187vQ1 = s03.c0;
                        if (interfaceC7187vQ1 != null) {
                            double dDoubleValue7 = ((Number) s03.G.d.getValue()).doubleValue();
                            listS = CollectionsKt.S((Iterable) s03.S.getValue());
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                str7 = ((JQ) obj2).f;
                                jq = (JQ) CollectionsKt.firstOrNull(listS);
                                if (jq != null) {
                                    str8 = jq.f;
                                } else {
                                    str8 = null;
                                }
                                if (Intrinsics.a(str7, str8)) {
                                    arrayList.add(obj2);
                                }
                            }
                            it = arrayList.iterator();
                            i2 = 0;
                            while (it.hasNext()) {
                                i2++;
                            }
                            C7398wQ1 c7398wQ7 = new C7398wQ1(i2, dDoubleValue7);
                            l12.d = s03;
                            l12.e = interfaceC2441Xr2;
                            l12.g = null;
                            l12.l = 9;
                            objM = interfaceC7187vQ1.b(c7398wQ7, l12);
                            if (objM == mn) {
                                return mn;
                            }
                            s05 = s03;
                            if (((Boolean) objM).booleanValue()) {
                                interfaceC2441Xr3 = interfaceC2441Xr2;
                                s06 = s05;
                            } else {
                                interfaceC2441Xr3 = interfaceC2441Xr2;
                                s04 = s05;
                            }
                            if (i3 != 0) {
                                return Unit.a;
                            }
                            Objects.toString(s06.a0);
                            if (interfaceC2441Xr3 == null) {
                                Objects.toString(s06.a0);
                                s06.T();
                            } else {
                                l12.d = s06;
                                l12.e = null;
                                l12.g = null;
                                l12.l = 10;
                                objM = s06.Y(interfaceC2441Xr3, l12);
                                s07 = s06;
                                if (objM == mn) {
                                    return mn;
                                }
                                if (((Boolean) objM).booleanValue()) {
                                    Objects.toString(s07.a0);
                                }
                            }
                            return Unit.a;
                        }
                        interfaceC2441Xr3 = interfaceC2441Xr2;
                        s04 = s03;
                        i3 = 0;
                        s06 = s04;
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    } catch (Throwable th6) {
                        th = th6;
                        i3 = i6;
                        s03 = s09;
                        if (i3 != 0) {
                            c4253hh = U0.s;
                            if (c4253hh != null) {
                                c4253hh.invoke(null, requestId);
                            }
                            s12 = s03.m0;
                            if (s12 != null) {
                                s12.a = null;
                            }
                            s03.o0 = null;
                        }
                        throw th;
                    }
                case 7:
                    int i7 = l12.i;
                    requestId = (String) l12.e;
                    S02 s010 = l12.d;
                    C1795Pt1.b(objM);
                    i = i7;
                    s03 = s010;
                    interfaceC2441Xr = (InterfaceC2441Xr) objM;
                    Objects.toString(s03.a0);
                    Objects.toString(interfaceC2441Xr);
                    l12.d = s03;
                    l12.e = requestId;
                    l12.g = interfaceC2441Xr;
                    l12.i = i;
                    l12.l = 8;
                    if (s03.s(interfaceC2441Xr, requestId, l12) == mn) {
                        return mn;
                    }
                    interfaceC2441Xr2 = interfaceC2441Xr;
                    s03 = s03;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue8 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ8 = new C7398wQ1(i2, dDoubleValue8);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ8, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 8:
                    int i8 = l12.i;
                    interfaceC2441Xr2 = (InterfaceC2441Xr) l12.g;
                    requestId = (String) l12.e;
                    S02 s011 = l12.d;
                    C1795Pt1.b(objM);
                    s03 = s011;
                    Objects.toString(s03.a0);
                    interfaceC7187vQ1 = s03.c0;
                    if (interfaceC7187vQ1 != null) {
                        double dDoubleValue9 = ((Number) s03.G.d.getValue()).doubleValue();
                        listS = CollectionsKt.S((Iterable) s03.S.getValue());
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            str7 = ((JQ) obj2).f;
                            jq = (JQ) CollectionsKt.firstOrNull(listS);
                            if (jq != null) {
                                str8 = jq.f;
                            } else {
                                str8 = null;
                            }
                            if (Intrinsics.a(str7, str8)) {
                                arrayList.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            i2++;
                        }
                        C7398wQ1 c7398wQ9 = new C7398wQ1(i2, dDoubleValue9);
                        l12.d = s03;
                        l12.e = interfaceC2441Xr2;
                        l12.g = null;
                        l12.l = 9;
                        objM = interfaceC7187vQ1.b(c7398wQ9, l12);
                        if (objM == mn) {
                            return mn;
                        }
                        s05 = s03;
                        if (((Boolean) objM).booleanValue()) {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s06 = s05;
                        } else {
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            s04 = s05;
                        }
                        if (i3 != 0) {
                            return Unit.a;
                        }
                        Objects.toString(s06.a0);
                        if (interfaceC2441Xr3 == null) {
                            Objects.toString(s06.a0);
                            s06.T();
                        } else {
                            l12.d = s06;
                            l12.e = null;
                            l12.g = null;
                            l12.l = 10;
                            objM = s06.Y(interfaceC2441Xr3, l12);
                            s07 = s06;
                            if (objM == mn) {
                                return mn;
                            }
                            if (((Boolean) objM).booleanValue()) {
                                Objects.toString(s07.a0);
                            }
                        }
                        return Unit.a;
                    }
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    s04 = s03;
                    i3 = 0;
                    s06 = s04;
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 9:
                    interfaceC2441Xr2 = (InterfaceC2441Xr) l12.e;
                    S02 s012 = l12.d;
                    C1795Pt1.b(objM);
                    s05 = s012;
                    if (((Boolean) objM).booleanValue()) {
                        interfaceC2441Xr3 = interfaceC2441Xr2;
                        s06 = s05;
                    } else {
                        interfaceC2441Xr3 = interfaceC2441Xr2;
                        s04 = s05;
                        i3 = 0;
                        s06 = s04;
                    }
                    if (i3 != 0) {
                        return Unit.a;
                    }
                    Objects.toString(s06.a0);
                    if (interfaceC2441Xr3 == null) {
                        Objects.toString(s06.a0);
                        s06.T();
                    } else {
                        l12.d = s06;
                        l12.e = null;
                        l12.g = null;
                        l12.l = 10;
                        objM = s06.Y(interfaceC2441Xr3, l12);
                        s07 = s06;
                        if (objM == mn) {
                            return mn;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            Objects.toString(s07.a0);
                        }
                    }
                    return Unit.a;
                case 10:
                    S02 s013 = l12.d;
                    C1795Pt1.b(objM);
                    s07 = s013;
                    if (((Boolean) objM).booleanValue()) {
                        Objects.toString(s07.a0);
                    }
                    return Unit.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th7) {
            th = th7;
            i3 = i5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (defpackage.IW.b((((long) 31) - r4) * r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b0(defpackage.S02 r10, defpackage.LM r11) {
        /*
            boolean r0 = r11 instanceof defpackage.R12
            if (r0 == 0) goto L13
            r0 = r11
            R12 r0 = (defpackage.R12) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            R12 r0 = new R12
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r11)
            goto L78
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            S02 r10 = r0.d
            defpackage.C1795Pt1.b(r11)
            goto L46
        L38:
            defpackage.C1795Pt1.b(r11)
            r0.d = r10
            r0.h = r4
            java.lang.Object r11 = r10.m(r0)
            if (r11 != r1) goto L46
            goto L77
        L46:
            java.lang.Number r11 = (java.lang.Number) r11
            long r4 = r11.longValue()
            r11 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r11
            long r4 = r4 / r6
            r11 = 60
            long r8 = (long) r11
            long r4 = r4 % r8
            kotlin.ranges.IntRange r11 = defpackage.S02.u0
            int r2 = r11.d
            int r11 = r11.e
            long r8 = (long) r11
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 > 0) goto L7b
            long r8 = (long) r2
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L7b
            r10.getClass()
            r10 = 31
            long r10 = (long) r10
            long r10 = r10 - r4
            long r10 = r10 * r6
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r10 = defpackage.IW.b(r10, r0)
            if (r10 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L7b:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.b0(S02, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0145  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0192  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x021b  */
    /* JADX WARN: Code duplicated, block: B:66:0x023f A[PHI: r0 r1 r2 r5 r7 r8
      0x023f: PHI (r0v28 int) = (r0v26 int), (r0v32 int) binds: [B:64:0x023c, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r1v32 int) = (r1v29 int), (r1v35 int) binds: [B:64:0x023c, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r2v35 java.lang.Object) = (r2v34 java.lang.Object), (r2v1 java.lang.Object) binds: [B:64:0x023c, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r5v29 int) = (r5v25 int), (r5v30 int) binds: [B:64:0x023c, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r7v28 H32$a) = (r7v25 H32$a), (r7v30 H32$a) binds: [B:64:0x023c, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r8v6 S02) = (r8v4 S02), (r8v7 S02) binds: [B:64:0x023c, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0266 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static Object d(S02 s02, InterfaceC2441Xr interfaceC2441Xr, H32 h32, LM lm) {
        V02 v02;
        H32 h33;
        C3279d22 c3279d22;
        Object objA;
        InterfaceC2441Xr interfaceC2441Xr2;
        H32 h34;
        S02 s03;
        C3279d22 c3279d23;
        long j;
        H32.a aVarA;
        C3279d22 c3279d24;
        InterfaceC2441Xr interfaceC2441Xr3;
        boolean z;
        Object objC;
        H32.a aVar;
        boolean z2;
        S02 s04;
        InterfaceC2441Xr interfaceC2441Xr4;
        InterfaceC2441Xr interfaceC2441Xr5;
        H32.a aVar2;
        InterfaceC5721oR1 interfaceC5721oR1;
        Object objO;
        S02 s05;
        InterfaceC5721oR1 interfaceC5721oR2;
        int iB;
        Object objA2;
        H32.a aVar3;
        int iDoubleValue;
        Object objP;
        H32.a aVar4;
        int i;
        S02 s06;
        int i2;
        int iDoubleValue2;
        Object objI;
        S02 s07 = s02;
        InterfaceC2441Xr interfaceC2441Xr6 = interfaceC2441Xr;
        if (lm instanceof V02) {
            v02 = (V02) lm;
            int i3 = v02.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v02.q = i3 - Integer.MIN_VALUE;
            } else {
                v02 = new V02(s07, lm);
            }
        } else {
            v02 = new V02(s07, lm);
        }
        Object objC2 = v02.o;
        MN mn = MN.d;
        switch (v02.q) {
            case 0:
                C1795Pt1.b(objC2);
                if (Intrinsics.a(interfaceC2441Xr6, InterfaceC2441Xr.d.a)) {
                    int iE = h32.e();
                    H32.a aVarA2 = h32.a();
                    v02.q = 1;
                    Object objI2 = s07.i(iE, aVarA2, v02);
                    if (objI2 != mn) {
                        return objI2;
                    }
                } else {
                    W02 w02 = new W02(s07, null);
                    v02.d = s07;
                    v02.e = interfaceC2441Xr6;
                    h33 = h32;
                    v02.g = h33;
                    v02.q = 2;
                    objC2 = C7236vf0.c("current_asset_for_direction", w02, v02);
                    if (objC2 != mn) {
                        c3279d22 = (C3279d22) objC2;
                        v02.d = s07;
                        v02.e = interfaceC2441Xr6;
                        v02.g = h33;
                        v02.h = c3279d22;
                        v02.q = 3;
                        objA = s07.b.a(v02);
                        if (objA != mn) {
                            H32 h35 = h33;
                            interfaceC2441Xr2 = interfaceC2441Xr6;
                            h34 = h35;
                            s03 = s07;
                            c3279d23 = c3279d22;
                            objC2 = objA;
                            j = ((C1709Or) objC2).a;
                            aVarA = h34.a();
                            v02.d = s03;
                            v02.e = interfaceC2441Xr2;
                            v02.g = c3279d23;
                            v02.h = interfaceC2441Xr2;
                            v02.i = aVarA;
                            v02.j = j;
                            v02.q = 4;
                            objC2 = s03.b.a(v02);
                            if (objC2 != mn) {
                                c3279d24 = c3279d23;
                                interfaceC2441Xr3 = interfaceC2441Xr2;
                                z = ((C1709Or) objC2).c;
                                X02 x02 = new X02(s03, null);
                                v02.d = s03;
                                v02.e = interfaceC2441Xr3;
                                v02.g = c3279d24;
                                v02.h = interfaceC2441Xr2;
                                v02.i = aVarA;
                                v02.j = j;
                                v02.k = z;
                                v02.q = 5;
                                objC = C7236vf0.c("custom_indicators_flag", x02, v02);
                                if (objC != mn) {
                                    aVar = aVarA;
                                    z2 = z;
                                    s04 = s03;
                                    objC2 = objC;
                                    interfaceC2441Xr4 = interfaceC2441Xr3;
                                    I10 i10 = new I10(c3279d24, j, interfaceC2441Xr2, aVar, z2, ((Boolean) objC2).booleanValue(), 32);
                                    v02.d = s04;
                                    v02.e = interfaceC2441Xr4;
                                    v02.g = null;
                                    v02.h = null;
                                    v02.i = null;
                                    v02.q = 6;
                                    objC2 = s04.e(i10, v02);
                                    if (objC2 != mn) {
                                        interfaceC2441Xr5 = interfaceC2441Xr4;
                                        aVar2 = (H32.a) objC2;
                                        interfaceC5721oR1 = s04.g0;
                                        v02.d = s04;
                                        v02.e = aVar2;
                                        v02.g = interfaceC5721oR1;
                                        v02.h = interfaceC2441Xr5;
                                        v02.q = 7;
                                        objO = s04.o(v02);
                                        if (objO != mn) {
                                            s05 = s04;
                                            interfaceC5721oR2 = interfaceC5721oR1;
                                            iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                                            U22 u22 = s05.r;
                                            v02.d = s05;
                                            v02.e = aVar2;
                                            v02.g = null;
                                            v02.h = null;
                                            v02.l = iB;
                                            v02.q = 8;
                                            objA2 = u22.a(null, v02);
                                            if (objA2 != mn) {
                                                H32.a aVar5 = aVar2;
                                                objC2 = objA2;
                                                aVar3 = aVar5;
                                                iDoubleValue = (int) ((Number) objC2).doubleValue();
                                                v02.d = s05;
                                                v02.e = aVar3;
                                                v02.l = iB;
                                                v02.m = iDoubleValue;
                                                v02.q = 9;
                                                objP = s05.p(v02);
                                                if (objP != mn) {
                                                    aVar4 = aVar3;
                                                    i = iDoubleValue;
                                                    objC2 = objP;
                                                    s06 = s05;
                                                    i2 = iB;
                                                    iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                                                    U22 u23 = s06.r;
                                                    v02.d = s06;
                                                    v02.e = aVar4;
                                                    v02.l = i2;
                                                    v02.m = i;
                                                    v02.n = iDoubleValue2;
                                                    v02.q = 10;
                                                    objC2 = u23.d(v02);
                                                    if (objC2 != mn) {
                                                        int iMax = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                                                        s06.g0.a(iMax);
                                                        v02.d = null;
                                                        v02.e = null;
                                                        v02.q = 11;
                                                        objI = s06.i(iMax, aVar4, v02);
                                                        if (objI != mn) {
                                                            return objI;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 1:
                C1795Pt1.b(objC2);
                return objC2;
            case 2:
                H32 h36 = (H32) v02.g;
                interfaceC2441Xr6 = (InterfaceC2441Xr) v02.e;
                S02 s08 = v02.d;
                C1795Pt1.b(objC2);
                h33 = h36;
                s07 = s08;
                c3279d22 = (C3279d22) objC2;
                v02.d = s07;
                v02.e = interfaceC2441Xr6;
                v02.g = h33;
                v02.h = c3279d22;
                v02.q = 3;
                objA = s07.b.a(v02);
                if (objA != mn) {
                    H32 h37 = h33;
                    interfaceC2441Xr2 = interfaceC2441Xr6;
                    h34 = h37;
                    s03 = s07;
                    c3279d23 = c3279d22;
                    objC2 = objA;
                    j = ((C1709Or) objC2).a;
                    aVarA = h34.a();
                    v02.d = s03;
                    v02.e = interfaceC2441Xr2;
                    v02.g = c3279d23;
                    v02.h = interfaceC2441Xr2;
                    v02.i = aVarA;
                    v02.j = j;
                    v02.q = 4;
                    objC2 = s03.b.a(v02);
                    if (objC2 != mn) {
                        c3279d24 = c3279d23;
                        interfaceC2441Xr3 = interfaceC2441Xr2;
                        z = ((C1709Or) objC2).c;
                        X02 x03 = new X02(s03, null);
                        v02.d = s03;
                        v02.e = interfaceC2441Xr3;
                        v02.g = c3279d24;
                        v02.h = interfaceC2441Xr2;
                        v02.i = aVarA;
                        v02.j = j;
                        v02.k = z;
                        v02.q = 5;
                        objC = C7236vf0.c("custom_indicators_flag", x03, v02);
                        if (objC != mn) {
                            aVar = aVarA;
                            z2 = z;
                            s04 = s03;
                            objC2 = objC;
                            interfaceC2441Xr4 = interfaceC2441Xr3;
                            I10 i11 = new I10(c3279d24, j, interfaceC2441Xr2, aVar, z2, ((Boolean) objC2).booleanValue(), 32);
                            v02.d = s04;
                            v02.e = interfaceC2441Xr4;
                            v02.g = null;
                            v02.h = null;
                            v02.i = null;
                            v02.q = 6;
                            objC2 = s04.e(i11, v02);
                            if (objC2 != mn) {
                                interfaceC2441Xr5 = interfaceC2441Xr4;
                                aVar2 = (H32.a) objC2;
                                interfaceC5721oR1 = s04.g0;
                                v02.d = s04;
                                v02.e = aVar2;
                                v02.g = interfaceC5721oR1;
                                v02.h = interfaceC2441Xr5;
                                v02.q = 7;
                                objO = s04.o(v02);
                                if (objO != mn) {
                                    s05 = s04;
                                    interfaceC5721oR2 = interfaceC5721oR1;
                                    iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                                    U22 u24 = s05.r;
                                    v02.d = s05;
                                    v02.e = aVar2;
                                    v02.g = null;
                                    v02.h = null;
                                    v02.l = iB;
                                    v02.q = 8;
                                    objA2 = u24.a(null, v02);
                                    if (objA2 != mn) {
                                        H32.a aVar6 = aVar2;
                                        objC2 = objA2;
                                        aVar3 = aVar6;
                                        iDoubleValue = (int) ((Number) objC2).doubleValue();
                                        v02.d = s05;
                                        v02.e = aVar3;
                                        v02.l = iB;
                                        v02.m = iDoubleValue;
                                        v02.q = 9;
                                        objP = s05.p(v02);
                                        if (objP != mn) {
                                            aVar4 = aVar3;
                                            i = iDoubleValue;
                                            objC2 = objP;
                                            s06 = s05;
                                            i2 = iB;
                                            iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                                            U22 u25 = s06.r;
                                            v02.d = s06;
                                            v02.e = aVar4;
                                            v02.l = i2;
                                            v02.m = i;
                                            v02.n = iDoubleValue2;
                                            v02.q = 10;
                                            objC2 = u25.d(v02);
                                            if (objC2 != mn) {
                                                int iMax2 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                                                s06.g0.a(iMax2);
                                                v02.d = null;
                                                v02.e = null;
                                                v02.q = 11;
                                                objI = s06.i(iMax2, aVar4, v02);
                                                if (objI != mn) {
                                                    return objI;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 3:
                c3279d23 = (C3279d22) v02.h;
                h34 = (H32) v02.g;
                interfaceC2441Xr2 = (InterfaceC2441Xr) v02.e;
                S02 s09 = v02.d;
                C1795Pt1.b(objC2);
                s03 = s09;
                j = ((C1709Or) objC2).a;
                aVarA = h34.a();
                v02.d = s03;
                v02.e = interfaceC2441Xr2;
                v02.g = c3279d23;
                v02.h = interfaceC2441Xr2;
                v02.i = aVarA;
                v02.j = j;
                v02.q = 4;
                objC2 = s03.b.a(v02);
                if (objC2 != mn) {
                    c3279d24 = c3279d23;
                    interfaceC2441Xr3 = interfaceC2441Xr2;
                    z = ((C1709Or) objC2).c;
                    X02 x04 = new X02(s03, null);
                    v02.d = s03;
                    v02.e = interfaceC2441Xr3;
                    v02.g = c3279d24;
                    v02.h = interfaceC2441Xr2;
                    v02.i = aVarA;
                    v02.j = j;
                    v02.k = z;
                    v02.q = 5;
                    objC = C7236vf0.c("custom_indicators_flag", x04, v02);
                    if (objC != mn) {
                        aVar = aVarA;
                        z2 = z;
                        s04 = s03;
                        objC2 = objC;
                        interfaceC2441Xr4 = interfaceC2441Xr3;
                        I10 i12 = new I10(c3279d24, j, interfaceC2441Xr2, aVar, z2, ((Boolean) objC2).booleanValue(), 32);
                        v02.d = s04;
                        v02.e = interfaceC2441Xr4;
                        v02.g = null;
                        v02.h = null;
                        v02.i = null;
                        v02.q = 6;
                        objC2 = s04.e(i12, v02);
                        if (objC2 != mn) {
                            interfaceC2441Xr5 = interfaceC2441Xr4;
                            aVar2 = (H32.a) objC2;
                            interfaceC5721oR1 = s04.g0;
                            v02.d = s04;
                            v02.e = aVar2;
                            v02.g = interfaceC5721oR1;
                            v02.h = interfaceC2441Xr5;
                            v02.q = 7;
                            objO = s04.o(v02);
                            if (objO != mn) {
                                s05 = s04;
                                interfaceC5721oR2 = interfaceC5721oR1;
                                iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                                U22 u26 = s05.r;
                                v02.d = s05;
                                v02.e = aVar2;
                                v02.g = null;
                                v02.h = null;
                                v02.l = iB;
                                v02.q = 8;
                                objA2 = u26.a(null, v02);
                                if (objA2 != mn) {
                                    H32.a aVar7 = aVar2;
                                    objC2 = objA2;
                                    aVar3 = aVar7;
                                    iDoubleValue = (int) ((Number) objC2).doubleValue();
                                    v02.d = s05;
                                    v02.e = aVar3;
                                    v02.l = iB;
                                    v02.m = iDoubleValue;
                                    v02.q = 9;
                                    objP = s05.p(v02);
                                    if (objP != mn) {
                                        aVar4 = aVar3;
                                        i = iDoubleValue;
                                        objC2 = objP;
                                        s06 = s05;
                                        i2 = iB;
                                        iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                                        U22 u27 = s06.r;
                                        v02.d = s06;
                                        v02.e = aVar4;
                                        v02.l = i2;
                                        v02.m = i;
                                        v02.n = iDoubleValue2;
                                        v02.q = 10;
                                        objC2 = u27.d(v02);
                                        if (objC2 != mn) {
                                            int iMax3 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                                            s06.g0.a(iMax3);
                                            v02.d = null;
                                            v02.e = null;
                                            v02.q = 11;
                                            objI = s06.i(iMax3, aVar4, v02);
                                            if (objI != mn) {
                                                return objI;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 4:
                long j2 = v02.j;
                H32.a aVar8 = v02.i;
                InterfaceC2441Xr interfaceC2441Xr7 = (InterfaceC2441Xr) v02.h;
                C3279d22 c3279d25 = (C3279d22) v02.g;
                InterfaceC2441Xr interfaceC2441Xr8 = (InterfaceC2441Xr) v02.e;
                s03 = v02.d;
                C1795Pt1.b(objC2);
                aVarA = aVar8;
                interfaceC2441Xr2 = interfaceC2441Xr7;
                interfaceC2441Xr3 = interfaceC2441Xr8;
                c3279d24 = c3279d25;
                j = j2;
                z = ((C1709Or) objC2).c;
                X02 x05 = new X02(s03, null);
                v02.d = s03;
                v02.e = interfaceC2441Xr3;
                v02.g = c3279d24;
                v02.h = interfaceC2441Xr2;
                v02.i = aVarA;
                v02.j = j;
                v02.k = z;
                v02.q = 5;
                objC = C7236vf0.c("custom_indicators_flag", x05, v02);
                if (objC != mn) {
                    aVar = aVarA;
                    z2 = z;
                    s04 = s03;
                    objC2 = objC;
                    interfaceC2441Xr4 = interfaceC2441Xr3;
                    I10 i13 = new I10(c3279d24, j, interfaceC2441Xr2, aVar, z2, ((Boolean) objC2).booleanValue(), 32);
                    v02.d = s04;
                    v02.e = interfaceC2441Xr4;
                    v02.g = null;
                    v02.h = null;
                    v02.i = null;
                    v02.q = 6;
                    objC2 = s04.e(i13, v02);
                    if (objC2 != mn) {
                        interfaceC2441Xr5 = interfaceC2441Xr4;
                        aVar2 = (H32.a) objC2;
                        interfaceC5721oR1 = s04.g0;
                        v02.d = s04;
                        v02.e = aVar2;
                        v02.g = interfaceC5721oR1;
                        v02.h = interfaceC2441Xr5;
                        v02.q = 7;
                        objO = s04.o(v02);
                        if (objO != mn) {
                            s05 = s04;
                            interfaceC5721oR2 = interfaceC5721oR1;
                            iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                            U22 u28 = s05.r;
                            v02.d = s05;
                            v02.e = aVar2;
                            v02.g = null;
                            v02.h = null;
                            v02.l = iB;
                            v02.q = 8;
                            objA2 = u28.a(null, v02);
                            if (objA2 != mn) {
                                H32.a aVar9 = aVar2;
                                objC2 = objA2;
                                aVar3 = aVar9;
                                iDoubleValue = (int) ((Number) objC2).doubleValue();
                                v02.d = s05;
                                v02.e = aVar3;
                                v02.l = iB;
                                v02.m = iDoubleValue;
                                v02.q = 9;
                                objP = s05.p(v02);
                                if (objP != mn) {
                                    aVar4 = aVar3;
                                    i = iDoubleValue;
                                    objC2 = objP;
                                    s06 = s05;
                                    i2 = iB;
                                    iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                                    U22 u29 = s06.r;
                                    v02.d = s06;
                                    v02.e = aVar4;
                                    v02.l = i2;
                                    v02.m = i;
                                    v02.n = iDoubleValue2;
                                    v02.q = 10;
                                    objC2 = u29.d(v02);
                                    if (objC2 != mn) {
                                        int iMax4 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                                        s06.g0.a(iMax4);
                                        v02.d = null;
                                        v02.e = null;
                                        v02.q = 11;
                                        objI = s06.i(iMax4, aVar4, v02);
                                        if (objI != mn) {
                                            return objI;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 5:
                boolean z3 = v02.k;
                j = v02.j;
                H32.a aVar10 = v02.i;
                interfaceC2441Xr2 = (InterfaceC2441Xr) v02.h;
                c3279d24 = (C3279d22) v02.g;
                interfaceC2441Xr4 = (InterfaceC2441Xr) v02.e;
                S02 s010 = v02.d;
                C1795Pt1.b(objC2);
                z2 = z3;
                aVar = aVar10;
                s04 = s010;
                I10 i14 = new I10(c3279d24, j, interfaceC2441Xr2, aVar, z2, ((Boolean) objC2).booleanValue(), 32);
                v02.d = s04;
                v02.e = interfaceC2441Xr4;
                v02.g = null;
                v02.h = null;
                v02.i = null;
                v02.q = 6;
                objC2 = s04.e(i14, v02);
                if (objC2 != mn) {
                    interfaceC2441Xr5 = interfaceC2441Xr4;
                    aVar2 = (H32.a) objC2;
                    interfaceC5721oR1 = s04.g0;
                    v02.d = s04;
                    v02.e = aVar2;
                    v02.g = interfaceC5721oR1;
                    v02.h = interfaceC2441Xr5;
                    v02.q = 7;
                    objO = s04.o(v02);
                    if (objO != mn) {
                        s05 = s04;
                        interfaceC5721oR2 = interfaceC5721oR1;
                        iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                        U22 u210 = s05.r;
                        v02.d = s05;
                        v02.e = aVar2;
                        v02.g = null;
                        v02.h = null;
                        v02.l = iB;
                        v02.q = 8;
                        objA2 = u210.a(null, v02);
                        if (objA2 != mn) {
                            H32.a aVar11 = aVar2;
                            objC2 = objA2;
                            aVar3 = aVar11;
                            iDoubleValue = (int) ((Number) objC2).doubleValue();
                            v02.d = s05;
                            v02.e = aVar3;
                            v02.l = iB;
                            v02.m = iDoubleValue;
                            v02.q = 9;
                            objP = s05.p(v02);
                            if (objP != mn) {
                                aVar4 = aVar3;
                                i = iDoubleValue;
                                objC2 = objP;
                                s06 = s05;
                                i2 = iB;
                                iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                                U22 u211 = s06.r;
                                v02.d = s06;
                                v02.e = aVar4;
                                v02.l = i2;
                                v02.m = i;
                                v02.n = iDoubleValue2;
                                v02.q = 10;
                                objC2 = u211.d(v02);
                                if (objC2 != mn) {
                                    int iMax5 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                                    s06.g0.a(iMax5);
                                    v02.d = null;
                                    v02.e = null;
                                    v02.q = 11;
                                    objI = s06.i(iMax5, aVar4, v02);
                                    if (objI != mn) {
                                        return objI;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 6:
                interfaceC2441Xr5 = (InterfaceC2441Xr) v02.e;
                s04 = v02.d;
                C1795Pt1.b(objC2);
                aVar2 = (H32.a) objC2;
                interfaceC5721oR1 = s04.g0;
                v02.d = s04;
                v02.e = aVar2;
                v02.g = interfaceC5721oR1;
                v02.h = interfaceC2441Xr5;
                v02.q = 7;
                objO = s04.o(v02);
                if (objO != mn) {
                    s05 = s04;
                    interfaceC5721oR2 = interfaceC5721oR1;
                    iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                    U22 u212 = s05.r;
                    v02.d = s05;
                    v02.e = aVar2;
                    v02.g = null;
                    v02.h = null;
                    v02.l = iB;
                    v02.q = 8;
                    objA2 = u212.a(null, v02);
                    if (objA2 != mn) {
                        H32.a aVar12 = aVar2;
                        objC2 = objA2;
                        aVar3 = aVar12;
                        iDoubleValue = (int) ((Number) objC2).doubleValue();
                        v02.d = s05;
                        v02.e = aVar3;
                        v02.l = iB;
                        v02.m = iDoubleValue;
                        v02.q = 9;
                        objP = s05.p(v02);
                        if (objP != mn) {
                            aVar4 = aVar3;
                            i = iDoubleValue;
                            objC2 = objP;
                            s06 = s05;
                            i2 = iB;
                            iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                            U22 u213 = s06.r;
                            v02.d = s06;
                            v02.e = aVar4;
                            v02.l = i2;
                            v02.m = i;
                            v02.n = iDoubleValue2;
                            v02.q = 10;
                            objC2 = u213.d(v02);
                            if (objC2 != mn) {
                                int iMax6 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                                s06.g0.a(iMax6);
                                v02.d = null;
                                v02.e = null;
                                v02.q = 11;
                                objI = s06.i(iMax6, aVar4, v02);
                                if (objI != mn) {
                                    return objI;
                                }
                            }
                        }
                    }
                }
                return mn;
            case 7:
                interfaceC2441Xr5 = (InterfaceC2441Xr) v02.h;
                interfaceC5721oR2 = (InterfaceC5721oR1) v02.g;
                H32.a aVar13 = (H32.a) v02.e;
                S02 s011 = v02.d;
                C1795Pt1.b(objC2);
                objO = objC2;
                aVar2 = aVar13;
                s05 = s011;
                iB = interfaceC5721oR2.b(interfaceC2441Xr5, C7644xc.h((Number) objO));
                U22 u214 = s05.r;
                v02.d = s05;
                v02.e = aVar2;
                v02.g = null;
                v02.h = null;
                v02.l = iB;
                v02.q = 8;
                objA2 = u214.a(null, v02);
                if (objA2 != mn) {
                    H32.a aVar14 = aVar2;
                    objC2 = objA2;
                    aVar3 = aVar14;
                    iDoubleValue = (int) ((Number) objC2).doubleValue();
                    v02.d = s05;
                    v02.e = aVar3;
                    v02.l = iB;
                    v02.m = iDoubleValue;
                    v02.q = 9;
                    objP = s05.p(v02);
                    if (objP != mn) {
                        aVar4 = aVar3;
                        i = iDoubleValue;
                        objC2 = objP;
                        s06 = s05;
                        i2 = iB;
                        iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                        U22 u215 = s06.r;
                        v02.d = s06;
                        v02.e = aVar4;
                        v02.l = i2;
                        v02.m = i;
                        v02.n = iDoubleValue2;
                        v02.q = 10;
                        objC2 = u215.d(v02);
                        if (objC2 != mn) {
                            int iMax7 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                            s06.g0.a(iMax7);
                            v02.d = null;
                            v02.e = null;
                            v02.q = 11;
                            objI = s06.i(iMax7, aVar4, v02);
                            if (objI != mn) {
                                return objI;
                            }
                        }
                    }
                }
                return mn;
            case 8:
                iB = v02.l;
                aVar3 = (H32.a) v02.e;
                s05 = v02.d;
                C1795Pt1.b(objC2);
                iDoubleValue = (int) ((Number) objC2).doubleValue();
                v02.d = s05;
                v02.e = aVar3;
                v02.l = iB;
                v02.m = iDoubleValue;
                v02.q = 9;
                objP = s05.p(v02);
                if (objP != mn) {
                    aVar4 = aVar3;
                    i = iDoubleValue;
                    objC2 = objP;
                    s06 = s05;
                    i2 = iB;
                    iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                    U22 u216 = s06.r;
                    v02.d = s06;
                    v02.e = aVar4;
                    v02.l = i2;
                    v02.m = i;
                    v02.n = iDoubleValue2;
                    v02.q = 10;
                    objC2 = u216.d(v02);
                    if (objC2 != mn) {
                        int iMax8 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                        s06.g0.a(iMax8);
                        v02.d = null;
                        v02.e = null;
                        v02.q = 11;
                        objI = s06.i(iMax8, aVar4, v02);
                        if (objI != mn) {
                            return objI;
                        }
                    }
                }
                return mn;
            case 9:
                int i4 = v02.m;
                int i5 = v02.l;
                H32.a aVar15 = (H32.a) v02.e;
                S02 s012 = v02.d;
                C1795Pt1.b(objC2);
                s06 = s012;
                aVar4 = aVar15;
                i2 = i5;
                i = i4;
                iDoubleValue2 = (int) ((Number) objC2).doubleValue();
                U22 u217 = s06.r;
                v02.d = s06;
                v02.e = aVar4;
                v02.l = i2;
                v02.m = i;
                v02.n = iDoubleValue2;
                v02.q = 10;
                objC2 = u217.d(v02);
                if (objC2 != mn) {
                    int iMax9 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                    s06.g0.a(iMax9);
                    v02.d = null;
                    v02.e = null;
                    v02.q = 11;
                    objI = s06.i(iMax9, aVar4, v02);
                    if (objI != mn) {
                        return objI;
                    }
                }
                return mn;
            case 10:
                iDoubleValue2 = v02.n;
                i = v02.m;
                i2 = v02.l;
                aVar4 = (H32.a) v02.e;
                s06 = v02.d;
                C1795Pt1.b(objC2);
                int iMax10 = Math.max(i, Math.min(iDoubleValue2, Math.min((int) ((Number) objC2).doubleValue(), i2)));
                s06.g0.a(iMax10);
                v02.d = null;
                v02.e = null;
                v02.q = 11;
                objI = s06.i(iMax10, aVar4, v02);
                if (objI != mn) {
                    return mn;
                }
                return objI;
            case 11:
                C1795Pt1.b(objC2);
                return objC2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final MN B(C0790Cx0 c0790Cx0, LM lm) {
        C6684t12 c6684t12;
        S02<T> s02;
        if (lm instanceof C6684t12) {
            c6684t12 = (C6684t12) lm;
            int i = c6684t12.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6684t12.i = i - Integer.MIN_VALUE;
            } else {
                c6684t12 = new C6684t12(this, lm);
            }
        } else {
            c6684t12 = new C6684t12(this, lm);
        }
        Object obj = c6684t12.g;
        MN mn = MN.d;
        int i2 = c6684t12.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2936bP1 c2936bP1 = this.Z;
            if (c2936bP1 != null) {
                c2936bP1.l(null);
            }
            c6684t12.d = this;
            c6684t12.e = c0790Cx0;
            c6684t12.i = 1;
            if (F(c6684t12) != mn) {
                s02 = this;
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return null;
        }
        c0790Cx0 = c6684t12.e;
        s02 = c6684t12.d;
        C1795Pt1.b(obj);
        C4462ih c4462ih = U0.t;
        if (c4462ih != null) {
            String str = s02.o0;
            if (str == null) {
                str = "";
            }
            c4462ih.invoke(c0790Cx0, str);
        }
        s02.N(c0790Cx0);
        c6684t12.d = null;
        c6684t12.e = null;
        c6684t12.i = 2;
        if (s02.U(c0790Cx0, null, c6684t12) == mn) {
            return mn;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final MN C(C0868Dx0 c0868Dx0, LM lm) {
        C6894u12 c6894u12;
        S02<T> s02;
        if (lm instanceof C6894u12) {
            c6894u12 = (C6894u12) lm;
            int i = c6894u12.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6894u12.i = i - Integer.MIN_VALUE;
            } else {
                c6894u12 = new C6894u12(this, lm);
            }
        } else {
            c6894u12 = new C6894u12(this, lm);
        }
        Object obj = c6894u12.g;
        MN mn = MN.d;
        int i2 = c6894u12.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2936bP1 c2936bP1 = this.Z;
            if (c2936bP1 != null) {
                c2936bP1.l(null);
            }
            c6894u12.d = this;
            c6894u12.e = c0868Dx0;
            c6894u12.i = 1;
            if (F(c6894u12) != mn) {
                s02 = this;
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return null;
        }
        c0868Dx0 = c6894u12.e;
        s02 = c6894u12.d;
        C1795Pt1.b(obj);
        C4462ih c4462ih = U0.t;
        if (c4462ih != null) {
            String str = s02.o0;
            if (str == null) {
                str = "";
            }
            c4462ih.invoke(c0868Dx0, str);
        }
        s02.N(c0868Dx0);
        c6894u12.d = null;
        c6894u12.e = null;
        c6894u12.i = 2;
        if (s02.U(c0868Dx0, null, c6894u12) == mn) {
            return mn;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(C1271Jb1 c1271Jb1, LM lm) {
        C7104v12 c7104v12;
        S02<T> s02;
        if (lm instanceof C7104v12) {
            c7104v12 = (C7104v12) lm;
            int i = c7104v12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7104v12.h = i - Integer.MIN_VALUE;
            } else {
                c7104v12 = new C7104v12(this, lm);
            }
        } else {
            c7104v12 = new C7104v12(this, lm);
        }
        Object obj = c7104v12.e;
        MN mn = MN.d;
        int i2 = c7104v12.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            if (this.X > 3) {
                c7104v12.h = 1;
                if (z(c1271Jb1, "pair_unavailable_after_max_retries", c7104v12) != mn) {
                    return null;
                }
            } else {
                c7104v12.d = this;
                c7104v12.h = 2;
                if (k(c7104v12) != mn) {
                    s02 = this;
                }
            }
            return mn;
        }
        if (i2 == 1) {
            C1795Pt1.b(obj);
            return null;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s02 = c7104v12.d;
        C1795Pt1.b(obj);
        s02.X++;
        return InterfaceC2441Xr.d.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(NJ1 nj1, LM lm) {
        C7314w12 c7314w12;
        S02<T> s02;
        if (lm instanceof C7314w12) {
            c7314w12 = (C7314w12) lm;
            int i = c7314w12.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7314w12.i = i - Integer.MIN_VALUE;
            } else {
                c7314w12 = new C7314w12(this, lm);
            }
        } else {
            c7314w12 = new C7314w12(this, lm);
        }
        Object objD = c7314w12.g;
        MN mn = MN.d;
        int i2 = c7314w12.i;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            nj1.getClass();
            c7314w12.d = this;
            c7314w12.e = nj1;
            c7314w12.i = 1;
            objD = D(null, c7314w12);
            if (objD != mn) {
                s02 = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C1795Pt1.b(objD);
                return objD;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S02 s03 = c7314w12.d;
            C1795Pt1.b(objD);
            s03.T();
            return Boolean.FALSE;
        }
        nj1 = c7314w12.e;
        s02 = c7314w12.d;
        C1795Pt1.b(objD);
        InterfaceC2441Xr.d dVar = InterfaceC2441Xr.d.a;
        if (!Intrinsics.a(objD, dVar)) {
            nj1.getClass();
            L(s02, null, null, 6);
            throw null;
        }
        c7314w12.d = null;
        c7314w12.e = null;
        c7314w12.i = 2;
        Object objY = s02.Y(dVar, c7314w12);
        return objY == mn ? mn : objY;
    }

    @Nullable
    public Object F(@NotNull LM lm) {
        return Unit.a;
    }

    @Nullable
    public abstract Unit G();

    @Nullable
    public final Object H(@NotNull Z22 z22, @NotNull LM lm) throws Throwable {
        Object objA = this.L.a(z22, lm);
        return objA == MN.d ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(long j, LM lm) {
        A12 a12;
        Object objA;
        C1910Rg c1910Rg;
        if (lm instanceof A12) {
            a12 = (A12) lm;
            int i = a12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                a12.h = i - Integer.MIN_VALUE;
            } else {
                a12 = new A12(this, lm);
            }
        } else {
            a12 = new A12(this, lm);
        }
        Object obj = a12.e;
        MN mn = MN.d;
        int i2 = a12.h;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                C1717Ot1.a aVar = C1717Ot1.e;
                U7 u7 = this.l;
                a12.d = j;
                a12.h = 1;
                if (u7.a(j, a12) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = a12.d;
                C1795Pt1.b(obj);
            }
            objA = Unit.a;
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null && (c1910Rg = U0.v) != null) {
            c1910Rg.invoke(thA, PW0.e(new Pair("phase", "bet_id_backend"), new Pair("bet_id", new Long(j))));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:102:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0205  */
    /* JADX WARN: Code duplicated, block: B:54:0x0208  */
    /* JADX WARN: Code duplicated, block: B:58:0x022d  */
    /* JADX WARN: Code duplicated, block: B:66:0x024d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0279  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0342  */
    /* JADX WARN: Code duplicated, block: B:85:0x0377  */
    /* JADX WARN: Code duplicated, block: B:86:0x037a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0380  */
    /* JADX WARN: Code duplicated, block: B:90:0x038d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0392  */
    /* JADX WARN: Code duplicated, block: B:94:0x0395  */
    /* JADX WARN: Code duplicated, block: B:96:0x0398  */
    /* JADX WARN: Code duplicated, block: B:97:0x039d  */
    /* JADX WARN: Code duplicated, block: B:99:0x03a0  */
    public final Object J(C0849Dr c0849Dr, LM lm) {
        B12 b12;
        double dDoubleValue;
        S02<T> s02;
        EventBetRequest.BetType betType;
        Double d;
        InterfaceC2441Xr interfaceC2441Xr;
        EventBetRequest.Properties.BetResult betResult;
        String strB;
        JQ jq;
        String str;
        String strValueOf;
        Object objO;
        S02<T> s03;
        EventBetRequest.BetType betType2;
        Double d2;
        String str2;
        C0849Dr c0849Dr2;
        String strB2;
        Object objA;
        String str3;
        Q10 q10;
        Double d3;
        Object objB;
        EventBetRequest.BetType betType3;
        String str4;
        String str5;
        S02<T> s04;
        String str6;
        Q10 q11;
        Double d4;
        String str7;
        Double d5;
        S02<T> s05;
        Object objB2;
        Double d6;
        EventBetRequest.BetType betType4;
        S02<T> s06;
        Double d7;
        MN mn;
        double d8;
        double d9;
        Double d10;
        S02<T> s07;
        Object objB3;
        Double d11;
        Double d12;
        String technicalIndicator;
        MN mn2;
        Q10 q12;
        String startDealId;
        double d13;
        S02<T> s08;
        Object obj;
        Double d14;
        Double d15;
        double d16;
        Double d17;
        Double d18;
        Q10 q13;
        Object objA2;
        MN mn3;
        EventBetRequest.BetType betType5;
        String tradingStrategy;
        String result;
        Double d19;
        Double d20;
        Q10 directionSource;
        Double d21;
        double d22;
        Double d23;
        String currency;
        boolean z;
        Integer numValueOf;
        Boolean bool;
        String string;
        String strZ;
        String strZ2;
        String strZ3;
        String str8;
        String str9;
        C0849Dr c0849Dr3 = c0849Dr;
        if (lm instanceof B12) {
            b12 = (B12) lm;
            int i = b12.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                b12.u = i - Integer.MIN_VALUE;
            } else {
                b12 = new B12(this, lm);
            }
        } else {
            b12 = new B12(this, lm);
        }
        Object obj2 = b12.s;
        MN mn4 = MN.d;
        String str10 = "";
        switch (b12.u) {
            case 0:
                C1795Pt1.b(obj2);
                EventBetRequest.BetType betType6 = ((EnumC4164hF1) this.i.l().d.getValue()) == EnumC4164hF1.h ? EventBetRequest.BetType.REAL : EventBetRequest.BetType.DEMO;
                Double d24 = this.i0;
                dDoubleValue = d24 != null ? d24.doubleValue() : 0.0d;
                InterfaceC2441Xr interfaceC2441Xr2 = c0849Dr3.b;
                boolean z2 = interfaceC2441Xr2 instanceof InterfaceC2441Xr.e;
                double d25 = c0849Dr3.c;
                if (z2) {
                    dDoubleValue += d25;
                } else if (interfaceC2441Xr2 instanceof InterfaceC2441Xr.b) {
                    dDoubleValue -= Math.abs(d25);
                }
                T t = this.j0;
                Intrinsics.checkNotNull(t);
                Double d26 = new Double(t.e());
                b12.d = this;
                b12.e = c0849Dr3;
                b12.g = betType6;
                b12.q = dDoubleValue;
                b12.u = 1;
                Object objB4 = this.m.b(d26, b12);
                if (objB4 != mn4) {
                    s02 = this;
                    betType = betType6;
                    obj2 = objB4;
                    d = (Double) obj2;
                    interfaceC2441Xr = c0849Dr3.b;
                    s02.getClass();
                    if (Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.a.a)) {
                        betResult = EventBetRequest.Properties.BetResult.STANDOFF;
                    } else if (interfaceC2441Xr instanceof InterfaceC2441Xr.b) {
                        betResult = EventBetRequest.Properties.BetResult.LOSE;
                    } else if (!Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.c.a) || Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.d.a)) {
                        betResult = EventBetRequest.Properties.BetResult.STANDOFF;
                    } else {
                        if (interfaceC2441Xr instanceof InterfaceC2441Xr.e) {
                            throw new C6489s51();
                        }
                        betResult = EventBetRequest.Properties.BetResult.WIN;
                    }
                    strB = betResult.getValue();
                    jq = (JQ) s02.Q.d.getValue();
                    if (jq != null) {
                        str = jq.f;
                    } else {
                        str = null;
                    }
                    strValueOf = String.valueOf(str);
                    b12.d = s02;
                    b12.e = c0849Dr3;
                    b12.g = betType;
                    b12.h = d;
                    b12.i = strB;
                    b12.j = strValueOf;
                    b12.q = dDoubleValue;
                    b12.u = 2;
                    objO = C4466ii.o(s02.p.c.k(), b12);
                    if (objO != mn4) {
                        s03 = s02;
                        betType2 = betType;
                        d2 = d;
                        str2 = strB;
                        obj2 = objO;
                        c0849Dr2 = c0849Dr3;
                        strB2 = ((EnumC2644a42) obj2).b();
                        try {
                            C1717Ot1.a aVar = C1717Ot1.e;
                            objA = s03.h0.a();
                        } catch (Throwable th) {
                            C1717Ot1.a aVar2 = C1717Ot1.e;
                            objA = C1795Pt1.a(th);
                        }
                        if (objA instanceof C1717Ot1.b) {
                            objA = "";
                        }
                        str3 = (String) objA;
                        q10 = s03.k0;
                        d3 = s03.i0;
                        b12.d = s03;
                        b12.e = c0849Dr2;
                        b12.g = betType2;
                        b12.h = d2;
                        b12.i = str2;
                        b12.j = strValueOf;
                        b12.k = strB2;
                        b12.l = str3;
                        b12.m = q10;
                        b12.n = d3;
                        b12.q = dDoubleValue;
                        b12.u = 3;
                        objB = s03.m.b(d3, b12);
                        if (objB != mn4) {
                            betType3 = betType2;
                            str4 = strValueOf;
                            str5 = strB2;
                            obj2 = objB;
                            s04 = s03;
                            str6 = str2;
                            q11 = q10;
                            d4 = d2;
                            str7 = str3;
                            d5 = (Double) obj2;
                            OM om = s04.m;
                            Double d27 = new Double(dDoubleValue);
                            b12.d = s04;
                            b12.e = c0849Dr2;
                            b12.g = betType3;
                            b12.h = d4;
                            b12.i = str6;
                            b12.j = str4;
                            b12.k = str5;
                            b12.l = str7;
                            b12.m = q11;
                            b12.n = d3;
                            b12.o = d5;
                            b12.q = dDoubleValue;
                            s05 = s04;
                            b12.u = 4;
                            objB2 = om.b(d27, b12);
                            mn4 = mn4;
                            if (objB2 != mn4) {
                                obj2 = objB2;
                                d6 = d5;
                                betType4 = betType3;
                                s06 = s05;
                                d7 = (Double) obj2;
                                mn = mn4;
                                d8 = dDoubleValue;
                                d9 = c0849Dr2.c;
                                OM om2 = s06.m;
                                Double d28 = new Double(d9);
                                b12.d = s06;
                                b12.e = betType4;
                                b12.g = d4;
                                b12.h = str6;
                                b12.i = str4;
                                b12.j = str5;
                                b12.k = str7;
                                b12.l = q11;
                                b12.m = d3;
                                b12.n = d6;
                                b12.o = d7;
                                d10 = d6;
                                s07 = s06;
                                b12.q = d8;
                                b12.r = d9;
                                b12.u = 5;
                                objB3 = om2.b(d28, b12);
                                if (objB3 == mn) {
                                    return mn;
                                }
                                String str11 = str7;
                                d11 = d7;
                                d12 = d3;
                                technicalIndicator = str11;
                                mn2 = mn;
                                q12 = q11;
                                startDealId = str4;
                                d13 = d8;
                                s08 = s07;
                                obj = objB3;
                                d14 = d4;
                                d15 = d10;
                                d16 = d9;
                                d17 = (Double) obj;
                                EQ eq = s08.j;
                                b12.d = s08;
                                b12.e = betType4;
                                b12.g = d14;
                                b12.h = str6;
                                b12.i = startDealId;
                                b12.j = str5;
                                b12.k = technicalIndicator;
                                b12.l = q12;
                                b12.m = d12;
                                b12.n = d15;
                                b12.o = d11;
                                b12.p = d17;
                                b12.q = d13;
                                d18 = d14;
                                q13 = q12;
                                b12.r = d16;
                                b12.u = 6;
                                objA2 = eq.a(false, b12);
                                mn3 = mn2;
                                if (objA2 == mn3) {
                                    return mn3;
                                }
                                betType5 = betType4;
                                tradingStrategy = str5;
                                result = str6;
                                d19 = d12;
                                obj2 = objA2;
                                d20 = d18;
                                Double d29 = d15;
                                directionSource = q13;
                                double d30 = d13;
                                d21 = d11;
                                d22 = d30;
                                d23 = d29;
                                currency = (String) obj2;
                                Intrinsics.checkNotNullParameter(result, "result");
                                Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                                Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                                Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                                Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                                Intrinsics.checkNotNullParameter(currency, "currency");
                                if (d20 == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (d20 != null) {
                                    numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                                } else {
                                    numValueOf = null;
                                }
                                String str12 = directionSource.d;
                                if (z) {
                                    bool = Boolean.TRUE;
                                } else {
                                    bool = null;
                                }
                                if (d19 != null) {
                                    string = d19.toString();
                                } else {
                                    string = null;
                                }
                                if (string == null) {
                                    string = str10;
                                }
                                if (z) {
                                    strZ = str10;
                                } else {
                                    strZ = C0564Aa.z(d23);
                                }
                                String strValueOf2 = String.valueOf(d22);
                                if (z) {
                                    strZ2 = str10;
                                } else {
                                    strZ2 = C0564Aa.z(d21);
                                }
                                String strValueOf3 = String.valueOf(d16);
                                if (z) {
                                    str9 = strZ;
                                    str8 = currency;
                                    strZ3 = str10;
                                } else {
                                    strZ3 = C0564Aa.z(d17);
                                    str8 = currency;
                                    str9 = strZ;
                                }
                                s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str12, bool, string, str9, strValueOf2, strZ2, strValueOf3, strZ3, str8))), false);
                                return Unit.a;
                            }
                        }
                    }
                    break;
                }
                return mn4;
            case 1:
                dDoubleValue = b12.q;
                EventBetRequest.BetType betType7 = (EventBetRequest.BetType) b12.g;
                C0849Dr c0849Dr4 = (C0849Dr) b12.e;
                S02<T> s09 = b12.d;
                C1795Pt1.b(obj2);
                betType = betType7;
                c0849Dr3 = c0849Dr4;
                s02 = s09;
                d = (Double) obj2;
                interfaceC2441Xr = c0849Dr3.b;
                s02.getClass();
                if (Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.a.a)) {
                    betResult = EventBetRequest.Properties.BetResult.STANDOFF;
                } else if (interfaceC2441Xr instanceof InterfaceC2441Xr.b) {
                    betResult = EventBetRequest.Properties.BetResult.LOSE;
                } else if (!Intrinsics.a(interfaceC2441Xr, InterfaceC2441Xr.c.a)) {
                    betResult = EventBetRequest.Properties.BetResult.STANDOFF;
                } else {
                    if (interfaceC2441Xr instanceof InterfaceC2441Xr.e) {
                        throw new C6489s51();
                    }
                    betResult = EventBetRequest.Properties.BetResult.WIN;
                }
                strB = betResult.getValue();
                jq = (JQ) s02.Q.d.getValue();
                if (jq != null) {
                    str = jq.f;
                } else {
                    str = null;
                }
                strValueOf = String.valueOf(str);
                b12.d = s02;
                b12.e = c0849Dr3;
                b12.g = betType;
                b12.h = d;
                b12.i = strB;
                b12.j = strValueOf;
                b12.q = dDoubleValue;
                b12.u = 2;
                objO = C4466ii.o(s02.p.c.k(), b12);
                if (objO != mn4) {
                    s03 = s02;
                    betType2 = betType;
                    d2 = d;
                    str2 = strB;
                    obj2 = objO;
                    c0849Dr2 = c0849Dr3;
                    strB2 = ((EnumC2644a42) obj2).b();
                    C1717Ot1.a aVar3 = C1717Ot1.e;
                    objA = s03.h0.a();
                    if (objA instanceof C1717Ot1.b) {
                        objA = "";
                    }
                    str3 = (String) objA;
                    q10 = s03.k0;
                    d3 = s03.i0;
                    b12.d = s03;
                    b12.e = c0849Dr2;
                    b12.g = betType2;
                    b12.h = d2;
                    b12.i = str2;
                    b12.j = strValueOf;
                    b12.k = strB2;
                    b12.l = str3;
                    b12.m = q10;
                    b12.n = d3;
                    b12.q = dDoubleValue;
                    b12.u = 3;
                    objB = s03.m.b(d3, b12);
                    if (objB != mn4) {
                        betType3 = betType2;
                        str4 = strValueOf;
                        str5 = strB2;
                        obj2 = objB;
                        s04 = s03;
                        str6 = str2;
                        q11 = q10;
                        d4 = d2;
                        str7 = str3;
                        d5 = (Double) obj2;
                        OM om3 = s04.m;
                        Double d210 = new Double(dDoubleValue);
                        b12.d = s04;
                        b12.e = c0849Dr2;
                        b12.g = betType3;
                        b12.h = d4;
                        b12.i = str6;
                        b12.j = str4;
                        b12.k = str5;
                        b12.l = str7;
                        b12.m = q11;
                        b12.n = d3;
                        b12.o = d5;
                        b12.q = dDoubleValue;
                        s05 = s04;
                        b12.u = 4;
                        objB2 = om3.b(d210, b12);
                        mn4 = mn4;
                        if (objB2 != mn4) {
                            obj2 = objB2;
                            d6 = d5;
                            betType4 = betType3;
                            s06 = s05;
                            d7 = (Double) obj2;
                            mn = mn4;
                            d8 = dDoubleValue;
                            d9 = c0849Dr2.c;
                            OM om4 = s06.m;
                            Double d211 = new Double(d9);
                            b12.d = s06;
                            b12.e = betType4;
                            b12.g = d4;
                            b12.h = str6;
                            b12.i = str4;
                            b12.j = str5;
                            b12.k = str7;
                            b12.l = q11;
                            b12.m = d3;
                            b12.n = d6;
                            b12.o = d7;
                            d10 = d6;
                            s07 = s06;
                            b12.q = d8;
                            b12.r = d9;
                            b12.u = 5;
                            objB3 = om4.b(d211, b12);
                            if (objB3 == mn) {
                                return mn;
                            }
                            String str13 = str7;
                            d11 = d7;
                            d12 = d3;
                            technicalIndicator = str13;
                            mn2 = mn;
                            q12 = q11;
                            startDealId = str4;
                            d13 = d8;
                            s08 = s07;
                            obj = objB3;
                            d14 = d4;
                            d15 = d10;
                            d16 = d9;
                            d17 = (Double) obj;
                            EQ eq2 = s08.j;
                            b12.d = s08;
                            b12.e = betType4;
                            b12.g = d14;
                            b12.h = str6;
                            b12.i = startDealId;
                            b12.j = str5;
                            b12.k = technicalIndicator;
                            b12.l = q12;
                            b12.m = d12;
                            b12.n = d15;
                            b12.o = d11;
                            b12.p = d17;
                            b12.q = d13;
                            d18 = d14;
                            q13 = q12;
                            b12.r = d16;
                            b12.u = 6;
                            objA2 = eq2.a(false, b12);
                            mn3 = mn2;
                            if (objA2 == mn3) {
                                return mn3;
                            }
                            betType5 = betType4;
                            tradingStrategy = str5;
                            result = str6;
                            d19 = d12;
                            obj2 = objA2;
                            d20 = d18;
                            Double d212 = d15;
                            directionSource = q13;
                            double d31 = d13;
                            d21 = d11;
                            d22 = d31;
                            d23 = d212;
                            currency = (String) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                            Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                            Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                            Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            if (d20 == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d20 != null) {
                                numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                            } else {
                                numValueOf = null;
                            }
                            String str14 = directionSource.d;
                            if (z) {
                                bool = Boolean.TRUE;
                            } else {
                                bool = null;
                            }
                            if (d19 != null) {
                                string = d19.toString();
                            } else {
                                string = null;
                            }
                            if (string == null) {
                                string = str10;
                            }
                            if (z) {
                                strZ = str10;
                            } else {
                                strZ = C0564Aa.z(d23);
                            }
                            String strValueOf4 = String.valueOf(d22);
                            if (z) {
                                strZ2 = str10;
                            } else {
                                strZ2 = C0564Aa.z(d21);
                            }
                            String strValueOf5 = String.valueOf(d16);
                            if (z) {
                                str9 = strZ;
                                str8 = currency;
                                strZ3 = str10;
                            } else {
                                strZ3 = C0564Aa.z(d17);
                                str8 = currency;
                                str9 = strZ;
                            }
                            s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str14, bool, string, str9, strValueOf4, strZ2, strValueOf5, strZ3, str8))), false);
                            return Unit.a;
                        }
                    }
                }
                return mn4;
            case 2:
                dDoubleValue = b12.q;
                String str15 = b12.j;
                String str16 = b12.i;
                Double d32 = (Double) b12.h;
                EventBetRequest.BetType betType8 = (EventBetRequest.BetType) b12.g;
                C0849Dr c0849Dr5 = (C0849Dr) b12.e;
                S02<T> s010 = b12.d;
                C1795Pt1.b(obj2);
                c0849Dr2 = c0849Dr5;
                s03 = s010;
                strValueOf = str15;
                betType2 = betType8;
                d2 = d32;
                str2 = str16;
                strB2 = ((EnumC2644a42) obj2).b();
                C1717Ot1.a aVar4 = C1717Ot1.e;
                objA = s03.h0.a();
                if (objA instanceof C1717Ot1.b) {
                    objA = "";
                }
                str3 = (String) objA;
                q10 = s03.k0;
                d3 = s03.i0;
                b12.d = s03;
                b12.e = c0849Dr2;
                b12.g = betType2;
                b12.h = d2;
                b12.i = str2;
                b12.j = strValueOf;
                b12.k = strB2;
                b12.l = str3;
                b12.m = q10;
                b12.n = d3;
                b12.q = dDoubleValue;
                b12.u = 3;
                objB = s03.m.b(d3, b12);
                if (objB != mn4) {
                    betType3 = betType2;
                    str4 = strValueOf;
                    str5 = strB2;
                    obj2 = objB;
                    s04 = s03;
                    str6 = str2;
                    q11 = q10;
                    d4 = d2;
                    str7 = str3;
                    d5 = (Double) obj2;
                    OM om5 = s04.m;
                    Double d213 = new Double(dDoubleValue);
                    b12.d = s04;
                    b12.e = c0849Dr2;
                    b12.g = betType3;
                    b12.h = d4;
                    b12.i = str6;
                    b12.j = str4;
                    b12.k = str5;
                    b12.l = str7;
                    b12.m = q11;
                    b12.n = d3;
                    b12.o = d5;
                    b12.q = dDoubleValue;
                    s05 = s04;
                    b12.u = 4;
                    objB2 = om5.b(d213, b12);
                    mn4 = mn4;
                    if (objB2 != mn4) {
                        obj2 = objB2;
                        d6 = d5;
                        betType4 = betType3;
                        s06 = s05;
                        d7 = (Double) obj2;
                        mn = mn4;
                        d8 = dDoubleValue;
                        d9 = c0849Dr2.c;
                        OM om6 = s06.m;
                        Double d214 = new Double(d9);
                        b12.d = s06;
                        b12.e = betType4;
                        b12.g = d4;
                        b12.h = str6;
                        b12.i = str4;
                        b12.j = str5;
                        b12.k = str7;
                        b12.l = q11;
                        b12.m = d3;
                        b12.n = d6;
                        b12.o = d7;
                        d10 = d6;
                        s07 = s06;
                        b12.q = d8;
                        b12.r = d9;
                        b12.u = 5;
                        objB3 = om6.b(d214, b12);
                        if (objB3 == mn) {
                            return mn;
                        }
                        String str17 = str7;
                        d11 = d7;
                        d12 = d3;
                        technicalIndicator = str17;
                        mn2 = mn;
                        q12 = q11;
                        startDealId = str4;
                        d13 = d8;
                        s08 = s07;
                        obj = objB3;
                        d14 = d4;
                        d15 = d10;
                        d16 = d9;
                        d17 = (Double) obj;
                        EQ eq3 = s08.j;
                        b12.d = s08;
                        b12.e = betType4;
                        b12.g = d14;
                        b12.h = str6;
                        b12.i = startDealId;
                        b12.j = str5;
                        b12.k = technicalIndicator;
                        b12.l = q12;
                        b12.m = d12;
                        b12.n = d15;
                        b12.o = d11;
                        b12.p = d17;
                        b12.q = d13;
                        d18 = d14;
                        q13 = q12;
                        b12.r = d16;
                        b12.u = 6;
                        objA2 = eq3.a(false, b12);
                        mn3 = mn2;
                        if (objA2 == mn3) {
                            return mn3;
                        }
                        betType5 = betType4;
                        tradingStrategy = str5;
                        result = str6;
                        d19 = d12;
                        obj2 = objA2;
                        d20 = d18;
                        Double d215 = d15;
                        directionSource = q13;
                        double d33 = d13;
                        d21 = d11;
                        d22 = d33;
                        d23 = d215;
                        currency = (String) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                        Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                        Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                        Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        if (d20 == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (d20 != null) {
                            numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                        } else {
                            numValueOf = null;
                        }
                        String str18 = directionSource.d;
                        if (z) {
                            bool = Boolean.TRUE;
                        } else {
                            bool = null;
                        }
                        if (d19 != null) {
                            string = d19.toString();
                        } else {
                            string = null;
                        }
                        if (string == null) {
                            string = str10;
                        }
                        if (z) {
                            strZ = str10;
                        } else {
                            strZ = C0564Aa.z(d23);
                        }
                        String strValueOf6 = String.valueOf(d22);
                        if (z) {
                            strZ2 = str10;
                        } else {
                            strZ2 = C0564Aa.z(d21);
                        }
                        String strValueOf7 = String.valueOf(d16);
                        if (z) {
                            str9 = strZ;
                            str8 = currency;
                            strZ3 = str10;
                        } else {
                            strZ3 = C0564Aa.z(d17);
                            str8 = currency;
                            str9 = strZ;
                        }
                        s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str18, bool, string, str9, strValueOf6, strZ2, strValueOf7, strZ3, str8))), false);
                        return Unit.a;
                    }
                }
                return mn4;
            case 3:
                dDoubleValue = b12.q;
                Double d34 = b12.n;
                Q10 q14 = (Q10) b12.m;
                String str19 = (String) b12.l;
                String str20 = b12.k;
                String str21 = b12.j;
                String str22 = b12.i;
                Double d35 = (Double) b12.h;
                EventBetRequest.BetType betType9 = (EventBetRequest.BetType) b12.g;
                C0849Dr c0849Dr6 = (C0849Dr) b12.e;
                s04 = b12.d;
                C1795Pt1.b(obj2);
                d4 = d35;
                c0849Dr2 = c0849Dr6;
                betType3 = betType9;
                str6 = str22;
                str4 = str21;
                str5 = str20;
                str7 = str19;
                q11 = q14;
                d3 = d34;
                d5 = (Double) obj2;
                OM om7 = s04.m;
                Double d216 = new Double(dDoubleValue);
                b12.d = s04;
                b12.e = c0849Dr2;
                b12.g = betType3;
                b12.h = d4;
                b12.i = str6;
                b12.j = str4;
                b12.k = str5;
                b12.l = str7;
                b12.m = q11;
                b12.n = d3;
                b12.o = d5;
                b12.q = dDoubleValue;
                s05 = s04;
                b12.u = 4;
                objB2 = om7.b(d216, b12);
                mn4 = mn4;
                if (objB2 != mn4) {
                    obj2 = objB2;
                    d6 = d5;
                    betType4 = betType3;
                    s06 = s05;
                    d7 = (Double) obj2;
                    mn = mn4;
                    d8 = dDoubleValue;
                    d9 = c0849Dr2.c;
                    OM om8 = s06.m;
                    Double d217 = new Double(d9);
                    b12.d = s06;
                    b12.e = betType4;
                    b12.g = d4;
                    b12.h = str6;
                    b12.i = str4;
                    b12.j = str5;
                    b12.k = str7;
                    b12.l = q11;
                    b12.m = d3;
                    b12.n = d6;
                    b12.o = d7;
                    d10 = d6;
                    s07 = s06;
                    b12.q = d8;
                    b12.r = d9;
                    b12.u = 5;
                    objB3 = om8.b(d217, b12);
                    if (objB3 == mn) {
                        return mn;
                    }
                    String str110 = str7;
                    d11 = d7;
                    d12 = d3;
                    technicalIndicator = str110;
                    mn2 = mn;
                    q12 = q11;
                    startDealId = str4;
                    d13 = d8;
                    s08 = s07;
                    obj = objB3;
                    d14 = d4;
                    d15 = d10;
                    d16 = d9;
                    d17 = (Double) obj;
                    EQ eq4 = s08.j;
                    b12.d = s08;
                    b12.e = betType4;
                    b12.g = d14;
                    b12.h = str6;
                    b12.i = startDealId;
                    b12.j = str5;
                    b12.k = technicalIndicator;
                    b12.l = q12;
                    b12.m = d12;
                    b12.n = d15;
                    b12.o = d11;
                    b12.p = d17;
                    b12.q = d13;
                    d18 = d14;
                    q13 = q12;
                    b12.r = d16;
                    b12.u = 6;
                    objA2 = eq4.a(false, b12);
                    mn3 = mn2;
                    if (objA2 == mn3) {
                        return mn3;
                    }
                    betType5 = betType4;
                    tradingStrategy = str5;
                    result = str6;
                    d19 = d12;
                    obj2 = objA2;
                    d20 = d18;
                    Double d218 = d15;
                    directionSource = q13;
                    double d36 = d13;
                    d21 = d11;
                    d22 = d36;
                    d23 = d218;
                    currency = (String) obj2;
                    Intrinsics.checkNotNullParameter(result, "result");
                    Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                    Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                    Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                    Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    if (d20 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (d20 != null) {
                        numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                    } else {
                        numValueOf = null;
                    }
                    String str111 = directionSource.d;
                    if (z) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = null;
                    }
                    if (d19 != null) {
                        string = d19.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = str10;
                    }
                    if (z) {
                        strZ = str10;
                    } else {
                        strZ = C0564Aa.z(d23);
                    }
                    String strValueOf8 = String.valueOf(d22);
                    if (z) {
                        strZ2 = str10;
                    } else {
                        strZ2 = C0564Aa.z(d21);
                    }
                    String strValueOf9 = String.valueOf(d16);
                    if (z) {
                        str9 = strZ;
                        str8 = currency;
                        strZ3 = str10;
                    } else {
                        strZ3 = C0564Aa.z(d17);
                        str8 = currency;
                        str9 = strZ;
                    }
                    s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str111, bool, string, str9, strValueOf8, strZ2, strValueOf9, strZ3, str8))), false);
                    return Unit.a;
                }
                return mn4;
            case 4:
                dDoubleValue = b12.q;
                Double d37 = b12.o;
                d3 = b12.n;
                q11 = (Q10) b12.m;
                str7 = (String) b12.l;
                str5 = b12.k;
                str4 = b12.j;
                String str23 = b12.i;
                Double d38 = (Double) b12.h;
                EventBetRequest.BetType betType10 = (EventBetRequest.BetType) b12.g;
                C0849Dr c0849Dr7 = (C0849Dr) b12.e;
                S02<T> s011 = b12.d;
                C1795Pt1.b(obj2);
                s06 = s011;
                d6 = d37;
                betType4 = betType10;
                d4 = d38;
                str6 = str23;
                c0849Dr2 = c0849Dr7;
                d7 = (Double) obj2;
                mn = mn4;
                d8 = dDoubleValue;
                d9 = c0849Dr2.c;
                OM om9 = s06.m;
                Double d219 = new Double(d9);
                b12.d = s06;
                b12.e = betType4;
                b12.g = d4;
                b12.h = str6;
                b12.i = str4;
                b12.j = str5;
                b12.k = str7;
                b12.l = q11;
                b12.m = d3;
                b12.n = d6;
                b12.o = d7;
                d10 = d6;
                s07 = s06;
                b12.q = d8;
                b12.r = d9;
                b12.u = 5;
                objB3 = om9.b(d219, b12);
                if (objB3 == mn) {
                    return mn;
                }
                String str112 = str7;
                d11 = d7;
                d12 = d3;
                technicalIndicator = str112;
                mn2 = mn;
                q12 = q11;
                startDealId = str4;
                d13 = d8;
                s08 = s07;
                obj = objB3;
                d14 = d4;
                d15 = d10;
                d16 = d9;
                d17 = (Double) obj;
                EQ eq5 = s08.j;
                b12.d = s08;
                b12.e = betType4;
                b12.g = d14;
                b12.h = str6;
                b12.i = startDealId;
                b12.j = str5;
                b12.k = technicalIndicator;
                b12.l = q12;
                b12.m = d12;
                b12.n = d15;
                b12.o = d11;
                b12.p = d17;
                b12.q = d13;
                d18 = d14;
                q13 = q12;
                b12.r = d16;
                b12.u = 6;
                objA2 = eq5.a(false, b12);
                mn3 = mn2;
                if (objA2 == mn3) {
                    return mn3;
                }
                betType5 = betType4;
                tradingStrategy = str5;
                result = str6;
                d19 = d12;
                obj2 = objA2;
                d20 = d18;
                Double d2110 = d15;
                directionSource = q13;
                double d39 = d13;
                d21 = d11;
                d22 = d39;
                d23 = d2110;
                currency = (String) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                Intrinsics.checkNotNullParameter(currency, "currency");
                if (d20 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (d20 != null) {
                    numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                } else {
                    numValueOf = null;
                }
                String str113 = directionSource.d;
                if (z) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
                if (d19 != null) {
                    string = d19.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = str10;
                }
                if (z) {
                    strZ = str10;
                } else {
                    strZ = C0564Aa.z(d23);
                }
                String strValueOf10 = String.valueOf(d22);
                if (z) {
                    strZ2 = str10;
                } else {
                    strZ2 = C0564Aa.z(d21);
                }
                String strValueOf11 = String.valueOf(d16);
                if (z) {
                    str9 = strZ;
                    str8 = currency;
                    strZ3 = str10;
                } else {
                    strZ3 = C0564Aa.z(d17);
                    str8 = currency;
                    str9 = strZ;
                }
                s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str113, bool, string, str9, strValueOf10, strZ2, strValueOf11, strZ3, str8))), false);
                return Unit.a;
            case 5:
                double d40 = b12.r;
                double d41 = b12.q;
                Double d42 = b12.o;
                Double d43 = b12.n;
                Double d44 = (Double) b12.m;
                Q10 q15 = (Q10) b12.l;
                String str24 = b12.k;
                String str25 = b12.j;
                String str26 = b12.i;
                String str27 = (String) b12.h;
                Double d45 = (Double) b12.g;
                EventBetRequest.BetType betType11 = (EventBetRequest.BetType) b12.e;
                S02<T> s012 = b12.d;
                C1795Pt1.b(obj2);
                str6 = str27;
                obj = obj2;
                d12 = d44;
                str5 = str25;
                s08 = s012;
                d14 = d45;
                mn2 = mn4;
                q12 = q15;
                str10 = "";
                betType4 = betType11;
                d15 = d43;
                d11 = d42;
                d16 = d40;
                technicalIndicator = str24;
                d13 = d41;
                startDealId = str26;
                d17 = (Double) obj;
                EQ eq6 = s08.j;
                b12.d = s08;
                b12.e = betType4;
                b12.g = d14;
                b12.h = str6;
                b12.i = startDealId;
                b12.j = str5;
                b12.k = technicalIndicator;
                b12.l = q12;
                b12.m = d12;
                b12.n = d15;
                b12.o = d11;
                b12.p = d17;
                b12.q = d13;
                d18 = d14;
                q13 = q12;
                b12.r = d16;
                b12.u = 6;
                objA2 = eq6.a(false, b12);
                mn3 = mn2;
                if (objA2 == mn3) {
                    return mn3;
                }
                betType5 = betType4;
                tradingStrategy = str5;
                result = str6;
                d19 = d12;
                obj2 = objA2;
                d20 = d18;
                Double d2111 = d15;
                directionSource = q13;
                double d310 = d13;
                d21 = d11;
                d22 = d310;
                d23 = d2111;
                currency = (String) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                Intrinsics.checkNotNullParameter(currency, "currency");
                if (d20 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (d20 != null) {
                    numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                } else {
                    numValueOf = null;
                }
                String str114 = directionSource.d;
                if (z) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
                if (d19 != null) {
                    string = d19.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = str10;
                }
                if (z) {
                    strZ = str10;
                } else {
                    strZ = C0564Aa.z(d23);
                }
                String strValueOf12 = String.valueOf(d22);
                if (z) {
                    strZ2 = str10;
                } else {
                    strZ2 = C0564Aa.z(d21);
                }
                String strValueOf13 = String.valueOf(d16);
                if (z) {
                    str9 = strZ;
                    str8 = currency;
                    strZ3 = str10;
                } else {
                    strZ3 = C0564Aa.z(d17);
                    str8 = currency;
                    str9 = strZ;
                }
                s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str114, bool, string, str9, strValueOf12, strZ2, strValueOf13, strZ3, str8))), false);
                return Unit.a;
            case 6:
                double d46 = b12.r;
                d22 = b12.q;
                Double d47 = b12.p;
                d21 = b12.o;
                d23 = b12.n;
                d19 = (Double) b12.m;
                directionSource = (Q10) b12.l;
                technicalIndicator = b12.k;
                tradingStrategy = b12.j;
                startDealId = b12.i;
                String str28 = (String) b12.h;
                Double d48 = (Double) b12.g;
                EventBetRequest.BetType betType12 = (EventBetRequest.BetType) b12.e;
                S02<T> s013 = b12.d;
                C1795Pt1.b(obj2);
                betType5 = betType12;
                d20 = d48;
                d16 = d46;
                d17 = d47;
                s08 = s013;
                result = str28;
                str10 = "";
                currency = (String) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(startDealId, "startDealId");
                Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
                Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
                Intrinsics.checkNotNullParameter(directionSource, "directionSource");
                Intrinsics.checkNotNullParameter(currency, "currency");
                if (d20 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (d20 != null) {
                    numValueOf = Integer.valueOf(QX0.a(d20.doubleValue()));
                } else {
                    numValueOf = null;
                }
                String str115 = directionSource.d;
                if (z) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
                if (d19 != null) {
                    string = d19.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = str10;
                }
                if (z) {
                    strZ = str10;
                } else {
                    strZ = C0564Aa.z(d23);
                }
                String strValueOf14 = String.valueOf(d22);
                if (z) {
                    strZ2 = str10;
                } else {
                    strZ2 = C0564Aa.z(d21);
                }
                String strValueOf15 = String.valueOf(d16);
                if (z) {
                    str9 = strZ;
                    str8 = currency;
                    strZ3 = str10;
                } else {
                    strZ3 = C0564Aa.z(d17);
                    str8 = currency;
                    str9 = strZ;
                }
                s08.g.j("deal_done", ZM.a(new EventBetRequest(betType5.getValue(), new EventBetRequest.Properties(numValueOf, result, startDealId, tradingStrategy, technicalIndicator, str115, bool, string, str9, strValueOf14, strZ2, strValueOf15, strZ3, str8))), false);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void K(String str, String str2, String str3, String str4) {
        C2936bP1 c2936bP1 = this.a0;
        if (c2936bP1 == null || !c2936bP1.isCancelled()) {
            g.b bVar = (g.b) this.f.e.d.getValue();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            ReporterApi.a.b(this.g, EnumC5028l80.V, new E70(str, str2, str3, Boolean.valueOf(!bVar.b(g.b.i)), str4, null, null, null, null, null, null, null, null, 8160), null, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(LM lm) {
        C12 c12;
        S02<T> s02;
        double dDoubleValue;
        C6931uB0 c6931uB0;
        S02<T> s03;
        if (lm instanceof C12) {
            c12 = (C12) lm;
            int i = c12.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12.i = i - Integer.MIN_VALUE;
            } else {
                c12 = new C12(this, lm);
            }
        } else {
            c12 = new C12(this, lm);
        }
        Object objP = c12.g;
        MN mn = MN.d;
        int i2 = c12.i;
        boolean z = true;
        if (i2 == 0) {
            C1795Pt1.b(objP);
            c12.d = this;
            c12.i = 1;
            objP = p(c12);
            if (objP != mn) {
                s02 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            s02 = c12.d;
            C1795Pt1.b(objP);
        } else {
            if (i2 == 2) {
                dDoubleValue = c12.e;
                s02 = c12.d;
                C1795Pt1.b(objP);
                if (dDoubleValue < ((Number) objP).doubleValue()) {
                    Intrinsics.checkNotNullParameter("Insufficient funds", "message");
                    L(s02, new C7141vB0("Insufficient funds", "Insufficient funds"), null, 6);
                    c6931uB0 = C6931uB0.a;
                    c12.d = s02;
                    c12.i = 3;
                    if (s02.H(c6931uB0, c12) != mn) {
                        s03 = s02;
                    }
                    return mn;
                }
                z = false;
                return Boolean.valueOf(z);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s03 = c12.d;
            C1795Pt1.b(objP);
        }
        s03.T();
        return Boolean.valueOf(z);
        dDoubleValue = ((Number) objP).doubleValue();
        U22 u22 = s02.r;
        c12.d = s02;
        c12.e = dDoubleValue;
        c12.i = 2;
        objP = u22.a(null, c12);
        if (objP != mn) {
            if (dDoubleValue < ((Number) objP).doubleValue()) {
                Intrinsics.checkNotNullParameter("Insufficient funds", "message");
                L(s02, new C7141vB0("Insufficient funds", "Insufficient funds"), null, 6);
                c6931uB0 = C6931uB0.a;
                c12.d = s02;
                c12.i = 3;
                if (s02.H(c6931uB0, c12) != mn) {
                    s03 = s02;
                    s03.T();
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return mn;
    }

    public final void N(C2099Tr c2099Tr) {
        L(this, c2099Tr, c2099Tr.b, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r2.a(r9, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(defpackage.LM r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.D12
            if (r0 == 0) goto L13
            r0 = r9
            D12 r0 = (defpackage.D12) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            D12 r0 = new D12
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.C1795Pt1.b(r9)
            goto L86
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            java.lang.Object r2 = r0.d
            e21 r2 = (defpackage.InterfaceC3487e21) r2
            defpackage.C1795Pt1.b(r9)
            goto L7b
        L3e:
            java.lang.Object r2 = r0.d
            S02 r2 = (defpackage.S02) r2
            defpackage.C1795Pt1.b(r9)
            goto L64
        L46:
            defpackage.C1795Pt1.b(r9)
            r0.d = r8
            r0.h = r6
            z22 r9 = r8.a
            GP1 r2 = r9.i
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r9 = r9.m(r2, r0)
            if (r9 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r9 = kotlin.Unit.a
        L60:
            if (r9 != r1) goto L63
            goto L85
        L63:
            r2 = r8
        L64:
            qK1 r9 = r2.H
            E12 r6 = new E12
            r6.<init>(r2, r3)
            r0.d = r9
            r0.h = r5
            java.lang.String r2 = "best_asset_for_setBestAsset"
            java.lang.Object r2 = defpackage.C7236vf0.c(r2, r6, r0)
            if (r2 != r1) goto L78
            goto L85
        L78:
            r7 = r2
            r2 = r9
            r9 = r7
        L7b:
            r0.d = r3
            r0.h = r4
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.O(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r5.O(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r10.a(r2, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.LM r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.F12
            if (r0 == 0) goto L13
            r0 = r10
            F12 r0 = (defpackage.F12) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            F12 r0 = new F12
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            defpackage.C1795Pt1.b(r10)
            goto L9c
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            defpackage.C1795Pt1.b(r10)
            goto L8a
        L3e:
            d22 r2 = r0.e
            S02 r5 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L75
        L46:
            S02 r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L62
        L4c:
            defpackage.C1795Pt1.b(r10)
            G12 r10 = new G12
            r10.<init>(r9, r7)
            r0.d = r9
            r0.i = r6
            java.lang.String r2 = "selected_asset_for_setSelectedAsset"
            java.lang.Object r10 = defpackage.C7236vf0.c(r2, r10, r0)
            if (r10 != r1) goto L61
            goto L9b
        L61:
            r2 = r9
        L62:
            d22 r10 = (defpackage.C3279d22) r10
            r0.d = r2
            r0.e = r10
            r0.i = r5
            java.lang.Object r5 = r2.f(r10, r0)
            if (r5 != r1) goto L71
            goto L9b
        L71:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L75:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L8d
            r0.d = r7
            r0.e = r7
            r0.i = r4
            java.lang.Object r10 = r5.O(r0)
            if (r10 != r1) goto L8a
            goto L9b
        L8a:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L8d:
            qK1 r10 = r5.H
            r0.d = r7
            r0.e = r7
            r0.i = r3
            java.lang.Object r10 = r10.a(r2, r0)
            if (r10 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.P(LM):java.lang.Object");
    }

    public abstract void Q(@NotNull C2099Tr c2099Tr);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(long j, Long l, LM lm) {
        H12 h12;
        S02<T> s02;
        long jLongValue;
        S02<T> s03;
        if (lm instanceof H12) {
            h12 = (H12) lm;
            int i = h12.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                h12.i = i - Integer.MIN_VALUE;
            } else {
                h12 = new H12(this, lm);
            }
        } else {
            h12 = new H12(this, lm);
        }
        Object objM = h12.g;
        MN mn = MN.d;
        int i2 = h12.i;
        if (i2 == 0) {
            C1795Pt1.b(objM);
            Integer num = new Integer(0);
            GP1 gp1 = this.J;
            gp1.getClass();
            gp1.m(null, num);
            C2936bP1 c2936bP1 = this.Z;
            if (c2936bP1 != null) {
                c2936bP1.l(null);
            }
            if (l != null) {
                jLongValue = l.longValue();
                s03 = this;
            } else {
                h12.d = this;
                h12.e = j;
                h12.i = 1;
                objM = m(h12);
                if (objM == mn) {
                    return mn;
                }
                s02 = this;
            }
            s03.r0 = (int) Math.abs(j - jLongValue);
            EM em = C3286d41.a;
            RV rv = C6266r20.a;
            AbstractC8109zn0 abstractC8109zn0 = QV0.a;
            Q12 q12 = new Q12("bet_timer");
            abstractC8109zn0.getClass();
            s03.Z = C5189lv.k(em, CoroutineContext.Element.a.c(abstractC8109zn0, q12), new I12(s03, null), 2);
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = h12.e;
        s02 = h12.d;
        C1795Pt1.b(objM);
        s03 = s02;
        jLongValue = ((Number) objM).longValue() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        s03.r0 = (int) Math.abs(j - jLongValue);
        EM em2 = C3286d41.a;
        RV rv2 = C6266r20.a;
        AbstractC8109zn0 abstractC8109zn1 = QV0.a;
        Q12 q13 = new Q12("bet_timer");
        abstractC8109zn1.getClass();
        s03.Z = C5189lv.k(em2, CoroutineContext.Element.a.c(abstractC8109zn1, q13), new I12(s03, null), 2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object S(@NotNull EnumC4164hF1 enumC4164hF1, @NotNull InterfaceC7187vQ1 interfaceC7187vQ1, boolean z, int i, @NotNull InterfaceC5721oR1 interfaceC5721oR1, @NotNull E10 e10, @NotNull LM lm) throws Throwable {
        J12 j12;
        boolean z2;
        int i2;
        S02<T> s02;
        EnumC4164hF1 enumC4164hF2;
        InterfaceC7187vQ1 interfaceC7187vQ2;
        InterfaceC5721oR1 interfaceC5721oR2;
        E10 e11;
        InterfaceC7187vQ1 interfaceC7187vQ3;
        InterfaceC5721oR1 interfaceC5721oR3;
        S02<T> s03;
        E10 e12;
        EnumC4164hF1 enumC4164hF3;
        C6945uG c6945uG;
        Double d;
        C6945uG c6945uG2;
        Double d2;
        if (lm instanceof J12) {
            j12 = (J12) lm;
            int i3 = j12.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j12.n = i3 - Integer.MIN_VALUE;
            } else {
                j12 = new J12(this, lm);
            }
        } else {
            j12 = new J12(this, lm);
        }
        Object obj = j12.l;
        MN mn = MN.d;
        int i4 = j12.n;
        if (i4 == 0) {
            C1795Pt1.b(obj);
            C2936bP1 c2936bP1 = this.a0;
            if (c2936bP1 != null) {
                j12.d = this;
                j12.e = enumC4164hF1;
                j12.g = interfaceC7187vQ1;
                j12.h = interfaceC5721oR1;
                j12.i = e10;
                z2 = z;
                j12.j = z2;
                i2 = i;
                j12.k = i2;
                j12.n = 1;
                c2936bP1.l(null);
                Object objB1 = c2936bP1.b1(j12);
                if (objB1 != mn) {
                    objB1 = Unit.a;
                }
                if (objB1 == mn) {
                    return mn;
                }
                interfaceC7187vQ3 = interfaceC7187vQ1;
                interfaceC5721oR3 = interfaceC5721oR1;
                s03 = this;
                e12 = e10;
                enumC4164hF3 = enumC4164hF1;
            } else {
                z2 = z;
                i2 = i;
                s02 = this;
                enumC4164hF2 = enumC4164hF1;
                interfaceC7187vQ2 = interfaceC7187vQ1;
                interfaceC5721oR2 = interfaceC5721oR1;
                e11 = e10;
            }
            boolean z3 = z2;
            int i5 = i2;
            Objects.toString(s02.a0);
            s02.L.e();
            C4923kf c4923kf = s02.c;
            c6945uG = (C6945uG) c4923kf.k.getValue();
            if (c6945uG != null) {
                d = new Double(c6945uG.k);
            } else {
                d = null;
            }
            s02.d0 = d;
            c6945uG2 = (C6945uG) c4923kf.k.getValue();
            if (c6945uG2 != null) {
                d2 = new Double(c6945uG2.j);
            } else {
                d2 = null;
            }
            s02.e0 = d2;
            s02.V = null;
            s02.W = false;
            s02.B.setValue(e11.a());
            EM em = C3286d41.a;
            RV rv = C6266r20.a;
            Q12 q12 = new Q12("trading_main_loop");
            rv.getClass();
            s02.a0 = C5189lv.k(em, CoroutineContext.Element.a.c(rv, q12), new K12(s02, i5, z3, interfaceC5721oR2, e11, interfaceC7187vQ2, enumC4164hF2, null), 2);
            return Unit.a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i6 = j12.k;
        boolean z4 = j12.j;
        e12 = j12.i;
        interfaceC5721oR3 = j12.h;
        interfaceC7187vQ3 = j12.g;
        enumC4164hF3 = j12.e;
        s03 = j12.d;
        C1795Pt1.b(obj);
        i2 = i6;
        z2 = z4;
        s02 = s03;
        e11 = e12;
        interfaceC5721oR2 = interfaceC5721oR3;
        interfaceC7187vQ2 = interfaceC7187vQ3;
        enumC4164hF2 = enumC4164hF3;
        boolean z5 = z2;
        int i7 = i2;
        Objects.toString(s02.a0);
        s02.L.e();
        C4923kf c4923kf2 = s02.c;
        c6945uG = (C6945uG) c4923kf2.k.getValue();
        if (c6945uG != null) {
            d = new Double(c6945uG.k);
        } else {
            d = null;
        }
        s02.d0 = d;
        c6945uG2 = (C6945uG) c4923kf2.k.getValue();
        if (c6945uG2 != null) {
            d2 = new Double(c6945uG2.j);
        } else {
            d2 = null;
        }
        s02.e0 = d2;
        s02.V = null;
        s02.W = false;
        s02.B.setValue(e11.a());
        EM em2 = C3286d41.a;
        RV rv2 = C6266r20.a;
        Q12 q13 = new Q12("trading_main_loop");
        rv2.getClass();
        s02.a0 = C5189lv.k(em2, CoroutineContext.Element.a.c(rv2, q13), new K12(s02, i7, z5, interfaceC5721oR2, e11, interfaceC7187vQ2, enumC4164hF2, null), 2);
        return Unit.a;
    }

    public final void T() {
        this.T.setValue(null);
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.t;
        gp1.getClass();
        gp1.m(null, bool);
    }

    public final Object U(C2099Tr c2099Tr, String str, LM lm) throws Throwable {
        C2936bP1 c2936bP1 = this.Z;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        if (str == null) {
            str = c2099Tr.a;
            if (str.length() == 0) {
                str = C5491nL.c("bet_error_", C2017Sp1.a.b(c2099Tr.getClass()).f());
            }
        }
        Object objH = H(new X32(str, 6, false, c2099Tr.b, null), lm);
        return objH == MN.d ? objH : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object V(Double d, Double d2, String str, String str2, Double d3, LM lm) {
        M12 m12;
        String str3;
        Double d4;
        Double d5;
        Object obj;
        String str4;
        S02<T> s02;
        Double d6;
        Double d7;
        String str5;
        Double d8;
        Double d9;
        S02<T> s03;
        Boolean bool;
        Double d10 = d;
        if (lm instanceof M12) {
            m12 = (M12) lm;
            int i = m12.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                m12.n = i - Integer.MIN_VALUE;
            } else {
                m12 = new M12(this, lm);
            }
        } else {
            m12 = new M12(this, lm);
        }
        Object obj2 = m12.l;
        MN mn = MN.d;
        int i2 = m12.n;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            m12.d = this;
            m12.e = d2;
            str3 = str;
            m12.g = str3;
            m12.h = str2;
            m12.i = d3;
            m12.j = d10;
            m12.n = 1;
            Object objB = this.m.b(d10, m12);
            if (objB != mn) {
                d4 = d2;
                d5 = d3;
                obj = objB;
                str4 = str2;
                s02 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            d10 = m12.j;
            Double d11 = m12.i;
            str4 = (String) m12.h;
            String str6 = m12.g;
            d4 = (Double) m12.e;
            s02 = m12.d;
            C1795Pt1.b(obj2);
            obj = obj2;
            d5 = d11;
            str3 = str6;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Double d12 = m12.k;
            Double d13 = m12.j;
            Double d14 = m12.i;
            d7 = (Double) m12.h;
            str4 = m12.g;
            String str7 = (String) m12.e;
            s03 = m12.d;
            C1795Pt1.b(obj2);
            d9 = d12;
            d8 = d13;
            d6 = d14;
            str5 = str7;
        }
        String str8 = str4;
        Double d15 = (Double) obj2;
        String strValueOf = String.valueOf(((Number) s03.G.d.getValue()).doubleValue());
        String strZ = C0564Aa.z(d7);
        if (d7 == null) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        return new C4126h42(d6, d8, d9, d15, str5, str8, strValueOf, strZ, bool);
        Double d16 = (Double) obj;
        OM om = s02.m;
        m12.d = s02;
        m12.e = str3;
        m12.g = str4;
        m12.h = d5;
        m12.i = d10;
        m12.j = d16;
        m12.k = d4;
        m12.n = 2;
        Object objB2 = om.b(d4, m12);
        if (objB2 != mn) {
            d6 = d10;
            d7 = d5;
            obj2 = objB2;
            str5 = str3;
            d8 = d16;
            d9 = d4;
            s03 = s02;
            String str9 = str4;
            Double d17 = (Double) obj2;
            String strValueOf2 = String.valueOf(((Number) s03.G.d.getValue()).doubleValue());
            String strZ2 = C0564Aa.z(d7);
            if (d7 == null) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            return new C4126h42(d6, d8, d9, d17, str5, str9, strValueOf2, strZ2, bool);
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object W(AbstractC7783yF abstractC7783yF, H32 h32, C2824as c2824as, LM lm) throws Throwable {
        N12 n12;
        if (lm instanceof N12) {
            n12 = (N12) lm;
            int i = n12.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n12.g = i - Integer.MIN_VALUE;
            } else {
                n12 = new N12(this, lm);
            }
        } else {
            n12 = new N12(this, lm);
        }
        Object obj = n12.d;
        MN mn = MN.d;
        int i2 = n12.g;
        if (i2 != 0) {
            if (i2 == 1) {
                C1795Pt1.b(obj);
                return null;
            }
            if (i2 == 2) {
                C1795Pt1.b(obj);
                return null;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        if (abstractC7783yF != null) {
            if (abstractC7783yF instanceof C2337Wr) {
                n12.g = 2;
                if (A(this, (C2337Wr) abstractC7783yF, n12) != mn) {
                    return null;
                }
            } else {
                n12.g = 3;
                Object objR = r(abstractC7783yF, h32, n12);
                if (objR != mn) {
                    return objR;
                }
            }
            return mn;
        }
        C7993zF response = new C7993zF("Timeout start");
        String strB = c2824as != null ? c2824as.b() : null;
        String strA = c2824as != null ? c2824as.a() : null;
        Intrinsics.checkNotNullParameter(response, "response");
        K(response.b, response.a, strB, strA);
        X32 x32 = new X32("bet_open_response_timeout", 14, false, null, null);
        n12.g = 1;
        if (H(x32, n12) == mn) {
            return mn;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(LM lm) {
        O12 o12;
        S02<T> s02;
        if (lm instanceof O12) {
            o12 = (O12) lm;
            int i = o12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                o12.h = i - Integer.MIN_VALUE;
            } else {
                o12 = new O12(this, lm);
            }
        } else {
            o12 = new O12(this, lm);
        }
        Object obj = o12.e;
        Object obj2 = MN.d;
        int i2 = o12.h;
        boolean z = true;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Intrinsics.checkNotNull(this.j0);
            o12.d = this;
            o12.h = 1;
            obj = PJ1.a;
            if (obj != obj2) {
                s02 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        s02 = o12.d;
        C1795Pt1.b(obj);
        OJ1 oj1 = (OJ1) obj;
        if (oj1 instanceof MJ1) {
            ((MJ1) oj1).getClass();
            L(s02, null, null, 6);
            s02.T();
            z = false;
        } else {
            if (oj1 instanceof NJ1) {
                o12.d = null;
                o12.h = 2;
                Object objE = s02.E((NJ1) oj1, o12);
                return objE == obj2 ? obj2 : objE;
            }
            if (!Intrinsics.a(oj1, PJ1.a)) {
                throw new C6489s51();
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(defpackage.InterfaceC2441Xr r7, defpackage.LM r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.P12
            if (r0 == 0) goto L13
            r0 = r8
            P12 r0 = (defpackage.P12) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            P12 r0 = new P12
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            S02 r7 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L8f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            Xr r7 = r0.e
            S02 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
        L3e:
            r8 = r7
            r7 = r2
            goto L7c
        L41:
            Xr r7 = r0.e
            S02 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L5c
        L49:
            defpackage.C1795Pt1.b(r8)
            vE1 r8 = defpackage.C7151vE1.a
            r0.d = r6
            r0.e = r7
            r0.i = r5
            java.lang.Object r8 = r6.H(r8, r0)
            if (r8 != r1) goto L5b
            goto L8e
        L5b:
            r2 = r6
        L5c:
            r0.d = r2
            r0.e = r7
            r0.i = r4
            boolean r8 = r2.b0
            if (r8 == 0) goto L70
            java.lang.Object r8 = r2.O(r0)
            if (r8 != r1) goto L6d
            goto L79
        L6d:
            kotlin.Unit r8 = kotlin.Unit.a
            goto L79
        L70:
            java.lang.Object r8 = r2.P(r0)
            if (r8 != r1) goto L77
            goto L79
        L77:
            kotlin.Unit r8 = kotlin.Unit.a
        L79:
            if (r8 != r1) goto L3e
            goto L8e
        L7c:
            T extends H32 r2 = r7.j0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0.d = r7
            r4 = 0
            r0.e = r4
            r0.i = r3
            java.lang.Object r8 = d(r7, r8, r2, r0)
            if (r8 != r1) goto L8f
        L8e:
            return r1
        L8f:
            H32 r8 = (defpackage.H32) r8
            r7.j0 = r8
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.Y(Xr, LM):java.lang.Object");
    }

    @Nullable
    public abstract Unit Z();

    @Nullable
    public Object a0(@NotNull L12 l12) {
        return b0(this, l12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(InterfaceC6396rf0 interfaceC6396rf0, C2513Yp c2513Yp, LM lm) {
        T02 t02;
        S02<T> s02;
        if (lm instanceof T02) {
            t02 = (T02) lm;
            int i = t02.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                t02.i = i - Integer.MIN_VALUE;
            } else {
                t02 = new T02(this, lm);
            }
        } else {
            t02 = new T02(this, lm);
        }
        Object objD = t02.g;
        MN mn = MN.d;
        int i2 = t02.i;
        long j = t0;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            Objects.toString(this.a0);
            Objects.toString(c2513Yp);
            U02 u02 = new U02(interfaceC6396rf0, c2513Yp, this, null);
            t02.d = this;
            t02.e = c2513Yp;
            t02.i = 1;
            objD = OZ1.d(j, u02, t02);
            if (objD == mn) {
                return mn;
            }
            s02 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2513Yp = t02.e;
            s02 = t02.d;
            C1795Pt1.b(objD);
        }
        if (((C6945uG) objD) == null && !s02.W) {
            s02.W = true;
            C1910Rg c1910Rg = U0.v;
            if (c1910Rg != null) {
                c1910Rg.invoke(new RuntimeException(C1039Gc0.d("Balance did not settle within ", b.s(j), " after bet close")), PW0.e(new Pair("phase", "hot_path_user_updating_flow_timeout"), new Pair("result", c2513Yp.c)));
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Enum e(@NotNull I10 i10, @NotNull LM lm) {
        Y02 y02;
        S02<T> s02;
        Q10 q10;
        if (lm instanceof Y02) {
            y02 = (Y02) lm;
            int i = y02.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                y02.h = i - Integer.MIN_VALUE;
            } else {
                y02 = new Y02(this, lm);
            }
        } else {
            y02 = new Y02(this, lm);
        }
        Object objA = y02.e;
        MN mn = MN.d;
        int i2 = y02.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            E10 e10 = this.h0;
            C3623eh c3623eh = new C3623eh(this, 2);
            y02.d = this;
            y02.h = 1;
            objA = H10.a(e10, i10, AbstractC4743jm1.INSTANCE, c3623eh, y02);
            if (objA == mn) {
                return mn;
            }
            s02 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s02 = y02.d;
            C1795Pt1.b(objA);
        }
        O10 o10 = (O10) objA;
        Intrinsics.checkNotNullParameter(o10, "<this>");
        if (o10 instanceof O10.c) {
            q10 = Q10.INDICATOR;
        } else if (o10 instanceof O10.a) {
            q10 = Q10.CLOSE_PRICE;
        } else {
            if (!(o10 instanceof O10.b)) {
                throw new C6489s51();
            }
            q10 = Q10.RANDOM_FALLBACK;
        }
        s02.k0 = q10;
        return o10.a();
    }

    @Nullable
    public abstract Object f(@NotNull C3279d22 c3279d22, @NotNull LM lm);

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object g(C6945uG c6945uG, double d, LM lm) {
        Z02 z02;
        S02<T> s02;
        if (lm instanceof Z02) {
            z02 = (Z02) lm;
            int i = z02.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                z02.h = i - Integer.MIN_VALUE;
            } else {
                z02 = new Z02(this, lm);
            }
        } else {
            z02 = new Z02(this, lm);
        }
        Object objJ = z02.e;
        MN mn = MN.d;
        int i2 = z02.h;
        if (i2 == 0) {
            C1795Pt1.b(objJ);
            CommonAddDealRequest commonAddDealRequest = new CommonAddDealRequest(c6945uG.a, d, this.p0, c6945uG.j, c6945uG.e);
            z02.d = this;
            z02.h = 1;
            objJ = this.o.j(commonAddDealRequest, z02);
            if (objJ == mn) {
                return mn;
            }
            s02 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s02 = z02.d;
            C1795Pt1.b(objJ);
        }
        CommonResult commonResult = (CommonResult) objJ;
        if (commonResult instanceof ResultError) {
            CommonError error = ((ResultError) commonResult).getError();
            s02.getClass();
            s02.K("Add deal", error.getCode() + " " + error.getText(), null, null);
        }
        return Unit.a;
    }

    @Nullable
    public abstract Object h(int i, @NotNull LM lm);

    @Nullable
    public abstract Object i(int i, @NotNull H32.a aVar, @NotNull LM lm);

    public final C2824as j(C3034bs c3034bs, long j, EnumC3495e41 enumC3495e41) {
        String str;
        String str2;
        Ia2 ia2 = c3034bs.b;
        int i = ia2 == null ? -1 : a.a[ia2.ordinal()];
        if (i == -1) {
            str = "timeout";
        } else if (i == 1) {
            CommonError commonError = c3034bs.a;
            if (commonError instanceof CommonError.NotWebSocketConnection) {
                str = "instant_ws_error";
            } else {
                str = commonError == null ? "completed_empty" : "completed_with_error";
            }
        } else {
            if (i != 2) {
                throw new C6489s51();
            }
            str = "upstream_exception";
        }
        String str3 = str;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        CommonError commonError2 = c3034bs.a;
        if (commonError2 != null) {
            str2 = commonError2.getCode() + ":" + KS1.B(80, commonError2.getText());
        } else {
            str2 = null;
        }
        String strName = enumC3495e41 != null ? enumC3495e41.name() : null;
        EnumC3495e41 enumC3495e42 = (EnumC3495e41) this.c.r.getValue();
        return new C2824as(str3, str2, strName, enumC3495e42 != null ? enumC3495e42.name() : null, jElapsedRealtime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (defpackage.C7236vf0.c("best_asset_after_pair_unavailable", r7, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C2632a12
            if (r0 == 0) goto L13
            r0 = r7
            a12 r0 = (defpackage.C2632a12) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            a12 r0 = new a12
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.C1795Pt1.b(r7)
            goto L66
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            S02 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L54
        L39:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r6.c
            GP1 r7 = r7.p
            r7.setValue(r5)
            z22 r7 = r6.a
            r7.d()
            r0.d = r6
            r0.h = r4
            kotlin.Unit r7 = r6.G()
            if (r7 != r1) goto L53
            goto L65
        L53:
            r2 = r6
        L54:
            b12 r7 = new b12
            r7.<init>(r2, r5)
            r0.d = r5
            r0.h = r3
            java.lang.String r2 = "best_asset_after_pair_unavailable"
            java.lang.Object r7 = defpackage.C7236vf0.c(r2, r7, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.k(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(WebSocketRequestAbstract webSocketRequestAbstract, C3034bs c3034bs, LM lm) {
        C3065c12 c3065c12;
        if (lm instanceof C3065c12) {
            c3065c12 = (C3065c12) lm;
            int i = c3065c12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3065c12.h = i - Integer.MIN_VALUE;
            } else {
                c3065c12 = new C3065c12(this, lm);
            }
        } else {
            c3065c12 = new C3065c12(this, lm);
        }
        Object objG = c3065c12.e;
        MN mn = MN.d;
        int i2 = c3065c12.h;
        if (i2 == 0) {
            C1795Pt1.b(objG);
            c3065c12.d = c3034bs;
            c3065c12.h = 1;
            objG = this.o.g(webSocketRequestAbstract, c3065c12);
            if (objG == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3034bs = c3065c12.d;
            C1795Pt1.b(objG);
        }
        return CommonResultKt.c(new C4718jg0(new C4250hg0((InterfaceC6396rf0) objG, 0), new C3275d12(c3034bs, null)), "trading.bet_start");
    }

    @Nullable
    public Object m(@NotNull LM lm) {
        Long l = (Long) this.c.y.getValue();
        return new Long(l != null ? l.longValue() : System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(WebSocketRequestAbstract webSocketRequestAbstract, C3034bs c3034bs, LM lm) {
        C3484e12 c3484e12;
        S02<T> s02;
        if (lm instanceof C3484e12) {
            c3484e12 = (C3484e12) lm;
            int i = c3484e12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3484e12.h = i - Integer.MIN_VALUE;
            } else {
                c3484e12 = new C3484e12(this, lm);
            }
        } else {
            c3484e12 = new C3484e12(this, lm);
        }
        Object objL = c3484e12.e;
        MN mn = MN.d;
        int i2 = c3484e12.h;
        if (i2 == 0) {
            C1795Pt1.b(objL);
            c3484e12.d = this;
            c3484e12.h = 1;
            objL = l(webSocketRequestAbstract, c3034bs, c3484e12);
            if (objL == mn) {
                return mn;
            }
            s02 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s02 = c3484e12.d;
            C1795Pt1.b(objL);
        }
        return new C3735fC1(new C1908Rf0((InterfaceC6396rf0) objL, new C3694f12(s02, null), null));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r7 == r1) goto L30;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C3904g12
            if (r0 == 0) goto L13
            r0 = r7
            g12 r0 = (defpackage.C3904g12) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            g12 r0 = new g12
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L76
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.C1795Pt1.b(r7)
            goto L64
        L39:
            S02 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L50
        L3f:
            defpackage.C1795Pt1.b(r7)
            r0.d = r6
            r0.h = r5
            uZ1 r7 = r6.b
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4f
            goto L75
        L4f:
            r2 = r6
        L50:
            Or r7 = (defpackage.C1709Or) r7
            boolean r7 = r7.c
            r5 = 0
            if (r7 == 0) goto L69
            Nn1 r7 = r2.I
            r0.d = r5
            r0.h = r4
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L64
            goto L75
        L64:
            d22 r7 = (defpackage.C3279d22) r7
            java.lang.Integer r7 = r7.g
            goto L7a
        L69:
            Nn1 r7 = r2.I
            r0.d = r5
            r0.h = r3
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            d22 r7 = (defpackage.C3279d22) r7
            java.lang.Integer r7 = r7.f
        L7a:
            if (r7 == 0) goto L86
            int r7 = r7.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            return r0
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.o(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object p(@NotNull LM lm) {
        C4114h12 c4114h12;
        S02<T> s02;
        if (lm instanceof C4114h12) {
            c4114h12 = (C4114h12) lm;
            int i = c4114h12.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4114h12.h = i - Integer.MIN_VALUE;
            } else {
                c4114h12 = new C4114h12(this, lm);
            }
        } else {
            c4114h12 = new C4114h12(this, lm);
        }
        Object objA = c4114h12.e;
        MN mn = MN.d;
        int i2 = c4114h12.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c4114h12.d = this;
            c4114h12.h = 1;
            objA = C7236vf0.a(this.c.k, c4114h12);
            if (objA == mn) {
                return mn;
            }
            s02 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s02 = c4114h12.d;
            C1795Pt1.b(objA);
        }
        C6945uG c6945uG = (C6945uG) objA;
        return new Double(s02.f0 == EnumC4164hF1.h ? c6945uG.j : c6945uG.k);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(boolean r6, defpackage.LM r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4324i12
            if (r0 == 0) goto L13
            r0 = r7
            i12 r0 = (defpackage.C4324i12) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            i12 r0 = new i12
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.C1795Pt1.b(r7)
            goto L48
        L36:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r5.c
            if (r6 == 0) goto L4d
            r0.g = r4
            GP1 r6 = r7.k
            java.lang.Object r7 = defpackage.C7236vf0.a(r6, r0)
            if (r7 != r1) goto L48
            goto L57
        L48:
            uG r7 = (defpackage.C6945uG) r7
            double r6 = r7.j
            goto L5c
        L4d:
            r0.g = r3
            GP1 r6 = r7.k
            java.lang.Object r7 = defpackage.C7236vf0.a(r6, r0)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            uG r7 = (defpackage.C6945uG) r7
            double r6 = r7.k
        L5c:
            java.lang.Double r0 = new java.lang.Double
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.q(boolean, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:112:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(AbstractC7783yF abstractC7783yF, H32 h32, LM lm) throws Throwable {
        C4582j12 c4582j12;
        if (lm instanceof C4582j12) {
            c4582j12 = (C4582j12) lm;
            int i = c4582j12.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4582j12.g = i - Integer.MIN_VALUE;
            } else {
                c4582j12 = new C4582j12(this, lm);
            }
        } else {
            c4582j12 = new C4582j12(this, lm);
        }
        Object obj = c4582j12.d;
        Object obj2 = MN.d;
        switch (c4582j12.g) {
            case 0:
                C1795Pt1.b(obj);
                if (abstractC7783yF instanceof C0849Dr) {
                    c4582j12.g = 1;
                    Object objY = y((C0849Dr) abstractC7783yF, h32, c4582j12);
                    if (objY != obj2) {
                        return objY;
                    }
                } else {
                    if (abstractC7783yF instanceof C0771Cr) {
                        c4582j12.g = 2;
                        ((C0771Cr) abstractC7783yF).getClass();
                        new Long(this.Y);
                        throw null;
                    }
                    if (abstractC7783yF instanceof C7141vB0) {
                        C7141vB0 c7141vB0 = (C7141vB0) abstractC7783yF;
                        c4582j12.g = 3;
                        C2936bP1 c2936bP1 = this.Z;
                        if (c2936bP1 != null) {
                            c2936bP1.l(null);
                        }
                        C4462ih c4462ih = U0.t;
                        if (c4462ih != null) {
                            String str = this.o0;
                            c4462ih.invoke(c7141vB0, str != null ? str : "");
                        }
                        N(c7141vB0);
                        Object objH = H(C6931uB0.a, c4582j12);
                        if (objH != obj2) {
                            objH = Unit.a;
                        }
                        if (objH != obj2) {
                            return null;
                        }
                    } else if (abstractC7783yF instanceof C4918kd2) {
                        C4918kd2 c4918kd2 = (C4918kd2) abstractC7783yF;
                        c4582j12.g = 4;
                        C2936bP1 c2936bP2 = this.Z;
                        if (c2936bP2 != null) {
                            c2936bP2.l(null);
                        }
                        C4462ih c4462ih2 = U0.t;
                        if (c4462ih2 != null) {
                            String str2 = this.o0;
                            c4462ih2.invoke(c4918kd2, str2 != null ? str2 : "");
                        }
                        N(c4918kd2);
                        Object objH2 = H(Y32.a, c4582j12);
                        if (objH2 != obj2) {
                            objH2 = Unit.a;
                        }
                        if (objH2 != obj2) {
                            return null;
                        }
                    } else if (abstractC7783yF instanceof RP0) {
                        RP0 rp0 = (RP0) abstractC7783yF;
                        c4582j12.g = 5;
                        C2936bP1 c2936bP3 = this.Z;
                        if (c2936bP3 != null) {
                            c2936bP3.l(null);
                        }
                        C4462ih c4462ih3 = U0.t;
                        if (c4462ih3 != null) {
                            String str3 = this.o0;
                            c4462ih3.invoke(rp0, str3 != null ? str3 : "");
                        }
                        N(rp0);
                        Object objH3 = H(C3912g32.a, c4582j12);
                        if (objH3 != obj2) {
                            objH3 = Unit.a;
                        }
                        if (objH3 != obj2) {
                            return null;
                        }
                    } else if (abstractC7783yF instanceof SX0) {
                        SX0 sx0 = (SX0) abstractC7783yF;
                        c4582j12.g = 6;
                        C2936bP1 c2936bP4 = this.Z;
                        if (c2936bP4 != null) {
                            c2936bP4.l(null);
                        }
                        C4462ih c4462ih4 = U0.t;
                        if (c4462ih4 != null) {
                            String str4 = this.o0;
                            c4462ih4.invoke(sx0, str4 != null ? str4 : "");
                        }
                        N(sx0);
                        Object objH4 = H(new C4332i32(sx0.a), c4582j12);
                        if (objH4 != obj2) {
                            objH4 = Unit.a;
                        }
                        if (objH4 != obj2) {
                            return null;
                        }
                    } else if (abstractC7783yF instanceof C1271Jb1) {
                        c4582j12.g = 7;
                        Object objD = D((C1271Jb1) abstractC7783yF, c4582j12);
                        if (objD != obj2) {
                            return objD;
                        }
                    } else if (abstractC7783yF instanceof C0868Dx0) {
                        c4582j12.g = 8;
                        Object objC = C((C0868Dx0) abstractC7783yF, c4582j12);
                        if (objC != obj2) {
                            return objC;
                        }
                    } else if (abstractC7783yF instanceof C0790Cx0) {
                        c4582j12.g = 9;
                        Object objB = B((C0790Cx0) abstractC7783yF, c4582j12);
                        if (objB != obj2) {
                            return objB;
                        }
                    } else {
                        if (!(abstractC7783yF instanceof C2099Tr)) {
                            if (abstractC7783yF instanceof C2337Wr) {
                                return null;
                            }
                            throw new C6489s51();
                        }
                        c4582j12.g = 10;
                        Object objZ = z((C2099Tr) abstractC7783yF, null, c4582j12);
                        if (objZ != obj2) {
                            return objZ;
                        }
                    }
                }
                return obj2;
            case 1:
                C1795Pt1.b(obj);
                return obj;
            case 2:
                C1795Pt1.b(obj);
                return null;
            case 3:
                C1795Pt1.b(obj);
                return null;
            case 4:
                C1795Pt1.b(obj);
                return null;
            case 5:
                C1795Pt1.b(obj);
                return null;
            case 6:
                C1795Pt1.b(obj);
                return null;
            case 7:
                C1795Pt1.b(obj);
                return obj;
            case 8:
                C1795Pt1.b(obj);
                return obj;
            case 9:
                C1795Pt1.b(obj);
                return obj;
            case 10:
                C1795Pt1.b(obj);
                return obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object s(InterfaceC2441Xr interfaceC2441Xr, String str, L12 l12) throws Throwable {
        InterfaceC2441Xr.d dVar = InterfaceC2441Xr.d.a;
        if (interfaceC2441Xr != null && !interfaceC2441Xr.equals(dVar)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.n0;
            C4043gh c4043gh = U0.r;
            if (c4043gh != null) {
                c4043gh.k(interfaceC2441Xr, str, new Long(jCurrentTimeMillis));
            }
        }
        C4253hh c4253hh = U0.s;
        if (c4253hh != null) {
            c4253hh.invoke(interfaceC2441Xr, str);
        }
        S12 s12 = this.m0;
        if (s12 != null) {
            s12.a = null;
        }
        this.o0 = null;
        if (Intrinsics.a(interfaceC2441Xr, dVar)) {
            Object objB = IW.b(1000L, l12);
            return objB == MN.d ? objB : Unit.a;
        }
        this.X = 0;
        Object objH = H(C2021Sr.a, l12);
        return objH == MN.d ? objH : Unit.a;
    }

    public final boolean t(@NotNull AbstractC7783yF abstractC7783yF) {
        Intrinsics.checkNotNullParameter(abstractC7783yF, "<this>");
        if ((abstractC7783yF instanceof C0849Dr) && ((C0849Dr) abstractC7783yF).a != this.Y) {
            return true;
        }
        if (!(abstractC7783yF instanceof C0771Cr)) {
            return false;
        }
        ((C0771Cr) abstractC7783yF).getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object u(boolean z, @NotNull LM lm) {
        C4792k12 c4792k12;
        S02<T> s02;
        double d;
        if (lm instanceof C4792k12) {
            c4792k12 = (C4792k12) lm;
            int i = c4792k12.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4792k12.i = i - Integer.MIN_VALUE;
            } else {
                c4792k12 = new C4792k12(this, lm);
            }
        } else {
            c4792k12 = new C4792k12(this, lm);
        }
        Object objQ = c4792k12.g;
        MN mn = MN.d;
        int i2 = c4792k12.i;
        if (i2 == 0) {
            C1795Pt1.b(objQ);
            c4792k12.d = this;
            c4792k12.i = 1;
            objQ = q(z, c4792k12);
            if (objQ != mn) {
                s02 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            s02 = c4792k12.d;
            C1795Pt1.b(objQ);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = c4792k12.e;
            C1795Pt1.b(objQ);
        }
        return Boolean.valueOf(d < ((Number) objQ).doubleValue());
        double dDoubleValue = ((Number) objQ).doubleValue();
        U22 u22 = s02.r;
        c4792k12.d = null;
        c4792k12.e = dDoubleValue;
        c4792k12.i = 2;
        objQ = u22.a(null, c4792k12);
        if (objQ != mn) {
            d = dDoubleValue;
            return Boolean.valueOf(d < ((Number) objQ).doubleValue());
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x050d  */
    /* JADX WARN: Code duplicated, block: B:106:0x058f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0596  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x024d  */
    /* JADX WARN: Code duplicated, block: B:42:0x028a  */
    /* JADX WARN: Code duplicated, block: B:46:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0305  */
    /* JADX WARN: Code duplicated, block: B:61:0x030b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0352  */
    /* JADX WARN: Code duplicated, block: B:65:0x035d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0386  */
    /* JADX WARN: Code duplicated, block: B:72:0x0399  */
    /* JADX WARN: Code duplicated, block: B:75:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x040b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:87:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:96:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0509  */
    public final Object v(WebSocketRequestAbstract webSocketRequestAbstract, H32 h32, LM lm) throws Throwable {
        C5002l12 c5002l12;
        WebSocketRequestAbstract webSocketRequestAbstract2;
        H32 h33;
        Object obj;
        S02<T> s02;
        InterfaceC6396rf0 interfaceC6396rf0;
        Object objP;
        InterfaceC6396rf0 interfaceC6396rf1;
        Object obj2;
        WebSocketRequestAbstract webSocketRequestAbstract3;
        S02<T> s03;
        H32 h34;
        S02<T> s04;
        C3034bs c3034bs;
        EnumC3495e41 enumC3495e41;
        long jElapsedRealtime;
        Object objN;
        Object obj3;
        InterfaceC6396rf0 interfaceC6396rf2;
        C3034bs c3034bs2;
        WebSocketRequestAbstract webSocketRequestAbstract4;
        EnumC3495e41 enumC3495e42;
        InterfaceC6396rf0 interfaceC6396rf3;
        Object objB;
        InterfaceC6396rf0 interfaceC6396rf4;
        InterfaceC6396rf0 interfaceC6396rf5;
        Object obj4;
        H32 h35;
        C3034bs c3034bs3;
        S02<T> s05;
        long j;
        ResultOk resultOk;
        AbstractC7783yF abstractC7783yF;
        String str;
        C2824as c2824as;
        Object objW;
        InterfaceC6396rf0 interfaceC6396rf6;
        AbstractC7783yF abstractC7783yF2;
        Object obj5;
        InterfaceC6396rf0 interfaceC6396rf7;
        C2824as c2824asJ;
        C3204ch c3204ch;
        String str2;
        Object name;
        String name2;
        String str3;
        InterfaceC2441Xr interfaceC2441Xr;
        MN mn;
        C6120qK1 c6120qK1;
        InterfaceC2441Xr interfaceC2441Xr2;
        S02<T> s06;
        AbstractC7783yF abstractC7783yF3;
        long jG;
        long j2;
        long j3;
        int iE;
        C3034bs c3034bs4;
        GP1 gp1;
        InterfaceC6396rf0 interfaceC6396rf8;
        InterfaceC2441Xr interfaceC2441Xr3;
        Object objD;
        Object obj6;
        S02<T> s07;
        int i;
        long j4;
        C3034bs c3034bs5;
        GP1 gp2;
        InterfaceC6396rf0 interfaceC6396rf9;
        InterfaceC2441Xr interfaceC2441Xr4;
        InterfaceC6396rf0 interfaceC6396rf10;
        long j5;
        InterfaceC6396rf0 interfaceC6396rf11;
        long jElapsedRealtime2;
        EnumC3495e41 enumC3495e43;
        String str4;
        S02<T> s08;
        Object objB2;
        InterfaceC2441Xr interfaceC2441Xr5;
        InterfaceC6396rf0 interfaceC6396rf12;
        EnumC3495e41 enumC3495e44;
        H32 h36;
        S02<T> s09;
        ResultOk resultOk2;
        AbstractC7783yF abstractC7783yF4;
        C2824as c2824asJ2;
        C4931kh c4931kh;
        W32 w32;
        C2513Yp c2513Yp;
        String str5;
        S02<T> s010;
        InterfaceC2441Xr interfaceC2441Xr6;
        C2513Yp c2513Yp2;
        String str6 = "requestId";
        if (lm instanceof C5002l12) {
            c5002l12 = (C5002l12) lm;
            int i2 = c5002l12.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5002l12.s = i2 - Integer.MIN_VALUE;
            } else {
                c5002l12 = new C5002l12(this, lm);
            }
        } else {
            c5002l12 = new C5002l12(this, lm);
        }
        Object objR = c5002l12.q;
        MN mn2 = MN.d;
        int i3 = c5002l12.s;
        long j6 = s0;
        switch (i3) {
            case 0:
                C1795Pt1.b(objR);
                C4923kf c4923kf = this.c;
                if (c4923kf.r.getValue() == EnumC3495e41.h) {
                    L(this, new C7993zF("WS unavailable"), null, 6);
                    W32 w33 = W32.a;
                    c5002l12.s = 1;
                    if (H(w33, c5002l12) != mn2) {
                        return null;
                    }
                } else {
                    Objects.toString(this.a0);
                    c5002l12.d = this;
                    webSocketRequestAbstract2 = webSocketRequestAbstract;
                    c5002l12.e = webSocketRequestAbstract2;
                    c5002l12.g = h32;
                    c5002l12.s = 2;
                    C4250hg0 c4250hg0 = new C4250hg0(c4923kf.k, 0);
                    if (c4250hg0 != mn2) {
                        h33 = h32;
                        obj = c4250hg0;
                        s02 = this;
                        interfaceC6396rf0 = (InterfaceC6396rf0) obj;
                        c5002l12.d = s02;
                        c5002l12.e = webSocketRequestAbstract2;
                        c5002l12.g = h33;
                        c5002l12.h = interfaceC6396rf0;
                        c5002l12.i = s02;
                        c5002l12.s = 3;
                        objP = s02.p(c5002l12);
                        if (objP != mn2) {
                            interfaceC6396rf1 = interfaceC6396rf0;
                            obj2 = objP;
                            webSocketRequestAbstract3 = webSocketRequestAbstract2;
                            s03 = s02;
                            h34 = h33;
                            s04 = s03;
                            s04.i0 = (Double) obj2;
                            Objects.toString(s03.a0);
                            c3034bs = new C3034bs();
                            enumC3495e41 = (EnumC3495e41) s03.c.r.getValue();
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                            c5002l12.d = s03;
                            c5002l12.e = webSocketRequestAbstract3;
                            c5002l12.g = h34;
                            c5002l12.h = interfaceC6396rf1;
                            c5002l12.i = c3034bs;
                            c5002l12.j = enumC3495e41;
                            c5002l12.m = jElapsedRealtime;
                            c5002l12.s = 4;
                            objN = s03.n(webSocketRequestAbstract3, c3034bs, c5002l12);
                            if (objN != mn2) {
                                obj3 = objN;
                                interfaceC6396rf2 = interfaceC6396rf1;
                                c3034bs2 = c3034bs;
                                webSocketRequestAbstract4 = webSocketRequestAbstract3;
                                enumC3495e42 = enumC3495e41;
                                interfaceC6396rf3 = (InterfaceC6396rf0) obj3;
                                Objects.toString(s03.a0);
                                C1126Hf0 c1126Hf0 = new C1126Hf0(interfaceC6396rf3, new C7735y12(c3034bs2, null));
                                MB mb = new MB(4);
                                c5002l12.d = s03;
                                c5002l12.e = webSocketRequestAbstract4;
                                c5002l12.g = h34;
                                c5002l12.h = interfaceC6396rf2;
                                c5002l12.i = c3034bs2;
                                c5002l12.j = enumC3495e42;
                                c5002l12.k = interfaceC6396rf3;
                                c5002l12.m = jElapsedRealtime;
                                c5002l12.s = 5;
                                objB = C7236vf0.b(c1126Hf0, j6, mb, c5002l12);
                                if (objB != mn2) {
                                    long j7 = jElapsedRealtime;
                                    interfaceC6396rf4 = interfaceC6396rf2;
                                    interfaceC6396rf5 = interfaceC6396rf3;
                                    obj4 = objB;
                                    h35 = h34;
                                    c3034bs3 = c3034bs2;
                                    s05 = s03;
                                    j = j7;
                                    resultOk = (ResultOk) obj4;
                                    if (resultOk != null) {
                                        abstractC7783yF = (AbstractC7783yF) resultOk.a();
                                    } else {
                                        abstractC7783yF = null;
                                    }
                                    if (abstractC7783yF == null) {
                                        c2824asJ = s05.j(c3034bs3, j, enumC3495e42);
                                        Objects.toString(s05.a0);
                                        c2824asJ.a();
                                        c2824asJ.b();
                                        c3204ch = U0.w;
                                        if (c3204ch != null) {
                                            str2 = s05.o0;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            name = webSocketRequestAbstract4.getName();
                                            if (name != null || (name2 = name.toString()) == null) {
                                                name2 = "unknown";
                                            }
                                            Long l = new Long(c2824asJ.b);
                                            String str7 = c2824asJ.a;
                                            String str8 = c2824asJ.d;
                                            String str9 = c2824asJ.e;
                                            String str10 = c2824asJ.c;
                                            c3204ch.getClass();
                                            long jLongValue = l.longValue();
                                            int i4 = AppImpl.G;
                                            str6 = "requestId";
                                            Intrinsics.checkNotNullParameter(str2, str6);
                                            String str11 = str2;
                                            Intrinsics.checkNotNullParameter(name2, "name");
                                            str = "kind";
                                            Intrinsics.checkNotNullParameter(str7, str);
                                            c3204ch.d.x(str11, name2, str7, jLongValue, str10, str8, str9);
                                            Unit unit = Unit.a;
                                            Unit unit2 = Unit.a;
                                        } else {
                                            str = r2;
                                            str6 = str6;
                                        }
                                        c2824as = c2824asJ;
                                    } else {
                                        j6 = j6;
                                        str = r2;
                                        str6 = str6;
                                        c2824as = null;
                                    }
                                    Objects.toString(s05.a0);
                                    Objects.toString(abstractC7783yF);
                                    c5002l12.d = s05;
                                    c5002l12.e = h35;
                                    c5002l12.g = interfaceC6396rf4;
                                    c5002l12.h = c3034bs3;
                                    c5002l12.i = interfaceC6396rf5;
                                    c5002l12.j = abstractC7783yF;
                                    c5002l12.k = null;
                                    c5002l12.s = 6;
                                    objW = s05.W(abstractC7783yF, h35, c2824as, c5002l12);
                                    if (objW != mn2) {
                                        interfaceC6396rf6 = interfaceC6396rf5;
                                        abstractC7783yF2 = abstractC7783yF;
                                        obj5 = objW;
                                        interfaceC6396rf7 = interfaceC6396rf4;
                                        interfaceC2441Xr = (InterfaceC2441Xr) obj5;
                                        Objects.toString(s05.a0);
                                        Objects.toString(interfaceC2441Xr);
                                        if (abstractC7783yF2 instanceof C2337Wr) {
                                            c6120qK1 = s05.v;
                                            c5002l12.d = s05;
                                            c5002l12.e = h35;
                                            c5002l12.g = interfaceC2441Xr;
                                            c5002l12.h = interfaceC6396rf7;
                                            c5002l12.i = c3034bs3;
                                            c5002l12.j = interfaceC6396rf6;
                                            c5002l12.k = abstractC7783yF2;
                                            c5002l12.s = 7;
                                            if (c6120qK1.a(abstractC7783yF2, c5002l12) != mn2) {
                                                interfaceC2441Xr2 = interfaceC2441Xr;
                                                s06 = s05;
                                                abstractC7783yF3 = abstractC7783yF2;
                                                b.a aVar = b.e;
                                                jG = c.g(s06.r0, R40.SECONDS);
                                                C2337Wr c2337Wr = (C2337Wr) abstractC7783yF3;
                                                long j8 = c2337Wr.b;
                                                long j9 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                                                j2 = j8 * j9;
                                                j3 = c2337Wr.c * j9;
                                                iE = h35.e();
                                                c5002l12.d = s06;
                                                c5002l12.e = h35;
                                                c5002l12.g = interfaceC2441Xr2;
                                                c5002l12.h = interfaceC6396rf7;
                                                c5002l12.i = c3034bs3;
                                                c5002l12.j = interfaceC6396rf6;
                                                c5002l12.k = abstractC7783yF3;
                                                c3034bs4 = c3034bs3;
                                                gp1 = s06.P;
                                                c5002l12.l = gp1;
                                                c5002l12.m = jG;
                                                interfaceC6396rf8 = interfaceC6396rf7;
                                                interfaceC2441Xr3 = interfaceC2441Xr2;
                                                c5002l12.n = j2;
                                                c5002l12.o = j3;
                                                c5002l12.p = iE;
                                                c5002l12.s = 8;
                                                objD = s06.j.d(c5002l12);
                                                if (objD != mn2) {
                                                    S02<T> s011 = s06;
                                                    obj6 = objD;
                                                    s07 = s011;
                                                    i = iE;
                                                    j4 = j3;
                                                    c3034bs5 = c3034bs4;
                                                    gp2 = gp1;
                                                    interfaceC6396rf9 = interfaceC6396rf6;
                                                    interfaceC2441Xr4 = interfaceC2441Xr3;
                                                    interfaceC6396rf10 = interfaceC6396rf8;
                                                    j5 = j2;
                                                    String str12 = str6;
                                                    interfaceC6396rf11 = interfaceC6396rf10;
                                                    gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                                                    long jP = b.p(jG, j6);
                                                    Objects.toString(s07.a0);
                                                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                                    enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                                                    c3034bs5.a = null;
                                                    c3034bs5.b = null;
                                                    str4 = str12;
                                                    C1126Hf0 c1126Hf1 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                                                    C4429iY c4429iY = new C4429iY(2);
                                                    c5002l12.d = s07;
                                                    c5002l12.e = h35;
                                                    c5002l12.g = interfaceC2441Xr4;
                                                    c5002l12.h = interfaceC6396rf11;
                                                    c5002l12.i = c3034bs5;
                                                    c5002l12.j = enumC3495e43;
                                                    s08 = s07;
                                                    c5002l12.k = null;
                                                    c5002l12.l = null;
                                                    c5002l12.m = jG;
                                                    c5002l12.n = jElapsedRealtime2;
                                                    c5002l12.s = 9;
                                                    objB2 = C7236vf0.b(c1126Hf1, jP, c4429iY, c5002l12);
                                                    mn = mn2;
                                                    if (objB2 == mn) {
                                                        return mn;
                                                    }
                                                    interfaceC2441Xr5 = interfaceC2441Xr4;
                                                    interfaceC6396rf12 = interfaceC6396rf11;
                                                    enumC3495e44 = enumC3495e43;
                                                    h36 = h35;
                                                    s09 = s08;
                                                    resultOk2 = (ResultOk) objB2;
                                                    if (resultOk2 != null) {
                                                        abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                                                    } else {
                                                        abstractC7783yF4 = null;
                                                    }
                                                    Objects.toString(s09.a0);
                                                    Objects.toString(abstractC7783yF4);
                                                    if (abstractC7783yF4 != null) {
                                                        Objects.toString(s09.a0);
                                                        c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                                                        Objects.toString(s09.a0);
                                                        c2824asJ2.a();
                                                        c2824asJ2.b();
                                                        c4931kh = U0.x;
                                                        if (c4931kh != null) {
                                                            str5 = s09.o0;
                                                            if (str5 == null) {
                                                                str5 = str3;
                                                            }
                                                            b.a aVar2 = b.e;
                                                            Integer num = new Integer((int) b.r(jG, R40.SECONDS));
                                                            Long l2 = new Long(c2824asJ2.b);
                                                            String str13 = c2824asJ2.a;
                                                            String str14 = c2824asJ2.d;
                                                            String str15 = c2824asJ2.e;
                                                            String str16 = c2824asJ2.c;
                                                            c4931kh.getClass();
                                                            int iIntValue = num.intValue();
                                                            long jLongValue2 = l2.longValue();
                                                            int i5 = AppImpl.G;
                                                            Intrinsics.checkNotNullParameter(str5, str4);
                                                            Intrinsics.checkNotNullParameter(str13, str);
                                                            c4931kh.d.v(str5, iIntValue, jLongValue2, str13, str16, str14, str15);
                                                            Unit unit3 = Unit.a;
                                                            Unit unit4 = Unit.a;
                                                        }
                                                        C7993zF response = new C7993zF("Timeout end");
                                                        String strB = c2824asJ2.b();
                                                        String strA = c2824asJ2.a();
                                                        Intrinsics.checkNotNullParameter(response, "response");
                                                        s09.K(response.b, response.a, strB, strA);
                                                        w32 = W32.a;
                                                        c5002l12.d = s09;
                                                        c5002l12.e = interfaceC2441Xr5;
                                                        c5002l12.g = interfaceC6396rf12;
                                                        c2513Yp = null;
                                                        c5002l12.h = null;
                                                        c5002l12.i = null;
                                                        c5002l12.j = null;
                                                        c5002l12.s = 11;
                                                        if (s09.H(w32, c5002l12) == mn) {
                                                            return mn;
                                                        }
                                                        interfaceC6396rf7 = interfaceC6396rf12;
                                                        interfaceC2441Xr6 = interfaceC2441Xr5;
                                                        s05 = s09;
                                                        c2513Yp2 = s05.V;
                                                        if (c2513Yp2 != null) {
                                                            s05.V = c2513Yp;
                                                            c5002l12.d = interfaceC2441Xr6;
                                                            c5002l12.e = c2513Yp;
                                                            c5002l12.g = c2513Yp;
                                                            c5002l12.h = c2513Yp;
                                                            c5002l12.i = c2513Yp;
                                                            c5002l12.j = c2513Yp;
                                                            c5002l12.s = 12;
                                                            if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                                                return mn;
                                                            }
                                                            Unit unit5 = Unit.a;
                                                        }
                                                        return interfaceC2441Xr6;
                                                    }
                                                    Objects.toString(s09.a0);
                                                    c5002l12.d = s09;
                                                    c5002l12.e = interfaceC6396rf12;
                                                    c5002l12.g = null;
                                                    c5002l12.h = null;
                                                    c5002l12.i = null;
                                                    c5002l12.j = null;
                                                    c5002l12.s = 10;
                                                    objR = s09.r(abstractC7783yF4, h36, c5002l12);
                                                    if (objR == mn) {
                                                        return mn;
                                                    }
                                                    s010 = s09;
                                                    interfaceC2441Xr = (InterfaceC2441Xr) objR;
                                                    interfaceC6396rf7 = interfaceC6396rf12;
                                                    s05 = s010;
                                                }
                                            }
                                        } else {
                                            mn = mn2;
                                        }
                                        c2513Yp = null;
                                        interfaceC2441Xr6 = interfaceC2441Xr;
                                        c2513Yp2 = s05.V;
                                        if (c2513Yp2 != null) {
                                            s05.V = c2513Yp;
                                            c5002l12.d = interfaceC2441Xr6;
                                            c5002l12.e = c2513Yp;
                                            c5002l12.g = c2513Yp;
                                            c5002l12.h = c2513Yp;
                                            c5002l12.i = c2513Yp;
                                            c5002l12.j = c2513Yp;
                                            c5002l12.s = 12;
                                            if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                                return mn;
                                            }
                                            Unit unit6 = Unit.a;
                                        }
                                        return interfaceC2441Xr6;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn2;
            case 1:
                C1795Pt1.b(objR);
                return null;
            case 2:
                obj = objR;
                h33 = (H32) c5002l12.g;
                webSocketRequestAbstract2 = (WebSocketRequestAbstract) c5002l12.e;
                s02 = (S02) c5002l12.d;
                C1795Pt1.b(obj);
                interfaceC6396rf0 = (InterfaceC6396rf0) obj;
                c5002l12.d = s02;
                c5002l12.e = webSocketRequestAbstract2;
                c5002l12.g = h33;
                c5002l12.h = interfaceC6396rf0;
                c5002l12.i = s02;
                c5002l12.s = 3;
                objP = s02.p(c5002l12);
                if (objP != mn2) {
                    interfaceC6396rf1 = interfaceC6396rf0;
                    obj2 = objP;
                    webSocketRequestAbstract3 = webSocketRequestAbstract2;
                    s03 = s02;
                    h34 = h33;
                    s04 = s03;
                    s04.i0 = (Double) obj2;
                    Objects.toString(s03.a0);
                    c3034bs = new C3034bs();
                    enumC3495e41 = (EnumC3495e41) s03.c.r.getValue();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    c5002l12.d = s03;
                    c5002l12.e = webSocketRequestAbstract3;
                    c5002l12.g = h34;
                    c5002l12.h = interfaceC6396rf1;
                    c5002l12.i = c3034bs;
                    c5002l12.j = enumC3495e41;
                    c5002l12.m = jElapsedRealtime;
                    c5002l12.s = 4;
                    objN = s03.n(webSocketRequestAbstract3, c3034bs, c5002l12);
                    if (objN != mn2) {
                        obj3 = objN;
                        interfaceC6396rf2 = interfaceC6396rf1;
                        c3034bs2 = c3034bs;
                        webSocketRequestAbstract4 = webSocketRequestAbstract3;
                        enumC3495e42 = enumC3495e41;
                        interfaceC6396rf3 = (InterfaceC6396rf0) obj3;
                        Objects.toString(s03.a0);
                        C1126Hf0 c1126Hf2 = new C1126Hf0(interfaceC6396rf3, new C7735y12(c3034bs2, null));
                        MB mb2 = new MB(4);
                        c5002l12.d = s03;
                        c5002l12.e = webSocketRequestAbstract4;
                        c5002l12.g = h34;
                        c5002l12.h = interfaceC6396rf2;
                        c5002l12.i = c3034bs2;
                        c5002l12.j = enumC3495e42;
                        c5002l12.k = interfaceC6396rf3;
                        c5002l12.m = jElapsedRealtime;
                        c5002l12.s = 5;
                        objB = C7236vf0.b(c1126Hf2, j6, mb2, c5002l12);
                        if (objB != mn2) {
                            long j10 = jElapsedRealtime;
                            interfaceC6396rf4 = interfaceC6396rf2;
                            interfaceC6396rf5 = interfaceC6396rf3;
                            obj4 = objB;
                            h35 = h34;
                            c3034bs3 = c3034bs2;
                            s05 = s03;
                            j = j10;
                            resultOk = (ResultOk) obj4;
                            if (resultOk != null) {
                                abstractC7783yF = (AbstractC7783yF) resultOk.a();
                            } else {
                                abstractC7783yF = null;
                            }
                            if (abstractC7783yF == null) {
                                c2824asJ = s05.j(c3034bs3, j, enumC3495e42);
                                Objects.toString(s05.a0);
                                c2824asJ.a();
                                c2824asJ.b();
                                c3204ch = U0.w;
                                if (c3204ch != null) {
                                    str2 = s05.o0;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    name = webSocketRequestAbstract4.getName();
                                    if (name != null) {
                                        name2 = "unknown";
                                    } else {
                                        name2 = "unknown";
                                    }
                                    Long l3 = new Long(c2824asJ.b);
                                    String str17 = c2824asJ.a;
                                    String str18 = c2824asJ.d;
                                    String str19 = c2824asJ.e;
                                    String str110 = c2824asJ.c;
                                    c3204ch.getClass();
                                    long jLongValue3 = l3.longValue();
                                    int i6 = AppImpl.G;
                                    str6 = "requestId";
                                    Intrinsics.checkNotNullParameter(str2, str6);
                                    String str111 = str2;
                                    Intrinsics.checkNotNullParameter(name2, "name");
                                    str = "kind";
                                    Intrinsics.checkNotNullParameter(str17, str);
                                    c3204ch.d.x(str111, name2, str17, jLongValue3, str110, str18, str19);
                                    Unit unit7 = Unit.a;
                                    Unit unit8 = Unit.a;
                                } else {
                                    str = r2;
                                    str6 = str6;
                                }
                                c2824as = c2824asJ;
                            } else {
                                j6 = j6;
                                str = r2;
                                str6 = str6;
                                c2824as = null;
                            }
                            Objects.toString(s05.a0);
                            Objects.toString(abstractC7783yF);
                            c5002l12.d = s05;
                            c5002l12.e = h35;
                            c5002l12.g = interfaceC6396rf4;
                            c5002l12.h = c3034bs3;
                            c5002l12.i = interfaceC6396rf5;
                            c5002l12.j = abstractC7783yF;
                            c5002l12.k = null;
                            c5002l12.s = 6;
                            objW = s05.W(abstractC7783yF, h35, c2824as, c5002l12);
                            if (objW != mn2) {
                                interfaceC6396rf6 = interfaceC6396rf5;
                                abstractC7783yF2 = abstractC7783yF;
                                obj5 = objW;
                                interfaceC6396rf7 = interfaceC6396rf4;
                                interfaceC2441Xr = (InterfaceC2441Xr) obj5;
                                Objects.toString(s05.a0);
                                Objects.toString(interfaceC2441Xr);
                                if (abstractC7783yF2 instanceof C2337Wr) {
                                    c6120qK1 = s05.v;
                                    c5002l12.d = s05;
                                    c5002l12.e = h35;
                                    c5002l12.g = interfaceC2441Xr;
                                    c5002l12.h = interfaceC6396rf7;
                                    c5002l12.i = c3034bs3;
                                    c5002l12.j = interfaceC6396rf6;
                                    c5002l12.k = abstractC7783yF2;
                                    c5002l12.s = 7;
                                    if (c6120qK1.a(abstractC7783yF2, c5002l12) != mn2) {
                                        interfaceC2441Xr2 = interfaceC2441Xr;
                                        s06 = s05;
                                        abstractC7783yF3 = abstractC7783yF2;
                                        b.a aVar3 = b.e;
                                        jG = c.g(s06.r0, R40.SECONDS);
                                        C2337Wr c2337Wr2 = (C2337Wr) abstractC7783yF3;
                                        long j11 = c2337Wr2.b;
                                        long j12 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                                        j2 = j11 * j12;
                                        j3 = c2337Wr2.c * j12;
                                        iE = h35.e();
                                        c5002l12.d = s06;
                                        c5002l12.e = h35;
                                        c5002l12.g = interfaceC2441Xr2;
                                        c5002l12.h = interfaceC6396rf7;
                                        c5002l12.i = c3034bs3;
                                        c5002l12.j = interfaceC6396rf6;
                                        c5002l12.k = abstractC7783yF3;
                                        c3034bs4 = c3034bs3;
                                        gp1 = s06.P;
                                        c5002l12.l = gp1;
                                        c5002l12.m = jG;
                                        interfaceC6396rf8 = interfaceC6396rf7;
                                        interfaceC2441Xr3 = interfaceC2441Xr2;
                                        c5002l12.n = j2;
                                        c5002l12.o = j3;
                                        c5002l12.p = iE;
                                        c5002l12.s = 8;
                                        objD = s06.j.d(c5002l12);
                                        if (objD != mn2) {
                                            S02<T> s012 = s06;
                                            obj6 = objD;
                                            s07 = s012;
                                            i = iE;
                                            j4 = j3;
                                            c3034bs5 = c3034bs4;
                                            gp2 = gp1;
                                            interfaceC6396rf9 = interfaceC6396rf6;
                                            interfaceC2441Xr4 = interfaceC2441Xr3;
                                            interfaceC6396rf10 = interfaceC6396rf8;
                                            j5 = j2;
                                            String str112 = str6;
                                            interfaceC6396rf11 = interfaceC6396rf10;
                                            gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                                            long jP2 = b.p(jG, j6);
                                            Objects.toString(s07.a0);
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                            enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                                            c3034bs5.a = null;
                                            c3034bs5.b = null;
                                            str4 = str112;
                                            C1126Hf0 c1126Hf3 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                                            C4429iY c4429iY2 = new C4429iY(2);
                                            c5002l12.d = s07;
                                            c5002l12.e = h35;
                                            c5002l12.g = interfaceC2441Xr4;
                                            c5002l12.h = interfaceC6396rf11;
                                            c5002l12.i = c3034bs5;
                                            c5002l12.j = enumC3495e43;
                                            s08 = s07;
                                            c5002l12.k = null;
                                            c5002l12.l = null;
                                            c5002l12.m = jG;
                                            c5002l12.n = jElapsedRealtime2;
                                            c5002l12.s = 9;
                                            objB2 = C7236vf0.b(c1126Hf3, jP2, c4429iY2, c5002l12);
                                            mn = mn2;
                                            if (objB2 == mn) {
                                                return mn;
                                            }
                                            interfaceC2441Xr5 = interfaceC2441Xr4;
                                            interfaceC6396rf12 = interfaceC6396rf11;
                                            enumC3495e44 = enumC3495e43;
                                            h36 = h35;
                                            s09 = s08;
                                            resultOk2 = (ResultOk) objB2;
                                            if (resultOk2 != null) {
                                                abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                                            } else {
                                                abstractC7783yF4 = null;
                                            }
                                            Objects.toString(s09.a0);
                                            Objects.toString(abstractC7783yF4);
                                            if (abstractC7783yF4 != null) {
                                                Objects.toString(s09.a0);
                                                c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                                                Objects.toString(s09.a0);
                                                c2824asJ2.a();
                                                c2824asJ2.b();
                                                c4931kh = U0.x;
                                                if (c4931kh != null) {
                                                    str5 = s09.o0;
                                                    if (str5 == null) {
                                                        str5 = str3;
                                                    }
                                                    b.a aVar4 = b.e;
                                                    Integer num2 = new Integer((int) b.r(jG, R40.SECONDS));
                                                    Long l4 = new Long(c2824asJ2.b);
                                                    String str113 = c2824asJ2.a;
                                                    String str114 = c2824asJ2.d;
                                                    String str115 = c2824asJ2.e;
                                                    String str116 = c2824asJ2.c;
                                                    c4931kh.getClass();
                                                    int iIntValue2 = num2.intValue();
                                                    long jLongValue4 = l4.longValue();
                                                    int i7 = AppImpl.G;
                                                    Intrinsics.checkNotNullParameter(str5, str4);
                                                    Intrinsics.checkNotNullParameter(str113, str);
                                                    c4931kh.d.v(str5, iIntValue2, jLongValue4, str113, str116, str114, str115);
                                                    Unit unit9 = Unit.a;
                                                    Unit unit10 = Unit.a;
                                                }
                                                C7993zF response2 = new C7993zF("Timeout end");
                                                String strB2 = c2824asJ2.b();
                                                String strA2 = c2824asJ2.a();
                                                Intrinsics.checkNotNullParameter(response2, "response");
                                                s09.K(response2.b, response2.a, strB2, strA2);
                                                w32 = W32.a;
                                                c5002l12.d = s09;
                                                c5002l12.e = interfaceC2441Xr5;
                                                c5002l12.g = interfaceC6396rf12;
                                                c2513Yp = null;
                                                c5002l12.h = null;
                                                c5002l12.i = null;
                                                c5002l12.j = null;
                                                c5002l12.s = 11;
                                                if (s09.H(w32, c5002l12) == mn) {
                                                    return mn;
                                                }
                                                interfaceC6396rf7 = interfaceC6396rf12;
                                                interfaceC2441Xr6 = interfaceC2441Xr5;
                                                s05 = s09;
                                                c2513Yp2 = s05.V;
                                                if (c2513Yp2 != null) {
                                                    s05.V = c2513Yp;
                                                    c5002l12.d = interfaceC2441Xr6;
                                                    c5002l12.e = c2513Yp;
                                                    c5002l12.g = c2513Yp;
                                                    c5002l12.h = c2513Yp;
                                                    c5002l12.i = c2513Yp;
                                                    c5002l12.j = c2513Yp;
                                                    c5002l12.s = 12;
                                                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                                        return mn;
                                                    }
                                                    Unit unit11 = Unit.a;
                                                }
                                                return interfaceC2441Xr6;
                                            }
                                            Objects.toString(s09.a0);
                                            c5002l12.d = s09;
                                            c5002l12.e = interfaceC6396rf12;
                                            c5002l12.g = null;
                                            c5002l12.h = null;
                                            c5002l12.i = null;
                                            c5002l12.j = null;
                                            c5002l12.s = 10;
                                            objR = s09.r(abstractC7783yF4, h36, c5002l12);
                                            if (objR == mn) {
                                                return mn;
                                            }
                                            s010 = s09;
                                            interfaceC2441Xr = (InterfaceC2441Xr) objR;
                                            interfaceC6396rf7 = interfaceC6396rf12;
                                            s05 = s010;
                                        }
                                    }
                                } else {
                                    mn = mn2;
                                }
                                c2513Yp = null;
                                interfaceC2441Xr6 = interfaceC2441Xr;
                                c2513Yp2 = s05.V;
                                if (c2513Yp2 != null) {
                                    s05.V = c2513Yp;
                                    c5002l12.d = interfaceC2441Xr6;
                                    c5002l12.e = c2513Yp;
                                    c5002l12.g = c2513Yp;
                                    c5002l12.h = c2513Yp;
                                    c5002l12.i = c2513Yp;
                                    c5002l12.j = c2513Yp;
                                    c5002l12.s = 12;
                                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                        return mn;
                                    }
                                    Unit unit12 = Unit.a;
                                }
                                return interfaceC2441Xr6;
                            }
                        }
                    }
                }
                return mn2;
            case 3:
                obj2 = objR;
                s04 = (S02) c5002l12.i;
                InterfaceC6396rf0 interfaceC6396rf13 = (InterfaceC6396rf0) c5002l12.h;
                h34 = (H32) c5002l12.g;
                webSocketRequestAbstract3 = (WebSocketRequestAbstract) c5002l12.e;
                S02<T> s013 = (S02) c5002l12.d;
                C1795Pt1.b(obj2);
                interfaceC6396rf1 = interfaceC6396rf13;
                s03 = s013;
                s04.i0 = (Double) obj2;
                Objects.toString(s03.a0);
                c3034bs = new C3034bs();
                enumC3495e41 = (EnumC3495e41) s03.c.r.getValue();
                jElapsedRealtime = SystemClock.elapsedRealtime();
                c5002l12.d = s03;
                c5002l12.e = webSocketRequestAbstract3;
                c5002l12.g = h34;
                c5002l12.h = interfaceC6396rf1;
                c5002l12.i = c3034bs;
                c5002l12.j = enumC3495e41;
                c5002l12.m = jElapsedRealtime;
                c5002l12.s = 4;
                objN = s03.n(webSocketRequestAbstract3, c3034bs, c5002l12);
                if (objN != mn2) {
                    obj3 = objN;
                    interfaceC6396rf2 = interfaceC6396rf1;
                    c3034bs2 = c3034bs;
                    webSocketRequestAbstract4 = webSocketRequestAbstract3;
                    enumC3495e42 = enumC3495e41;
                    interfaceC6396rf3 = (InterfaceC6396rf0) obj3;
                    Objects.toString(s03.a0);
                    C1126Hf0 c1126Hf4 = new C1126Hf0(interfaceC6396rf3, new C7735y12(c3034bs2, null));
                    MB mb3 = new MB(4);
                    c5002l12.d = s03;
                    c5002l12.e = webSocketRequestAbstract4;
                    c5002l12.g = h34;
                    c5002l12.h = interfaceC6396rf2;
                    c5002l12.i = c3034bs2;
                    c5002l12.j = enumC3495e42;
                    c5002l12.k = interfaceC6396rf3;
                    c5002l12.m = jElapsedRealtime;
                    c5002l12.s = 5;
                    objB = C7236vf0.b(c1126Hf4, j6, mb3, c5002l12);
                    if (objB != mn2) {
                        long j13 = jElapsedRealtime;
                        interfaceC6396rf4 = interfaceC6396rf2;
                        interfaceC6396rf5 = interfaceC6396rf3;
                        obj4 = objB;
                        h35 = h34;
                        c3034bs3 = c3034bs2;
                        s05 = s03;
                        j = j13;
                        resultOk = (ResultOk) obj4;
                        if (resultOk != null) {
                            abstractC7783yF = (AbstractC7783yF) resultOk.a();
                        } else {
                            abstractC7783yF = null;
                        }
                        if (abstractC7783yF == null) {
                            c2824asJ = s05.j(c3034bs3, j, enumC3495e42);
                            Objects.toString(s05.a0);
                            c2824asJ.a();
                            c2824asJ.b();
                            c3204ch = U0.w;
                            if (c3204ch != null) {
                                str2 = s05.o0;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                name = webSocketRequestAbstract4.getName();
                                if (name != null) {
                                    name2 = "unknown";
                                } else {
                                    name2 = "unknown";
                                }
                                Long l5 = new Long(c2824asJ.b);
                                String str117 = c2824asJ.a;
                                String str118 = c2824asJ.d;
                                String str119 = c2824asJ.e;
                                String str1110 = c2824asJ.c;
                                c3204ch.getClass();
                                long jLongValue5 = l5.longValue();
                                int i8 = AppImpl.G;
                                str6 = "requestId";
                                Intrinsics.checkNotNullParameter(str2, str6);
                                String str1111 = str2;
                                Intrinsics.checkNotNullParameter(name2, "name");
                                str = "kind";
                                Intrinsics.checkNotNullParameter(str117, str);
                                c3204ch.d.x(str1111, name2, str117, jLongValue5, str1110, str118, str119);
                                Unit unit13 = Unit.a;
                                Unit unit14 = Unit.a;
                            } else {
                                str = r2;
                                str6 = str6;
                            }
                            c2824as = c2824asJ;
                        } else {
                            j6 = j6;
                            str = r2;
                            str6 = str6;
                            c2824as = null;
                        }
                        Objects.toString(s05.a0);
                        Objects.toString(abstractC7783yF);
                        c5002l12.d = s05;
                        c5002l12.e = h35;
                        c5002l12.g = interfaceC6396rf4;
                        c5002l12.h = c3034bs3;
                        c5002l12.i = interfaceC6396rf5;
                        c5002l12.j = abstractC7783yF;
                        c5002l12.k = null;
                        c5002l12.s = 6;
                        objW = s05.W(abstractC7783yF, h35, c2824as, c5002l12);
                        if (objW != mn2) {
                            interfaceC6396rf6 = interfaceC6396rf5;
                            abstractC7783yF2 = abstractC7783yF;
                            obj5 = objW;
                            interfaceC6396rf7 = interfaceC6396rf4;
                            interfaceC2441Xr = (InterfaceC2441Xr) obj5;
                            Objects.toString(s05.a0);
                            Objects.toString(interfaceC2441Xr);
                            if (abstractC7783yF2 instanceof C2337Wr) {
                                c6120qK1 = s05.v;
                                c5002l12.d = s05;
                                c5002l12.e = h35;
                                c5002l12.g = interfaceC2441Xr;
                                c5002l12.h = interfaceC6396rf7;
                                c5002l12.i = c3034bs3;
                                c5002l12.j = interfaceC6396rf6;
                                c5002l12.k = abstractC7783yF2;
                                c5002l12.s = 7;
                                if (c6120qK1.a(abstractC7783yF2, c5002l12) != mn2) {
                                    interfaceC2441Xr2 = interfaceC2441Xr;
                                    s06 = s05;
                                    abstractC7783yF3 = abstractC7783yF2;
                                    b.a aVar5 = b.e;
                                    jG = c.g(s06.r0, R40.SECONDS);
                                    C2337Wr c2337Wr3 = (C2337Wr) abstractC7783yF3;
                                    long j14 = c2337Wr3.b;
                                    long j15 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                                    j2 = j14 * j15;
                                    j3 = c2337Wr3.c * j15;
                                    iE = h35.e();
                                    c5002l12.d = s06;
                                    c5002l12.e = h35;
                                    c5002l12.g = interfaceC2441Xr2;
                                    c5002l12.h = interfaceC6396rf7;
                                    c5002l12.i = c3034bs3;
                                    c5002l12.j = interfaceC6396rf6;
                                    c5002l12.k = abstractC7783yF3;
                                    c3034bs4 = c3034bs3;
                                    gp1 = s06.P;
                                    c5002l12.l = gp1;
                                    c5002l12.m = jG;
                                    interfaceC6396rf8 = interfaceC6396rf7;
                                    interfaceC2441Xr3 = interfaceC2441Xr2;
                                    c5002l12.n = j2;
                                    c5002l12.o = j3;
                                    c5002l12.p = iE;
                                    c5002l12.s = 8;
                                    objD = s06.j.d(c5002l12);
                                    if (objD != mn2) {
                                        S02<T> s014 = s06;
                                        obj6 = objD;
                                        s07 = s014;
                                        i = iE;
                                        j4 = j3;
                                        c3034bs5 = c3034bs4;
                                        gp2 = gp1;
                                        interfaceC6396rf9 = interfaceC6396rf6;
                                        interfaceC2441Xr4 = interfaceC2441Xr3;
                                        interfaceC6396rf10 = interfaceC6396rf8;
                                        j5 = j2;
                                        String str1112 = str6;
                                        interfaceC6396rf11 = interfaceC6396rf10;
                                        gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                                        long jP3 = b.p(jG, j6);
                                        Objects.toString(s07.a0);
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                        enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                                        c3034bs5.a = null;
                                        c3034bs5.b = null;
                                        str4 = str1112;
                                        C1126Hf0 c1126Hf5 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                                        C4429iY c4429iY3 = new C4429iY(2);
                                        c5002l12.d = s07;
                                        c5002l12.e = h35;
                                        c5002l12.g = interfaceC2441Xr4;
                                        c5002l12.h = interfaceC6396rf11;
                                        c5002l12.i = c3034bs5;
                                        c5002l12.j = enumC3495e43;
                                        s08 = s07;
                                        c5002l12.k = null;
                                        c5002l12.l = null;
                                        c5002l12.m = jG;
                                        c5002l12.n = jElapsedRealtime2;
                                        c5002l12.s = 9;
                                        objB2 = C7236vf0.b(c1126Hf5, jP3, c4429iY3, c5002l12);
                                        mn = mn2;
                                        if (objB2 == mn) {
                                            return mn;
                                        }
                                        interfaceC2441Xr5 = interfaceC2441Xr4;
                                        interfaceC6396rf12 = interfaceC6396rf11;
                                        enumC3495e44 = enumC3495e43;
                                        h36 = h35;
                                        s09 = s08;
                                        resultOk2 = (ResultOk) objB2;
                                        if (resultOk2 != null) {
                                            abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                                        } else {
                                            abstractC7783yF4 = null;
                                        }
                                        Objects.toString(s09.a0);
                                        Objects.toString(abstractC7783yF4);
                                        if (abstractC7783yF4 != null) {
                                            Objects.toString(s09.a0);
                                            c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                                            Objects.toString(s09.a0);
                                            c2824asJ2.a();
                                            c2824asJ2.b();
                                            c4931kh = U0.x;
                                            if (c4931kh != null) {
                                                str5 = s09.o0;
                                                if (str5 == null) {
                                                    str5 = str3;
                                                }
                                                b.a aVar6 = b.e;
                                                Integer num3 = new Integer((int) b.r(jG, R40.SECONDS));
                                                Long l6 = new Long(c2824asJ2.b);
                                                String str1113 = c2824asJ2.a;
                                                String str1114 = c2824asJ2.d;
                                                String str1115 = c2824asJ2.e;
                                                String str1116 = c2824asJ2.c;
                                                c4931kh.getClass();
                                                int iIntValue3 = num3.intValue();
                                                long jLongValue6 = l6.longValue();
                                                int i9 = AppImpl.G;
                                                Intrinsics.checkNotNullParameter(str5, str4);
                                                Intrinsics.checkNotNullParameter(str1113, str);
                                                c4931kh.d.v(str5, iIntValue3, jLongValue6, str1113, str1116, str1114, str1115);
                                                Unit unit15 = Unit.a;
                                                Unit unit16 = Unit.a;
                                            }
                                            C7993zF response3 = new C7993zF("Timeout end");
                                            String strB3 = c2824asJ2.b();
                                            String strA3 = c2824asJ2.a();
                                            Intrinsics.checkNotNullParameter(response3, "response");
                                            s09.K(response3.b, response3.a, strB3, strA3);
                                            w32 = W32.a;
                                            c5002l12.d = s09;
                                            c5002l12.e = interfaceC2441Xr5;
                                            c5002l12.g = interfaceC6396rf12;
                                            c2513Yp = null;
                                            c5002l12.h = null;
                                            c5002l12.i = null;
                                            c5002l12.j = null;
                                            c5002l12.s = 11;
                                            if (s09.H(w32, c5002l12) == mn) {
                                                return mn;
                                            }
                                            interfaceC6396rf7 = interfaceC6396rf12;
                                            interfaceC2441Xr6 = interfaceC2441Xr5;
                                            s05 = s09;
                                            c2513Yp2 = s05.V;
                                            if (c2513Yp2 != null) {
                                                s05.V = c2513Yp;
                                                c5002l12.d = interfaceC2441Xr6;
                                                c5002l12.e = c2513Yp;
                                                c5002l12.g = c2513Yp;
                                                c5002l12.h = c2513Yp;
                                                c5002l12.i = c2513Yp;
                                                c5002l12.j = c2513Yp;
                                                c5002l12.s = 12;
                                                if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                                    return mn;
                                                }
                                                Unit unit17 = Unit.a;
                                            }
                                            return interfaceC2441Xr6;
                                        }
                                        Objects.toString(s09.a0);
                                        c5002l12.d = s09;
                                        c5002l12.e = interfaceC6396rf12;
                                        c5002l12.g = null;
                                        c5002l12.h = null;
                                        c5002l12.i = null;
                                        c5002l12.j = null;
                                        c5002l12.s = 10;
                                        objR = s09.r(abstractC7783yF4, h36, c5002l12);
                                        if (objR == mn) {
                                            return mn;
                                        }
                                        s010 = s09;
                                        interfaceC2441Xr = (InterfaceC2441Xr) objR;
                                        interfaceC6396rf7 = interfaceC6396rf12;
                                        s05 = s010;
                                    }
                                }
                            } else {
                                mn = mn2;
                            }
                            c2513Yp = null;
                            interfaceC2441Xr6 = interfaceC2441Xr;
                            c2513Yp2 = s05.V;
                            if (c2513Yp2 != null) {
                                s05.V = c2513Yp;
                                c5002l12.d = interfaceC2441Xr6;
                                c5002l12.e = c2513Yp;
                                c5002l12.g = c2513Yp;
                                c5002l12.h = c2513Yp;
                                c5002l12.i = c2513Yp;
                                c5002l12.j = c2513Yp;
                                c5002l12.s = 12;
                                if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                    return mn;
                                }
                                Unit unit18 = Unit.a;
                            }
                            return interfaceC2441Xr6;
                        }
                    }
                }
                return mn2;
            case 4:
                long j16 = c5002l12.m;
                EnumC3495e41 enumC3495e45 = (EnumC3495e41) c5002l12.j;
                C3034bs c3034bs6 = (C3034bs) c5002l12.i;
                InterfaceC6396rf0 interfaceC6396rf14 = (InterfaceC6396rf0) c5002l12.h;
                H32 h37 = (H32) c5002l12.g;
                WebSocketRequestAbstract webSocketRequestAbstract5 = (WebSocketRequestAbstract) c5002l12.e;
                s03 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                interfaceC6396rf2 = interfaceC6396rf14;
                c3034bs2 = c3034bs6;
                h34 = h37;
                enumC3495e42 = enumC3495e45;
                webSocketRequestAbstract4 = webSocketRequestAbstract5;
                obj3 = objR;
                jElapsedRealtime = j16;
                interfaceC6396rf3 = (InterfaceC6396rf0) obj3;
                Objects.toString(s03.a0);
                C1126Hf0 c1126Hf6 = new C1126Hf0(interfaceC6396rf3, new C7735y12(c3034bs2, null));
                MB mb4 = new MB(4);
                c5002l12.d = s03;
                c5002l12.e = webSocketRequestAbstract4;
                c5002l12.g = h34;
                c5002l12.h = interfaceC6396rf2;
                c5002l12.i = c3034bs2;
                c5002l12.j = enumC3495e42;
                c5002l12.k = interfaceC6396rf3;
                c5002l12.m = jElapsedRealtime;
                c5002l12.s = 5;
                objB = C7236vf0.b(c1126Hf6, j6, mb4, c5002l12);
                if (objB != mn2) {
                    long j17 = jElapsedRealtime;
                    interfaceC6396rf4 = interfaceC6396rf2;
                    interfaceC6396rf5 = interfaceC6396rf3;
                    obj4 = objB;
                    h35 = h34;
                    c3034bs3 = c3034bs2;
                    s05 = s03;
                    j = j17;
                    resultOk = (ResultOk) obj4;
                    if (resultOk != null) {
                        abstractC7783yF = (AbstractC7783yF) resultOk.a();
                    } else {
                        abstractC7783yF = null;
                    }
                    if (abstractC7783yF == null) {
                        c2824asJ = s05.j(c3034bs3, j, enumC3495e42);
                        Objects.toString(s05.a0);
                        c2824asJ.a();
                        c2824asJ.b();
                        c3204ch = U0.w;
                        if (c3204ch != null) {
                            str2 = s05.o0;
                            if (str2 == null) {
                                str2 = "";
                            }
                            name = webSocketRequestAbstract4.getName();
                            if (name != null) {
                                name2 = "unknown";
                            } else {
                                name2 = "unknown";
                            }
                            Long l7 = new Long(c2824asJ.b);
                            String str1117 = c2824asJ.a;
                            String str1118 = c2824asJ.d;
                            String str1119 = c2824asJ.e;
                            String str11110 = c2824asJ.c;
                            c3204ch.getClass();
                            long jLongValue7 = l7.longValue();
                            int i10 = AppImpl.G;
                            str6 = "requestId";
                            Intrinsics.checkNotNullParameter(str2, str6);
                            String str11111 = str2;
                            Intrinsics.checkNotNullParameter(name2, "name");
                            str = "kind";
                            Intrinsics.checkNotNullParameter(str1117, str);
                            c3204ch.d.x(str11111, name2, str1117, jLongValue7, str11110, str1118, str1119);
                            Unit unit19 = Unit.a;
                            Unit unit110 = Unit.a;
                        } else {
                            str = r2;
                            str6 = str6;
                        }
                        c2824as = c2824asJ;
                    } else {
                        j6 = j6;
                        str = r2;
                        str6 = str6;
                        c2824as = null;
                    }
                    Objects.toString(s05.a0);
                    Objects.toString(abstractC7783yF);
                    c5002l12.d = s05;
                    c5002l12.e = h35;
                    c5002l12.g = interfaceC6396rf4;
                    c5002l12.h = c3034bs3;
                    c5002l12.i = interfaceC6396rf5;
                    c5002l12.j = abstractC7783yF;
                    c5002l12.k = null;
                    c5002l12.s = 6;
                    objW = s05.W(abstractC7783yF, h35, c2824as, c5002l12);
                    if (objW != mn2) {
                        interfaceC6396rf6 = interfaceC6396rf5;
                        abstractC7783yF2 = abstractC7783yF;
                        obj5 = objW;
                        interfaceC6396rf7 = interfaceC6396rf4;
                        interfaceC2441Xr = (InterfaceC2441Xr) obj5;
                        Objects.toString(s05.a0);
                        Objects.toString(interfaceC2441Xr);
                        if (abstractC7783yF2 instanceof C2337Wr) {
                            c6120qK1 = s05.v;
                            c5002l12.d = s05;
                            c5002l12.e = h35;
                            c5002l12.g = interfaceC2441Xr;
                            c5002l12.h = interfaceC6396rf7;
                            c5002l12.i = c3034bs3;
                            c5002l12.j = interfaceC6396rf6;
                            c5002l12.k = abstractC7783yF2;
                            c5002l12.s = 7;
                            if (c6120qK1.a(abstractC7783yF2, c5002l12) != mn2) {
                                interfaceC2441Xr2 = interfaceC2441Xr;
                                s06 = s05;
                                abstractC7783yF3 = abstractC7783yF2;
                                b.a aVar7 = b.e;
                                jG = c.g(s06.r0, R40.SECONDS);
                                C2337Wr c2337Wr4 = (C2337Wr) abstractC7783yF3;
                                long j18 = c2337Wr4.b;
                                long j19 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                                j2 = j18 * j19;
                                j3 = c2337Wr4.c * j19;
                                iE = h35.e();
                                c5002l12.d = s06;
                                c5002l12.e = h35;
                                c5002l12.g = interfaceC2441Xr2;
                                c5002l12.h = interfaceC6396rf7;
                                c5002l12.i = c3034bs3;
                                c5002l12.j = interfaceC6396rf6;
                                c5002l12.k = abstractC7783yF3;
                                c3034bs4 = c3034bs3;
                                gp1 = s06.P;
                                c5002l12.l = gp1;
                                c5002l12.m = jG;
                                interfaceC6396rf8 = interfaceC6396rf7;
                                interfaceC2441Xr3 = interfaceC2441Xr2;
                                c5002l12.n = j2;
                                c5002l12.o = j3;
                                c5002l12.p = iE;
                                c5002l12.s = 8;
                                objD = s06.j.d(c5002l12);
                                if (objD != mn2) {
                                    S02<T> s015 = s06;
                                    obj6 = objD;
                                    s07 = s015;
                                    i = iE;
                                    j4 = j3;
                                    c3034bs5 = c3034bs4;
                                    gp2 = gp1;
                                    interfaceC6396rf9 = interfaceC6396rf6;
                                    interfaceC2441Xr4 = interfaceC2441Xr3;
                                    interfaceC6396rf10 = interfaceC6396rf8;
                                    j5 = j2;
                                    String str11112 = str6;
                                    interfaceC6396rf11 = interfaceC6396rf10;
                                    gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                                    long jP4 = b.p(jG, j6);
                                    Objects.toString(s07.a0);
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                                    c3034bs5.a = null;
                                    c3034bs5.b = null;
                                    str4 = str11112;
                                    C1126Hf0 c1126Hf7 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                                    C4429iY c4429iY4 = new C4429iY(2);
                                    c5002l12.d = s07;
                                    c5002l12.e = h35;
                                    c5002l12.g = interfaceC2441Xr4;
                                    c5002l12.h = interfaceC6396rf11;
                                    c5002l12.i = c3034bs5;
                                    c5002l12.j = enumC3495e43;
                                    s08 = s07;
                                    c5002l12.k = null;
                                    c5002l12.l = null;
                                    c5002l12.m = jG;
                                    c5002l12.n = jElapsedRealtime2;
                                    c5002l12.s = 9;
                                    objB2 = C7236vf0.b(c1126Hf7, jP4, c4429iY4, c5002l12);
                                    mn = mn2;
                                    if (objB2 == mn) {
                                        return mn;
                                    }
                                    interfaceC2441Xr5 = interfaceC2441Xr4;
                                    interfaceC6396rf12 = interfaceC6396rf11;
                                    enumC3495e44 = enumC3495e43;
                                    h36 = h35;
                                    s09 = s08;
                                    resultOk2 = (ResultOk) objB2;
                                    if (resultOk2 != null) {
                                        abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                                    } else {
                                        abstractC7783yF4 = null;
                                    }
                                    Objects.toString(s09.a0);
                                    Objects.toString(abstractC7783yF4);
                                    if (abstractC7783yF4 != null) {
                                        Objects.toString(s09.a0);
                                        c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                                        Objects.toString(s09.a0);
                                        c2824asJ2.a();
                                        c2824asJ2.b();
                                        c4931kh = U0.x;
                                        if (c4931kh != null) {
                                            str5 = s09.o0;
                                            if (str5 == null) {
                                                str5 = str3;
                                            }
                                            b.a aVar8 = b.e;
                                            Integer num4 = new Integer((int) b.r(jG, R40.SECONDS));
                                            Long l8 = new Long(c2824asJ2.b);
                                            String str11113 = c2824asJ2.a;
                                            String str11114 = c2824asJ2.d;
                                            String str11115 = c2824asJ2.e;
                                            String str11116 = c2824asJ2.c;
                                            c4931kh.getClass();
                                            int iIntValue4 = num4.intValue();
                                            long jLongValue8 = l8.longValue();
                                            int i11 = AppImpl.G;
                                            Intrinsics.checkNotNullParameter(str5, str4);
                                            Intrinsics.checkNotNullParameter(str11113, str);
                                            c4931kh.d.v(str5, iIntValue4, jLongValue8, str11113, str11116, str11114, str11115);
                                            Unit unit111 = Unit.a;
                                            Unit unit112 = Unit.a;
                                        }
                                        C7993zF response4 = new C7993zF("Timeout end");
                                        String strB4 = c2824asJ2.b();
                                        String strA4 = c2824asJ2.a();
                                        Intrinsics.checkNotNullParameter(response4, "response");
                                        s09.K(response4.b, response4.a, strB4, strA4);
                                        w32 = W32.a;
                                        c5002l12.d = s09;
                                        c5002l12.e = interfaceC2441Xr5;
                                        c5002l12.g = interfaceC6396rf12;
                                        c2513Yp = null;
                                        c5002l12.h = null;
                                        c5002l12.i = null;
                                        c5002l12.j = null;
                                        c5002l12.s = 11;
                                        if (s09.H(w32, c5002l12) == mn) {
                                            return mn;
                                        }
                                        interfaceC6396rf7 = interfaceC6396rf12;
                                        interfaceC2441Xr6 = interfaceC2441Xr5;
                                        s05 = s09;
                                        c2513Yp2 = s05.V;
                                        if (c2513Yp2 != null) {
                                            s05.V = c2513Yp;
                                            c5002l12.d = interfaceC2441Xr6;
                                            c5002l12.e = c2513Yp;
                                            c5002l12.g = c2513Yp;
                                            c5002l12.h = c2513Yp;
                                            c5002l12.i = c2513Yp;
                                            c5002l12.j = c2513Yp;
                                            c5002l12.s = 12;
                                            if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                                return mn;
                                            }
                                            Unit unit113 = Unit.a;
                                        }
                                        return interfaceC2441Xr6;
                                    }
                                    Objects.toString(s09.a0);
                                    c5002l12.d = s09;
                                    c5002l12.e = interfaceC6396rf12;
                                    c5002l12.g = null;
                                    c5002l12.h = null;
                                    c5002l12.i = null;
                                    c5002l12.j = null;
                                    c5002l12.s = 10;
                                    objR = s09.r(abstractC7783yF4, h36, c5002l12);
                                    if (objR == mn) {
                                        return mn;
                                    }
                                    s010 = s09;
                                    interfaceC2441Xr = (InterfaceC2441Xr) objR;
                                    interfaceC6396rf7 = interfaceC6396rf12;
                                    s05 = s010;
                                }
                            }
                        } else {
                            mn = mn2;
                        }
                        c2513Yp = null;
                        interfaceC2441Xr6 = interfaceC2441Xr;
                        c2513Yp2 = s05.V;
                        if (c2513Yp2 != null) {
                            s05.V = c2513Yp;
                            c5002l12.d = interfaceC2441Xr6;
                            c5002l12.e = c2513Yp;
                            c5002l12.g = c2513Yp;
                            c5002l12.h = c2513Yp;
                            c5002l12.i = c2513Yp;
                            c5002l12.j = c2513Yp;
                            c5002l12.s = 12;
                            if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                return mn;
                            }
                            Unit unit114 = Unit.a;
                        }
                        return interfaceC2441Xr6;
                    }
                }
                return mn2;
            case 5:
                j = c5002l12.m;
                InterfaceC6396rf0 interfaceC6396rf15 = (InterfaceC6396rf0) c5002l12.k;
                enumC3495e42 = (EnumC3495e41) c5002l12.j;
                C3034bs c3034bs7 = (C3034bs) c5002l12.i;
                interfaceC6396rf4 = (InterfaceC6396rf0) c5002l12.h;
                h35 = (H32) c5002l12.g;
                webSocketRequestAbstract4 = (WebSocketRequestAbstract) c5002l12.e;
                S02<T> s016 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                interfaceC6396rf5 = interfaceC6396rf15;
                c3034bs3 = c3034bs7;
                s05 = s016;
                obj4 = objR;
                resultOk = (ResultOk) obj4;
                if (resultOk != null) {
                    abstractC7783yF = (AbstractC7783yF) resultOk.a();
                } else {
                    abstractC7783yF = null;
                }
                if (abstractC7783yF == null) {
                    c2824asJ = s05.j(c3034bs3, j, enumC3495e42);
                    Objects.toString(s05.a0);
                    c2824asJ.a();
                    c2824asJ.b();
                    c3204ch = U0.w;
                    if (c3204ch != null) {
                        str2 = s05.o0;
                        if (str2 == null) {
                            str2 = "";
                        }
                        name = webSocketRequestAbstract4.getName();
                        if (name != null) {
                            name2 = "unknown";
                        } else {
                            name2 = "unknown";
                        }
                        Long l9 = new Long(c2824asJ.b);
                        String str11117 = c2824asJ.a;
                        String str11118 = c2824asJ.d;
                        String str11119 = c2824asJ.e;
                        String str111110 = c2824asJ.c;
                        c3204ch.getClass();
                        long jLongValue9 = l9.longValue();
                        int i12 = AppImpl.G;
                        str6 = "requestId";
                        Intrinsics.checkNotNullParameter(str2, str6);
                        String str111111 = str2;
                        Intrinsics.checkNotNullParameter(name2, "name");
                        str = "kind";
                        Intrinsics.checkNotNullParameter(str11117, str);
                        c3204ch.d.x(str111111, name2, str11117, jLongValue9, str111110, str11118, str11119);
                        Unit unit115 = Unit.a;
                        Unit unit116 = Unit.a;
                    } else {
                        str = r2;
                        str6 = str6;
                    }
                    c2824as = c2824asJ;
                } else {
                    j6 = j6;
                    str = r2;
                    str6 = str6;
                    c2824as = null;
                }
                Objects.toString(s05.a0);
                Objects.toString(abstractC7783yF);
                c5002l12.d = s05;
                c5002l12.e = h35;
                c5002l12.g = interfaceC6396rf4;
                c5002l12.h = c3034bs3;
                c5002l12.i = interfaceC6396rf5;
                c5002l12.j = abstractC7783yF;
                c5002l12.k = null;
                c5002l12.s = 6;
                objW = s05.W(abstractC7783yF, h35, c2824as, c5002l12);
                if (objW != mn2) {
                    interfaceC6396rf6 = interfaceC6396rf5;
                    abstractC7783yF2 = abstractC7783yF;
                    obj5 = objW;
                    interfaceC6396rf7 = interfaceC6396rf4;
                    interfaceC2441Xr = (InterfaceC2441Xr) obj5;
                    Objects.toString(s05.a0);
                    Objects.toString(interfaceC2441Xr);
                    if (abstractC7783yF2 instanceof C2337Wr) {
                        c6120qK1 = s05.v;
                        c5002l12.d = s05;
                        c5002l12.e = h35;
                        c5002l12.g = interfaceC2441Xr;
                        c5002l12.h = interfaceC6396rf7;
                        c5002l12.i = c3034bs3;
                        c5002l12.j = interfaceC6396rf6;
                        c5002l12.k = abstractC7783yF2;
                        c5002l12.s = 7;
                        if (c6120qK1.a(abstractC7783yF2, c5002l12) != mn2) {
                            interfaceC2441Xr2 = interfaceC2441Xr;
                            s06 = s05;
                            abstractC7783yF3 = abstractC7783yF2;
                            b.a aVar9 = b.e;
                            jG = c.g(s06.r0, R40.SECONDS);
                            C2337Wr c2337Wr5 = (C2337Wr) abstractC7783yF3;
                            long j110 = c2337Wr5.b;
                            long j111 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                            j2 = j110 * j111;
                            j3 = c2337Wr5.c * j111;
                            iE = h35.e();
                            c5002l12.d = s06;
                            c5002l12.e = h35;
                            c5002l12.g = interfaceC2441Xr2;
                            c5002l12.h = interfaceC6396rf7;
                            c5002l12.i = c3034bs3;
                            c5002l12.j = interfaceC6396rf6;
                            c5002l12.k = abstractC7783yF3;
                            c3034bs4 = c3034bs3;
                            gp1 = s06.P;
                            c5002l12.l = gp1;
                            c5002l12.m = jG;
                            interfaceC6396rf8 = interfaceC6396rf7;
                            interfaceC2441Xr3 = interfaceC2441Xr2;
                            c5002l12.n = j2;
                            c5002l12.o = j3;
                            c5002l12.p = iE;
                            c5002l12.s = 8;
                            objD = s06.j.d(c5002l12);
                            if (objD != mn2) {
                                S02<T> s017 = s06;
                                obj6 = objD;
                                s07 = s017;
                                i = iE;
                                j4 = j3;
                                c3034bs5 = c3034bs4;
                                gp2 = gp1;
                                interfaceC6396rf9 = interfaceC6396rf6;
                                interfaceC2441Xr4 = interfaceC2441Xr3;
                                interfaceC6396rf10 = interfaceC6396rf8;
                                j5 = j2;
                                String str111112 = str6;
                                interfaceC6396rf11 = interfaceC6396rf10;
                                gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                                long jP5 = b.p(jG, j6);
                                Objects.toString(s07.a0);
                                jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                                c3034bs5.a = null;
                                c3034bs5.b = null;
                                str4 = str111112;
                                C1126Hf0 c1126Hf8 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                                C4429iY c4429iY5 = new C4429iY(2);
                                c5002l12.d = s07;
                                c5002l12.e = h35;
                                c5002l12.g = interfaceC2441Xr4;
                                c5002l12.h = interfaceC6396rf11;
                                c5002l12.i = c3034bs5;
                                c5002l12.j = enumC3495e43;
                                s08 = s07;
                                c5002l12.k = null;
                                c5002l12.l = null;
                                c5002l12.m = jG;
                                c5002l12.n = jElapsedRealtime2;
                                c5002l12.s = 9;
                                objB2 = C7236vf0.b(c1126Hf8, jP5, c4429iY5, c5002l12);
                                mn = mn2;
                                if (objB2 == mn) {
                                    return mn;
                                }
                                interfaceC2441Xr5 = interfaceC2441Xr4;
                                interfaceC6396rf12 = interfaceC6396rf11;
                                enumC3495e44 = enumC3495e43;
                                h36 = h35;
                                s09 = s08;
                                resultOk2 = (ResultOk) objB2;
                                if (resultOk2 != null) {
                                    abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                                } else {
                                    abstractC7783yF4 = null;
                                }
                                Objects.toString(s09.a0);
                                Objects.toString(abstractC7783yF4);
                                if (abstractC7783yF4 != null) {
                                    Objects.toString(s09.a0);
                                    c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                                    Objects.toString(s09.a0);
                                    c2824asJ2.a();
                                    c2824asJ2.b();
                                    c4931kh = U0.x;
                                    if (c4931kh != null) {
                                        str5 = s09.o0;
                                        if (str5 == null) {
                                            str5 = str3;
                                        }
                                        b.a aVar10 = b.e;
                                        Integer num5 = new Integer((int) b.r(jG, R40.SECONDS));
                                        Long l10 = new Long(c2824asJ2.b);
                                        String str111113 = c2824asJ2.a;
                                        String str111114 = c2824asJ2.d;
                                        String str111115 = c2824asJ2.e;
                                        String str111116 = c2824asJ2.c;
                                        c4931kh.getClass();
                                        int iIntValue5 = num5.intValue();
                                        long jLongValue10 = l10.longValue();
                                        int i13 = AppImpl.G;
                                        Intrinsics.checkNotNullParameter(str5, str4);
                                        Intrinsics.checkNotNullParameter(str111113, str);
                                        c4931kh.d.v(str5, iIntValue5, jLongValue10, str111113, str111116, str111114, str111115);
                                        Unit unit117 = Unit.a;
                                        Unit unit118 = Unit.a;
                                    }
                                    C7993zF response5 = new C7993zF("Timeout end");
                                    String strB5 = c2824asJ2.b();
                                    String strA5 = c2824asJ2.a();
                                    Intrinsics.checkNotNullParameter(response5, "response");
                                    s09.K(response5.b, response5.a, strB5, strA5);
                                    w32 = W32.a;
                                    c5002l12.d = s09;
                                    c5002l12.e = interfaceC2441Xr5;
                                    c5002l12.g = interfaceC6396rf12;
                                    c2513Yp = null;
                                    c5002l12.h = null;
                                    c5002l12.i = null;
                                    c5002l12.j = null;
                                    c5002l12.s = 11;
                                    if (s09.H(w32, c5002l12) == mn) {
                                        return mn;
                                    }
                                    interfaceC6396rf7 = interfaceC6396rf12;
                                    interfaceC2441Xr6 = interfaceC2441Xr5;
                                    s05 = s09;
                                    c2513Yp2 = s05.V;
                                    if (c2513Yp2 != null) {
                                        s05.V = c2513Yp;
                                        c5002l12.d = interfaceC2441Xr6;
                                        c5002l12.e = c2513Yp;
                                        c5002l12.g = c2513Yp;
                                        c5002l12.h = c2513Yp;
                                        c5002l12.i = c2513Yp;
                                        c5002l12.j = c2513Yp;
                                        c5002l12.s = 12;
                                        if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                            return mn;
                                        }
                                        Unit unit119 = Unit.a;
                                    }
                                    return interfaceC2441Xr6;
                                }
                                Objects.toString(s09.a0);
                                c5002l12.d = s09;
                                c5002l12.e = interfaceC6396rf12;
                                c5002l12.g = null;
                                c5002l12.h = null;
                                c5002l12.i = null;
                                c5002l12.j = null;
                                c5002l12.s = 10;
                                objR = s09.r(abstractC7783yF4, h36, c5002l12);
                                if (objR == mn) {
                                    return mn;
                                }
                                s010 = s09;
                                interfaceC2441Xr = (InterfaceC2441Xr) objR;
                                interfaceC6396rf7 = interfaceC6396rf12;
                                s05 = s010;
                            }
                        }
                    } else {
                        mn = mn2;
                    }
                    c2513Yp = null;
                    interfaceC2441Xr6 = interfaceC2441Xr;
                    c2513Yp2 = s05.V;
                    if (c2513Yp2 != null) {
                        s05.V = c2513Yp;
                        c5002l12.d = interfaceC2441Xr6;
                        c5002l12.e = c2513Yp;
                        c5002l12.g = c2513Yp;
                        c5002l12.h = c2513Yp;
                        c5002l12.i = c2513Yp;
                        c5002l12.j = c2513Yp;
                        c5002l12.s = 12;
                        if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                            return mn;
                        }
                        Unit unit1110 = Unit.a;
                    }
                    return interfaceC2441Xr6;
                }
                return mn2;
            case 6:
                AbstractC7783yF abstractC7783yF5 = (AbstractC7783yF) c5002l12.j;
                interfaceC6396rf6 = (InterfaceC6396rf0) c5002l12.i;
                C3034bs c3034bs8 = (C3034bs) c5002l12.h;
                interfaceC6396rf7 = (InterfaceC6396rf0) c5002l12.g;
                H32 h38 = (H32) c5002l12.e;
                s05 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                str = "kind";
                c3034bs3 = c3034bs8;
                abstractC7783yF2 = abstractC7783yF5;
                h35 = h38;
                j6 = j6;
                obj5 = objR;
                str3 = "";
                interfaceC2441Xr = (InterfaceC2441Xr) obj5;
                Objects.toString(s05.a0);
                Objects.toString(interfaceC2441Xr);
                if (abstractC7783yF2 instanceof C2337Wr) {
                    c6120qK1 = s05.v;
                    c5002l12.d = s05;
                    c5002l12.e = h35;
                    c5002l12.g = interfaceC2441Xr;
                    c5002l12.h = interfaceC6396rf7;
                    c5002l12.i = c3034bs3;
                    c5002l12.j = interfaceC6396rf6;
                    c5002l12.k = abstractC7783yF2;
                    c5002l12.s = 7;
                    if (c6120qK1.a(abstractC7783yF2, c5002l12) != mn2) {
                        interfaceC2441Xr2 = interfaceC2441Xr;
                        s06 = s05;
                        abstractC7783yF3 = abstractC7783yF2;
                        b.a aVar11 = b.e;
                        jG = c.g(s06.r0, R40.SECONDS);
                        C2337Wr c2337Wr6 = (C2337Wr) abstractC7783yF3;
                        long j112 = c2337Wr6.b;
                        long j113 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                        j2 = j112 * j113;
                        j3 = c2337Wr6.c * j113;
                        iE = h35.e();
                        c5002l12.d = s06;
                        c5002l12.e = h35;
                        c5002l12.g = interfaceC2441Xr2;
                        c5002l12.h = interfaceC6396rf7;
                        c5002l12.i = c3034bs3;
                        c5002l12.j = interfaceC6396rf6;
                        c5002l12.k = abstractC7783yF3;
                        c3034bs4 = c3034bs3;
                        gp1 = s06.P;
                        c5002l12.l = gp1;
                        c5002l12.m = jG;
                        interfaceC6396rf8 = interfaceC6396rf7;
                        interfaceC2441Xr3 = interfaceC2441Xr2;
                        c5002l12.n = j2;
                        c5002l12.o = j3;
                        c5002l12.p = iE;
                        c5002l12.s = 8;
                        objD = s06.j.d(c5002l12);
                        if (objD != mn2) {
                            S02<T> s018 = s06;
                            obj6 = objD;
                            s07 = s018;
                            i = iE;
                            j4 = j3;
                            c3034bs5 = c3034bs4;
                            gp2 = gp1;
                            interfaceC6396rf9 = interfaceC6396rf6;
                            interfaceC2441Xr4 = interfaceC2441Xr3;
                            interfaceC6396rf10 = interfaceC6396rf8;
                            j5 = j2;
                            String str111117 = str6;
                            interfaceC6396rf11 = interfaceC6396rf10;
                            gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                            long jP6 = b.p(jG, j6);
                            Objects.toString(s07.a0);
                            jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                            c3034bs5.a = null;
                            c3034bs5.b = null;
                            str4 = str111117;
                            C1126Hf0 c1126Hf9 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                            C4429iY c4429iY6 = new C4429iY(2);
                            c5002l12.d = s07;
                            c5002l12.e = h35;
                            c5002l12.g = interfaceC2441Xr4;
                            c5002l12.h = interfaceC6396rf11;
                            c5002l12.i = c3034bs5;
                            c5002l12.j = enumC3495e43;
                            s08 = s07;
                            c5002l12.k = null;
                            c5002l12.l = null;
                            c5002l12.m = jG;
                            c5002l12.n = jElapsedRealtime2;
                            c5002l12.s = 9;
                            objB2 = C7236vf0.b(c1126Hf9, jP6, c4429iY6, c5002l12);
                            mn = mn2;
                            if (objB2 == mn) {
                                return mn;
                            }
                            interfaceC2441Xr5 = interfaceC2441Xr4;
                            interfaceC6396rf12 = interfaceC6396rf11;
                            enumC3495e44 = enumC3495e43;
                            h36 = h35;
                            s09 = s08;
                            resultOk2 = (ResultOk) objB2;
                            if (resultOk2 != null) {
                                abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                            } else {
                                abstractC7783yF4 = null;
                            }
                            Objects.toString(s09.a0);
                            Objects.toString(abstractC7783yF4);
                            if (abstractC7783yF4 != null) {
                                Objects.toString(s09.a0);
                                c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                                Objects.toString(s09.a0);
                                c2824asJ2.a();
                                c2824asJ2.b();
                                c4931kh = U0.x;
                                if (c4931kh != null) {
                                    str5 = s09.o0;
                                    if (str5 == null) {
                                        str5 = str3;
                                    }
                                    b.a aVar12 = b.e;
                                    Integer num6 = new Integer((int) b.r(jG, R40.SECONDS));
                                    Long l11 = new Long(c2824asJ2.b);
                                    String str111118 = c2824asJ2.a;
                                    String str111119 = c2824asJ2.d;
                                    String str1111110 = c2824asJ2.e;
                                    String str1111111 = c2824asJ2.c;
                                    c4931kh.getClass();
                                    int iIntValue6 = num6.intValue();
                                    long jLongValue11 = l11.longValue();
                                    int i14 = AppImpl.G;
                                    Intrinsics.checkNotNullParameter(str5, str4);
                                    Intrinsics.checkNotNullParameter(str111118, str);
                                    c4931kh.d.v(str5, iIntValue6, jLongValue11, str111118, str1111111, str111119, str1111110);
                                    Unit unit1111 = Unit.a;
                                    Unit unit1112 = Unit.a;
                                }
                                C7993zF response6 = new C7993zF("Timeout end");
                                String strB6 = c2824asJ2.b();
                                String strA6 = c2824asJ2.a();
                                Intrinsics.checkNotNullParameter(response6, "response");
                                s09.K(response6.b, response6.a, strB6, strA6);
                                w32 = W32.a;
                                c5002l12.d = s09;
                                c5002l12.e = interfaceC2441Xr5;
                                c5002l12.g = interfaceC6396rf12;
                                c2513Yp = null;
                                c5002l12.h = null;
                                c5002l12.i = null;
                                c5002l12.j = null;
                                c5002l12.s = 11;
                                if (s09.H(w32, c5002l12) == mn) {
                                    return mn;
                                }
                                interfaceC6396rf7 = interfaceC6396rf12;
                                interfaceC2441Xr6 = interfaceC2441Xr5;
                                s05 = s09;
                                c2513Yp2 = s05.V;
                                if (c2513Yp2 != null) {
                                    s05.V = c2513Yp;
                                    c5002l12.d = interfaceC2441Xr6;
                                    c5002l12.e = c2513Yp;
                                    c5002l12.g = c2513Yp;
                                    c5002l12.h = c2513Yp;
                                    c5002l12.i = c2513Yp;
                                    c5002l12.j = c2513Yp;
                                    c5002l12.s = 12;
                                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                        return mn;
                                    }
                                    Unit unit1113 = Unit.a;
                                }
                                return interfaceC2441Xr6;
                            }
                            Objects.toString(s09.a0);
                            c5002l12.d = s09;
                            c5002l12.e = interfaceC6396rf12;
                            c5002l12.g = null;
                            c5002l12.h = null;
                            c5002l12.i = null;
                            c5002l12.j = null;
                            c5002l12.s = 10;
                            objR = s09.r(abstractC7783yF4, h36, c5002l12);
                            if (objR == mn) {
                                return mn;
                            }
                            s010 = s09;
                            interfaceC2441Xr = (InterfaceC2441Xr) objR;
                            interfaceC6396rf7 = interfaceC6396rf12;
                            s05 = s010;
                        }
                    }
                    return mn2;
                }
                mn = mn2;
                c2513Yp = null;
                interfaceC2441Xr6 = interfaceC2441Xr;
                c2513Yp2 = s05.V;
                if (c2513Yp2 != null) {
                    s05.V = c2513Yp;
                    c5002l12.d = interfaceC2441Xr6;
                    c5002l12.e = c2513Yp;
                    c5002l12.g = c2513Yp;
                    c5002l12.h = c2513Yp;
                    c5002l12.i = c2513Yp;
                    c5002l12.j = c2513Yp;
                    c5002l12.s = 12;
                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                        return mn;
                    }
                    Unit unit1114 = Unit.a;
                }
                return interfaceC2441Xr6;
            case 7:
                AbstractC7783yF abstractC7783yF6 = (AbstractC7783yF) c5002l12.k;
                interfaceC6396rf6 = (InterfaceC6396rf0) c5002l12.j;
                C3034bs c3034bs9 = (C3034bs) c5002l12.i;
                interfaceC6396rf7 = (InterfaceC6396rf0) c5002l12.h;
                interfaceC2441Xr2 = (InterfaceC2441Xr) c5002l12.g;
                H32 h39 = (H32) c5002l12.e;
                S02<T> s019 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                str = "kind";
                c3034bs3 = c3034bs9;
                h35 = h39;
                str3 = "";
                j6 = j6;
                abstractC7783yF3 = abstractC7783yF6;
                s06 = s019;
                b.a aVar13 = b.e;
                jG = c.g(s06.r0, R40.SECONDS);
                C2337Wr c2337Wr7 = (C2337Wr) abstractC7783yF3;
                long j114 = c2337Wr7.b;
                long j115 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                j2 = j114 * j115;
                j3 = c2337Wr7.c * j115;
                iE = h35.e();
                c5002l12.d = s06;
                c5002l12.e = h35;
                c5002l12.g = interfaceC2441Xr2;
                c5002l12.h = interfaceC6396rf7;
                c5002l12.i = c3034bs3;
                c5002l12.j = interfaceC6396rf6;
                c5002l12.k = abstractC7783yF3;
                c3034bs4 = c3034bs3;
                gp1 = s06.P;
                c5002l12.l = gp1;
                c5002l12.m = jG;
                interfaceC6396rf8 = interfaceC6396rf7;
                interfaceC2441Xr3 = interfaceC2441Xr2;
                c5002l12.n = j2;
                c5002l12.o = j3;
                c5002l12.p = iE;
                c5002l12.s = 8;
                objD = s06.j.d(c5002l12);
                if (objD != mn2) {
                    S02<T> s0110 = s06;
                    obj6 = objD;
                    s07 = s0110;
                    i = iE;
                    j4 = j3;
                    c3034bs5 = c3034bs4;
                    gp2 = gp1;
                    interfaceC6396rf9 = interfaceC6396rf6;
                    interfaceC2441Xr4 = interfaceC2441Xr3;
                    interfaceC6396rf10 = interfaceC6396rf8;
                    j5 = j2;
                    String str1111112 = str6;
                    interfaceC6396rf11 = interfaceC6396rf10;
                    gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                    long jP7 = b.p(jG, j6);
                    Objects.toString(s07.a0);
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                    c3034bs5.a = null;
                    c3034bs5.b = null;
                    str4 = str1111112;
                    C1126Hf0 c1126Hf10 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                    C4429iY c4429iY7 = new C4429iY(2);
                    c5002l12.d = s07;
                    c5002l12.e = h35;
                    c5002l12.g = interfaceC2441Xr4;
                    c5002l12.h = interfaceC6396rf11;
                    c5002l12.i = c3034bs5;
                    c5002l12.j = enumC3495e43;
                    s08 = s07;
                    c5002l12.k = null;
                    c5002l12.l = null;
                    c5002l12.m = jG;
                    c5002l12.n = jElapsedRealtime2;
                    c5002l12.s = 9;
                    objB2 = C7236vf0.b(c1126Hf10, jP7, c4429iY7, c5002l12);
                    mn = mn2;
                    if (objB2 == mn) {
                        return mn;
                    }
                    interfaceC2441Xr5 = interfaceC2441Xr4;
                    interfaceC6396rf12 = interfaceC6396rf11;
                    enumC3495e44 = enumC3495e43;
                    h36 = h35;
                    s09 = s08;
                    resultOk2 = (ResultOk) objB2;
                    if (resultOk2 != null) {
                        abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                    } else {
                        abstractC7783yF4 = null;
                    }
                    Objects.toString(s09.a0);
                    Objects.toString(abstractC7783yF4);
                    if (abstractC7783yF4 != null) {
                        Objects.toString(s09.a0);
                        c5002l12.d = s09;
                        c5002l12.e = interfaceC6396rf12;
                        c5002l12.g = null;
                        c5002l12.h = null;
                        c5002l12.i = null;
                        c5002l12.j = null;
                        c5002l12.s = 10;
                        objR = s09.r(abstractC7783yF4, h36, c5002l12);
                        if (objR == mn) {
                            return mn;
                        }
                        s010 = s09;
                        interfaceC2441Xr = (InterfaceC2441Xr) objR;
                        interfaceC6396rf7 = interfaceC6396rf12;
                        s05 = s010;
                        c2513Yp = null;
                        interfaceC2441Xr6 = interfaceC2441Xr;
                        c2513Yp2 = s05.V;
                        if (c2513Yp2 != null) {
                            s05.V = c2513Yp;
                            c5002l12.d = interfaceC2441Xr6;
                            c5002l12.e = c2513Yp;
                            c5002l12.g = c2513Yp;
                            c5002l12.h = c2513Yp;
                            c5002l12.i = c2513Yp;
                            c5002l12.j = c2513Yp;
                            c5002l12.s = 12;
                            if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                                return mn;
                            }
                            Unit unit1115 = Unit.a;
                        }
                        return interfaceC2441Xr6;
                    }
                    Objects.toString(s09.a0);
                    c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                    Objects.toString(s09.a0);
                    c2824asJ2.a();
                    c2824asJ2.b();
                    c4931kh = U0.x;
                    if (c4931kh != null) {
                        str5 = s09.o0;
                        if (str5 == null) {
                            str5 = str3;
                        }
                        b.a aVar14 = b.e;
                        Integer num7 = new Integer((int) b.r(jG, R40.SECONDS));
                        Long l12 = new Long(c2824asJ2.b);
                        String str1111113 = c2824asJ2.a;
                        String str1111114 = c2824asJ2.d;
                        String str1111115 = c2824asJ2.e;
                        String str1111116 = c2824asJ2.c;
                        c4931kh.getClass();
                        int iIntValue7 = num7.intValue();
                        long jLongValue12 = l12.longValue();
                        int i15 = AppImpl.G;
                        Intrinsics.checkNotNullParameter(str5, str4);
                        Intrinsics.checkNotNullParameter(str1111113, str);
                        c4931kh.d.v(str5, iIntValue7, jLongValue12, str1111113, str1111116, str1111114, str1111115);
                        Unit unit1116 = Unit.a;
                        Unit unit1117 = Unit.a;
                    }
                    C7993zF response7 = new C7993zF("Timeout end");
                    String strB7 = c2824asJ2.b();
                    String strA7 = c2824asJ2.a();
                    Intrinsics.checkNotNullParameter(response7, "response");
                    s09.K(response7.b, response7.a, strB7, strA7);
                    w32 = W32.a;
                    c5002l12.d = s09;
                    c5002l12.e = interfaceC2441Xr5;
                    c5002l12.g = interfaceC6396rf12;
                    c2513Yp = null;
                    c5002l12.h = null;
                    c5002l12.i = null;
                    c5002l12.j = null;
                    c5002l12.s = 11;
                    if (s09.H(w32, c5002l12) == mn) {
                        return mn;
                    }
                    interfaceC6396rf7 = interfaceC6396rf12;
                    interfaceC2441Xr6 = interfaceC2441Xr5;
                    s05 = s09;
                    c2513Yp2 = s05.V;
                    if (c2513Yp2 != null) {
                        s05.V = c2513Yp;
                        c5002l12.d = interfaceC2441Xr6;
                        c5002l12.e = c2513Yp;
                        c5002l12.g = c2513Yp;
                        c5002l12.h = c2513Yp;
                        c5002l12.i = c2513Yp;
                        c5002l12.j = c2513Yp;
                        c5002l12.s = 12;
                        if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                            return mn;
                        }
                        Unit unit1118 = Unit.a;
                    }
                    return interfaceC2441Xr6;
                }
                return mn2;
            case 8:
                int i16 = c5002l12.p;
                long j20 = c5002l12.o;
                long j21 = c5002l12.n;
                long j22 = c5002l12.m;
                GP1 gp3 = c5002l12.l;
                abstractC7783yF3 = (AbstractC7783yF) c5002l12.k;
                InterfaceC6396rf0 interfaceC6396rf16 = (InterfaceC6396rf0) c5002l12.j;
                C3034bs c3034bs10 = (C3034bs) c5002l12.i;
                InterfaceC6396rf0 interfaceC6396rf17 = (InterfaceC6396rf0) c5002l12.h;
                InterfaceC2441Xr interfaceC2441Xr7 = (InterfaceC2441Xr) c5002l12.g;
                H32 h310 = (H32) c5002l12.e;
                S02<T> s020 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                s07 = s020;
                j6 = j6;
                obj6 = objR;
                i = i16;
                c3034bs5 = c3034bs10;
                str3 = "";
                jG = j22;
                gp2 = gp3;
                interfaceC6396rf9 = interfaceC6396rf16;
                interfaceC6396rf10 = interfaceC6396rf17;
                str = "kind";
                j5 = j21;
                interfaceC2441Xr4 = interfaceC2441Xr7;
                h35 = h310;
                j4 = j20;
                String str1111117 = str6;
                interfaceC6396rf11 = interfaceC6396rf10;
                gp2.setValue(new JQ(j5, j4, i, (String) obj6, (H32.a) s07.E.d.getValue(), String.valueOf(s07.T.getValue()), ((C2337Wr) abstractC7783yF3).f));
                long jP8 = b.p(jG, j6);
                Objects.toString(s07.a0);
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
                enumC3495e43 = (EnumC3495e41) s07.c.r.getValue();
                c3034bs5.a = null;
                c3034bs5.b = null;
                str4 = str1111117;
                C1126Hf0 c1126Hf11 = new C1126Hf0(CommonResultKt.c(interfaceC6396rf9, "trading.bet_end"), new C7735y12(c3034bs5, null));
                C4429iY c4429iY8 = new C4429iY(2);
                c5002l12.d = s07;
                c5002l12.e = h35;
                c5002l12.g = interfaceC2441Xr4;
                c5002l12.h = interfaceC6396rf11;
                c5002l12.i = c3034bs5;
                c5002l12.j = enumC3495e43;
                s08 = s07;
                c5002l12.k = null;
                c5002l12.l = null;
                c5002l12.m = jG;
                c5002l12.n = jElapsedRealtime2;
                c5002l12.s = 9;
                objB2 = C7236vf0.b(c1126Hf11, jP8, c4429iY8, c5002l12);
                mn = mn2;
                if (objB2 == mn) {
                    return mn;
                }
                interfaceC2441Xr5 = interfaceC2441Xr4;
                interfaceC6396rf12 = interfaceC6396rf11;
                enumC3495e44 = enumC3495e43;
                h36 = h35;
                s09 = s08;
                resultOk2 = (ResultOk) objB2;
                if (resultOk2 != null) {
                    abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                } else {
                    abstractC7783yF4 = null;
                }
                Objects.toString(s09.a0);
                Objects.toString(abstractC7783yF4);
                if (abstractC7783yF4 != null) {
                    Objects.toString(s09.a0);
                    c5002l12.d = s09;
                    c5002l12.e = interfaceC6396rf12;
                    c5002l12.g = null;
                    c5002l12.h = null;
                    c5002l12.i = null;
                    c5002l12.j = null;
                    c5002l12.s = 10;
                    objR = s09.r(abstractC7783yF4, h36, c5002l12);
                    if (objR == mn) {
                        return mn;
                    }
                    s010 = s09;
                    interfaceC2441Xr = (InterfaceC2441Xr) objR;
                    interfaceC6396rf7 = interfaceC6396rf12;
                    s05 = s010;
                    c2513Yp = null;
                    interfaceC2441Xr6 = interfaceC2441Xr;
                    c2513Yp2 = s05.V;
                    if (c2513Yp2 != null) {
                        s05.V = c2513Yp;
                        c5002l12.d = interfaceC2441Xr6;
                        c5002l12.e = c2513Yp;
                        c5002l12.g = c2513Yp;
                        c5002l12.h = c2513Yp;
                        c5002l12.i = c2513Yp;
                        c5002l12.j = c2513Yp;
                        c5002l12.s = 12;
                        if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                            return mn;
                        }
                        Unit unit1119 = Unit.a;
                    }
                    return interfaceC2441Xr6;
                }
                Objects.toString(s09.a0);
                c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                Objects.toString(s09.a0);
                c2824asJ2.a();
                c2824asJ2.b();
                c4931kh = U0.x;
                if (c4931kh != null) {
                    str5 = s09.o0;
                    if (str5 == null) {
                        str5 = str3;
                    }
                    b.a aVar15 = b.e;
                    Integer num8 = new Integer((int) b.r(jG, R40.SECONDS));
                    Long l13 = new Long(c2824asJ2.b);
                    String str1111118 = c2824asJ2.a;
                    String str1111119 = c2824asJ2.d;
                    String str11111110 = c2824asJ2.e;
                    String str11111111 = c2824asJ2.c;
                    c4931kh.getClass();
                    int iIntValue8 = num8.intValue();
                    long jLongValue13 = l13.longValue();
                    int i17 = AppImpl.G;
                    Intrinsics.checkNotNullParameter(str5, str4);
                    Intrinsics.checkNotNullParameter(str1111118, str);
                    c4931kh.d.v(str5, iIntValue8, jLongValue13, str1111118, str11111111, str1111119, str11111110);
                    Unit unit11110 = Unit.a;
                    Unit unit11111 = Unit.a;
                }
                C7993zF response8 = new C7993zF("Timeout end");
                String strB8 = c2824asJ2.b();
                String strA8 = c2824asJ2.a();
                Intrinsics.checkNotNullParameter(response8, "response");
                s09.K(response8.b, response8.a, strB8, strA8);
                w32 = W32.a;
                c5002l12.d = s09;
                c5002l12.e = interfaceC2441Xr5;
                c5002l12.g = interfaceC6396rf12;
                c2513Yp = null;
                c5002l12.h = null;
                c5002l12.i = null;
                c5002l12.j = null;
                c5002l12.s = 11;
                if (s09.H(w32, c5002l12) == mn) {
                    return mn;
                }
                interfaceC6396rf7 = interfaceC6396rf12;
                interfaceC2441Xr6 = interfaceC2441Xr5;
                s05 = s09;
                c2513Yp2 = s05.V;
                if (c2513Yp2 != null) {
                    s05.V = c2513Yp;
                    c5002l12.d = interfaceC2441Xr6;
                    c5002l12.e = c2513Yp;
                    c5002l12.g = c2513Yp;
                    c5002l12.h = c2513Yp;
                    c5002l12.i = c2513Yp;
                    c5002l12.j = c2513Yp;
                    c5002l12.s = 12;
                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                        return mn;
                    }
                    Unit unit11112 = Unit.a;
                }
                return interfaceC2441Xr6;
            case 9:
                long j23 = c5002l12.n;
                long j24 = c5002l12.m;
                EnumC3495e41 enumC3495e46 = (EnumC3495e41) c5002l12.j;
                c3034bs5 = (C3034bs) c5002l12.i;
                InterfaceC6396rf0 interfaceC6396rf18 = (InterfaceC6396rf0) c5002l12.h;
                InterfaceC2441Xr interfaceC2441Xr8 = (InterfaceC2441Xr) c5002l12.g;
                h36 = (H32) c5002l12.e;
                S02<T> s021 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                str4 = "requestId";
                mn = mn2;
                interfaceC2441Xr5 = interfaceC2441Xr8;
                s09 = s021;
                str = "kind";
                interfaceC6396rf12 = interfaceC6396rf18;
                objB2 = objR;
                str3 = "";
                enumC3495e44 = enumC3495e46;
                jElapsedRealtime2 = j23;
                jG = j24;
                resultOk2 = (ResultOk) objB2;
                if (resultOk2 != null) {
                    abstractC7783yF4 = (AbstractC7783yF) resultOk2.a();
                } else {
                    abstractC7783yF4 = null;
                }
                Objects.toString(s09.a0);
                Objects.toString(abstractC7783yF4);
                if (abstractC7783yF4 != null) {
                    Objects.toString(s09.a0);
                    c5002l12.d = s09;
                    c5002l12.e = interfaceC6396rf12;
                    c5002l12.g = null;
                    c5002l12.h = null;
                    c5002l12.i = null;
                    c5002l12.j = null;
                    c5002l12.s = 10;
                    objR = s09.r(abstractC7783yF4, h36, c5002l12);
                    if (objR == mn) {
                        return mn;
                    }
                    s010 = s09;
                    interfaceC2441Xr = (InterfaceC2441Xr) objR;
                    interfaceC6396rf7 = interfaceC6396rf12;
                    s05 = s010;
                    c2513Yp = null;
                    interfaceC2441Xr6 = interfaceC2441Xr;
                    c2513Yp2 = s05.V;
                    if (c2513Yp2 != null) {
                        s05.V = c2513Yp;
                        c5002l12.d = interfaceC2441Xr6;
                        c5002l12.e = c2513Yp;
                        c5002l12.g = c2513Yp;
                        c5002l12.h = c2513Yp;
                        c5002l12.i = c2513Yp;
                        c5002l12.j = c2513Yp;
                        c5002l12.s = 12;
                        if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                            return mn;
                        }
                        Unit unit11113 = Unit.a;
                    }
                    return interfaceC2441Xr6;
                }
                Objects.toString(s09.a0);
                c2824asJ2 = s09.j(c3034bs5, jElapsedRealtime2, enumC3495e44);
                Objects.toString(s09.a0);
                c2824asJ2.a();
                c2824asJ2.b();
                c4931kh = U0.x;
                if (c4931kh != null) {
                    str5 = s09.o0;
                    if (str5 == null) {
                        str5 = str3;
                    }
                    b.a aVar16 = b.e;
                    Integer num9 = new Integer((int) b.r(jG, R40.SECONDS));
                    Long l14 = new Long(c2824asJ2.b);
                    String str11111112 = c2824asJ2.a;
                    String str11111113 = c2824asJ2.d;
                    String str11111114 = c2824asJ2.e;
                    String str11111115 = c2824asJ2.c;
                    c4931kh.getClass();
                    int iIntValue9 = num9.intValue();
                    long jLongValue14 = l14.longValue();
                    int i18 = AppImpl.G;
                    Intrinsics.checkNotNullParameter(str5, str4);
                    Intrinsics.checkNotNullParameter(str11111112, str);
                    c4931kh.d.v(str5, iIntValue9, jLongValue14, str11111112, str11111115, str11111113, str11111114);
                    Unit unit11114 = Unit.a;
                    Unit unit11115 = Unit.a;
                }
                C7993zF response9 = new C7993zF("Timeout end");
                String strB9 = c2824asJ2.b();
                String strA9 = c2824asJ2.a();
                Intrinsics.checkNotNullParameter(response9, "response");
                s09.K(response9.b, response9.a, strB9, strA9);
                w32 = W32.a;
                c5002l12.d = s09;
                c5002l12.e = interfaceC2441Xr5;
                c5002l12.g = interfaceC6396rf12;
                c2513Yp = null;
                c5002l12.h = null;
                c5002l12.i = null;
                c5002l12.j = null;
                c5002l12.s = 11;
                if (s09.H(w32, c5002l12) == mn) {
                    return mn;
                }
                interfaceC6396rf7 = interfaceC6396rf12;
                interfaceC2441Xr6 = interfaceC2441Xr5;
                s05 = s09;
                c2513Yp2 = s05.V;
                if (c2513Yp2 != null) {
                    s05.V = c2513Yp;
                    c5002l12.d = interfaceC2441Xr6;
                    c5002l12.e = c2513Yp;
                    c5002l12.g = c2513Yp;
                    c5002l12.h = c2513Yp;
                    c5002l12.i = c2513Yp;
                    c5002l12.j = c2513Yp;
                    c5002l12.s = 12;
                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                        return mn;
                    }
                    Unit unit11116 = Unit.a;
                }
                return interfaceC2441Xr6;
            case 10:
                interfaceC6396rf12 = (InterfaceC6396rf0) c5002l12.e;
                s010 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                mn = mn2;
                interfaceC2441Xr = (InterfaceC2441Xr) objR;
                interfaceC6396rf7 = interfaceC6396rf12;
                s05 = s010;
                c2513Yp = null;
                interfaceC2441Xr6 = interfaceC2441Xr;
                c2513Yp2 = s05.V;
                if (c2513Yp2 != null) {
                    s05.V = c2513Yp;
                    c5002l12.d = interfaceC2441Xr6;
                    c5002l12.e = c2513Yp;
                    c5002l12.g = c2513Yp;
                    c5002l12.h = c2513Yp;
                    c5002l12.i = c2513Yp;
                    c5002l12.j = c2513Yp;
                    c5002l12.s = 12;
                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                        return mn;
                    }
                    Unit unit11117 = Unit.a;
                }
                return interfaceC2441Xr6;
            case 11:
                interfaceC6396rf12 = (InterfaceC6396rf0) c5002l12.g;
                interfaceC2441Xr5 = (InterfaceC2441Xr) c5002l12.e;
                s09 = (S02) c5002l12.d;
                C1795Pt1.b(objR);
                mn = mn2;
                c2513Yp = null;
                interfaceC6396rf7 = interfaceC6396rf12;
                interfaceC2441Xr6 = interfaceC2441Xr5;
                s05 = s09;
                c2513Yp2 = s05.V;
                if (c2513Yp2 != null) {
                    s05.V = c2513Yp;
                    c5002l12.d = interfaceC2441Xr6;
                    c5002l12.e = c2513Yp;
                    c5002l12.g = c2513Yp;
                    c5002l12.h = c2513Yp;
                    c5002l12.i = c2513Yp;
                    c5002l12.j = c2513Yp;
                    c5002l12.s = 12;
                    if (s05.c(interfaceC6396rf7, c2513Yp2, c5002l12) == mn) {
                        return mn;
                    }
                    Unit unit11118 = Unit.a;
                }
                return interfaceC2441Xr6;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                interfaceC2441Xr6 = (InterfaceC2441Xr) c5002l12.d;
                C1795Pt1.b(objR);
                Unit unit11119 = Unit.a;
                return interfaceC2441Xr6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c3 A[PHI: r1 r3 r4
      0x00c3: PHI (r1v8 java.lang.Object) = (r1v7 java.lang.Object), (r1v1 java.lang.Object) binds: [B:29:0x00fb, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r3v5 java.lang.String) = (r3v3 java.lang.String), (r3v9 java.lang.String) binds: [B:29:0x00fb, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r4v3 S02<T extends H32>) = (r4v1 S02<T extends H32>), (r4v23 S02<T extends H32>) binds: [B:29:0x00fb, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0118  */
    /* JADX WARN: Code duplicated, block: B:36:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x013b  */
    /* JADX WARN: Code duplicated, block: B:43:0x015e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0166  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:51:0x0192  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01db  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Code duplicated, block: B:63:0x020e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x024b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0253  */
    /* JADX WARN: Code duplicated, block: B:74:0x025e  */
    /* JADX WARN: Code duplicated, block: B:78:0x027e  */
    /* JADX WARN: Code duplicated, block: B:82:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    public final Object w(@NotNull LM lm) {
        C5215m12 c5215m12;
        S02<T> s02;
        String str;
        String str2;
        S02<T> s03;
        Double d;
        EnumC4164hF1 enumC4164hF1;
        EnumC4164hF1 enumC4164hF2;
        C4923kf c4923kf;
        ReporterApi reporterApi;
        EnumC5028l80 enumC5028l80;
        C6945uG c6945uG;
        Double d2;
        Object objV;
        String str3;
        Double d3;
        S02<T> s04;
        EnumC5028l80 enumC5028l81;
        ReporterApi reporterApi2;
        EnumC5028l80 enumC5028l82;
        C6945uG c6945uG2;
        Double d4;
        Object objV2;
        String str4;
        Double d5;
        S02<T> s05;
        EnumC5028l80 enumC5028l83;
        ReporterApi reporterApi3;
        ReporterApi reporterApi4;
        EnumC5028l80 enumC5028l84;
        C6945uG c6945uG3;
        Double d6;
        Double d7;
        Object objB;
        ReporterApi reporterApi5;
        Double d8;
        String str5;
        EnumC5028l80 enumC5028l85;
        S02<T> s06;
        Double d9;
        Double d10;
        Double d11;
        Object objB2;
        Double d12;
        Double d13;
        S02<T> s07;
        ReporterApi reporterApi6;
        EnumC5028l80 enumC5028l86;
        C6945uG c6945uG4;
        Double d14;
        Object objB3;
        ReporterApi reporterApi7;
        Double d15;
        String str6;
        EnumC5028l80 enumC5028l87;
        S02<T> s08;
        Double d16;
        Double d17;
        Double d18;
        Object objB4;
        Double d19;
        Double d20;
        S02<T> s09;
        if (lm instanceof C5215m12) {
            c5215m12 = (C5215m12) lm;
            int i = c5215m12.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5215m12.o = i - Integer.MIN_VALUE;
            } else {
                c5215m12 = new C5215m12(this, lm);
            }
        } else {
            c5215m12 = new C5215m12(this, lm);
        }
        C5215m12 c5215m13 = c5215m12;
        Object objA = c5215m13.m;
        MN mn = MN.d;
        switch (c5215m13.o) {
            case 0:
                C1795Pt1.b(objA);
                c5215m13.d = this;
                c5215m13.o = 1;
                objA = this.j.a(false, c5215m13);
                if (objA != mn) {
                    s02 = this;
                    str = (String) objA;
                    OM om = s02.m;
                    Double d21 = (Double) s02.G.d.getValue();
                    c5215m13.d = s02;
                    c5215m13.e = str;
                    c5215m13.o = 2;
                    objA = om.b(d21, c5215m13);
                    if (objA != mn) {
                        str2 = str;
                        s03 = s02;
                        d = (Double) objA;
                        enumC4164hF1 = s03.f0;
                        enumC4164hF2 = EnumC4164hF1.h;
                        c4923kf = s03.c;
                        reporterApi = s03.g;
                        if (enumC4164hF1 == enumC4164hF2) {
                            enumC5028l82 = EnumC5028l80.b0;
                            c6945uG2 = (C6945uG) c4923kf.k.getValue();
                            if (c6945uG2 != null) {
                                d4 = new Double(c6945uG2.j);
                            } else {
                                d4 = null;
                            }
                            Double d22 = s03.e0;
                            c5215m13.d = s03;
                            c5215m13.e = str2;
                            c5215m13.g = d;
                            c5215m13.h = reporterApi;
                            c5215m13.i = enumC5028l82;
                            c5215m13.o = 3;
                            objV2 = s03.V(d4, d22, "Real", str2, d, c5215m13);
                            if (objV2 != mn) {
                                str4 = str2;
                                d5 = d;
                                s05 = s03;
                                enumC5028l83 = enumC5028l82;
                                objA = objV2;
                                reporterApi3 = reporterApi;
                                reporterApi3.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                                reporterApi4 = s05.g;
                                enumC5028l84 = EnumC5028l80.b0;
                                C4923kf c4923kf2 = s05.c;
                                c6945uG3 = (C6945uG) c4923kf2.k.getValue();
                                if (c6945uG3 != null) {
                                    d6 = new Double(c6945uG3.j);
                                } else {
                                    d6 = null;
                                }
                                C6945uG c6945uG5 = (C6945uG) c4923kf2.k.getValue();
                                d7 = c6945uG5 != null ? new Double(c6945uG5.j) : null;
                                c5215m13.d = s05;
                                c5215m13.e = str4;
                                c5215m13.g = d5;
                                c5215m13.h = reporterApi4;
                                c5215m13.i = enumC5028l84;
                                c5215m13.j = d6;
                                c5215m13.o = 4;
                                objB = s05.m.b(d7, c5215m13);
                                if (objB != mn) {
                                    String str7 = str4;
                                    reporterApi5 = reporterApi4;
                                    objA = objB;
                                    d8 = d6;
                                    str5 = str7;
                                    Double d23 = d5;
                                    enumC5028l85 = enumC5028l84;
                                    s06 = s05;
                                    d9 = d23;
                                    d10 = (Double) objA;
                                    d11 = s06.e0;
                                    c5215m13.d = s06;
                                    c5215m13.e = str5;
                                    c5215m13.g = d9;
                                    c5215m13.h = reporterApi5;
                                    c5215m13.i = enumC5028l85;
                                    c5215m13.j = d8;
                                    c5215m13.k = d10;
                                    c5215m13.l = d11;
                                    c5215m13.o = 5;
                                    objB2 = s06.m.b(d11, c5215m13);
                                    if (objB2 != mn) {
                                        d12 = d10;
                                        objA = objB2;
                                        d13 = d11;
                                        s07 = s06;
                                        ReporterApi.a.b(reporterApi5, enumC5028l85, new C4336i42(d8, d12, d13, (Double) objA, "Real", str5, ((Number) s07.G.d.getValue()).doubleValue(), d9 != null ? d9.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                        return Unit.a;
                                    }
                                }
                            }
                        } else {
                            enumC5028l80 = EnumC5028l80.b0;
                            c6945uG = (C6945uG) c4923kf.k.getValue();
                            if (c6945uG != null) {
                                d2 = new Double(c6945uG.k);
                            } else {
                                d2 = null;
                            }
                            Double d24 = s03.d0;
                            c5215m13.d = s03;
                            c5215m13.e = str2;
                            c5215m13.g = d;
                            c5215m13.h = reporterApi;
                            c5215m13.i = enumC5028l80;
                            c5215m13.o = 6;
                            objV = s03.V(d2, d24, "Demo", str2, d, c5215m13);
                            if (objV != mn) {
                                str3 = str2;
                                d3 = d;
                                s04 = s03;
                                enumC5028l81 = enumC5028l80;
                                objA = objV;
                                reporterApi2 = reporterApi;
                                reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                                reporterApi6 = s04.g;
                                enumC5028l86 = EnumC5028l80.b0;
                                C4923kf c4923kf3 = s04.c;
                                c6945uG4 = (C6945uG) c4923kf3.k.getValue();
                                if (c6945uG4 != null) {
                                    d14 = new Double(c6945uG4.k);
                                } else {
                                    d14 = null;
                                }
                                C6945uG c6945uG6 = (C6945uG) c4923kf3.k.getValue();
                                d7 = c6945uG6 != null ? new Double(c6945uG6.k) : null;
                                c5215m13.d = s04;
                                c5215m13.e = str3;
                                c5215m13.g = d3;
                                c5215m13.h = reporterApi6;
                                c5215m13.i = enumC5028l86;
                                c5215m13.j = d14;
                                c5215m13.o = 7;
                                objB3 = s04.m.b(d7, c5215m13);
                                if (objB3 != mn) {
                                    String str8 = str3;
                                    reporterApi7 = reporterApi6;
                                    objA = objB3;
                                    d15 = d14;
                                    str6 = str8;
                                    Double d25 = d3;
                                    enumC5028l87 = enumC5028l86;
                                    s08 = s04;
                                    d16 = d25;
                                    d17 = (Double) objA;
                                    d18 = s08.d0;
                                    c5215m13.d = s08;
                                    c5215m13.e = str6;
                                    c5215m13.g = d16;
                                    c5215m13.h = reporterApi7;
                                    c5215m13.i = enumC5028l87;
                                    c5215m13.j = d15;
                                    c5215m13.k = d17;
                                    c5215m13.l = d18;
                                    c5215m13.o = 8;
                                    objB4 = s08.m.b(d18, c5215m13);
                                    if (objB4 != mn) {
                                        d19 = d17;
                                        objA = objB4;
                                        d20 = d18;
                                        s09 = s08;
                                        ReporterApi.a.b(reporterApi7, enumC5028l87, new C4336i42(d15, d19, d20, (Double) objA, "Demo", str6, ((Number) s09.G.d.getValue()).doubleValue(), d16 != null ? d16.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 1:
                S02<T> s010 = c5215m13.d;
                C1795Pt1.b(objA);
                s02 = s010;
                str = (String) objA;
                OM om2 = s02.m;
                Double d26 = (Double) s02.G.d.getValue();
                c5215m13.d = s02;
                c5215m13.e = str;
                c5215m13.o = 2;
                objA = om2.b(d26, c5215m13);
                if (objA != mn) {
                    str2 = str;
                    s03 = s02;
                    d = (Double) objA;
                    enumC4164hF1 = s03.f0;
                    enumC4164hF2 = EnumC4164hF1.h;
                    c4923kf = s03.c;
                    reporterApi = s03.g;
                    if (enumC4164hF1 == enumC4164hF2) {
                        enumC5028l82 = EnumC5028l80.b0;
                        c6945uG2 = (C6945uG) c4923kf.k.getValue();
                        if (c6945uG2 != null) {
                            d4 = new Double(c6945uG2.j);
                        } else {
                            d4 = null;
                        }
                        Double d27 = s03.e0;
                        c5215m13.d = s03;
                        c5215m13.e = str2;
                        c5215m13.g = d;
                        c5215m13.h = reporterApi;
                        c5215m13.i = enumC5028l82;
                        c5215m13.o = 3;
                        objV2 = s03.V(d4, d27, "Real", str2, d, c5215m13);
                        if (objV2 != mn) {
                            str4 = str2;
                            d5 = d;
                            s05 = s03;
                            enumC5028l83 = enumC5028l82;
                            objA = objV2;
                            reporterApi3 = reporterApi;
                            reporterApi3.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                            reporterApi4 = s05.g;
                            enumC5028l84 = EnumC5028l80.b0;
                            C4923kf c4923kf4 = s05.c;
                            c6945uG3 = (C6945uG) c4923kf4.k.getValue();
                            if (c6945uG3 != null) {
                                d6 = new Double(c6945uG3.j);
                            } else {
                                d6 = null;
                            }
                            C6945uG c6945uG7 = (C6945uG) c4923kf4.k.getValue();
                            if (c6945uG7 != null) {
                            }
                            c5215m13.d = s05;
                            c5215m13.e = str4;
                            c5215m13.g = d5;
                            c5215m13.h = reporterApi4;
                            c5215m13.i = enumC5028l84;
                            c5215m13.j = d6;
                            c5215m13.o = 4;
                            objB = s05.m.b(d7, c5215m13);
                            if (objB != mn) {
                                String str9 = str4;
                                reporterApi5 = reporterApi4;
                                objA = objB;
                                d8 = d6;
                                str5 = str9;
                                Double d28 = d5;
                                enumC5028l85 = enumC5028l84;
                                s06 = s05;
                                d9 = d28;
                                d10 = (Double) objA;
                                d11 = s06.e0;
                                c5215m13.d = s06;
                                c5215m13.e = str5;
                                c5215m13.g = d9;
                                c5215m13.h = reporterApi5;
                                c5215m13.i = enumC5028l85;
                                c5215m13.j = d8;
                                c5215m13.k = d10;
                                c5215m13.l = d11;
                                c5215m13.o = 5;
                                objB2 = s06.m.b(d11, c5215m13);
                                if (objB2 != mn) {
                                    d12 = d10;
                                    objA = objB2;
                                    d13 = d11;
                                    s07 = s06;
                                    ReporterApi.a.b(reporterApi5, enumC5028l85, new C4336i42(d8, d12, d13, (Double) objA, "Real", str5, ((Number) s07.G.d.getValue()).doubleValue(), d9 != null ? d9.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                    return Unit.a;
                                }
                            }
                        }
                    } else {
                        enumC5028l80 = EnumC5028l80.b0;
                        c6945uG = (C6945uG) c4923kf.k.getValue();
                        if (c6945uG != null) {
                            d2 = new Double(c6945uG.k);
                        } else {
                            d2 = null;
                        }
                        Double d29 = s03.d0;
                        c5215m13.d = s03;
                        c5215m13.e = str2;
                        c5215m13.g = d;
                        c5215m13.h = reporterApi;
                        c5215m13.i = enumC5028l80;
                        c5215m13.o = 6;
                        objV = s03.V(d2, d29, "Demo", str2, d, c5215m13);
                        if (objV != mn) {
                            str3 = str2;
                            d3 = d;
                            s04 = s03;
                            enumC5028l81 = enumC5028l80;
                            objA = objV;
                            reporterApi2 = reporterApi;
                            reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                            reporterApi6 = s04.g;
                            enumC5028l86 = EnumC5028l80.b0;
                            C4923kf c4923kf5 = s04.c;
                            c6945uG4 = (C6945uG) c4923kf5.k.getValue();
                            if (c6945uG4 != null) {
                                d14 = new Double(c6945uG4.k);
                            } else {
                                d14 = null;
                            }
                            C6945uG c6945uG8 = (C6945uG) c4923kf5.k.getValue();
                            if (c6945uG8 != null) {
                            }
                            c5215m13.d = s04;
                            c5215m13.e = str3;
                            c5215m13.g = d3;
                            c5215m13.h = reporterApi6;
                            c5215m13.i = enumC5028l86;
                            c5215m13.j = d14;
                            c5215m13.o = 7;
                            objB3 = s04.m.b(d7, c5215m13);
                            if (objB3 != mn) {
                                String str10 = str3;
                                reporterApi7 = reporterApi6;
                                objA = objB3;
                                d15 = d14;
                                str6 = str10;
                                Double d210 = d3;
                                enumC5028l87 = enumC5028l86;
                                s08 = s04;
                                d16 = d210;
                                d17 = (Double) objA;
                                d18 = s08.d0;
                                c5215m13.d = s08;
                                c5215m13.e = str6;
                                c5215m13.g = d16;
                                c5215m13.h = reporterApi7;
                                c5215m13.i = enumC5028l87;
                                c5215m13.j = d15;
                                c5215m13.k = d17;
                                c5215m13.l = d18;
                                c5215m13.o = 8;
                                objB4 = s08.m.b(d18, c5215m13);
                                if (objB4 != mn) {
                                    d19 = d17;
                                    objA = objB4;
                                    d20 = d18;
                                    s09 = s08;
                                    ReporterApi.a.b(reporterApi7, enumC5028l87, new C4336i42(d15, d19, d20, (Double) objA, "Demo", str6, ((Number) s09.G.d.getValue()).doubleValue(), d16 != null ? d16.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                return mn;
            case 2:
                str = c5215m13.e;
                s02 = c5215m13.d;
                C1795Pt1.b(objA);
                str2 = str;
                s03 = s02;
                d = (Double) objA;
                enumC4164hF1 = s03.f0;
                enumC4164hF2 = EnumC4164hF1.h;
                c4923kf = s03.c;
                reporterApi = s03.g;
                if (enumC4164hF1 == enumC4164hF2) {
                    enumC5028l82 = EnumC5028l80.b0;
                    c6945uG2 = (C6945uG) c4923kf.k.getValue();
                    if (c6945uG2 != null) {
                        d4 = new Double(c6945uG2.j);
                    } else {
                        d4 = null;
                    }
                    Double d211 = s03.e0;
                    c5215m13.d = s03;
                    c5215m13.e = str2;
                    c5215m13.g = d;
                    c5215m13.h = reporterApi;
                    c5215m13.i = enumC5028l82;
                    c5215m13.o = 3;
                    objV2 = s03.V(d4, d211, "Real", str2, d, c5215m13);
                    if (objV2 != mn) {
                        str4 = str2;
                        d5 = d;
                        s05 = s03;
                        enumC5028l83 = enumC5028l82;
                        objA = objV2;
                        reporterApi3 = reporterApi;
                        reporterApi3.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                        reporterApi4 = s05.g;
                        enumC5028l84 = EnumC5028l80.b0;
                        C4923kf c4923kf6 = s05.c;
                        c6945uG3 = (C6945uG) c4923kf6.k.getValue();
                        if (c6945uG3 != null) {
                            d6 = new Double(c6945uG3.j);
                        } else {
                            d6 = null;
                        }
                        C6945uG c6945uG9 = (C6945uG) c4923kf6.k.getValue();
                        if (c6945uG9 != null) {
                        }
                        c5215m13.d = s05;
                        c5215m13.e = str4;
                        c5215m13.g = d5;
                        c5215m13.h = reporterApi4;
                        c5215m13.i = enumC5028l84;
                        c5215m13.j = d6;
                        c5215m13.o = 4;
                        objB = s05.m.b(d7, c5215m13);
                        if (objB != mn) {
                            String str11 = str4;
                            reporterApi5 = reporterApi4;
                            objA = objB;
                            d8 = d6;
                            str5 = str11;
                            Double d212 = d5;
                            enumC5028l85 = enumC5028l84;
                            s06 = s05;
                            d9 = d212;
                            d10 = (Double) objA;
                            d11 = s06.e0;
                            c5215m13.d = s06;
                            c5215m13.e = str5;
                            c5215m13.g = d9;
                            c5215m13.h = reporterApi5;
                            c5215m13.i = enumC5028l85;
                            c5215m13.j = d8;
                            c5215m13.k = d10;
                            c5215m13.l = d11;
                            c5215m13.o = 5;
                            objB2 = s06.m.b(d11, c5215m13);
                            if (objB2 != mn) {
                                d12 = d10;
                                objA = objB2;
                                d13 = d11;
                                s07 = s06;
                                ReporterApi.a.b(reporterApi5, enumC5028l85, new C4336i42(d8, d12, d13, (Double) objA, "Real", str5, ((Number) s07.G.d.getValue()).doubleValue(), d9 != null ? d9.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                return Unit.a;
                            }
                        }
                    }
                } else {
                    enumC5028l80 = EnumC5028l80.b0;
                    c6945uG = (C6945uG) c4923kf.k.getValue();
                    if (c6945uG != null) {
                        d2 = new Double(c6945uG.k);
                    } else {
                        d2 = null;
                    }
                    Double d213 = s03.d0;
                    c5215m13.d = s03;
                    c5215m13.e = str2;
                    c5215m13.g = d;
                    c5215m13.h = reporterApi;
                    c5215m13.i = enumC5028l80;
                    c5215m13.o = 6;
                    objV = s03.V(d2, d213, "Demo", str2, d, c5215m13);
                    if (objV != mn) {
                        str3 = str2;
                        d3 = d;
                        s04 = s03;
                        enumC5028l81 = enumC5028l80;
                        objA = objV;
                        reporterApi2 = reporterApi;
                        reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                        reporterApi6 = s04.g;
                        enumC5028l86 = EnumC5028l80.b0;
                        C4923kf c4923kf7 = s04.c;
                        c6945uG4 = (C6945uG) c4923kf7.k.getValue();
                        if (c6945uG4 != null) {
                            d14 = new Double(c6945uG4.k);
                        } else {
                            d14 = null;
                        }
                        C6945uG c6945uG10 = (C6945uG) c4923kf7.k.getValue();
                        if (c6945uG10 != null) {
                        }
                        c5215m13.d = s04;
                        c5215m13.e = str3;
                        c5215m13.g = d3;
                        c5215m13.h = reporterApi6;
                        c5215m13.i = enumC5028l86;
                        c5215m13.j = d14;
                        c5215m13.o = 7;
                        objB3 = s04.m.b(d7, c5215m13);
                        if (objB3 != mn) {
                            String str12 = str3;
                            reporterApi7 = reporterApi6;
                            objA = objB3;
                            d15 = d14;
                            str6 = str12;
                            Double d214 = d3;
                            enumC5028l87 = enumC5028l86;
                            s08 = s04;
                            d16 = d214;
                            d17 = (Double) objA;
                            d18 = s08.d0;
                            c5215m13.d = s08;
                            c5215m13.e = str6;
                            c5215m13.g = d16;
                            c5215m13.h = reporterApi7;
                            c5215m13.i = enumC5028l87;
                            c5215m13.j = d15;
                            c5215m13.k = d17;
                            c5215m13.l = d18;
                            c5215m13.o = 8;
                            objB4 = s08.m.b(d18, c5215m13);
                            if (objB4 != mn) {
                                d19 = d17;
                                objA = objB4;
                                d20 = d18;
                                s09 = s08;
                                ReporterApi.a.b(reporterApi7, enumC5028l87, new C4336i42(d15, d19, d20, (Double) objA, "Demo", str6, ((Number) s09.G.d.getValue()).doubleValue(), d16 != null ? d16.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                return Unit.a;
                            }
                        }
                    }
                }
                return mn;
            case 3:
                enumC5028l83 = c5215m13.i;
                reporterApi3 = c5215m13.h;
                d5 = c5215m13.g;
                str4 = c5215m13.e;
                s05 = c5215m13.d;
                C1795Pt1.b(objA);
                reporterApi3.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                reporterApi4 = s05.g;
                enumC5028l84 = EnumC5028l80.b0;
                C4923kf c4923kf8 = s05.c;
                c6945uG3 = (C6945uG) c4923kf8.k.getValue();
                if (c6945uG3 != null) {
                    d6 = new Double(c6945uG3.j);
                } else {
                    d6 = null;
                }
                C6945uG c6945uG11 = (C6945uG) c4923kf8.k.getValue();
                if (c6945uG11 != null) {
                }
                c5215m13.d = s05;
                c5215m13.e = str4;
                c5215m13.g = d5;
                c5215m13.h = reporterApi4;
                c5215m13.i = enumC5028l84;
                c5215m13.j = d6;
                c5215m13.o = 4;
                objB = s05.m.b(d7, c5215m13);
                if (objB != mn) {
                    String str13 = str4;
                    reporterApi5 = reporterApi4;
                    objA = objB;
                    d8 = d6;
                    str5 = str13;
                    Double d215 = d5;
                    enumC5028l85 = enumC5028l84;
                    s06 = s05;
                    d9 = d215;
                    d10 = (Double) objA;
                    d11 = s06.e0;
                    c5215m13.d = s06;
                    c5215m13.e = str5;
                    c5215m13.g = d9;
                    c5215m13.h = reporterApi5;
                    c5215m13.i = enumC5028l85;
                    c5215m13.j = d8;
                    c5215m13.k = d10;
                    c5215m13.l = d11;
                    c5215m13.o = 5;
                    objB2 = s06.m.b(d11, c5215m13);
                    if (objB2 != mn) {
                        d12 = d10;
                        objA = objB2;
                        d13 = d11;
                        s07 = s06;
                        ReporterApi.a.b(reporterApi5, enumC5028l85, new C4336i42(d8, d12, d13, (Double) objA, "Real", str5, ((Number) s07.G.d.getValue()).doubleValue(), d9 != null ? d9.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                        return Unit.a;
                    }
                }
                return mn;
            case 4:
                Double d30 = c5215m13.j;
                EnumC5028l80 enumC5028l88 = c5215m13.i;
                ReporterApi reporterApi8 = c5215m13.h;
                Double d31 = c5215m13.g;
                String str14 = c5215m13.e;
                S02<T> s011 = c5215m13.d;
                C1795Pt1.b(objA);
                d8 = d30;
                s06 = s011;
                str5 = str14;
                d9 = d31;
                reporterApi5 = reporterApi8;
                enumC5028l85 = enumC5028l88;
                d10 = (Double) objA;
                d11 = s06.e0;
                c5215m13.d = s06;
                c5215m13.e = str5;
                c5215m13.g = d9;
                c5215m13.h = reporterApi5;
                c5215m13.i = enumC5028l85;
                c5215m13.j = d8;
                c5215m13.k = d10;
                c5215m13.l = d11;
                c5215m13.o = 5;
                objB2 = s06.m.b(d11, c5215m13);
                if (objB2 != mn) {
                    d12 = d10;
                    objA = objB2;
                    d13 = d11;
                    s07 = s06;
                    ReporterApi.a.b(reporterApi5, enumC5028l85, new C4336i42(d8, d12, d13, (Double) objA, "Real", str5, ((Number) s07.G.d.getValue()).doubleValue(), d9 != null ? d9.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                    return Unit.a;
                }
                return mn;
            case 5:
                Double d32 = c5215m13.l;
                Double d33 = c5215m13.k;
                d8 = c5215m13.j;
                enumC5028l85 = c5215m13.i;
                reporterApi5 = c5215m13.h;
                d9 = c5215m13.g;
                str5 = c5215m13.e;
                s07 = c5215m13.d;
                C1795Pt1.b(objA);
                d13 = d32;
                d12 = d33;
                ReporterApi.a.b(reporterApi5, enumC5028l85, new C4336i42(d8, d12, d13, (Double) objA, "Real", str5, ((Number) s07.G.d.getValue()).doubleValue(), d9 != null ? d9.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                return Unit.a;
            case 6:
                enumC5028l81 = c5215m13.i;
                reporterApi2 = c5215m13.h;
                d3 = c5215m13.g;
                str3 = c5215m13.e;
                s04 = c5215m13.d;
                C1795Pt1.b(objA);
                reporterApi2.h(enumC5028l81, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                reporterApi6 = s04.g;
                enumC5028l86 = EnumC5028l80.b0;
                C4923kf c4923kf9 = s04.c;
                c6945uG4 = (C6945uG) c4923kf9.k.getValue();
                if (c6945uG4 != null) {
                    d14 = new Double(c6945uG4.k);
                } else {
                    d14 = null;
                }
                C6945uG c6945uG12 = (C6945uG) c4923kf9.k.getValue();
                if (c6945uG12 != null) {
                }
                c5215m13.d = s04;
                c5215m13.e = str3;
                c5215m13.g = d3;
                c5215m13.h = reporterApi6;
                c5215m13.i = enumC5028l86;
                c5215m13.j = d14;
                c5215m13.o = 7;
                objB3 = s04.m.b(d7, c5215m13);
                if (objB3 != mn) {
                    String str15 = str3;
                    reporterApi7 = reporterApi6;
                    objA = objB3;
                    d15 = d14;
                    str6 = str15;
                    Double d216 = d3;
                    enumC5028l87 = enumC5028l86;
                    s08 = s04;
                    d16 = d216;
                    d17 = (Double) objA;
                    d18 = s08.d0;
                    c5215m13.d = s08;
                    c5215m13.e = str6;
                    c5215m13.g = d16;
                    c5215m13.h = reporterApi7;
                    c5215m13.i = enumC5028l87;
                    c5215m13.j = d15;
                    c5215m13.k = d17;
                    c5215m13.l = d18;
                    c5215m13.o = 8;
                    objB4 = s08.m.b(d18, c5215m13);
                    if (objB4 != mn) {
                        d19 = d17;
                        objA = objB4;
                        d20 = d18;
                        s09 = s08;
                        ReporterApi.a.b(reporterApi7, enumC5028l87, new C4336i42(d15, d19, d20, (Double) objA, "Demo", str6, ((Number) s09.G.d.getValue()).doubleValue(), d16 != null ? d16.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                        return Unit.a;
                    }
                }
                return mn;
            case 7:
                Double d34 = c5215m13.j;
                EnumC5028l80 enumC5028l89 = c5215m13.i;
                ReporterApi reporterApi9 = c5215m13.h;
                Double d35 = c5215m13.g;
                String str16 = c5215m13.e;
                S02<T> s012 = c5215m13.d;
                C1795Pt1.b(objA);
                d15 = d34;
                s08 = s012;
                str6 = str16;
                d16 = d35;
                reporterApi7 = reporterApi9;
                enumC5028l87 = enumC5028l89;
                d17 = (Double) objA;
                d18 = s08.d0;
                c5215m13.d = s08;
                c5215m13.e = str6;
                c5215m13.g = d16;
                c5215m13.h = reporterApi7;
                c5215m13.i = enumC5028l87;
                c5215m13.j = d15;
                c5215m13.k = d17;
                c5215m13.l = d18;
                c5215m13.o = 8;
                objB4 = s08.m.b(d18, c5215m13);
                if (objB4 != mn) {
                    d19 = d17;
                    objA = objB4;
                    d20 = d18;
                    s09 = s08;
                    ReporterApi.a.b(reporterApi7, enumC5028l87, new C4336i42(d15, d19, d20, (Double) objA, "Demo", str6, ((Number) s09.G.d.getValue()).doubleValue(), d16 != null ? d16.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                    return Unit.a;
                }
                return mn;
            case 8:
                Double d36 = c5215m13.l;
                Double d37 = c5215m13.k;
                d15 = c5215m13.j;
                enumC5028l87 = c5215m13.i;
                reporterApi7 = c5215m13.h;
                d16 = c5215m13.g;
                str6 = c5215m13.e;
                s09 = c5215m13.d;
                C1795Pt1.b(objA);
                d20 = d36;
                d19 = d37;
                ReporterApi.a.b(reporterApi7, enumC5028l87, new C4336i42(d15, d19, d20, (Double) objA, "Demo", str6, ((Number) s09.G.d.getValue()).doubleValue(), d16 != null ? d16.doubleValue() : 0.0d), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00d3 A[PHI: r1 r3 r4
      0x00d3: PHI (r1v13 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:33:0x011d, B:21:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r3v5 java.lang.String) = (r3v3 java.lang.String), (r3v9 java.lang.String) binds: [B:33:0x011d, B:21:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r4v3 S02<T extends H32>) = (r4v1 S02<T extends H32>), (r4v24 S02<T extends H32>) binds: [B:33:0x011d, B:21:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0142  */
    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0180  */
    /* JADX WARN: Code duplicated, block: B:48:0x0188  */
    /* JADX WARN: Code duplicated, block: B:51:0x0193  */
    /* JADX WARN: Code duplicated, block: B:52:0x019b  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x0206  */
    /* JADX WARN: Code duplicated, block: B:66:0x0238  */
    /* JADX WARN: Code duplicated, block: B:68:0x025b  */
    /* JADX WARN: Code duplicated, block: B:69:0x025e  */
    /* JADX WARN: Code duplicated, block: B:72:0x026a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0273  */
    /* JADX WARN: Code duplicated, block: B:77:0x028b  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x02be  */
    /* JADX WARN: Code duplicated, block: B:88:0x02db  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0317  */
    /* JADX WARN: Code duplicated, block: B:96:0x031e  */
    public final Object x(LM lm) {
        C5425n12 c5425n12;
        S02<T> s02;
        String str;
        String str2;
        S02<T> s03;
        Double d;
        EnumC4164hF1 enumC4164hF1;
        EnumC4164hF1 enumC4164hF2;
        ReporterApi reporterApi;
        C4923kf c4923kf;
        EnumC5028l80 enumC5028l80;
        C6945uG c6945uG;
        Double d2;
        Object objV;
        S02<T> s04;
        String str3;
        EnumC5028l80 enumC5028l81;
        Double d3;
        EnumC5028l80 enumC5028l82;
        C6945uG c6945uG2;
        Double d4;
        Object objV2;
        String str4;
        Double d5;
        S02<T> s05;
        EnumC5028l80 enumC5028l83;
        ReporterApi reporterApi2;
        ReporterApi reporterApi3;
        EnumC5028l80 enumC5028l84;
        C6945uG c6945uG3;
        Double d6;
        C6945uG c6945uG4;
        Double d7;
        Object objB;
        ReporterApi reporterApi4;
        Double d8;
        String str5;
        EnumC5028l80 enumC5028l85;
        S02<T> s06;
        Double d9;
        Double d10;
        Double d11;
        Object objB2;
        Double d12;
        Double d13;
        S02<T> s07;
        double dDoubleValue;
        C6945uG c6945uG5;
        Double d14;
        String str6;
        S02<T> s08;
        EnumC5028l80 enumC5028l86;
        Double d15;
        Double d16;
        Double d17;
        Double d18;
        Object objB3;
        Double d19;
        double dDoubleValue2;
        if (lm instanceof C5425n12) {
            c5425n12 = (C5425n12) lm;
            int i = c5425n12.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5425n12.o = i - Integer.MIN_VALUE;
            } else {
                c5425n12 = new C5425n12(this, lm);
            }
        } else {
            c5425n12 = new C5425n12(this, lm);
        }
        C5425n12 c5425n13 = c5425n12;
        Object objA = c5425n13.m;
        MN mn = MN.d;
        switch (c5425n13.o) {
            case 0:
                C1795Pt1.b(objA);
                if (!((Boolean) this.y.d.getValue()).booleanValue()) {
                    return Unit.a;
                }
                c5425n13.d = this;
                c5425n13.o = 1;
                objA = this.j.a(false, c5425n13);
                if (objA != mn) {
                    s02 = this;
                    str = (String) objA;
                    OM om = s02.m;
                    Double d20 = (Double) s02.G.d.getValue();
                    c5425n13.d = s02;
                    c5425n13.e = str;
                    c5425n13.o = 2;
                    objA = om.b(d20, c5425n13);
                    if (objA != mn) {
                        str2 = str;
                        s03 = s02;
                        d = (Double) objA;
                        enumC4164hF1 = s03.f0;
                        enumC4164hF2 = EnumC4164hF1.h;
                        reporterApi = s03.g;
                        c4923kf = s03.c;
                        if (enumC4164hF1 == enumC4164hF2) {
                            enumC5028l82 = EnumC5028l80.a0;
                            c6945uG2 = (C6945uG) c4923kf.k.getValue();
                            if (c6945uG2 != null) {
                                d4 = new Double(c6945uG2.j);
                            } else {
                                d4 = null;
                            }
                            Double d21 = s03.e0;
                            c5425n13.d = s03;
                            c5425n13.e = str2;
                            c5425n13.g = d;
                            c5425n13.h = reporterApi;
                            c5425n13.i = enumC5028l82;
                            c5425n13.o = 3;
                            objV2 = s03.V(d4, d21, "Real", str2, d, c5425n13);
                            if (objV2 != mn) {
                                str4 = str2;
                                d5 = d;
                                s05 = s03;
                                enumC5028l83 = enumC5028l82;
                                objA = objV2;
                                reporterApi2 = reporterApi;
                                reporterApi2.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                                reporterApi3 = s05.g;
                                enumC5028l84 = EnumC5028l80.a0;
                                C4923kf c4923kf2 = s05.c;
                                c6945uG3 = (C6945uG) c4923kf2.k.getValue();
                                if (c6945uG3 != null) {
                                    d6 = new Double(c6945uG3.j);
                                } else {
                                    d6 = null;
                                }
                                c6945uG4 = (C6945uG) c4923kf2.k.getValue();
                                if (c6945uG4 != null) {
                                    d7 = new Double(c6945uG4.j);
                                } else {
                                    d7 = null;
                                }
                                c5425n13.d = s05;
                                c5425n13.e = str4;
                                c5425n13.g = d5;
                                c5425n13.h = reporterApi3;
                                c5425n13.i = enumC5028l84;
                                c5425n13.j = d6;
                                c5425n13.o = 4;
                                objB = s05.m.b(d7, c5425n13);
                                if (objB != mn) {
                                    String str7 = str4;
                                    reporterApi4 = reporterApi3;
                                    objA = objB;
                                    d8 = d6;
                                    str5 = str7;
                                    Double d22 = d5;
                                    enumC5028l85 = enumC5028l84;
                                    s06 = s05;
                                    d9 = d22;
                                    d10 = (Double) objA;
                                    d11 = s06.e0;
                                    c5425n13.d = s06;
                                    c5425n13.e = str5;
                                    c5425n13.g = d9;
                                    c5425n13.h = reporterApi4;
                                    c5425n13.i = enumC5028l85;
                                    c5425n13.j = d8;
                                    c5425n13.k = d10;
                                    c5425n13.l = d11;
                                    c5425n13.o = 5;
                                    objB2 = s06.m.b(d11, c5425n13);
                                    if (objB2 != mn) {
                                        d12 = d10;
                                        objA = objB2;
                                        d13 = d11;
                                        s07 = s06;
                                        Double d23 = d8;
                                        String str8 = str5;
                                        Double d24 = (Double) objA;
                                        double dDoubleValue3 = ((Number) s07.G.d.getValue()).doubleValue();
                                        if (d9 != null) {
                                            dDoubleValue = d9.doubleValue();
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                        ReporterApi.a.b(reporterApi4, enumC5028l85, new C4336i42(d23, d12, d13, d24, "Real", str8, dDoubleValue3, dDoubleValue), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                        ReporterApi.a.a(s07.g, EnumC5113la.COUNTER_WIN_REAL, new Integer(1));
                                        C5189lv.k(C3784fT.a, null, new C5635o12(s07, null), 3);
                                        return Unit.a;
                                    }
                                }
                            }
                        } else {
                            ReporterApi.a.a(reporterApi, EnumC5113la.COUNTER_WIN_DEMO, new Integer(1));
                            C5189lv.k(C3784fT.a, null, new C5845p12(s03, null), 3);
                            if (((Boolean) c4923kf.e.getValue()).booleanValue()) {
                                enumC5028l80 = EnumC5028l80.a0;
                            } else {
                                enumC5028l80 = EnumC5028l80.Z;
                            }
                            c6945uG = (C6945uG) c4923kf.k.getValue();
                            if (c6945uG != null) {
                                d2 = new Double(c6945uG.k);
                            } else {
                                d2 = null;
                            }
                            Double d25 = s03.d0;
                            c5425n13.d = s03;
                            c5425n13.e = str2;
                            c5425n13.g = d;
                            c5425n13.h = enumC5028l80;
                            c5425n13.o = 6;
                            objV = s03.V(d2, d25, "Demo", str2, d, c5425n13);
                            if (objV != mn) {
                                s04 = s03;
                                str3 = str2;
                                enumC5028l81 = enumC5028l80;
                                objA = objV;
                                d3 = d;
                                s04.g.h(enumC5028l81, (C4126h42) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                                C4923kf c4923kf3 = s04.c;
                                c6945uG5 = (C6945uG) c4923kf3.k.getValue();
                                if (c6945uG5 != null) {
                                    d14 = new Double(c6945uG5.k);
                                } else {
                                    d14 = null;
                                }
                                C6945uG c6945uG6 = (C6945uG) c4923kf3.k.getValue();
                                Double d26 = c6945uG6 != null ? new Double(c6945uG6.k) : null;
                                c5425n13.d = s04;
                                c5425n13.e = str3;
                                c5425n13.g = d3;
                                c5425n13.h = enumC5028l81;
                                c5425n13.i = d14;
                                c5425n13.o = 7;
                                objA = s04.m.b(d26, c5425n13);
                                if (objA != mn) {
                                    str6 = str3;
                                    s08 = s04;
                                    enumC5028l86 = enumC5028l81;
                                    d15 = d3;
                                    d16 = d14;
                                    d17 = (Double) objA;
                                    d18 = s08.d0;
                                    c5425n13.d = s08;
                                    c5425n13.e = str6;
                                    c5425n13.g = d15;
                                    c5425n13.h = enumC5028l86;
                                    c5425n13.i = d16;
                                    c5425n13.j = d17;
                                    c5425n13.k = d18;
                                    c5425n13.o = 8;
                                    objB3 = s08.m.b(d18, c5425n13);
                                    if (objB3 != mn) {
                                        d19 = d18;
                                        objA = objB3;
                                        Double d27 = d17;
                                        Double d28 = d16;
                                        String str9 = str6;
                                        Double d29 = (Double) objA;
                                        double dDoubleValue4 = ((Number) s08.G.d.getValue()).doubleValue();
                                        if (d15 != null) {
                                            dDoubleValue2 = d15.doubleValue();
                                        } else {
                                            dDoubleValue2 = 0.0d;
                                        }
                                        ReporterApi.a.b(s08.g, enumC5028l86, new C4336i42(d28, d27, d19, d29, "Demo", str9, dDoubleValue4, dDoubleValue2), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                    }
                }
                return mn;
            case 1:
                S02<T> s09 = c5425n13.d;
                C1795Pt1.b(objA);
                s02 = s09;
                str = (String) objA;
                OM om2 = s02.m;
                Double d210 = (Double) s02.G.d.getValue();
                c5425n13.d = s02;
                c5425n13.e = str;
                c5425n13.o = 2;
                objA = om2.b(d210, c5425n13);
                if (objA != mn) {
                    str2 = str;
                    s03 = s02;
                    d = (Double) objA;
                    enumC4164hF1 = s03.f0;
                    enumC4164hF2 = EnumC4164hF1.h;
                    reporterApi = s03.g;
                    c4923kf = s03.c;
                    if (enumC4164hF1 == enumC4164hF2) {
                        enumC5028l82 = EnumC5028l80.a0;
                        c6945uG2 = (C6945uG) c4923kf.k.getValue();
                        if (c6945uG2 != null) {
                            d4 = new Double(c6945uG2.j);
                        } else {
                            d4 = null;
                        }
                        Double d211 = s03.e0;
                        c5425n13.d = s03;
                        c5425n13.e = str2;
                        c5425n13.g = d;
                        c5425n13.h = reporterApi;
                        c5425n13.i = enumC5028l82;
                        c5425n13.o = 3;
                        objV2 = s03.V(d4, d211, "Real", str2, d, c5425n13);
                        if (objV2 != mn) {
                            str4 = str2;
                            d5 = d;
                            s05 = s03;
                            enumC5028l83 = enumC5028l82;
                            objA = objV2;
                            reporterApi2 = reporterApi;
                            reporterApi2.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                            reporterApi3 = s05.g;
                            enumC5028l84 = EnumC5028l80.a0;
                            C4923kf c4923kf4 = s05.c;
                            c6945uG3 = (C6945uG) c4923kf4.k.getValue();
                            if (c6945uG3 != null) {
                                d6 = new Double(c6945uG3.j);
                            } else {
                                d6 = null;
                            }
                            c6945uG4 = (C6945uG) c4923kf4.k.getValue();
                            if (c6945uG4 != null) {
                                d7 = new Double(c6945uG4.j);
                            } else {
                                d7 = null;
                            }
                            c5425n13.d = s05;
                            c5425n13.e = str4;
                            c5425n13.g = d5;
                            c5425n13.h = reporterApi3;
                            c5425n13.i = enumC5028l84;
                            c5425n13.j = d6;
                            c5425n13.o = 4;
                            objB = s05.m.b(d7, c5425n13);
                            if (objB != mn) {
                                String str10 = str4;
                                reporterApi4 = reporterApi3;
                                objA = objB;
                                d8 = d6;
                                str5 = str10;
                                Double d212 = d5;
                                enumC5028l85 = enumC5028l84;
                                s06 = s05;
                                d9 = d212;
                                d10 = (Double) objA;
                                d11 = s06.e0;
                                c5425n13.d = s06;
                                c5425n13.e = str5;
                                c5425n13.g = d9;
                                c5425n13.h = reporterApi4;
                                c5425n13.i = enumC5028l85;
                                c5425n13.j = d8;
                                c5425n13.k = d10;
                                c5425n13.l = d11;
                                c5425n13.o = 5;
                                objB2 = s06.m.b(d11, c5425n13);
                                if (objB2 != mn) {
                                    d12 = d10;
                                    objA = objB2;
                                    d13 = d11;
                                    s07 = s06;
                                    Double d213 = d8;
                                    String str11 = str5;
                                    Double d214 = (Double) objA;
                                    double dDoubleValue5 = ((Number) s07.G.d.getValue()).doubleValue();
                                    if (d9 != null) {
                                        dDoubleValue = d9.doubleValue();
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    ReporterApi.a.b(reporterApi4, enumC5028l85, new C4336i42(d213, d12, d13, d214, "Real", str11, dDoubleValue5, dDoubleValue), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                    ReporterApi.a.a(s07.g, EnumC5113la.COUNTER_WIN_REAL, new Integer(1));
                                    C5189lv.k(C3784fT.a, null, new C5635o12(s07, null), 3);
                                    return Unit.a;
                                }
                            }
                        }
                    } else {
                        ReporterApi.a.a(reporterApi, EnumC5113la.COUNTER_WIN_DEMO, new Integer(1));
                        C5189lv.k(C3784fT.a, null, new C5845p12(s03, null), 3);
                        if (((Boolean) c4923kf.e.getValue()).booleanValue()) {
                            enumC5028l80 = EnumC5028l80.Z;
                        } else {
                            enumC5028l80 = EnumC5028l80.a0;
                        }
                        c6945uG = (C6945uG) c4923kf.k.getValue();
                        if (c6945uG != null) {
                            d2 = new Double(c6945uG.k);
                        } else {
                            d2 = null;
                        }
                        Double d215 = s03.d0;
                        c5425n13.d = s03;
                        c5425n13.e = str2;
                        c5425n13.g = d;
                        c5425n13.h = enumC5028l80;
                        c5425n13.o = 6;
                        objV = s03.V(d2, d215, "Demo", str2, d, c5425n13);
                        if (objV != mn) {
                            s04 = s03;
                            str3 = str2;
                            enumC5028l81 = enumC5028l80;
                            objA = objV;
                            d3 = d;
                            s04.g.h(enumC5028l81, (C4126h42) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                            C4923kf c4923kf5 = s04.c;
                            c6945uG5 = (C6945uG) c4923kf5.k.getValue();
                            if (c6945uG5 != null) {
                                d14 = new Double(c6945uG5.k);
                            } else {
                                d14 = null;
                            }
                            C6945uG c6945uG7 = (C6945uG) c4923kf5.k.getValue();
                            if (c6945uG7 != null) {
                            }
                            c5425n13.d = s04;
                            c5425n13.e = str3;
                            c5425n13.g = d3;
                            c5425n13.h = enumC5028l81;
                            c5425n13.i = d14;
                            c5425n13.o = 7;
                            objA = s04.m.b(d26, c5425n13);
                            if (objA != mn) {
                                str6 = str3;
                                s08 = s04;
                                enumC5028l86 = enumC5028l81;
                                d15 = d3;
                                d16 = d14;
                                d17 = (Double) objA;
                                d18 = s08.d0;
                                c5425n13.d = s08;
                                c5425n13.e = str6;
                                c5425n13.g = d15;
                                c5425n13.h = enumC5028l86;
                                c5425n13.i = d16;
                                c5425n13.j = d17;
                                c5425n13.k = d18;
                                c5425n13.o = 8;
                                objB3 = s08.m.b(d18, c5425n13);
                                if (objB3 != mn) {
                                    d19 = d18;
                                    objA = objB3;
                                    Double d216 = d17;
                                    Double d217 = d16;
                                    String str12 = str6;
                                    Double d218 = (Double) objA;
                                    double dDoubleValue6 = ((Number) s08.G.d.getValue()).doubleValue();
                                    if (d15 != null) {
                                        dDoubleValue2 = d15.doubleValue();
                                    } else {
                                        dDoubleValue2 = 0.0d;
                                    }
                                    ReporterApi.a.b(s08.g, enumC5028l86, new C4336i42(d217, d216, d19, d218, "Demo", str12, dDoubleValue6, dDoubleValue2), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                return mn;
            case 2:
                str = c5425n13.e;
                s02 = c5425n13.d;
                C1795Pt1.b(objA);
                str2 = str;
                s03 = s02;
                d = (Double) objA;
                enumC4164hF1 = s03.f0;
                enumC4164hF2 = EnumC4164hF1.h;
                reporterApi = s03.g;
                c4923kf = s03.c;
                if (enumC4164hF1 == enumC4164hF2) {
                    enumC5028l82 = EnumC5028l80.a0;
                    c6945uG2 = (C6945uG) c4923kf.k.getValue();
                    if (c6945uG2 != null) {
                        d4 = new Double(c6945uG2.j);
                    } else {
                        d4 = null;
                    }
                    Double d219 = s03.e0;
                    c5425n13.d = s03;
                    c5425n13.e = str2;
                    c5425n13.g = d;
                    c5425n13.h = reporterApi;
                    c5425n13.i = enumC5028l82;
                    c5425n13.o = 3;
                    objV2 = s03.V(d4, d219, "Real", str2, d, c5425n13);
                    if (objV2 != mn) {
                        str4 = str2;
                        d5 = d;
                        s05 = s03;
                        enumC5028l83 = enumC5028l82;
                        objA = objV2;
                        reporterApi2 = reporterApi;
                        reporterApi2.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                        reporterApi3 = s05.g;
                        enumC5028l84 = EnumC5028l80.a0;
                        C4923kf c4923kf6 = s05.c;
                        c6945uG3 = (C6945uG) c4923kf6.k.getValue();
                        if (c6945uG3 != null) {
                            d6 = new Double(c6945uG3.j);
                        } else {
                            d6 = null;
                        }
                        c6945uG4 = (C6945uG) c4923kf6.k.getValue();
                        if (c6945uG4 != null) {
                            d7 = new Double(c6945uG4.j);
                        } else {
                            d7 = null;
                        }
                        c5425n13.d = s05;
                        c5425n13.e = str4;
                        c5425n13.g = d5;
                        c5425n13.h = reporterApi3;
                        c5425n13.i = enumC5028l84;
                        c5425n13.j = d6;
                        c5425n13.o = 4;
                        objB = s05.m.b(d7, c5425n13);
                        if (objB != mn) {
                            String str13 = str4;
                            reporterApi4 = reporterApi3;
                            objA = objB;
                            d8 = d6;
                            str5 = str13;
                            Double d2110 = d5;
                            enumC5028l85 = enumC5028l84;
                            s06 = s05;
                            d9 = d2110;
                            d10 = (Double) objA;
                            d11 = s06.e0;
                            c5425n13.d = s06;
                            c5425n13.e = str5;
                            c5425n13.g = d9;
                            c5425n13.h = reporterApi4;
                            c5425n13.i = enumC5028l85;
                            c5425n13.j = d8;
                            c5425n13.k = d10;
                            c5425n13.l = d11;
                            c5425n13.o = 5;
                            objB2 = s06.m.b(d11, c5425n13);
                            if (objB2 != mn) {
                                d12 = d10;
                                objA = objB2;
                                d13 = d11;
                                s07 = s06;
                                Double d2111 = d8;
                                String str14 = str5;
                                Double d2112 = (Double) objA;
                                double dDoubleValue7 = ((Number) s07.G.d.getValue()).doubleValue();
                                if (d9 != null) {
                                    dDoubleValue = d9.doubleValue();
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                ReporterApi.a.b(reporterApi4, enumC5028l85, new C4336i42(d2111, d12, d13, d2112, "Real", str14, dDoubleValue7, dDoubleValue), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                ReporterApi.a.a(s07.g, EnumC5113la.COUNTER_WIN_REAL, new Integer(1));
                                C5189lv.k(C3784fT.a, null, new C5635o12(s07, null), 3);
                                return Unit.a;
                            }
                        }
                    }
                } else {
                    ReporterApi.a.a(reporterApi, EnumC5113la.COUNTER_WIN_DEMO, new Integer(1));
                    C5189lv.k(C3784fT.a, null, new C5845p12(s03, null), 3);
                    if (((Boolean) c4923kf.e.getValue()).booleanValue()) {
                        enumC5028l80 = EnumC5028l80.Z;
                    } else {
                        enumC5028l80 = EnumC5028l80.a0;
                    }
                    c6945uG = (C6945uG) c4923kf.k.getValue();
                    if (c6945uG != null) {
                        d2 = new Double(c6945uG.k);
                    } else {
                        d2 = null;
                    }
                    Double d2113 = s03.d0;
                    c5425n13.d = s03;
                    c5425n13.e = str2;
                    c5425n13.g = d;
                    c5425n13.h = enumC5028l80;
                    c5425n13.o = 6;
                    objV = s03.V(d2, d2113, "Demo", str2, d, c5425n13);
                    if (objV != mn) {
                        s04 = s03;
                        str3 = str2;
                        enumC5028l81 = enumC5028l80;
                        objA = objV;
                        d3 = d;
                        s04.g.h(enumC5028l81, (C4126h42) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                        C4923kf c4923kf7 = s04.c;
                        c6945uG5 = (C6945uG) c4923kf7.k.getValue();
                        if (c6945uG5 != null) {
                            d14 = new Double(c6945uG5.k);
                        } else {
                            d14 = null;
                        }
                        C6945uG c6945uG8 = (C6945uG) c4923kf7.k.getValue();
                        if (c6945uG8 != null) {
                        }
                        c5425n13.d = s04;
                        c5425n13.e = str3;
                        c5425n13.g = d3;
                        c5425n13.h = enumC5028l81;
                        c5425n13.i = d14;
                        c5425n13.o = 7;
                        objA = s04.m.b(d26, c5425n13);
                        if (objA != mn) {
                            str6 = str3;
                            s08 = s04;
                            enumC5028l86 = enumC5028l81;
                            d15 = d3;
                            d16 = d14;
                            d17 = (Double) objA;
                            d18 = s08.d0;
                            c5425n13.d = s08;
                            c5425n13.e = str6;
                            c5425n13.g = d15;
                            c5425n13.h = enumC5028l86;
                            c5425n13.i = d16;
                            c5425n13.j = d17;
                            c5425n13.k = d18;
                            c5425n13.o = 8;
                            objB3 = s08.m.b(d18, c5425n13);
                            if (objB3 != mn) {
                                d19 = d18;
                                objA = objB3;
                                Double d2114 = d17;
                                Double d2115 = d16;
                                String str15 = str6;
                                Double d2116 = (Double) objA;
                                double dDoubleValue8 = ((Number) s08.G.d.getValue()).doubleValue();
                                if (d15 != null) {
                                    dDoubleValue2 = d15.doubleValue();
                                } else {
                                    dDoubleValue2 = 0.0d;
                                }
                                ReporterApi.a.b(s08.g, enumC5028l86, new C4336i42(d2115, d2114, d19, d2116, "Demo", str15, dDoubleValue8, dDoubleValue2), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                                return Unit.a;
                            }
                        }
                    }
                }
                return mn;
            case 3:
                enumC5028l83 = (EnumC5028l80) c5425n13.i;
                reporterApi2 = (ReporterApi) c5425n13.h;
                d5 = c5425n13.g;
                str4 = c5425n13.e;
                s05 = c5425n13.d;
                C1795Pt1.b(objA);
                reporterApi2.h(enumC5028l83, (P80) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                reporterApi3 = s05.g;
                enumC5028l84 = EnumC5028l80.a0;
                C4923kf c4923kf8 = s05.c;
                c6945uG3 = (C6945uG) c4923kf8.k.getValue();
                if (c6945uG3 != null) {
                    d6 = new Double(c6945uG3.j);
                } else {
                    d6 = null;
                }
                c6945uG4 = (C6945uG) c4923kf8.k.getValue();
                if (c6945uG4 != null) {
                    d7 = new Double(c6945uG4.j);
                } else {
                    d7 = null;
                }
                c5425n13.d = s05;
                c5425n13.e = str4;
                c5425n13.g = d5;
                c5425n13.h = reporterApi3;
                c5425n13.i = enumC5028l84;
                c5425n13.j = d6;
                c5425n13.o = 4;
                objB = s05.m.b(d7, c5425n13);
                if (objB != mn) {
                    String str16 = str4;
                    reporterApi4 = reporterApi3;
                    objA = objB;
                    d8 = d6;
                    str5 = str16;
                    Double d2117 = d5;
                    enumC5028l85 = enumC5028l84;
                    s06 = s05;
                    d9 = d2117;
                    d10 = (Double) objA;
                    d11 = s06.e0;
                    c5425n13.d = s06;
                    c5425n13.e = str5;
                    c5425n13.g = d9;
                    c5425n13.h = reporterApi4;
                    c5425n13.i = enumC5028l85;
                    c5425n13.j = d8;
                    c5425n13.k = d10;
                    c5425n13.l = d11;
                    c5425n13.o = 5;
                    objB2 = s06.m.b(d11, c5425n13);
                    if (objB2 != mn) {
                        d12 = d10;
                        objA = objB2;
                        d13 = d11;
                        s07 = s06;
                        Double d2118 = d8;
                        String str17 = str5;
                        Double d2119 = (Double) objA;
                        double dDoubleValue9 = ((Number) s07.G.d.getValue()).doubleValue();
                        if (d9 != null) {
                            dDoubleValue = d9.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        ReporterApi.a.b(reporterApi4, enumC5028l85, new C4336i42(d2118, d12, d13, d2119, "Real", str17, dDoubleValue9, dDoubleValue), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                        ReporterApi.a.a(s07.g, EnumC5113la.COUNTER_WIN_REAL, new Integer(1));
                        C5189lv.k(C3784fT.a, null, new C5635o12(s07, null), 3);
                        return Unit.a;
                    }
                }
                return mn;
            case 4:
                Double d30 = c5425n13.j;
                EnumC5028l80 enumC5028l87 = (EnumC5028l80) c5425n13.i;
                ReporterApi reporterApi5 = (ReporterApi) c5425n13.h;
                Double d31 = c5425n13.g;
                String str18 = c5425n13.e;
                S02<T> s010 = c5425n13.d;
                C1795Pt1.b(objA);
                d8 = d30;
                s06 = s010;
                str5 = str18;
                d9 = d31;
                reporterApi4 = reporterApi5;
                enumC5028l85 = enumC5028l87;
                d10 = (Double) objA;
                d11 = s06.e0;
                c5425n13.d = s06;
                c5425n13.e = str5;
                c5425n13.g = d9;
                c5425n13.h = reporterApi4;
                c5425n13.i = enumC5028l85;
                c5425n13.j = d8;
                c5425n13.k = d10;
                c5425n13.l = d11;
                c5425n13.o = 5;
                objB2 = s06.m.b(d11, c5425n13);
                if (objB2 != mn) {
                    d12 = d10;
                    objA = objB2;
                    d13 = d11;
                    s07 = s06;
                    Double d21110 = d8;
                    String str19 = str5;
                    Double d21111 = (Double) objA;
                    double dDoubleValue10 = ((Number) s07.G.d.getValue()).doubleValue();
                    if (d9 != null) {
                        dDoubleValue = d9.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    ReporterApi.a.b(reporterApi4, enumC5028l85, new C4336i42(d21110, d12, d13, d21111, "Real", str19, dDoubleValue10, dDoubleValue), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                    ReporterApi.a.a(s07.g, EnumC5113la.COUNTER_WIN_REAL, new Integer(1));
                    C5189lv.k(C3784fT.a, null, new C5635o12(s07, null), 3);
                    return Unit.a;
                }
                return mn;
            case 5:
                Double d32 = c5425n13.l;
                Double d33 = c5425n13.k;
                d8 = c5425n13.j;
                enumC5028l85 = (EnumC5028l80) c5425n13.i;
                reporterApi4 = (ReporterApi) c5425n13.h;
                d9 = c5425n13.g;
                str5 = c5425n13.e;
                s07 = c5425n13.d;
                C1795Pt1.b(objA);
                d13 = d32;
                d12 = d33;
                Double d21112 = d8;
                String str110 = str5;
                Double d21113 = (Double) objA;
                double dDoubleValue11 = ((Number) s07.G.d.getValue()).doubleValue();
                if (d9 != null) {
                    dDoubleValue = d9.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                ReporterApi.a.b(reporterApi4, enumC5028l85, new C4336i42(d21112, d12, d13, d21113, "Real", str110, dDoubleValue11, dDoubleValue), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                ReporterApi.a.a(s07.g, EnumC5113la.COUNTER_WIN_REAL, new Integer(1));
                C5189lv.k(C3784fT.a, null, new C5635o12(s07, null), 3);
                return Unit.a;
            case 6:
                enumC5028l81 = (EnumC5028l80) c5425n13.h;
                d3 = c5425n13.g;
                str3 = c5425n13.e;
                s04 = c5425n13.d;
                C1795Pt1.b(objA);
                s04.g.h(enumC5028l81, (C4126h42) objA, VE.c(EnumC5326ma.g), Boolean.TRUE);
                C4923kf c4923kf9 = s04.c;
                c6945uG5 = (C6945uG) c4923kf9.k.getValue();
                if (c6945uG5 != null) {
                    d14 = new Double(c6945uG5.k);
                } else {
                    d14 = null;
                }
                C6945uG c6945uG9 = (C6945uG) c4923kf9.k.getValue();
                if (c6945uG9 != null) {
                }
                c5425n13.d = s04;
                c5425n13.e = str3;
                c5425n13.g = d3;
                c5425n13.h = enumC5028l81;
                c5425n13.i = d14;
                c5425n13.o = 7;
                objA = s04.m.b(d26, c5425n13);
                if (objA != mn) {
                    str6 = str3;
                    s08 = s04;
                    enumC5028l86 = enumC5028l81;
                    d15 = d3;
                    d16 = d14;
                    d17 = (Double) objA;
                    d18 = s08.d0;
                    c5425n13.d = s08;
                    c5425n13.e = str6;
                    c5425n13.g = d15;
                    c5425n13.h = enumC5028l86;
                    c5425n13.i = d16;
                    c5425n13.j = d17;
                    c5425n13.k = d18;
                    c5425n13.o = 8;
                    objB3 = s08.m.b(d18, c5425n13);
                    if (objB3 != mn) {
                        d19 = d18;
                        objA = objB3;
                        Double d21114 = d17;
                        Double d21115 = d16;
                        String str111 = str6;
                        Double d21116 = (Double) objA;
                        double dDoubleValue12 = ((Number) s08.G.d.getValue()).doubleValue();
                        if (d15 != null) {
                            dDoubleValue2 = d15.doubleValue();
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        ReporterApi.a.b(s08.g, enumC5028l86, new C4336i42(d21115, d21114, d19, d21116, "Demo", str111, dDoubleValue12, dDoubleValue2), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                        return Unit.a;
                    }
                }
                return mn;
            case 7:
                Double d34 = (Double) c5425n13.i;
                EnumC5028l80 enumC5028l88 = (EnumC5028l80) c5425n13.h;
                Double d35 = c5425n13.g;
                String str20 = c5425n13.e;
                S02<T> s011 = c5425n13.d;
                C1795Pt1.b(objA);
                s08 = s011;
                str6 = str20;
                d15 = d35;
                enumC5028l86 = enumC5028l88;
                d16 = d34;
                d17 = (Double) objA;
                d18 = s08.d0;
                c5425n13.d = s08;
                c5425n13.e = str6;
                c5425n13.g = d15;
                c5425n13.h = enumC5028l86;
                c5425n13.i = d16;
                c5425n13.j = d17;
                c5425n13.k = d18;
                c5425n13.o = 8;
                objB3 = s08.m.b(d18, c5425n13);
                if (objB3 != mn) {
                    d19 = d18;
                    objA = objB3;
                    Double d21117 = d17;
                    Double d21118 = d16;
                    String str112 = str6;
                    Double d21119 = (Double) objA;
                    double dDoubleValue13 = ((Number) s08.G.d.getValue()).doubleValue();
                    if (d15 != null) {
                        dDoubleValue2 = d15.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    ReporterApi.a.b(s08.g, enumC5028l86, new C4336i42(d21118, d21117, d19, d21119, "Demo", str112, dDoubleValue13, dDoubleValue2), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                    return Unit.a;
                }
                return mn;
            case 8:
                Double d36 = c5425n13.k;
                d17 = c5425n13.j;
                d16 = (Double) c5425n13.i;
                enumC5028l86 = (EnumC5028l80) c5425n13.h;
                d15 = c5425n13.g;
                str6 = c5425n13.e;
                s08 = c5425n13.d;
                C1795Pt1.b(objA);
                d19 = d36;
                Double d211110 = d17;
                Double d211111 = d16;
                String str113 = str6;
                Double d211112 = (Double) objA;
                double dDoubleValue14 = ((Number) s08.G.d.getValue()).doubleValue();
                if (d15 != null) {
                    dDoubleValue2 = d15.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                ReporterApi.a.b(s08.g, enumC5028l86, new C4336i42(d211111, d211110, d19, d211112, "Demo", str113, dDoubleValue14, dDoubleValue2), WE.f(EnumC5326ma.d, EnumC5326ma.e), 8);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0299  */
    /* JADX WARN: Code duplicated, block: B:107:0x029e  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ff A[PHI: r4 r6 r7
      0x02ff: PHI (r4v26 H32) = (r4v24 H32), (r4v27 H32) binds: [B:121:0x02fb, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r6v12 Dr) = (r6v10 Dr), (r6v13 Dr) binds: [B:121:0x02fb, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r7v24 S02<T extends H32>) = (r7v21 S02<T extends H32>), (r7v26 S02<T extends H32>) binds: [B:121:0x02fb, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x0314  */
    /* JADX WARN: Code duplicated, block: B:127:0x0315 A[PHI: r11 r12 r13
      0x0315: PHI (r11v9 H32) = (r11v2 H32), (r11v2 H32), (r11v6 H32), (r11v7 H32), (r11v10 H32) binds: [B:109:0x02a4, B:91:0x0237, B:126:0x0314, B:106:0x0299, B:105:0x0294] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r12v11 Dr) = (r12v2 Dr), (r12v2 Dr), (r12v6 Dr), (r12v8 Dr), (r12v12 Dr) binds: [B:109:0x02a4, B:91:0x0237, B:126:0x0314, B:106:0x0299, B:105:0x0294] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r13v11 S02<T extends H32>) = 
      (r13v2 S02<T extends H32>)
      (r13v2 S02<T extends H32>)
      (r13v7 S02<T extends H32>)
      (r13v9 S02<T extends H32>)
      (r13v12 S02<T extends H32>)
     binds: [B:109:0x02a4, B:91:0x0237, B:126:0x0314, B:106:0x0299, B:105:0x0294] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0356 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:134:0x0359  */
    /* JADX WARN: Code duplicated, block: B:143:0x0378  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f A[PHI: r9 r10 r11 r12 r13
      0x010f: PHI (r9v5 g21) = (r9v2 g21), (r9v6 g21) binds: [B:34:0x0103, B:44:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r10v1 java.lang.Double) = (r10v0 java.lang.Double), (r10v2 java.lang.Double) binds: [B:34:0x0103, B:44:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r11v1 H32) = (r11v0 H32), (r11v2 H32) binds: [B:34:0x0103, B:44:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r12v1 Dr) = (r12v0 Dr), (r12v2 Dr) binds: [B:34:0x0103, B:44:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r13v1 S02<T extends H32>) = (r13v0 S02<T extends H32>), (r13v2 S02<T extends H32>) binds: [B:34:0x0103, B:44:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0123  */
    /* JADX WARN: Code duplicated, block: B:42:0x0154 A[PHI: r7 r8 r9 r10 r11 r12 r13
      0x0154: PHI (r7v15 java.util.Map) = (r7v9 java.util.Map), (r7v16 java.util.Map) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r8v11 java.lang.Object) = (r8v4 java.lang.Object), (r8v12 java.lang.Object) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r9v12 g21) = (r9v5 g21), (r9v13 g21) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r10v3 java.lang.Double) = (r10v1 java.lang.Double), (r10v4 java.lang.Double) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r11v3 H32) = (r11v1 H32), (r11v4 H32) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r12v3 Dr) = (r12v1 Dr), (r12v4 Dr) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r13v3 S02<T extends H32>) = (r13v1 S02<T extends H32>), (r13v4 S02<T extends H32>) binds: [B:36:0x0121, B:41:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0194  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x020c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0211  */
    /* JADX WARN: Code duplicated, block: B:85:0x0218  */
    /* JADX WARN: Code duplicated, block: B:88:0x0221  */
    /* JADX WARN: Code duplicated, block: B:90:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0239  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x0266  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0121 -> B:42:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013f -> B:40:0x0143). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:73:0x01ea
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object y(defpackage.C0849Dr r22, defpackage.H32 r23, defpackage.LM r24) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S02.y(Dr, H32, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(C2099Tr c2099Tr, String str, LM lm) {
        C6264r12 c6264r12;
        if (lm instanceof C6264r12) {
            c6264r12 = (C6264r12) lm;
            int i = c6264r12.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6264r12.g = i - Integer.MIN_VALUE;
            } else {
                c6264r12 = new C6264r12(this, lm);
            }
        } else {
            c6264r12 = new C6264r12(this, lm);
        }
        Object obj = c6264r12.d;
        MN mn = MN.d;
        int i2 = c6264r12.g;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return null;
        }
        C1795Pt1.b(obj);
        Q(c2099Tr);
        C4462ih c4462ih = U0.t;
        if (c4462ih != null) {
            String str2 = this.o0;
            if (str2 == null) {
                str2 = "";
            }
            c4462ih.invoke(c2099Tr, str2);
        }
        L(this, c2099Tr, c2099Tr.b, 4);
        c6264r12.g = 1;
        if (U(c2099Tr, str, c6264r12) == mn) {
            return mn;
        }
        return null;
    }
}
