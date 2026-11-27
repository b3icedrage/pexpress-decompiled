package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1676Og implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1676Og(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                C7233ve1 report = (C7233ve1) obj;
                int i = AppImpl.G;
                Intrinsics.checkNotNullParameter(report, "report");
                ((InterfaceC3706f42) obj2).S(report);
                return Unit.a;
            default:
                C6990uV it = (C6990uV) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Double.valueOf(it.a[((C2534Yw.a) obj2).a + 1]);
        }
    }
}
