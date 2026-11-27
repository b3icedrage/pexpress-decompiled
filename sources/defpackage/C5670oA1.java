package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: oA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$startListenForRegistration$1", f = "RobotTrading.kt", l = {333}, m = "invokeSuspend")
public final class C5670oA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX INFO: renamed from: oA1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4617jA1 d;

        public a(C4617jA1 c4617jA1) {
            this.d = c4617jA1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            if (((C4612j90.b) obj) == C4612j90.b.d) {
                C4617jA1 c4617jA1 = this.d;
                if (((Boolean) c4617jA1.B.d.getValue()).booleanValue()) {
                    c4617jA1.u(true);
                    c4617jA1.l(new FI1.h("registration", null, false, null));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5670oA1(C4617jA1 c4617jA1, JM<? super C5670oA1> jm) {
        super(2, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5670oA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        ((C5670oA1) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4617jA1 c4617jA1 = this.e;
            C1621Nn1 c1621Nn1 = c4617jA1.b.A;
            a aVar = new a(c4617jA1);
            this.d = 1;
            if (c1621Nn1.d.c(aVar, this) == mn) {
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
