package defpackage;

import com.pexpress.tool.AppImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2408Xg implements InterfaceC1060Gj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Object obj, Object obj2, Object obj3) {
        String name = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        Map<String, ? extends Object> data = (Map) obj3;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        this.d.i(name, iIntValue, data);
        return Unit.a;
    }
}
