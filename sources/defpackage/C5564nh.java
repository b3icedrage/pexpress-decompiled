package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5564nh implements InterfaceC1060Gj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Integer) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        El2 failure = (El2) obj3;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.d.E(iIntValue, zBooleanValue, failure);
        return Unit.a;
    }
}
