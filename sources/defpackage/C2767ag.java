package defpackage;

import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2767ag implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2767ag(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((C3343dL1) obj).getClass();
                return Unit.a;
            case 1:
                return (FF) C5189lv.o(new C5358mi.c((C4923kf) obj, null));
            case 2:
                return ((List) obj).iterator();
            case 3:
                int i = PlatformFragmentImpl.H;
                C5189lv.k(C7235vf.a, null, new PlatformFragmentImpl.k((PlatformFragmentImpl) obj, null), 3);
                return Unit.a;
            default:
                return AFf1uSDK.AFLogger((AFc1bSDK) obj);
        }
    }
}
