package defpackage;

import com.api.core.backend.domain.models.other.RawCouponData;
import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.internal.AFf1uSDK;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.AbstractLongTimeSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ A0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                return Long.valueOf(((AbstractLongTimeSource) obj).b());
            case 1:
                ReporterApi.a.b(((C7109v3) obj).f, EnumC5028l80.U0, new C4310hy("account_screen", "logout_popup", ""), null, 12);
                return Unit.a;
            case 2:
                String percent = ((RawCouponData) obj).getPercent();
                Intrinsics.checkNotNull(percent);
                return percent;
            case 3:
                int i = PlatformFragmentImpl.H;
                PlatformFragmentImpl platformFragmentImpl = (PlatformFragmentImpl) obj;
                C5189lv.k(C7652xe.f(platformFragmentImpl), null, new PlatformFragmentImpl.l(platformFragmentImpl, null), 3);
                return Unit.a;
            default:
                return AFf1uSDK.d((AFf1uSDK) obj);
        }
    }
}
