package defpackage;

import android.content.Context;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart$initFlowCollectors$lambda$3$$inlined$launchAndCollectIn$default$1", f = "RobotAssetSelectionPart.kt", l = {48}, m = "invokeSuspend")
public final class C3463dv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ RobotAssetSelectionPart h;

    /* JADX INFO: renamed from: dv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart$initFlowCollectors$lambda$3$$inlined$launchAndCollectIn$default$1$1", f = "RobotAssetSelectionPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ RobotAssetSelectionPart h;

        /* JADX INFO: renamed from: dv1$a$a, reason: collision with other inner class name */
        public static final class C0342a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotAssetSelectionPart e;

            public C0342a(KN kn, RobotAssetSelectionPart robotAssetSelectionPart) {
                this.e = robotAssetSelectionPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                RobotAssetSelectionPart robotAssetSelectionPart = this.e;
                C3481e1 c3481e1 = robotAssetSelectionPart.m;
                Context contextRequireContext = robotAssetSelectionPart.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                c3481e1.d(contextRequireContext, new C3254cv1((C3668eu) obj, 0)).i();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, RobotAssetSelectionPart robotAssetSelectionPart) {
            super(2, jm);
            this.g = interfaceC5910pK1;
            this.h = robotAssetSelectionPart;
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
                C0342a c0342a = new C0342a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0342a, this) == mn) {
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
    public C3463dv1(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, RobotAssetSelectionPart robotAssetSelectionPart) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = robotAssetSelectionPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3463dv1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3463dv1) create(kn, jm)).invokeSuspend(Unit.a);
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
