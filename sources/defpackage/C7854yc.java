package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7854yc implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C7854yc(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC1817Qb interfaceC1817Qb = (InterfaceC1817Qb) this.e;
                interfaceC1817Qb.a();
                interfaceC1817Qb.stop();
                break;
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a((String) this.e, C4719jg1.b);
                function.b(DI0.BOOLEAN);
                break;
        }
        return Unit.a;
    }
}
