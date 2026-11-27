package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.strategies.RobotStrategiesPart$initFlowCollectors$lambda$2$$inlined$launchAndCollectIn$default$1", f = "RobotStrategiesPart.kt", l = {48}, m = "invokeSuspend")
public final class C7516wz1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ C1178Hw1 h;

    /* JADX INFO: renamed from: wz1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.strategies.RobotStrategiesPart$initFlowCollectors$lambda$2$$inlined$launchAndCollectIn$default$1$1", f = "RobotStrategiesPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ C1178Hw1 h;

        /* JADX INFO: renamed from: wz1$a$a, reason: collision with other inner class name */
        public static final class C0531a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C1178Hw1 e;

            public C0531a(KN kn, C1178Hw1 c1178Hw1) {
                this.e = c1178Hw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C3077c42 robotTradingStrategySelectionInfoContainer = this.e.g;
                Intrinsics.checkNotNullExpressionValue(robotTradingStrategySelectionInfoContainer, "robotTradingStrategySelectionInfoContainer");
                MA1.f(robotTradingStrategySelectionInfoContainer, (C3496e42) obj);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, C1178Hw1 c1178Hw1) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = c1178Hw1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
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
                C0531a c0531a = new C0531a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0531a, this) == mn) {
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
    public C7516wz1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, C1178Hw1 c1178Hw1) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = c1178Hw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7516wz1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7516wz1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
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
