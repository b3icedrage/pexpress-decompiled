package defpackage;

import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$8", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C0791Cx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ RobotInvestmentPart h;

    /* JADX INFO: renamed from: Cx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$8$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ RobotInvestmentPart h;

        /* JADX INFO: renamed from: Cx1$a$a, reason: collision with other inner class name */
        public static final class C0012a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotInvestmentPart e;

            public C0012a(KN kn, RobotInvestmentPart robotInvestmentPart) {
                this.e = robotInvestmentPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String strE;
                NumberFormat currencyInstance;
                J32 j32 = (J32) obj;
                RobotInvestmentPart robotInvestmentPart = this.e;
                G32 g32 = robotInvestmentPart.s;
                if (g32 == null) {
                    Intrinsics.l("tradingOptions");
                    throw null;
                }
                F32 f32D = g32.d();
                C3435dm0.e(f32D.a(), j32.d, EnumC7035uh1.g);
                if (j32.a) {
                    TextView textViewB = f32D.b();
                    C7396wQ c7396wQ = j32.c;
                    Integer num = new Integer((int) (-Math.abs(c7396wQ.b)));
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
                    textViewB.setText("\u202a" + QO.o(strE));
                } else {
                    f32D.b().setText(robotInvestmentPart.getString(j32.b));
                }
                f32D.b().setSelected(true);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, RobotInvestmentPart robotInvestmentPart) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = robotInvestmentPart;
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
                C0012a c0012a = new C0012a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0012a, this) == mn) {
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
    public C0791Cx1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, RobotInvestmentPart robotInvestmentPart) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = robotInvestmentPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0791Cx1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0791Cx1) create(kn, jm)).invokeSuspend(Unit.a);
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
