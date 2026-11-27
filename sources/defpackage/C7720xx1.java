package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$3", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C7720xx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C5561ng0 g;
    public final /* synthetic */ C2533Yv1 h;
    public final /* synthetic */ RobotInvestmentPart i;

    /* JADX INFO: renamed from: xx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$3$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C5561ng0 g;
        public final /* synthetic */ C2533Yv1 h;
        public final /* synthetic */ RobotInvestmentPart i;

        /* JADX INFO: renamed from: xx1$a$a, reason: collision with other inner class name */
        public static final class C0535a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C2533Yv1 e;
            public final /* synthetic */ RobotInvestmentPart g;

            public C0535a(KN kn, C2533Yv1 c2533Yv1, RobotInvestmentPart robotInvestmentPart) {
                this.e = c2533Yv1;
                this.g = robotInvestmentPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C1491Lx0 c1491Lx0 = (C1491Lx0) obj;
                TextView textView = this.e.O;
                int i = RobotInvestmentPart.v;
                RobotInvestmentPart robotInvestmentPart = this.g;
                robotInvestmentPart.getClass();
                String text = robotInvestmentPart.getString(R.string.selected_indicator_text, c1491Lx0.e);
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                List highlightParams = VE.c(new C0685Bo0(c1491Lx0.e, R.color.white, null, 24));
                Intrinsics.checkNotNullParameter(robotInvestmentPart, "<this>");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(highlightParams, "highlightParams");
                Context contextRequireContext = robotInvestmentPart.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                textView.setText(C5109lY1.a(text, highlightParams, contextRequireContext));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5561ng0 c5561ng0, JM jm, C2533Yv1 c2533Yv1, RobotInvestmentPart robotInvestmentPart) {
            super(2, jm);
            this.g = c5561ng0;
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
                C0535a c0535a = new C0535a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0535a, this) == mn) {
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
    public C7720xx1(FP0 fp0, C5561ng0 c5561ng0, JM jm, C2533Yv1 c2533Yv1, RobotInvestmentPart robotInvestmentPart) {
        super(2, jm);
        this.e = fp0;
        this.g = c5561ng0;
        this.h = c2533Yv1;
        this.i = robotInvestmentPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7720xx1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7720xx1) create(kn, jm)).invokeSuspend(Unit.a);
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
