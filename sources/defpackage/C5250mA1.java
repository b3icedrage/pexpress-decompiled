package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: mA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$startListenForIfTradingIsStarted$1", f = "RobotTrading.kt", l = {182}, m = "invokeSuspend")
public final class C5250mA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX INFO: renamed from: mA1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4617jA1 d;

        public a(C4617jA1 c4617jA1) {
            this.d = c4617jA1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            ((Boolean) obj).getClass();
            GP1 gp1 = this.d.I;
            Boolean bool = Boolean.FALSE;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5250mA1(C4617jA1 c4617jA1, JM<? super C5250mA1> jm) {
        super(2, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5250mA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5250mA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4617jA1 c4617jA1 = this.e;
            C1699On1 c1699On1 = c4617jA1.B;
            a aVar = new a(c4617jA1);
            this.d = 1;
            Object objC = c1699On1.d.c(new C5460nA1(aVar), this);
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
