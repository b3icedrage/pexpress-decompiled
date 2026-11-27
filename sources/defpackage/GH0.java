package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GH0 {
    public static final /* synthetic */ int a = 0;

    public static final class a extends ML0 implements Function1<C6946uG0, Unit> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6946uG0 c6946uG0) {
            C6946uG0 Json = c6946uG0;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.a = true;
            Json.d = true;
            Json.i = true;
            Json.e = true;
            return Unit.a;
        }
    }

    static {
        C3749fH0.a(a.d);
    }
}
