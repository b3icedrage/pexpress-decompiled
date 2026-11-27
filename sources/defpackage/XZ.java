package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class XZ implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ XZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                QC it = (QC) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((ZZ) this.e).getClass();
                VN1.a NO_SOURCE = VN1.a;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c((String) this.e, C4719jg1.b);
                return Unit.a;
        }
    }
}
