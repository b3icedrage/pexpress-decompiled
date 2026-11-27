package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6261r1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C6261r1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((AbstractC6331rL0) obj).y((C3269d00) this.e);
                return null;
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.a((String) this.e, c2905bF0, c2905bF0, c2905bF0, c2905bF0);
                return Unit.a;
        }
    }
}
