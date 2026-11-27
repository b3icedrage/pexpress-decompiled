package defpackage;

import RR.c;
import com.appsflyer.internal.AFe1iSDK;
import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl;
import com.pexpress.tool.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q2 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ Q2(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strE;
        NumberFormat currencyInstance;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return ((AccountCommonFragmentBase) obj).j;
            case 1:
                Object obj2 = ((AuthorizationFragmentImpl) obj).i;
                Intrinsics.checkNotNull(obj2);
                ((C2084Tm) obj2).t();
                return Unit.a;
            case 2:
                return ((BotPrivacyPolicyFragmentImpl) obj).q;
            case 3:
                ((InterfaceC1133Hh1) obj).n(AbstractC4387iK.a.a);
                return Unit.a;
            case 4:
                C5189lv.k(C7235vf.a, null, ((RR) obj).new c(null), 3);
                return Unit.a;
            case 5:
                return ((IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) obj).k;
            case 6:
                int i = ActivityC6781tV0.Q;
                ((ActivityC6781tV0) obj).u().a.b();
                return Unit.a;
            case 7:
                int i2 = RobotInvestmentPart.v;
                RobotInvestmentPart robotInvestmentPart = (RobotInvestmentPart) obj;
                Object obj3 = robotInvestmentPart.i;
                Intrinsics.checkNotNull(obj3);
                Integer numValueOf = Integer.valueOf((int) ((C7396wQ) ((C1259Ix1) obj3).C.d.getValue()).b);
                Object obj4 = robotInvestmentPart.i;
                Intrinsics.checkNotNull(obj4);
                String upperCase = ((C7396wQ) ((C1259Ix1) obj4).C.d.getValue()).a.toUpperCase(Locale.ROOT);
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
                    strE = currencyInstance.format(numValueOf);
                    Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                } catch (IllegalArgumentException unused) {
                    String str = new DecimalFormat("###,###,##0").format(numValueOf);
                    String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
                    strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
                }
                return C5491nL.c("\u202a", QO.o(strE));
            case 8:
                ((C5913pL1) obj).getClass();
                return new AbstractC1592Nf.m(R.string.connection_error_title_text);
            case 9:
                return Boolean.valueOf(((Fg2) obj).o());
            case 10:
                ((WebViewFileChooserUseCaseBase) obj).g(true);
                return Unit.a;
            default:
                return Long.valueOf(AFe1iSDK.registerClient((AFe1iSDK) obj));
        }
    }
}
