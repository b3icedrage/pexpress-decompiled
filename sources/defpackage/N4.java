package defpackage;

import com.base.feature.platform.screens.verification.AccountVerificationFragmentBase;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ N4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                Object obj2 = ((AccountVerificationFragmentBase) obj).i;
                Intrinsics.checkNotNull(obj2);
                ((C7806yM1) obj2).m.a();
                return Unit.a;
            case 1:
                ((C2405Xf) obj).invoke();
                return Unit.a;
            case 2:
                ((Function0) obj).invoke();
                return Unit.a;
            case 3:
                ((C2084Tm) obj).t();
                return Unit.a;
            case 4:
                int i = AbstractC6558sR.x0;
                return Pd2.a((AbstractC6558sR) obj, R.drawable.bg_marker);
            case 5:
                return ((IndicatorPageItemFragment) obj).j;
            case 6:
                Object obj3 = ((ReRegistrationFragmentImpl) obj).i;
                Intrinsics.checkNotNull(obj3);
                ((C7059un1) obj3).t();
                return Unit.a;
            case 7:
                return ((RobotCommonFragment) obj).j;
            default:
                return new B61(((C5265mF1) obj).a);
        }
    }
}
