package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ny1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5623ny1 extends C7576xG {

    @NotNull
    public final InterfaceC2197Ux1 d;

    @NotNull
    public final C4612j90 e;

    @NotNull
    public final C1804Pw1 f;

    @NotNull
    public final InterfaceC4619jB0 g;

    @NotNull
    public final InterfaceC5614nv1 h;

    @NotNull
    public final ReporterApi i;

    @NotNull
    public final U9 j;

    @NotNull
    public final AbstractC1787Pr k;

    @NotNull
    public final InterfaceC6396rf0<String> l;

    @NotNull
    public final InterfaceC6396rf0<Boolean> m;

    @NotNull
    public final GP1 n;

    @NotNull
    public final C1699On1 o;

    @NotNull
    public final C1621Nn1 p;

    @NotNull
    public final C6120qK1 q;

    @NotNull
    public final C5561ng0 r;

    @NotNull
    public final InterfaceC6396rf0<Long> s;

    /* JADX INFO: renamed from: ny1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$onInit$1", f = "RobotOptionsViewModelBase.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: ny1$a$a, reason: collision with other inner class name */
        public static final class C0451a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C5623ny1 d;

            public C0451a(C5623ny1 c5623ny1) {
                this.d = c5623ny1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                ((Boolean) obj).getClass();
                Object objA = this.d.q.a(E32.h, jm);
                return objA == MN.d ? objA : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C5623ny1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5623ny1 c5623ny1 = C5623ny1.this;
                C1699On1 c1699On1 = c5623ny1.e.m;
                C0451a c0451a = new C0451a(c5623ny1);
                this.d = 1;
                Object objC = c1699On1.d.c(new C5833oy1(c0451a), this);
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

    /* JADX INFO: renamed from: ny1$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$onInit$2", f = "RobotOptionsViewModelBase.kt", l = {94}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: ny1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C5623ny1 d;

            public a(C5623ny1 c5623ny1) {
                this.d = c5623ny1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object value;
                long j = ((kotlin.time.b) obj).d;
                GP1 gp1 = this.d.n;
                do {
                    value = gp1.getValue();
                    ((kotlin.time.b) value).getClass();
                } while (!gp1.d(value, new kotlin.time.b(j)));
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C5623ny1.this.new b(jm);
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
                C5623ny1 c5623ny1 = C5623ny1.this;
                AbstractC1787Pr.a aVar = c5623ny1.k.b;
                a aVar2 = new a(c5623ny1);
                this.d = 1;
                if (aVar.c(aVar2, this) == mn) {
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

    public C5623ny1(@NotNull InterfaceC2197Ux1 callbacks, @NotNull C4612j90 events, @NotNull C4923kf appData, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull C1804Pw1 tutorialManager, @NotNull InterfaceC4619jB0 instructionListSaveUseCase, @NotNull InterfaceC5614nv1 robotBottomSheetDialogsDataFactory, @NotNull ReporterApi reporter, @NotNull C3069c22 tradingAmplitudeEventsLocalExperiment, @NotNull U9 amountValueUseCaseApi, @NotNull O3 accountModeSelectionUseCase, @NotNull AbstractC2327Wn1 realAmountUseCase, @NotNull AbstractC6366rX demoAmountUseCase, @NotNull AbstractC1787Pr betDurationUseCase) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(tutorialManager, "tutorialManager");
        Intrinsics.checkNotNullParameter(instructionListSaveUseCase, "instructionListSaveUseCase");
        Intrinsics.checkNotNullParameter(robotBottomSheetDialogsDataFactory, "robotBottomSheetDialogsDataFactory");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(amountValueUseCaseApi, "amountValueUseCaseApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(realAmountUseCase, "realAmountUseCase");
        Intrinsics.checkNotNullParameter(demoAmountUseCase, "demoAmountUseCase");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        this.d = callbacks;
        this.e = events;
        this.f = tutorialManager;
        this.g = instructionListSaveUseCase;
        this.h = robotBottomSheetDialogsDataFactory;
        this.i = reporter;
        this.j = amountValueUseCaseApi;
        this.k = betDurationUseCase;
        this.l = C4466ii.m(C4466ii.l(appData.G, appData.F, accountModeSelectionUseCase.k(), appData.k, new C4560iy1(5, null)));
        this.m = tutorialManager.a(C1589Ne.i(Boolean.FALSE), tutorialManager.b.a);
        kotlin.time.b.e.getClass();
        GP1 gp1I = C1589Ne.i(new kotlin.time.b(0L));
        this.n = gp1I;
        this.o = C4466ii.f(gp1I);
        this.p = C4466ii.e(timeSelectionsProvider.a);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.q = c6120qK1G;
        this.r = tutorialManager.b(c6120qK1G, tutorialManager.b.b);
        this.s = C4466ii.m(C4466ii.l(demoAmountUseCase.k(), realAmountUseCase.k(), accountModeSelectionUseCase.k(), appData.k, new C4560iy1(5, null)));
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C6561sS.g(this, new a(null));
        C6561sS.g(this, new b(null));
    }
}
