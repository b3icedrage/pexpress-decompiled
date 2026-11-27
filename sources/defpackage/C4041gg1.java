package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4041gg1 implements Function1 {
    public final String d;
    public final String e;

    public C4041gg1(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QL1.a.C0130a function = (QL1.a.C0130a) obj;
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.a(this.d, C4719jg1.a);
        function.c(this.e, C4719jg1.b, C4719jg1.c);
        return Unit.a;
    }
}
