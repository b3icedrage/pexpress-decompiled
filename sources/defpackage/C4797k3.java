package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.account.screens.logout.AccountLogoutPartBase;
import com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment;
import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4797k3 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4797k3(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strE;
        NumberFormat currencyInstance;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return ((AccountLogoutPartBase) obj).l;
            case 1:
                return ((ActivationBigStoriesFragment) obj).l;
            case 2:
                ((C6819tg) obj).invoke();
                return Unit.a;
            case 3:
                return (ApplicationC0963Fd) obj;
            case 4:
                PlatformFragmentBase platformFragmentBase = (PlatformFragmentBase) obj;
                Object obj2 = platformFragmentBase.i;
                Intrinsics.checkNotNull(obj2);
                AbstractC2140Ue1 abstractC2140Ue1 = (AbstractC2140Ue1) obj2;
                Context context = platformFragmentBase.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                abstractC2140Ue1.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                C5189lv.k(C8056za.j(abstractC2140Ue1), null, new C2062Te1(abstractC2140Ue1, null), 3);
                return Unit.a;
            case 5:
                return ((ProfileFragmentBase) obj).j;
            case 6:
                ((C2360Wy1) obj).l(L80.LOSS_LIMIT);
                return Unit.a;
            case 7:
                C4617jA1 c4617jA1 = (C4617jA1) obj;
                ReporterApi reporterApi = c4617jA1.h;
                EnumC5028l80 enumC5028l80 = EnumC5028l80.y0;
                L80 l80 = L80.MAX_PROFIT;
                ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("Earn dialog"), null, 12);
                c4617jA1.g.a();
                return Unit.a;
            case 8:
                return ((SettingsFragment) obj).j;
            case 9:
                int i = StubGameFragment.q;
                Object obj3 = ((StubGameFragment) obj).i;
                Intrinsics.checkNotNull(obj3);
                JQ jqB = ((C4416iT1) obj3).f.b();
                if (jqB != null) {
                    Integer numValueOf = Integer.valueOf(jqB.c);
                    String upperCase = "DEMO".toUpperCase(Locale.ROOT);
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
                    String strC = C5491nL.c("\u202a", QO.o(strE));
                    if (strC != null) {
                        return strC;
                    }
                }
                return "";
            default:
                return (InterfaceC5125ld) ((C7238vf2) obj).h.getValue();
        }
    }
}
