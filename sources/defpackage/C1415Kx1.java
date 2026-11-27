package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Kx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onStopClick$1", f = "RobotInvestmentViewModelBase.kt", l = {240}, m = "invokeSuspend")
public final class C1415Kx1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1259Ix1 e;

    /* JADX INFO: renamed from: Kx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$onStopClick$1$1", f = "RobotInvestmentViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ C1259Ix1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1259Ix1 c1259Ix1, JM<? super a> jm) {
            super(2, jm);
            this.d = c1259Ix1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            this.d.e.d();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415Kx1(C1259Ix1 c1259Ix1, JM<? super C1415Kx1> jm) {
        super(1, jm);
        this.e = c1259Ix1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1415Kx1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C1415Kx1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C1259Ix1 c1259Ix1 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            obj = C4466ii.o(c1259Ix1.q.l(), this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            c1259Ix1.getClass();
            C6561sS.g(c1259Ix1, new C1492Lx1(c1259Ix1, null));
        } else {
            C5189lv.k(C8056za.j(c1259Ix1), null, new a(c1259Ix1, null), 3);
        }
        return Unit.a;
    }
}
