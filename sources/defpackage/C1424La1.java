package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: La1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1424La1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C1424La1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(((InterfaceC1490Lx) obj).e() == ((InterfaceC4675jU) this.e));
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.a((String) this.e, c2905bF0, c2905bF0);
                return Unit.a;
        }
    }
}
