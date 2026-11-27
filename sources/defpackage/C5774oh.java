package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5774oh implements InterfaceC1138Hj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        String reason = (String) obj;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.d.N(reason, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue(), (El2) obj4);
        return Unit.a;
    }
}
