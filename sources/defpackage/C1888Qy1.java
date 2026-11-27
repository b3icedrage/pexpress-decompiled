package defpackage;

import android.content.Context;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$8", f = "RobotRiskManagementPart.kt", l = {48}, m = "invokeSuspend")
public final class C1888Qy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ RobotRiskManagementPart h;

    /* JADX INFO: renamed from: Qy1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$8$1", f = "RobotRiskManagementPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ RobotRiskManagementPart h;

        /* JADX INFO: renamed from: Qy1$a$a, reason: collision with other inner class name */
        public static final class C0135a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotRiskManagementPart e;

            public C0135a(KN kn, RobotRiskManagementPart robotRiskManagementPart) {
                this.e = robotRiskManagementPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                RobotRiskManagementPart robotRiskManagementPart = this.e;
                C3481e1 c3481e1 = robotRiskManagementPart.m;
                Context contextRequireContext = robotRiskManagementPart.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                c3481e1.d(contextRequireContext, new C3254cv1((C3668eu) obj, 1)).i();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, RobotRiskManagementPart robotRiskManagementPart) {
            super(2, jm);
            this.g = interfaceC5910pK1;
            this.h = robotRiskManagementPart;
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
                C0135a c0135a = new C0135a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0135a, this) == mn) {
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
    public C1888Qy1(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, RobotRiskManagementPart robotRiskManagementPart) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = robotRiskManagementPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1888Qy1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1888Qy1) create(kn, jm)).invokeSuspend(Unit.a);
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
