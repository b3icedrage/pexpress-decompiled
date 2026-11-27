package defpackage;

import androidx.fragment.app.Fragment;
import com.api.core.BaseFragment;
import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import io.sentry.android.core.b0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4617jA1 {

    @NotNull
    public Function0<? extends KN> A;

    @NotNull
    public final C1699On1 B;

    @NotNull
    public final C1621Nn1 C;

    @NotNull
    public final C1621Nn1 D;

    @NotNull
    public final GP1 E;

    @NotNull
    public final C1699On1 F;

    @NotNull
    public final GP1 G;

    @NotNull
    public final C1699On1 H;

    @NotNull
    public final GP1 I;

    @NotNull
    public final C1699On1 J;

    @NotNull
    public final GP1 K;

    @NotNull
    public final C1699On1 L;

    @NotNull
    public final C1183Hy0 M;

    @NotNull
    public final C1699On1 N;

    @NotNull
    public final InterfaceC6396rf0<Boolean> O;

    @Nullable
    public C2936bP1 P;

    @NotNull
    public final AtomicBoolean Q;

    @Nullable
    public XF0 R;

    @Nullable
    public Double S;

    @Nullable
    public Double T;

    @NotNull
    public final C1621Nn1 U;

    @NotNull
    public final C1699On1 V;

    @NotNull
    public final C1699On1 W;

    @NotNull
    public final C1699On1 X;
    public int Y;

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C4612j90 b;

    @NotNull
    public final AbstractC7004uZ1 c;

    @NotNull
    public final S02<?> d;

    @NotNull
    public final D32 e;

    @NotNull
    public final InterfaceC3902g10 f;

    @NotNull
    public final InterfaceC7139vA1 g;

    @NotNull
    public final ReporterApi h;

    @NotNull
    public final NQ i;

    @NotNull
    public final Q11 j;

    @NotNull
    public final VQ k;

    @NotNull
    public final C3149cR l;

    @NotNull
    public final M10 m;

    @NotNull
    public final U22 n;

    @NotNull
    public final O3 o;

    @NotNull
    public final EQ p;

    @NotNull
    public final InterfaceC2152Ui1 q;

    @NotNull
    public final AbstractC4892kW0 r;

    @NotNull
    public final AbstractC6764tP1 s;

    @NotNull
    public final C3633ej1 t;

    @NotNull
    public final InterfaceC4263hj1 u;

    @NotNull
    public final InterfaceC7012ub2 v;

    @NotNull
    public final Ki2 w;

    @NotNull
    public final OM x;

    @NotNull
    public final InterfaceC3706f42 y;

    @NotNull
    public final C5206lz1 z;

    /* JADX INFO: renamed from: jA1$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ C1699On1 d;

        /* JADX INFO: renamed from: jA1$a$a, reason: collision with other inner class name */
        public static final class C0410a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: jA1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$special$$inlined$map$1$2", f = "RobotTrading.kt", l = {219}, m = "emit")
            public static final class C0411a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0411a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0410a.this.a(null, this);
                }
            }

            public C0410a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0411a c0411a;
                if (jm instanceof C0411a) {
                    c0411a = (C0411a) jm;
                    int i = c0411a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0411a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0411a = new C0411a(jm);
                    }
                } else {
                    c0411a = new C0411a(jm);
                }
                Object obj2 = c0411a.d;
                MN mn = MN.d;
                int i2 = c0411a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((C3279d22) obj) != null);
                    c0411a.e = 1;
                    if (this.d.a(boolValueOf, c0411a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(C1699On1 c1699On1) {
            this.d = c1699On1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new C0410a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: jA1$b */
    public static final class b implements Function0 {
        public static final b d = new b();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    public C4617jA1(@NotNull C4923kf appData, @NotNull C4612j90 events, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull S02<?> trader, @NotNull D32 notificationController, @NotNull InterfaceC3902g10 dialogsProvider, @NotNull InterfaceC7139vA1 callbacks, @NotNull ReporterApi reporter, @NotNull HA1 robotTradingReporterFactory, @NotNull NQ currentIndicatorProvider, @NotNull Q11 multipleStopChecker, @NotNull VQ currentStartAmountProvider, @NotNull C3149cR currentStrategyProvider, @NotNull M10 directionCalculatorProvider, @NotNull U22 tradingDefaultsProvider, @NotNull J22 currentAssetProvider, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase, @NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase, @NotNull AbstractC6764tP1 startedDemoTradingIdsUseCase, @NotNull C3633ej1 profitLimitWithActivationBottomSheetDataProvider, @NotNull InterfaceC4263hj1 profitLimitWithActivationDialogsInRowCountProvider, @NotNull InterfaceC7012ub2 userRepository, @NotNull Ki2 winCounterForAppReview, @NotNull OM convertCurrencyUseCase, @NotNull InterfaceC3706f42 telemetryReporter, @NotNull C5206lz1 sessionIdHolder) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(trader, "trader");
        Intrinsics.checkNotNullParameter(notificationController, "notificationController");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(robotTradingReporterFactory, "robotTradingReporterFactory");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(multipleStopChecker, "multipleStopChecker");
        Intrinsics.checkNotNullParameter(currentStartAmountProvider, "currentStartAmountProvider");
        Intrinsics.checkNotNullParameter(currentStrategyProvider, "currentStrategyProvider");
        Intrinsics.checkNotNullParameter(directionCalculatorProvider, "directionCalculatorProvider");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(currentAssetProvider, "currentAssetProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        Intrinsics.checkNotNullParameter(startedDemoTradingIdsUseCase, "startedDemoTradingIdsUseCase");
        Intrinsics.checkNotNullParameter(profitLimitWithActivationBottomSheetDataProvider, "profitLimitWithActivationBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(profitLimitWithActivationDialogsInRowCountProvider, "profitLimitWithActivationDialogsInRowCountProvider");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(winCounterForAppReview, "winCounterForAppReview");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        Intrinsics.checkNotNullParameter(sessionIdHolder, "sessionIdHolder");
        this.a = appData;
        this.b = events;
        this.c = timeSelectionsProvider;
        this.d = trader;
        this.e = notificationController;
        this.f = dialogsProvider;
        this.g = callbacks;
        this.h = reporter;
        this.i = currentIndicatorProvider;
        this.j = multipleStopChecker;
        this.k = currentStartAmountProvider;
        this.l = currentStrategyProvider;
        this.m = directionCalculatorProvider;
        this.n = tradingDefaultsProvider;
        this.o = accountModeSelectionUseCase;
        this.p = currencySignProvider;
        this.q = profitLimitUseCase;
        this.r = manualAssetSelectionEnabledUseCase;
        this.s = startedDemoTradingIdsUseCase;
        this.t = profitLimitWithActivationBottomSheetDataProvider;
        this.u = profitLimitWithActivationDialogsInRowCountProvider;
        this.v = userRepository;
        this.w = winCounterForAppReview;
        this.x = convertCurrencyUseCase;
        this.y = telemetryReporter;
        this.z = sessionIdHolder;
        this.A = b.d;
        this.B = trader.y;
        this.C = trader.w;
        this.D = trader.x;
        Boolean bool = Boolean.FALSE;
        GP1 gp1I = C1589Ne.i(bool);
        this.E = gp1I;
        this.F = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(-1);
        this.G = gp1I2;
        this.H = C4466ii.f(gp1I2);
        GP1 gp1I3 = C1589Ne.i(bool);
        this.I = gp1I3;
        this.J = C4466ii.f(gp1I3);
        GP1 gp1I4 = C1589Ne.i(EnumC4164hF1.g);
        this.K = gp1I4;
        this.L = C4466ii.f(gp1I4);
        this.M = robotTradingReporterFactory.a;
        C1699On1 c1699On1 = currentAssetProvider.f;
        this.N = c1699On1;
        this.O = C4466ii.m(new a(c1699On1));
        this.Q = new AtomicBoolean(false);
        this.U = trader.I;
        this.V = trader.A;
        this.W = trader.G;
        this.X = trader.E;
        AbstractC1787Pr.a aVar = betDurationUseCase.b;
        this.Y = trader.r0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10.m(r2, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.C4617jA1 r9, defpackage.LM r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.C1498Lz1
            if (r0 == 0) goto L16
            r0 = r10
            Lz1 r0 = (defpackage.C1498Lz1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.i = r1
            goto L1b
        L16:
            Lz1 r0 = new Lz1
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.C1795Pt1.b(r10)
            goto L90
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.String r9 = r0.e
            jA1 r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L72
        L3e:
            defpackage.C1795Pt1.b(r10)
            kf r10 = r9.a
            GP1 r10 = r10.k
            java.lang.Object r10 = r10.getValue()
            uG r10 = (defpackage.C6945uG) r10
            if (r10 == 0) goto L59
            java.lang.Long r2 = new java.lang.Long
            long r6 = r10.a
            r2.<init>(r6)
            java.lang.String r10 = r2.toString()
            goto L5a
        L59:
            r10 = r5
        L5a:
            Nz1 r2 = new Nz1
            r2.<init>(r9, r5)
            r0.d = r9
            r0.e = r10
            r0.i = r4
            java.lang.String r4 = "started_demo_trading_ids"
            java.lang.Object r2 = defpackage.C7236vf0.c(r4, r2, r0)
            if (r2 != r1) goto L6e
            goto L8f
        L6e:
            r8 = r2
            r2 = r9
            r9 = r10
            r10 = r8
        L72:
            java.util.Set r10 = (java.util.Set) r10
            if (r9 == 0) goto L93
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L93
            tP1 r10 = r2.s
            Mz1 r2 = new Mz1
            r2.<init>(r9, r5)
            r0.d = r5
            r0.e = r5
            r0.i = r3
            java.lang.Object r9 = r10.m(r2, r0)
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L93:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4617jA1.a(jA1, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f4 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:114:0x01ec, B:117:0x01f4, B:119:0x0200, B:123:0x0207, B:124:0x020c, B:125:0x020d, B:127:0x0219), top: B:167:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0200 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:114:0x01ec, B:117:0x01f4, B:119:0x0200, B:123:0x0207, B:124:0x020c, B:125:0x020d, B:127:0x0219), top: B:167:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0203  */
    /* JADX WARN: Code duplicated, block: B:123:0x0207 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:114:0x01ec, B:117:0x01f4, B:119:0x0200, B:123:0x0207, B:124:0x020c, B:125:0x020d, B:127:0x0219), top: B:167:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:125:0x020d A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:114:0x01ec, B:117:0x01f4, B:119:0x0200, B:123:0x0207, B:124:0x020c, B:125:0x020d, B:127:0x0219), top: B:167:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0219 A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {all -> 0x0205, blocks: (B:114:0x01ec, B:117:0x01f4, B:119:0x0200, B:123:0x0207, B:124:0x020c, B:125:0x020d, B:127:0x0219), top: B:167:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0226  */
    /* JADX WARN: Code duplicated, block: B:136:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0233 A[Catch: all -> 0x0249, TryCatch #5 {all -> 0x0249, blocks: (B:134:0x022b, B:137:0x0233, B:139:0x023f, B:143:0x024b, B:144:0x0250, B:145:0x0251, B:147:0x025d), top: B:174:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:139:0x023f A[Catch: all -> 0x0249, TryCatch #5 {all -> 0x0249, blocks: (B:134:0x022b, B:137:0x0233, B:139:0x023f, B:143:0x024b, B:144:0x0250, B:145:0x0251, B:147:0x025d), top: B:174:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0247  */
    /* JADX WARN: Code duplicated, block: B:143:0x024b A[Catch: all -> 0x0249, TryCatch #5 {all -> 0x0249, blocks: (B:134:0x022b, B:137:0x0233, B:139:0x023f, B:143:0x024b, B:144:0x0250, B:145:0x0251, B:147:0x025d), top: B:174:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0251 A[Catch: all -> 0x0249, TryCatch #5 {all -> 0x0249, blocks: (B:134:0x022b, B:137:0x0233, B:139:0x023f, B:143:0x024b, B:144:0x0250, B:145:0x0251, B:147:0x025d), top: B:174:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:147:0x025d A[Catch: all -> 0x0249, TRY_LEAVE, TryCatch #5 {all -> 0x0249, blocks: (B:134:0x022b, B:137:0x0233, B:139:0x023f, B:143:0x024b, B:144:0x0250, B:145:0x0251, B:147:0x025d), top: B:174:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0270  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:80:0x015d  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0182 A[Catch: all -> 0x0066, TryCatch #2 {all -> 0x0066, blocks: (B:23:0x0061, B:86:0x017e, B:88:0x0182, B:90:0x0186), top: B:168:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0185  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    public static final Object b(C4617jA1 c4617jA1, LM lm) {
        C1735Oz1 c1735Oz1;
        C4617jA1 c4617jA2;
        String str;
        EnumC4164hF1 enumC4164hF1;
        Object objA;
        String str2;
        EnumC4164hF1 enumC4164hF2;
        String str3;
        C4617jA1 c4617jA3;
        Object objA2;
        Integer num;
        String str4;
        Integer num2;
        Object objO;
        Object objA3;
        String str5;
        Integer num3;
        String str6;
        Object objQ;
        Object objA4;
        String str7;
        String str8;
        Integer num4;
        String str9;
        EnumC4164hF1 enumC4164hF3;
        String str10;
        C4617jA1 c4617jA4;
        Object objC;
        C1491Lx0 c1491Lx0;
        Object objA5;
        Object objA6;
        Object objA7;
        String str11;
        int iOrdinal;
        C6945uG c6945uG;
        C6945uG c6945uG2;
        int iOrdinal2;
        C6945uG c6945uG3;
        C6945uG c6945uG4;
        C4617jA1 c4617jA5 = c4617jA1;
        c4617jA5.getClass();
        if (lm instanceof C1735Oz1) {
            c1735Oz1 = (C1735Oz1) lm;
            int i = c1735Oz1.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1735Oz1.n = i - Integer.MIN_VALUE;
            } else {
                c1735Oz1 = new C1735Oz1(c4617jA5, lm);
            }
        } else {
            c1735Oz1 = new C1735Oz1(c4617jA5, lm);
        }
        Object objA8 = c1735Oz1.l;
        MN mn = MN.d;
        int i2 = c1735Oz1.n;
        try {
            try {
                if (i2 == 0) {
                    C1795Pt1.b(objA8);
                    c1735Oz1.d = c4617jA5;
                    c1735Oz1.n = 1;
                    objA8 = c4617jA5.z.a(c1735Oz1);
                    if (objA8 == mn) {
                        return mn;
                    }
                } else if (i2 == 1) {
                    c4617jA5 = c1735Oz1.d;
                    C1795Pt1.b(objA8);
                } else if (i2 == 2) {
                    str3 = c1735Oz1.h;
                    enumC4164hF2 = c1735Oz1.g;
                    str = c1735Oz1.e;
                    c4617jA3 = c1735Oz1.d;
                    try {
                        C1795Pt1.b(objA8);
                        long j = ((C1709Or) objA8).a;
                        kotlin.time.b.a aVar = kotlin.time.b.e;
                        objA2 = new Integer((int) kotlin.time.b.r(j, R40.SECONDS));
                        C1717Ot1.a aVar2 = C1717Ot1.e;
                    } catch (Throwable th) {
                        th = th;
                        C1717Ot1.a aVar3 = C1717Ot1.e;
                        objA2 = C1795Pt1.a(th);
                    }
                    if (objA2 instanceof C1717Ot1.b) {
                        objA2 = null;
                    }
                    num = (Integer) objA2;
                    try {
                        C3149cR c3149cR = c4617jA3.l;
                        c1735Oz1.d = c4617jA3;
                        c1735Oz1.e = str;
                        c1735Oz1.g = enumC4164hF2;
                        c1735Oz1.h = str3;
                        c1735Oz1.i = num;
                        c1735Oz1.n = 3;
                        objO = C4466ii.o(c3149cR.c.k(), c1735Oz1);
                        if (objO == mn) {
                            return mn;
                        }
                        str4 = str3;
                        num2 = num;
                        objA8 = objO;
                        objA3 = ((EnumC2644a42) objA8).name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(objA3, "toLowerCase(...)");
                        C1717Ot1.a aVar4 = C1717Ot1.e;
                        if (objA3 instanceof C1717Ot1.b) {
                            objA3 = null;
                        }
                        str5 = (String) objA3;
                        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf0 = c4617jA3.i.b;
                        c1735Oz1.d = c4617jA3;
                        c1735Oz1.e = str;
                        c1735Oz1.g = enumC4164hF2;
                        c1735Oz1.h = str4;
                        c1735Oz1.i = num2;
                        c1735Oz1.j = str5;
                        c1735Oz1.n = 4;
                        objQ = C4466ii.q(interfaceC6396rf0, c1735Oz1);
                        if (objQ == mn) {
                            return mn;
                        }
                        num3 = num2;
                        str6 = str5;
                        objA8 = objQ;
                        c1491Lx0 = (C1491Lx0) objA8;
                        if (c1491Lx0 != null) {
                            objA4 = c1491Lx0.b;
                        } else {
                            objA4 = null;
                        }
                        C1717Ot1.a aVar5 = C1717Ot1.e;
                        if (objA4 instanceof C1717Ot1.b) {
                            objA4 = null;
                        }
                        str7 = (String) objA4;
                        VQ vq = c4617jA3.k;
                        c1735Oz1.d = c4617jA3;
                        c1735Oz1.e = str;
                        c1735Oz1.g = enumC4164hF2;
                        c1735Oz1.h = str4;
                        c1735Oz1.i = num3;
                        c1735Oz1.j = str6;
                        c1735Oz1.k = str7;
                        c1735Oz1.n = 5;
                        objC = vq.c(enumC4164hF2, c1735Oz1);
                        if (objC == mn) {
                            return mn;
                        }
                        str8 = str7;
                        num4 = num3;
                        str9 = str4;
                        enumC4164hF3 = enumC4164hF2;
                        str10 = str;
                        c4617jA4 = c4617jA3;
                        objA8 = objC;
                        objA5 = new Double(((Number) objA8).longValue());
                        C1717Ot1.a aVar6 = C1717Ot1.e;
                        String str12 = str8;
                        String str13 = str6;
                        Integer num5 = num4;
                        String str14 = str9;
                        String str15 = str10;
                        if (objA5 instanceof C1717Ot1.b) {
                            objA5 = null;
                        }
                        Double d = (Double) objA5;
                        iOrdinal2 = enumC4164hF3.ordinal();
                        if (iOrdinal2 == 0) {
                            c6945uG3 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG3 != null) {
                                objA6 = c6945uG3.h;
                            } else {
                                objA6 = null;
                            }
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new C6489s51();
                            }
                            c6945uG4 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG4 != null) {
                                objA6 = c6945uG4.g;
                            } else {
                                objA6 = null;
                            }
                        }
                        if (objA6 instanceof C1717Ot1.b) {
                            objA6 = null;
                        }
                        String str16 = (String) objA6;
                        iOrdinal = enumC4164hF3.ordinal();
                        if (iOrdinal == 0) {
                            c6945uG = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG != null) {
                                objA7 = new Double(c6945uG.k);
                            } else {
                                objA7 = null;
                            }
                        } else {
                            if (iOrdinal != 1) {
                                throw new C6489s51();
                            }
                            c6945uG2 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG2 != null) {
                                objA7 = new Double(c6945uG2.j);
                            } else {
                                objA7 = null;
                            }
                        }
                        Double d2 = (Double) (objA7 instanceof C1717Ot1.b ? null : objA7);
                        C4993kz1 c4993kz1 = new C4993kz1(str15, enumC4164hF3.d, str14, num5, str13, str12, d, str16, d2, str16, System.currentTimeMillis());
                        for (Map.Entry entry : PW0.e(new Pair("asset", str14), new Pair("timeframeS", num5), new Pair("strategyId", str13), new Pair("indicatorId", str12), new Pair("startAmount", d), new Pair("amountCurrency", str16), new Pair("startBalance", d2)).entrySet()) {
                            str11 = (String) entry.getKey();
                            if (entry.getValue() == null) {
                                C1717Ot1.a aVar7 = C1717Ot1.e;
                                c4617jA4.y.Y(new RuntimeException("session context field null at start: " + str11), PW0.e(new Pair("field", str11), new Pair("phase", "session_start")));
                                Unit unit = Unit.a;
                            }
                        }
                        return c4993kz1;
                    } catch (Throwable th2) {
                        th = th2;
                        str4 = str3;
                        num2 = num;
                        C1717Ot1.a aVar8 = C1717Ot1.e;
                        objA3 = C1795Pt1.a(th);
                    }
                } else if (i2 == 3) {
                    num2 = c1735Oz1.i;
                    str4 = c1735Oz1.h;
                    enumC4164hF2 = c1735Oz1.g;
                    str = c1735Oz1.e;
                    c4617jA3 = c1735Oz1.d;
                    try {
                        C1795Pt1.b(objA8);
                        objA3 = ((EnumC2644a42) objA8).name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(objA3, "toLowerCase(...)");
                        C1717Ot1.a aVar9 = C1717Ot1.e;
                    } catch (Throwable th3) {
                        th = th3;
                        C1717Ot1.a aVar10 = C1717Ot1.e;
                        objA3 = C1795Pt1.a(th);
                    }
                    if (objA3 instanceof C1717Ot1.b) {
                        objA3 = null;
                    }
                    str5 = (String) objA3;
                    try {
                        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf1 = c4617jA3.i.b;
                        c1735Oz1.d = c4617jA3;
                        c1735Oz1.e = str;
                        c1735Oz1.g = enumC4164hF2;
                        c1735Oz1.h = str4;
                        c1735Oz1.i = num2;
                        c1735Oz1.j = str5;
                        c1735Oz1.n = 4;
                        objQ = C4466ii.q(interfaceC6396rf1, c1735Oz1);
                        if (objQ == mn) {
                            return mn;
                        }
                        num3 = num2;
                        str6 = str5;
                        objA8 = objQ;
                        c1491Lx0 = (C1491Lx0) objA8;
                        if (c1491Lx0 != null) {
                            objA4 = c1491Lx0.b;
                        } else {
                            objA4 = null;
                        }
                        C1717Ot1.a aVar11 = C1717Ot1.e;
                        if (objA4 instanceof C1717Ot1.b) {
                            objA4 = null;
                        }
                        str7 = (String) objA4;
                        VQ vq2 = c4617jA3.k;
                        c1735Oz1.d = c4617jA3;
                        c1735Oz1.e = str;
                        c1735Oz1.g = enumC4164hF2;
                        c1735Oz1.h = str4;
                        c1735Oz1.i = num3;
                        c1735Oz1.j = str6;
                        c1735Oz1.k = str7;
                        c1735Oz1.n = 5;
                        objC = vq2.c(enumC4164hF2, c1735Oz1);
                        if (objC == mn) {
                            return mn;
                        }
                        str8 = str7;
                        num4 = num3;
                        str9 = str4;
                        enumC4164hF3 = enumC4164hF2;
                        str10 = str;
                        c4617jA4 = c4617jA3;
                        objA8 = objC;
                        objA5 = new Double(((Number) objA8).longValue());
                        C1717Ot1.a aVar12 = C1717Ot1.e;
                        String str17 = str8;
                        String str18 = str6;
                        Integer num6 = num4;
                        String str19 = str9;
                        String str110 = str10;
                        if (objA5 instanceof C1717Ot1.b) {
                            objA5 = null;
                        }
                        Double d3 = (Double) objA5;
                        iOrdinal2 = enumC4164hF3.ordinal();
                        if (iOrdinal2 == 0) {
                            c6945uG3 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG3 != null) {
                                objA6 = c6945uG3.h;
                            } else {
                                objA6 = null;
                            }
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new C6489s51();
                            }
                            c6945uG4 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG4 != null) {
                                objA6 = c6945uG4.g;
                            } else {
                                objA6 = null;
                            }
                        }
                        if (objA6 instanceof C1717Ot1.b) {
                            objA6 = null;
                        }
                        String str111 = (String) objA6;
                        iOrdinal = enumC4164hF3.ordinal();
                        if (iOrdinal == 0) {
                            c6945uG = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG != null) {
                                objA7 = new Double(c6945uG.k);
                            } else {
                                objA7 = null;
                            }
                        } else {
                            if (iOrdinal != 1) {
                                throw new C6489s51();
                            }
                            c6945uG2 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG2 != null) {
                                objA7 = new Double(c6945uG2.j);
                            } else {
                                objA7 = null;
                            }
                        }
                        Double d4 = (Double) (objA7 instanceof C1717Ot1.b ? null : objA7);
                        C4993kz1 c4993kz2 = new C4993kz1(str110, enumC4164hF3.d, str19, num6, str18, str17, d3, str111, d4, str111, System.currentTimeMillis());
                        while (r1.hasNext()) {
                            str11 = (String) entry.getKey();
                            if (entry.getValue() == null) {
                                C1717Ot1.a aVar13 = C1717Ot1.e;
                                c4617jA4.y.Y(new RuntimeException("session context field null at start: " + str11), PW0.e(new Pair("field", str11), new Pair("phase", "session_start")));
                                Unit unit2 = Unit.a;
                            }
                        }
                        return c4993kz2;
                    } catch (Throwable th4) {
                        th = th4;
                        num3 = num2;
                        str6 = str5;
                        C1717Ot1.a aVar14 = C1717Ot1.e;
                        objA4 = C1795Pt1.a(th);
                    }
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str8 = c1735Oz1.k;
                        str6 = c1735Oz1.j;
                        num4 = c1735Oz1.i;
                        str9 = c1735Oz1.h;
                        enumC4164hF3 = c1735Oz1.g;
                        str10 = c1735Oz1.e;
                        c4617jA4 = c1735Oz1.d;
                        try {
                            C1795Pt1.b(objA8);
                            objA5 = new Double(((Number) objA8).longValue());
                            C1717Ot1.a aVar15 = C1717Ot1.e;
                        } catch (Throwable th5) {
                            th = th5;
                            C1717Ot1.a aVar16 = C1717Ot1.e;
                            objA5 = C1795Pt1.a(th);
                        }
                        String str112 = str8;
                        String str113 = str6;
                        Integer num7 = num4;
                        String str114 = str9;
                        String str115 = str10;
                        if (objA5 instanceof C1717Ot1.b) {
                            objA5 = null;
                        }
                        Double d5 = (Double) objA5;
                        try {
                            iOrdinal2 = enumC4164hF3.ordinal();
                            if (iOrdinal2 == 0) {
                                c6945uG3 = (C6945uG) c4617jA4.a.k.getValue();
                                if (c6945uG3 != null) {
                                    objA6 = c6945uG3.h;
                                } else {
                                    objA6 = null;
                                }
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new C6489s51();
                                }
                                c6945uG4 = (C6945uG) c4617jA4.a.k.getValue();
                                if (c6945uG4 != null) {
                                    objA6 = c6945uG4.g;
                                } else {
                                    objA6 = null;
                                }
                            }
                        } catch (Throwable th6) {
                            C1717Ot1.a aVar17 = C1717Ot1.e;
                            objA6 = C1795Pt1.a(th6);
                        }
                        if (objA6 instanceof C1717Ot1.b) {
                            objA6 = null;
                        }
                        String str116 = (String) objA6;
                        try {
                            iOrdinal = enumC4164hF3.ordinal();
                            if (iOrdinal == 0) {
                                c6945uG = (C6945uG) c4617jA4.a.k.getValue();
                                if (c6945uG != null) {
                                    objA7 = new Double(c6945uG.k);
                                } else {
                                    objA7 = null;
                                }
                            } else {
                                if (iOrdinal != 1) {
                                    throw new C6489s51();
                                }
                                c6945uG2 = (C6945uG) c4617jA4.a.k.getValue();
                                if (c6945uG2 != null) {
                                    objA7 = new Double(c6945uG2.j);
                                } else {
                                    objA7 = null;
                                }
                            }
                        } catch (Throwable th7) {
                            C1717Ot1.a aVar18 = C1717Ot1.e;
                            objA7 = C1795Pt1.a(th7);
                        }
                        Double d6 = (Double) (objA7 instanceof C1717Ot1.b ? null : objA7);
                        C4993kz1 c4993kz3 = new C4993kz1(str115, enumC4164hF3.d, str114, num7, str113, str112, d5, str116, d6, str116, System.currentTimeMillis());
                        while (r1.hasNext()) {
                            str11 = (String) entry.getKey();
                            if (entry.getValue() == null) {
                                try {
                                    C1717Ot1.a aVar19 = C1717Ot1.e;
                                    c4617jA4.y.Y(new RuntimeException("session context field null at start: " + str11), PW0.e(new Pair("field", str11), new Pair("phase", "session_start")));
                                    Unit unit3 = Unit.a;
                                } catch (Throwable th8) {
                                    C1717Ot1.a aVar20 = C1717Ot1.e;
                                    C1795Pt1.a(th8);
                                }
                            }
                        }
                        return c4993kz3;
                    }
                    str6 = c1735Oz1.j;
                    num3 = c1735Oz1.i;
                    str4 = c1735Oz1.h;
                    enumC4164hF2 = c1735Oz1.g;
                    str = c1735Oz1.e;
                    c4617jA3 = c1735Oz1.d;
                    try {
                        C1795Pt1.b(objA8);
                        c1491Lx0 = (C1491Lx0) objA8;
                        if (c1491Lx0 != null) {
                            objA4 = c1491Lx0.b;
                        } else {
                            objA4 = null;
                        }
                        C1717Ot1.a aVar110 = C1717Ot1.e;
                    } catch (Throwable th9) {
                        th = th9;
                        C1717Ot1.a aVar111 = C1717Ot1.e;
                        objA4 = C1795Pt1.a(th);
                    }
                    if (objA4 instanceof C1717Ot1.b) {
                        objA4 = null;
                    }
                    str7 = (String) objA4;
                    try {
                        VQ vq3 = c4617jA3.k;
                        c1735Oz1.d = c4617jA3;
                        c1735Oz1.e = str;
                        c1735Oz1.g = enumC4164hF2;
                        c1735Oz1.h = str4;
                        c1735Oz1.i = num3;
                        c1735Oz1.j = str6;
                        c1735Oz1.k = str7;
                        c1735Oz1.n = 5;
                        objC = vq3.c(enumC4164hF2, c1735Oz1);
                        if (objC == mn) {
                            return mn;
                        }
                        str8 = str7;
                        num4 = num3;
                        str9 = str4;
                        enumC4164hF3 = enumC4164hF2;
                        str10 = str;
                        c4617jA4 = c4617jA3;
                        objA8 = objC;
                        objA5 = new Double(((Number) objA8).longValue());
                        C1717Ot1.a aVar112 = C1717Ot1.e;
                        String str117 = str8;
                        String str118 = str6;
                        Integer num8 = num4;
                        String str119 = str9;
                        String str1110 = str10;
                        if (objA5 instanceof C1717Ot1.b) {
                            objA5 = null;
                        }
                        Double d7 = (Double) objA5;
                        iOrdinal2 = enumC4164hF3.ordinal();
                        if (iOrdinal2 == 0) {
                            c6945uG3 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG3 != null) {
                                objA6 = c6945uG3.h;
                            } else {
                                objA6 = null;
                            }
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new C6489s51();
                            }
                            c6945uG4 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG4 != null) {
                                objA6 = c6945uG4.g;
                            } else {
                                objA6 = null;
                            }
                        }
                        if (objA6 instanceof C1717Ot1.b) {
                            objA6 = null;
                        }
                        String str1111 = (String) objA6;
                        iOrdinal = enumC4164hF3.ordinal();
                        if (iOrdinal == 0) {
                            c6945uG = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG != null) {
                                objA7 = new Double(c6945uG.k);
                            } else {
                                objA7 = null;
                            }
                        } else {
                            if (iOrdinal != 1) {
                                throw new C6489s51();
                            }
                            c6945uG2 = (C6945uG) c4617jA4.a.k.getValue();
                            if (c6945uG2 != null) {
                                objA7 = new Double(c6945uG2.j);
                            } else {
                                objA7 = null;
                            }
                        }
                        Double d8 = (Double) (objA7 instanceof C1717Ot1.b ? null : objA7);
                        C4993kz1 c4993kz4 = new C4993kz1(str1110, enumC4164hF3.d, str119, num8, str118, str117, d7, str1111, d8, str1111, System.currentTimeMillis());
                        while (r1.hasNext()) {
                            str11 = (String) entry.getKey();
                            if (entry.getValue() == null) {
                                C1717Ot1.a aVar113 = C1717Ot1.e;
                                c4617jA4.y.Y(new RuntimeException("session context field null at start: " + str11), PW0.e(new Pair("field", str11), new Pair("phase", "session_start")));
                                Unit unit4 = Unit.a;
                            }
                        }
                        return c4993kz4;
                    } catch (Throwable th10) {
                        th = th10;
                        str8 = str7;
                        num4 = num3;
                        str9 = str4;
                        enumC4164hF3 = enumC4164hF2;
                        str10 = str;
                        c4617jA4 = c4617jA3;
                        C1717Ot1.a aVar114 = C1717Ot1.e;
                        objA5 = C1795Pt1.a(th);
                    }
                }
                C1717Ot1.a aVar21 = C1717Ot1.e;
                C3279d22 c3279d22 = (C3279d22) c4617jA2.N.d.getValue();
                objA = c3279d22 != null ? c3279d22.c : null;
            } catch (Throwable th11) {
                C1717Ot1.a aVar22 = C1717Ot1.e;
                objA = C1795Pt1.a(th11);
            }
            AbstractC7004uZ1 abstractC7004uZ1 = c4617jA2.c;
            c1735Oz1.d = c4617jA2;
            c1735Oz1.e = str;
            c1735Oz1.g = enumC4164hF1;
            c1735Oz1.h = str2;
            c1735Oz1.n = 2;
            Object objA9 = abstractC7004uZ1.a(c1735Oz1);
            if (objA9 == mn) {
                return mn;
            }
            enumC4164hF2 = enumC4164hF1;
            str3 = str2;
            c4617jA3 = c4617jA2;
            objA8 = objA9;
            long j2 = ((C1709Or) objA8).a;
            kotlin.time.b.a aVar23 = kotlin.time.b.e;
            objA2 = new Integer((int) kotlin.time.b.r(j2, R40.SECONDS));
            C1717Ot1.a aVar24 = C1717Ot1.e;
            if (objA2 instanceof C1717Ot1.b) {
                objA2 = null;
            }
            num = (Integer) objA2;
            C3149cR c3149cR2 = c4617jA3.l;
            c1735Oz1.d = c4617jA3;
            c1735Oz1.e = str;
            c1735Oz1.g = enumC4164hF2;
            c1735Oz1.h = str3;
            c1735Oz1.i = num;
            c1735Oz1.n = 3;
            objO = C4466ii.o(c3149cR2.c.k(), c1735Oz1);
            if (objO == mn) {
                return mn;
            }
            str4 = str3;
            num2 = num;
            objA8 = objO;
            objA3 = ((EnumC2644a42) objA8).name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(objA3, "toLowerCase(...)");
            C1717Ot1.a aVar25 = C1717Ot1.e;
            if (objA3 instanceof C1717Ot1.b) {
                objA3 = null;
            }
            str5 = (String) objA3;
            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf2 = c4617jA3.i.b;
            c1735Oz1.d = c4617jA3;
            c1735Oz1.e = str;
            c1735Oz1.g = enumC4164hF2;
            c1735Oz1.h = str4;
            c1735Oz1.i = num2;
            c1735Oz1.j = str5;
            c1735Oz1.n = 4;
            objQ = C4466ii.q(interfaceC6396rf2, c1735Oz1);
            if (objQ == mn) {
                return mn;
            }
            num3 = num2;
            str6 = str5;
            objA8 = objQ;
            c1491Lx0 = (C1491Lx0) objA8;
            if (c1491Lx0 != null) {
                objA4 = c1491Lx0.b;
            } else {
                objA4 = null;
            }
            C1717Ot1.a aVar115 = C1717Ot1.e;
            if (objA4 instanceof C1717Ot1.b) {
                objA4 = null;
            }
            str7 = (String) objA4;
            VQ vq4 = c4617jA3.k;
            c1735Oz1.d = c4617jA3;
            c1735Oz1.e = str;
            c1735Oz1.g = enumC4164hF2;
            c1735Oz1.h = str4;
            c1735Oz1.i = num3;
            c1735Oz1.j = str6;
            c1735Oz1.k = str7;
            c1735Oz1.n = 5;
            objC = vq4.c(enumC4164hF2, c1735Oz1);
            if (objC == mn) {
                return mn;
            }
            str8 = str7;
            num4 = num3;
            str9 = str4;
            enumC4164hF3 = enumC4164hF2;
            str10 = str;
            c4617jA4 = c4617jA3;
            objA8 = objC;
            objA5 = new Double(((Number) objA8).longValue());
            C1717Ot1.a aVar116 = C1717Ot1.e;
            String str1112 = str8;
            String str1113 = str6;
            Integer num9 = num4;
            String str1114 = str9;
            String str1115 = str10;
            if (objA5 instanceof C1717Ot1.b) {
                objA5 = null;
            }
            Double d9 = (Double) objA5;
            iOrdinal2 = enumC4164hF3.ordinal();
            if (iOrdinal2 == 0) {
                c6945uG3 = (C6945uG) c4617jA4.a.k.getValue();
                if (c6945uG3 != null) {
                    objA6 = c6945uG3.h;
                } else {
                    objA6 = null;
                }
            } else {
                if (iOrdinal2 != 1) {
                    throw new C6489s51();
                }
                c6945uG4 = (C6945uG) c4617jA4.a.k.getValue();
                if (c6945uG4 != null) {
                    objA6 = c6945uG4.g;
                } else {
                    objA6 = null;
                }
            }
            if (objA6 instanceof C1717Ot1.b) {
                objA6 = null;
            }
            String str1116 = (String) objA6;
            iOrdinal = enumC4164hF3.ordinal();
            if (iOrdinal == 0) {
                c6945uG = (C6945uG) c4617jA4.a.k.getValue();
                if (c6945uG != null) {
                    objA7 = new Double(c6945uG.k);
                } else {
                    objA7 = null;
                }
            } else {
                if (iOrdinal != 1) {
                    throw new C6489s51();
                }
                c6945uG2 = (C6945uG) c4617jA4.a.k.getValue();
                if (c6945uG2 != null) {
                    objA7 = new Double(c6945uG2.j);
                } else {
                    objA7 = null;
                }
            }
            Double d10 = (Double) (objA7 instanceof C1717Ot1.b ? null : objA7);
            C4993kz1 c4993kz5 = new C4993kz1(str1115, enumC4164hF3.d, str1114, num9, str1113, str1112, d9, str1116, d10, str1116, System.currentTimeMillis());
            while (r1.hasNext()) {
                str11 = (String) entry.getKey();
                if (entry.getValue() == null) {
                    C1717Ot1.a aVar117 = C1717Ot1.e;
                    c4617jA4.y.Y(new RuntimeException("session context field null at start: " + str11), PW0.e(new Pair("field", str11), new Pair("phase", "session_start")));
                    Unit unit5 = Unit.a;
                }
            }
            return c4993kz5;
        } catch (Throwable th12) {
            th = th12;
            enumC4164hF2 = enumC4164hF1;
            str3 = str2;
            c4617jA3 = c4617jA2;
            C1717Ot1.a aVar26 = C1717Ot1.e;
            objA2 = C1795Pt1.a(th);
        }
        Object obj = objA8;
        c4617jA2 = c4617jA5;
        str = (String) obj;
        enumC4164hF1 = (EnumC4164hF1) c4617jA2.o.l().d.getValue();
        if (objA instanceof C1717Ot1.b) {
            objA = null;
        }
        str2 = (String) objA;
    }

    public static final Object c(C4617jA1 c4617jA1, boolean z, AW1 aw1) throws Throwable {
        if (z) {
            D32 d32 = c4617jA1.e;
            d32.i();
            d32.g = C5189lv.k(C3286d41.a, C6266r20.a, new C7533x32(d32, null), 2);
        } else {
            c4617jA1.getClass();
        }
        C2512Yo1 c2512Yo1 = new C2512Yo1();
        c2512Yo1.d = !z;
        Object objC = c4617jA1.d.O.c(new C2363Wz1(c4617jA1, c2512Yo1), aw1);
        return objC == MN.d ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0207 A[Catch: IllegalArgumentException -> 0x0241, TryCatch #0 {IllegalArgumentException -> 0x0241, blocks: (B:63:0x01ff, B:65:0x0207, B:66:0x0220), top: B:84:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0220 A[Catch: IllegalArgumentException -> 0x0241, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0241, blocks: (B:63:0x01ff, B:65:0x0207, B:66:0x0220), top: B:84:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0233  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object d(C4617jA1 c4617jA1, LM lm) {
        C2467Xz1 c2467Xz1;
        ReporterApi reporterApi;
        String str;
        EnumC5028l80 enumC5028l80;
        Double d;
        String str2;
        ReporterApi reporterApi2;
        EnumC5028l80 enumC5028l81;
        Double d2;
        Double d3;
        Double d4;
        Object objB;
        Double d5;
        String str3;
        Double d6;
        C4617jA1 c4617jA2;
        Double d7;
        Double d8;
        Object objB2;
        Double d9;
        EnumC5028l80 enumC5028l82;
        Double d10;
        ReporterApi reporterApi3;
        Number number;
        String upperCase;
        String strE;
        NumberFormat currencyInstance;
        C4617jA1 c4617jA3 = c4617jA1;
        c4617jA3.getClass();
        if (lm instanceof C2467Xz1) {
            c2467Xz1 = (C2467Xz1) lm;
            int i = c2467Xz1.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2467Xz1.n = i - Integer.MIN_VALUE;
            } else {
                c2467Xz1 = new C2467Xz1(c4617jA3, lm);
            }
        } else {
            c2467Xz1 = new C2467Xz1(c4617jA3, lm);
        }
        Object objA = c2467Xz1.l;
        MN mn = MN.d;
        int i2 = c2467Xz1.n;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c2467Xz1.d = c4617jA3;
            c2467Xz1.n = 1;
            objA = c4617jA3.p.a(false, c2467Xz1);
            if (objA != mn) {
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Double d11 = c2467Xz1.i;
                EnumC5028l80 enumC5028l83 = c2467Xz1.h;
                ReporterApi reporterApi4 = c2467Xz1.g;
                String str4 = c2467Xz1.e;
                C4617jA1 c4617jA4 = c2467Xz1.d;
                C1795Pt1.b(objA);
                d2 = d11;
                c4617jA3 = c4617jA4;
                str2 = str4;
                reporterApi2 = reporterApi4;
                enumC5028l81 = enumC5028l83;
                d3 = (Double) objA;
                d4 = c4617jA3.T;
                c2467Xz1.d = c4617jA3;
                c2467Xz1.e = str2;
                c2467Xz1.g = reporterApi2;
                c2467Xz1.h = enumC5028l81;
                c2467Xz1.i = d2;
                c2467Xz1.j = d3;
                c2467Xz1.k = d4;
                c2467Xz1.n = 3;
                objB = c4617jA3.x.b(d4, c2467Xz1);
                if (objB != mn) {
                    d5 = d3;
                    objA = objB;
                    str3 = str2;
                    d6 = d4;
                    c4617jA2 = c4617jA3;
                }
                return mn;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    Double d12 = c2467Xz1.i;
                    EnumC5028l80 enumC5028l84 = c2467Xz1.h;
                    ReporterApi reporterApi5 = c2467Xz1.g;
                    str = c2467Xz1.e;
                    C4617jA1 c4617jA5 = c2467Xz1.d;
                    C1795Pt1.b(objA);
                    reporterApi = reporterApi5;
                    enumC5028l80 = enumC5028l84;
                    d = d12;
                    c4617jA3 = c4617jA5;
                    d7 = (Double) objA;
                    d8 = c4617jA3.S;
                    c2467Xz1.d = c4617jA3;
                    c2467Xz1.e = str;
                    c2467Xz1.g = reporterApi;
                    c2467Xz1.h = enumC5028l80;
                    c2467Xz1.i = d;
                    c2467Xz1.j = d7;
                    c2467Xz1.k = d8;
                    c2467Xz1.n = 5;
                    objB2 = c4617jA3.x.b(d8, c2467Xz1);
                    if (objB2 != mn) {
                        d9 = d7;
                        objA = objB2;
                        enumC5028l82 = enumC5028l80;
                        d10 = d8;
                        reporterApi3 = reporterApi;
                        c4617jA2 = c4617jA3;
                    }
                    return mn;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Double d13 = c2467Xz1.k;
                Double d14 = c2467Xz1.j;
                d = c2467Xz1.i;
                enumC5028l82 = c2467Xz1.h;
                reporterApi3 = c2467Xz1.g;
                str = c2467Xz1.e;
                c4617jA2 = c2467Xz1.d;
                C1795Pt1.b(objA);
                d10 = d13;
                d9 = d14;
                ReporterApi.a.b(reporterApi3, enumC5028l82, new C4122h32(d, d9, d10, (Double) objA, str), null, 12);
                ReporterApi.a.a(c4617jA2.h, EnumC5113la.COUNTER_LOSE_DEMO, new Integer(1));
                C4923kf c4923kf = c4617jA2.a;
                number = (Number) c4923kf.B.getValue();
                upperCase = ((String) c4923kf.G.d.getValue()).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                try {
                    if (Intrinsics.a(upperCase, "DEMO")) {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                        decimalFormatSymbols.setCurrencySymbol("Đ");
                        Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                        ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                    } else {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        currencyInstance.setCurrency(Currency.getInstance(upperCase));
                    }
                    if ((number instanceof Long) || (number instanceof Integer)) {
                        currencyInstance.setMaximumFractionDigits(0);
                    }
                    strE = currencyInstance.format(number);
                    Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                } catch (IllegalArgumentException unused) {
                    String str5 = (((number instanceof Long) || (number instanceof Integer)) ? new DecimalFormat("###,###,##0") : new DecimalFormat("###,###,##0.00")).format(number);
                    String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
                    strE = C6133qP.e(upperCase2, "toUpperCase(...)", str5, upperCase2);
                }
                c4617jA2.f.b(new C5070lL1(VE.c("\u202a" + QO.o(strE)), new C7239vg(c4617jA2, 5)));
                c4617jA2.u(true);
                c4617jA2.l(FI1.a.b);
                return Unit.a;
            }
            Double d15 = c2467Xz1.k;
            Double d16 = c2467Xz1.j;
            d2 = c2467Xz1.i;
            enumC5028l81 = c2467Xz1.h;
            reporterApi2 = c2467Xz1.g;
            String str6 = c2467Xz1.e;
            c4617jA2 = c2467Xz1.d;
            C1795Pt1.b(objA);
            d6 = d15;
            d5 = d16;
            str3 = str6;
            ReporterApi.a.b(reporterApi2, enumC5028l81, new C4122h32(d2, d5, d6, (Double) objA, str3), null, 12);
            ReporterApi.a.a(c4617jA2.h, EnumC5113la.COUNTER_LOSE_REAL, new Integer(1));
            c4617jA2.f.b(new C5283mL1(new C2405Xf(c4617jA2, 6)));
            c4617jA2.u(true);
            c4617jA2.l(FI1.a.b);
            return Unit.a;
        }
        c4617jA3 = c2467Xz1.d;
        C1795Pt1.b(objA);
        String str7 = (String) objA;
        Object value = c4617jA3.L.d.getValue();
        Object obj = EnumC4164hF1.h;
        OM om = c4617jA3.x;
        reporterApi = c4617jA3.h;
        C4923kf c4923kf2 = c4617jA3.a;
        if (value == obj) {
            EnumC5028l80 enumC5028l85 = EnumC5028l80.d0;
            C6945uG c6945uG = (C6945uG) c4923kf2.k.getValue();
            Double d17 = c6945uG != null ? new Double(c6945uG.j) : null;
            C6945uG c6945uG2 = (C6945uG) c4923kf2.k.getValue();
            Double d18 = c6945uG2 != null ? new Double(c6945uG2.j) : null;
            c2467Xz1.d = c4617jA3;
            c2467Xz1.e = str7;
            c2467Xz1.g = reporterApi;
            c2467Xz1.h = enumC5028l85;
            c2467Xz1.i = d17;
            c2467Xz1.n = 2;
            Object objB3 = om.b(d18, c2467Xz1);
            if (objB3 != mn) {
                str2 = str7;
                objA = objB3;
                reporterApi2 = reporterApi;
                enumC5028l81 = enumC5028l85;
                d2 = d17;
                d3 = (Double) objA;
                d4 = c4617jA3.T;
                c2467Xz1.d = c4617jA3;
                c2467Xz1.e = str2;
                c2467Xz1.g = reporterApi2;
                c2467Xz1.h = enumC5028l81;
                c2467Xz1.i = d2;
                c2467Xz1.j = d3;
                c2467Xz1.k = d4;
                c2467Xz1.n = 3;
                objB = c4617jA3.x.b(d4, c2467Xz1);
                if (objB != mn) {
                    d5 = d3;
                    objA = objB;
                    str3 = str2;
                    d6 = d4;
                    c4617jA2 = c4617jA3;
                    ReporterApi.a.b(reporterApi2, enumC5028l81, new C4122h32(d2, d5, d6, (Double) objA, str3), null, 12);
                    ReporterApi.a.a(c4617jA2.h, EnumC5113la.COUNTER_LOSE_REAL, new Integer(1));
                    c4617jA2.f.b(new C5283mL1(new C2405Xf(c4617jA2, 6)));
                    c4617jA2.u(true);
                    c4617jA2.l(FI1.a.b);
                    return Unit.a;
                }
            }
        } else {
            EnumC5028l80 enumC5028l86 = EnumC5028l80.c0;
            C6945uG c6945uG3 = (C6945uG) c4923kf2.k.getValue();
            Double d19 = c6945uG3 != null ? new Double(c6945uG3.k) : null;
            C6945uG c6945uG4 = (C6945uG) c4923kf2.k.getValue();
            Double d20 = c6945uG4 != null ? new Double(c6945uG4.k) : null;
            c2467Xz1.d = c4617jA3;
            c2467Xz1.e = str7;
            c2467Xz1.g = reporterApi;
            c2467Xz1.h = enumC5028l86;
            c2467Xz1.i = d19;
            c2467Xz1.n = 4;
            Object objB4 = om.b(d20, c2467Xz1);
            if (objB4 != mn) {
                Double d21 = d19;
                str = str7;
                objA = objB4;
                enumC5028l80 = enumC5028l86;
                d = d21;
                d7 = (Double) objA;
                d8 = c4617jA3.S;
                c2467Xz1.d = c4617jA3;
                c2467Xz1.e = str;
                c2467Xz1.g = reporterApi;
                c2467Xz1.h = enumC5028l80;
                c2467Xz1.i = d;
                c2467Xz1.j = d7;
                c2467Xz1.k = d8;
                c2467Xz1.n = 5;
                objB2 = c4617jA3.x.b(d8, c2467Xz1);
                if (objB2 != mn) {
                    d9 = d7;
                    objA = objB2;
                    enumC5028l82 = enumC5028l80;
                    d10 = d8;
                    reporterApi3 = reporterApi;
                    c4617jA2 = c4617jA3;
                    ReporterApi.a.b(reporterApi3, enumC5028l82, new C4122h32(d, d9, d10, (Double) objA, str), null, 12);
                    ReporterApi.a.a(c4617jA2.h, EnumC5113la.COUNTER_LOSE_DEMO, new Integer(1));
                    C4923kf c4923kf3 = c4617jA2.a;
                    number = (Number) c4923kf3.B.getValue();
                    upperCase = ((String) c4923kf3.G.d.getValue()).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (Intrinsics.a(upperCase, "DEMO")) {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        DecimalFormatSymbols decimalFormatSymbols2 = DecimalFormatSymbols.getInstance();
                        decimalFormatSymbols2.setCurrencySymbol("Đ");
                        Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                        ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols2);
                    } else {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        currencyInstance.setCurrency(Currency.getInstance(upperCase));
                    }
                    if (number instanceof Long) {
                        currencyInstance.setMaximumFractionDigits(0);
                    } else {
                        currencyInstance.setMaximumFractionDigits(0);
                    }
                    strE = currencyInstance.format(number);
                    Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                    c4617jA2.f.b(new C5070lL1(VE.c("\u202a" + QO.o(strE)), new C7239vg(c4617jA2, 5)));
                    c4617jA2.u(true);
                    c4617jA2.l(FI1.a.b);
                    return Unit.a;
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(C4617jA1 c4617jA1, LM lm) {
        C2667aA1 c2667aA1;
        c4617jA1.getClass();
        if (lm instanceof C2667aA1) {
            c2667aA1 = (C2667aA1) lm;
            int i = c2667aA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2667aA1.h = i - Integer.MIN_VALUE;
            } else {
                c2667aA1 = new C2667aA1(c4617jA1, lm);
            }
        } else {
            c2667aA1 = new C2667aA1(c4617jA1, lm);
        }
        Object obj = c2667aA1.e;
        MN mn = MN.d;
        int i2 = c2667aA1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c2667aA1.d = c4617jA1;
            c2667aA1.h = 1;
            if (c4617jA1.d.w(c2667aA1) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4617jA1 = c2667aA1.d;
            C1795Pt1.b(obj);
        }
        c4617jA1.u(false);
        c4617jA1.l(FI1.d.b);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(C4617jA1 c4617jA1, TX0 tx0, LM lm) {
        C2891bA1 c2891bA1;
        String str;
        c4617jA1.getClass();
        if (lm instanceof C2891bA1) {
            c2891bA1 = (C2891bA1) lm;
            int i = c2891bA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2891bA1.h = i - Integer.MIN_VALUE;
            } else {
                c2891bA1 = new C2891bA1(c4617jA1, lm);
            }
        } else {
            c2891bA1 = new C2891bA1(c4617jA1, lm);
        }
        Object obj = c2891bA1.e;
        MN mn = MN.d;
        int i2 = c2891bA1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C4612j90 c4612j90 = c4617jA1.b;
            Fragment fragment = (Fragment) c4612j90.y.d.getValue();
            BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
            if (baseFragment == null || (str = baseFragment.e) == null) {
                str = "";
            }
            if (((Boolean) c4612j90.i.d.getValue()).booleanValue()) {
                EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
                if (str.equals("Platform")) {
                    str = "IQ_Opened";
                }
            }
            if (!((Boolean) c4612j90.b.d.getValue()).booleanValue()) {
                str = "Background";
            }
            ReporterApi.a.b(c4617jA1.h, EnumC5028l80.p0, new C1510Md1(str), null, 12);
            double d = tx0.b;
            c2891bA1.d = c4617jA1;
            c2891bA1.h = 1;
            if (c4617jA1.o(d, c2891bA1) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4617jA1 = c2891bA1.d;
            C1795Pt1.b(obj);
        }
        c4617jA1.u(false);
        c4617jA1.l(FI1.f.b);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object g(C4617jA1 c4617jA1, LM lm) {
        C3939gA1 c3939gA1;
        c4617jA1.getClass();
        if (lm instanceof C3939gA1) {
            c3939gA1 = (C3939gA1) lm;
            int i = c3939gA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3939gA1.h = i - Integer.MIN_VALUE;
            } else {
                c3939gA1 = new C3939gA1(c4617jA1, lm);
            }
        } else {
            c3939gA1 = new C3939gA1(c4617jA1, lm);
        }
        Object objT = c3939gA1.e;
        MN mn = MN.d;
        int i2 = c3939gA1.h;
        if (i2 == 0) {
            C1795Pt1.b(objT);
            Boolean bool = Boolean.FALSE;
            GP1 gp1 = c4617jA1.I;
            gp1.getClass();
            gp1.m(null, bool);
            c4617jA1.Y = c4617jA1.d.r0;
            c3939gA1.d = c4617jA1;
            c3939gA1.h = 1;
            objT = c4617jA1.t(c3939gA1);
            if (objT == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4617jA1 = c3939gA1.d;
            C1795Pt1.b(objT);
        }
        c4617jA1.R = (XF0) objT;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        if (r9.S(r3, r5, r6, r7, r8, (defpackage.E10) r0, r10) == r2) goto L65;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0074: MOVE (r1 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:117), block:B:28:0x0074 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.C4617jA1 r17, defpackage.LM r18) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4617jA1.h(jA1, LM):java.lang.Object");
    }

    public static Object m(C4617jA1 c4617jA1, LM lm) {
        return c4617jA1.n.a((EnumC4164hF1) c4617jA1.o.l().d.getValue(), lm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(LM lm) {
        C1813Pz1 c1813Pz1;
        if (lm instanceof C1813Pz1) {
            c1813Pz1 = (C1813Pz1) lm;
            int i = c1813Pz1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1813Pz1.g = i - Integer.MIN_VALUE;
            } else {
                c1813Pz1 = new C1813Pz1(this, lm);
            }
        } else {
            c1813Pz1 = new C1813Pz1(this, lm);
        }
        Object objC = c1813Pz1.d;
        MN mn = MN.d;
        int i2 = c1813Pz1.g;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            C1891Qz1 c1891Qz1 = new C1891Qz1(this, null);
            c1813Pz1.g = 1;
            objC = C7236vf0.c("manual_asset_selection_enabled", c1891Qz1, c1813Pz1);
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objC);
        }
        return Boolean.valueOf(!((Boolean) objC).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[PHI: r2 r10
      0x00b1: PHI (r2v7 jA1) = (r2v5 jA1), (r2v13 jA1) binds: [B:39:0x00ae, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r10v17 java.lang.Object) = (r10v14 java.lang.Object), (r10v1 java.lang.Object) binds: [B:39:0x00ae, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r10 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4617jA1.j(LM):java.lang.Object");
    }

    public final void k(String str) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            this.y.B(new AbstractC5082lP1.b(str));
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.f("RobotTrading", "telemetry robotStartBlocked (scope null, " + str + ") failed", thA);
        }
    }

    public final void l(FI1 fi1) {
        Object objA;
        if (this.Q.getAndSet(false)) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                this.y.p(fi1);
                objA = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            Throwable thA = C1717Ot1.a(objA);
            if (thA != null) {
                b0.f("RobotTrading", "telemetry robotSessionEnded failed", thA);
            }
            this.z.b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(double d, LM lm) {
        C2281Vz1 c2281Vz1;
        C4617jA1 c4617jA1;
        String str;
        C4617jA1 c4617jA2;
        C4617jA1 c4617jA3;
        String str2;
        String strC;
        KN knInvoke;
        Object objA;
        String str3;
        C4617jA1 c4617jA4;
        int i;
        String str4;
        KN kn;
        if (lm instanceof C2281Vz1) {
            c2281Vz1 = (C2281Vz1) lm;
            int i2 = c2281Vz1.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2281Vz1.l = i2 - Integer.MIN_VALUE;
            } else {
                c2281Vz1 = new C2281Vz1(this, lm);
            }
        } else {
            c2281Vz1 = new C2281Vz1(this, lm);
        }
        Object objV = c2281Vz1.j;
        MN mn = MN.d;
        int i3 = c2281Vz1.l;
        if (i3 == 0) {
            C1795Pt1.b(objV);
            c2281Vz1.d = this;
            c2281Vz1.l = 1;
            objV = v(d, c2281Vz1);
            if (objV != mn) {
                c4617jA1 = this;
            }
            return mn;
        }
        if (i3 == 1) {
            c4617jA1 = c2281Vz1.d;
            C1795Pt1.b(objV);
        } else {
            if (i3 == 2) {
                str = (String) c2281Vz1.e;
                c4617jA2 = c2281Vz1.d;
                C1795Pt1.b(objV);
                int iDoubleValue = (int) ((Number) objV).doubleValue();
                c2281Vz1.d = c4617jA2;
                c2281Vz1.e = str;
                c2281Vz1.l = 3;
                objV = c4617jA2.w(iDoubleValue, c2281Vz1);
                if (objV != mn) {
                    c4617jA3 = c4617jA2;
                    str2 = (String) objV;
                    strC = C5491nL.c("+ ", str);
                    knInvoke = c4617jA3.A.invoke();
                    if (knInvoke == null) {
                        return null;
                    }
                    c2281Vz1.d = c4617jA3;
                    c2281Vz1.e = knInvoke;
                    c2281Vz1.g = strC;
                    c2281Vz1.h = str2;
                    c2281Vz1.i = R.string.you_have_reached_profit_description;
                    c2281Vz1.l = 4;
                    objA = c4617jA3.u.a();
                    if (objA != mn) {
                        C4617jA1 c4617jA5 = c4617jA3;
                        str3 = str2;
                        objV = objA;
                        c4617jA4 = c4617jA5;
                        i = R.string.you_have_reached_profit_description;
                        str4 = strC;
                        kn = knInvoke;
                    }
                }
                return mn;
            }
            if (i3 == 3) {
                str = (String) c2281Vz1.e;
                c4617jA3 = c2281Vz1.d;
                C1795Pt1.b(objV);
                str2 = (String) objV;
                strC = C5491nL.c("+ ", str);
                knInvoke = c4617jA3.A.invoke();
                if (knInvoke == null) {
                    return null;
                }
                c2281Vz1.d = c4617jA3;
                c2281Vz1.e = knInvoke;
                c2281Vz1.g = strC;
                c2281Vz1.h = str2;
                c2281Vz1.i = R.string.you_have_reached_profit_description;
                c2281Vz1.l = 4;
                objA = c4617jA3.u.a();
                if (objA != mn) {
                    C4617jA1 c4617jA6 = c4617jA3;
                    str3 = str2;
                    objV = objA;
                    c4617jA4 = c4617jA6;
                    i = R.string.you_have_reached_profit_description;
                    str4 = strC;
                    kn = knInvoke;
                }
                return mn;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c2281Vz1.i;
            String str5 = c2281Vz1.h;
            str4 = c2281Vz1.g;
            KN kn2 = (KN) c2281Vz1.e;
            c4617jA4 = c2281Vz1.d;
            C1795Pt1.b(objV);
            str3 = str5;
            kn = kn2;
            i = i4;
        }
        return new C4053gj1(kn, str4, i, str3, ((Number) objV).intValue(), new C6210ql(1), new C4797k3(c4617jA4, 7));
        String str6 = (String) objV;
        U22 u22 = c4617jA1.n;
        c2281Vz1.d = c4617jA1;
        c2281Vz1.e = str6;
        c2281Vz1.l = 2;
        Object objC = u22.c(null, c2281Vz1);
        if (objC != mn) {
            C4617jA1 c4617jA7 = c4617jA1;
            str = str6;
            objV = objC;
            c4617jA2 = c4617jA7;
            int iDoubleValue2 = (int) ((Number) objV).doubleValue();
            c2281Vz1.d = c4617jA2;
            c2281Vz1.e = str;
            c2281Vz1.l = 3;
            objV = c4617jA2.w(iDoubleValue2, c2281Vz1);
            if (objV != mn) {
                c4617jA3 = c4617jA2;
                str2 = (String) objV;
                strC = C5491nL.c("+ ", str);
                knInvoke = c4617jA3.A.invoke();
                if (knInvoke == null) {
                    return null;
                }
                c2281Vz1.d = c4617jA3;
                c2281Vz1.e = knInvoke;
                c2281Vz1.g = strC;
                c2281Vz1.h = str2;
                c2281Vz1.i = R.string.you_have_reached_profit_description;
                c2281Vz1.l = 4;
                objA = c4617jA3.u.a();
                if (objA != mn) {
                    C4617jA1 c4617jA8 = c4617jA3;
                    str3 = str2;
                    objV = objA;
                    c4617jA4 = c4617jA8;
                    i = R.string.you_have_reached_profit_description;
                    str4 = strC;
                    kn = knInvoke;
                    return new C4053gj1(kn, str4, i, str3, ((Number) objV).intValue(), new C6210ql(1), new C4797k3(c4617jA4, 7));
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r9 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
    
        if (r7.h(r8, r0) == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(double r7, defpackage.LM r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4617jA1.o(double, LM):java.lang.Object");
    }

    @Nullable
    public final Unit p() {
        AbstractC5082lP1.a aVar;
        Object objA;
        C2936bP1 c2936bP1 = this.P;
        C1699On1 c1699On1 = this.B;
        C1699On1 c1699On2 = this.N;
        if (c2936bP1 == null && c1699On2.d.getValue() != null && !((Boolean) c1699On1.d.getValue()).booleanValue()) {
            this.K.setValue(this.o.l().d.getValue());
            Boolean bool = Boolean.TRUE;
            GP1 gp1 = this.E;
            gp1.getClass();
            gp1.m(null, bool);
            Integer num = new Integer(-1);
            GP1 gp2 = this.G;
            gp2.getClass();
            gp2.m(null, num);
            C4923kf c4923kf = this.a;
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            this.S = c6945uG != null ? new Double(c6945uG.k) : null;
            C6945uG c6945uG2 = (C6945uG) c4923kf.k.getValue();
            this.T = c6945uG2 != null ? new Double(c6945uG2.j) : null;
            KN knInvoke = this.A.invoke();
            if (knInvoke == null) {
                k("onStartTrading");
                return Unit.a;
            }
            this.P = C5189lv.k(knInvoke, C6266r20.a, new C3519eA1(this, null), 2);
            return Unit.a;
        }
        if (this.P != null) {
            Intrinsics.checkNotNullParameter("already_trading", "reason");
            aVar = new AbstractC5082lP1.a("already_trading");
        } else if (c1699On2.d.getValue() == null) {
            Intrinsics.checkNotNullParameter("missing_asset", "reason");
            aVar = new AbstractC5082lP1.a("missing_asset");
        } else {
            Intrinsics.checkNotNullParameter("already_started", "reason");
            aVar = new AbstractC5082lP1.a("already_started");
        }
        try {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            this.y.B(aVar);
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.f("RobotTrading", "telemetry robotStartBlocked failed", thA);
        }
        b0.e("TRADER NOT STARTED", "tradingJob = " + this.P + ", asset = " + c1699On2.d.getValue() + ", trading is started = " + c1699On1.d.getValue());
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0152  */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public final Object q(boolean z, @NotNull LM lm) {
        C3729fA1 c3729fA1;
        C4617jA1 c4617jA1;
        C4617jA1 c4617jA2;
        Long l;
        EnumC4164hF1 enumC4164hF1;
        Double d;
        Double d2;
        C1183Hy0 c1183Hy0;
        Object objA;
        Long l2;
        Double d3;
        EnumC4164hF1 enumC4164hF2;
        Double d4;
        AbstractC7770yA1 abstractC7770yA1;
        long j;
        Double d5;
        Long l3;
        long j2;
        C4617jA1 c4617jA3;
        long jDoubleValue;
        String strValueOf;
        C4617jA1 c4617jA4;
        boolean z2 = z;
        if (lm instanceof C3729fA1) {
            c3729fA1 = (C3729fA1) lm;
            int i = c3729fA1.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3729fA1.o = i - Integer.MIN_VALUE;
            } else {
                c3729fA1 = new C3729fA1(this, lm);
            }
        } else {
            c3729fA1 = new C3729fA1(this, lm);
        }
        C3729fA1 c3729fA2 = c3729fA1;
        Object objM = c3729fA2.m;
        MN mn = MN.d;
        int i2 = c3729fA2.o;
        if (i2 == 0) {
            C1795Pt1.b(objM);
            if (!z2 || ((Number) this.W.d.getValue()).doubleValue() <= 0.0d) {
                c4617jA1 = this;
                l = (Long) c4617jA1.d.U.d.getValue();
                c4617jA1.u(true);
                enumC4164hF1 = (EnumC4164hF1) c4617jA1.o.l().d.getValue();
                d = c4617jA1.S;
                d2 = c4617jA1.T;
                GP1 gp1 = c4617jA1.a.b;
                c3729fA2.d = c4617jA1;
                c3729fA2.e = l;
                c1183Hy0 = c4617jA1.M;
                c3729fA2.g = c1183Hy0;
                c3729fA2.h = enumC4164hF1;
                c3729fA2.i = d;
                c3729fA2.j = d2;
                c3729fA2.k = z2;
                c3729fA2.o = 2;
                objA = C7236vf0.a(gp1, c3729fA2);
                if (objA != mn) {
                    l2 = l;
                    objM = objA;
                    d3 = d;
                    enumC4164hF2 = enumC4164hF1;
                    d4 = d2;
                    abstractC7770yA1 = c1183Hy0;
                    j = ((FF) objM).j;
                    c3729fA2.d = c4617jA1;
                    c3729fA2.e = l2;
                    c3729fA2.g = abstractC7770yA1;
                    c3729fA2.h = enumC4164hF2;
                    c3729fA2.i = d3;
                    c3729fA2.j = d4;
                    c3729fA2.k = z2;
                    c3729fA2.l = j;
                    c3729fA2.o = 3;
                    objM = m(c4617jA1, c3729fA2);
                    if (objM != mn) {
                        d5 = d4;
                        C4617jA1 c4617jA5 = c4617jA1;
                        l3 = l2;
                        j2 = j;
                        c4617jA3 = c4617jA5;
                        jDoubleValue = j2 * ((long) ((Number) objM).doubleValue());
                        strValueOf = String.valueOf(l3);
                        c3729fA2.d = c4617jA3;
                        c3729fA2.e = null;
                        c3729fA2.g = null;
                        c3729fA2.h = null;
                        c3729fA2.i = null;
                        c3729fA2.j = null;
                        c3729fA2.k = z2;
                        c3729fA2.o = 4;
                        if (abstractC7770yA1.h(enumC4164hF2, d3, d5, jDoubleValue, strValueOf, c3729fA2) != mn) {
                            c4617jA4 = c4617jA3;
                            if (z2) {
                                c4617jA4.l(FI1.i.b);
                            }
                            return Unit.a;
                        }
                    }
                }
            } else {
                boolean zBooleanValue = ((Boolean) this.a.e.getValue()).booleanValue();
                c3729fA2.d = this;
                c3729fA2.k = z2;
                c3729fA2.o = 1;
                if (this.w.h(zBooleanValue, c3729fA2) != mn) {
                    c4617jA2 = this;
                }
            }
            return mn;
        }
        if (i2 == 1) {
            z2 = c3729fA2.k;
            c4617jA2 = c3729fA2.d;
            C1795Pt1.b(objM);
        } else {
            if (i2 == 2) {
                z2 = c3729fA2.k;
                d4 = c3729fA2.j;
                Double d6 = c3729fA2.i;
                EnumC4164hF1 enumC4164hF3 = c3729fA2.h;
                AbstractC7770yA1 abstractC7770yA2 = c3729fA2.g;
                Long l4 = c3729fA2.e;
                c4617jA1 = c3729fA2.d;
                C1795Pt1.b(objM);
                d3 = d6;
                l2 = l4;
                abstractC7770yA1 = abstractC7770yA2;
                enumC4164hF2 = enumC4164hF3;
                j = ((FF) objM).j;
                c3729fA2.d = c4617jA1;
                c3729fA2.e = l2;
                c3729fA2.g = abstractC7770yA1;
                c3729fA2.h = enumC4164hF2;
                c3729fA2.i = d3;
                c3729fA2.j = d4;
                c3729fA2.k = z2;
                c3729fA2.l = j;
                c3729fA2.o = 3;
                objM = m(c4617jA1, c3729fA2);
                if (objM != mn) {
                    d5 = d4;
                    C4617jA1 c4617jA6 = c4617jA1;
                    l3 = l2;
                    j2 = j;
                    c4617jA3 = c4617jA6;
                    jDoubleValue = j2 * ((long) ((Number) objM).doubleValue());
                    strValueOf = String.valueOf(l3);
                    c3729fA2.d = c4617jA3;
                    c3729fA2.e = null;
                    c3729fA2.g = null;
                    c3729fA2.h = null;
                    c3729fA2.i = null;
                    c3729fA2.j = null;
                    c3729fA2.k = z2;
                    c3729fA2.o = 4;
                    if (abstractC7770yA1.h(enumC4164hF2, d3, d5, jDoubleValue, strValueOf, c3729fA2) != mn) {
                        c4617jA4 = c4617jA3;
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                j2 = c3729fA2.l;
                z2 = c3729fA2.k;
                d5 = c3729fA2.j;
                d3 = c3729fA2.i;
                enumC4164hF2 = c3729fA2.h;
                abstractC7770yA1 = c3729fA2.g;
                l3 = c3729fA2.e;
                c4617jA3 = c3729fA2.d;
                C1795Pt1.b(objM);
                jDoubleValue = j2 * ((long) ((Number) objM).doubleValue());
                strValueOf = String.valueOf(l3);
                c3729fA2.d = c4617jA3;
                c3729fA2.e = null;
                c3729fA2.g = null;
                c3729fA2.h = null;
                c3729fA2.i = null;
                c3729fA2.j = null;
                c3729fA2.k = z2;
                c3729fA2.o = 4;
                if (abstractC7770yA1.h(enumC4164hF2, d3, d5, jDoubleValue, strValueOf, c3729fA2) != mn) {
                    c4617jA4 = c4617jA3;
                }
                return mn;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = c3729fA2.k;
            c4617jA4 = c3729fA2.d;
            C1795Pt1.b(objM);
        }
        if (z2) {
            c4617jA4.l(FI1.i.b);
        }
        return Unit.a;
        c4617jA1 = c4617jA2;
        l = (Long) c4617jA1.d.U.d.getValue();
        c4617jA1.u(true);
        enumC4164hF1 = (EnumC4164hF1) c4617jA1.o.l().d.getValue();
        d = c4617jA1.S;
        d2 = c4617jA1.T;
        GP1 gp2 = c4617jA1.a.b;
        c3729fA2.d = c4617jA1;
        c3729fA2.e = l;
        c1183Hy0 = c4617jA1.M;
        c3729fA2.g = c1183Hy0;
        c3729fA2.h = enumC4164hF1;
        c3729fA2.i = d;
        c3729fA2.j = d2;
        c3729fA2.k = z2;
        c3729fA2.o = 2;
        objA = C7236vf0.a(gp2, c3729fA2);
        if (objA != mn) {
            l2 = l;
            objM = objA;
            d3 = d;
            enumC4164hF2 = enumC4164hF1;
            d4 = d2;
            abstractC7770yA1 = c1183Hy0;
            j = ((FF) objM).j;
            c3729fA2.d = c4617jA1;
            c3729fA2.e = l2;
            c3729fA2.g = abstractC7770yA1;
            c3729fA2.h = enumC4164hF2;
            c3729fA2.i = d3;
            c3729fA2.j = d4;
            c3729fA2.k = z2;
            c3729fA2.l = j;
            c3729fA2.o = 3;
            objM = m(c4617jA1, c3729fA2);
            if (objM != mn) {
                d5 = d4;
                C4617jA1 c4617jA7 = c4617jA1;
                l3 = l2;
                j2 = j;
                c4617jA3 = c4617jA7;
                jDoubleValue = j2 * ((long) ((Number) objM).doubleValue());
                strValueOf = String.valueOf(l3);
                c3729fA2.d = c4617jA3;
                c3729fA2.e = null;
                c3729fA2.g = null;
                c3729fA2.h = null;
                c3729fA2.i = null;
                c3729fA2.j = null;
                c3729fA2.k = z2;
                c3729fA2.o = 4;
                if (abstractC7770yA1.h(enumC4164hF2, d3, d5, jDoubleValue, strValueOf, c3729fA2) != mn) {
                    c4617jA4 = c4617jA3;
                    if (z2) {
                        c4617jA4.l(FI1.i.b);
                    }
                    return Unit.a;
                }
            }
        }
        return mn;
    }

    public final void r() {
        C4612j90 c4612j90 = this.b;
        GP1 gp1 = c4612j90.p;
        Boolean bool = Boolean.TRUE;
        gp1.getClass();
        gp1.m(null, bool);
        GP1 gp2 = c4612j90.o;
        gp2.m(null, C5907pJ1.e((Set) gp2.getValue(), new C2177Ur(this.d.q0)));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public final void s(boolean z, String reason, Integer num) {
        int iIntValue;
        Object obj = C6465rz1.a;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (num == null && (num = (Integer) C6465rz1.a.get(reason)) == null) {
            iIntValue = z ? R.string.robot_has_stopped_error : R.string.error_starting_robot_description_text;
        } else {
            iIntValue = num.intValue();
        }
        InterfaceC3902g10 interfaceC3902g10 = this.f;
        if (z) {
            interfaceC3902g10.b(new C6962uL1(Integer.valueOf(iIntValue), reason, new C6819tg(this, 3)));
        } else {
            interfaceC3902g10.b(new C3552eL1(4, reason, Integer.valueOf(iIntValue)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(LM lm) {
        C4149hA1 c4149hA1;
        C4617jA1 c4617jA1;
        if (lm instanceof C4149hA1) {
            c4149hA1 = (C4149hA1) lm;
            int i = c4149hA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4149hA1.h = i - Integer.MIN_VALUE;
            } else {
                c4149hA1 = new C4149hA1(this, lm);
            }
        } else {
            c4149hA1 = new C4149hA1(this, lm);
        }
        Object obj = c4149hA1.e;
        MN mn = MN.d;
        int i2 = c4149hA1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            r();
            c4149hA1.d = this;
            c4149hA1.h = 1;
            if (x(c4149hA1) == mn) {
                return mn;
            }
            c4617jA1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4617jA1 = c4149hA1.d;
            C1795Pt1.b(obj);
        }
        KN knInvoke = c4617jA1.A.invoke();
        if (knInvoke != null) {
            return C5189lv.k(knInvoke, C6266r20.a, new C4359iA1(c4617jA1, null), 2);
        }
        return null;
    }

    public final void u(boolean z) {
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.E;
        gp1.getClass();
        gp1.m(null, bool);
        this.d.T();
        GP1 gp2 = this.b.p;
        gp2.getClass();
        gp2.m(null, bool);
        XF0 xf0 = this.R;
        if (xf0 != null) {
            xf0.l(null);
        }
        this.R = null;
        if (z) {
            D32 d32 = this.e;
            d32.i();
            d32.d.h();
        }
        C2936bP1 c2936bP1 = this.P;
        this.P = null;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(double d, LM lm) {
        C6090qA1 c6090qA1;
        Double d2;
        String strE;
        NumberFormat currencyInstance;
        if (lm instanceof C6090qA1) {
            c6090qA1 = (C6090qA1) lm;
            int i = c6090qA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6090qA1.h = i - Integer.MIN_VALUE;
            } else {
                c6090qA1 = new C6090qA1(this, lm);
            }
        } else {
            c6090qA1 = new C6090qA1(this, lm);
        }
        Object obj = c6090qA1.e;
        MN mn = MN.d;
        int i2 = c6090qA1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Double d3 = new Double(d);
            c6090qA1.d = d3;
            c6090qA1.h = 1;
            Object objA = this.p.a(false, c6090qA1);
            if (objA == mn) {
                return mn;
            }
            obj = objA;
            d2 = d3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2 = c6090qA1.d;
            C1795Pt1.b(obj);
        }
        String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        try {
            if (Intrinsics.a(upperCase, "DEMO")) {
                currencyInstance = NumberFormat.getCurrencyInstance();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setCurrencySymbol("Đ");
                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            } else {
                currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(upperCase));
            }
            strE = currencyInstance.format(d2);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str = new DecimalFormat("###,###,##0.00").format(d2);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
        }
        return C5491nL.c("\u202a", QO.o(strE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(long j, LM lm) {
        C6299rA1 c6299rA1;
        Integer num;
        String strE;
        NumberFormat currencyInstance;
        if (lm instanceof C6299rA1) {
            c6299rA1 = (C6299rA1) lm;
            int i = c6299rA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6299rA1.h = i - Integer.MIN_VALUE;
            } else {
                c6299rA1 = new C6299rA1(this, lm);
            }
        } else {
            c6299rA1 = new C6299rA1(this, lm);
        }
        Object objA = c6299rA1.e;
        MN mn = MN.d;
        int i2 = c6299rA1.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            Integer num2 = new Integer((int) j);
            c6299rA1.d = num2;
            c6299rA1.h = 1;
            objA = this.p.a(false, c6299rA1);
            if (objA == mn) {
                return mn;
            }
            num = num2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = c6299rA1.d;
            C1795Pt1.b(objA);
        }
        String upperCase = ((String) objA).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        try {
            if (Intrinsics.a(upperCase, "DEMO")) {
                currencyInstance = NumberFormat.getCurrencyInstance();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setCurrencySymbol("Đ");
                Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            } else {
                currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(upperCase));
            }
            if (num != null) {
                currencyInstance.setMaximumFractionDigits(0);
            }
            strE = currencyInstance.format(num);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str = (num != null ? new DecimalFormat("###,###,##0") : new DecimalFormat("###,###,##0.00")).format(num);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
        }
        return C5491nL.c("\u202a", QO.o(strE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(LM lm) {
        C6719tA1 c6719tA1;
        C4617jA1 c4617jA1;
        if (lm instanceof C6719tA1) {
            c6719tA1 = (C6719tA1) lm;
            int i = c6719tA1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6719tA1.h = i - Integer.MIN_VALUE;
            } else {
                c6719tA1 = new C6719tA1(this, lm);
            }
        } else {
            c6719tA1 = new C6719tA1(this, lm);
        }
        Object objC = c6719tA1.e;
        MN mn = MN.d;
        int i2 = c6719tA1.h;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            C6929uA1 c6929uA1 = new C6929uA1(this, null);
            c6719tA1.d = this;
            c6719tA1.h = 1;
            objC = OZ1.c(30000L, c6929uA1, c6719tA1);
            if (objC == mn) {
                return mn;
            }
            c4617jA1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4617jA1 = c6719tA1.d;
            C1795Pt1.b(objC);
        }
        if (((Integer) objC) == null) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                c4617jA1.y.Y(new RuntimeException("timer never started after 30000ms"), OW0.b(new Pair("phase", "timer_start")));
                Unit unit = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                C1795Pt1.a(th);
            }
            c4617jA1.u(true);
            c4617jA1.l(new FI1.h("timer_start_timeout", null, false, null));
        }
        return Unit.a;
    }
}
