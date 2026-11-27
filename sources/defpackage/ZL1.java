package defpackage;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ZL1<T> {

    @NotNull
    public final EM a;

    @NotNull
    public final C2946bT b;

    @NotNull
    public final C2030Su c;

    @NotNull
    public final C2000Sk d;

    public ZL1(@NotNull EM scope, @NotNull ZS onComplete, @NotNull C2722aT onUndeliveredElement, @NotNull C2946bT consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.a = scope;
        this.b = consumeMessage;
        this.c = C2889bA.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 6, null);
        this.d = new C2000Sk();
        XF0 xf0 = (XF0) scope.d.p(XF0.a.d);
        if (xf0 != null) {
            xf0.W(new XL1(onComplete, this, onUndeliveredElement));
        }
    }
}
