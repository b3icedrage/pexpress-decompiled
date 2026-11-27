package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BH implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ BH(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC2396Xc it = (InterfaceC2396Xc) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.p((C1758Ph0) this.e);
            case 1:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.d;
                String str2 = (String) pair.e;
                List annotations = VE.c(C2210Vc.a(((C5693oI0) this.e).a.h, C4694ja0.a("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return annotations.isEmpty() ? InterfaceC2396Xc.a.a : new C2552Zc(annotations);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str3 = (String) this.e;
                function.a(str3, c2905bF0);
                function.a(str3, c2905bF0);
                function.c(str3, C4719jg1.a);
                return Unit.a;
        }
    }
}
