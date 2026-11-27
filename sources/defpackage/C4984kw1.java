package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4984kw1 extends C7576xG {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final InterfaceC4976ku e;

    @NotNull
    public final ReporterApi f;

    @NotNull
    public final InterfaceC3170cY g;

    @NotNull
    public final C3281d30 h;

    @NotNull
    public final MR1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C1699On1 k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final C1699On1 m;

    @NotNull
    public final C6120qK1 n;

    @NotNull
    public final C1621Nn1 o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final GP1 q;

    @NotNull
    public final C1699On1 r;

    /* JADX INFO: renamed from: kw1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesViewModelBase$1", f = "RobotDoubleStrategiesViewModelBase.kt", l = {73, 74, 81}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public InterfaceC3907g21 d;
        public C4984kw1 e;
        public Object g;
        public Object h;
        public String[] i;
        public C3287d42 j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4984kw1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x009c  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:23:0x00da  */
        /* JADX WARN: Code duplicated, block: B:33:0x011d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c6 -> B:21:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0104 -> B:28:0x010a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.AbstractC7487wq
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C4984kw1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kw1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesViewModelBase$onInit$1", f = "RobotDoubleStrategiesViewModelBase.kt", l = {112}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: kw1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4984kw1 d;

            public a(C4984kw1 c4984kw1) {
                this.d = c4984kw1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                GP1 gp1;
                Object value;
                GP1 gp2;
                Object value2;
                EnumC2644a42 enumC2644a42 = (EnumC2644a42) obj;
                C4984kw1 c4984kw1 = this.d;
                if (c4984kw1.h.o() && enumC2644a42 != EnumC2644a42.i && enumC2644a42 != EnumC2644a42.j) {
                    C6561sS.g(c4984kw1, new C6037pw1(c4984kw1, null));
                }
                do {
                    gp1 = c4984kw1.l;
                    value = gp1.getValue();
                    ((Boolean) value).getClass();
                } while (!gp1.d(value, Boolean.valueOf(enumC2644a42 == EnumC2644a42.i)));
                do {
                    gp2 = c4984kw1.q;
                    value2 = gp2.getValue();
                    ((Boolean) value2).getClass();
                } while (!gp2.d(value2, Boolean.valueOf(enumC2644a42 == EnumC2644a42.j)));
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C4984kw1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C4984kw1 c4984kw1 = C4984kw1.this;
                InterfaceC6396rf0<EnumC2644a42> interfaceC6396rf0K = c4984kw1.i.k();
                a aVar = new a(c4984kw1);
                this.d = 1;
                if (interfaceC6396rf0K.c(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: kw1$c */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesViewModelBase$onInit$2", f = "RobotDoubleStrategiesViewModelBase.kt", l = {125}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: kw1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4984kw1 d;

            public a(C4984kw1 c4984kw1) {
                this.d = c4984kw1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final /* bridge */ /* synthetic */ Object a(Object obj, JM jm) {
                return b(jm);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:30:0x010c  */
            /* JADX WARN: Code duplicated, block: B:38:0x014c  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v10 */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r10v9 */
            /* JADX WARN: Type inference failed for: r13v0 */
            /* JADX WARN: Type inference failed for: r13v5 */
            /* JADX WARN: Type inference failed for: r13v6 */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v3, types: [g21] */
            /* JADX WARN: Type inference failed for: r14v7 */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v4, types: [g21, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v9 */
            /* JADX WARN: Type inference failed for: r9v13 */
            /* JADX WARN: Type inference failed for: r9v14 */
            /* JADX WARN: Type inference failed for: r9v15 */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v6, types: [g21, sf0] */
            /* JADX WARN: Type inference failed for: r9v7, types: [g21] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f6 -> B:17:0x0066). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0138 -> B:34:0x013b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public final java.lang.Object b(defpackage.JM r18) {
                /*
                    Method dump skipped, instruction units count: 336
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C4984kw1.c.a.b(JM):java.lang.Object");
            }
        }

        public c(JM<? super c> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C4984kw1.this.new c(jm);
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
                C4984kw1 c4984kw1 = C4984kw1.this;
                C1699On1 c1699On1 = c4984kw1.d.F;
                a aVar = new a(c4984kw1);
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

    public C4984kw1(@NotNull C4923kf appData, @NotNull InterfaceC4976ku detailsStrategiesDataProvider, @NotNull ReporterApi reporter, @NotNull InterfaceC3170cY depositValuesProvider, @NotNull C3281d30 doubleStrategiesLocalExperiment, @NotNull MR1 strategySelectionUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(detailsStrategiesDataProvider, "detailsStrategiesDataProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        Intrinsics.checkNotNullParameter(doubleStrategiesLocalExperiment, "doubleStrategiesLocalExperiment");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        this.d = appData;
        this.e = detailsStrategiesDataProvider;
        this.f = reporter;
        this.g = depositValuesProvider;
        this.h = doubleStrategiesLocalExperiment;
        this.i = strategySelectionUseCase;
        GP1 gp1I = C1589Ne.i(new C3287d42(true, R.string.optimal_strategy_name_text, R.string.main_robot_optimal_strategy_recommended_balance_text, WE.f("null", "null")));
        this.j = gp1I;
        this.k = C4466ii.f(gp1I);
        Boolean bool = Boolean.FALSE;
        GP1 gp1I2 = C1589Ne.i(bool);
        this.l = gp1I2;
        this.m = C4466ii.f(gp1I2);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.n = c6120qK1G;
        this.o = C4466ii.e(c6120qK1G);
        this.p = C1589Ne.i(new C3287d42(false, R.string.aggressive_strategy_name_text, R.string.main_robot_aggressive_strategy_recomended_balance_text, VE.c("null")));
        GP1 gp1I3 = C1589Ne.i(bool);
        this.q = gp1I3;
        this.r = C4466ii.f(gp1I3);
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new b(null));
        C6561sS.g(this, new c(null));
    }
}
