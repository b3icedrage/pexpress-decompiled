package defpackage;

import android.content.Context;
import com.appsflyer.internal.AFc1aSDK;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import com.base.feature.stub.screens.onboarding.StubOnboardingFragmentBase;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WP implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ WP(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Context this_with = (Context) this.e;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                return new File(this_with.getFilesDir(), C1039Gc0.d("datastore/", Z0.c(this_with.getPackageName(), "_PExpEvents"), ".preferences_pb"));
            case 1:
                return ((RobotRiskManagementPart) this.e).l;
            case 2:
                return ((StubOnboardingFragmentBase) this.e).j;
            case 3:
                return Boolean.valueOf(((C4923kf) this.e).b.getValue() != null);
            default:
                return ((AFc1aSDK) this.e).setAdditionalData();
        }
    }
}
