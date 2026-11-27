package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6760tO0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C6760tO0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                QD0 annotation = (QD0) obj;
                Intrinsics.checkNotNullParameter(annotation, "annotation");
                C5638o21 c5638o21 = VD0.a;
                C6970uO0 c6970uO0 = (C6970uO0) obj2;
                return VD0.b(annotation, c6970uO0.d, c6970uO0.g);
            case 1:
                C5638o21 name = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                ArrayList arrayList = new ArrayList();
                QO0 qo0 = (QO0) obj2;
                UE.b(arrayList, qo0.g.invoke(name));
                qo0.n(name, arrayList);
                InterfaceC4675jU interfaceC4675jUQ = qo0.q();
                int i = C4432iZ.a;
                if (C4432iZ.n(interfaceC4675jUQ, SC.i)) {
                    return CollectionsKt.e0(arrayList);
                }
                LO0 lo0 = qo0.b;
                return CollectionsKt.e0(lo0.a.r.c(lo0, arrayList));
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.a((String) obj2, c2905bF0, c2905bF0);
                function.b(DI0.BOOLEAN);
                return Unit.a;
        }
    }
}
