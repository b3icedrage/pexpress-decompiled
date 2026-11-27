package defpackage;

import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.base.feature.support.support.screens.faq.SupportFaqPartBase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Ne1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1591Ne1 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1591Ne1(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((C0690Bq) this.e).invoke();
            case 1:
                return (Wd2) ((C0690Bq) this.e).invoke();
            case 2:
                return (RobotInvestmentPart) this.e;
            case 3:
                return (RobotOptionsPart) this.e;
            default:
                return (SupportFaqPartBase) this.e;
        }
    }
}
