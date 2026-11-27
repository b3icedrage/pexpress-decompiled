package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2144Ug implements InterfaceC1060Gj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Object obj, Object obj2, Object obj3) {
        String typeName = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        Throwable cause = (Throwable) obj3;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        InterfaceC3706f42 interfaceC3706f42 = this.d;
        interfaceC3706f42.h(iIntValue, typeName, cause);
        interfaceC3706f42.R(cause, new C4025gc1(typeName, iIntValue));
        return Unit.a;
    }
}
