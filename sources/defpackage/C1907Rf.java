package defpackage;

import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import com.base.feature.support.support.screens.faq.SupportFaqPartBase;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import com.impl.feature.webpageinapp.screens.termsandconditions.PlatformTermsAndConditionsWebViewFragmentImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1907Rf implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1907Rf(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((C5668oA) this.e).getClass();
                return Unit.a;
            case 1:
                ((C5809oq1) this.e).invoke();
                return Unit.a;
            case 2:
                return ((AuthorizationFragmentImpl) this.e).u;
            case 3:
                ((InterfaceC1133Hh1) this.e).n(AbstractC4387iK.b.a);
                return Unit.a;
            case 4:
                return ((PlatformTermsAndConditionsWebViewFragmentImpl) this.e).q;
            case 5:
                return ((RobotDoubleStrategiesPart) this.e).m;
            case 6:
                ((C5913pL1) this.e).getClass();
                return new AbstractC1592Nf.m(R.string.error_incorrect_code_entered);
            default:
                return ((SupportFaqPartBase) this.e).l;
        }
    }
}
