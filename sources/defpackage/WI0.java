package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ WI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                C3545eJ0.a aVar = (C3545eJ0.a) this.e;
                Collection<PI0<?>> collectionA = aVar.a();
                IJ0<Object> ij0 = C3545eJ0.a.p[11];
                Object objInvoke = aVar.l.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                return CollectionsKt.Q(collectionA, (Collection) objInvoke);
            case 1:
                return C7437wc2.d(((HJ0) this.e).a());
            default:
                return (List) ((Yc2.a) this.e).p.getValue();
        }
    }
}
