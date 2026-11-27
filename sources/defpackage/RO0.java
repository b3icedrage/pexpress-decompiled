package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RO0 implements Function1 {
    public final /* synthetic */ int d;
    public final Comparable e;

    public /* synthetic */ RO0(Comparable comparable, int i) {
        this.d = i;
        this.e = comparable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                QY0 it = (QY0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.b((C5638o21) this.e, S41.i);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str = (String) this.e;
                function.a(str, c2905bF0);
                function.c(str, c2905bF0);
                return Unit.a;
        }
    }
}
