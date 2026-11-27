package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1128Hg implements InterfaceC1138Hj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Long) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue2 = ((Long) obj3).longValue();
        String idleKind = (String) obj4;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(idleKind, "idleKind");
        this.d.T(jLongValue, zBooleanValue, jLongValue2, idleKind);
        return Unit.a;
    }
}
