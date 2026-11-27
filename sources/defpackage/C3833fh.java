package defpackage;

import com.pexpress.tool.AppImpl;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3833fh implements InterfaceC1294Jj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1294Jj0
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        String requestId = (String) obj;
        String asset = (String) obj2;
        double dDoubleValue = ((Double) obj3).doubleValue();
        String currency = (String) obj4;
        String direction = (String) obj5;
        String accountType = (String) serializable;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.d.e(requestId, asset, dDoubleValue, currency, direction, accountType);
        return Unit.a;
    }
}
