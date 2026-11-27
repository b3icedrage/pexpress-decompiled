package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart$initFlowCollectors$lambda$4$$inlined$launchAndCollectIn$default$1", f = "RobotDoubleStrategiesPart.kt", l = {48}, m = "invokeSuspend")
public final class C4096gw1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ RobotDoubleStrategiesPart h;
    public final /* synthetic */ C0866Dw1 i;

    /* JADX INFO: renamed from: gw1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart$initFlowCollectors$lambda$4$$inlined$launchAndCollectIn$default$1$1", f = "RobotDoubleStrategiesPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ RobotDoubleStrategiesPart h;
        public final /* synthetic */ C0866Dw1 i;

        /* JADX INFO: renamed from: gw1$a$a, reason: collision with other inner class name */
        public static final class C0364a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotDoubleStrategiesPart e;
            public final /* synthetic */ C0866Dw1 g;

            public C0364a(KN kn, RobotDoubleStrategiesPart robotDoubleStrategiesPart, C0866Dw1 c0866Dw1) {
                this.e = robotDoubleStrategiesPart;
                this.g = c0866Dw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1412Kw1 aggressiveStrategyCard = this.g.e;
                Intrinsics.checkNotNullExpressionValue(aggressiveStrategyCard, "aggressiveStrategyCard");
                RobotDoubleStrategiesPart robotDoubleStrategiesPart = this.e;
                robotDoubleStrategiesPart.getClass();
                aggressiveStrategyCard.e.setCardBackgroundColor(C8056za.i(robotDoubleStrategiesPart, robotDoubleStrategiesPart.l.c(zBooleanValue)));
                aggressiveStrategyCard.g.setChecked(zBooleanValue);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, RobotDoubleStrategiesPart robotDoubleStrategiesPart, C0866Dw1 c0866Dw1) {
            super(2, jm);
            this.g = fp1;
            this.h = robotDoubleStrategiesPart;
            this.i = c0866Dw1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h, this.i);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0364a c0364a = new C0364a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0364a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4096gw1(FP0 fp0, FP1 fp1, JM jm, RobotDoubleStrategiesPart robotDoubleStrategiesPart, C0866Dw1 c0866Dw1) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = robotDoubleStrategiesPart;
        this.i = c0866Dw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4096gw1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4096gw1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h, this.i);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
