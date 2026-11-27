package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ig1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4460ig1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4460ig1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str = (String) this.e;
                function.a(str, c2905bF0);
                function.a(str, c2905bF0);
                function.c(str, c2905bF0);
                return Unit.a;
            default:
                C4267hk1 it = (C4267hk1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return C7888yk1.a(it, ((C7334w62) this.e).a.d);
        }
    }
}
