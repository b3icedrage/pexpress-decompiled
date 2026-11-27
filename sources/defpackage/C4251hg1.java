package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4251hg1 implements Function1 {
    public final String d;

    public C4251hg1(String str) {
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QL1.a.C0130a function = (QL1.a.C0130a) obj;
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.a(this.d, C4719jg1.b, C4719jg1.c);
        return Unit.a;
    }
}
