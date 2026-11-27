package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7942z1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C7942z1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<AbstractC4649jL0> collectionA;
        switch (this.d) {
            case 0:
                InterfaceC6494s62 it = (InterfaceC6494s62) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((B1) this.e).getClass();
                B1 b1 = it instanceof B1 ? (B1) it : null;
                if (b1 != null) {
                    collectionA = CollectionsKt.Q(b1.b.invoke().a, b1.j(false));
                } else {
                    collectionA = it.a();
                    Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
                }
                return collectionA;
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c((String) this.e, C4719jg1.b, C4719jg1.c);
                return Unit.a;
        }
    }
}
