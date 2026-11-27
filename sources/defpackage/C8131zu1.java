package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8131zu1 implements InterfaceC7711xu1 {

    @NotNull
    public final ReporterApi a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final C3069c22 c;

    @NotNull
    public final Lc2 d;

    @NotNull
    public final O3 e;

    @NotNull
    public final InterfaceC2152Ui1 f;

    @NotNull
    public final RT0 g;

    /* JADX INFO: renamed from: zu1$a */
    public static final class a implements InterfaceC6396rf0<Double> {
        public final /* synthetic */ C4250hg0 d;

        /* JADX INFO: renamed from: zu1$a$a, reason: collision with other inner class name */
        public static final class C0559a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zu1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.usecases.RiskManagementChangeUseCaseBase$special$$inlined$map$1$2", f = "RiskManagementChangeUseCaseBase.kt", l = {219}, m = "emit")
            public static final class C0560a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0560a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0559a.this.a(null, this);
                }
            }

            public C0559a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0560a c0560a;
                if (jm instanceof C0560a) {
                    c0560a = (C0560a) jm;
                    int i = c0560a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0560a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0560a = new C0560a(jm);
                    }
                } else {
                    c0560a = new C0560a(jm);
                }
                Object obj2 = c0560a.d;
                MN mn = MN.d;
                int i2 = c0560a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Double d = new Double(((C6945uG) obj).k);
                    c0560a.e = 1;
                    if (this.d.a(d, c0560a) == mn) {
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

        public a(C4250hg0 c4250hg0) {
            this.d = c4250hg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Double> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0559a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: zu1$b */
    public static final class b implements InterfaceC6396rf0<Double> {
        public final /* synthetic */ C4250hg0 d;

        /* JADX INFO: renamed from: zu1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zu1$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.usecases.RiskManagementChangeUseCaseBase$special$$inlined$map$2$2", f = "RiskManagementChangeUseCaseBase.kt", l = {219}, m = "emit")
            public static final class C0561a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0561a(JM jm) {
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
                C0561a c0561a;
                if (jm instanceof C0561a) {
                    c0561a = (C0561a) jm;
                    int i = c0561a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0561a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0561a = new C0561a(jm);
                    }
                } else {
                    c0561a = new C0561a(jm);
                }
                Object obj2 = c0561a.d;
                MN mn = MN.d;
                int i2 = c0561a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Double d = new Double(((C6945uG) obj).j);
                    c0561a.e = 1;
                    if (this.d.a(d, c0561a) == mn) {
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

        public b(C4250hg0 c4250hg0) {
            this.d = c4250hg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Double> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C8131zu1(@NotNull ReporterApi reporter, @NotNull C4923kf appDataRepository, @NotNull C3069c22 tradingAmplitudeEventsLocalExperiment, @NotNull Lc2 validateInputUseCaseApi, @NotNull O3 accountModeSelectionUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase, @NotNull RT0 lossLimitUseCaseApi) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(validateInputUseCaseApi, "validateInputUseCaseApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCaseApi, "lossLimitUseCaseApi");
        this.a = reporter;
        this.b = appDataRepository;
        this.c = tradingAmplitudeEventsLocalExperiment;
        this.d = validateInputUseCaseApi;
        this.e = accountModeSelectionUseCase;
        this.f = profitLimitUseCase;
        this.g = lossLimitUseCaseApi;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        if (r7.a.f(r1, r4) == r3) goto L54;
     */
    @Override // defpackage.InterfaceC7711xu1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r19, @org.jetbrains.annotations.NotNull java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8131zu1.a(LM, java.lang.String, boolean):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7711xu1
    @Nullable
    public final Object b(@NotNull String str, @NotNull C3475dz1 c3475dz1) {
        long jFloor = (long) Math.floor(this.d.b(QO.p(str)));
        int iOrdinal = ((EnumC4164hF1) this.e.l().d.getValue()).ordinal();
        InterfaceC2152Ui1 interfaceC2152Ui1 = this.f;
        if (iOrdinal == 0) {
            Object objC = interfaceC2152Ui1.c(new C5710oO(jFloor), c3475dz1);
            return objC == MN.d ? objC : Unit.a;
        }
        if (iOrdinal != 1) {
            throw new C6489s51();
        }
        Object objD = interfaceC2152Ui1.d(new C5710oO(jFloor), c3475dz1);
        return objD == MN.d ? objD : Unit.a;
    }

    public final InterfaceC6396rf0<Double> c() {
        Object value = this.e.l().d.getValue();
        Object obj = EnumC4164hF1.g;
        C4923kf c4923kf = this.b;
        return value == obj ? new a(new C4250hg0(c4923kf.k, 0)) : new b(new C4250hg0(c4923kf.k, 0));
    }
}
