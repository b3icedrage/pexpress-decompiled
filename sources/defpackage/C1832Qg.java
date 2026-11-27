package defpackage;

import com.pexpress.tool.AppImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1832Qg implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String event = (String) obj;
        Map<String, ? extends Object> data = (Map) obj2;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        this.d.K(event, data);
        return Unit.a;
    }
}
