package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1206Ig implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC3706f42 e;

    public /* synthetic */ C1206Ig(InterfaceC3706f42 interfaceC3706f42, int i) {
        this.d = i;
        this.e = interfaceC3706f42;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3706f42 interfaceC3706f42 = this.e;
        switch (this.d) {
            case 0:
                long jLongValue = ((Long) obj2).longValue();
                int i = AppImpl.G;
                interfaceC3706f42.b((String) obj, jLongValue);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Bl2 summary = (Bl2) obj2;
                int i2 = AppImpl.G;
                Intrinsics.checkNotNullParameter(summary, "summary");
                interfaceC3706f42.V(zBooleanValue, summary);
                break;
        }
        return Unit.a;
    }
}
