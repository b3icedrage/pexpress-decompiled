package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4782jz0 extends C2907bG {

    @NotNull
    public final InterfaceC4104gz0 h;

    @NotNull
    public final ReporterApi i;

    @NotNull
    public final XE1 j;

    @NotNull
    public final InterfaceC6396rf0<C1491Lx0> k;

    @NotNull
    public final InterfaceC6396rf0<C1491Lx0> l;

    /* JADX INFO: renamed from: jz0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsViewModel$onInit$1", f = "IndicatorsDetailsViewModel.kt", l = {42, 43}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4782jz0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            if (r6 == r0) goto L18;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.d
                jz0 r2 = defpackage.C4782jz0.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                defpackage.C1795Pt1.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.C1795Pt1.b(r6)
                goto L2a
            L1e:
                defpackage.C1795Pt1.b(r6)
                r5.d = r4
                java.lang.Object r6 = defpackage.C4782jz0.o(r2, r5)
                if (r6 != r0) goto L2a
                goto L44
            L2a:
                r5.d = r3
                XE1 r6 = r2.j
                Nn1 r6 = r6.b()
                mz0 r1 = new mz0
                r1.<init>(r2)
                e21 r6 = r6.d
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L42
            L40:
                kotlin.Unit r6 = kotlin.Unit.a
            L42:
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C4782jz0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4782jz0(@NotNull InterfaceC4104gz0 callbacks, @NotNull InterfaceC2460Xx0 indicatorDetailsSelectionProvider, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull ReporterApi reporter, @NotNull XE1 selectIndicatorUseCaseApi) {
        super(callbacks, tradingAssetsProvider, indicatorUseCase);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(indicatorDetailsSelectionProvider, "indicatorDetailsSelectionProvider");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(selectIndicatorUseCaseApi, "selectIndicatorUseCaseApi");
        this.h = callbacks;
        this.i = reporter;
        this.j = selectIndicatorUseCaseApi;
        InterfaceC6396rf0<C1491Lx0> interfaceC6396rf0B = indicatorDetailsSelectionProvider.b();
        this.k = interfaceC6396rf0B;
        this.l = interfaceC6396rf0B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object o(C4782jz0 c4782jz0, LM lm) {
        C5205lz0 c5205lz0;
        c4782jz0.getClass();
        if (lm instanceof C5205lz0) {
            c5205lz0 = (C5205lz0) lm;
            int i = c5205lz0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5205lz0.h = i - Integer.MIN_VALUE;
            } else {
                c5205lz0 = new C5205lz0(c4782jz0, lm);
            }
        } else {
            c5205lz0 = new C5205lz0(c4782jz0, lm);
        }
        Object objO = c5205lz0.e;
        MN mn = MN.d;
        int i2 = c5205lz0.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            c5205lz0.d = c4782jz0;
            c5205lz0.h = 1;
            objO = C4466ii.o(c4782jz0.k, c5205lz0);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4782jz0 = c5205lz0.d;
            C1795Pt1.b(objO);
        }
        C1491Lx0 c1491Lx0 = (C1491Lx0) objO;
        if (Intrinsics.a(c1491Lx0.b, "summary") && c1491Lx0.l) {
            ReporterApi reporterApi = c4782jz0.i;
            EnumC5028l80 enumC5028l80 = EnumC5028l80.N;
            L80 l80 = L80.MAX_PROFIT;
            ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("Robot"), null, 12);
        } else {
            ReporterApi.a.b(c4782jz0.i, EnumC5028l80.O, new C1105Gy0(c1491Lx0.b), null, 12);
        }
        return Unit.a;
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }
}
