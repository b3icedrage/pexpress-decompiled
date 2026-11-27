package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5354mh implements InterfaceC1060Gj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Object obj, Object obj2, Object obj3) {
        String url = (String) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(url, "url");
        this.d.A(url, (Long) obj2, zBooleanValue);
        return Unit.a;
    }
}
