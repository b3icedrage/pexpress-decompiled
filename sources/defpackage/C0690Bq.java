package defpackage;

import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import com.impl.feature.webpageinapp.screens.termsandconditions.PlatformTermsAndConditionsWebViewFragmentImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690Bq extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0690Bq(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((T2) this.e).invoke();
            case 1:
                return (Wd2) ((T2) this.e).invoke();
            case 2:
                return (Wd2) ((T2) this.e).invoke();
            case 3:
                return (PlatformTermsAndConditionsWebViewFragmentImpl) this.e;
            default:
                return (RobotDoubleStrategiesPart) this.e;
        }
    }
}
