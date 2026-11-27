package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1517Mg implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String url = (String) obj;
        long jLongValue = ((Long) obj2).longValue();
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(url, "url");
        this.d.X(url, jLongValue);
        return Unit.a;
    }
}
