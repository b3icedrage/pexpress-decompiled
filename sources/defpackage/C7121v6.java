package defpackage;

import com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi;
import com.appsflyer.internal.AFc1gSDK;
import com.base.feature.activation.screens.step_description.ActivationStepDescriptionFragment;
import com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7121v6 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C7121v6(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((ActivationStepDescriptionFragment) this.e).l;
            case 1:
                ((C6689t3) this.e).invoke();
                return Unit.a;
            case 2:
                return ((CommonNavigateToVerificationFragmentApi) this.e).q.f();
            case 3:
                ON0 on0 = (ON0) this.e;
                on0.i.a();
                C5189lv.k(C8056za.j(on0), null, new PN0(on0, null), 3);
                return Unit.a;
            case 4:
                ((C6229qq1) this.e).getClass();
                return Unit.a;
            case 5:
                return C8056za.j((C1486Lv1) this.e);
            case 6:
                C2942bR1 c2942bR1 = (C2942bR1) this.e;
                List<FO> listA = c2942bR1.b.a();
                C2942bR1.a aVar = new C2942bR1.a(1, c2942bR1, C2942bR1.class, "getIndicatorsStoryIconUrl", "getIndicatorsStoryIconUrl(Ljava/lang/String;)Ljava/lang/String;", 0);
                ArrayList arrayList = new ArrayList(XE.m(listA, 10));
                for (FO fo : listA) {
                    arrayList.add(new C0615Ar((String) aVar.invoke(fo.b), fo.a, false));
                }
                return arrayList;
            case 7:
                return ((TradingAssetsBottomSheetDialogFragmentImpl) this.e).k;
            case 8:
                return Boolean.valueOf(((C4923kf) this.e).y.getValue() != null);
            case 9:
                return Boolean.valueOf(((C5698oK) this.e).a());
            default:
                return AFc1gSDK.q_((AFc1gSDK) this.e);
        }
    }
}
