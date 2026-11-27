package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart$handleObservers$$inlined$launchAndCollectIn$default$1", f = "RobotRealAccountActivationPart.kt", l = {48}, m = "invokeSuspend")
public final class C7302vy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C7723xy1.b g;
    public final /* synthetic */ RobotRealAccountActivationPart h;
    public final /* synthetic */ C1022Fw1 i;

    /* JADX INFO: renamed from: vy1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationPart$handleObservers$$inlined$launchAndCollectIn$default$1$1", f = "RobotRealAccountActivationPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C7723xy1.b g;
        public final /* synthetic */ RobotRealAccountActivationPart h;
        public final /* synthetic */ C1022Fw1 i;

        /* JADX INFO: renamed from: vy1$a$a, reason: collision with other inner class name */
        public static final class C0520a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotRealAccountActivationPart e;
            public final /* synthetic */ C1022Fw1 g;

            public C0520a(KN kn, RobotRealAccountActivationPart robotRealAccountActivationPart, C1022Fw1 c1022Fw1) {
                this.e = robotRealAccountActivationPart;
                this.g = c1022Fw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C6895u2 c6895u2 = (C6895u2) obj;
                C1022Fw1 c1022Fw1 = this.g;
                C7568xD0 inclusionStepFirstItem = c1022Fw1.e;
                Intrinsics.checkNotNullExpressionValue(inclusionStepFirstItem, "inclusionStepFirstItem");
                C6685t2 c6685t2 = c6895u2.a;
                RobotRealAccountActivationPart robotRealAccountActivationPart = this.e;
                RobotRealAccountActivationPart.l(robotRealAccountActivationPart, inclusionStepFirstItem, c6685t2);
                C7568xD0 inclusionStepSecondItem = c1022Fw1.g;
                Intrinsics.checkNotNullExpressionValue(inclusionStepSecondItem, "inclusionStepSecondItem");
                RobotRealAccountActivationPart.l(robotRealAccountActivationPart, inclusionStepSecondItem, c6895u2.b);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7723xy1.b bVar, JM jm, RobotRealAccountActivationPart robotRealAccountActivationPart, C1022Fw1 c1022Fw1) {
            super(2, jm);
            this.g = bVar;
            this.h = robotRealAccountActivationPart;
            this.i = c1022Fw1;
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
                C0520a c0520a = new C0520a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0520a, this) == mn) {
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
    public C7302vy1(FP0 fp0, C7723xy1.b bVar, JM jm, RobotRealAccountActivationPart robotRealAccountActivationPart, C1022Fw1 c1022Fw1) {
        super(2, jm);
        this.e = fp0;
        this.g = bVar;
        this.h = robotRealAccountActivationPart;
        this.i = c1022Fw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7302vy1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7302vy1) create(kn, jm)).invokeSuspend(Unit.a);
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
