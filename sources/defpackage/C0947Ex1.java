package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ex1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$lambda$14$$inlined$applyWithCrossFade-8Mi8wO0$default$1", f = "RobotInvestmentPart.kt", l = {456}, m = "invokeSuspend")
public final class C0947Ex1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ long g;
    public final /* synthetic */ C7606xQ h;
    public final /* synthetic */ RobotInvestmentPart i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947Ex1(View view, long j, JM jm, C7606xQ c7606xQ, RobotInvestmentPart robotInvestmentPart) {
        super(2, jm);
        this.e = view;
        this.g = j;
        this.h = c7606xQ;
        this.i = robotInvestmentPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0947Ex1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0947Ex1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String strE;
        NumberFormat currencyInstance;
        MN mn = MN.d;
        int i = this.d;
        View view = this.e;
        long j = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            ViewPropertyAnimator viewPropertyAnimatorAlpha = view.animate().alpha(0.0f);
            Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAlpha, "alpha(...)");
            C7644xc.j(viewPropertyAnimatorAlpha, j).start();
            this.d = 1;
            if (IW.c(j, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        TextView textView = (TextView) view;
        C7606xQ c7606xQ = this.h;
        String str = c7606xQ.d;
        Double d = new Double(c7606xQ.b);
        String upperCase = c7606xQ.a.toUpperCase(Locale.ROOT);
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
            strE = currencyInstance.format(d);
            Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
        } catch (IllegalArgumentException unused) {
            String str2 = new DecimalFormat("###,###,##0.00").format(d);
            String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
            strE = C6133qP.e(upperCase2, "toUpperCase(...)", str2, upperCase2);
        }
        textView.setText(str + C5491nL.c("\u202a", QO.o(strE)));
        textView.setTextColor(C8056za.i(this.i, c7606xQ.c));
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = view.animate().alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAlpha2, "alpha(...)");
        C7644xc.j(viewPropertyAnimatorAlpha2, j).start();
        return Unit.a;
    }
}
