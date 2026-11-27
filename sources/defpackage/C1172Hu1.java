package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$2", f = "RobotAccountSelectionPart.kt", l = {48}, m = "invokeSuspend")
public final class C1172Hu1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ RobotAccountSelectionPart h;
    public final /* synthetic */ C7717xw1 i;

    /* JADX INFO: renamed from: Hu1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$2$1", f = "RobotAccountSelectionPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ RobotAccountSelectionPart h;
        public final /* synthetic */ C7717xw1 i;

        /* JADX INFO: renamed from: Hu1$a$a, reason: collision with other inner class name */
        public static final class C0046a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotAccountSelectionPart e;
            public final /* synthetic */ C7717xw1 g;

            public C0046a(KN kn, C7717xw1 c7717xw1, RobotAccountSelectionPart robotAccountSelectionPart) {
                this.e = robotAccountSelectionPart;
                this.g = c7717xw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C7927yw1 realAccountCard = this.g.m;
                Intrinsics.checkNotNullExpressionValue(realAccountCard, "realAccountCard");
                RobotAccountSelectionPart.l(this.e, realAccountCard, (R3) obj);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, C7717xw1 c7717xw1, FP1 fp1, RobotAccountSelectionPart robotAccountSelectionPart) {
            super(2, jm);
            this.g = fp1;
            this.h = robotAccountSelectionPart;
            this.i = c7717xw1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(jm, this.i, this.g, this.h);
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
                C0046a c0046a = new C0046a((KN) this.e, this.i, this.h);
                this.d = 1;
                if (this.g.c(c0046a, this) == mn) {
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
    public C1172Hu1(JM jm, FP0 fp0, C7717xw1 c7717xw1, FP1 fp1, RobotAccountSelectionPart robotAccountSelectionPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = robotAccountSelectionPart;
        this.i = c7717xw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1172Hu1(jm, this.e, this.i, this.g, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1172Hu1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(null, this.i, this.g, this.h);
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
