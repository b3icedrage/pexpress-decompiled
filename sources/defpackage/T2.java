package defpackage;

import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment;
import com.base.feature.support.chat.screens.BaseJivoChatFragment;
import com.impl.feature.platform.screens.chart.PlatformChartFragment;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class T2 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T2(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((S2) this.e).invoke();
            case 1:
                return (Wd2) ((S2) this.e).invoke();
            case 2:
                return (BaseJivoChatFragment) this.e;
            case 3:
                return (BetConfirmBottomSheetDialogFragment) this.e;
            case 4:
                return (Wd2) ((S2) this.e).invoke();
            case 5:
                VP defaultViewModelCreationExtras = ((IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) this.e).requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            case 6:
                return (PlatformChartFragment) this.e;
            default:
                C0916En0 c0916En0 = ((C3442do1) this.e).e;
                Intrinsics.checkNotNull(c0916En0);
                List<Certificate> listA = c0916En0.a();
                ArrayList arrayList = new ArrayList(XE.m(listA, 10));
                for (Certificate certificate : listA) {
                    Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
