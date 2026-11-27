package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6052q1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C6052q1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.d) {
            case 0:
                P92 p92 = (P92) obj;
                Intrinsics.checkNotNull(p92);
                if (C3686f.n(p92)) {
                    z = false;
                } else {
                    InterfaceC5044lD interfaceC5044lDC = p92.V0().c();
                    if (!(interfaceC5044lDC instanceof H62) || Intrinsics.a(((H62) interfaceC5044lDC).e(), (AbstractC6681t1) this.e)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str = (String) this.e;
                function.a(str, c2905bF0);
                function.a(str, c2905bF0);
                function.a(str, c2905bF0);
                function.b(DI0.BOOLEAN);
                return Unit.a;
        }
    }
}
