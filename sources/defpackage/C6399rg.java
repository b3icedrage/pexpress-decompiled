package defpackage;

import com.appsflyer.internal.AFe1iSDK;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.base.feature.support.chat.screens.BaseJivoChatFragment;
import com.impl.feature.platform.screens.chart.PlatformChartFragment;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6399rg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6399rg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((C7121v6) this.e).invoke();
                return Unit.a;
            case 1:
                Object obj = ((AuthorizationFragmentImpl) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((C2084Tm) obj).B();
                return Unit.a;
            case 2:
                return ((BaseJivoChatFragment) this.e).h;
            case 3:
                return ((BetConfirmBottomSheetDialogFragment) this.e).i;
            case 4:
                ((InterfaceC1133Hh1) this.e).n(AbstractC4387iK.b.a);
                return Unit.a;
            case 5:
                return ((PlatformChartFragment) this.e).j;
            case 6:
                return ((RobotInvestmentPart) this.e).m;
            case 7:
                return ((RobotOptionsPart) this.e).m;
            case 8:
                C5913pL1 c5913pL1 = (C5913pL1) this.e;
                FF ff = (FF) c5913pL1.c.b.getValue();
                if (ff == null || !ff.d) {
                    return AbstractC1592Nf.B.b;
                }
                return new AbstractC1592Nf.A(new C5410mx1(0, c5913pL1.b, InterfaceC1547Mq.class, "onVpnInstruction", "onVpnInstruction()V", 0, 1));
            default:
                return Boolean.valueOf(AFe1iSDK.d((AFe1iSDK) this.e));
        }
    }
}
