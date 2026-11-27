package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1284Jg implements InterfaceC1060Gj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Object obj, Object obj2, Object obj3) {
        String trigger = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.d.C(trigger, iIntValue, zBooleanValue);
        return Unit.a;
    }
}
