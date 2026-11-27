package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.google.android.material.card.MaterialCardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ku1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$5", f = "RobotAccountSelectionPart.kt", l = {48}, m = "invokeSuspend")
public final class C1406Ku1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C1798Pu1.e g;
    public final /* synthetic */ C7717xw1 h;

    /* JADX INFO: renamed from: Ku1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$5$1", f = "RobotAccountSelectionPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C1798Pu1.e g;
        public final /* synthetic */ C7717xw1 h;

        /* JADX INFO: renamed from: Ku1$a$a, reason: collision with other inner class name */
        public static final class C0078a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C7717xw1 e;

            public C0078a(KN kn, C7717xw1 c7717xw1) {
                this.e = c7717xw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7717xw1 c7717xw1 = this.e;
                ConstraintLayout multipleAccountSelectionSwitcherContainer = c7717xw1.k;
                Intrinsics.checkNotNullExpressionValue(multipleAccountSelectionSwitcherContainer, "multipleAccountSelectionSwitcherContainer");
                C7644xc.a(multipleAccountSelectionSwitcherContainer, zBooleanValue);
                MaterialCardView accountCard = c7717xw1.m.e;
                Intrinsics.checkNotNullExpressionValue(accountCard, "accountCard");
                boolean z = !zBooleanValue;
                C7644xc.a(accountCard, z);
                MaterialCardView accountCard2 = c7717xw1.i.e;
                Intrinsics.checkNotNullExpressionValue(accountCard2, "accountCard");
                C7644xc.a(accountCard2, z);
                Object objB = IW.b(1000L, jm);
                return objB == MN.d ? objB : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1798Pu1.e eVar, JM jm, C7717xw1 c7717xw1) {
            super(2, jm);
            this.g = eVar;
            this.h = c7717xw1;
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
                C0078a c0078a = new C0078a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0078a, this) == mn) {
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
    public C1406Ku1(FP0 fp0, C1798Pu1.e eVar, JM jm, C7717xw1 c7717xw1) {
        super(2, jm);
        this.e = fp0;
        this.g = eVar;
        this.h = c7717xw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1406Ku1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1406Ku1) create(kn, jm)).invokeSuspend(Unit.a);
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
