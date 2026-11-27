package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3099cA0 implements InterfaceC2124Tz0 {

    @NotNull
    public final US1 a;

    @NotNull
    public final C7641xb0 b;

    @NotNull
    public final InterfaceC2124Tz0 c;

    /* JADX INFO: renamed from: cA0$a */
    @InterfaceC3368dU(c = "com.base.feature.stub.usecases.InitStubGameLineChartUseCase$1", f = "InitStubGameLineChartUseCase.kt", l = {19, 19}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: cA0$a$a, reason: collision with other inner class name */
        public static final class C0261a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C3099cA0 d;

            public C0261a(C3099cA0 c3099cA0) {
                this.d = c3099cA0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                CF cf = (CF) obj;
                C3099cA0 c3099cA0 = this.d;
                c3099cA0.a.d(cf.b);
                c3099cA0.a.c(cf.c);
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C3099cA0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (((defpackage.InterfaceC6396rf0) r6).c(r1, r5) == r0) goto L15;
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
                cA0 r2 = defpackage.C3099cA0.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                defpackage.C1795Pt1.b(r6)
                goto L3e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.C1795Pt1.b(r6)
                goto L2e
            L1e:
                defpackage.C1795Pt1.b(r6)
                xb0 r6 = r2.b
                r5.d = r4
                java.lang.String r1 = ""
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L2e
                goto L3d
            L2e:
                rf0 r6 = (defpackage.InterfaceC6396rf0) r6
                cA0$a$a r1 = new cA0$a$a
                r1.<init>(r2)
                r5.d = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L3e
            L3d:
                return r0
            L3e:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3099cA0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3099cA0(@NotNull US1 stubCurrentChartPositionProvider, @NotNull C7641xb0 fakeChartPointsUseCaseBase, @NotNull InterfaceC2124Tz0 initCustomLineChartUseCase) {
        Intrinsics.checkNotNullParameter(stubCurrentChartPositionProvider, "stubCurrentChartPositionProvider");
        Intrinsics.checkNotNullParameter(fakeChartPointsUseCaseBase, "fakeChartPointsUseCaseBase");
        Intrinsics.checkNotNullParameter(initCustomLineChartUseCase, "initCustomLineChartUseCase");
        this.a = stubCurrentChartPositionProvider;
        this.b = fakeChartPointsUseCaseBase;
        this.c = initCustomLineChartUseCase;
        C5189lv.k(C3784fT.a, C6266r20.a, new a(null), 2);
    }

    @Override // defpackage.InterfaceC2124Tz0
    public final void a(@NotNull OQ chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.c.a(chart);
    }

    @Override // defpackage.InterfaceC2124Tz0
    public final void b(@NotNull SZ1 entry, long j, long j2, @NotNull Function0<JQ> currentBetProvider, @NotNull Function0<Boolean> isParentResumed) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(currentBetProvider, "currentBetProvider");
        Intrinsics.checkNotNullParameter(isParentResumed, "isParentResumed");
        this.c.b(entry, j, j2, currentBetProvider, isParentResumed);
    }

    @Override // defpackage.InterfaceC2124Tz0
    public final void c(@NotNull List<? extends C3506e70> historyCandles, @NotNull List<SZ1> notShownCandles) {
        Intrinsics.checkNotNullParameter(historyCandles, "historyCandles");
        Intrinsics.checkNotNullParameter(notShownCandles, "notShownCandles");
        this.c.c(historyCandles, notShownCandles);
    }
}
