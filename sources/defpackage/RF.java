package defpackage;

import com.appsflyer.internal.AFc1aSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RF implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ RF(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return Unit.a;
            default:
                return AFc1aSDK.setResolveDeepLinkURLs();
        }
    }
}
