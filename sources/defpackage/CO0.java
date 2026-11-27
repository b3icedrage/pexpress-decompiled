package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CO0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ CO0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C5638o21 it = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((FO0) this.e).O(it);
            case 1:
                Intrinsics.checkNotNull(obj);
                ((C3768fN1) this.e).add(obj);
                return Unit.a;
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a((String) this.e, C4719jg1.b);
                return Unit.a;
        }
    }
}
