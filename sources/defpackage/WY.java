package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class WY implements Function1 {
    public static final WY e = new WY(0);
    public static final WY g = new WY(1);
    public static final WY h = new WY(2);
    public final /* synthetic */ int d;

    public /* synthetic */ WY(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.b();
                withOptions.g(InterfaceC5467nD.a.a);
                withOptions.d(EnumC3173cZ.g);
                return Unit.a;
            case 1:
                InterfaceC0671Bj1 descriptor = (InterfaceC0671Bj1) obj;
                Regex regex = AbstractC5906pJ0.d;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return XY.c.w(descriptor) + " | " + DB1.b(descriptor).a();
            default:
                Class cls = (Class) obj;
                Intrinsics.checkNotNull(cls);
                return C4753jp1.b(cls);
        }
    }
}
