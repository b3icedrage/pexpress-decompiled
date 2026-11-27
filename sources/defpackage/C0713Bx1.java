package defpackage;

import android.content.res.Resources;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: renamed from: Bx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$7", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C0713Bx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ C2533Yv1 h;
    public final /* synthetic */ RobotInvestmentPart i;

    /* JADX INFO: renamed from: Bx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$7$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ C2533Yv1 h;
        public final /* synthetic */ RobotInvestmentPart i;

        /* JADX INFO: renamed from: Bx1$a$a, reason: collision with other inner class name */
        public static final class C0007a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C2533Yv1 e;
            public final /* synthetic */ RobotInvestmentPart g;

            public C0007a(KN kn, C2533Yv1 c2533Yv1, RobotInvestmentPart robotInvestmentPart) {
                this.e = c2533Yv1;
                this.g = robotInvestmentPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C7606xQ c7606xQ = (C7606xQ) obj;
                TextView textView = this.e.N;
                Resources resources = textView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Pd2.b(textView).e(new C0947Ex1(textView, b.i(C7644xc.g(resources)), null, c7606xQ, this.g));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, C2533Yv1 c2533Yv1, RobotInvestmentPart robotInvestmentPart) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = c2533Yv1;
            this.i = robotInvestmentPart;
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
                C0007a c0007a = new C0007a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0007a, this) == mn) {
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
    public C0713Bx1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, C2533Yv1 c2533Yv1, RobotInvestmentPart robotInvestmentPart) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = c2533Yv1;
        this.i = robotInvestmentPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0713Bx1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0713Bx1) create(kn, jm)).invokeSuspend(Unit.a);
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
