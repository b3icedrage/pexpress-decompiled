package defpackage;

import android.os.SystemClock;
import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import io.sentry.android.core.b0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7293vv1 extends C7576xG {
    public static final long v;
    public static final /* synthetic */ int w = 0;

    @NotNull
    public final C4617jA1 d;

    @NotNull
    public final C4923kf e;

    @NotNull
    public final ReporterApi f;

    @NotNull
    public final InterfaceC0704Bu1 g;

    @NotNull
    public final InterfaceC4315hz1 h;

    @NotNull
    public final InterfaceC3493e4 i;

    @NotNull
    public final InterfaceC6312rF j;

    @NotNull
    public final O3 k;

    @NotNull
    public final AbstractC6505s91 l;

    @NotNull
    public final InterfaceC3706f42 m;

    @NotNull
    public final C4733jk n;
    public volatile boolean o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final C1699On1 q;
    public volatile long r;
    public final ConcurrentHashMap.KeySetView<String, Boolean> s;

    @NotNull
    public final C2030Su t;

    @NotNull
    public final C1811Pz u;

    /* JADX INFO: renamed from: vv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onCommonActionButtonClick$3", f = "RobotCommonActionViewModelBase.kt", l = {141}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C7293vv1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6120qK1 c6120qK1 = C7293vv1.this.e.t;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: vv1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onInit$1", f = "RobotCommonActionViewModelBase.kt", l = {87}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: vv1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C7293vv1 d;

            public a(C7293vv1 c7293vv1) {
                this.d = c7293vv1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object value;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7293vv1 c7293vv1 = this.d;
                GP1 gp1 = c7293vv1.p;
                do {
                    value = gp1.getValue();
                } while (!gp1.d(value, C7293vv1.l(c7293vv1, C6103qF.a((C6103qF) value, !zBooleanValue, false, false, zBooleanValue ? null : new Integer(R.string.start_trading), new Integer(R.color.primary), 2))));
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C7293vv1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            ((b) create(jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C7293vv1 c7293vv1 = C7293vv1.this;
                C1699On1 c1699On1 = c7293vv1.d.F;
                a aVar = new a(c7293vv1);
                this.d = 1;
                if (c1699On1.d.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: vv1$c */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onInit$2", f = "RobotCommonActionViewModelBase.kt", l = {99}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: vv1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C7293vv1 d;

            public a(C7293vv1 c7293vv1) {
                this.d = c7293vv1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object value;
                C6103qF c6103qF;
                boolean z;
                EnumC4105gz1 enumC4105gz1 = (EnumC4105gz1) obj;
                C7293vv1 c7293vv1 = this.d;
                GP1 gp1 = c7293vv1.p;
                do {
                    value = gp1.getValue();
                    c6103qF = (C6103qF) value;
                    z = enumC4105gz1 == EnumC4105gz1.e;
                } while (!gp1.d(value, C7293vv1.l(c7293vv1, C6103qF.a(c6103qF, false, false, z, new Integer(z ? R.string.activate_text : R.string.start_trading), new Integer(z ? R.color.robotActivationButtonColor : R.color.primary), 3))));
                return Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C7293vv1.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            ((c) create(jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C7293vv1 c7293vv1 = C7293vv1.this;
                C1699On1 c1699On1B = c7293vv1.h.b();
                a aVar = new a(c7293vv1);
                this.d = 1;
                if (c1699On1B.d.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: vv1$d */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onInit$3", f = "RobotCommonActionViewModelBase.kt", l = {112}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: vv1$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C7293vv1 d;

            public a(C7293vv1 c7293vv1) {
                this.d = c7293vv1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object value;
                this.d.o = ((Boolean) obj).booleanValue();
                C7293vv1 c7293vv1 = this.d;
                GP1 gp1 = c7293vv1.p;
                do {
                    value = gp1.getValue();
                } while (!gp1.d(value, C7293vv1.l(c7293vv1, (C6103qF) value)));
                return Unit.a;
            }
        }

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C7293vv1.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((d) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C7293vv1 c7293vv1 = C7293vv1.this;
                InterfaceC6396rf0<Boolean> interfaceC6396rf0 = c7293vv1.d.O;
                a aVar = new a(c7293vv1);
                this.d = 1;
                if (interfaceC6396rf0.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: vv1$e */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onInit$4", f = "RobotCommonActionViewModelBase.kt", l = {118}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: vv1$e$a */
        public static final class a implements InterfaceC6396rf0<Boolean> {
            public final /* synthetic */ C1699On1 d;

            /* JADX INFO: renamed from: vv1$e$a$a, reason: collision with other inner class name */
            public static final class C0516a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ InterfaceC6606sf0 d;

                /* JADX INFO: renamed from: vv1$e$a$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onInit$4$invokeSuspend$$inlined$map$1$2", f = "RobotCommonActionViewModelBase.kt", l = {219}, m = "emit")
                public static final class C0517a extends LM {
                    public /* synthetic */ Object d;
                    public int e;

                    public C0517a(JM jm) {
                        super(jm);
                    }

                    @Override // defpackage.AbstractC7487wq
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return C0516a.this.a(null, this);
                    }
                }

                public C0516a(InterfaceC6606sf0 interfaceC6606sf0) {
                    this.d = interfaceC6606sf0;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6606sf0
                @Nullable
                public final Object a(Object obj, @NotNull JM jm) {
                    C0517a c0517a;
                    if (jm instanceof C0517a) {
                        c0517a = (C0517a) jm;
                        int i = c0517a.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0517a.e = i - Integer.MIN_VALUE;
                        } else {
                            c0517a = new C0517a(jm);
                        }
                    } else {
                        c0517a = new C0517a(jm);
                    }
                    Object obj2 = c0517a.d;
                    MN mn = MN.d;
                    int i2 = c0517a.e;
                    if (i2 == 0) {
                        C1795Pt1.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(!((C6103qF) obj).b);
                        c0517a.e = 1;
                        if (this.d.a(boolValueOf, c0517a) == mn) {
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
                Object objC = this.d.d.c(new C0516a(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            }
        }

        /* JADX INFO: renamed from: vv1$e$b */
        public static final class b implements InterfaceC6396rf0<Boolean> {
            public final /* synthetic */ GP1 d;

            /* JADX INFO: renamed from: vv1$e$b$a */
            public static final class a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ InterfaceC6606sf0 d;

                /* JADX INFO: renamed from: vv1$e$b$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$onInit$4$invokeSuspend$$inlined$map$2$2", f = "RobotCommonActionViewModelBase.kt", l = {219}, m = "emit")
                public static final class C0518a extends LM {
                    public /* synthetic */ Object d;
                    public int e;

                    public C0518a(JM jm) {
                        super(jm);
                    }

                    @Override // defpackage.AbstractC7487wq
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(InterfaceC6606sf0 interfaceC6606sf0) {
                    this.d = interfaceC6606sf0;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6606sf0
                @Nullable
                public final Object a(Object obj, @NotNull JM jm) {
                    C0518a c0518a;
                    if (jm instanceof C0518a) {
                        c0518a = (C0518a) jm;
                        int i = c0518a.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0518a.e = i - Integer.MIN_VALUE;
                        } else {
                            c0518a = new C0518a(jm);
                        }
                    } else {
                        c0518a = new C0518a(jm);
                    }
                    Object obj2 = c0518a.d;
                    MN mn = MN.d;
                    int i2 = c0518a.e;
                    if (i2 == 0) {
                        C1795Pt1.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((C6315rG) obj) != null);
                        c0518a.e = 1;
                        if (this.d.a(boolValueOf, c0518a) == mn) {
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

            public b(GP1 gp1) {
                this.d = gp1;
            }

            @Override // defpackage.InterfaceC6396rf0
            @Nullable
            public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
                this.d.c(new a(interfaceC6606sf0), jm);
                return MN.d;
            }
        }

        public e(JM<? super e> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C7293vv1.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((e) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C7293vv1 c7293vv1 = C7293vv1.this;
                a aVar = new a(c7293vv1.q);
                b bVar = new b(c7293vv1.e.f);
                long j = C7293vv1.v;
                X5 x5 = new X5(c7293vv1, 7);
                C7530x3 c7530x3 = new C7530x3(c7293vv1, 6);
                this.d = 1;
                Object objJ = C4466ii.j(C4466ii.m(new C6610sg0(aVar, bVar, new C5715oP1(3, null))), new C5925pP1(x5, j, c7530x3, null), this);
                if (objJ != obj2) {
                    objJ = Unit.a;
                }
                if (objJ == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        v = kotlin.time.c.g(15, R40.SECONDS);
    }

    public C7293vv1(@NotNull C4617jA1 robotTrading, @NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC0704Bu1 accountSelectionCallbacks, @NotNull InterfaceC4315hz1 robotScreenStateProviderBase, @NotNull InterfaceC3493e4 accountSelectionEnabledProvider, @NotNull InterfaceC6312rF commonActionCallbacksApi, @NotNull O3 accountModeSelectionUseCase, @NotNull AbstractC6505s91 oneClickDealsUseCase, @NotNull InterfaceC3706f42 telemetryReporter) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(accountSelectionCallbacks, "accountSelectionCallbacks");
        Intrinsics.checkNotNullParameter(robotScreenStateProviderBase, "robotScreenStateProviderBase");
        Intrinsics.checkNotNullParameter(accountSelectionEnabledProvider, "accountSelectionEnabledProvider");
        Intrinsics.checkNotNullParameter(commonActionCallbacksApi, "commonActionCallbacksApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(oneClickDealsUseCase, "oneClickDealsUseCase");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        this.d = robotTrading;
        this.e = appData;
        this.f = reporter;
        this.g = accountSelectionCallbacks;
        this.h = robotScreenStateProviderBase;
        this.i = accountSelectionEnabledProvider;
        this.j = commonActionCallbacksApi;
        this.k = accountModeSelectionUseCase;
        this.l = oneClickDealsUseCase;
        this.m = telemetryReporter;
        this.n = new C4733jk(robotTrading.F, 1);
        GP1 gp1I = C1589Ne.i(new C6103qF(5));
        this.p = gp1I;
        this.q = C4466ii.f(gp1I);
        this.r = SystemClock.elapsedRealtime();
        this.s = ConcurrentHashMap.newKeySet();
        C2030Su c2030SuA = C2889bA.a(-1, 6, null);
        this.t = c2030SuA;
        this.u = new C1811Pz(c2030SuA);
    }

    public static final C6103qF l(C7293vv1 c7293vv1, C6103qF c6103qF) {
        c7293vv1.getClass();
        return C6103qF.a(c6103qF, false, c6103qF.c || c7293vv1.o, false, null, null, 29);
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new b(null));
        C6561sS.g(this, new c(null));
        C6561sS.g(this, new d(null));
        C6561sS.g(this, new e(null));
    }

    public final void m(boolean z) {
        if (z) {
            o(false);
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                this.m.D(LJ1.Start, "activation_required", PW0.c());
                Unit unit = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                C1795Pt1.a(th);
            }
            EnumC5028l80 enumC5028l80 = EnumC5028l80.y0;
            L80 l80 = L80.MAX_PROFIT;
            ReporterApi.a.b(this.f, enumC5028l80, new C1510Md1("Real account"), null, 12);
            this.g.a();
            o(true);
            return;
        }
        EnumC3495e41 enumC3495e41 = (EnumC3495e41) this.e.r.getValue();
        if (enumC3495e41 == null || !C7652xe.g(enumC3495e41)) {
            if (!this.o) {
                this.t.n(Unit.a);
                n("tap");
                return;
            }
            o(false);
            try {
                C1717Ot1.a aVar3 = C1717Ot1.e;
                this.m.H();
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                C1717Ot1.a aVar4 = C1717Ot1.e;
                C1795Pt1.a(th2);
            }
            C5189lv.k(C8056za.j(this), null, new C7924yv1(this, null), 3);
            return;
        }
        try {
            C1717Ot1.a aVar5 = C1717Ot1.e;
            this.m.D(LJ1.Start, "ws_unavailable", PW0.c());
            Unit unit3 = Unit.a;
        } catch (Throwable th3) {
            C1717Ot1.a aVar6 = C1717Ot1.e;
            C1795Pt1.a(th3);
        }
        EnumC4164hF1 enumC4164hF1 = (EnumC4164hF1) this.k.l().d.getValue();
        C2643a41 c2643a41 = this.e.u;
        C7083uv1 action = new C7083uv1(this, enumC4164hF1);
        c2643a41.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        c2643a41.a.set(new C2643a41.a(action));
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    public final void n(String str) {
        if (this.s.add(str)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.r;
            EnumC3495e41 enumC3495e41 = (EnumC3495e41) this.e.r.getValue();
            String strName = enumC3495e41 != null ? enumC3495e41.name() : null;
            String strName2 = ((EnumC4164hF1) this.k.l().d.getValue()).name();
            b0.e("RobotCommonAction", "start gated on assets: trigger=" + str + " gated_ms=" + jElapsedRealtime + " ws_state=" + strName + " account=" + strName2);
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                this.m.P(jElapsedRealtime, str, strName, strName2);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                C1795Pt1.a(th);
            }
            try {
                ReporterApi.a.b(this.f, EnumC5028l80.V, new E70("assets_not_loaded", "Start gated: assets not loaded", null, null, "trigger=" + str + ";ws_state=" + strName + ";account=" + strName2 + ";gated_ms=" + jElapsedRealtime, null, null, null, null, null, null, null, null, 8172), null, 12);
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                C1717Ot1.a aVar3 = C1717Ot1.e;
                C1795Pt1.a(th2);
            }
        }
    }

    public final void o(boolean z) {
        this.i.a(z);
    }
}
