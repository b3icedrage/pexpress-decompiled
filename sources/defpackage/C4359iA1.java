package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: iA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$showRobotTrading$2", f = "RobotTrading.kt", l = {684}, m = "invokeSuspend")
public final class C4359iA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX INFO: renamed from: iA1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$showRobotTrading$2$1", f = "RobotTrading.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Integer, JM<? super Boolean>, Object> {
        public final /* synthetic */ C4617jA1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4617jA1 c4617jA1, JM<? super a> jm) {
            super(2, jm);
            this.d = c4617jA1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, JM<? super Boolean> jm) {
            return ((a) create(Integer.valueOf(num.intValue()), jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.d.B.d.getValue();
        }
    }

    /* JADX INFO: renamed from: iA1$b */
    public static final class b<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4617jA1 d;

        public b(C4617jA1 c4617jA1) {
            this.d = c4617jA1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            int iIntValue = ((Number) obj).intValue();
            C4617jA1 c4617jA1 = this.d;
            Integer num = new Integer(iIntValue);
            GP1 gp1 = c4617jA1.G;
            gp1.getClass();
            gp1.m(null, num);
            Unit unit = Unit.a;
            MN mn = MN.d;
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4359iA1(C4617jA1 c4617jA1, JM<? super C4359iA1> jm) {
        super(2, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4359iA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4359iA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4617jA1 c4617jA1 = this.e;
            C1752Pf0 c1752Pf0 = new C1752Pf0(c4617jA1.d.K, new a(c4617jA1, null));
            b bVar = new b(c4617jA1);
            this.d = 1;
            if (c1752Pf0.c(bVar, this) == mn) {
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
