package defpackage;

import com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;
import com.impl.feature.registration.screens.duoauth.DuoAuthFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1523Mi implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1523Mi(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                String str = ((C1604Ni) this.e).a;
                if (str != null) {
                    return str;
                }
                throw new IllegalStateException("ApplicationVersionProviderBase has not been initialized");
            case 1:
                CommonNavigateToVerificationFragmentApi commonNavigateToVerificationFragmentApi = (CommonNavigateToVerificationFragmentApi) this.e;
                C3296d7 c3296d7Y = commonNavigateToVerificationFragmentApi.getA();
                if (c3296d7Y != null) {
                    return new C2778ai2(c3296d7Y, new C6819tg(c3296d7Y, 5), new C7121v6(commonNavigateToVerificationFragmentApi, 2));
                }
                return null;
            case 2:
                return ((DuoAuthFragmentImpl) this.e).l;
            case 3:
                return ((IndicatorsManualConfigBottomSheetDialogFragment) this.e).i;
            case 4:
                ((ON0) this.e).i.d();
                return Unit.a;
            case 5:
                return C8056za.j((C1486Lv1) this.e);
            case 6:
                return ((SupportNeedHelpPartBase) this.e).l;
            default:
                return Boolean.valueOf(((C4923kf) this.e).k.getValue() != null);
        }
    }
}
