package defpackage;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: renamed from: wx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$2", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C7510wx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ C2533Yv1 h;

    /* JADX INFO: renamed from: wx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$2$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ C2533Yv1 h;

        /* JADX INFO: renamed from: wx1$a$a, reason: collision with other inner class name */
        public static final class C0529a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C2533Yv1 e;

            public C0529a(KN kn, C2533Yv1 c2533Yv1) {
                this.e = c2533Yv1;
                this.d = kn;
            }

            /* JADX WARN: Code duplicated, block: B:6:0x003d  */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                K32 k32 = (K32) obj;
                C2533Yv1 c2533Yv1 = this.e;
                c2533Yv1.q.e.setMax(k32.b);
                ProgressBar animateProgress = c2533Yv1.q.e;
                Intrinsics.checkNotNullExpressionValue(animateProgress, "progressCircular");
                b.a aVar = b.e;
                aVar.getClass();
                AccelerateDecelerateInterpolator animationInterpolator = new AccelerateDecelerateInterpolator();
                Intrinsics.checkNotNullParameter(animateProgress, "$this$animateProgress");
                Intrinsics.checkNotNullParameter(animationInterpolator, "animationInterpolator");
                long jI = k32.e;
                if (b.o(jI)) {
                    Resources resources = animateProgress.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    jI = C7644xc.i(resources);
                } else {
                    aVar.getClass();
                    if (b.k(jI, 0L)) {
                        Resources resources2 = animateProgress.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        jI = C7644xc.i(resources2);
                    }
                }
                ObjectAnimator setStartDelay = ObjectAnimator.ofInt(animateProgress, "progress", k32.a);
                Intrinsics.checkNotNull(setStartDelay);
                Intrinsics.checkNotNullParameter(setStartDelay, "$this$setStartDelay");
                setStartDelay.setStartDelay(b.l(0L));
                setStartDelay.setInterpolator(animationInterpolator);
                setStartDelay.setAutoCancel(false);
                setStartDelay.start();
                c2533Yv1.M.setText(k32.c);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, C2533Yv1 c2533Yv1) {
            super(2, jm);
            this.g = fp1;
            this.h = c2533Yv1;
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
                C0529a c0529a = new C0529a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0529a, this) == mn) {
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
    public C7510wx1(FP0 fp0, FP1 fp1, JM jm, C2533Yv1 c2533Yv1) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = c2533Yv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7510wx1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7510wx1) create(kn, jm)).invokeSuspend(Unit.a);
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
