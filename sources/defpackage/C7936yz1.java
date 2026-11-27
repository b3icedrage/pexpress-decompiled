package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7936yz1 extends C7576xG {

    @NotNull
    public final ReporterApi d;

    @NotNull
    public final InterfaceC6675sz1 e;

    @NotNull
    public final InterfaceC5614nv1 f;

    @NotNull
    public final InterfaceC4619jB0 g;

    @NotNull
    public final MR1 h;

    @NotNull
    public final InterfaceC6396rf0<C3496e42> i;

    @NotNull
    public final C1621Nn1 j;

    /* JADX INFO: renamed from: yz1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.strategies.RobotStrategiesViewModelBase$currentStrategy$1", f = "RobotStrategiesViewModelBase.kt", l = {44}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<EnumC2644a42, List<? extends C3496e42>, JM<? super C3496e42>, Object> {
        public int d;
        public /* synthetic */ EnumC2644a42 e;
        public /* synthetic */ List g;

        /* JADX INFO: renamed from: yz1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.robot.strategies.RobotStrategiesViewModelBase$currentStrategy$1$1", f = "RobotStrategiesViewModelBase.kt", l = {}, m = "invokeSuspend")
        public static final class C0545a extends AW1 implements Function1<JM<? super EnumC2644a42>, Object> {
            public C0545a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0545a(1, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super EnumC2644a42> jm) {
                return ((C0545a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return EnumC2644a42.i;
            }
        }

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object next;
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return null;
            }
            C1795Pt1.b(obj);
            EnumC2644a42 enumC2644a42 = this.e;
            Iterator it = this.g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C3496e42) next).a != enumC2644a42);
            C3496e42 c3496e42 = (C3496e42) next;
            if (c3496e42 == null || !c3496e42.l) {
                return c3496e42;
            }
            MR1 mr1 = C7936yz1.this.h;
            C0545a c0545a = new C0545a(1, null);
            this.e = null;
            this.d = 1;
            if (((NR1) mr1).l(c0545a, this) == mn) {
                return mn;
            }
            return null;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(EnumC2644a42 enumC2644a42, List<? extends C3496e42> list, JM<? super C3496e42> jm) {
            a aVar = C7936yz1.this.new a(jm);
            aVar.e = enumC2644a42;
            aVar.g = list;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C7936yz1(@NotNull ReporterApi reporter, @NotNull InterfaceC6675sz1 callbacks, @NotNull InterfaceC5614nv1 robotBottomSheetDialogsDataFactory, @NotNull InterfaceC4619jB0 instructionListSaveUseCase, @NotNull InterfaceC4878kR1 strategiesProvider, @NotNull MR1 strategySelectionUseCase) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(robotBottomSheetDialogsDataFactory, "robotBottomSheetDialogsDataFactory");
        Intrinsics.checkNotNullParameter(instructionListSaveUseCase, "instructionListSaveUseCase");
        Intrinsics.checkNotNullParameter(strategiesProvider, "strategiesProvider");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        this.d = reporter;
        this.e = callbacks;
        this.f = robotBottomSheetDialogsDataFactory;
        this.g = instructionListSaveUseCase;
        this.h = strategySelectionUseCase;
        this.i = C4466ii.m(new C4250hg0(new C6610sg0(strategySelectionUseCase.k(), strategiesProvider.b(), new a(null)), 0));
        this.j = C4466ii.e(C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d));
    }
}
