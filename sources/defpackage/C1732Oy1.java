package defpackage;

import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$6", f = "RobotRiskManagementPart.kt", l = {48}, m = "invokeSuspend")
public final class C1732Oy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ C1100Gw1 h;
    public final /* synthetic */ RobotRiskManagementPart i;

    /* JADX INFO: renamed from: Oy1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$6$1", f = "RobotRiskManagementPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ C1100Gw1 h;
        public final /* synthetic */ RobotRiskManagementPart i;

        /* JADX INFO: renamed from: Oy1$a$a, reason: collision with other inner class name */
        public static final class C0112a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C1100Gw1 e;
            public final /* synthetic */ RobotRiskManagementPart g;

            public C0112a(KN kn, C1100Gw1 c1100Gw1, RobotRiskManagementPart robotRiskManagementPart) {
                this.e = c1100Gw1;
                this.g = robotRiskManagementPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C7753y60 c7753y60 = (C7753y60) obj;
                C1100Gw1 c1100Gw1 = this.e;
                EditText lossLimitValue = c1100Gw1.k;
                Intrinsics.checkNotNullExpressionValue(lossLimitValue, "lossLimitValue");
                C1874Qu.s(lossLimitValue, String.valueOf((long) c7753y60.c));
                Intrinsics.checkNotNullExpressionValue(lossLimitValue, "lossLimitValue");
                this.g.getClass();
                boolean z = c7753y60.a;
                lossLimitValue.setActivated(z);
                lossLimitValue.setEnabled(z);
                lossLimitValue.setClickable(z);
                lossLimitValue.setFocusable(z);
                lossLimitValue.setFocusableInTouchMode(z);
                TextView lossLimitCurrencyValue = c1100Gw1.g;
                Intrinsics.checkNotNullExpressionValue(lossLimitCurrencyValue, "lossLimitCurrencyValue");
                C1874Qu.s(lossLimitCurrencyValue, "-" + C4466ii.t(c7753y60.b));
                Intrinsics.checkNotNullExpressionValue(lossLimitCurrencyValue, "lossLimitCurrencyValue");
                lossLimitCurrencyValue.setEnabled(z);
                lossLimitCurrencyValue.setClickable(z);
                lossLimitCurrencyValue.setFocusable(z);
                lossLimitCurrencyValue.setFocusableInTouchMode(z);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, C1100Gw1 c1100Gw1, FP1 fp1, RobotRiskManagementPart robotRiskManagementPart) {
            super(2, jm);
            this.g = fp1;
            this.h = c1100Gw1;
            this.i = robotRiskManagementPart;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(jm, this.h, this.g, this.i);
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
                C0112a c0112a = new C0112a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0112a, this) == mn) {
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
    public C1732Oy1(JM jm, FP0 fp0, C1100Gw1 c1100Gw1, FP1 fp1, RobotRiskManagementPart robotRiskManagementPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = c1100Gw1;
        this.i = robotRiskManagementPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1732Oy1(jm, this.e, this.h, this.g, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1732Oy1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(null, this.h, this.g, this.i);
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
