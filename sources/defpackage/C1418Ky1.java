package defpackage;

import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.pexpress.tool.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ky1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$2", f = "RobotRiskManagementPart.kt", l = {48}, m = "invokeSuspend")
public final class C1418Ky1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ C1100Gw1 h;
    public final /* synthetic */ RobotRiskManagementPart i;

    /* JADX INFO: renamed from: Ky1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initFlowCollectors$lambda$13$$inlined$launchAndCollectIn$default$2$1", f = "RobotRiskManagementPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ C1100Gw1 h;
        public final /* synthetic */ RobotRiskManagementPart i;

        /* JADX INFO: renamed from: Ky1$a$a, reason: collision with other inner class name */
        public static final class C0079a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C1100Gw1 e;
            public final /* synthetic */ RobotRiskManagementPart g;

            public C0079a(KN kn, C1100Gw1 c1100Gw1, RobotRiskManagementPart robotRiskManagementPart) {
                this.e = c1100Gw1;
                this.g = robotRiskManagementPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String strE;
                NumberFormat currencyInstance;
                C7396wQ c7396wQ = (C7396wQ) obj;
                TextView textView = this.e.m;
                Integer num = new Integer(QX0.a(c7396wQ.b));
                String upperCase = c7396wQ.a.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                try {
                    if (Intrinsics.a(upperCase, "DEMO")) {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                        decimalFormatSymbols.setCurrencySymbol("Đ");
                        Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                        ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                    } else {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        currencyInstance.setCurrency(Currency.getInstance(upperCase));
                    }
                    currencyInstance.setMaximumFractionDigits(0);
                    strE = currencyInstance.format(num);
                    Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                } catch (IllegalArgumentException unused) {
                    String str = new DecimalFormat("###,###,##0").format(num);
                    String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
                    strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
                }
                textView.setText(this.g.getString(R.string.robot_will_stopped_text, C5491nL.c("\u202a", QO.o(strE))));
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
                C0079a c0079a = new C0079a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0079a, this) == mn) {
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
    public C1418Ky1(JM jm, FP0 fp0, C1100Gw1 c1100Gw1, FP1 fp1, RobotRiskManagementPart robotRiskManagementPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = c1100Gw1;
        this.i = robotRiskManagementPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1418Ky1(jm, this.e, this.h, this.g, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1418Ky1) create(kn, jm)).invokeSuspend(Unit.a);
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
