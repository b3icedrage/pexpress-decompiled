package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3412dg1 implements Function1 {
    public final String d;
    public final String e;

    public C3412dg1(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QL1.a.C0130a function = (QL1.a.C0130a) obj;
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C2905bF0 c2905bF0 = C4719jg1.b;
        String str = this.d;
        function.a(str, c2905bF0);
        function.a(this.e, c2905bF0, c2905bF0, c2905bF0);
        function.c(str, c2905bF0);
        return Unit.a;
    }
}
