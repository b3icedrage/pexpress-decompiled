package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4667jR0 implements InterfaceC4409iR0 {

    @NotNull
    public final AbstractC7949z22 a;

    @NotNull
    public final S02<?> b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final InterfaceC7768yA d;

    @NotNull
    public final KQ e;

    @NotNull
    public final InterfaceC3360dR0 f;

    @NotNull
    public final InterfaceC4862kM0 g;

    @NotNull
    public final CA h;

    @NotNull
    public final InterfaceC3706f42 i;

    @Nullable
    public C2936bP1 j;

    @Nullable
    public C2936bP1 k;

    /* JADX INFO: renamed from: jR0$a */
    @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$1", f = "LoadChartUseCaseBase.kt", l = {74}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: jR0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$1$3", f = "LoadChartUseCaseBase.kt", l = {72, 73}, m = "invokeSuspend")
        public static final class C0413a extends AW1 implements InterfaceC1216Ij0<Boolean, String, kotlin.time.b, EnumC3495e41, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ String e;
            public /* synthetic */ EnumC3495e41 g;
            public final /* synthetic */ C4667jR0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0413a(C4667jR0 c4667jR0, JM<? super C0413a> jm) {
                super(5, jm);
                this.h = c4667jR0;
            }

            @Override // defpackage.InterfaceC1216Ij0
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
                ((Boolean) obj).getClass();
                long j = ((kotlin.time.b) obj3).d;
                C0413a c0413a = new C0413a(this.h, (JM) serializable);
                c0413a.e = (String) obj2;
                c0413a.g = (EnumC3495e41) obj4;
                return c0413a.invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
            
                if (kotlin.Unit.a == r0) goto L24;
             */
            @Override // defpackage.AbstractC7487wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    MN r0 = defpackage.MN.d
                    int r1 = r8.d
                    r2 = 0
                    r3 = 2
                    jR0 r4 = r8.h
                    r5 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r5) goto L1b
                    if (r1 != r3) goto L13
                    defpackage.C1795Pt1.b(r9)
                    goto L76
                L13:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1b:
                    defpackage.C1795Pt1.b(r9)
                    goto L4d
                L1f:
                    defpackage.C1795Pt1.b(r9)
                    java.lang.String r9 = r8.e
                    e41 r1 = r8.g
                    bP1 r6 = r4.k
                    if (r6 == 0) goto L2d
                    r6.l(r2)
                L2d:
                    KQ r6 = r4.e
                    r6.a()
                    dR0 r6 = r4.f
                    r6.a()
                    if (r1 == 0) goto L42
                    boolean r1 = defpackage.C7652xe.g(r1)
                    if (r1 != r5) goto L42
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                L42:
                    r8.e = r2
                    r8.d = r5
                    java.lang.Object r9 = r6.c(r9, r8)
                    if (r9 != r0) goto L4d
                    goto L75
                L4d:
                    rf0 r9 = (defpackage.InterfaceC6396rf0) r9
                    r8.d = r3
                    r4.getClass()
                    EM r1 = defpackage.C3286d41.a
                    RV r5 = defpackage.C6266r20.a
                    mR0 r6 = new mR0
                    java.lang.String r7 = "chart_value_updates"
                    r6.<init>(r4, r7)
                    r5.getClass()
                    kotlin.coroutines.CoroutineContext r5 = kotlin.coroutines.CoroutineContext.Element.a.c(r5, r6)
                    lR0 r6 = new lR0
                    r6.<init>(r9, r4, r2)
                    bP1 r9 = defpackage.C5189lv.k(r1, r5, r6, r3)
                    r4.k = r9
                    kotlin.Unit r9 = kotlin.Unit.a
                    if (r9 != r0) goto L76
                L75:
                    return r0
                L76:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C4667jR0.a.C0413a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: jR0$a$b */
        public static final class b implements InterfaceC6396rf0<Boolean> {
            public final /* synthetic */ InterfaceC6396rf0 d;

            /* JADX INFO: renamed from: jR0$a$b$a, reason: collision with other inner class name */
            public static final class C0414a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ InterfaceC6606sf0 d;

                /* JADX INFO: renamed from: jR0$a$b$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$1$invokeSuspend$$inlined$filter$1$2", f = "LoadChartUseCaseBase.kt", l = {219}, m = "emit")
                public static final class C0415a extends LM {
                    public /* synthetic */ Object d;
                    public int e;

                    public C0415a(JM jm) {
                        super(jm);
                    }

                    @Override // defpackage.AbstractC7487wq
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return C0414a.this.a(null, this);
                    }
                }

                public C0414a(InterfaceC6606sf0 interfaceC6606sf0) {
                    this.d = interfaceC6606sf0;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6606sf0
                @Nullable
                public final Object a(Object obj, @NotNull JM jm) {
                    C0415a c0415a;
                    if (jm instanceof C0415a) {
                        c0415a = (C0415a) jm;
                        int i = c0415a.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0415a.e = i - Integer.MIN_VALUE;
                        } else {
                            c0415a = new C0415a(jm);
                        }
                    } else {
                        c0415a = new C0415a(jm);
                    }
                    Object obj2 = c0415a.d;
                    MN mn = MN.d;
                    int i2 = c0415a.e;
                    if (i2 == 0) {
                        C1795Pt1.b(obj2);
                        if (((Boolean) obj).booleanValue()) {
                            c0415a.e = 1;
                            if (this.d.a(obj, c0415a) == mn) {
                                return mn;
                            }
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

            public b(InterfaceC6396rf0 interfaceC6396rf0) {
                this.d = interfaceC6396rf0;
            }

            @Override // defpackage.InterfaceC6396rf0
            @Nullable
            public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
                Object objC = this.d.c(new C0414a(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            }
        }

        /* JADX INFO: renamed from: jR0$a$c */
        public static final class c implements InterfaceC6396rf0<kotlin.time.b> {
            public final /* synthetic */ FP1 d;

            /* JADX INFO: renamed from: jR0$a$c$a, reason: collision with other inner class name */
            public static final class C0416a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ InterfaceC6606sf0 d;

                /* JADX INFO: renamed from: jR0$a$c$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$1$invokeSuspend$$inlined$filter$2$2", f = "LoadChartUseCaseBase.kt", l = {219}, m = "emit")
                public static final class C0417a extends LM {
                    public /* synthetic */ Object d;
                    public int e;

                    public C0417a(JM jm) {
                        super(jm);
                    }

                    @Override // defpackage.AbstractC7487wq
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return C0416a.this.a(null, this);
                    }
                }

                public C0416a(InterfaceC6606sf0 interfaceC6606sf0) {
                    this.d = interfaceC6606sf0;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6606sf0
                @Nullable
                public final Object a(Object obj, @NotNull JM jm) {
                    C0417a c0417a;
                    if (jm instanceof C0417a) {
                        c0417a = (C0417a) jm;
                        int i = c0417a.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0417a.e = i - Integer.MIN_VALUE;
                        } else {
                            c0417a = new C0417a(jm);
                        }
                    } else {
                        c0417a = new C0417a(jm);
                    }
                    Object obj2 = c0417a.d;
                    MN mn = MN.d;
                    int i2 = c0417a.e;
                    if (i2 == 0) {
                        C1795Pt1.b(obj2);
                        if (((kotlin.time.b) obj).d > 0) {
                            c0417a.e = 1;
                            if (this.d.a(obj, c0417a) == mn) {
                                return mn;
                            }
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

            public c(FP1 fp1) {
                this.d = fp1;
            }

            @Override // defpackage.InterfaceC6396rf0
            @Nullable
            public final Object c(@NotNull InterfaceC6606sf0<? super kotlin.time.b> interfaceC6606sf0, @NotNull JM jm) {
                Object objC = this.d.c(new C0416a(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4667jR0.this.new a(jm);
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
                C4667jR0 c4667jR0 = C4667jR0.this;
                C5981pg0 c5981pg0L = C4466ii.l(new b(C4466ii.m(c4667jR0.c.D)), C4466ii.m(c4667jR0.d.a()), new c(c4667jR0.h.d()), c4667jR0.c.r, new C0413a(c4667jR0, null));
                this.d = 1;
                if (C4466ii.i(c5981pg0L, this) == mn) {
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

    /* JADX INFO: renamed from: jR0$b */
    @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$2", f = "LoadChartUseCaseBase.kt", l = {79}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: jR0$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4667jR0 d;

            public a(C4667jR0 c4667jR0) {
                this.d = c4667jR0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objA = this.d.h.a((JQ) obj, jm);
                return objA == MN.d ? objA : Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4667jR0.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C4667jR0 c4667jR0 = C4667jR0.this;
                C1699On1 c1699On1 = c4667jR0.b.Q;
                a aVar = new a(c4667jR0);
                this.d = 1;
                Object objC = c1699On1.d.c(new C4040gg0(aVar), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
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

    /* JADX INFO: renamed from: jR0$c */
    @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$3", f = "LoadChartUseCaseBase.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: jR0$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4667jR0 d;

            public a(C4667jR0 c4667jR0) {
                this.d = c4667jR0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ((Boolean) obj).getClass();
                this.d.h.c();
                return Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4667jR0.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            ((c) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C4667jR0 c4667jR0 = C4667jR0.this;
                C1699On1 c1699On1 = c4667jR0.b.y;
                a aVar = new a(c4667jR0);
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

    /* JADX INFO: renamed from: jR0$d */
    @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartUseCaseBase$init$4", f = "LoadChartUseCaseBase.kt", l = {91}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: jR0$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4667jR0 d;

            public a(C4667jR0 c4667jR0) {
                this.d = c4667jR0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C4667jR0 c4667jR0 = this.d;
                JQ jq = (JQ) c4667jR0.b.Q.d.getValue();
                if (jq != null) {
                    jq.k = ((Number) c4667jR0.g.b().d.getValue()).longValue();
                }
                return Unit.a;
            }
        }

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4667jR0.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C4667jR0 c4667jR0 = C4667jR0.this;
                C1621Nn1 c1621Nn1 = c4667jR0.b.M;
                a aVar = new a(c4667jR0);
                this.d = 1;
                Object objC = c1621Nn1.d.c(new C4877kR0(aVar), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
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

    public C4667jR0(@NotNull AbstractC7949z22 assetsProvider, @NotNull S02<?> trader, @NotNull C4923kf appData, @NotNull InterfaceC7768yA chartAssetProvider, @NotNull KQ currentChartPositionProvider, @NotNull InterfaceC3360dR0 loadChartHistoryUseCase, @NotNull InterfaceC4862kM0 lastCandleIdProvider, @NotNull CA chartBetProvider, @NotNull InterfaceC3706f42 telemetryReporter) {
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(trader, "trader");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(chartAssetProvider, "chartAssetProvider");
        Intrinsics.checkNotNullParameter(currentChartPositionProvider, "currentChartPositionProvider");
        Intrinsics.checkNotNullParameter(loadChartHistoryUseCase, "loadChartHistoryUseCase");
        Intrinsics.checkNotNullParameter(lastCandleIdProvider, "lastCandleIdProvider");
        Intrinsics.checkNotNullParameter(chartBetProvider, "chartBetProvider");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        this.a = assetsProvider;
        this.b = trader;
        this.c = appData;
        this.d = chartAssetProvider;
        this.e = currentChartPositionProvider;
        this.f = loadChartHistoryUseCase;
        this.g = lastCandleIdProvider;
        this.h = chartBetProvider;
        this.i = telemetryReporter;
    }

    @Override // defpackage.InterfaceC4409iR0
    public final void a() {
        this.a.j();
        C2936bP1 c2936bP1 = this.j;
        if (c2936bP1 == null || !c2936bP1.g()) {
            EM em = C3286d41.a;
            RV rv = C6266r20.a;
            this.j = C5189lv.k(em, rv, new a(null), 2);
            C5300mR0 c5300mR0 = new C5300mR0(this, "chart_observe_current_bet");
            rv.getClass();
            C5189lv.k(em, CoroutineContext.Element.a.c(rv, c5300mR0), new b(null), 2);
            C5189lv.k(em, CoroutineContext.Element.a.c(rv, new C5300mR0(this, "chart_observe_trading_started")), new c(null), 2);
            C5189lv.k(em, new C5300mR0(this, "chart_observe_bet_closed"), new d(null), 2);
        }
    }
}
