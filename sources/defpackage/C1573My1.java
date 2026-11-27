package defpackage;

import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: My1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$4", f = "RobotRiskManagementPart.kt", l = {48}, m = "invokeSuspend")
public final class C1573My1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ RobotRiskManagementPart h;
    public final /* synthetic */ C1100Gw1 i;

    /* JADX INFO: renamed from: My1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$4$1", f = "RobotRiskManagementPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ RobotRiskManagementPart h;
        public final /* synthetic */ C1100Gw1 i;

        /* JADX INFO: renamed from: My1$a$a, reason: collision with other inner class name */
        public static final class C0099a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotRiskManagementPart e;
            public final /* synthetic */ C1100Gw1 g;

            public C0099a(KN kn, C1100Gw1 c1100Gw1, RobotRiskManagementPart robotRiskManagementPart) {
                this.e = robotRiskManagementPart;
                this.g = c1100Gw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C7963z60 c7963z60 = (C7963z60) obj;
                C1100Gw1 c1100Gw1 = this.g;
                SwitchMaterial lossLimitSwitch = c1100Gw1.j;
                Intrinsics.checkNotNullExpressionValue(lossLimitSwitch, "lossLimitSwitch");
                RobotRiskManagementPart.m(this.e, lossLimitSwitch, c7963z60.a);
                View lossLimitNotActivatedBlockingView = c1100Gw1.i;
                Intrinsics.checkNotNullExpressionValue(lossLimitNotActivatedBlockingView, "lossLimitNotActivatedBlockingView");
                lossLimitNotActivatedBlockingView.setVisibility(!c7963z60.a ? 0 : 8);
                Intrinsics.checkNotNullExpressionValue(lossLimitSwitch, "lossLimitSwitch");
                Intrinsics.checkNotNullParameter(lossLimitSwitch, "<this>");
                boolean zIsChecked = lossLimitSwitch.isChecked();
                boolean z = c7963z60.b;
                if (z != zIsChecked) {
                    lossLimitSwitch.setChecked(z);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, C1100Gw1 c1100Gw1, FP1 fp1, RobotRiskManagementPart robotRiskManagementPart) {
            super(2, jm);
            this.g = fp1;
            this.h = robotRiskManagementPart;
            this.i = c1100Gw1;
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
                C0099a c0099a = new C0099a((KN) this.e, this.i, this.h);
                this.d = 1;
                if (this.g.c(c0099a, this) == mn) {
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
    public C1573My1(JM jm, FP0 fp0, C1100Gw1 c1100Gw1, FP1 fp1, RobotRiskManagementPart robotRiskManagementPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = robotRiskManagementPart;
        this.i = c1100Gw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1573My1(jm, this.e, this.i, this.g, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1573My1) create(kn, jm)).invokeSuspend(Unit.a);
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
