package defpackage;

import com.appsflyer.internal.AFj1sSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5488nK implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C5488nK(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ak0, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((C5698oK) this.e).a.unregisterNetworkCallback((C5908pK) this.g);
                return Unit.a;
            case 1:
                ((C1728Ox0) this.e).f.invoke(((C2846az0) this.g).a);
                return Unit.a;
            default:
                return Boolean.valueOf(AFj1sSDK.registerClient((AFj1sSDK) this.e, (String) this.g));
        }
    }
}
