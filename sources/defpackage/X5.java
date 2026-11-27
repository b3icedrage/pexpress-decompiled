package defpackage;

import android.os.SystemClock;
import com.api.core.backend.domain.models.other.RawCouponData;
import com.base.feature.activation.screens.common.ActivationFragment;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.base.feature.robot.robot.strategies.RobotStrategiesPart;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X5 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ X5(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((ActivationFragment) this.e).j;
            case 1:
                ((C7239vg) this.e).invoke();
                return Unit.a;
            case 2:
                ((O4) this.e).invoke();
                return Unit.a;
            case 3:
                String code = ((RawCouponData) this.e).getCode();
                Intrinsics.checkNotNull(code);
                return code;
            case 4:
                return ((FullStoriesFragmentBase) this.e).j;
            case 5:
                return ((PlatformFragmentImpl) this.e).t;
            case 6:
                return Long.valueOf(((C2817ap1) this.e).d);
            case 7:
                ((C7293vv1) this.e).r = SystemClock.elapsedRealtime();
                return Unit.a;
            case 8:
                return ((RobotStrategiesPart) this.e).m;
            default:
                return ((TutorialFragment) this.e).j;
        }
    }
}
