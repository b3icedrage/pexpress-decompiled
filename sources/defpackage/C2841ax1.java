package defpackage;

import android.widget.ProgressBar;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.indicators.RobotIndicatorPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ax1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.indicators.RobotIndicatorPart$initFlowCollectors$$inlined$launchAndCollectIn$default$3", f = "RobotIndicatorPart.kt", l = {48}, m = "invokeSuspend")
public final class C2841ax1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ RobotIndicatorPart h;

    /* JADX INFO: renamed from: ax1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.indicators.RobotIndicatorPart$initFlowCollectors$$inlined$launchAndCollectIn$default$3$1", f = "RobotIndicatorPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ RobotIndicatorPart h;

        /* JADX INFO: renamed from: ax1$a$a, reason: collision with other inner class name */
        public static final class C0244a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotIndicatorPart e;

            public C0244a(KN kn, RobotIndicatorPart robotIndicatorPart) {
                this.e = robotIndicatorPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ProgressBar tradingIndicatorProgressBar = ((C1256Iw1) this.e.k()).e.t;
                Intrinsics.checkNotNullExpressionValue(tradingIndicatorProgressBar, "tradingIndicatorProgressBar");
                tradingIndicatorProgressBar.setVisibility(zBooleanValue ? 0 : 8);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, RobotIndicatorPart robotIndicatorPart) {
            super(2, jm);
            this.g = fp1;
            this.h = robotIndicatorPart;
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
                C0244a c0244a = new C0244a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0244a, this) == mn) {
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
    public C2841ax1(FP0 fp0, FP1 fp1, JM jm, RobotIndicatorPart robotIndicatorPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = robotIndicatorPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2841ax1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2841ax1) create(kn, jm)).invokeSuspend(Unit.a);
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
