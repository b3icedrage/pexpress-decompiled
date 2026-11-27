package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2993bg1 implements Function1 {
    public final /* synthetic */ int d;
    public final String e;

    public /* synthetic */ C2993bg1(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QL1.a.C0130a function = (QL1.a.C0130a) obj;
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(this.e, C4719jg1.b);
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(this.e, C4719jg1.b);
                break;
        }
        return Unit.a;
    }
}
