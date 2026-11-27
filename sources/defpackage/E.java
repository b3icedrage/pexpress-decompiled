package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ E(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC2699aL0 kotlinClass = (InterfaceC2699aL0) obj;
                Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                I i = (I) this.e;
                i.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                H h = new H(i, map, kotlinClass, map2);
                Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                kotlinClass.b(h);
                return new C2474Yc(map, map2, map3);
            case 1:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c((String) this.e, C4719jg1.a);
                return Unit.a;
            default:
                S01 it = (S01) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (AbstractC4649jL0) this.e;
        }
    }
}
