package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$startListenForFTD$1", f = "RobotTrading.kt", l = {346}, m = "invokeSuspend")
public final class C4827kA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX INFO: renamed from: kA1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4617jA1 d;

        public a(C4617jA1 c4617jA1) {
            this.d = c4617jA1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            C4617jA1 c4617jA1 = this.d;
            c4617jA1.u(true);
            c4617jA1.l(new FI1.h("ftd", null, false, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4827kA1(C4617jA1 c4617jA1, JM<? super C4827kA1> jm) {
        super(2, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4827kA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4827kA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return Unit.a;
        }
        C1795Pt1.b(obj);
        C4617jA1 c4617jA1 = this.e;
        C6120qK1 c6120qK1 = c4617jA1.a.o;
        a aVar = new a(c4617jA1);
        this.d = 1;
        c6120qK1.c(new C5037lA1(aVar, c4617jA1), this);
        return mn;
    }
}
