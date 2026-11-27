package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4043gh implements InterfaceC1060Gj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Object result, Object obj, Object obj2) {
        String requestId = (String) obj;
        long jLongValue = ((Long) obj2).longValue();
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        InterfaceC2441Xr interfaceC2441Xr = result instanceof InterfaceC2441Xr ? (InterfaceC2441Xr) result : null;
        if (interfaceC2441Xr != null) {
            this.d.l(interfaceC2441Xr, requestId, jLongValue);
        }
        return Unit.a;
    }
}
