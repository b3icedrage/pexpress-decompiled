package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4253hh implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String requestId = (String) obj2;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.d.j(obj instanceof InterfaceC2441Xr ? (InterfaceC2441Xr) obj : null, requestId);
        return Unit.a;
    }
}
