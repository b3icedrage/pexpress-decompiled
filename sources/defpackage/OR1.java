package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.strategyselection.screens.StrategySelectionViewModelBase$selectStrategy$1", f = "StrategySelectionViewModelBase.kt", l = {80}, m = "invokeSuspend")
public final class OR1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ PR1 e;
    public final /* synthetic */ EnumC2644a42 g;

    @InterfaceC3368dU(c = "com.base.feature.robot.strategyselection.screens.StrategySelectionViewModelBase$selectStrategy$1$1", f = "StrategySelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super EnumC2644a42>, Object> {
        public final /* synthetic */ EnumC2644a42 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC2644a42 enumC2644a42, JM<? super a> jm) {
            super(1, jm);
            this.d = enumC2644a42;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super EnumC2644a42> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OR1(PR1 pr1, EnumC2644a42 enumC2644a42, JM<? super OR1> jm) {
        super(2, jm);
        this.e = pr1;
        this.g = enumC2644a42;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new OR1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((OR1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            MR1 mr1 = this.e.h;
            a aVar = new a(this.g, null);
            this.d = 1;
            if (((NR1) mr1).l(aVar, this) == mn) {
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
