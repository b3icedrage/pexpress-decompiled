package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ru1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onRealAccountClick$1", f = "RobotAccountSelectionViewModelBase.kt", l = {157}, m = "invokeSuspend")
public final class C1954Ru1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1798Pu1 e;

    /* JADX INFO: renamed from: Ru1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onRealAccountClick$1$1", f = "RobotAccountSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super EnumC4164hF1>, Object> {
        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super EnumC4164hF1> jm) {
            ((a) create(jm)).invokeSuspend(Unit.a);
            return EnumC4164hF1.h;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return EnumC4164hF1.h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1954Ru1(C1798Pu1 c1798Pu1, JM<? super C1954Ru1> jm) {
        super(1, jm);
        this.e = c1798Pu1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1954Ru1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C1954Ru1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        GP1 gp1;
        Object value;
        GP1 gp2;
        Object value2;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1798Pu1 c1798Pu1 = this.e;
            if (((Boolean) c1798Pu1.d.e.getValue()).booleanValue()) {
                a aVar = new a(1, null);
                this.d = 1;
                if (((P3) c1798Pu1.g).m(aVar, this) == mn) {
                    return mn;
                }
            } else {
                do {
                    gp1 = c1798Pu1.j;
                    value = gp1.getValue();
                } while (!gp1.d(value, R3.a((R3) value, 0, null, true, false, 0, 55)));
                do {
                    gp2 = c1798Pu1.l;
                    value2 = gp2.getValue();
                } while (!gp2.d(value2, R3.a((R3) value2, 0, null, false, false, 0, 55)));
                C1798Pu1.l(c1798Pu1, EnumC4164hF1.h);
                Unit unit = Unit.a;
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
