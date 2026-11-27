package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH92;", "LQd2;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class H92 extends Qd2 {

    @NotNull
    public final W11<D92> d;

    @NotNull
    public final EY0 e;

    public H92() {
        W11<D92> w11 = new W11<>();
        this.d = w11;
        EY0 ey0A = C7747y42.a(w11, new C1742Pc(5));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_data) { it ->\n     …mMargin()\n        }\n    }");
        this.e = ey0A;
    }
}
