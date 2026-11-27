package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: uA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$waitForTimerStarted$started$1", f = "RobotTrading.kt", l = {692}, m = "invokeSuspend")
public final class C6929uA1 extends AW1 implements Function2<KN, JM<? super Integer>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX INFO: renamed from: uA1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$waitForTimerStarted$started$1$1", f = "RobotTrading.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Integer, JM<? super Boolean>, Object> {
        public /* synthetic */ int d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, JM<? super Boolean> jm) {
            return ((a) create(Integer.valueOf(num.intValue()), jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d > 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6929uA1(C4617jA1 c4617jA1, JM<? super C6929uA1> jm) {
        super(2, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6929uA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Integer> jm) {
        return ((C6929uA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        C1699On1 c1699On1 = this.e.d.K;
        a aVar = new a(2, null);
        this.d = 1;
        Object objP = C4466ii.p(c1699On1, aVar, this);
        return objP == mn ? mn : objP;
    }
}
