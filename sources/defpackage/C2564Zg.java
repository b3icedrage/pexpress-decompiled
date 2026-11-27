package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2564Zg implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String outcome = (String) obj2;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this.d.Q(outcome, zBooleanValue);
        return Unit.a;
    }
}
