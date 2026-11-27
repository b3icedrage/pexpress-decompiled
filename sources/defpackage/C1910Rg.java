package defpackage;

import com.pexpress.tool.AppImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1910Rg implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable error = (Throwable) obj;
        Map<String, ? extends Object> extra = (Map) obj2;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.d.Y(error, extra);
        return Unit.a;
    }
}
