package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UY implements Function1 {
    public static final UY d = new UY();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
        C2964bZ c2964bZ = XY.a;
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.d(EnumC3173cZ.g);
        return Unit.a;
    }
}
